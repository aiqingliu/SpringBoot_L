package com.liuaiqing.fangdai;

import org.junit.jupiter.api.Test;

public class DengEBenXi {

    @Test
    public void math() {

        double amount = 340000;// 贷款总额
        double annualRate = 0.042;// 年利率

        int periods = 12 * 15;// 还款月数

        // 计算每期还款金额
        double monthlyRate = annualRate / 12;// 月利率
        double monthlyPayment = amount * monthlyRate * Math.pow((monthlyRate + 1), periods) / (Math.pow((monthlyRate + 1), periods) - 1);

        // 计算总利息
        double totalInterest = 0;
        double balance = amount;// 还款剩余余额
        for (int i = 0; i < periods; i++) {
            double interest = balance * monthlyRate;
            double principal = monthlyPayment - interest;
            balance -= principal;
            totalInterest += interest;
            System.out.println(String.format("第%d期：还款金额%.2f,本金%.2f,利息%.2f,剩余贷款%.2f", i + 1, monthlyPayment, principal, interest, balance));
        }
        System.out.println(String.format("贷款总额 %.2f，总利息 %.2f", amount, totalInterest));
    }

    /**
     * 等额本息计算每月还款金额A
     * 贷款12万元，贷款一年，年化利率6%
     * a0 = 12
     * a1 = a0 * (1 + 0.5%) - A = a0 * r - A
     * a2 = a1 * (1 + 0.5%) - A = a1 * r - A = (a0 * r - A) * r - A = a0 * r^2 - r * A - A
     * a3 = a2 * (1 + 0.5%) - A = a2 * r - A = (a1 * r - A) * r - A = a1 * r^2 - r * A - A = (a0 * r - A) * r^2 - r * A - A = a0 * r^3 - r^2 * A - r * A - A
     * ... ...
     * a12 = a11 * (1 + 0.5%) - A = 0 = a0 * r^12 - r^11 * A - r^10 * A - r^9 * A - ... A
     * >> a0 * r^12 = r^11 * A + r^10 * A + r^9 * A + ... A = A * (r^11 + r^10 + r^9 + ... 1)
     * 等比数列求和公式
     * >> A = a0 * r^12 / (r^11 + r^10 + r^9 + ... 1)
     * >> A = a0 * r^12 / {[r^(11 + 1) - 1] / (r - 1)}
     * >> A = a0 * r^12 * (r - 1) / [r^(11 + 1) - 1]
     */
    @Test
    public void t() {
        double amount = 120000;// 贷款金额
        double annualRate = 0.005 * 12;// 年化利率
        int periods = 1 * 12;// 还款月数

        double monthlyRate = annualRate / 12;// 月利率
//        double A = amount * Math.pow((monthlyRate + 1), (periods - 1));
//        System.out.println(A);
        // 月还款金额
        double monthlyPayment = amount * monthlyRate * Math.pow((monthlyRate + 1), periods) / (Math.pow((monthlyRate + 1), periods) - 1);
        System.out.println(monthlyPayment);
    }
}
