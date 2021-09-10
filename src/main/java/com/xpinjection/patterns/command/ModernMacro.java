package com.xpinjection.patterns.command;

import java.util.ArrayList;
import java.util.List;

import com.xpinjection.patterns.command.canonical.Command;

/**
 * @author Alimenkou Mikalai
 */
public class ModernMacro {
  private final List<Command> commands = new ArrayList<>();

  public ModernMacro record(Command action) {
    commands.add(action);
    return this;
  }

  public void run() {
    commands.forEach(Command::execute);
  }
}
