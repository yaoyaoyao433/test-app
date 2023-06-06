package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private Material c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public j(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3a997eaabc2bcd8baaa3761a03c3b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3a997eaabc2bcd8baaa3761a03c3b5");
        }
    }

    public final void a(Material material) {
        Object[] objArr = {material};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a9f1f17c755bad65f18715762cd9a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a9f1f17c755bad65f18715762cd9a2");
            return;
        }
        this.c = material;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeaef9c1eda56400674589b17c859a52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeaef9c1eda56400674589b17c859a52");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__save_money_detail, this);
        this.b = (TextView) inflate.findViewById(R.id.mpay__detail_tips);
        inflate.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.pay.desk.payment.view.j.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.widgets.g
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5342949e12250476f5d7d085ff577484", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5342949e12250476f5d7d085ff577484");
                } else if (j.this.d != null) {
                    j.this.d.a();
                }
            }
        });
    }

    public final void setOnClickDiscountDetail(a aVar) {
        this.d = aVar;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e958d34d0e348b05c818600d15e2ae4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e958d34d0e348b05c818600d15e2ae4c");
        } else if (getContext() == null) {
        } else {
            String a2 = ag.a(f);
            if (this.c != null && !TextUtils.isEmpty(this.c.getComponentDiscountPromoText())) {
                this.b.setText(a(this.c.getComponentDiscountPromoText(), FloatingLayer.FLOATING_TYPE_DISCOUNT, a2));
                com.meituan.android.pay.common.analyse.b.a("b_pay_ttpiiz1t_mv", new a.c().a("floatingLayer", com.meituan.android.paybase.utils.n.a().toJson(this.c)).b, u.b(this));
            } else {
                this.b.setText(a(getContext().getString(R.string.mpay__save_money_tips), FloatingLayer.FLOATING_TYPE_DISCOUNT, a2));
            }
            this.b.setVisibility(0);
        }
    }

    private String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534c03d2f4c9d2935dba6124becc0846", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534c03d2f4c9d2935dba6124becc0846") : str.contains(str2) ? str.replace(str2, str3) : str;
    }
}
