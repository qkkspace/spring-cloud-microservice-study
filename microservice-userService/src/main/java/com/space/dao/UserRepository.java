package com.space.dao;

import com.space.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类名：com.space.dao.UserRepository.
 * 描述：
 * 创建者： ztzn.
 * 创建时间：2018/4/13.
 * 版本：V 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
