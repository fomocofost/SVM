package SchoolViolenceMatrix.Model.Report.Part1;

/**
 * Model for the Intake portion of part 1 of a Report
 * 
 * @author  Christopher Kratz
 * @version 0.2
 * @since   1/23/2019
 */
public class M_Intake
{
  /**
   * Instantiates SINGLETON with a new class object
   */
  static { SINGLETON = new M_Intake(); }
  
  /**
   * Returns SINGLETON as an instance of the class
   * 
   * @return  instance of the class
   */
  public static M_Intake instance()
  { return SINGLETON; }
  
  /**
   * Private default constructor
   */
  private M_Intake()
  { }

  /**
   * Gets the date of the report
   * 
   * @return date of the report
   */
  public String getDateReported()
  { return dateReported; }

  /**
   * Sets the date of the report
   * 
   * @param dateReported  date of the report
   */
  public void setDateReported(String dateReported)
  { this.dateReported = dateReported; }

  /**
   * Gets the day of the week of the report
   * 
   * @return day of the week of the report
   */
  public String getDayOfWeek()
  { return dayOfWeek; }

  /**
   * Sets the day of the week of the report
   * 
   * @param dayOfWeek day of the week of the report
   */
  public void setDayOfWeek(String dayOfWeek)
  { this.dayOfWeek = dayOfWeek; }

  /**
   * Gets the time of the report
   * 
   * @return time of the report
   */
  public String getTime()
  { return time; }

  /**
   * Sets the time of the report
   * 
   * @param time  time of the report
   */
  public void setTime(String time)
  { this.time = time; }

  /**
   * Gets the midday time (AM or PM) of the report
   * 
   * @return midday time of the report
   */
  public String getTimeOfDay()
  { return timeOfDay; }

  /**
   * Sets the midday time (AM or PM) of the report
   * 
   * @param timeOfDay midday time of the report
   */
  public void setTimeOfDay(String timeOfDay)
  { this.timeOfDay = timeOfDay; }

  /**
   * Gets who the report was taken by
   * 
   * @return who the report was taken by
   */
  public String getTakenBy()
  { return takenBy; }

  /**
   * Sets who the report was taken by
   * 
   * @param takenBy who the report was taken by
   */
  public void setTakenBy(String takenBy)
  { this.takenBy = takenBy; }

  /**
   * Gets the school related to the report
   * 
   * @return the school related to the report
   */
  public String getSchool()
  { return school; }

  /**
   * Sets the school related to the report
   * 
   * @param school school related to the report
   */
  public void setSchool(String school)
  { this.school = school; }

  /**
   * Gets the position of the individual that took the report
   * 
   * @return position of the individual that took the report
   */
  public String getPosition()
  { return position; }

  /**
   * Sets the position of the individual that took the report
   * 
   * @param position position of the individual that took the report
   */
  public void setPosition(String position)
  { this.position = position; }
  
  // Variables
  private static final M_Intake SINGLETON;
  private String dateReported;
  private String dayOfWeek;
  private String time;
  private String timeOfDay;
  private String takenBy;
  private String school;
  private String position;
}
