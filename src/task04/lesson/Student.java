package task04.lesson;

class Student extends Person { //расширяет значения от Person
    String name;
    int age;
    Progress progress;

    public Student() {
        this.progress = new Progress();
    }

    void test(){
        //@TODO: реализовать логику прохождения теста
        this.progress.increment();
    }
}

