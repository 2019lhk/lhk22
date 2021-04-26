package kr.mjc.lhk.java.generics;

/**
 * 참조 : https://docs.oracle.com/javase/tutorial/java/generics/types.html
 */
public class SimpleBox {

  private Object object;

  public void set(Object object) {
    this.object = object;
  }

  public Object get() {
    return object;
  }
}
