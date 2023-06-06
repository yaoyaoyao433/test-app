package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private FloatingLayer d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c2d57311b7530e374df91ef42a9ec1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c2d57311b7530e374df91ef42a9ec1");
        }
    }

    public final void a(FloatingLayer floatingLayer) {
        Object[] objArr = {floatingLayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782e457e4b86bcff1d379aec8baae81b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782e457e4b86bcff1d379aec8baae81b");
            return;
        }
        this.d = floatingLayer;
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58541e31ab18be8a54b68aa340edbb6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58541e31ab18be8a54b68aa340edbb6c");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__discount_detail, this);
        this.b = (TextView) inflate.findViewById(R.id.mpay__detail_tips);
        this.c = (TextView) inflate.findViewById(R.id.mpay__detail_rule);
        String string = getContext().getString(R.string.mpay__pay_discount_rule_default_text);
        if (this.d != null && !TextUtils.isEmpty(this.d.getSecondContent())) {
            string = this.d.getSecondContent();
        }
        this.c.setText(string);
        this.c.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.pay.desk.payment.view.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.widgets.g
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae89f6842ccf15ffdfe44a6c18d0ce6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae89f6842ccf15ffdfe44a6c18d0ce6b");
                } else if (g.this.e != null) {
                    g.this.e.a();
                }
            }
        });
    }

    public final void setOnClickDiscountDetail(a aVar) {
        this.e = aVar;
    }

    public final void a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc1253432f0bfbd17e4675a44e6af94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc1253432f0bfbd17e4675a44e6af94");
        } else if (getContext() == null) {
        } else {
            String a2 = ag.a(f);
            if (this.d != null) {
                if (!TextUtils.isEmpty(this.d.getFirstContent())) {
                    this.b.setText(a(this.d.getFirstContent(), FloatingLayer.FLOATING_TYPE_DISCOUNT, a2, FloatingLayer.FLOATING_TYPE_REWARD, String.valueOf(i)));
                    this.b.setVisibility(0);
                } else {
                    this.b.setVisibility(8);
                }
                if (!TextUtils.isEmpty(this.d.getSecondContent())) {
                    this.c.setVisibility(0);
                    this.c.setText(this.d.getSecondContent());
                } else {
                    this.c.setVisibility(8);
                }
                com.meituan.android.pay.common.analyse.b.a("b_pay_ttpiiz1t_mv", new a.c().a("floatingLayer", com.meituan.android.paybase.utils.n.a().toJson(this.d)).b, getUniqueId());
                return;
            }
            String string = getContext().getString(R.string.mpay__discount_tips);
            TextView textView = this.b;
            textView.setText(String.format(string, getContext().getString(R.string.mpay__money_prefix) + a2));
        }
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4517fce02bf35fd77599350aaac11890", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4517fce02bf35fd77599350aaac11890") : u.b(this);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71d8ebc4a7f3be3d8f8a59ae0b22b8c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71d8ebc4a7f3be3d8f8a59ae0b22b8c") : !TextUtils.isEmpty(str) ? a(a(str, str2, str3), str4, str5) : str;
    }

    private String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66bae317a69306a184d376ffdce55f5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66bae317a69306a184d376ffdce55f5") : str.contains(str2) ? str.replace(str2, str3) : str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd785f453bcd60b5a41d59dc30afbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd785f453bcd60b5a41d59dc30afbab");
        } else {
            this.c.setVisibility(8);
        }
    }

    public final void setAllViewVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72ba3d43c7ce748a027cb325dcf1896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72ba3d43c7ce748a027cb325dcf1896");
            return;
        }
        setVisibility(i);
        this.c.setVisibility(i);
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {0, Integer.valueOf(i2), 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ee8882c2a21098d097d6e70a76e1ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ee8882c2a21098d097d6e70a76e1ef");
        } else {
            ((LinearLayout) findViewById(R.id.mpay__discount_detail_container)).setPadding(0, i2, 0, 0);
        }
    }
}
