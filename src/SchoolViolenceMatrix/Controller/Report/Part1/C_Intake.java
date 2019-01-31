package SchoolViolenceMatrix.Controller.Report.Part1;

import SchoolViolenceMatrix.View.Report.Part1.V_Intake;
import SchoolViolenceMatrix.Model.Report.Part1.M_Intake;

/**
 * Controller for the Intake portion of part 1 of a Report
 * 
 * @author  Christopher Kratz
 * @version 0.2
 * @since   1/22/2019
 */
public class C_Intake
{
  /**
   * Instantiates SINGLETON with a new class object
   */
  static { SINGLETON = new C_Intake(); }
  
  /**
   * Initializes an instance of the class ith the SINGLETON object
   * 
   * @return  instance of the class
   */
  public static C_Intake instance()
  { return SINGLETON; }
  
  /**
   * Private default constructor initializes Model and View objects
   */
  private C_Intake()
  { 
    MODEL = M_Intake.instance();
    VIEW = V_Intake.instance();
  }

  /**
   * Sets the date of the report
   * 
   * @param dateReported  date of the report
   */
  public void setDateReported(String dateReported)
  { MODEL.setDateReported(dateReported); }
  
  /**
   * Gets the date of the report
   * 
   * @return  date of the report
   */
  public String getDateReported()
  { return MODEL.getDateReported(); }
  
  /**
   * Sets the day of the week of the report
   * 
   * @param dayOfWeek day of the report
   */
  public void setDayOfWeek(String dayOfWeek)
  { MODEL.setDayOfWeek(dayOfWeek); }
  
  /**
   * Gets the day of the week of the report
   * 
   * @return day of the report
   */
  public String getDayOfWeek()
  { return MODEL.getDayOfWeek(); }
  
  /**
   * Sets the time of the report
   * 
   * @param time time of the report
   */
  public void setTime(String time)
  { MODEL.setTime(time); }
  
  /**
   * Gets the time of the report
   * 
   * @return time of the report
   */
  public String getTime()
  { return MODEL.getTime(); }
  
  /**
   * Sets the midday time (AM or PM) of the report
   * 
   * @param timeOfDay midday time of the report
   */
  public void setTimeOfDay(String timeOfDay)
  { MODEL.setTimeOfDay(timeOfDay); }
  
  /**
   * Gets the midday time (AM or PM) of the report
   * 
   * @return midday time of the report
   */
  public String getTimeOfDay()
  { return MODEL.getTimeOfDay(); }
  
  /**
   * Sets who the report was taken by
   * 
   * @param takenBy who the report was taken by
   */
  public void setTakenBy(String takenBy)
  { MODEL.setTakenBy(takenBy); }
  
  /**
   * Gets who the report was taken by
   * 
   * @return who the report was taken by
   */
  public String getTakenBy()
  { return MODEL.getTakenBy(); }
  
  /**
   * Sets the school related to the report
   * 
   * @param school school related to the report
   */
  public void setSchool(String school)
  { MODEL.setSchool(school); }
  
  /**
   * Gets the school related to the report
   * 
   * @return school related to the report
   */
  public String getSchool()
  { return MODEL.getSchool(); }
  
  /**
   * Sets the position of the individual that took the report
   * 
   * @param position position of the individual that took the report
   */
  public void setPosition(String position)
  { MODEL.setPosition(position); }
  
  /**
   * Gets the position of the individual that took the report
   * 
   * @return position of the individual that took the report
   */
  public String getPosition()
  { return MODEL.getPosition(); }
  
  /**
   * Updates the view's components
   */
  public void updateView()
  { 
    VIEW.setDateReported(getDateReported());
    VIEW.setDayOfWeek(getDayOfWeek());
    VIEW.setTime(getTime());
    VIEW.setTimeOfDay(getTimeOfDay());
    VIEW.setTakenBy(getTakenBy());
    VIEW.setSchool(getSchool());
    VIEW.setPosition(getPosition());
  }
  
  /**
   * Enables all of the view's components for editing
   */
  public void enableView()
  { VIEW.enableView(); }
  
  /**
   * Disables all of the view's components from editing
   */
  public void disableView()
  { VIEW.disableView(); }
  
  
  // Variables
  private static final C_Intake SINGLETON;
  private final M_Intake MODEL;
  private final V_Intake VIEW;
}
