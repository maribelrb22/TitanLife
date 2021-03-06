package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.BMI.BMIResult;
import aiss.model.repository.TitanLifeRepository;
import aiss.model.resource.BMIResource;
import aiss.model.titan.User;


public class MisObjetivosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(MisObjetivosController.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u=TitanLifeRepository.getInstance().findByUsername((String)request.getSession().getAttribute("username"));
		if(u==null) {
			request.getRequestDispatcher("/intro.jsp").forward(request, response);
		}else {
			// Control de la generación del IMC
			String imc=request.getParameter("IMC");
			if(imc!=null && !imc.isEmpty()) {
				BMIResult bmires=BMIResource.getBMI(u.getDatosBMI());
				String bmi= bmires.getBmi().getValue() + " | " + bmires.getBmi().getStatus();
				u.setImc(bmi);
				log.info("IMC generado");
				request.getRequestDispatcher("/objetivos.jsp").forward(request, response);
			}else {
				log.info("Ninguna acción ha sido realizada");
				request.getRequestDispatcher("/objetivos.jsp").forward(request, response);		
			}
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}