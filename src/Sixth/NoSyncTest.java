package Sixth;

class Bank {
    // Critical Section(크리티컬 섹션)
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    // 3000 * 1000 = 300 0000
    public void saveMoney(int save) {
        for(int i = 0; i < 1000; i++) {
            int m = this.getMoney();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.money = m + save;
            System.out.println("현재금액(save): " + this.money);
        }
    }

    // 1000 * 1000 = -100 0000
    public void useMoney(int minus) {
        for(int i = 0; i < 1000; i++) {
            int m = this.getMoney();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.money = m - minus;
            System.out.println("현재금액(use): " + this.money);
        }
    }
}

class A extends Thread {
    public void run() {
        NoSyncTest.myPrivateBank.saveMoney(3000);
        System.out.println("saveMoney(3000): " +
                NoSyncTest.myPrivateBank.getMoney());
    }
}

class B extends Thread {
    public void run() {
        NoSyncTest.myPrivateBank.useMoney(1000);
        System.out.println("useMoney(1000): " +
                NoSyncTest.myPrivateBank.getMoney());
    }
}

public class NoSyncTest {
    public static Bank myPrivateBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금: " +
                myPrivateBank.getMoney());

        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
