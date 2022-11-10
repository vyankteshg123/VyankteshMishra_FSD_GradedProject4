package com.greatlearning.ems.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.ems.entity.Roles;
import com.greatlearning.ems.service.RoleService;

@RestController
@RequestMapping("/RolesDetails")
public class RoleController {

	private RoleService roleService;

	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}

	@PostMapping("/role")
	public Roles saveRole(@RequestBody Roles role) {
		return roleService.save(role);
	}
}
