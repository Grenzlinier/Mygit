package online.shixun.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shixun.project.model.UserModel;

/**
 * 数据库访问类
 */
@Repository
public class UserDao {

    // 利用 Spring 的配置文件直接生成 Hibernate 的 sessionFactory
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 获取 Hibernate 的 Session
     * @return 返回 Session 之后就可以通过它来做各种增删改查了
     */
    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    /**
     * 新增用户
     * @param entity 用户对象
     * @return 新增的用户信息在数据表中的ID
     */
    public Long save(UserModel entity) {
        return (Long)getCurrentSession().save(entity);
    }
}