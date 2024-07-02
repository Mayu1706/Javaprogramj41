package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.PlayerNotFoundException;
import com.model.Player;

import com.service.PlayerService;
@CrossOrigin(origins="http://localhost:4200")
@RestController

public class PlayerController
{

	@Autowired //inject the service dependency
	PlayerService playerservice;
	
	@PostMapping("/add")
    public ResponseEntity<Player> savePlayer(@RequestBody Player p)
    {
    	Player player=playerservice.savePlayer(p);
    	return  ResponseEntity.status(HttpStatus.CREATED).header("add", "User added").body(player);
    }
    
   
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Player> getonePlayer(@PathVariable("id") int id)
	{
	Player player=playerservice.getOnePlayer(id);
   	 return  ResponseEntity.status(HttpStatus.OK).header("get", "get one user ").body(player);
	}
	

	
	@GetMapping("/getAll")
    public  List<Player> getAllPlayer()
    {
	 return playerservice.getAllPlayer();
    }
    
   
	
	/*
    @DeleteMapping("/deletePlayer/{id}")
	public ResponseEntity<Map<String,Object>> deletePlayer(@PathVariable("id")int id) throws PlayerNotFoundException
	 {
	    	Map<String,Object> response=playerservice. deletePlayer(id);
	    	return ResponseEntity.ok(response);
	 }
	 */
    
	
    @PutMapping("/updatePlayer")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
    	Player p=playerservice.updatePlayer(player);
    	return ResponseEntity.status(HttpStatus.CREATED).header("update", "player updated").body(p);
    	}
  
	
}
