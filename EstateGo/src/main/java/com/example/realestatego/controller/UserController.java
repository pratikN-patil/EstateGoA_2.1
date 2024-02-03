package com.example.realestatego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController annotation to mark this class as a controller handling RESTful requests
@RestController
//@RequestMapping("/estateGo")
public class UserController {
	
	// GetMapping annotation to handle HTTP GET requests to "/estateGo/welcome"
	@GetMapping("/estateGo/welcome")
//	@PreAuthorize("hasAuthority('ROLE_Customer')")
	public String getWelcome() {
		return "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>EstateGo.com - Login</title>\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f4f4f4;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-direction: column;\r\n"
				+ "            align-items: center;\r\n"
				+ "            justify-content: center;\r\n"
				+ "            height: 100vh;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        header {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            text-align: center;\r\n"
				+ "            width: 100%;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .top-left {\r\n"
				+ "            position: absolute;\r\n"
				+ "            top: 0;\r\n"
				+ "            left: 0;\r\n"
				+ "            width: 0;\r\n"
				+ "            height: 0;\r\n"
				+ "            border-left: 100px solid transparent;\r\n"
				+ "            border-bottom: 100px solid #3498db;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .bottom-right {\r\n"
				+ "            position: absolute;\r\n"
				+ "            bottom: 0;\r\n"
				+ "            right: 0;\r\n"
				+ "            width: 0;\r\n"
				+ "            height: 0;\r\n"
				+ "            border-right: 100px solid transparent;\r\n"
				+ "            border-top: 100px solid #e74c3c;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .login-container {\r\n"
				+ "            background-color: #fff;\r\n"
				+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-radius: 8px;\r\n"
				+ "            text-align: center;\r\n"
				+ "            transition: transform 0.2s ease-in-out;\r\n"
				+ "            margin-top: 20px;\r\n"
				+ "            width: 300px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .login-container:hover {\r\n"
				+ "            transform: scale(1.05);\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .login-container h2 {\r\n"
				+ "            margin-bottom: 20px;\r\n"
				+ "            color: #333;\r\n"
				+ "            cursor: default;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .login-form {\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-direction: column;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .form-group {\r\n"
				+ "            margin-bottom: 15px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .form-group label {\r\n"
				+ "            font-size: 14px;\r\n"
				+ "            color: #555;\r\n"
				+ "            margin-bottom: 5px;\r\n"
				+ "            display: block;\r\n"
				+ "            text-align: left;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .form-group input {\r\n"
				+ "            width: 100%;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            border: 1px solid #ccc;\r\n"
				+ "            border-radius: 4px;\r\n"
				+ "            box-sizing: border-box;\r\n"
				+ "            transition: border-color 0.3s ease;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .form-group input:focus {\r\n"
				+ "            outline: none;\r\n"
				+ "            border-color: #3498db;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .form-group button {\r\n"
				+ "            background-color: #4caf50;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 12px 20px;\r\n"
				+ "            border: none;\r\n"
				+ "            border-radius: 25px;\r\n"
				+ "            cursor: pointer;\r\n"
				+ "            font-size: 16px;\r\n"
				+ "            transition: background-color 0.3s ease;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .form-group button:hover {\r\n"
				+ "            background-color: #45a049;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<header>\r\n"
				+ "    <h1>EstateGo.com</h1>\r\n"
				+ "</header>\r\n"
				+ "\r\n"
				+ "<div class=\"top-left\"></div>\r\n"
				+ "<div class=\"bottom-right\"></div>\r\n"
				+ "\r\n"
				+ "<div class=\"login-container\">\r\n"
				+ "    <h2>Login</h2>\r\n"
				+ "    <form class=\"login-form\" action=\"#\" method=\"post\">\r\n"
				+ "        <div class=\"form-group\">\r\n"
				+ "            <label for=\"username\">Username:</label>\r\n"
				+ "            <input type=\"text\" id=\"username\" name=\"username\" required>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div class=\"form-group\">\r\n"
				+ "            <label for=\"password\">Password:</label>\r\n"
				+ "            <input type=\"password\" id=\"password\" name=\"password\" required>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div class=\"form-group\">\r\n"
				+ "            <button type=\"submit\">Login</button>\r\n"
				+ "        </div>\r\n"
				+ "    </form>\r\n"
				+ "\r\n"
				+ "    <div class=\"form-group\">\r\n"
				+ "        <button type=\"button\" onclick=\"redirectToNewUserPage()\">New User? Sign Up</button>\r\n"
				+ "    </div>\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "<script>\r\n"
				+ "    function redirectToCreateUserPage() {\r\n"
				+ "        // Add your logic to redirect to the create new user page\r\n"
				+ "       \r\n"
				+ "        window.open('/cutomer/signin', '_blank');\r\n"
				+ "    }\r\n"
				+ "</script>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "";
	}

	@GetMapping("/estateGo/Agent")
//	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String getGoodby() {
		return "Hello Agent";
	}

	
//	@GetMapping("/estateGo/welcome")
    public String getWelcomePage() {
            return "customerWelcome"; // This will resolve to src/main/resources/templates/customerWelcome.html
        
    }
}
