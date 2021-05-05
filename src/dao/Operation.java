package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Admin;
import bean.Visitor;

public class Operation {
	Connection con = null;
	ResultSet rs = null;

	public Connection makeConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/con", "root", "root");
			System.out.println("connection successful");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	
	
	public int AddVisitor(Visitor v){
		int i =0;
		con=makeConnection();
		if(con !=null){
			
			try {
				PreparedStatement ps = con.prepareStatement("insert into visitor values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, v.getVid());
				ps.setString(2,v.getVname());
				//System.out.println("name is "+v.getVname());
				ps.setString(3,v.getEmail());
				ps.setString(4,v.getAddress());
				//System.out.println("address is "+v.getAddress());
				ps.setInt(5,v.getContact());
				ps.setString(6,v.getQualification());
				ps.setString(7,v.getPurpose());
				ps.setString(8,v.getVdate());
				i= ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}else{
			System.out.println("Connecton Error"+i);
		}
		
		return i;
	}
	
	
	public ArrayList<Visitor>getVisitorList(){
		con=makeConnection();
		
		ArrayList<Visitor> v_lst= new ArrayList<>();
		
		if(con!=null){
			try {
				Statement st= con.createStatement();
				rs=st.executeQuery("select * from visitor");
				while(rs.next()){
					Visitor v= new Visitor();
					
					v.setVid(rs.getInt(1));
					v.setVname(rs.getString(2));
					v.setEmail(rs.getString(3));
					v.setAddress(rs.getString(4));
					v.setContact(rs.getInt(5));
					v.setQualification(rs.getString(6));
					v.setPurpose(rs.getString(7));
					v.setVdate(rs.getString(8));
					
					v_lst.add(v);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		return v_lst;
	}
	
	
	public Visitor getVisitorById(int vid) {
		con = makeConnection();
		Visitor v= new Visitor();
		if(con !=null) {
			String sql= "select * from visitor where vid=?";
			try {
				PreparedStatement pst= con.prepareStatement(sql);
				pst.setInt(1, vid);
				rs=pst.executeQuery();
				while(rs.next()) {
					v.setVid(rs.getInt(1));
					v.setVname(rs.getString(2));
					v.setEmail(rs.getString(3));
					v.setAddress(rs.getString(4));
					v.setContact(rs.getInt(5));
					v.setQualification(rs.getString(6));
					v.setPurpose(rs.getString(7));
					v.setVdate(rs.getString(8));
				}
				
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(" Not Connected");
		}
		
		return v;
	}
	
	
	public int updateVisitorById(Visitor v) {
		
		con=makeConnection();
		int i=0;
		if(con!=null) {
			
			try {
				PreparedStatement pst= con.prepareStatement("update visitor set vname=?,email=?,address=?,contact=?,qualification=?,purpose=? where vid=?");
				pst.setString(1, v.getVname());
				pst.setString(2, v.getEmail());
				pst.setString(3, v.getAddress());
				pst.setInt(4, v.getContact());
				pst.setString(5, v.getQualification());
				pst.setString(6, v.getPurpose());
				pst.setInt(7, v.getVid());
				
				i=pst.executeUpdate();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println(" Not Connected");
		}
		
		return i;
	}
	
	public int deleteVisitor(int vid) {
		con= makeConnection();
		int i=0;
		if(con!=null) {
			String sql= "delete from visitor where vid=?";
			try {
				PreparedStatement pst= con.prepareStatement(sql);
				pst.setInt(1, vid);
				i=pst.executeUpdate();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println(" Not Connected");
		}
		
		
		return i;
	}

	
	public ArrayList<Visitor>SearchVisitorList(String vdate){
		con=makeConnection();
		
		ArrayList<Visitor> v_lst= new ArrayList<>();
		Visitor v= new Visitor();
		if(con!=null){
			v.getVdate();
			try {
				
				PreparedStatement ps = con.prepareStatement("select * from visitor where vdate=?");
				ps.setString(1,vdate);	
				rs=ps.executeQuery();
				System.err.println("vvvvv"+rs);
				while(rs.next()){
					v.setVid(rs.getInt(1));
					System.out.println(v.getVid());
					v.setVname(rs.getString(2));
					v.setEmail(rs.getString(3));
					v.setAddress(rs.getString(4));
					v.setContact(rs.getInt(5));
					v.setQualification(rs.getString(6));
					v.setPurpose(rs.getString(7));
					v.setVdate(rs.getString(8));
					
					v_lst.add(v);
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		return v_lst;
	}
	
	public int AddAdmin(Admin a){
		int i =0;
		con=makeConnection();
		if(con !=null){
			
			try {
				PreparedStatement ps = con.prepareStatement("insert into  admin values(?,?,?)");
				ps.setInt(1, a.getAid());
				
				ps.setString(2,a.getEmail());
				ps.setString(3,a.getPassword());
				
				i= ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}else{
			System.out.println("Connecton Error in adding admin");
		}
		
		return i;
	}
	
	public boolean Validate(String email, String password){
		boolean status=false;
		con=makeConnection();
		if(con !=null){
			
			try {
				PreparedStatement ps = con.prepareStatement("select  * from admin where email=? and password=?");
				
				ps.setString(1, email);
				ps.setString(2, password);

				rs=ps.executeQuery();
				if(rs!=null){
					status = true;
				}
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}else{
			System.out.println("Connecton Error");
		}
		
		return status;
	}

}
