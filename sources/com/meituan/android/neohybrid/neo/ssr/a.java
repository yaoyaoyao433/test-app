package com.meituan.android.neohybrid.neo.ssr;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.dianping.titans.utils.Constants;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.SSRConfig;
import com.meituan.android.neohybrid.core.u;
import com.meituan.android.neohybrid.neo.http.c;
import com.meituan.android.neohybrid.neo.offline.f;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.neohybrid.neo.a implements com.meituan.android.neohybrid.neo.http.a<String> {
    public static ChangeQuickRedirect d;
    public String e;
    public InterfaceC0309a f;
    private SSRConfig g;
    private boolean h;
    private boolean i;
    private long j;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.ssr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0309a {
        void a(Exception exc);

        void c(String str);
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final String h() {
        return "ssr_plugin";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ed64960a8e97ad47916442677b1ece", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ed64960a8e97ad47916442677b1ece");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbf93f5aa011263c941445cb049ef9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbf93f5aa011263c941445cb049ef9c");
        } else if (i != 1715004 || this.i) {
        } else {
            this.i = true;
            this.e = str2;
            d.a(i(), "b_pay_neo_ssr_request_end_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("status", "success").a("length", Integer.valueOf(this.e != null ? this.e.length() : -1)).b("duration", Long.valueOf(System.currentTimeMillis() - this.j)));
            if (!(this.b.c instanceof u)) {
                l();
            } else if (this.f != null) {
                this.f.c(this.e);
            }
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1b096392de500617e5ed3457f658aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1b096392de500617e5ed3457f658aa");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "841474cf8b260bde5792353e60b55db8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "841474cf8b260bde5792353e60b55db8");
                } else {
                    this.j = System.currentTimeMillis();
                    d.a(i(), "b_pay_neo_ssr_request_start_mv", "c_pay_7c9fc4b4", null, null);
                    c.a a = c.a(this).a(1715004).a(this.g.c);
                    String p = com.meituan.android.neohybrid.init.a.c().p();
                    Object[] objArr3 = {"token", p};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                    if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "c9bbbe02620408ca7259dbb8375d0759", RobustBitConfig.DEFAULT_VALUE)) {
                        a = (c.a) PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "c9bbbe02620408ca7259dbb8375d0759");
                    } else if (!TextUtils.isEmpty("token")) {
                        if (a.b.g == null) {
                            a.b.g = new HashMap();
                        }
                        a.b.g.put("token", p);
                    }
                    a.b(this.g.d).a(i()).a();
                }
            }
            this.g.b = m();
            return;
        }
        this.c = true;
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45dd564ac92da0a6c288e18962db991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45dd564ac92da0a6c288e18962db991");
            return;
        }
        super.a(view);
        com.meituan.android.neohybrid.neo.adapter.a i = i().i();
        if (i().e() != null && i != null) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            i.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2864531a6aa1a78d5b9ffa70f54c6b4c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.neo.offline.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2864531a6aa1a78d5b9ffa70f54c6b4c") : new b(this));
            if (this.i || this.e == null) {
                return;
            }
            this.i = true;
            l();
            return;
        }
        this.c = true;
    }

    public static /* synthetic */ f a(a aVar, WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {aVar, webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "231e93c24026be82b4678b7a2b8a1586", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "231e93c24026be82b4678b7a2b8a1586") : aVar.a(webResourceRequest);
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f87bb59066862b869212d27af10c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f87bb59066862b869212d27af10c1a");
        } else if (TextUtils.isEmpty(this.e) || (this.b.c instanceof u)) {
        } else {
            i().c(this.g.b);
        }
    }

    private String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672e5951cde91d4d9f95c41e53101151", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672e5951cde91d4d9f95c41e53101151");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa58e01771c77ce3560fe5babd3be11", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa58e01771c77ce3560fe5babd3be11");
        }
        if (!TextUtils.isEmpty(this.e) && "GET".equals(webResourceRequest.getMethod()) && webResourceRequest.isForMainFrame()) {
            if (TextUtils.equals(webResourceRequest.getUrl().toString(), this.g.b)) {
                try {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    try {
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63c1e7cf93a195291f32d34b412d3b71", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63c1e7cf93a195291f32d34b412d3b71");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26ba04af4f058bbf4e46464af0c37451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26ba04af4f058bbf4e46464af0c37451");
        } else if (i != 1715004 || this.i) {
        } else {
            this.i = true;
            d.a(i(), "b_pay_neo_ssr_request_end_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("status", "fail").b("duration", Long.valueOf(System.currentTimeMillis() - this.j)));
            i().a("downgrade_ssr_failed");
            if (this.f != null) {
                this.f.a(exc);
            }
        }
    }
}
