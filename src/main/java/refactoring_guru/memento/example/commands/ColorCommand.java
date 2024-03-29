package refactoring_guru.memento.example.commands;

import java.awt.Color;

import refactoring_guru.memento.example.editor.Editor;
import refactoring_guru.memento.example.shapes.Shape;

public class ColorCommand implements Command {
  private Editor editor;
  private Color color;

  public ColorCommand(Editor editor, Color color) {
    this.editor = editor;
    this.color = color;
  }

  @Override
  public String getName() {
    return "Colorize: " + color.toString();
  }

  @Override
  public void execute() {
    for (Shape child : editor.getShapes().getSelected()) {
      child.setColor(color);
    }
  }
}
