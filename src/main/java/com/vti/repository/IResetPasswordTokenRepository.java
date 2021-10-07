package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vti.entity.ResetPasswordToken;

@Repository
public interface IResetPasswordTokenRepository extends JpaRepository<ResetPasswordToken, Integer>{

	public ResetPasswordToken findByToken(String token);
	
	public boolean existsByToken(String token);
	
	@Query("	SELECT 	token	"
			+ "	FROM 	ResetPasswordToken "
			+ " WHERE 	user_id = :accountID")
	public String findByUserId(int accountID);
	
	@Transactional
	@Modifying
	@Query("	DELETE 							"
			+ "	FROM 	ResetPasswordToken 	"
			+ " WHERE 	user_id = :userId")
	public void deleteByUserId(int userId);
}
