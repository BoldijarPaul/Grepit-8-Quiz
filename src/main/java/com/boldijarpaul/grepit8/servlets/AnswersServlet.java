package com.boldijarpaul.grepit8.servlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.boldijarpaul.grepit8.service.AnswersManager;

@Path("/answer")
public class AnswersServlet {

	@GET
	@Path("/{questionId}")
	public void addAnswer(@PathParam("questionId") int questionId,
			@QueryParam("fullName") String fullName,
			@QueryParam("answerId") int answerId,
			@QueryParam("answer") String answer){
		
		/* we want to add a new answer */
//		AnswersManager
		
	}
}
