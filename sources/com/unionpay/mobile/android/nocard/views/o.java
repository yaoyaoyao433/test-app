package com.unionpay.mobile.android.nocard.views;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upviews.a;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class o extends com.unionpay.mobile.android.nocard.views.b implements a.b {
    private int A;
    private int B;
    private com.unionpay.mobile.android.upwidget.a C;
    private com.unionpay.mobile.android.upviews.a D;
    private b E;
    private String F;
    private View.OnClickListener G;
    private View.OnClickListener H;
    private boolean I;
    LinearLayout r;
    private int s;
    private com.unionpay.mobile.android.upviews.a t;
    private View.OnClickListener u;
    private View.OnClickListener v;
    private View.OnClickListener w;
    private TextView x;
    private int y;
    private int z;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public final class b extends LinearLayout {
        private PopupWindow b;
        private com.unionpay.mobile.android.upwidget.c c;
        private com.unionpay.mobile.android.upwidget.g d;
        private String e;
        private TextView f;
        private int g;
        private final View.OnClickListener h;
        private final AdapterView.OnItemClickListener i;
        private List<Map<String, Object>> j;
        private a k;
        private String l;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, a aVar, List<Map<String, Object>> list, JSONArray jSONArray, String str) {
            super(context);
            this.g = 1;
            this.h = new ac(this);
            this.i = new ad(this);
            setOrientation(1);
            this.k = aVar;
            this.j = list;
            this.e = jSONArray;
            this.l = str;
            this.c = new com.unionpay.mobile.android.upwidget.c(o.this.d, this.j, this.e, this.l, "", this.g, 0);
            this.d = new com.unionpay.mobile.android.upwidget.g(o.this.d, this.c);
            this.d.a(this.i);
            this.d.a(this.h);
            if (list == null || list.size() <= 0) {
                return;
            }
            Drawable a = com.unionpay.mobile.android.resource.c.a(o.this.d).a(2014, -1, -1);
            RelativeLayout relativeLayout = new RelativeLayout(o.this.d);
            relativeLayout.setBackgroundDrawable(a);
            relativeLayout.setOnClickListener(new ae(this));
            addView(relativeLayout, new LinearLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n));
            ImageView imageView = new ImageView(o.this.d);
            imageView.setId(imageView.hashCode());
            imageView.setBackgroundDrawable(com.unionpay.mobile.android.resource.c.a(o.this.d).a(1002, -1, -1));
            int a2 = com.unionpay.mobile.android.utils.g.a(o.this.d, 15.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.addRule(11, -1);
            layoutParams.addRule(15, -1);
            layoutParams.rightMargin = com.unionpay.mobile.android.utils.g.a(o.this.d, 10.0f);
            relativeLayout.addView(imageView, layoutParams);
            this.f = new TextView(o.this.d);
            this.f.setTextSize(com.unionpay.mobile.android.global.b.k);
            this.f.setTextColor(-10066330);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            this.f.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f.setSingleLine(true);
            layoutParams2.leftMargin = com.unionpay.mobile.android.utils.g.a(o.this.d, 10.0f);
            layoutParams2.rightMargin = layoutParams2.leftMargin;
            layoutParams2.addRule(15, -1);
            layoutParams2.addRule(9, -1);
            layoutParams2.addRule(0, imageView.getId());
            relativeLayout.addView(this.f, layoutParams2);
            a(0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void a(b bVar, View view) {
            if (bVar.b == null) {
                bVar.b = new PopupWindow((View) bVar.d, -1, -1, true);
                bVar.b.setBackgroundDrawable(new ColorDrawable(-1342177280));
                bVar.b.update();
            }
            com.sankuai.waimai.platform.utils.p.a(bVar.b, view, 80, 0, 0);
        }

        public final void a(int i) {
            int c = i + this.c.c();
            if (this.f != null) {
                this.f.setText(this.c.b(c));
            }
        }
    }

    public o(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context, eVar);
        this.s = 0;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.r = null;
        this.y = 0;
        this.z = 0;
        this.A = 20;
        this.B = 5;
        this.C = null;
        this.D = null;
        this.G = new p(this);
        this.H = new u(this);
        this.I = false;
        this.f = 13;
        this.q = this.a.K ? "loginpay_phoneNO_change" : "loginpay";
        this.u = new v(this);
        this.v = new w(this);
        this.w = new x(this);
        if (!p() && !t() && !this.a.aZ) {
            this.I = true;
        }
        setBackgroundColor(-1052684);
        e();
        if (this.a.aF != null) {
            c((JSONObject) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int a(o oVar) {
        oVar.B = 5;
        return 5;
    }

    private void a(LinearLayout linearLayout) {
        JSONArray jSONArray = this.a.ac;
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            com.unionpay.mobile.android.widgets.z a2 = a((JSONObject) com.unionpay.mobile.android.utils.j.b(jSONArray, i), this.q);
            if (a2 != null) {
                linearLayout.addView(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(o oVar, int i) {
        if (oVar.a.ab != null && i == oVar.a.ab.size()) {
            oVar.a.aZ = true;
            oVar.I = true;
            oVar.d(13);
            return;
        }
        String[] strArr = com.unionpay.mobile.android.utils.o.f;
        new Object[1][0] = Integer.valueOf(i);
        oVar.I = false;
        oVar.z = oVar.y;
        oVar.y = i;
        String a2 = oVar.a.ab.get(i).a();
        oVar.j = false;
        oVar.s = 1;
        oVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        oVar.e.i(bh.a("1", a2, "1", "2"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(o oVar, String str, String str2) {
        oVar.s = 8;
        oVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        oVar.e.c(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(o oVar, String str) {
        oVar.j = false;
        oVar.s = 3;
        oVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        oVar.e.a("1", "2", "yes", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        this.s = 9;
        if (TextUtils.isEmpty(str2)) {
            this.e.c(str, "");
        } else {
            this.e.a(str, "\"uuid\":\"" + str2 + CommonConstant.Symbol.DOUBLE_QUOTES, 10);
        }
        this.B--;
    }

    private void d(JSONObject jSONObject) {
        boolean z = false;
        int a2 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
        if (a2 != 0) {
            b(a2);
            if (1 == this.s) {
                f(this.z);
                return;
            }
            return;
        }
        com.unionpay.mobile.android.model.e a3 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
        if (5 == this.s) {
            if (this.a.z != null && this.a.z.length() > 0) {
                a(6, a3);
                return;
            } else if (this.a.D == null || this.a.D.length() <= 0) {
                return;
            } else {
                d(5);
                return;
            }
        }
        this.p = a3;
        f(this.y);
        this.D.a(s(), this.a.aq, true, null, this.a.ad, this.q);
        this.D.a(this.G);
        this.D.b(this.H);
        this.D.a(this.b, this.a.aU);
        this.D.d(this.a.bt);
        this.t.a(this.a.z, this.a.aq, true, this.D != null ? this.D.c("instalment") : null, this.a.ad, this.q);
        this.x.setEnabled((this.t == null || this.t.e()) ? true : true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(o oVar) {
        if (oVar.t != null) {
            a.C1512a b2 = oVar.t.b();
            if (!b2.a()) {
                oVar.a(b2.b);
                return;
            }
            oVar.j = false;
            oVar.s = 5;
            oVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
            oVar.e.c("bindcardrules", b2.b);
        }
    }

    private void f(int i) {
        this.y = i;
        this.E.a(this.y);
    }

    private JSONArray s() {
        JSONArray jSONArray = new JSONArray();
        if (this.p != null) {
            com.unionpay.mobile.android.model.f fVar = (com.unionpay.mobile.android.model.f) this.p;
            jSONArray.put(fVar.a(ICashierJSHandler.KEY_PROMOTION));
            jSONArray.put(fVar.a("instalment"));
            this.a.aU = fVar.a("promotion_instalment_msgbox");
        }
        return jSONArray;
    }

    private final boolean t() {
        return (this.a.aZ || this.a.ab == null || this.a.ab.size() <= 0) ? false : true;
    }

    private void u() {
        this.s = 4;
        this.e.a(SearchIntents.EXTRA_QUERY, this.a.aj, 3);
        this.A--;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
        this.t.d();
        if (!c1512a.a()) {
            a(c1512a.b);
            return;
        }
        this.j = false;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        this.e.c("sms", c1512a.b);
        this.s = 2;
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        int i = this.s;
        if (i == 16) {
            if (this.b.a()) {
                this.b.c();
            }
            new JSONObject();
            if (TextUtils.isEmpty(com.unionpay.mobile.android.utils.j.a(jSONObject, "instalment_empty_info"))) {
                jSONObject = com.unionpay.mobile.android.utils.j.c(jSONObject, "instalment");
            }
            this.D.a(jSONObject);
            this.s = 0;
            return;
        }
        switch (i) {
            case 1:
            case 5:
                i();
                if (b(jSONObject)) {
                    return;
                }
                if (this.s == 5) {
                    this.a.L = true;
                }
                d(jSONObject);
                return;
            case 2:
                i();
                this.t.a(com.unionpay.mobile.android.global.b.p);
                return;
            case 3:
                this.a.aj = com.unionpay.mobile.android.utils.i.a(jSONObject.toString());
                String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "qn");
                if (!TextUtils.isEmpty(a2)) {
                    this.a.n = this.e.h(com.unionpay.mobile.android.utils.c.b(a2));
                }
                if (this.a.aj == null) {
                    b(2);
                    return;
                }
                this.A = 20;
                u();
                return;
            case 4:
                String a3 = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                if (this.A > 0 && a3.equalsIgnoreCase("01")) {
                    u();
                    return;
                }
                i();
                if (!a3.equalsIgnoreCase("00")) {
                    if (!a3.equalsIgnoreCase(Constant.RECHARGE_MODE_BUSINESS_OFFICE)) {
                        if (this.A <= 0) {
                            b(19);
                            return;
                        }
                        return;
                    }
                    String a4 = com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.q);
                    sb.append("_fail");
                    String[] strArr = com.unionpay.mobile.android.utils.o.j;
                    String[] strArr2 = {a3, a4};
                    a(a4);
                    return;
                }
                this.s = 0;
                this.a.H = com.unionpay.mobile.android.utils.j.d(jSONObject, "result");
                this.a.P = com.unionpay.mobile.android.utils.j.a(jSONObject, "openupgrade_flag");
                this.a.Q = com.unionpay.mobile.android.utils.j.a(jSONObject, "temporary_pay_flag");
                this.a.R = com.unionpay.mobile.android.utils.j.a(jSONObject, "temporary_pay_info");
                this.a.V = com.unionpay.mobile.android.utils.j.a(jSONObject, "front_url");
                this.a.W = com.unionpay.mobile.android.utils.j.a(jSONObject, "front_request");
                this.a.A = com.unionpay.mobile.android.utils.j.a(jSONObject, "title");
                this.a.B = com.unionpay.mobile.android.utils.j.a(jSONObject, "succ_info");
                com.unionpay.mobile.android.nocard.utils.b.a(jSONObject, this.a);
                com.unionpay.mobile.android.nocard.utils.b.b(jSONObject, this.a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.q);
                sb2.append("_succeed");
                if (!this.a.f) {
                    d(8);
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.a.aQ);
                PreferenceUtils.c(this.d, sb3.toString());
                this.a.I.f = "success";
                j();
                return;
            case 6:
                i();
                int a5 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, true);
                if (a5 != 0) {
                    b(a5);
                } else {
                    this.a.K = true;
                    com.unionpay.mobile.android.model.e a6 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                    if (this.a.z != null && this.a.z.length() > 0) {
                        a(6, a6);
                    } else if (this.a.D != null && this.a.D.length() > 0) {
                        d(5);
                    }
                }
                this.s = 0;
                return;
            case 7:
                i();
                int a7 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                if (a7 != 0) {
                    b(a7);
                    return;
                }
                com.unionpay.mobile.android.model.e a8 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                if (this.a.z != null && this.a.z.length() > 0) {
                    a(6, a8);
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
                if (this.D != null) {
                    this.D.a(d);
                    return;
                }
                return;
            case 9:
                String a9 = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                if (a9 == null || !"01".equals(a9)) {
                    JSONArray d2 = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                    String a10 = com.unionpay.mobile.android.utils.j.a(jSONObject, "empty_info");
                    if (this.D != null) {
                        this.D.a(d2, a10);
                        return;
                    }
                    return;
                }
                String a11 = com.unionpay.mobile.android.utils.j.a(jSONObject, "uuid");
                if (this.B >= 0) {
                    d(this.F, a11);
                    return;
                }
                String str = com.unionpay.mobile.android.languages.c.bD.D;
                if (this.D != null) {
                    this.D.a((JSONArray) null, str);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        this.x.setEnabled(!z);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final boolean a(String str, JSONObject jSONObject) {
        if (this.s == 1) {
            f(this.z);
            i();
            a(str);
            return true;
        }
        return false;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        String str = com.unionpay.mobile.android.languages.c.bD.o;
        com.unionpay.mobile.android.widgets.ay ayVar = new com.unionpay.mobile.android.widgets.ay(this.d, str, this);
        if (this.a.aC && ((this.a.q == null || this.a.q.size() == 0) && !this.a.aZ && !TextUtils.isEmpty(this.a.u))) {
            ayVar = new com.unionpay.mobile.android.widgets.ay(this.d, str, this.c.a(1030, -1, -1), com.unionpay.mobile.android.utils.g.a(this.d, 20.0f), this);
        }
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(int i) {
        if (this.s == 16) {
            if (this.b != null) {
                this.b.c();
            }
            com.unionpay.mobile.android.widgets.z c = this.D.c("instalment");
            if (c != null) {
                com.unionpay.mobile.android.widgets.p pVar = (com.unionpay.mobile.android.widgets.p) c;
                pVar.a(false);
                pVar.b(false);
            }
        }
        super.b(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(String str, JSONObject jSONObject) {
        if ("init".equals(str)) {
            a(2);
        } else if (!"".equals(str)) {
            this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
            this.j = false;
            this.s = 7;
            this.e.c(str, "");
        } else {
            if (this.s == 5) {
                this.a.L = true;
            }
            if (jSONObject != null) {
                d(jSONObject);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0378, code lost:
        if (r21.t.e() == false) goto L28;
     */
    @Override // com.unionpay.mobile.android.nocard.views.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void c() {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.views.o.c():void");
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
        StringBuilder sb;
        String a2;
        this.j = false;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        if (this.a.aZ) {
            sb = new StringBuilder("\"card\":\"");
            a2 = this.a.aq;
        } else {
            sb = new StringBuilder("\"card\":\"");
            a2 = this.a.ab.get(this.y).a();
        }
        sb.append(a2);
        sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        String sb2 = sb.toString();
        com.unionpay.mobile.android.utils.k.a("uppay", "cmd:" + str + ", ele:" + sb2);
        this.e.c(str, sb2);
        this.s = 6;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
        a(str, str2);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
        if (!TextUtils.isEmpty(this.a.u) && this.a.aC && (this.a.q == null || this.a.q.size() == 0)) {
            this.b.a(new s(this), new t(this));
            this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, com.unionpay.mobile.android.languages.c.bD.av, com.unionpay.mobile.android.languages.c.bD.W, com.unionpay.mobile.android.languages.c.bD.X);
            return;
        }
        if (this.a.aZ) {
            this.a.aZ = false;
        }
        if (this.t == null || !this.t.d()) {
            if (this.a.u == null || this.a.u.length() <= 0) {
                m();
            } else {
                a(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.nocard.views.b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
        com.unionpay.mobile.android.widgets.z c;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        String str = "\"\"";
        if (this.D.c(ICashierJSHandler.KEY_PROMOTION) != null) {
            str = CommonConstant.Symbol.DOUBLE_QUOTES + ((com.unionpay.mobile.android.widgets.aj) c).g() + CommonConstant.Symbol.DOUBLE_QUOTES;
        }
        this.e.c("instalment", "\"promotion\":".concat(String.valueOf(str)));
        this.s = 16;
    }
}
