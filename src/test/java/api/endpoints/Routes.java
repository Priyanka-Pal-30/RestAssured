package api.endpoints;



//	Swagger URI ------ https://petstore3.swagger.io 
//	create user(Post): https://petstore3.swagger.io/api/v3/user
//	get user(Get): 	https://petstore3.swagger.io/api/v3/user/{username}
//	upadte user(Put): https://petstore3.swagger.io/api/v3/user/{username}	
//	delete user (Delete): 	https://petstore3.swagger.io/api/v3/user/{username}
	
	
public class Routes {
	
	public static String base_url = "https://petstore3.swagger.io/api/v3";
	
	//user module
	
	public static String post_url = base_url+"/user";
	public static String get_url = base_url+"/user/{username}";
	public static String update_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";
	
	
	//store module
	
	//pet module
}
