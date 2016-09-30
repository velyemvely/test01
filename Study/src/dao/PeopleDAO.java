package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dto.People;

public class PeopleDAO {

	private static DataSource ds;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	static{
		try {
			Context initContext = new InitialContext();
			ds = (DataSource)initContext.lookup("java:/comp/env/jdbc/oracle");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public String insertMember(People peo) {
		String msg = "실패";
		try{
			con = ds.getConnection();
			
			String sql = "insert into t_study values(?,?,?)";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, peo.getId());
			ps.setString(2, peo.getPw());
			ps.setString(3, peo.getName());
			
			int res = ps.executeUpdate();
			
			if(res>0)msg="회원가입완료";
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return msg;
	}
	public People loginMember(People peo) {
		People pp = null;
		try{
			con = ds.getConnection();
			
			String sql = "select * from t_study where id=? and password=?";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, peo.getId());
			ps.setString(2, peo.getPw());
			
			rs = ps.executeQuery();
			

			if(rs.next()){
				pp = new People();
				
				pp.setId(rs.getString("id"));
				pp.setPw(rs.getString("password"));
				pp.setName(rs.getString("name"));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return pp;
		
	}
	public ArrayList<People> selectList() {
		ArrayList<People> list = null;
		
		
		try{
			con = ds.getConnection();
			
			String sql = "select * from t_study";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()){
				if(list==null)list = new ArrayList<>();
				System.out.println(rs.getString("id"));
				
				People peo = new People();
				
				peo.setId(rs.getString("id"));
				peo.setName(rs.getString("name"));
				
				list.add(peo);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	
	
	
	
}
