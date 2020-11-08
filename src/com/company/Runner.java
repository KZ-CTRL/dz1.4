package com.company;

public class Runner extends Thread {
    private Runner doRunner;
    private Runner posleRunner;

    public Runner(String name) {
        super(name);


    }

    public void SetRunners(Runner doRunner, Runner posleRunner) {
        this.doRunner = doRunner;
        this.posleRunner = posleRunner;

    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " Берет палочку ");
            if (getName().equals("Runner5")) {
                System.out.println(getName() + " Бежит в финишь");
                sleep(500);
                System.out.println(getName() + " Бежит к " + doRunner.getName());
                sleep(500);
            }else {
                System.out.println(getName()+" Бежит к " + posleRunner.getName());
                sleep(500);
                posleRunner.start();
                posleRunner.join();

            }
            if (!getName().equals("Runner5")&& !getName().equals("Runner1")){

            System.out.println(getName()+ " Берет палочку");
                System.out.println(getName()+ " Бежит к " + doRunner.getName());
                sleep(500);
            }  if (getName().equals("Runner1")){
                System.out.println(getName()+ " Берет палочку");
            }
        } catch (Exception ignore) {

        }
    }
}

