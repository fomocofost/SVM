package SchoolViolenceMatrix.Controller.Report.Part1;

import SchoolViolenceMatrix.Model.Report.Part1.M_ReportingParty;
import SchoolViolenceMatrix.View.Report.Part1.V_ReportingParty;

/**
 * Controller for the Reporting Party portion of part 1 of a Report
 * 
 * @author  Christopher Kratz
 * @version 0.2
 * @since   1/23/2019
 */
public class C_ReportingParty
{
  /**
   * Initializes SINGLETON with a new class object
   */
  static { SINGLETON = new C_ReportingParty(); }
  
  /**
   * Initializes an instance of the class with the SINGLETON object
   * 
   * @return instance of the class
   */
  public static C_ReportingParty instance()
  { return SINGLETON; }
  
  /**
   * Private default constructor initializes model and view objects
   */
  private C_ReportingParty()
  { 
    MODEL = M_ReportingParty.instance();
    VIEW = V_ReportingParty.instance();
  }
  
  /**
   * Gets the name of the reporting party
   * 
   * @return name of the reporting party
   */
  public String getName()
  { return MODEL.getName(); }

  /**
   * Sets the name of the reporting party
   * 
   * @param name name of the reporting party
   */
  public void setName(String name)
  { MODEL.setName(name); }

  /**
   * Gets the ID of the reporting party
   * 
   * @return ID of the reporting party
   */
  public String getId()
  { return MODEL.getId(); }

  /**
   * Sets the ID of the reporting party
   * 
   * @param id ID of the reporting party
   */
  public void setId(String id)
  { MODEL.setId(id); }

  /**
   * Gets the affiliation of the reporting party
   * 
   * @return affiliation of the reporting party
   */
  public String getAffiliation()
  { return MODEL.getAffiliation(); }

  /**
   * Sets the affiliation of the reporting party
   * 
   * @param affiliation affiliation of the reporting party
   */
  public void setAffiliation(String affiliation)
  { MODEL.setAffiliation(affiliation); }

  /**
   * Gets the status of reporting party's affiliation
   * 
   * @return status of the reporting party's affiliation
   */
  public String getStatus()
  { return MODEL.getStatus(); }

  /**
   * Sets the status of the reporting party's affiliation
   * 
   * @param status status of the reporting party's affiliation
   */
  public void setStatus(String status)
  { MODEL.setStatus(status); }

  /**
   * Gets the grade of the reporting party (if student)
   * 
   * @return grade of the reporting party
   */
  public String getGrade()
  { return MODEL.getGrade(); }

  /**
   * Sets the grade of the reporting party (if student)
   * 
   * @param grade grade of the reporting party
   */
  public void setGrade(String grade)
  { MODEL.setGrade(grade); }

  /**
   * Gets the school of the reporting party
   * 
   * @return school of the reporting party
   */
  public String getSchool()
  { return MODEL.getSchool(); }

  /**
   * Sets the school of the reporting party
   * 
   * @param school school of the reporting party
   */
  public void setSchool(String school)
  { MODEL.setSchool(school); }

  /**
   * Gets the building/program of the reporting party at the school
   * 
   * @return building/program of the reporting party
   */
  public String getBuildingProgram()
  { return MODEL.getBuildingProgram(); }

  /**
   * Sets the building/program of the reporting party at the school
   * 
   * @param buildingProgram building/program of the reporting party
   */
  public void setBuildingProgram(String buildingProgram)
  { MODEL.setBuildingProgram(buildingProgram); }

  /**
   * Gets the home address of the reporting party
   * 
   * @return home address of the reporting party
   */
  public String getHomeAddress()
  { return MODEL.getHomeAddress(); }

  /**
   * Sets the home address of the reporting party
   * 
   * @param homeAddress home address of the reporting party
   */
  public void setHomeAddress(String homeAddress)
  { MODEL.setHomeAddress(homeAddress); }

  /**
   * Gets the phone number of the reporting party
   * 
   * @return phone number of the reporting party
   */
  public String getPhone()
  { return MODEL.getPhone(); }

  /**
   * Sets the phone number of the reporting party
   * 
   * @param phone phone number of the reporting party
   */
  public void setPhone(String phone)
  { MODEL.setPhone(phone); }
  
  /**
   * Updates the view's components
   */
  public void updateView()
  { 
    VIEW.setName(getName());
    VIEW.setID(getId());
    VIEW.setAffiliation(getAffiliation());
    VIEW.setStatus(getStatus());
    VIEW.setGrade(getGrade());
    VIEW.setSchool(getSchool());
    VIEW.setBuildingProgram(getBuildingProgram());
    VIEW.setHomeAddress(getHomeAddress());
    VIEW.setPhone(getPhone());
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
  private static final C_ReportingParty SINGLETON;
  private final M_ReportingParty MODEL;
  private final V_ReportingParty VIEW;
}
