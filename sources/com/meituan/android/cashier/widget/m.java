package com.meituan.android.cashier.widget;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.desk.payment.view.g;
import com.meituan.android.paybase.utils.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m extends LinearLayout {
    public static ChangeQuickRedirect a;
    private com.meituan.android.pay.common.payment.data.d b;
    private TextView c;
    private TextView d;
    private TextView e;
    private g.a f;

    public m(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4e5a5097809a3db81f434eaf0d6065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4e5a5097809a3db81f434eaf0d6065");
        }
    }

    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f13f370f4f17e8b17b1fbf80019d5d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f13f370f4f17e8b17b1fbf80019d5d22");
            return;
        }
        this.b = dVar;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07141315953b435db667ab42ee0573d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07141315953b435db667ab42ee0573d6");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cashier__save_money_discount_detail, this);
        this.d = (TextView) inflate.findViewById(R.id.cashier__save_money_brand);
        this.e = (TextView) inflate.findViewById(R.id.cashier__save_money_hint);
        this.c = (TextView) inflate.findViewById(R.id.cashier__save_money_discount);
        this.c.setOnClickListener(n.a(this));
        FloatingLayer b = com.meituan.android.pay.desk.payment.discount.a.b(this.b);
        if (b != null) {
            this.d.setText(b.getFirstContent());
            this.e.setText(b.getSecondContent());
        }
        Material a2 = com.meituan.android.pay.desk.payment.discount.a.a(this.b);
        if (a2 != null) {
            this.c.setText(a2.getCheckDiscountPromoText());
        }
    }

    public static /* synthetic */ void a(m mVar, View view) {
        Object[] objArr = {mVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3131de2e262ee225eae0205412d0c9cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3131de2e262ee225eae0205412d0c9cb");
        } else if (mVar.f != null) {
            mVar.f.a();
        }
    }

    public final void a(com.meituan.android.pay.common.payment.data.d dVar, float f) {
        Object[] objArr = {dVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1310300915544147954c2ed17dc07bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1310300915544147954c2ed17dc07bbe");
        } else if (getContext() != null) {
            List<CombineLabel> c = com.meituan.android.pay.desk.payment.discount.a.c(dVar);
            String a2 = ag.a(f);
            Material a3 = com.meituan.android.pay.desk.payment.discount.a.a(dVar);
            if (a3 != null && !TextUtils.isEmpty(a3.getCheckDiscountPromoText())) {
                this.c.setText(a(a3.getCheckDiscountPromoText(), FloatingLayer.FLOATING_TYPE_DISCOUNT, a2));
            } else {
                TextView textView = this.c;
                textView.setText(CommonConstant.Symbol.MINUS + getContext().getString(R.string.mpay__money_prefix) + a2);
            }
            this.c.setTextColor(ContextCompat.getColor(getContext(), R.color.paybase__notice_text3));
            if (a(com.meituan.android.pay.common.promotion.utils.a.g(c), c)) {
                String string = (a3 == null || TextUtils.isEmpty(a3.getUncheckDiscountPromoText())) ? getContext().getString(R.string.mpay__uncheck_discount_promo_text) : a3.getUncheckDiscountPromoText();
                this.c.setTextColor(ContextCompat.getColor(getContext(), R.color.paybase__hint_text_color));
                this.c.setText(string);
            }
            FloatingLayer b = com.meituan.android.pay.desk.payment.discount.a.b(dVar);
            if (b != null && !TextUtils.isEmpty(b.getSecondContent())) {
                this.e.setText(b.getSecondContent());
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(8);
            }
            this.d.setText((b == null || TextUtils.isEmpty(b.getFirstContent())) ? getContext().getString(R.string.mpay__uncheck_discount_brand) : b.getFirstContent());
        }
    }

    private boolean a(int i, List<CombineLabel> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acbfc44bca2757bcd4d78b48a9b5f8d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acbfc44bca2757bcd4d78b48a9b5f8d7")).booleanValue() : (i == 2 && com.meituan.android.pay.common.promotion.utils.a.f(list) == 0) || (i == 1 && com.meituan.android.paybase.utils.d.c((Number) com.meituan.android.pay.common.promotion.utils.a.d(list), (Number) 0) == 0) || (i == 3 && com.meituan.android.pay.common.promotion.utils.a.f(list) == 0 && com.meituan.android.paybase.utils.d.c((Number) com.meituan.android.pay.common.promotion.utils.a.d(list), (Number) 0) == 0);
    }

    private String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c53dbfadd6dc47534f0ed8d7eaed28", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c53dbfadd6dc47534f0ed8d7eaed28") : (str == null || !str.contains(str2)) ? str : str.replace(str2, str3);
    }

    public final void setOnClickDiscountDetail(g.a aVar) {
        this.f = aVar;
    }
}
