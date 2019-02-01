package SchoolViolenceMatrix.Model.Report.Part1;

/**
 * Model of the Reporting Party portion of part 1 of a Report
 * 
 * @author  Christopher Kratz
 * @version 0.2
 * @since   1/23/2019
 */
public class M_ReportingParty
{
  /**
   * Instantiates SINGLETON with a new class object
   */
  static { SINGLETON = new M_ReportingParty(); }
  
  /**
   * Initializes SINGLETON as an instance of the class
   * 
   * @return  instance of the class
   */
  public static M_ReportingParty instance()
  { return SINGLETON; }
  
  /**
   * Private default constructor
   */
  private M_ReportingParty()
  { }

  /**
   * Gets the name of the reporting party
   * 
   * @return name of the reporting party
   */
  public String getName()
  { return name; }

  /**
   * Sets the name of the reporting party
   * 
   * @param name name of the reporting party
   */
  public void setName(String name)
  { this.name = name; }

  /**
   * Gets the ID of the reporting party
   * 
   * @return ID of the reporting party
   */
  public String getId()
  { return id; }

  /**
   * Sets the ID of the reporting party
   * 
   * @param id ID of the reporting party
   */
  public void setId(String id)
  { this.id = id; }

  /**
   * Gets the affiliation of the reporting party
   * 
   * @return affiliation of the reporting party
   */
  public String getAffiliation()
  { return affiliation; }

  /**
   * Sets the affiliation of the reporting party
   * 
   * @param affiliation affiliation of the reporting party
   */
  public void setAffiliation(String affiliation)
  { this.affiliation = affiliation; }

  /**
   * Gets the status of reporting party's affiliation
   * 
   * @return status of the reporting party's affiliation
   */
  public String getStatus()
  { return status; }

  /**
   * Sets the status of the reporting party's affiliation
   * 
   * @param status status of the reporting party's affiliation
   */
  public void setStatus(String status)
  { this.status = status; }

  /**
   * Gets the grade of the reporting party (if student)
   * 
   * @return grade of the reporting party
   */
  public String getGrade()
  { return grade; }

  /**
   * Sets the grade of the reporting party (if student)
   * 
   * @param grade grade of the reporting party
   */
  public void setGrade(String grade)
  { this.grade = grade; }

  /**
   * Gets the school of the reporting party
   * 
   * @return school of the reporting party
   */
  public String getSchool()
  { return school; }

  /**
   * Sets the school of the reporting party
   * 
   * @param school school of the reporting party
   */
  public void setSchool(String school)
  { this.school = school; }

  /**
   * Gets the building/program of the reporting party at the school
   * 
   * @return building/program of the reporting party
   */
  public String getBuildingProgram()
  { return buildingProgram; }

  /**
   * Sets the building/program of the reporting party at the school
   * 
   * @param buildingProgram building/program of the reporting party
   */
  public void setBuildingProgram(String buildingProgram)
  { this.buildingProgram = buildingProgram; }

  /**
   * Gets the home address of the reporting party
   * 
   * @return home address of the reporting party
   */
  public String getHomeAddress()
  { return homeAddress; }

  /**
   * Sets the home address of the reporting party
   * 
   * @param homeAddress home address of the reporting party
   */
  public void setHomeAddress(String homeAddress)
  { this.homeAddress = homeAddress; }

  /**
   * Gets the phone number of the reporting party
   * 
   * @return phone number of the reporting party
   */
  public String getPhone()
  { return phone; }

  /**
   * Sets the phone number of the reporting party
   * 
   * @param phone phone number of the reporting party
   */
  public void setPhone(String phone)
  { this.phone = phone; }
  
  // Variables
  private static final M_ReportingParty SINGLETON;
  private String name;
  private String id;
  private String affiliation;
  private String status;
  private String grade;
  private String school;
  private String buildingProgram;
  private String homeAddress;
  private String phone;
}
