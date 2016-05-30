package com.trustme.api.db.repo.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trustme.api.db.LoginRequest;
import com.trustme.api.db.LoginResponse;
import com.trustme.api.db.Users;
import com.trustme.api.db.repo.UsersRepository;

@RestController
@RequestMapping("/login")
public class LoginControler {

	@Autowired
	private UsersRepository usersRepository;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Response login(@RequestBody LoginRequest request) {
		LoginResponse response = new LoginResponse();
		try {
			Users user = usersRepository.findOne(request.getUsername());			
			if (user != null) {
				if(user.getPassword().equals(request.getPassword())){
					response.setCode("200");
					response.setMessage("Login Success");
				}else{
					response.setCode("101");
					response.setMessage("Invalid Password");
				}				
			} else {
				response.setCode("102");
				response.setMessage("Invalid Username");
			}
		} catch (Exception ex) {
			response.setCode("103");
			response.setMessage("UnknownError:"+ex.getMessage());
		}
		return Response.status(Status.ACCEPTED).entity(response).build();
	}
}
