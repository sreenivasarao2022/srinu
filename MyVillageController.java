package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MyVillage;
import com.example.service.MyVillageService;

@RestController
public class MyVillageController {
	@Autowired
	private MyVillageService myvillageService;
	@RequestMapping(value="savemavuru",method = RequestMethod.POST)
	public void saveVillageDetails(@RequestBody MyVillage myVillage){
		myvillageService.saveDetails(myVillage);

}
	@RequestMapping(value="deletemavuru",method = RequestMethod.DELETE)
	public void deleteVillageDetails(MyVillage myVillage){
		myvillageService.deleteVillageData(myVillage);
		
	}
}