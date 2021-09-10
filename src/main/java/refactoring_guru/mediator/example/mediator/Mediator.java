package refactoring_guru.mediator.example.mediator;

import javax.swing.ListModel;

import refactoring_guru.mediator.example.components.Component;

/**
 * Common mediator interface.
 */
public interface Mediator {
  void addNewNote(Note note);

  void deleteNote();

  void getInfoFromList(Note note);

  void saveChanges();

  void markNote();

  void clear();

  void sendToFilter(ListModel listModel);

  void setElementsList(ListModel list);

  void registerComponent(Component component);

  void hideElements(boolean flag);

  void createGUI();
}
