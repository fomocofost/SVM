package SchoolViolenceMatrix.View.Report.Part1;

import SchoolViolenceMatrix.Resources.Managers.Report.Part1.ResMgr_Intake;
import SchoolViolenceMatrix.View.Factories.F_Component;
import SchoolViolenceMatrix.View.Report.ActionListeners;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * View of the Intake portion of part 1 of a Report
 * 
 * @author  Christopher Kratz
 * @version 0.2
 * @since   1/20/2019
 */
public class V_Intake extends JPanel
{
  /**
   * Instantiates the SINGLETON object with a new instance of the class
   */
  static { SINGLETON = new V_Intake(); }
  
  /**
   * Initializes an instance of the class with the SINGLETON object
   * 
   * @return  an instance of the class
   */
  public static V_Intake instance()
  { return SINGLETON; }
  
  /**
   * Private constructor initializes the UI components and UI layout
   */
  private V_Intake()
  { 
    this.chkDays = new JCheckBox[Integer.parseInt(MANAGER.getString("DAYS_CHK"))];
    this.chkTimes = new JCheckBox[Integer.parseInt(MANAGER.getString("TIMES_CHK"))];
    initComponents();
    initLayout();
  }
  
  /**
   * Initializes the various UI components
   */
  private void initComponents()
  {
    initView();
    initLabels();
    initTextFields();
    initCheckBoxes();
  }
  
  /**
   * Initializes this class instance with the appropriate dimensions and titled
   * border
   */
  private void initView()
  {
    this.setBorder(BorderFactory.createTitledBorder(
            MANAGER.getString("TITLE")));
    this.setMinimumSize(new Dimension(
            Integer.parseInt(MANAGER.getString("XSIZE")),
            Integer.parseInt(MANAGER.getString("YSIZE"))));
    this.setPreferredSize(new Dimension(
            Integer.parseInt(MANAGER.getString("XSIZE")),
            Integer.parseInt(MANAGER.getString("YSIZE"))));
    this.setMaximumSize(new Dimension(
            Integer.parseInt(MANAGER.getString("XSIZE")),
            Integer.parseInt(MANAGER.getString("YSIZE"))));
  }
  
  /**
   * Initializes the labels used for each field
   */
  private void initLabels()
  {
    lblDateReported = FACTORY.createLabel(
      MANAGER.getString("DATE_REP_LBL"), 
      Integer.parseInt(MANAGER.getString("DATE_REP_LBL_XSIZE")), 
      Integer.parseInt(MANAGER.getString("GLOBAL_LBL_YSIZE")));
    lblDayOfWeek = FACTORY.createLabel(
      MANAGER.getString("DAY_LBL"), 
      Integer.parseInt(MANAGER.getString("DAY_LBL_XSIZE")), 
      Integer.parseInt(MANAGER.getString("GLOBAL_LBL_YSIZE")));
    lblTime = FACTORY.createLabel(
      MANAGER.getString("TIME_LBL"),
      Integer.parseInt(MANAGER.getString("TIME_LBL_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_LBL_YSIZE")));
    lblTakenBy = FACTORY.createLabel(
      MANAGER.getString("TAKEN_BY_LBL"),
      Integer.parseInt(MANAGER.getString("TAKEN_BY_LBL_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_LBL_YSIZE")));
    lblSchool = FACTORY.createLabel(
      MANAGER.getString("SCHOOL_LBL"),
      Integer.parseInt(MANAGER.getString("SCHOOL_LBL_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_LBL_YSIZE")));
    lblPosition = FACTORY.createLabel(
      MANAGER.getString("POSITION_LBL"),
      Integer.parseInt(MANAGER.getString("POSITION_LBL_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_LBL_YSIZE")));
  }
  
  /**
   * Initializes the text fields
   */
  private void initTextFields()
  {
    txtDateReported = FACTORY.createTextField(
      Integer.parseInt(MANAGER.getString("DATE_REP_TXT_XSIZE")), 
      Integer.parseInt(MANAGER.getString("GLOBAL_TXT_YSIZE")));
    txtTime = FACTORY.createTextField(
      Integer.parseInt(MANAGER.getString("TIME_TXT_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_TXT_YSIZE")));
    txtTakenBy = FACTORY.createTextField(
      Integer.parseInt(MANAGER.getString("TAKEN_BY_TXT_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_TXT_YSIZE")));
    txtSchool = FACTORY.createTextField(
      Integer.parseInt(MANAGER.getString("SCHOOL_TXT_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_TXT_YSIZE")));
    txtPosition = FACTORY.createTextField(
      Integer.parseInt(MANAGER.getString("POSITION_TXT_XSIZE")),
      Integer.parseInt(MANAGER.getString("GLOBAL_TXT_YSIZE")));
  }
  
  /**
   * Initializes the check boxes and their action listeners
   */
  private void initCheckBoxes()
  {
    chkDays[0] = FACTORY.createCheckBox(MANAGER.getString("MON_CHK"));
    chkDays[1] = FACTORY.createCheckBox(MANAGER.getString("TUE_CHK"));
    chkDays[2] = FACTORY.createCheckBox(MANAGER.getString("WED_CHK"));
    chkDays[3] = FACTORY.createCheckBox(MANAGER.getString("THU_CHK"));
    chkDays[4] = FACTORY.createCheckBox(MANAGER.getString("FRI_CHK"));
    chkDays[5] = FACTORY.createCheckBox(MANAGER.getString("SAT_CHK"));
    chkDays[6] = FACTORY.createCheckBox(MANAGER.getString("SUN_CHK"));  
    chkTimes[0] = FACTORY.createCheckBox(MANAGER.getString("AM_CHK"));
    chkTimes[1] = FACTORY.createCheckBox(MANAGER.getString("PM_CHK"));
    
    initSelectionListeners(chkDays);
    initSelectionListeners(chkTimes);
  }
  
  /**
   * Initializes action listeners for each check box
   * 
   * @param boxes array of check boxes to add action listeners to
   */
  private void initSelectionListeners(JCheckBox[] boxes)
  {
    for (JCheckBox box : boxes)
      box.addActionListener((ActionEvent evt) ->
      { ACTION.singleSelection(box, boxes); });
  }
  
  /**
   * Initializes the layout of all the UI components
   */
  private void initLayout()
  {
    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    layout.setHorizontalGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(Alignment.LEADING)
        .addComponent(lblDateReported)
        .addComponent(lblTakenBy))
      .addGroup(layout.createParallelGroup(Alignment.LEADING)
        .addComponent(txtDateReported)
        .addComponent(txtTakenBy))
      .addGap(Integer.parseInt(MANAGER.getString("HORZ_GAP")))
      .addGroup(layout.createParallelGroup(Alignment.LEADING)
        .addComponent(lblDayOfWeek)
        .addComponent(lblSchool))
        .addGroup(layout.createParallelGroup(Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
          .addComponent(chkDays[0])
          .addComponent(chkDays[1])
          .addComponent(chkDays[2])
          .addComponent(chkDays[3])
          .addComponent(chkDays[4]))
        .addComponent(txtSchool))
      .addGroup(layout.createParallelGroup(Alignment.LEADING)
        .addComponent(chkDays[5]))
      .addGroup(layout.createParallelGroup(Alignment.LEADING)
        .addComponent(chkDays[6]))
      .addGap(Integer.parseInt(MANAGER.getString("HORZ_GAP")))
      .addGroup(layout.createParallelGroup(Alignment.LEADING)
        .addComponent(lblTime)
        .addComponent(lblPosition))
        .addGroup(layout.createParallelGroup(Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtTime)
            .addComponent(chkTimes[0])
            .addComponent(chkTimes[1]))
          .addComponent(txtPosition))
      );
    
    layout.setVerticalGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(Alignment.BASELINE)
        .addComponent(lblDateReported)
        .addComponent(txtDateReported)
        .addComponent(lblDayOfWeek)
        .addComponent(chkDays[0])
        .addComponent(chkDays[1])
        .addComponent(chkDays[2])
        .addComponent(chkDays[3])
        .addComponent(chkDays[4])
        .addComponent(chkDays[5])
        .addComponent(chkDays[6])
        .addComponent(lblTime)
        .addComponent(txtTime)
        .addComponent(chkTimes[0])
        .addComponent(chkTimes[1]))
      .addGap(Integer.parseInt(MANAGER.getString("VERT_GAP")))
      .addGroup(layout.createParallelGroup(Alignment.BASELINE)
        .addComponent(lblTakenBy)
        .addComponent(txtTakenBy)
        .addComponent(lblSchool)
        .addComponent(txtSchool)
        .addComponent(lblPosition)
        .addComponent(txtPosition))
      );
  }
  
  /**
   * Gets the date of the report
   * 
   * @return date of the report
   */
  public String getDateReported()
  { return txtDateReported.getText(); }
  
  /**
   * Sets the date of the report
   * 
   * @param dateReported  date of the report
   */
  public void setDateReported(String dateReported)
  { txtDateReported.setText(dateReported); }
  
  /**
   * Gets the day of the report
   * 
   * @return day of the report
   */
  public String getDayOfWeek()
  {
    for (JCheckBox day : chkDays)
      if (day.isSelected())
        return day.getText();
    
    return null;
  }
  
  /**
   * Sets the day of the report
   * 
   * @param dayOfWeek day of the report
   */
  public void setDayOfWeek(String dayOfWeek)
  {     
    for (JCheckBox day : chkDays)
      if (day.getText().equals(dayOfWeek))
        day.setSelected(true);
  }
  
  /**
   * Gets the time of the report
   * 
   * @return time of the report
   */
  public String getTime()
  { return txtTime.getText(); }
  
  /**
   * Sets the time of the report
   * 
   * @param time  time of the report
   */
  public void setTime(String time)
  { txtTime.setText(time); }
  
  /**
   * Gets time of day (AM/PM) of the report
   * 
   * @return time of day of the report
   */
  public String getTimeOfDay()
  {
    for (JCheckBox time : chkTimes)
      if (time.isSelected())
        return time.getText();
    
    return null;
  }
  
  /**
   * Sets time of day (AM/PM) of the report
   * 
   * @param timeOfDay  time of day of the report
   */
  public void setTimeOfDay(String timeOfDay)
  {
    for (JCheckBox time : chkTimes)
      if (time.getText().equals(timeOfDay))
        time.setSelected(true);
  }
  
  /**
   * Gets who the report was taken by
   * 
   * @return who the report was taken by
   */
  public String getTakenBy()
  { return txtTakenBy.getText(); }
  
  /**
   * Sets who the report was taken by
   * 
   * @param takenBy who took the report
   */
  public void setTakenBy(String takenBy)
  { txtTakenBy.setText(takenBy); }
  
  /**
   * Gets the school in which the report was filed
   * 
   * @return school in which the report was filed
   */
  public String getSchool()
  { return txtSchool.getText(); }
  
  /**
   * Sets the school in which the report was filed
   * 
   * @param school  school in which the report was filed
   */
  public void setSchool(String school)
  { txtSchool.setText(school); }
  
  /**
   * Get the position of the person who filed the report
   * 
   * @return position of the person who filed the report
   */
  public String getPosition()
  { return txtPosition.getText(); }
  
  /**
   * Sets the position of the person who filed the report
   * 
   * @param position  position of the person who filed the report
   */
  public void setPosition(String position)
  { txtPosition.setText(position); }
  
  /**
   * Enables all editable fields
   */
  public void enableView()
  {
    JTextField[] textFields = {txtDateReported, txtTime, txtTakenBy, txtSchool,
                               txtPosition};
    
    for (JTextField field : textFields)
      field.setEditable(true);
    
    for (JCheckBox box : chkDays)
      box.setEnabled(true);
    
    for (JCheckBox box : chkTimes)
      box.setEnabled(true);
  }
  
  /**
   * Disables all editable fields
   */
  public void disableView()
  { 
    JTextField[] textFields = {txtDateReported, txtTime, txtTakenBy, txtSchool,
                               txtPosition};
    
    for (JTextField field : textFields)
      field.setEditable(false);
    
    for (JCheckBox box : chkDays)
      box.setEnabled(false);
    
    for (JCheckBox box : chkTimes)
      box.setEnabled(false);
  }
  
  // Variables
  private static final V_Intake SINGLETON;
  private final ResMgr_Intake MANAGER = ResMgr_Intake.instance();
  private final F_Component FACTORY = F_Component.instance();
  private final ActionListeners ACTION = ActionListeners.instance();
  private JLabel lblDateReported;
  private JLabel lblDayOfWeek;
  private JLabel lblTime;
  private JLabel lblTakenBy;
  private JLabel lblSchool;
  private JLabel lblPosition;
  private JTextField txtDateReported;
  private JTextField txtTime;
  private JTextField txtTakenBy;
  private JTextField txtSchool;
  private JTextField txtPosition;
  private final JCheckBox chkDays[];
  private final JCheckBox chkTimes[];
}
