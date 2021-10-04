package com.vti.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.request.AccountRequest;
import com.vti.service.IAccountService;


@RestController
@RequestMapping(value = "api/v3/register")
@CrossOrigin("*")
@Validated
public class RegisterController {

	@Autowired
	private IAccountService accountService;
	
	/**
	 * API create Account
	 * Gửi kèm 1 mail về email đăng ký
	 */
	
	@PostMapping()
	public ResponseEntity<?> createAccount(@RequestBody @Valid AccountRequest request) {
		accountService.createAccount(request);
		return new ResponseEntity<String>("Chúng tôi đã gửi 1 thư vào hòm thư của bạn. Xin hãy kiểm tra hòm thư "
				+ "để kích hoạt tài khoản", HttpStatus.CREATED );
	}
	
	/**
	 * API active Account
	 * Gửi 1 xác nhận active thành công
	 */
	
	@GetMapping("/activeUser")
	public ResponseEntity<?> activeUserViaEmail(@RequestParam String token) {

		// active user
		accountService.activeUser(token);

		return new ResponseEntity<>("Active success!", HttpStatus.OK);
	}
	
	@GetMapping("/userRegistrationConfirmRequest")
	// validate: email exists, email not active
	public ResponseEntity<?> sendConfirmRegistrationViaEmail(@RequestParam String email) {

		accountService.sendConfirmUserRegistrationViaEmail(email);

		return new ResponseEntity<>("Chúng tôi đã gửi 1 thư về hòm thư của bạn. "
				+ "Xin hãy kiểm tra hòm thư để kích hoạt tài khoản!", HttpStatus.OK);
	}
	
}
