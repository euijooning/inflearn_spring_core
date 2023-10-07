package inflearn.spring_core.discount;

import inflearn.spring_core.member.Grade;
import inflearn.spring_core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; // 할인율 10%


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100; // 10퍼센트
        } else {
            return 0;
        }
    }
}
