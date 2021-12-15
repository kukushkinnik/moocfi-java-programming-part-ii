public class Student extends Person{
  private int studyCredit;


  public Student(String name, String adress) {
      super(name, adress);
      this.studyCredit = 0;
  }

  public void study() {
      this.studyCredit++;
  }

  public int credits(){
//      System.out.println(this.studyCredit);
      return this.studyCredit;
  }

  @Override
    public String toString() {
      return super.toString() + "\n" +"  Study credits " + this.studyCredit;
  }
}
