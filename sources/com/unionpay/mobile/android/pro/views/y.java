package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.nocard.views.bh;
import com.unionpay.mobile.android.upviews.a;
import com.unionpay.mobile.android.widgets.ay;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class y extends com.unionpay.mobile.android.nocard.views.b implements Handler.Callback, a.b {
    private com.unionpay.mobile.android.upviews.a A;
    private String B;
    private boolean C;
    private Handler D;
    private View.OnClickListener E;
    private View.OnClickListener F;
    private View.OnClickListener G;
    private View.OnClickListener H;
    private View.OnClickListener I;
    private String r;
    private int s;
    private int t;
    private int u;
    private int v;
    private com.unionpay.mobile.android.upwidget.a w;
    private com.unionpay.mobile.android.upwidget.a x;
    private TextView y;
    private com.unionpay.mobile.android.upviews.a z;

    public y(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context, eVar);
        this.r = "00";
        this.s = 0;
        this.t = 0;
        this.u = 20;
        this.v = 5;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.C = false;
        this.D = null;
        this.E = new z(this);
        this.F = new aa(this);
        this.G = new ab(this);
        this.H = new ac(this);
        this.I = new ae(this);
        this.f = 6;
        this.q = "sdpay";
        this.D = new Handler(this);
        this.C = this.a.K;
        setBackgroundColor(-1052684);
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String C(y yVar) {
        a.C1512a b;
        String str = "";
        if (yVar.A != null) {
            if (yVar.A.b().a()) {
                str = "" + b.b;
            }
        }
        if (yVar.z != null) {
            a.C1512a b2 = yVar.z.b();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(y yVar, com.unionpay.mobile.android.model.c cVar, String str, HashMap hashMap) {
        yVar.t = 3;
        com.unionpay.mobile.android.pro.pboc.engine.b s = yVar.s();
        if (s == null) {
            yVar.b(5);
        } else {
            new Thread(new ad(yVar, s, cVar, str, hashMap)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(y yVar, String str, String str2) {
        yVar.t = 7;
        yVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        yVar.e.c(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        this.t = 8;
        if (TextUtils.isEmpty(str2)) {
            this.e.c(str, "");
        } else {
            this.e.a(str, "\"uuid\":\"" + str2 + CommonConstant.Symbol.DOUBLE_QUOTES, 10);
        }
        this.v--;
    }

    private void f(int i) {
        this.t = 4;
        this.s = i;
        this.e.a(SearchIntents.EXTRA_QUERY, this.a.aj, 3);
        this.u--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(y yVar, String str) {
        yVar.j = false;
        yVar.t = 3;
        yVar.e.c(bh.a(yVar.a.C), bh.c("2", "1", yVar.w != null ? yVar.w.a() : null, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashMap i(y yVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (yVar.A != null) {
            hashMap = yVar.A.c();
        }
        if (yVar.z != null) {
            HashMap<String, String> c = yVar.z.c();
            if (c != null && hashMap != null) {
                hashMap.putAll(c);
            } else if (c != null && hashMap == null) {
                return c;
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int m(y yVar) {
        yVar.v = 5;
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int z(y yVar) {
        yVar.t = 0;
        return 0;
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
        this.t = 1;
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        int i;
        this.C = false;
        switch (this.t) {
            case 1:
                i();
                this.t = 0;
                this.A.a(com.unionpay.mobile.android.global.b.p);
                return;
            case 2:
            case 5:
            default:
                return;
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
                this.u = 20;
                f(this.t);
                return;
            case 4:
                this.r = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                if (this.u > 0 && this.r.equalsIgnoreCase("01")) {
                    f(this.s);
                    return;
                }
                this.t = 0;
                if (this.r.equalsIgnoreCase("00")) {
                    i();
                    this.t = 0;
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
                    if (this.A != null) {
                        this.A.f();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.q);
                    sb.append("_succeed");
                    if (!this.a.f) {
                        d(8);
                        return;
                    }
                    this.a.I.f = "success";
                    j();
                    return;
                } else if (!this.r.equalsIgnoreCase(Constant.RECHARGE_MODE_BUSINESS_OFFICE)) {
                    if (this.u <= 0) {
                        if (this.s == 3) {
                            a(this.a.ak, true);
                            return;
                        } else {
                            a(this.a.ak);
                            return;
                        }
                    }
                    return;
                } else {
                    String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.q);
                    sb2.append("_fail");
                    String[] strArr = com.unionpay.mobile.android.utils.o.j;
                    String[] strArr2 = {this.r, a2};
                    if (this.t == 3) {
                        a(a2);
                        return;
                    }
                    af afVar = new af(this);
                    ag agVar = new ag(this);
                    if (this.a.F) {
                        this.b.a(afVar, agVar);
                        this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, a2, com.unionpay.mobile.android.languages.c.bD.W, com.unionpay.mobile.android.languages.c.bD.X);
                        return;
                    }
                    this.b.a(afVar, null);
                    this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, a2, com.unionpay.mobile.android.languages.c.bD.W);
                    return;
                }
            case 6:
                i();
                int a3 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                if (a3 != 0) {
                    b(a3);
                } else {
                    this.a.K = true;
                    if (this.a.z == null || this.a.z.length() <= 0) {
                        i = (this.a.D != null && this.a.D.length() > 0) ? 5 : 5;
                    } else {
                        i = 6;
                    }
                    d(i);
                }
                this.t = 0;
                return;
            case 7:
                i();
                JSONArray d = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                if (this.z != null) {
                    this.z.a(d);
                    return;
                }
                return;
            case 8:
                String a4 = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                if (a4 == null || !"01".equals(a4)) {
                    JSONArray d2 = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                    String a5 = com.unionpay.mobile.android.utils.j.a(jSONObject, "empty_info");
                    if (this.z != null) {
                        this.z.a(d2, a5);
                        return;
                    }
                    return;
                }
                String a6 = com.unionpay.mobile.android.utils.j.a(jSONObject, "uuid");
                if (this.v >= 0) {
                    d(this.B, a6);
                    return;
                }
                String str = com.unionpay.mobile.android.languages.c.bD.D;
                if (this.z != null) {
                    this.z.a((JSONArray) null, str);
                    return;
                }
                return;
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        if (this.y != null) {
            this.y.setEnabled(!z);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final boolean a(String str, JSONObject jSONObject) {
        this.C = false;
        return false;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        ay ayVar = new ay(getContext(), this.a.A, this);
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void c() {
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setId(linearLayout.hashCode());
        boolean z = true;
        linearLayout.setOrientation(1);
        this.m.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -2));
        JSONArray jSONArray = new JSONArray();
        if (this.p != null) {
            com.unionpay.mobile.android.model.f fVar = (com.unionpay.mobile.android.model.f) this.p;
            jSONArray.put(fVar.a(ICashierJSHandler.KEY_PROMOTION));
            jSONArray.put(fVar.a("instalment"));
            this.a.aU = fVar.a("promotion_instalment_msgbox");
        }
        if (jSONArray.length() > 0) {
            this.z = new com.unionpay.mobile.android.upviews.a(this.d, jSONArray, this, this.q);
            this.z.a(this.b, this.a.aU);
            this.z.a(this.F);
            this.z.b(this.G);
            this.z.c(this.H);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = com.unionpay.mobile.android.global.a.f;
            linearLayout.addView(this.z, layoutParams);
        }
        if (this.z != null) {
            this.z.c("instalment");
        }
        this.A = new com.unionpay.mobile.android.upviews.a(this.d, this.a.z, this.e.c(), this, this.a.aq, false, this.q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.f;
        linearLayout.addView(this.A, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(1);
        linearLayout2.setId(linearLayout2.hashCode());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, linearLayout.getId());
        layoutParams3.leftMargin = com.unionpay.mobile.android.global.a.f;
        layoutParams3.topMargin = layoutParams3.leftMargin;
        this.m.addView(linearLayout2, layoutParams3);
        if (h() || this.a.al != null || this.a.am != null) {
            if (this.a.al != null) {
                Context context = this.d;
                JSONObject jSONObject = this.a.al;
                View.OnClickListener onClickListener = this.I;
                this.x = new com.unionpay.mobile.android.upwidget.a(context, jSONObject, onClickListener, this.q + "_agree_user_protocol");
                linearLayout2.addView(this.x);
            }
            if (this.a.am != null) {
                Context context2 = this.d;
                JSONObject jSONObject2 = this.a.am;
                this.w = new com.unionpay.mobile.android.upwidget.a(context2, jSONObject2, null, this.q + "_remember_bankNO");
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.topMargin = com.unionpay.mobile.android.global.a.f;
                linearLayout2.addView(this.w, layoutParams4);
            }
        }
        this.y = new TextView(this.d);
        this.y.setText(com.unionpay.mobile.android.utils.j.a(this.a.C, "label"));
        this.y.setTextSize(com.unionpay.mobile.android.global.b.i);
        this.y.setTextColor(o());
        this.y.setGravity(17);
        TextView textView = this.y;
        if (this.A != null && !this.A.e()) {
            z = false;
        }
        textView.setEnabled(z);
        int i = com.unionpay.mobile.android.global.a.n;
        this.y.setBackgroundDrawable(this.c.a(2008, -1, -1));
        this.y.setOnClickListener(this.E);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, i);
        layoutParams5.addRule(3, linearLayout2.getId());
        layoutParams5.topMargin = com.unionpay.mobile.android.global.a.f;
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams5.rightMargin = a;
        layoutParams5.leftMargin = a;
        this.m.addView(this.y, layoutParams5);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
        this.j = false;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        String str2 = "\"card\":\"" + this.a.q.get(this.a.N).a() + CommonConstant.Symbol.DOUBLE_QUOTES;
        com.unionpay.mobile.android.utils.k.a("uppay", "cmd:" + str + ", ele:" + str2);
        this.e.c(str, str2);
        this.t = 6;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            Bundle bundle = (Bundle) message.obj;
            String string = bundle.getString("action_resp_code");
            String string2 = bundle.getString("action_resp_message");
            if (!"0000".equalsIgnoreCase(string)) {
                a(this.a.ap, false);
            } else if (string2 != null) {
                a(0, string2);
            }
            return true;
        }
        b(1);
        return true;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
        if (this.A.d()) {
            return;
        }
        if (this.a.K && this.C) {
            this.a.K = false;
            m();
            return;
        }
        this.a.K = false;
        this.a.br = false;
        a(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.d();
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
    }

    public com.unionpay.mobile.android.pro.pboc.engine.b s() {
        return null;
    }
}
