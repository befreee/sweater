package com.example.sweater.test_;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e){
        e.execute();
    }
}



public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(()-> System.out.println("lymda!"));
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("anonim!");
            }
        });
    }
}
