class  Student{
    String id;
    long ph;
    String name;
    int age;

    Student() {
        System.out.println("CONSTRUCTOR CREATION DONE");
    }
    Student(String i,String n,int a,long p){
        id=i;
        name=n;
        age=a;
        ph=p;
    }
    void display(){
        System.out.println(id+" "+name+" "+age+" "+ph);

    }
    public static void main(String args[]){
        Student S1= new Student("22MIC7152","RAHUL NAYAK",20,769794222);
        Student S2=new Student("22MIC7096","CH.SRI CHARAN",19,869897545);
        System.out.println(S2);
        S1.display();
        S2.display();
    }
}