
package Bai3_Lab4;

public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;
    public PartTimeEmployee(String name,int age,char gender,String employerName,String dateHired,int hoursPerWeek){
        super(name,age,gender,employerName,dateHired);
        this.hoursPerWeek=hoursPerWeek;
    }
    public void sethoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek=hoursPerWeek;
    }
    public int gethoursPerWeek(){
        return this.hoursPerWeek;
    }
    @Override
    public String toString(){
        return"name"+getName()+"\t age:"+getAge()+"\tgender: "+getGender()+"\n employerName:"+getEmployerName()+"\t dateHired:"+getDateHired()+"\n hoursPerWeek"+hoursPerWeek;
    }
    
    
}
