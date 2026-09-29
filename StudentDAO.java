import java.sql.*;
import java.util.*;

public class StudentDAO {

    public void addStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO students(name, marks) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.name);
            ps.setInt(2, s.marks);
            ps.executeUpdate();
            System.out.println("Student Added Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("marks"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, int marks) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE students SET marks=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, marks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Updated Successfully!");
            else
                System.out.println("Student Not Found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Deleted Successfully!");
            else
                System.out.println("Student Not Found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
