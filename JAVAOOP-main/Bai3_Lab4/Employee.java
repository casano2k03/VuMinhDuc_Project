
package Bai3_Lab4;

public class Employee extends Person {
    private String employerName;
    private String dateHired;
    public Employee(String name,int age,char gender,String employerName,String dateHired){
        super(name,age,gender);
        this.dateHired=dateHired;
        this.employerName=employerName;                
    }

    public void setEmployeeName(String employerName) {
        this.employerName = employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString(){
        return "employerName:"+employerName+"\t dateHired:"+dateHired;
    }
    
}
