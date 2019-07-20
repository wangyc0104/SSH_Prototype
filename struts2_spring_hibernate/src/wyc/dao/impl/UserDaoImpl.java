package wyc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wyc.dao.UserDao;
import wyc.pojo.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<User> getList() {
		return sessionFactory.openSession().createCriteria(User.class).list();
	}
}
