package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class k extends d {
    public static ChangeQuickRedirect a;

    public k(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3c239223e235e3ea69bf0fd4eac822", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3c239223e235e3ea69bf0fd4eac822");
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public List<CombineLabel> getBottomLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8d7fca94dfb2d9ef12bccf56568e36", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8d7fca94dfb2d9ef12bccf56568e36");
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) this.h.getBottomLabels())) {
            return null;
        }
        return com.meituan.android.pay.common.promotion.utils.a.c(new ArrayList(this.h.getBottomLabels()));
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void a(@Nullable String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8d4a1cd24d371f4b1a5d5b422ac565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8d4a1cd24d371f4b1a5d5b422ac565");
        } else {
            this.d.setVisibility(8);
        }
    }

    private String getBankNameExtText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5409bfbc28b188ea2af4061573cbe4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5409bfbc28b188ea2af4061573cbe4");
        }
        MTPayment mTPayment = this.h instanceof MTPayment ? (MTPayment) this.h : null;
        return (mTPayment == null || mTPayment.getCardInfo() == null) ? "" : mTPayment.getCardInfo().getNameExt();
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public String getNameText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f61c02920c9b34953e111dc26fd656", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f61c02920c9b34953e111dc26fd656");
        }
        return this.h.getName() + getBankNameExtText();
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431ca5d5f45408c451c6f70d0f36638b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431ca5d5f45408c451c6f70d0f36638b");
        } else {
            this.c.setVisibility(4);
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a72abfe8418f58bb1f2024fa4740a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a72abfe8418f58bb1f2024fa4740a6");
        } else {
            this.k.setVisibility(8);
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void b() {
        BigDecimal a2;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c301f998da59cea0d803d47639c56fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c301f998da59cea0d803d47639c56fa");
            return;
        }
        PaymentReduce paymentReduce = this.h.getPaymentReduce();
        Object[] objArr2 = {paymentReduce};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.common.promotion.utils.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0defcdd29960b61f104556d23a2180f1", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (BigDecimal) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0defcdd29960b61f104556d23a2180f1");
        } else {
            BigDecimal a3 = com.meituan.android.paybase.utils.d.a("0.00");
            a2 = (paymentReduce == null || paymentReduce.getNoBalanceReduceInfo() == null) ? a3 : com.meituan.android.paybase.utils.d.a(Float.valueOf(paymentReduce.getNoBalanceReduceInfo().getOrderMaxReduceMoney()), a3);
        }
        if (a2 == null || com.meituan.android.paybase.utils.d.c(a2, Double.valueOf(0.01d)) < 0) {
            this.l.setVisibility(8);
            return;
        }
        this.l.setVisibility(0);
        this.l.setTextColor(ContextCompat.getColor(getContext(), R.color.paybase__bubble_label));
        TextView textView = this.l;
        float floatValue = a2.floatValue();
        Object[] objArr3 = {Float.valueOf(floatValue)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75376d5982eb06a8eec55ab805ff6d63", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75376d5982eb06a8eec55ab805ff6d63");
        } else {
            float floatValue2 = new BigDecimal(floatValue).setScale(2, 4).floatValue();
            str = "-¥" + String.format("%.2f", Float.valueOf(floatValue2));
        }
        textView.setText(str);
    }
}
