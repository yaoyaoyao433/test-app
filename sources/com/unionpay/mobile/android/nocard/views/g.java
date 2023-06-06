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
public final class g extends b implements a.b {
    private int r;
    private int s;
    private com.unionpay.mobile.android.upwidget.a t;
    private TextView u;
    private com.unionpay.mobile.android.upviews.a v;
    private boolean w;
    private boolean x;
    private View.OnClickListener y;
    private View.OnClickListener z;

    public g(Context context) {
        super(context);
        this.r = 20;
        this.s = 100;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = false;
        this.x = true;
        this.y = new h(this);
        this.z = new i(this);
        this.f = 5;
        this.q = this.a.K ? "entrust_phoneNO_change" : "entrust";
        this.x = true ^ this.a.K;
        setBackgroundColor(-1052684);
        e();
    }

    private void d(JSONObject jSONObject) {
        i();
        this.a.z = com.unionpay.mobile.android.utils.j.d(jSONObject, "rules");
        this.a.A = com.unionpay.mobile.android.utils.j.a(jSONObject, "title");
        this.a.C = com.unionpay.mobile.android.utils.j.c(jSONObject, "followrules_button");
        this.a.al = com.unionpay.mobile.android.utils.j.c(jSONObject, "service_checkbox");
        this.a.am = com.unionpay.mobile.android.utils.j.c(jSONObject, "bind_card_checkbox");
        this.a.aq = com.unionpay.mobile.android.utils.j.a(jSONObject, "pan");
        if (this.a.z == null || this.a.z.length() <= 0) {
            b(2);
            return;
        }
        if (this.v != null) {
            this.v.f();
        }
        com.unionpay.mobile.android.model.e a = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
        this.a.K = false;
        a(6, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.e.j(this.v.a("pan"));
        this.s = 104;
    }

    private void t() {
        this.s = 103;
        this.e.a(SearchIntents.EXTRA_QUERY, this.a.aj, 3);
        this.r--;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
        if (!c1512a.a()) {
            a(c1512a.b);
            return;
        }
        this.j = false;
        this.s = 101;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        com.unionpay.mobile.android.utils.k.a("uppay", "sms elements:" + c1512a.b);
        this.e.c("sms", c1512a.b);
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        this.x = false;
        switch (this.s) {
            case 101:
                this.v.a(com.unionpay.mobile.android.global.b.p);
                this.b.c();
                this.s = 100;
                return;
            case 102:
                this.a.aj = com.unionpay.mobile.android.utils.i.a(jSONObject.toString());
                if (this.a.aj == null || this.a.aj.length() <= 0) {
                    b(2);
                    return;
                }
                this.r = 20;
                t();
                return;
            case 103:
                String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg");
                if (this.r > 0 && a.equalsIgnoreCase("01")) {
                    t();
                    return;
                }
                this.s = 100;
                if (a.equalsIgnoreCase("00")) {
                    this.w = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.q);
                    sb.append("_open_succeed");
                    s();
                    return;
                }
                i();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.q);
                sb2.append("_open_fail");
                String[] strArr = com.unionpay.mobile.android.utils.o.j;
                String[] strArr2 = {a, a2};
                if (!a.equalsIgnoreCase(Constant.RECHARGE_MODE_BUSINESS_OFFICE)) {
                    if (this.r <= 0) {
                        a(this.a.ak);
                        return;
                    }
                    return;
                }
                j jVar = new j(this);
                k kVar = new k(this);
                if (this.a.F) {
                    this.b.a(jVar, kVar);
                    this.b.a(com.unionpay.mobile.android.languages.c.bD.ab, a2, com.unionpay.mobile.android.languages.c.bD.ac, com.unionpay.mobile.android.languages.c.bD.ad);
                    return;
                }
                this.b.a(jVar, null);
                this.b.a(com.unionpay.mobile.android.languages.c.bD.ab, a2, com.unionpay.mobile.android.languages.c.bD.ac);
                return;
            case 104:
                if (b(jSONObject)) {
                    return;
                }
                d(jSONObject);
                return;
            case 105:
                i();
                int a3 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                if (a3 != 0) {
                    b(a3);
                    return;
                }
                com.unionpay.mobile.android.model.e a4 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                if (this.a.z != null && this.a.z.length() > 0) {
                    a(6, a4);
                    return;
                } else if (this.a.D == null || this.a.D.length() <= 0) {
                    return;
                } else {
                    d(5);
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
    protected final boolean a(String str, JSONObject jSONObject) {
        this.x = false;
        return false;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        com.unionpay.mobile.android.widgets.ay ayVar = new com.unionpay.mobile.android.widgets.ay(getContext(), this.a.A, this);
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(String str, JSONObject jSONObject) {
        if ("init".equals(str)) {
            a(2);
        } else if ("".equals(str)) {
            d(jSONObject);
        } else {
            this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
            this.j = false;
            this.s = 105;
            this.e.c(str, "");
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void c() {
        this.o.a(this);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(1);
        linearLayout.setId(linearLayout.hashCode());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int i = com.unionpay.mobile.android.global.a.d;
        this.m.addView(linearLayout, layoutParams);
        this.v = new com.unionpay.mobile.android.upviews.a(this.d, this.a.D, this.e.c(), this, this.a.aq, true, this.q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.f;
        linearLayout.addView(this.v, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = i;
        layoutParams3.leftMargin = com.unionpay.mobile.android.global.a.f;
        layoutParams3.addRule(3, linearLayout.getId());
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        boolean z = false;
        linearLayout2.setOrientation(0);
        linearLayout2.setId(linearLayout2.hashCode());
        Context context = this.d;
        JSONObject jSONObject = this.a.al;
        View.OnClickListener onClickListener = this.z;
        this.t = new com.unionpay.mobile.android.upwidget.a(context, jSONObject, onClickListener, this.q + "_agree_user_protocol");
        linearLayout2.addView(this.t, new LinearLayout.LayoutParams(-2, -2));
        this.m.addView(linearLayout2, layoutParams3);
        this.u = new TextView(this.d);
        this.u.setText(com.unionpay.mobile.android.utils.j.a(this.a.C, "label"));
        this.u.setTextSize(com.unionpay.mobile.android.global.b.i);
        this.u.setTextColor(o());
        this.u.setGravity(17);
        int i2 = com.unionpay.mobile.android.global.a.n;
        this.u.setBackgroundDrawable(this.c.a(2008, -1, -1));
        this.u.setOnClickListener(this.y);
        this.u.setEnabled((this.v == null || this.v.e()) ? true : true);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i2);
        layoutParams4.topMargin = com.unionpay.mobile.android.global.a.f;
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams4.rightMargin = a;
        layoutParams4.leftMargin = a;
        layoutParams4.addRule(3, linearLayout2.getId());
        this.m.addView(this.u, layoutParams4);
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
        if (this.a.L) {
            a(13);
            this.a.L = false;
        } else if (this.a.K && this.x) {
            this.a.K = false;
            com.unionpay.mobile.android.nocard.utils.f.a(this.a, this.a.G);
            m();
        } else {
            this.a.K = false;
            this.a.G = null;
            a(2);
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
    }
}
