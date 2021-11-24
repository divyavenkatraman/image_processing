package view;
import controller.Features;

public interface IGraphicsView {

  /**
   * Assigns controller features to actions.
   * @param features controller features
   */
  void addFeatures(Features features);

  /**
   * Puts out an error message given String.
   * @param msg the String to put on the error message.
   */
  void errorMessage(String msg);



}
