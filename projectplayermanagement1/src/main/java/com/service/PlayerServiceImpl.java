package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlayerRepository;
import com.exception.PlayerNotFoundException;

import com.model.Player;


@Service
public class PlayerServiceImpl  implements PlayerService
{
    @Autowired
    PlayerRepository PlayerRepo ;
    
   
	@Override
	public Player savePlayer(Player p)
	{
		return  PlayerRepo.save(p);
	}
 
    

	@Override
	public Player getOnePlayer(int id) {
		
		return PlayerRepo.findById(id).orElse(null);
	}
		
     
	@Override
	public List<Player> getAllPlayer() 
	{
		
		return PlayerRepo.findAll();
	}
	
	
     /*
	@Override
	public Map<String, Object>  deletePlayer(int id) throws PlayerNotFoundException {
		 Map<String,Object> response=new HashMap<String,Object>();
		 try {
		 
			 Player player= PlayerRepo.findById(id).orElseThrow(()->new PlayerNotFoundException("player not found"+id));
			 PlayerRepo.delete(player);
			 response.put("deleted", Boolean.TRUE);//response ready
		 
		 
		 }catch(PlayerNotFoundException u)
		 {
			 response.put(" not deleted", u.getMessage());//getmassage=
		 }
		  return response;
	     }
	    */
 
	
	@Override
	public Player updatePlayer(Player player)
	{
		Player p=PlayerRepo.findById(player.getPlayerId()).orElse(null);
		p.setPlayerName(player.getPlayerName());
		return PlayerRepo.save(p);
		
		
	}

	
    
    
}
