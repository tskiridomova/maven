package com.tskiridomova;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void shouldReturnGBEmail() {
    assertTrue(App.returnGBEmail().equals("tskiridomova@gmail.com"));
  }
}
