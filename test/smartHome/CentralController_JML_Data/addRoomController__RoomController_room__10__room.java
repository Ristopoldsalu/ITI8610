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
 * test values for parameter "RoomController room" 
 * of method "smartHome.RoomController addRoomController(RoomController)". 
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2018-01-08 21:21 +0200
 */
public /*@ nullable_by_default */ class addRoomController__RoomController_room__10__room
  extends ClassStrategy_smartHome_RoomController {
  /**
   * @return local-scope values for parameter 
   *  "RoomController room".
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add local-scope smartHome.RoomController values or generators here */ });
  }

  /**
   * Constructor.
   * The use of reflection can be controlled here for  
   * "RoomController room" of method "smartHome.RoomController addRoomController(RoomController)" 
   * by changing the parameters to <code>setReflective</code>
   * and <code>setMaxRecursionDepth<code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Since this is the lowest level of strategy, the 
   * behavior will be exactly as you specify here if you clear the existing 
   * list of classes first.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public addRoomController__RoomController_room__10__room() {
    super();
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
