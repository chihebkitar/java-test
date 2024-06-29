package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * also return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i == null || n == null || n < 0) {
      return Option.none();
    }

    try {
      if (n == 0) {
        return Option.some(1);
      }

      if (i == 0) {
        return Option.some(0);
      }
      //we can add a if for the overflow of the result
      int result = 1;
      for (int j = 0; j < n; j++) {

        result *= i;
      }
      return Option.some(result);
    } catch (Exception e) {
      return Option.none();
    }
  }
}
