package com.java.may.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.may.db.connection.DBConnection;
import com.java.may.domain.Film;

public class FilmDAO {

	public boolean isGeneralUser = true;

	public Film getFilmbyId(int id) {
		DBConnection dbConnection = new DBConnection();
		Film film = null;
		if (isGeneralUser)
			System.out.println("General user");
		try {

			Connection con = dbConnection.getConnection();
			String query = "select title, description from film where film_id = ?"; // parameterized
																					// query
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString("rated") =="PG" && isGeneralUser) {
					film = new Film();
					film.setDescription(rs.getString("description"));
					film.setTitle(rs.getString("title"));
				}
			}

			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return film;

	}

	public List<Film> getFilmsByActorId(int actorId) {
		DBConnection dbConnection = new DBConnection();
		List<Film> films = new ArrayList<Film>();
		;
		try {

			Connection con = dbConnection.getConnection();
			String query = "select film_id from film_actor where actor_id = ?"; // parameterized
																				// query
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, actorId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				Film film = getFilmbyId(rs.getInt("film_id"));
				films.add(film);
			}

			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return films;

	}

}
