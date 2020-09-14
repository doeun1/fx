package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection dbConn;//connection은 클래스명
    
    public static Connection getConnection()//
    {
        Connection conn = null;
        try {//try catch는 예외처리
            String user = "hr";//db사용자 ,스트링 타입 선언
            String pw = "hr";//사용자비번, 스트링 타입 선언
            String url = "jdbc:oracle:thin:@localhost:1521:xe";//오라클접속할때 방식,jdbc:oracle:thin:여기까진 고정
            
            Class.forName("oracle.jdbc.driver.OracleDriver");// 'OracleDriver'는 오라클에서 제공해주는 라이브러리     
            conn = DriverManager.getConnection(url, user, pw);
            
            System.out.println("Database에 연결되었습니다.\n");
            
        } catch (ClassNotFoundException cnfe) {//해당 드라이버 로딩실패시 프로그램이 자동종료 못하게 예외 처리 해주는거
            System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
        } catch (SQLException sqle) {
            System.out.println("DB 접속실패 : "+sqle.toString());
        } catch (Exception e) {
            System.out.println("Unkonwn error");
            e.printStackTrace();
        }
        return conn;     
    }


}
