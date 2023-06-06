package com.unionpay.mobile.android.upviews;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upwidget.q;
import com.unionpay.mobile.android.utils.j;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.mobile.android.widgets.UPWidget;
import com.unionpay.mobile.android.widgets.aa;
import com.unionpay.mobile.android.widgets.ad;
import com.unionpay.mobile.android.widgets.af;
import com.unionpay.mobile.android.widgets.ah;
import com.unionpay.mobile.android.widgets.aj;
import com.unionpay.mobile.android.widgets.ap;
import com.unionpay.mobile.android.widgets.av;
import com.unionpay.mobile.android.widgets.e;
import com.unionpay.mobile.android.widgets.m;
import com.unionpay.mobile.android.widgets.p;
import com.unionpay.mobile.android.widgets.u;
import com.unionpay.mobile.android.widgets.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class a extends LinearLayout implements q.a, aa.a, ah.a, aj.a, ap.a {
    private Context a;
    private m b;
    private ArrayList<z> c;
    private long d;
    private b e;
    private boolean f;
    private boolean g;
    private JSONObject h;
    private String i;

    /* renamed from: com.unionpay.mobile.android.upviews.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C1512a {
        public int a = 0;
        public String b;

        C1512a(String str) {
            this.b = str;
        }

        public final void a(int i, String str) {
            this.b = str;
            this.a = i;
        }

        public final boolean a() {
            return this.a == 0;
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(C1512a c1512a);

        void a(boolean z);

        void c(String str);

        void c(String str, String str2);

        void r();
    }

    public a(Context context, JSONArray jSONArray, long j, b bVar, String str, boolean z, String str2) {
        this(context, jSONArray, j, bVar, str, z, str2, (byte) 0);
    }

    private a(Context context, JSONArray jSONArray, long j, b bVar, String str, boolean z, String str2, byte b2) {
        this(context, jSONArray, j, bVar, str, z, str2, (char) 0);
    }

    private a(Context context, JSONArray jSONArray, long j, b bVar, String str, boolean z, String str2, char c) {
        this(context, jSONArray, j, bVar, str, z, false, null, null, str2);
    }

    public a(Context context, JSONArray jSONArray, long j, b bVar, String str, boolean z, boolean z2, z zVar, JSONArray jSONArray2, String str2) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0L;
        this.e = null;
        this.f = false;
        this.g = true;
        this.h = null;
        this.i = "";
        this.a = context;
        this.d = j;
        this.e = bVar;
        this.f = z2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = com.unionpay.mobile.android.global.a.f;
        layoutParams.bottomMargin = i;
        layoutParams.topMargin = i;
        setLayoutParams(layoutParams);
        setPadding(0, 0, 0, 0);
        setOrientation(1);
        setBackgroundColor(0);
        a(jSONArray, str, z, zVar, jSONArray2, str2);
    }

    public a(Context context, JSONArray jSONArray, b bVar, String str) {
        this(context, jSONArray, -1L, bVar, null, true, str);
    }

    private C1512a a(boolean z) {
        String str;
        Object[] objArr;
        String str2;
        Object[] objArr2;
        C1512a c1512a = new C1512a("");
        if (this.c != null) {
            Iterator<z> it = this.c.iterator();
            while (it.hasNext()) {
                z next = it.next();
                if (!(next instanceof af)) {
                    if (!next.c()) {
                        str2 = com.unionpay.mobile.android.languages.c.bD.aC;
                        objArr2 = new Object[]{next.r()};
                    } else if (!next.b()) {
                        str2 = com.unionpay.mobile.android.languages.c.bD.aD;
                        objArr2 = new Object[]{next.r()};
                    }
                    c1512a.a(-1, String.format(str2, objArr2));
                    break;
                }
                if (!next.c()) {
                    str = com.unionpay.mobile.android.languages.c.bD.aC;
                    objArr = new Object[]{com.unionpay.mobile.android.languages.c.bD.aE};
                } else if (!next.b()) {
                    str = com.unionpay.mobile.android.languages.c.bD.aD;
                    objArr = new Object[]{com.unionpay.mobile.android.languages.c.bD.aE};
                }
                c1512a.a(-1, String.format(str, objArr));
            }
        }
        if (c1512a.a()) {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.c != null) {
                for (int i = 0; i < this.c.size(); i++) {
                    z zVar = this.c.get(i);
                    if (!(zVar instanceof ad) && ((!(zVar instanceof UPWidget) || z) && !TextUtils.isEmpty(this.c.get(i).h()) && this.c.get(i).f())) {
                        stringBuffer.append(CommonConstant.Symbol.COMMA);
                        stringBuffer.append(this.c.get(i).h());
                    }
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            if (stringBuffer2.length() > 1) {
                stringBuffer2 = stringBuffer2.substring(1);
            }
            c1512a.a(0, stringBuffer2);
            return c1512a;
        }
        return c1512a;
    }

    private static z a(List<z> list, String str) {
        for (z zVar : list) {
            if (zVar.n().equalsIgnoreCase(str)) {
                return zVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.unionpay.mobile.android.upviews.a.C1512a a() {
        /*
            r7 = this;
            com.unionpay.mobile.android.upviews.a$a r0 = new com.unionpay.mobile.android.upviews.a$a
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.util.ArrayList<com.unionpay.mobile.android.widgets.z> r1 = r7.c
            java.lang.String r2 = "pin"
            com.unionpay.mobile.android.widgets.z r1 = a(r1, r2)
            if (r1 == 0) goto L4e
            boolean r2 = r1.c()
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L2e
            com.unionpay.mobile.android.languages.c r2 = com.unionpay.mobile.android.languages.c.bD
            java.lang.String r2 = r2.aC
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r1.r()
            r5[r4] = r6
        L26:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r0.a(r3, r2)
            goto L41
        L2e:
            boolean r2 = r1.b()
            if (r2 != 0) goto L41
            com.unionpay.mobile.android.languages.c r2 = com.unionpay.mobile.android.languages.c.bD
            java.lang.String r2 = r2.aD
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r1.r()
            r5[r4] = r6
            goto L26
        L41:
            boolean r2 = r0.a()
            if (r2 != 0) goto L48
            return r0
        L48:
            java.lang.String r1 = r1.a()
            r0.b = r1
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.upviews.a.a():com.unionpay.mobile.android.upviews.a$a");
    }

    public final String a(String str) {
        z a = a(this.c, str);
        String h = a != null ? a.h() : "";
        k.a("uppay", " name:" + str + ", value:" + h);
        return h;
    }

    public final void a(int i) {
        z a = a(this.c, "sms");
        if (a != null) {
            ((ap) a).a(i);
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        z c = c(ICashierJSHandler.KEY_PROMOTION);
        if (c == null || !(c instanceof aj)) {
            return;
        }
        ((aj) c).b(onClickListener);
    }

    public final void a(m mVar, JSONObject jSONObject) {
        this.b = mVar;
        this.h = jSONObject;
    }

    @Override // com.unionpay.mobile.android.widgets.aa.a
    public final void a(u uVar, String str) {
        if (this.e != null) {
            boolean z = true;
            if (str != null && str.length() > 0) {
                if (this.c != null) {
                    Iterator<z> it = this.c.iterator();
                    while (it.hasNext()) {
                        z next = it.next();
                        if (next instanceof aa) {
                            aa aaVar = (aa) next;
                            if (!aaVar.a(uVar) && !aaVar.c()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            this.e.a(z);
        }
    }

    @Override // com.unionpay.mobile.android.widgets.ap.a
    public final void a(z zVar) {
        String str;
        Object[] objArr;
        String str2;
        Object[] objArr2;
        boolean z = zVar instanceof ap;
        if (this.e == null || !z) {
            return;
        }
        d();
        C1512a c1512a = new C1512a("");
        z a = a(this.c, "mobile");
        z a2 = a(this.c, "pan");
        z a3 = a(this.c, "card");
        z a4 = a(this.c, "area_code");
        String str3 = "";
        if (a2 != null) {
            if (!a2.c()) {
                str2 = com.unionpay.mobile.android.languages.c.bD.aC;
                objArr2 = new Object[]{com.unionpay.mobile.android.languages.c.bD.aE};
            } else if (a2.b()) {
                str3 = "" + a2.h();
            } else {
                str2 = com.unionpay.mobile.android.languages.c.bD.aD;
                objArr2 = new Object[]{com.unionpay.mobile.android.languages.c.bD.aE};
            }
            c1512a.a(-1, String.format(str2, objArr2));
        }
        if (c1512a.a()) {
            if (a != null) {
                if (!a.c()) {
                    str = com.unionpay.mobile.android.languages.c.bD.aC;
                    objArr = new Object[]{a.r()};
                } else if (a.b()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str3.length() == 0 ? "" : CommonConstant.Symbol.COMMA);
                    str3 = sb.toString() + a.h();
                } else {
                    str = com.unionpay.mobile.android.languages.c.bD.aD;
                    objArr = new Object[]{a.r()};
                }
                c1512a.a(-1, String.format(str, objArr));
            }
            if (c1512a.a()) {
                if (a3 != null && a3.h().length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(str3.length() == 0 ? "" : CommonConstant.Symbol.COMMA);
                    str3 = sb2.toString() + a3.h();
                }
                if (a4 != null && a4.h().length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str3);
                    sb3.append(str3.length() == 0 ? "" : CommonConstant.Symbol.COMMA);
                    str3 = sb3.toString() + a4.h();
                }
                c1512a.a(0, str3);
            }
        }
        this.e.a(c1512a);
    }

    @Override // com.unionpay.mobile.android.upwidget.q.a
    public final void a(String str, String str2) {
        if (this.e != null) {
            d();
            this.e.c(str, str2);
        }
    }

    @Override // com.unionpay.mobile.android.upwidget.q.a
    public final void a(String str, boolean z) {
        String str2 = ICashierJSHandler.KEY_PROMOTION.equalsIgnoreCase(str) ? "instalment" : ICashierJSHandler.KEY_PROMOTION;
        z c = c(str);
        z c2 = c(str2);
        if (c == null) {
            return;
        }
        if (!(c instanceof aj)) {
            if (c instanceof p) {
                if (z) {
                    this.e.r();
                }
                ((p) c).b(z);
                return;
            }
            return;
        }
        ((aj) c).a(z);
        if (c2 != null) {
            p pVar = (p) c2;
            if (pVar.g()) {
                Toast.makeText(this.a, this.i, 1).show();
                pVar.b(false);
            }
        }
    }

    public final void a(JSONArray jSONArray) {
        z c = c(ICashierJSHandler.KEY_PROMOTION);
        if (c == null || !(c instanceof aj)) {
            return;
        }
        ((aj) c).a(jSONArray);
    }

    public final void a(JSONArray jSONArray, String str) {
        z c = c(ICashierJSHandler.KEY_PROMOTION);
        if (c == null || !(c instanceof aj)) {
            return;
        }
        ((aj) c).a(jSONArray, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(4:11|12|13|14)|(1:16)(2:74|(1:76)(9:77|(5:133|134|135|136|137)(9:79|(1:81)(2:83|(1:85)(2:86|(1:88)(2:90|(1:92)(2:93|(1:95)(2:96|(1:98)(2:99|(1:101)(2:102|(1:104)(2:105|(1:107)(2:108|(1:110)(2:111|(1:113)(2:114|(1:116)(2:117|(1:119)(2:120|(1:122)(8:123|(4:125|126|127|128)(1:132)|18|19|20|21|(2:69|70)(9:23|(1:25)(2:63|(1:65)(2:66|(1:68)))|26|(1:30)|31|(12:33|(1:35)(2:59|(5:61|37|(2:53|(2:55|(1:58)))(3:41|(1:43)|44)|45|(3:49|50|51)))|36|37|(0)|53|(0)|45|(1:47)|49|50|51)|62|50|51)|52))))))))))))))|82|18|19|20|21|(0)(0)|52)|89|18|19|20|21|(0)(0)|52))|17|18|19|20|21|(0)(0)|52|9) */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.json.JSONArray r21, java.lang.String r22, boolean r23, com.unionpay.mobile.android.widgets.z r24, org.json.JSONArray r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.upviews.a.a(org.json.JSONArray, java.lang.String, boolean, com.unionpay.mobile.android.widgets.z, org.json.JSONArray, java.lang.String):void");
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String a = j.a(jSONObject, "instalment_empty_info");
        if (TextUtils.isEmpty(a)) {
            ((p) c("instalment")).a(true);
            ((p) c("instalment")).b(true);
            ((p) a(this.c, "instalment_policy")).a(j.d(jSONObject, "new_instalments"));
            return;
        }
        ((p) c("instalment")).a(false);
        ((p) c("instalment")).b(false);
        Toast.makeText(this.a, a, 1).show();
    }

    public final C1512a b() {
        return a(true);
    }

    public final String b(String str) {
        z a = a(this.c, str);
        return a != null ? a.a() : "";
    }

    public final void b(View.OnClickListener onClickListener) {
        z c = c(ICashierJSHandler.KEY_PROMOTION);
        if (c == null || !(c instanceof aj)) {
            return;
        }
        ((aj) c).c(onClickListener);
    }

    public final z c(String str) {
        if (this.c != null && this.c.size() > 0 && !TextUtils.isEmpty(str)) {
            Iterator<z> it = this.c.iterator();
            while (it.hasNext()) {
                z next = it.next();
                if (next.o().equalsIgnoreCase(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final HashMap<String, String> c() {
        if (a(false).a()) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (this.c != null) {
                for (int i = 0; i < this.c.size(); i++) {
                    z zVar = this.c.get(i);
                    if (!(zVar instanceof ad) && !(zVar instanceof UPWidget) && !TextUtils.isEmpty(zVar.a())) {
                        hashMap.put(zVar.n(), zVar.a());
                    }
                }
            }
            return hashMap;
        }
        return null;
    }

    public final void c(View.OnClickListener onClickListener) {
        z c = c(ICashierJSHandler.KEY_PROMOTION);
        if (c == null || !(c instanceof aj)) {
            return;
        }
        ((aj) c).a(onClickListener);
    }

    public final void d(String str) {
        this.i = str;
    }

    public final boolean d() {
        boolean z;
        if (this.c != null) {
            Iterator<z> it = this.c.iterator();
            while (it.hasNext()) {
                z next = it.next();
                if (next instanceof UPWidget) {
                    UPWidget uPWidget = (UPWidget) next;
                    if (uPWidget.j()) {
                        uPWidget.k();
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        return z;
    }

    @Override // com.unionpay.mobile.android.widgets.ah.a
    public final void e(String str) {
        if (this.e != null) {
            this.e.c(str);
        }
    }

    public final boolean e() {
        boolean z;
        if (this.c != null) {
            Iterator<z> it = this.c.iterator();
            while (it.hasNext()) {
                z next = it.next();
                if ((next instanceof aa) && !((aa) next).c()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return !z;
    }

    public final void f() {
        if (this.c == null || this.c.size() <= 0) {
            return;
        }
        Iterator<z> it = this.c.iterator();
        while (it.hasNext()) {
            z next = it.next();
            if ((next instanceof UPWidget) || (next instanceof e) || (next instanceof av)) {
                ((aa) next).g();
            }
        }
    }

    @Override // com.unionpay.mobile.android.widgets.aj.a
    public final void g() {
        z c = c("instalment");
        if (c != null) {
            p pVar = (p) c;
            if (pVar.g()) {
                Toast.makeText(this.a, this.i, 1).show();
                pVar.b(false);
            }
        }
    }
}
