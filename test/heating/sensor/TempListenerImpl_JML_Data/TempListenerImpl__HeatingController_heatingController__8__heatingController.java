/*
 * Test data strategy for heating.sensor.TempListenerImpl.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2018-01-08 21:21 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 
package heating.sensor.TempListenerImpl_JML_Data;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for heating.sensor.TempListenerImpl. Provides
 * test values for parameter "HeatingController heatingController" 
 * of method "TempListenerImpl(HeatingController)". 
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2018-01-08 21:21 +0200
 */
public /*@ nullable_by_default */ class TempListenerImpl__HeatingController_heatingController__8__heatingController
  extends ClassStrategy_heating_HeatingController {
  /**
   * @return local-scope values for parameter 
   *  "HeatingController heatingController".
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add local-scope heating.HeatingController values or generators here */ });
  }

  /**
   * Constructor.
   * The use of reflection can be controlled here for  
   * "HeatingController heatingController" of method "TempListenerImpl(HeatingController)" 
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
  public TempListenerImpl__HeatingController_heatingController__8__heatingController() {
    super();
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}