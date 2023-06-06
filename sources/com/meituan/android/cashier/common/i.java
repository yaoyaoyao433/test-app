package com.meituan.android.cashier.common;

import com.meituan.android.cashier.common.CashierTypeConstant;
import com.meituan.android.cashier.common.ProductTypeConstant;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface i extends p {
    void a(Promotion promotion);

    void a(@CashierTypeConstant.CashierType String str, @CashierTypeConstant.CashierType String str2, String str3);

    void b(@CashierTypeConstant.CashierType String str, @ProductTypeConstant.ProductType String str2, String str3);

    void c(String str);

    void j();
}
