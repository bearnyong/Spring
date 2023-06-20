package com.greedy.section01.xmlconfig.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.greedy.section01.xmlconfig.common.PrintResult;
import com.greedy.section01.xmlconfig.dto.MenuDTO;
import com.greedy.section01.xmlconfig.dto.ModifyMenuDTO;
import com.greedy.section01.xmlconfig.service.MenuService;

/* <컨트롤러 계층>
 * 사용자의 요청을 매핑하는 역할을 수행한다.
 * 사용자 입력 값의 유효성을 체크한다.*/

@Controller
public class MenuController {

	private final MenuService menuService;
	private final PrintResult printResult;

	@Autowired
	public MenuController(MenuService menuService, PrintResult printResult) {
		this.menuService = new MenuService();
		this.printResult = new PrintResult();
	}

	public void findAllMenus() {
		List<MenuDTO> menuList = menuService.findAllMenus();

		if (menuList != null) {
			printResult.printMenuList(menuList);
		} else {
			printResult.printErrorMessage("findAllMenus");
		}
	}

	public void findMenuByMenuCode(Map<String, String> inputMenuCode) {
		int code = Integer.parseInt(inputMenuCode.get("code"));

		MenuDTO menu = menuService.findMenuByMenuCode(code);

		if (menu == null) {
			printResult.printErrorMessage("findMenuByMenuCode");
		} else {
			printResult.printMenuList(menu);
		}
	}

	public void registNewMenu(Map<String, String> inputMenu) {
		/* 값 꺼내오는거임..? */
		String name = inputMenu.get("name");
		int price = Integer.parseInt(inputMenu.get("price"));
		int categoryCode = Integer.parseInt(inputMenu.get("categoryCode"));

		/* 메뉴라는 인스턴스 생성 후 값을 넣어줌... */
		MenuDTO menu = new MenuDTO();
		menu.setName(name);
		menu.setPrice(price);
		menu.setCategoryCode(categoryCode);

		if (menuService.registNewMenu(menu)) {
			printResult.printSuccessMessage("registNewMenu");
		} else {
			printResult.printErrorMessage("registNewMenu");
		}
	}

	public void modifyMenu(Map<String, String> inputModifyMenu) {
		ModifyMenuDTO menuDTO = new ModifyMenuDTO();

		menuDTO.setCode(inputModifyMenu.get("code"));
		menuDTO.setName(inputModifyMenu.get("name"));
		menuDTO.setPrice(inputModifyMenu.get("price"));
		menuDTO.setCategoryCode(inputModifyMenu.get("categoryCode"));

		int result = menuService.modifyMenu(menuDTO);

		if (result > 0) {
			printResult.printSuccessMessage("modifyMenu");
		} else {
			printResult.printErrorMessage("notModify");
		}
	}

	public void removeMenu(Map<String, String> inputMenuCode) {
		int code = Integer.parseInt(inputMenuCode.get("code"));
		int result = menuService.removeMenu(code);
		
		if (result > 0) {
			printResult.printSuccessMessage("removeMenu");
		} else {
			printResult.printErrorMessage("notremoveMenu");
		}
	}

}
