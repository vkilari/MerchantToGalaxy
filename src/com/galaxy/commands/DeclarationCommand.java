package com.galaxy.commands;

import com.galaxy.Merchant;

public class DeclarationCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToItemValue(commandString);
		
	}

}
