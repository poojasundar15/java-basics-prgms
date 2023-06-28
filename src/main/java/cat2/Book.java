//package cat2;
//
//import java.sql.*;
//
//public class BooksDatabase {
//
//    private Connection conn;
//
//    public BooksDatabase(String url, String username, String password) throws SQLException {
//        conn = DriverManager.getConnection(url, username, password);
//    }
//
//    // Add a new author to the Authors table
//    public void addAuthor(String name, Date birthdate, String bio) throws SQLException {
//        String sql = "INSERT INTO Authors (Name, Birthdate, Bio) VALUES (?, ?, ?)";
//        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, name);
//            stmt.setDate(2, birthdate);
//            stmt.setString(3, bio);
//            stmt.executeUpdate();
//        }
//    }
//
//    // Edit the information for an existing author in the Authors table
//    public void editAuthor(int authorId, String name, Date birthdate, String bio) throws SQLException {
//        String sql = "UPDATE Authors SET Name = ?, Birthdate = ?, Bio = ? WHERE AuthorID = ?";
//        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, name);
//            stmt.setDate(2, birthdate);
//            stmt.setString(3, bio);
//            stmt.setInt(4, authorId);
//            stmt.executeUpdate();
//        }
//    }
//
//    // Add a new title for an author
//    public void addTitle(int authorId, String title, String isbn, String publisher, Date pubDate) throws SQLException {
//        // First insert the title into the Titles table
//        String sql = "INSERT INTO Titles (Title, ISBN, Publisher, PublicationDate) VALUES (?, ?, ?, ?)";
//        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//            stmt.setString(1, title);
//            stmt.setString(2, isbn);
//            stmt.setString(3, publisher);
//            stmt.setDate(4, pubDate);
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            int titleId = rs.getInt(1);
//            rs.close();
//            // Then create a new row in the AuthorISBN table to link the author with the new title
//            sql = "INSERT INTO AuthorISBN (AuthorID, TitleID) VALUES (?, ?)";
//            try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
//                stmt2.setInt(1, authorId);
//                stmt2.setInt(2, titleId);
//                stmt2.executeUpdate();
//            }
//        }
//    }
//
//    // Add a new entry in the AuthorISBN table to link an author with a title
//    public void linkAuthorTitle(int authorId, String isbn) throws SQLException {
//        // First retrieve the title ID from the Titles table
//        String sql = "SELECT TitleID FROM Titles WHERE ISBN = ?";
//        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, isbn);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                int titleId = rs.getInt("TitleID");
//                rs.close();
//                // Then insert a new row in the AuthorISBN table
//                sql = "INSERT INTO AuthorISBN (AuthorID, TitleID) VALUES (?, ?)";
//                try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
//                    stmt2.setInt(1, authorId);
//                    stmt2.setInt(2, titleId);
//                    stmt2.executeUpdate();
//                }
//            } else {
//                rs.close();
//                throw new SQLException("Title not found");
//            }
//        }
//    }
//
//// Close the connection
//
