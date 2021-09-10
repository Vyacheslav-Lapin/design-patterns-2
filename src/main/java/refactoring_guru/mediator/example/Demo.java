package refactoring_guru.mediator.example;

import javax.swing.DefaultListModel;

import refactoring_guru.mediator.example.components.AddButton;
import refactoring_guru.mediator.example.components.DeleteButton;
import refactoring_guru.mediator.example.components.Filter;
import refactoring_guru.mediator.example.components.List;
import refactoring_guru.mediator.example.components.SaveButton;
import refactoring_guru.mediator.example.components.TextBox;
import refactoring_guru.mediator.example.components.Title;
import refactoring_guru.mediator.example.mediator.Editor;
import refactoring_guru.mediator.example.mediator.Mediator;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
  public static void main(String[] args) {
    Mediator mediator = new Editor();

    mediator.registerComponent(new Title());
    mediator.registerComponent(new TextBox());
    mediator.registerComponent(new AddButton());
    mediator.registerComponent(new DeleteButton());
    mediator.registerComponent(new SaveButton());
    mediator.registerComponent(new List(new DefaultListModel()));
    mediator.registerComponent(new Filter());

    mediator.createGUI();
  }
}
