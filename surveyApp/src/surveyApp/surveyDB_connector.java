package surveyApp;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class surveyDB_connector {

    // Get connection to MySQL
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/survey_db"; 
        String user = "root";
        String password = "0000";

        return DriverManager.getConnection(url, user, password);
    }

    // Save survey data
    public void saveSurvey(String name, String surname, int age, LocalDate date,
                           List<String> favoriteFoods,
                           int eatOut, int watchMovies, int watchTV, int listenRadio) {

        String query = "INSERT INTO survey_results (name, surname, age, date, favorite_foods, eat_out_rating, watch_movies_rating, watch_tv_rating, listen_radio_rating) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setInt(3, age);
            ps.setDate(4, Date.valueOf(date));
            ps.setString(5, String.join(", ", favoriteFoods));
            ps.setInt(6, eatOut);
            ps.setInt(7, watchMovies);
            ps.setInt(8, watchTV);
            ps.setInt(9, listenRadio);

            ps.executeUpdate();
            System.out.println("Survey saved successfully.");

        } catch (SQLException e) {
            System.err.println("Failed to save survey: " + e.getMessage());
        }
    }
}
