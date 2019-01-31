package SchoolViolenceMatrix.Model.Report.Part1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test of M_Intake class setters/getters
 * 
 * @author  Christopher Kratz
 * @version 0.1
 * @since   1/30/2019
 */
public class M_IntakeTest
{
  M_Intake instance = M_Intake.instance();
  
  public M_IntakeTest()
  { }

  /**
   * Test of instance method, of class M_Intake.
   */
  @Test
  public void testInstance()
  {
    System.out.println("instance");
    M_Intake expResult = M_Intake.instance();
    M_Intake result = M_Intake.instance();
    assertEquals(expResult, result);
  }

  /**
   * Test of getDateReported method, of class M_Intake.
   */
  @Test
  public void testGetDateReported()
  {
    System.out.println("getDateReported");
    String expResult = "testDate";
    instance.setDateReported(expResult);
    String result = instance.getDateReported();
    assertEquals(expResult, result);
  }

  /**
   * Test of setDateReported method, of class M_Intake.
   */
  @Test
  public void testSetDateReported()
  {
    System.out.println("setDateReported");
    String dateReported = "testDate";
    instance.setDateReported(dateReported);
  }

  /**
   * Test of getDayOfWeek method, of class M_Intake.
   */
  @Test
  public void testGetDayOfWeek()
  {
    System.out.println("getDayOfWeek");
    String expResult = "testDayOfWeek";
    instance.setDayOfWeek(expResult);
    String result = instance.getDayOfWeek();
    assertEquals(expResult, result);
  }

  /**
   * Test of setDayOfWeek method, of class M_Intake.
   */
  @Test
  public void testSetDayOfWeek()
  {
    System.out.println("setDayOfWeek");
    String dayOfWeek = "testDayOfWeek";
    instance.setDayOfWeek(dayOfWeek);
  }

  /**
   * Test of getTime method, of class M_Intake.
   */
  @Test
  public void testGetTime()
  {
    System.out.println("getTime");
    String expResult = "testSetTIme";
    instance.setTime(expResult);
    String result = instance.getTime();
    assertEquals(expResult, result);
  }

  /**
   * Test of setTime method, of class M_Intake.
   */
  @Test
  public void testSetTime()
  {
    System.out.println("setTime");
    String time = "testSetTime";
    instance.setTime(time);
  }

  /**
   * Test of getTimeOfDay method, of class M_Intake.
   */
  @Test
  public void testGetTimeOfDay()
  {
    System.out.println("getTimeOfDay");
    String expResult = "testTimeOfDay";
    instance.setTimeOfDay(expResult);
    String result = instance.getTimeOfDay();
    assertEquals(expResult, result);
  }

  /**
   * Test of setTimeOfDay method, of class M_Intake.
   */
  @Test
  public void testSetTimeOfDay()
  {
    System.out.println("setTimeOfDay");
    String timeOfDay = "testTimeOfDay";
    instance.setTimeOfDay(timeOfDay);
  }

  /**
   * Test of getTakenBy method, of class M_Intake.
   */
  @Test
  public void testGetTakenBy()
  {
    System.out.println("getTakenBy");
    String expResult = "testTakenBy";
    instance.setTakenBy(expResult);
    String result = instance.getTakenBy();
    assertEquals(expResult, result);
  }

  /**
   * Test of setTakenBy method, of class M_Intake.
   */
  @Test
  public void testSetTakenBy()
  {
    System.out.println("setTakenBy");
    String takenBy = "testTakenBy";
    instance.setTakenBy(takenBy);
  }

  /**
   * Test of getSchool method, of class M_Intake.
   */
  @Test
  public void testGetSchool()
  {
    System.out.println("getSchool");
    String expResult = "testSchool";
    instance.setSchool(expResult);
    String result = instance.getSchool();
    assertEquals(expResult, result);
  }

  /**
   * Test of setSchool method, of class M_Intake.
   */
  @Test
  public void testSetSchool()
  {
    System.out.println("setSchool");
    String school = "testSchool";
    instance.setSchool(school);
  }

  /**
   * Test of getPosition method, of class M_Intake.
   */
  @Test
  public void testGetPosition()
  {
    System.out.println("getPosition");
    String expResult = "testPosition";
    instance.setPosition(expResult);
    String result = instance.getPosition();
    assertEquals(expResult, result);
  }

  /**
   * Test of setPosition method, of class M_Intake.
   */
  @Test
  public void testSetPosition()
  {
    System.out.println("setPosition");
    String position = "testPosition";
    instance.setPosition(position);
  }
  
}
