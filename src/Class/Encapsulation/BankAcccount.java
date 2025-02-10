//package Class.Encapsulation;
//
//public class BankAccount {
//    // ✅ 1) balance를 private으로 설정하여 외부에서 직접 변경할 수 없도록 한다.
//    private int balance;
//
//    // ✅ 2) 기본 생성자 - 초기 잔액을 0으로 설정
//    public BankAccount() {
//        balance = 0;
//    }
//
//    // ✅ 3) deposit() - 입금 기능 (public)
//    public void deposit(int amount) {
//        if (isAmountValid(amount)) {
//            balance += amount;
//            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance);
//        } else {
//            System.out.println("유효하지 않은 금액입니다.");
//        }
//    }
//
//    // ✅ 4) withdraw() - 출금 기능 (public)
//    public void withdraw(int amount) {
//        if (isAmountValid(amount) && balance - amount >= 0) {
//            balance -= amount;
//            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance);
//        } else {
//            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
//        }
//    }
//
//    // ✅ 5) getBalance() - 현재 잔액 조회 기능 (public)
//    public int getBalance() {
//        return balance;
//    }
//
//    // ✅ 6) isAmountValid() - 금액이 0보다 큰지 검증하는 기능 (private)
//    private boolean isAmountValid(int amount) {
//        return amount > 0;
//    }
//}
