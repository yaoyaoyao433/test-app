package com.meituan.android.pay.common.payment.data;

import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface e {
    String getExceedDesc();

    Icon getIcon();

    String getName();

    String getPayType();

    PaymentReduce getPaymentReduce();

    int getStatus();

    String getStatusInfo();

    boolean isSelected();
}
