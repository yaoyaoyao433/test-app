package com.unionpay.mobile.android.nocard.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.unionpay.mobile.android.upviews.a;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class ak extends b implements a.b {
    private int r;
    private int s;
    private com.unionpay.mobile.android.upwidget.a t;
    private TextView u;
    private com.unionpay.mobile.android.upviews.a v;
    private View.OnClickListener w;
    private View.OnClickListener x;

    public ak(Context context) {
        super(context);
        this.r = 100;
        this.s = 20;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = new al(this);
        this.x = new am(this);
        this.f = 10;
        this.q = "openupgrade";
        setBackgroundColor(-1052684);
        this.k = a();
        b();
        super.d();
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int c(ak akVar) {
        akVar.r = 102;
        return 102;
    }

    private void s() {
        this.r = 103;
        StringBuilder sb = new StringBuilder();
        sb.append(this.s);
        com.unionpay.mobile.android.utils.k.c("uppay", sb.toString());
        this.e.a(SearchIntents.EXTRA_QUERY, this.a.aj, 3);
        this.s--;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
        if (!c1512a.a()) {
            a(c1512a.b);
            return;
        }
        this.j = false;
        this.r = 101;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        com.unionpay.mobile.android.utils.k.a("uppay", "sms elements:" + c1512a.b);
        this.e.c("sms", c1512a.b);
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        switch (this.r) {
            case 101:
                this.v.a(com.unionpay.mobile.android.global.b.p);
                this.b.c();
                this.r = 100;
                return;
            case 102:
                this.a.aj = com.unionpay.mobile.android.utils.i.a(jSONObject.toString());
                if (this.a.aj == null || this.a.aj.length() <= 0) {
                    b(2);
                    return;
                }
                this.s = 20;
                s();
                return;
            case 103:
                String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg");
                this.a.S = com.unionpay.mobile.android.utils.j.a(jSONObject, "open_info");
                this.a.A = com.unionpay.mobile.android.utils.j.a(jSONObject, "title");
                this.a.B = com.unionpay.mobile.android.utils.j.a(jSONObject, "succ_info");
                if (this.s > 0 && a.equalsIgnoreCase("01")) {
                    s();
                    return;
                }
                this.r = 100;
                i();
                if (a.equalsIgnoreCase("00")) {
                    d(11);
                    return;
                } else if (a.equalsIgnoreCase(Constant.RECHARGE_MODE_BUSINESS_OFFICE)) {
                    this.b.a(new an(this), null);
                    this.b.a(com.unionpay.mobile.android.languages.c.bD.ab, a2, com.unionpay.mobile.android.languages.c.bD.ac);
                    return;
                } else if (this.s <= 0) {
                    b(20);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        if (this.u != null) {
            this.u.setEnabled(!z);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        com.unionpay.mobile.android.widgets.ay ayVar = new com.unionpay.mobile.android.widgets.ay(getContext(), this.a.A, this);
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void c() {
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setBackgroundColor(-1);
        boolean z = true;
        linearLayout.setOrientation(1);
        linearLayout.setId(linearLayout.hashCode());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int i = com.unionpay.mobile.android.global.a.f;
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        this.m.addView(linearLayout, layoutParams);
        this.v = new com.unionpay.mobile.android.upviews.a(this.d, this.a.T, this.e.c(), this, this.a.aq, true, this.q);
        new LinearLayout.LayoutParams(-1, -1).topMargin = com.unionpay.mobile.android.global.a.f;
        linearLayout.addView(this.v);
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(1);
        linearLayout2.setId(linearLayout2.hashCode());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.d;
        layoutParams2.leftMargin = com.unionpay.mobile.android.global.a.d;
        layoutParams2.addRule(3, linearLayout.getId());
        this.m.addView(linearLayout2, layoutParams2);
        Context context = this.d;
        JSONObject jSONObject = this.a.al;
        View.OnClickListener onClickListener = this.x;
        this.t = new com.unionpay.mobile.android.upwidget.a(context, jSONObject, onClickListener, this.q + "_agree_user_protocol");
        linearLayout2.addView(this.t);
        this.u = new TextView(this.d);
        this.u.setText(com.unionpay.mobile.android.utils.j.a(this.a.C, "label"));
        this.u.setTextSize(com.unionpay.mobile.android.global.b.i);
        this.u.setTextColor(o());
        this.u.setGravity(17);
        int i2 = com.unionpay.mobile.android.global.a.n;
        this.u.setBackgroundDrawable(this.c.a(2008, -1, -1));
        this.u.setOnClickListener(this.w);
        TextView textView = this.u;
        if (this.v != null && !this.v.e()) {
            z = false;
        }
        textView.setEnabled(z);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i2);
        layoutParams3.topMargin = com.unionpay.mobile.android.global.a.d;
        int i3 = com.unionpay.mobile.android.global.a.d;
        layoutParams3.rightMargin = i3;
        layoutParams3.leftMargin = i3;
        layoutParams3.addRule(3, linearLayout2.getId());
        this.m.addView(this.u, layoutParams3);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
        if (this.v.d()) {
            return;
        }
        m();
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
    }
}
