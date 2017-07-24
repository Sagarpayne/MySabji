package apnasabji.controllers;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import apnasabji.dao.UserDao;
import apnasabji.models.ApCategory;

@RestController
public class MainController {
//
//
  @Autowired
	  private UserDao _userDao;
  
  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Proudly handcrafted by " + 
        "<a href='http://netgloo.com/en'>netgloo</a> :)";
  }
  
 @RequestMapping(value = "/cat/{id}", method = RequestMethod.POST,headers="Accept=application/json")
	public String addNewCat(@PathVariable String id)
	{
		
	  ApCategory cat = new ApCategory();
	 
	  cat.setCatId(1);
	  cat.setCatName(id);
	  cat.setCatSuper(1);
	  _userDao.saveCategory(cat);
		
		return "New Category Created "+ cat.getCatName() ;
	}
 
@RequestMapping(value = "/person/{id}", method = RequestMethod.POST,headers="Accept=application/json")
	public String addNewPerson(@PathVariable String id)
	{
		
	  ApCategory cat = new ApCategory();
	 
	  cat.setCatId(1);
	  cat.setCatName(id);
	  cat.setCatSuper(1);
	  _userDao.saveCategory(cat);
		
		return "New Category Created "+ cat.getCatName() ;
	}
 
 @RequestMapping(value = "/persons", method = RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity<List<ApCategory>> getCat()
	{
		
	 List <ApCategory> cat = _userDao.getAllCat();
	 
	 
	 
	
		
	  return new ResponseEntity<List<ApCategory>>((List<ApCategory>) cat,HttpStatus.OK);
	}
  

}
