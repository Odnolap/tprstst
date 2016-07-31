package ru.odnolap.tprstst.util;

import org.joda.time.LocalDateTime;
import ru.odnolap.tprstst.model.Payment;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Odnolap on 30.07.2016.
 */
public class PaymentUtil {

    public static final List<Payment> PAYMENT_LIST;

    static {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();

        calendar1.set(2016, Calendar.JULY, 15, 11, 23, 48);
        calendar2.set(2016, Calendar.JULY, 15, 15, 2, 26);
        calendar3.set(2016, Calendar.JULY, 16, 10, 12, 56);

        Payment p1 = new Payment("1-12", 1, new LocalDateTime(calendar1), 166d);
        Payment p2 = new Payment("4-132", 2, new LocalDateTime(calendar2), 500d);
        Payment p3 = new Payment("1-16", 1, new LocalDateTime(calendar3), 1000.5d);

        calendar1.add(Calendar.SECOND, 2);
        calendar2.add(Calendar.SECOND, 2);
        calendar3.add(Calendar.SECOND, 2);
        p1.setRegistrationTime(new LocalDateTime(calendar1));
        p2.setRegistrationTime(new LocalDateTime(calendar2));
        p3.setRegistrationTime(new LocalDateTime(calendar3));

        PAYMENT_LIST = Arrays.asList(p1, p2, p3);
    }

    public static List<Payment> getPaymentList() {
        return PAYMENT_LIST;
    }


}