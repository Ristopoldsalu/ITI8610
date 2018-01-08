/*
 * Test data strategy for heating.sensor.TempListenerImpl.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2018-01-08 21:21 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

package heating.sensor;

import java.util.LinkedList;
import java.util.List;

import org.jmlspecs.jmlunitng.iterator.InstantiationIterator;
import org.jmlspecs.jmlunitng.iterator.IteratorAdapter;
import org.jmlspecs.jmlunitng.iterator.NonNullMultiIterator;
import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.ObjectStrategy;

/**
 * Test data strategy for heating.sensor.TempListenerImpl. Provides
 * instances of heating.sensor.TempListenerImpl for testing, using
 * parameters from constructor tests.
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2018-01-08 21:21 +0200
 */
public /*@ nullable_by_default */ class TempListenerImpl_InstanceStrategy extends ObjectStrategy {
  /**
   * @return local-scope instances of TempListenerImpl.
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add heating.sensor.TempListenerImpl values or generators here */ });
  }

  /**
   * @return default instances of TempListenerImpl, generated
   *  using constructor test parameters.
   */ 
  public RepeatedAccessIterator<heating.sensor.TempListenerImpl> defaultValues() {
    final List<RepeatedAccessIterator<heating.sensor.TempListenerImpl>> iters = 
      new LinkedList<RepeatedAccessIterator<heating.sensor.TempListenerImpl>>();

    // an instantiation iterator for the default constructor
    // (if there isn't one, it will fail silently)
    iters.add(new InstantiationIterator<heating.sensor.TempListenerImpl>
      (heating.sensor.TempListenerImpl.class, 
       new Class<?>[0], 
       new ObjectArrayIterator<Object[]>(new Object[][]{{}})));

    // parameters for method TempListenerImpl(HeatingController)
    iters.add(new InstantiationIterator<heating.sensor.TempListenerImpl>
      (heating.sensor.TempListenerImpl.class, 
       new Class<?>[]
       {heating.HeatingController.class},
       TempListenerImpl_JML_Test.p_TempListenerImpl__HeatingController_heatingController__8().wrapped()));

    return new NonNullMultiIterator<heating.sensor.TempListenerImpl>(iters);
  }

  /**
   * Constructor. The boolean parameter to <code>setReflective</code>
   * determines whether or not reflection will be used to generate
   * test objects, and the int parameter to <code>setMaxRecursionDepth</code>
   * determines how many levels reflective generation of self-referential classes
   * will recurse.
   *
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public TempListenerImpl_InstanceStrategy() {
    super(heating.sensor.TempListenerImpl.class);
    setReflective(false);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}