package vn.fsoft.bookingbusticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.fsoft.bookingbusticket.entity.Noneuser;
import vn.fsoft.bookingbusticket.model.NoneUserDto;
import vn.fsoft.bookingbusticket.repository.NoneUserRepository;

@Component
@RestController
@RequestMapping("/api/noneuser")
@CrossOrigin(origins="http://localhost:4200")
public class NoneUserController {
	@Autowired
	NoneUserRepository noneUserRepository;
	
	@GetMapping("/noneUserList")
	public List<Noneuser> getAllNoneUser() {
		List<Noneuser> list = noneUserRepository.findAll();
		return list;
	}
}
