package apnasabji.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import apnasabji.models.ApCategory;
import apnasabji.models.User;

@Repository
@Transactional
public class UserDao {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(User user) {
    getSession().save(user);
    return;
  }
  
  public void saveCategory(ApCategory cat){
	  getSession().save(cat);
	  return;
  }
  public List<ApCategory> getAllCat(){
  Query query = getSession().getNamedQuery("ApCategory.findAll");
  List<ApCategory> allCats= query.list();
  return allCats;
}
  public void delete(User user) {
    getSession().delete(user);
    return;
  }
  
  @SuppressWarnings("unchecked")
  public List<User> getAll() {
    return getSession().createQuery("from User").list();
  }
  
  public User getByEmail(String email) {
    return (User) getSession().createQuery(
        "from User where email = :email")
        .setParameter("email", email)
        .uniqueResult();
  }

  public User getById(long id) {
    return (User) getSession().load(User.class, id);
  }

  public void update(User user) {
    getSession().update(user);
    return;
  }

} // class UserDao
