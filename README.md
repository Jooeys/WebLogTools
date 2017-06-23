# Java 
测试数据模拟工具：模拟网页日志（IP地址，登陆时间，请求次数），写入磁盘和写入Vmware centos 7中的MySQL数据库。
JDBC 数据库连接：
public static  Connection getConnection() throws SQLException {
	  String DB_DRIVER="com.mysql.jdbc.Driver"; 
	  //String DB_DRIVER=new FileHelp().getProperty("db","DB_DRIVER"); 
		  
	  String DB_HOST="192.168.56.129";
	  String DB_PORT="3306";
	  String DB_NAME="logdata";
	  String DB_USER_NAME="zhong";
	  String DB_PWD_NAME="31415926";
	  String DB_URL="jdbc:mysql://"; 
	  
	  Connection con =null ;
	  
	  try {
		Class.forName(DB_DRIVER);
		con = DriverManager.getConnection(DB_URL+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER_NAME,DB_PWD_NAME);
	  } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	   
	   return con;
	   
   }
