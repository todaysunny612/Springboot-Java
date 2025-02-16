package BankInfo;

public class BankClass {
    public String name;
    private int money;
    private int deposit;
    private int withdrawal;

        public BankClass (String name, int money) {
            this.name = name;
            this.money = money;
            this.deposit = 0;
            this.withdrawal = 0;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return money;
        }
        public int deposit(int amount){
            if(amount > 0){
                this.money += amount;
            }
            return amount;
        }
        public int withdrawal(int amount){
            if(amount>money){
                System.out.println("잔액 부족으로 출금할 수 없습니다.");
                return 0;
            }
            else {
                this.money -= amount;
                return amount;
            }
        }


}

