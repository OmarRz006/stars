package OOP;
public class Developer {
String name;
char degree;
int eYears;

    public Developer() {
    }

    public Developer(String name, char degree, int eYears) {
        this.name = name;
        this.degree = degree;
        this.eYears = eYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDegree() {
        return degree;
    }

    public void setDegree(char degree) {
        this.degree = degree;
    }

    public int geteYears() {
        return eYears;
    }

    public void seteYears(int eYears) {
        this.eYears = eYears;
    }

    @Override
    public String toString() {
        return "Developer{" + "name=" + name + ", degree=" + degree + ", eYears=" + eYears +  "salary+"+getSalary() +'}';
    }
    public double getYearsAllowance(){
        double Ycost=0;
        if(this.eYears>=0 || this.eYears<10){
            Ycost=Ycost*10;
        }
        if(this.eYears>=10 || this.eYears<20){
            Ycost=Ycost*30;
        }
        if(this.eYears>=20){
            Ycost=Ycost*50;
        }
        return Ycost;
    }
    public double getDegreeAllowance(){
        double Dcost=0;
        switch(degree){
            case 'j':Dcost=400;break;
            case 's':Dcost=800;break;
        }
        return Dcost;
    }
    public double getSalary(){
        double SALARY=0;
        SALARY=getYearsAllowance()+getDegreeAllowance()+150;
        return SALARY;
    }
}

