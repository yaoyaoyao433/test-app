package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class ad extends z {
    private int a;
    private String b;
    private TextView c;
    private TextView o;

    public ad(Context context, int i, JSONObject jSONObject, String str) {
        this(context, i, jSONObject, str, (byte) 0);
    }

    private ad(Context context, int i, JSONObject jSONObject, String str, byte b) {
        super(context, jSONObject, str);
        this.a = 0;
        this.a = i;
        if (jSONObject != null) {
            this.b = com.unionpay.mobile.android.utils.j.a(jSONObject, "style");
        }
        RelativeLayout relativeLayout = this.m;
        LinearLayout linearLayout = new LinearLayout(this.d);
        relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        this.c = new TextView(this.d);
        this.c.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.c.setText(p());
        this.c.setGravity(3);
        this.c.setTextColor(-13421773);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 0.3f);
        layoutParams.gravity = 3;
        linearLayout.addView(this.c, layoutParams);
        this.o = new TextView(this.d);
        this.o.setGravity(16);
        this.o.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.o.setText(com.unionpay.mobile.android.data.a.a(i(), this.b));
        this.o.setPadding(0, 0, com.unionpay.mobile.android.global.a.g, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 0.7f);
        layoutParams2.gravity = 21;
        linearLayout.addView(this.o, layoutParams2);
    }

    public ad(Context context, JSONObject jSONObject, String str) {
        super(context, jSONObject, str);
        this.a = 0;
        String p = p();
        if (p != null && p.length() > 0) {
            this.c = new TextView(this.d);
            this.c.setTextSize(com.unionpay.mobile.android.global.b.k);
            this.c.setText(p());
            this.c.setTextColor(-7829368);
            addView(this.c);
        }
        String i = i();
        if (i == null || i.length() <= 0) {
            return;
        }
        this.o = new TextView(this.d);
        this.o.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.o.setTextColor(-7829368);
        this.o.setText(i());
        addView(this.o);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        return null;
    }

    public final void a(float f) {
        this.o.setTextSize(f);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return true;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean c() {
        return true;
    }

    public final void g() {
        this.o.setTextColor(-6710887);
    }
}
