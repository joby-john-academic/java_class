
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StudentManagementSystem extends JFrame implements
ActionListener {
private JTextField nameField, genderField, courseField, rollNoField,
addressField, subject1Field, subject2Field, subject3Field,yourTotaField,
totalMarksField, gradeField;
private JButton gradeButton;
public StudentManagementSystem() {
setTitle("Student Management System");
setSize(400, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
// Creating labels
JLabel nameLabel = new JLabel("Name:");
JLabel genderLabel = new JLabel("Gender:");
JLabel courseLabel = new JLabel("Course:");
JLabel rollNoLabel = new JLabel("Roll No:");
JLabel addressLabel = new JLabel("Address:");
JLabel subject1Label = new JLabel("Subject 1 Marks:");
JLabel subject2Label = new JLabel("Subject 2 Marks:");
JLabel subject3Label = new JLabel("Subject 3 Marks:");
JLabel totalMarksLabel = new JLabel("Total Marks:");
JLabel your_total = new JLabel("Your Total Marks:");
JLabel gradeLabel = new JLabel("Grade:");
// Creating text fields
nameField = new JTextField();
genderField = new JTextField();
courseField = new JTextField();
rollNoField = new JTextField();
addressField = new JTextField();
subject1Field = new JTextField();
subject2Field = new JTextField();
subject3Field = new JTextField();
yourTotaField = new JTextField();
yourTotaField.setEditable(false);
totalMarksField = new JTextField();
gradeField = new JTextField();
gradeField.setEditable(false);
// Creating grade button
gradeButton = new JButton("Grade");
gradeButton.addActionListener(this);
// Creating layout
setLayout(new GridLayout(12, 2));
add(nameLabel);
add(nameField);
add(genderLabel);
add(genderField);
add(courseLabel);
add(courseField);
add(rollNoLabel);
add(rollNoField);
add(addressLabel);
add(addressField);
add(subject1Label);
add(subject1Field);
add(subject2Label);
add(subject2Field);
add(subject3Label);
add(subject3Field);
add(totalMarksLabel);
add(totalMarksField);
add(your_total);
add(yourTotaField);
add(gradeLabel);
add(gradeField);
add(new JLabel(""));
add(gradeButton);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == gradeButton) {
int subject1Marks = Integer.parseInt(subject1Field.getText());
int subject2Marks = Integer.parseInt(subject2Field.getText());
int subject3Marks = Integer.parseInt(subject3Field.getText());
double totalMarks = Integer.parseInt(totalMarksField.getText());
double user_total = subject1Marks+subject2Marks+subject3Marks;
yourTotaField.setText(String.valueOf(user_total));
// Assigning grades

double percentage = (user_total/ totalMarks)*100;
//System.out.println(percentage);
String grade;
if (percentage >= 90) {
grade = "A";
} else if (percentage >= 80) {
grade = "B";
} else if (percentage >= 70) {
grade = "C";
} else if (percentage >= 60) {
grade = "D";
} else {
grade = "F";
}
gradeField.setText(grade);
}
}
public static void main(String[] args) {
new StudentManagementSystem();
}}