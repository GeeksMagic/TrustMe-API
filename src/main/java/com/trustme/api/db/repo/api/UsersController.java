package com.trustme.api.db.repo.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trustme.api.db.Users;
import com.trustme.api.db.repo.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

	private String message = null;

	@Autowired
	private UsersRepository usersRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Response getAllUsers() {
		return Response.status(Status.ACCEPTED).entity(usersRepository.findAll()).build();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Response createOrUpdate(@RequestBody Users users) {
		Users usersToSave = usersRepository.findOne(users.getUserID());
		if (usersToSave == null) {
			usersRepository.save(users);
			return Response.status(Status.CREATED).entity(users).build();
		} else {
			usersToSave.setAddress(users.getAddress());
			usersToSave.setDob(users.getDob());
			usersToSave.setFirstName(users.getFirstName());
			usersToSave.setLastName(users.getLastName());
			usersToSave.setPassCode(users.getPassCode());
			usersToSave.setPassword(users.getPassword());
			usersToSave.setProfilePic(users.getProfilePic());			
			usersToSave.setPhone(users.getPhone());
			usersToSave.setType(users.getType());
			usersRepository.save(usersToSave);
			return Response.status(Status.ACCEPTED).entity(usersToSave).build();
		}
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String delete(@PathVariable("id") String id) {
		try {
			Users user = usersRepository.findOne(id); 

			if (user != null) {
				usersRepository.delete(user);
				message = "User Delete";
			} else {
				message = "User not in DB";
			}
		} catch (Exception ex) {
			return "Error deleting the user:" + ex.toString();
		}
		return message;
	}

}// class end
