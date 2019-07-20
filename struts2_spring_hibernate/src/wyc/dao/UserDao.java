package wyc.dao;

import java.util.List;

import wyc.pojo.User;

/**
 * 用户数据访问对象
 * 
 * @author Yicheng Wang
 * 
 */
public interface UserDao {
	public List<User> getList();
}
