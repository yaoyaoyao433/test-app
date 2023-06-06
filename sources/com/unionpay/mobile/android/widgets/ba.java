package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class ba extends LinearLayout {
    private String a;
    private String b;
    private String c;
    protected Context d;
    protected int e;
    protected int f;
    protected String g;
    protected String h;
    protected boolean i;
    protected String j;
    protected LinearLayout k;
    protected TextView l;
    protected RelativeLayout m;
    protected JSONObject n;
    private String o;
    private TextView p;
    private ImageView q;
    private boolean r;
    private String s;

    /* loaded from: classes6.dex */
    public interface a {
        String a();

        boolean b();

        boolean c();
    }

    public ba(Context context, JSONObject jSONObject, String str) {
        super(context);
        this.d = null;
        this.e = -16777216;
        this.f = -7829368;
        this.a = null;
        this.g = null;
        this.b = null;
        this.h = null;
        this.c = null;
        this.o = null;
        this.i = false;
        this.j = null;
        this.p = null;
        this.k = null;
        this.l = null;
        this.q = null;
        this.m = null;
        this.r = false;
        this.s = "uppay";
        this.n = jSONObject;
        this.d = context;
        this.h = com.unionpay.mobile.android.utils.j.a(jSONObject, "label");
        this.o = com.unionpay.mobile.android.utils.j.a(jSONObject, ReactTextInputShadowNode.PROP_PLACEHOLDER);
        this.c = com.unionpay.mobile.android.utils.j.a(jSONObject, "tip");
        this.a = com.unionpay.mobile.android.utils.j.a(jSONObject, "name");
        this.g = com.unionpay.mobile.android.utils.j.a(jSONObject, "value");
        this.b = com.unionpay.mobile.android.utils.j.a(jSONObject, "type");
        this.j = com.unionpay.mobile.android.utils.j.a(jSONObject, "regexp");
        String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "readonly");
        if (a2 != null && a2.equalsIgnoreCase("true")) {
            this.i = true;
        }
        this.r = com.unionpay.mobile.android.utils.j.a(jSONObject, "margin").length() > 0;
        this.s = str;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(0);
        setOrientation(1);
        setPadding(2, 2, 2, 2);
        if (this.b.equalsIgnoreCase("string")) {
            g();
            return;
        }
        if (!a(this, this.h)) {
            this.p = new TextView(this.d);
            this.p.setTextSize(20.0f);
            this.p.setText("");
            this.p.setTextColor(this.e);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.leftMargin = com.unionpay.mobile.android.global.a.f;
            addView(this.p, layoutParams);
            if (this.h != null && this.h.length() != 0) {
                this.p.setText(this.h);
            }
            this.p.setVisibility(8);
        }
        g();
        if (b_()) {
            return;
        }
        this.k = new LinearLayout(this.d);
        this.k.setBackgroundColor(-267336);
        addView(this.k, new LinearLayout.LayoutParams(-1, -2));
        this.l = new TextView(this.d);
        this.l.setTextSize(15.0f);
        this.l.setTextColor(this.f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int a3 = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams2.rightMargin = a3;
        layoutParams2.leftMargin = a3;
        int a4 = com.unionpay.mobile.android.utils.g.a(this.d, 5.0f);
        layoutParams2.bottomMargin = a4;
        layoutParams2.topMargin = a4;
        this.k.addView(this.l, layoutParams2);
        if (this.c == null || this.c.length() <= 0) {
            this.k.setVisibility(8);
            this.q.setVisibility(8);
            return;
        }
        this.q.setVisibility(0);
        this.l.setText(this.c);
    }

    private void g() {
        FrameLayout frameLayout = new FrameLayout(this.d);
        addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        this.m = new RelativeLayout(this.d);
        frameLayout.addView(this.m, new FrameLayout.LayoutParams(-1, -2));
        this.q = new ImageView(this.d);
        this.q.setBackgroundDrawable(com.unionpay.mobile.android.resource.c.a(this.d).a(1038, -1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.unionpay.mobile.android.utils.g.a(this.d, 10.0f), com.unionpay.mobile.android.utils.g.a(this.d, 5.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 20.0f);
        this.q.setVisibility(8);
        frameLayout.addView(this.q, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.p == null || charSequence.length() <= 0) {
            return;
        }
        this.p.setText(charSequence, bufferType);
    }

    protected boolean a(LinearLayout linearLayout, String str) {
        return false;
    }

    public boolean a(String str) {
        return str == null || str.length() == 0;
    }

    protected boolean b_() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(String str) {
        if (this.l == null || str == null || str.length() <= 0) {
            return;
        }
        this.l.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return "_input_method";
    }

    public boolean f() {
        return true;
    }

    public String i() {
        return this.g;
    }

    public final String n() {
        return this.a;
    }

    public final String o() {
        return this.b;
    }

    public final String p() {
        return this.h;
    }

    public final String q() {
        return this.c;
    }

    public final String r() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String s() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        if (this.p != null) {
            this.p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        if (this.l != null) {
            this.l.setVisibility(0);
            this.q.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        if (this.p != null) {
            this.p.setTextSize(16.0f);
        }
    }
}
