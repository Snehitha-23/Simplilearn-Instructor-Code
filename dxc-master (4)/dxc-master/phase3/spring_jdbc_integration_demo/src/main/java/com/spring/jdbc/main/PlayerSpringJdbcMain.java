package com.spring.jdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.PlayerDAO;
import com.spring.jdbc.model.Player;

public class PlayerSpringJdbcMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_jdbc_bean.xml");
		PlayerDAO dao=(PlayerDAO) context.getBean("dao");
		
//		List<Player> playerList=dao.getPlayersByCity("hyd");
//		System.out.println("\nPrinting all players");
//		for(Player p:playerList) {
//			System.out.println(p);
//		Player player=new Player(99,"Sourav Ganguly", 42, "Hyd");
//		System.out.println(dao.updatePlayer(player));
	
		System.out.println(dao.removePlayerById(1));
		
		//dao.createPlayer(new Player(99,"Sourav Ganguly", 42, "Kolkata"));
//		System.out.println(dao.getPlayerById(10));
//		
//		List<Player> playerList=dao.getAllPlayers();
//		System.out.println("\nPrinting all players");
//		for(Player p:playerList) {
//			System.out.println(p);
		
		}

	}


