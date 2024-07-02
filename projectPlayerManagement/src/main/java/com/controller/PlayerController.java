package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.UserNotFoundException;
import com.model.Player;
import com.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@PostMapping("/add")
	public ResponseEntity <Player> savePlayer(@RequestBody Player p)
	{
		Player player=playerService.savePlayer(p);
		return ResponseEntity.status(HttpStatus.CREATED).header("add","Player add").body(player);
	}
	
	/*
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Player> getOnePlayer(@PathVariable("id") int id) {
	Player player=playerService.getOnePlayer(id);
	{
	
		return ResponseEntity.status(HttpStatus.OK).header("Get","Player get").body(player);
		
	}
	*/
     
	/*
	@GetMapping("/getAll")
	public List<Player> getAllProdouct()
	{
		return playerService.getAllPlayer();
	}
	*/
	
	/*
	@DeleteMapping("/deleteOne/{id}")
	public void deletePlayer(@PathVariable("id")int id)
	{
		playerService.deletePlayer(id);
	}
	*/
	
	/*
	@PutMapping("/updatePlayer")
	public ResponseEntity <Player> updatePlayer(@RequestBody Player player)
	{
		Player p= playerService.updatePlayer(player);
		return ResponseEntity.status(HttpStatus.ACCEPTED).header("updated","Player updated").body(player);
	}
	*/
	/*
	@DeleteMapping("/deleteOne/{id}")
	public ResponseEntity<Map<String,Object>> deletePlayer(@PathVariable("id") int id) throws UserNotFoundException
	{
		Map<String,Object> response= playerService.deleteUser(id);
		return ResponseEntity.ok(response);
	}
	/*
	 * 
	 */
	}



