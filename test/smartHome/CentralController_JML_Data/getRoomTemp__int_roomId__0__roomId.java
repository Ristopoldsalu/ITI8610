/*
 * Test data strategy for smartHome.CentralController.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2018-01-08 21:21 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 
package smartHome.CentralController_JML_Data;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for smartHome.CentralController. Provides
 * test values for parameter "int roomId" 
 * of method "java.lang.Double getRoomTemp(int)". 
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2018-01-08 21:21 +0200
 */
public /*@ nullable_by_default */ class getRoomTemp__int_roomId__0__roomId
  extends ClassStrategy_int {
  /**
   * @return local-scope values for parameter 
   *  "int roomId".
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add local-scope int values or generators here */ });
  }
}
