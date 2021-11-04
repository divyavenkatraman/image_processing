package model_tests;

import java.io.IOException;

import img.ImageType;

public class PPMModelTest extends ImgModelTest{

  /**
   * Constructs an image model test object and instantiates the necessary objects and files
   *
   * @throws IOException if cannot write to file
   */
  public PPMModelTest() throws IOException {
    type = ImageType.ppm;
    instantiate();
  }
}
