class Employee
{
   int empid;
   String name;
   double salary;
   public Employee() {System.out.println("Emp Cons df");}
   public Employee(int empid,String name,double salary)
   {
      this.empid=empid;  this.name = name;   this.salary=salary;      
   }
   public void setEmpid(int empid) { this.empid=empid; }
   public void setName(String name) { this.name= name; }
   public void setSalary(double salary) { this.salary = salary; }
   public int getEmpid() { return empid; }
   public String getName() { return name; }
   public double getSalary() { return salary; }  
   
}

/*
  public int compareTo(Employee e)
   {
       return empid - e.empid;
   }
   public boolean equals(Object obj)
   {
       if(obj instanceof Employee)
       {
          Employee e = (Employee)obj;
          return empid==e.empid && name.equals(e.name) && salary==e.salary;
       }
       return false;
   }
   public int hashCode()
   {
      return empid;
   } 
*/

