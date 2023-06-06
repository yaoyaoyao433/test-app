package com.meituan.android.neohybrid.v2.neo.ssr;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import com.dianping.titans.utils.Constants;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.SSRConfig;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.v2.core.s;
import com.meituan.android.neohybrid.v2.neo.http.b;
import com.meituan.android.neohybrid.v2.neo.offline.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.neohybrid.v2.neo.a implements com.meituan.android.neohybrid.neo.http.a<String> {
    public static ChangeQuickRedirect d;
    public String e;
    public InterfaceC0317a f;
    private SSRConfig g;
    private boolean h;
    private boolean i;
    private long j;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.ssr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0317a {
        void a(Exception exc);

        void c(String str);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final String h() {
        return "ssr_plugin";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7486757d40325338c3adbd04c90ef43d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7486757d40325338c3adbd04c90ef43d");
            return;
        }
        this.h = false;
        this.i = false;
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public final /* synthetic */ void onRequestSucc(int i, String str) {
        String str2 = str;
        Object[] objArr = {Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443c145add2531622990c5f849a6b94d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443c145add2531622990c5f849a6b94d");
        } else if (i != 1715004 || this.i) {
        } else {
            this.i = true;
            this.e = str2;
            com.meituan.android.neohybrid.v2.neo.report.a.a(i(), "b_pay_neo_ssr_request_end_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("status", "success").a("length", Integer.valueOf(this.e != null ? this.e.length() : -1)).b("duration", Long.valueOf(System.currentTimeMillis() - this.j)));
            if (!(this.b.c instanceof s)) {
                l();
            } else if (this.f != null) {
                this.f.c(this.e);
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f6485c4a6dc73f56f06170ba801aab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f6485c4a6dc73f56f06170ba801aab0");
            return;
        }
        NeoConfig j = j();
        if (j != null && j.ssrConfig() != null) {
            this.g = j.ssrConfig();
            this.h = this.g != null && this.g.a();
        }
        if (this.h) {
            if (this.g.e != null) {
                this.e = this.g.e;
            } else {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec17161ceac5a35d1d91d6ce28ed05cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec17161ceac5a35d1d91d6ce28ed05cc");
                } else {
                    this.j = System.currentTimeMillis();
                    com.meituan.android.neohybrid.v2.neo.report.a.a(i(), "b_pay_neo_ssr_request_start_mv", "c_pay_7c9fc4b4", null, null);
                    b.a a = com.meituan.android.neohybrid.v2.neo.http.b.a(this).a(1715004).a(this.g.c);
                    String p = com.meituan.android.neohybrid.init.a.c().p();
                    Object[] objArr3 = {"token", p};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
                    if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "5760985de136ee9e3824392167390681", RobustBitConfig.DEFAULT_VALUE)) {
                        a = (b.a) PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "5760985de136ee9e3824392167390681");
                    } else if (!TextUtils.isEmpty("token")) {
                        if (a.b.g == null) {
                            a.b.g = new HashMap();
                        }
                        a.b.g.put("token", p);
                    }
                    a.a(this.g.d).a(i()).a();
                }
            }
            this.g.b = m();
            return;
        }
        this.c = true;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9fe2df74d66b1410beedc806135b09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9fe2df74d66b1410beedc806135b09");
            return;
        }
        super.a(view);
        com.meituan.android.neohybrid.v2.neo.adapter.a e = i().e();
        if (i().b() != null && e != null) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            e.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a8a930cf01d1f5af764bbcb5ed3c3a0e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.v2.neo.offline.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a8a930cf01d1f5af764bbcb5ed3c3a0e") : new b(this));
            if (this.i || this.e == null) {
                return;
            }
            this.i = true;
            l();
            return;
        }
        this.c = true;
    }

    public static /* synthetic */ f a(a aVar, c cVar, WebResourceRequest webResourceRequest) {
        Object[] objArr = {aVar, cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2c5bf6c069727c0b8d97afb534d5134", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2c5bf6c069727c0b8d97afb534d5134") : aVar.a(webResourceRequest);
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8fece8596fa5a3bc41152e99f1b28e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8fece8596fa5a3bc41152e99f1b28e5");
        } else if (TextUtils.isEmpty(this.e) || (this.b.c instanceof s)) {
        } else {
            i().c(this.g.b);
        }
    }

    private String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f91aec18fb263cd698f8c0ac8caffdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f91aec18fb263cd698f8c0ac8caffdd");
        }
        String str = this.g.b;
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("neo_ssr", "1");
            return buildUpon.toString();
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "SSRController_getSSRRequestUrl");
            return str;
        }
    }

    private f a(WebResourceRequest webResourceRequest) {
        Map hashMap;
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05fe1e64799cb960f8284ae5a3cb931e", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05fe1e64799cb960f8284ae5a3cb931e");
        }
        if (!TextUtils.isEmpty(this.e) && "GET".equals(webResourceRequest.getMethod()) && webResourceRequest.isForMainFrame()) {
            if (TextUtils.equals(webResourceRequest.getUrl().toString(), this.g.b)) {
                try {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    try {
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88426950dd0cd8998bb81651ae50b51a", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88426950dd0cd8998bb81651ae50b51a");
                        } else {
                            hashMap = new HashMap();
                            hashMap.put("Access-Control-Allow-Origin", "*");
                            hashMap.put("Timing-Allow-Origin", "*");
                            hashMap.put("Content-Type", Constants.MIME_TYPE_HTML);
                        }
                        return new f(Constants.MIME_TYPE_HTML, "UTF-8", 200, "OK", hashMap, this.e.getBytes());
                    } catch (Exception unused) {
                        return null;
                    }
                } catch (Exception unused2) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public final void onRequestFail(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4552f53ba0330fce611dec56c725deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4552f53ba0330fce611dec56c725deb");
        } else if (i != 1715004 || this.i) {
        } else {
            this.i = true;
            com.meituan.android.neohybrid.v2.neo.report.a.a(i(), "b_pay_neo_ssr_request_end_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("status", "fail").b("duration", Long.valueOf(System.currentTimeMillis() - this.j)));
            i().a("downgrade_ssr_failed");
            if (this.f != null) {
                this.f.a(exc);
            }
        }
    }
}
