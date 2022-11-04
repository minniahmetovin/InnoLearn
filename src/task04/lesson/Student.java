package task04.lesson;

class Student {
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

