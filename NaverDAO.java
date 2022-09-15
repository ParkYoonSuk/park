package projectoracle;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;

import com.db.DBConn;

public class NaverDAO {
public int insertData(NaverDTO dto){

		

		int result = 0;

		

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;

		String sql;

		

		try {

			sql = "insert into customer1 (id,pw,name,gender,birth,email,phone) ";

			sql+= "values (?,?,?,?,?,?,?)";

			

			pstmt = conn.prepareStatement(sql);

			

			pstmt.setString(1, dto.getId());

			pstmt.setString(2, dto.getPw());

			pstmt.setString(3, dto.getName());

			pstmt.setString(4, dto.getGender());

			pstmt.setString(5, dto.getBirth());

			pstmt.setString(6, dto.getEmail());

			pstmt.setString(7, dto.getPhone());

			

			result = pstmt.executeUpdate();

			

			pstmt.close();

			

		} catch (Exception e) {

			System.out.println(e.toString());

		}

		

		return result;

		

	}

	



	//2.update

	public int updateData(NaverDTO dto){

		

		int result = 0;

		

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;

		String sql;

		

		try {

			sql = "update customer1 set pw=?, email=?, phone=? ";

			sql+= "where id=?";

			

			pstmt = conn.prepareStatement(sql);

			

			pstmt.setString(1, dto.getPw());

			pstmt.setString(2, dto.getEmail());

			pstmt.setString(3, dto.getPhone());

			pstmt.setString(4, dto.getId());

			

			result = pstmt.executeUpdate();

			

			pstmt.close();

			

		} catch (Exception e) {

			System.out.println(e.toString());

		}

		

		return result;

		

	}

	



	//3.delete

	public int deleteDate(String id, String pw){

	

		int result = 0;

		

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;

		String sql;

		

		try {

			sql = "delete customer1 where id=? and pw=?";

			

			pstmt = conn.prepareStatement(sql);

			

			pstmt.setString(1, id);

			pstmt.setString(2, pw);

			

			result = pstmt.executeUpdate();

			

			pstmt.close();

			

		} catch (Exception e) {

			System.out.println(e.toString());

		}

		

		return result;	

	

	}

	



	//4.selectAll

	public List<NaverDTO> getList() {

		

		List<NaverDTO> lists = new ArrayList<NaverDTO>();

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		String sql;

		

		try {

			sql = "select id,pw,name,gender,birth,email,phone ";

			sql+= "from customer1 order by name";

			

			pstmt = conn.prepareStatement(sql);

			

			rs = pstmt.executeQuery();

			

			while(rs.next()){

				

				NaverDTO dto = new NaverDTO();

				

				dto.setId(rs.getString("id"));

				dto.setPw(rs.getString("pw"));

				dto.setName(rs.getString("name"));

				dto.setGender(rs.getString("gender"));

				dto.setBirth(rs.getString("birth"));

				dto.setEmail(rs.getString("email"));

				dto.setPhone(rs.getString("phone"));

				

				lists.add(dto);

							

			}

			

			rs.close();

			pstmt.close();

			

		} catch (Exception e) {

			System.out.println(e.toString());

		}

		

		return lists;

		

	}



	

	//5.searchId

	public List<NaverDTO> getList(String id){

		

		List<NaverDTO> lists = new ArrayList<NaverDTO>();

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		String sql;

		

		try{

			sql = "select id,pw,name,gender,birth,email,phone ";

			sql+= "from customer1 where id=?";

		

			pstmt = conn.prepareStatement(sql);

		

			pstmt.setString(1, id);

			

			rs = pstmt.executeQuery();

			

			while(rs.next()){

				

				NaverDTO dto = new NaverDTO();

				

				dto.setId(rs.getString("id"));

				dto.setPw(rs.getString("pw"));

				dto.setName(rs.getString("name"));

				dto.setGender(rs.getString("gender"));

				dto.setBirth(rs.getString("birth"));

				dto.setEmail(rs.getString("email"));

				dto.setPhone(rs.getString("phone"));

				

				lists.add(dto);

							

			}

			

			rs.close();

			pstmt.close();

			

		}catch (Exception e) {

			System.out.println(e.toString());

		}

		

		return lists;

	}
}
