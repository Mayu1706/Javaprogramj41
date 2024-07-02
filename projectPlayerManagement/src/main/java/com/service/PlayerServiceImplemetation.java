package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlayerRepository;
import com.exception.UserNotFoundException;
import com.model.Player;




@Service
public class PlayerServiceImplemetation implements PlayerService{

	@Autowired
	PlayerRepository PlayerRepo;
	public Player savePlayer(Player player) {
		
		return PlayerRepo.save(player);
	}
	/*
	@Override
	public Player getOnePlayer(int id) {
		
		return PlayerRepo.findById(id).orElse(null);
	}
	@Override
	public List<Player> getAllPlayer() {
	
		return PlayerRepo.findAll();
	}
	
	@Override
	public void deletePlayer(int id) {
		PlayerRepo.deleteById(id);
		
	}
	
	@Override
	public Player updatePlayer(Player player) {
		 
		Player P=PlayerRepo.findById(player.getPlayerId()).orElse(null);
		P.setPlayerId(player.getPlayerId());
		P.setPlayerName(player.getPlayerName());
		return PlayerRepo.save(player);
	}
	
	@Override
	public Map<String, Object> deleteUser(int id) throws UserNotFoundException {
		Map<String, Object> response=new HashMap<String, Object> ();
		try
		{
			Player player=PlayerRepo.findById(id).orElseThrow(()->new UserNotFoundException ("Player not exist"+id));
			PlayerRepo.delete(player);
			response.put("delete", Boolean.TRUE);
		
		}catch( UserNotFoundException P)
		{
			response.put("not deleted", P.getMessage());
		}
		
		return response;
	}
	*/
	
	

}

