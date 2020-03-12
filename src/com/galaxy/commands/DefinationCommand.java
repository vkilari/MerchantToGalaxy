package com.galaxy.commands;

import com.galaxy.Merchant;

public class DefinationCommand implements ICommand {

	@Override
	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToDictionary(commandString);
	}

}
