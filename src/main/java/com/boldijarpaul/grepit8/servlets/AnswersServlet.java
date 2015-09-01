package com.boldijarpaul.grepit8.servlets;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.boldijarpaul.grepit8.entities.QuestionResponse;
import com.boldijarpaul.grepit8.service.AnswersManager;

@Path("/answer")
public class AnswersServlet {

	@GET
	@Path("/{questionId}")
	public Response addAnswer(@PathParam("questionId") int questionId,
			@QueryParam("fullName") String fullName,
			@QueryParam("answerId") int answerId,
			@QueryParam("answer") String answer) {

		/* we want to add a new answer */
		AnswersManager.addAnswer(questionId, answerId, answer, fullName);

		return Response
				.ok()
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers",
						"origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods",
						"GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").build();
	}

	@GET
	@Path("/{questionId}/all")
	public Response getQuestionAnswer(@PathParam("questionId") int questionId) {
		/* we want to add a new answer */
		List<QuestionResponse> answers = AnswersManager
				.getQuestionAnswers(questionId);

		return Response
				.ok(answers)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers",
						"origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods",
						"GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").build();
	}
}
