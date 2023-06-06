package com.unionpay.mobile.android.nocard.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upviews.a;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class at extends b implements a.b {
    private com.unionpay.mobile.android.upviews.a A;
    private com.unionpay.mobile.android.upviews.a B;
    private boolean C;
    private boolean D;
    private String E;
    private View.OnClickListener F;
    private View.OnClickListener G;
    private View.OnClickListener H;
    private View.OnClickListener I;
    private View.OnClickListener J;
    LinearLayout r;
    private String s;
    private int t;
    private int u;
    private int v;
    private int w;
    private com.unionpay.mobile.android.upwidget.a x;
    private com.unionpay.mobile.android.upwidget.a y;
    private TextView z;

    public at(Context context) {
        this(context, null);
    }

    public at(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context, eVar);
        this.s = "00";
        this.t = 0;
        this.u = 0;
        this.v = 20;
        this.w = 5;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        this.r = new LinearLayout(this.d);
        this.F = new au(this);
        this.G = new av(this);
        this.H = new aw(this);
        this.I = new ax(this);
        this.J = new ay(this);
        this.f = 6;
        this.q = this.a.K ? "bankpay_phoneNO_change" : "bankpay";
        this.D = !this.a.K;
        setBackgroundColor(-1052684);
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(at atVar, String str, String str2) {
        atVar.u = 8;
        atVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        atVar.e.c(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(at atVar, boolean z, String str) {
        atVar.j = false;
        if (z) {
            atVar.e(str);
            return;
        }
        atVar.u = 2;
        atVar.e.c(atVar.a.E, str);
    }

    private void d(String str) {
        a(str, new az(this), new ba(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        this.u = 9;
        if (TextUtils.isEmpty(str2)) {
            this.e.c(str, "");
        } else {
            this.e.a(str, "\"uuid\":\"" + str2 + CommonConstant.Symbol.DOUBLE_QUOTES, 10);
        }
        this.w--;
    }

    private static boolean d(JSONObject jSONObject) {
        return "0".equalsIgnoreCase(com.unionpay.mobile.android.utils.j.a(jSONObject, "reopen_flag"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        this.j = false;
        this.u = 3;
        this.e.c(bh.a(this.a.C), bh.c("1", "1", this.x != null ? this.x.a() : null, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int f(at atVar) {
        atVar.w = 5;
        return 5;
    }

    private void f(int i) {
        this.u = 4;
        this.t = i;
        this.e.a(SearchIntents.EXTRA_QUERY, this.a.aj, 3);
        this.v--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(at atVar) {
        atVar.a.K = true;
        atVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        atVar.j = false;
        atVar.u = 7;
        atVar.e.c("reopenrules", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int h(at atVar) {
        atVar.u = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        a.C1512a b;
        String str = "";
        if (this.B != null) {
            if (this.B.b().a()) {
                str = "" + b.b;
            }
        }
        if (this.A != null) {
            a.C1512a b2 = this.A.b();
            if (b2.a()) {
                String str2 = b2.b;
                if (TextUtils.isEmpty(str2)) {
                    return str;
                }
                if (!TextUtils.isEmpty(str)) {
                    str = str + CommonConstant.Symbol.COMMA;
                }
                return str + str2;
            }
            return str;
        }
        return str;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
        if (!c1512a.a()) {
            a(c1512a.b);
            return;
        }
        com.unionpay.mobile.android.utils.k.a("uppay", "sms elements:" + c1512a.b);
        this.j = false;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        this.e.c("sms", c1512a.b);
        this.u = 1;
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        this.D = false;
        int i = this.u;
        if (i == 16) {
            if (this.b.a()) {
                this.b.c();
            }
            new JSONObject();
            if (TextUtils.isEmpty(com.unionpay.mobile.android.utils.j.a(jSONObject, "instalment_empty_info"))) {
                jSONObject = com.unionpay.mobile.android.utils.j.c(jSONObject, "instalment");
            }
            this.A.a(jSONObject);
            this.u = 0;
            return;
        }
        switch (i) {
            case 1:
                i();
                this.u = 0;
                this.B.a(com.unionpay.mobile.android.global.b.p);
                return;
            case 2:
            case 3:
                this.a.aj = com.unionpay.mobile.android.utils.i.a(jSONObject.toString());
                String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "qn");
                if (!TextUtils.isEmpty(a)) {
                    this.a.n = this.e.h(com.unionpay.mobile.android.utils.c.b(a));
                }
                if (this.a.aj == null || this.a.aj.length() <= 0) {
                    b(2);
                    return;
                }
                this.v = 20;
                f(this.u);
                return;
            case 4:
                this.s = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                if (d(jSONObject)) {
                    d(com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg"));
                    return;
                } else if (this.v > 0 && this.s.equalsIgnoreCase("01")) {
                    f(this.t);
                    return;
                } else {
                    this.u = 0;
                    if (this.s.equalsIgnoreCase("00")) {
                        if (this.t == 2) {
                            this.C = true;
                            e(s());
                            return;
                        }
                        i();
                        this.u = 0;
                        this.a.H = com.unionpay.mobile.android.utils.j.d(jSONObject, "result");
                        this.a.P = com.unionpay.mobile.android.utils.j.a(jSONObject, "openupgrade_flag");
                        this.a.Q = com.unionpay.mobile.android.utils.j.a(jSONObject, "temporary_pay_flag");
                        this.a.R = com.unionpay.mobile.android.utils.j.a(jSONObject, "temporary_pay_info");
                        this.a.V = com.unionpay.mobile.android.utils.j.a(jSONObject, "front_url");
                        this.a.W = com.unionpay.mobile.android.utils.j.a(jSONObject, "front_request");
                        this.a.A = com.unionpay.mobile.android.utils.j.a(jSONObject, "title");
                        this.a.B = com.unionpay.mobile.android.utils.j.a(jSONObject, "succ_info");
                        com.unionpay.mobile.android.nocard.utils.b.b(jSONObject, this.a);
                        com.unionpay.mobile.android.nocard.utils.b.a(jSONObject, this.a);
                        if (this.B != null) {
                            this.B.f();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.q);
                        sb.append("_succeed");
                        if (!this.a.f) {
                            d(8);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.a.aQ);
                        PreferenceUtils.c(this.d, sb2.toString());
                        this.a.I.f = "success";
                        j();
                        return;
                    } else if (!this.s.equalsIgnoreCase(Constant.RECHARGE_MODE_BUSINESS_OFFICE)) {
                        if (this.v <= 0) {
                            String c = c(19);
                            if (this.a.ak != null && !TextUtils.isEmpty(this.a.ak)) {
                                c = this.a.ak;
                            }
                            if (this.t == 3) {
                                a(c, true);
                                return;
                            } else {
                                a(c);
                                return;
                            }
                        }
                        return;
                    } else {
                        String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.q);
                        sb3.append("_fail");
                        String[] strArr = com.unionpay.mobile.android.utils.o.j;
                        String[] strArr2 = {this.s, a2};
                        if (this.t == 3) {
                            a(a2);
                            return;
                        }
                        bb bbVar = new bb(this);
                        bc bcVar = new bc(this);
                        if (this.a.F) {
                            this.b.a(bbVar, bcVar);
                            this.b.a(com.unionpay.mobile.android.languages.c.bD.ab, a2, com.unionpay.mobile.android.languages.c.bD.ac, com.unionpay.mobile.android.languages.c.bD.ad);
                            return;
                        }
                        this.b.a(bbVar, null);
                        this.b.a(com.unionpay.mobile.android.languages.c.bD.ab, a2, com.unionpay.mobile.android.languages.c.bD.ac);
                        return;
                    }
                }
            default:
                switch (i) {
                    case 6:
                        i();
                        int a3 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, true);
                        if (a3 != 0) {
                            b(a3);
                        } else {
                            this.a.K = true;
                            com.unionpay.mobile.android.model.e a4 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                            if (this.a.z != null && this.a.z.length() > 0) {
                                a(6, a4);
                            } else if (this.a.D != null && this.a.D.length() > 0) {
                                d(5);
                            }
                        }
                        this.u = 0;
                        return;
                    case 7:
                        i();
                        int a5 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                        if (a5 != 0) {
                            b(a5);
                            return;
                        }
                        com.unionpay.mobile.android.model.e a6 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                        if (this.a.z != null && this.a.z.length() > 0) {
                            a(6, a6);
                            return;
                        } else if (this.a.D == null || this.a.D.length() <= 0) {
                            return;
                        } else {
                            d(5);
                            return;
                        }
                    case 8:
                        i();
                        JSONArray d = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                        if (this.A != null) {
                            this.A.a(d);
                            return;
                        }
                        return;
                    case 9:
                        String a7 = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                        if (a7 == null || !"01".equals(a7)) {
                            JSONArray d2 = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                            String a8 = com.unionpay.mobile.android.utils.j.a(jSONObject, "empty_info");
                            if (this.A != null) {
                                this.A.a(d2, a8);
                                return;
                            }
                            return;
                        }
                        String a9 = com.unionpay.mobile.android.utils.j.a(jSONObject, "uuid");
                        if (this.w >= 0) {
                            d(this.E, a9);
                            return;
                        }
                        String str = com.unionpay.mobile.android.languages.c.bD.D;
                        if (this.A != null) {
                            this.A.a((JSONArray) null, str);
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        if (this.z != null) {
            this.z.setEnabled(!z);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final boolean a(String str, JSONObject jSONObject) {
        this.D = false;
        if (this.u == 1 && d(jSONObject)) {
            d(str);
            return true;
        }
        return false;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        com.unionpay.mobile.android.widgets.ay ayVar = new com.unionpay.mobile.android.widgets.ay(getContext(), this.a.A, this);
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(int i) {
        if (this.u == 16) {
            if (this.b != null) {
                this.b.c();
            }
            com.unionpay.mobile.android.widgets.z c = this.A.c("instalment");
            if (c != null) {
                com.unionpay.mobile.android.widgets.p pVar = (com.unionpay.mobile.android.widgets.p) c;
                pVar.a(false);
                pVar.b(false);
            }
        }
        super.b(i);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void c() {
        this.m.removeAllViews();
        this.o.a(this);
        this.r.setId(this.r.hashCode());
        this.r.setOrientation(1);
        this.r.setBackgroundColor(0);
        this.m.addView(this.r, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = this.r;
        linearLayout.removeAllViews();
        JSONArray jSONArray = new JSONArray();
        if (this.p != null) {
            com.unionpay.mobile.android.model.f fVar = (com.unionpay.mobile.android.model.f) this.p;
            jSONArray.put(fVar.a(ICashierJSHandler.KEY_PROMOTION));
            jSONArray.put(fVar.a("instalment"));
            this.a.aU = fVar.a("promotion_instalment_msgbox");
        }
        if (jSONArray.length() > 0) {
            this.A = new com.unionpay.mobile.android.upviews.a(this.d, jSONArray, this, this.q);
            this.A.a(this.b, this.a.aU);
            this.A.d(this.a.bt);
            this.A.a(this.G);
            this.A.b(this.H);
            this.A.c(this.I);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = com.unionpay.mobile.android.global.a.f;
            linearLayout.addView(this.A, layoutParams);
        }
        this.B = new com.unionpay.mobile.android.upviews.a(this.d, this.a.z, this.e.c(), this, this.a.aq, true, false, this.A != null ? this.A.c("instalment") : null, this.a.ad, this.q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.f;
        linearLayout.addView(this.B, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        boolean z = true;
        linearLayout2.setOrientation(1);
        linearLayout2.setId(linearLayout2.hashCode());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, this.r.getId());
        layoutParams3.leftMargin = com.unionpay.mobile.android.global.a.f;
        layoutParams3.topMargin = layoutParams3.leftMargin;
        this.m.addView(linearLayout2, layoutParams3);
        if (h() || this.a.al != null || this.a.am != null) {
            if (this.a.al != null) {
                Context context = this.d;
                JSONObject jSONObject = this.a.al;
                View.OnClickListener onClickListener = this.J;
                this.y = new com.unionpay.mobile.android.upwidget.a(context, jSONObject, onClickListener, this.q + "_agree_user_protocol");
                linearLayout2.addView(this.y);
            }
            if (this.a.am != null) {
                Context context2 = this.d;
                JSONObject jSONObject2 = this.a.am;
                this.x = new com.unionpay.mobile.android.upwidget.a(context2, jSONObject2, null, this.q + "_remember_bankNO");
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.topMargin = com.unionpay.mobile.android.global.a.f;
                linearLayout2.addView(this.x, layoutParams4);
            }
        }
        this.z = new TextView(this.d);
        this.z.setText(com.unionpay.mobile.android.utils.j.a(this.a.C, "label"));
        this.z.setTextSize(com.unionpay.mobile.android.global.b.i);
        this.z.setTextColor(o());
        this.z.setGravity(17);
        TextView textView = this.z;
        if (this.B != null && !this.B.e()) {
            z = false;
        }
        textView.setEnabled(z);
        int i = com.unionpay.mobile.android.global.a.n;
        this.z.setBackgroundDrawable(this.c.a(2008, -1, -1));
        this.z.setOnClickListener(this.F);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, i);
        layoutParams5.addRule(3, linearLayout2.getId());
        layoutParams5.topMargin = com.unionpay.mobile.android.global.a.f;
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams5.rightMargin = a;
        layoutParams5.leftMargin = a;
        this.m.addView(this.z, layoutParams5);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
        StringBuilder sb;
        String a;
        this.j = false;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        if (h()) {
            sb = new StringBuilder("\"card\":\"");
            a = this.a.aq;
        } else {
            sb = new StringBuilder("\"card\":\"");
            a = this.a.q.get(this.a.N).a();
        }
        sb.append(a);
        sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        String sb2 = sb.toString();
        com.unionpay.mobile.android.utils.k.a("uppay", "cmd:" + str + ", ele:" + sb2);
        this.e.c(str, sb2);
        this.u = 6;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
        a(str, str2);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
        if (this.B.d()) {
            return;
        }
        if (this.a.L) {
            a(13);
            this.a.L = false;
        } else if (this.a.K && this.D) {
            this.a.K = false;
            com.unionpay.mobile.android.nocard.utils.f.a(this.a, this.a.G);
            m();
        } else {
            this.a.K = false;
            this.a.G = null;
            a(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.d();
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
        com.unionpay.mobile.android.widgets.z c;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        String str = "\"\"";
        if (this.A.c(ICashierJSHandler.KEY_PROMOTION) != null) {
            str = CommonConstant.Symbol.DOUBLE_QUOTES + ((com.unionpay.mobile.android.widgets.aj) c).g() + CommonConstant.Symbol.DOUBLE_QUOTES;
        }
        this.e.c("instalment", "\"promotion\":".concat(String.valueOf(str)));
        this.u = 16;
    }
}
