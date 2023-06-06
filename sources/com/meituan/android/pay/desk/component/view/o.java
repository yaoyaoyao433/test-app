package com.meituan.android.pay.desk.component.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.desk.component.data.Price;
import com.meituan.android.paybase.utils.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    private DeskData b;
    private LinearLayout c;

    public o(LinearLayout linearLayout, DeskData deskData) {
        Object[] objArr = {linearLayout, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc8ac418a37775eec5efbbbb679d6318", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc8ac418a37775eec5efbbbb679d6318");
            return;
        }
        this.b = deskData;
        this.c = linearLayout;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f7b60362ebf93012b9b0450350ee577", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f7b60362ebf93012b9b0450350ee577")).booleanValue() : com.meituan.android.pay.desk.component.data.a.a(this.b) != null;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23e3dab7b5883ce9ed5aebf110457c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23e3dab7b5883ce9ed5aebf110457c7");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_order_price), (int) R.layout.paycommon__price_layout);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a38941db2ef0d89e983668c94876ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a38941db2ef0d89e983668c94876ed2");
            return;
        }
        Price a2 = com.meituan.android.pay.desk.component.data.a.a(this.b);
        if (this.c == null || this.c.getContext() == null) {
            return;
        }
        Context context = this.c.getContext();
        if (a2.getOrderPrice() < 0.0f) {
            this.c.findViewById(R.id.price_container).setVisibility(8);
            return;
        }
        this.c.findViewById(R.id.price_container).setVisibility(0);
        TextView textView = (TextView) this.c.findViewById(R.id.order_price);
        TextView textView2 = (TextView) this.c.findViewById(R.id.real_price);
        Typeface a3 = com.meituan.android.paybase.utils.m.a(context);
        if (a3 != null) {
            textView2.setTypeface(a3);
            ((TextView) this.c.findViewById(R.id.money_symbol)).setTypeface(a3);
        }
        if (com.meituan.android.paybase.utils.d.c(Float.valueOf(a2.getRealPrice()), Float.valueOf(a2.getOrderPrice())) < 0) {
            String str = context.getString(R.string.mpay__money_prefix) + ag.a(a2.getOrderPrice());
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 34);
            textView.setText(spannableString);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        textView2.setVisibility(0);
        textView2.setText(ag.a(a2.getRealPrice()));
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c402e1225b02f6a4a721e1f296c5a517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c402e1225b02f6a4a721e1f296c5a517");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_order_price));
        }
    }
}
