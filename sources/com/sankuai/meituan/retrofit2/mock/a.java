package com.sankuai.meituan.retrofit2.mock;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.b;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements ah, Interceptor {
    public static ChangeQuickRedirect a;
    private final InterfaceC0636a b;
    private boolean c;
    private int d;
    private String e;
    private String f;
    private Context g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.mock.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0636a {
        String a();
    }

    public a(Context context, InterfaceC0636a interfaceC0636a) {
        Object[] objArr = {context, interfaceC0636a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b84c7115931394946aa61c4e4f1ae9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b84c7115931394946aa61c4e4f1ae9");
            return;
        }
        this.d = -1;
        this.g = null;
        this.b = interfaceC0636a;
        this.g = context.getApplicationContext();
        q a2 = q.a(this.g, q.a(this.g));
        a2.a(this);
        StringBuilder sb = new StringBuilder();
        sb.append(this.g.getPackageName());
        sb.append("_preferences");
        x.a(a2);
        b(a2);
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final b intercept(Interceptor.a aVar) throws IOException {
        t e;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cba31222f836c5c1382d9647833064c", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cba31222f836c5c1382d9647833064c");
        }
        aj request = aVar.request();
        if (this.c && (e = t.e(request.b())) != null) {
            t.a b = e.m().b(this.e);
            if (TextUtils.isEmpty(e.c("uuid")) && this.b != null && !TextUtils.isEmpty(this.b.a())) {
                b.a("uuid", this.b.a());
            }
            if (this.d != -1) {
                b.a(this.d);
            }
            aj.a b2 = request.a().b(b.b().toString()).b("MKOriginHost", e.f()).b("MKScheme", e.b()).b("MKTunnelType", "http").b("MKAppID", "10");
            if (e.g() != t.a(e.b())) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.g());
                b2.b("MKOriginPort", sb.toString());
            }
            request = b2.a();
        }
        return aVar.a(request);
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfec20c4998c7a75a905eacf3db7b71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfec20c4998c7a75a905eacf3db7b71");
            return;
        }
        q a2 = q.a(this.g, q.a(this.g));
        if ("dianping_mock_enable".equals(str2)) {
            b(a2);
        } else if ("dianping_mock_url".equals(str2)) {
            a(a2);
        }
    }

    private void a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467a82d82b5c4f646e5e32a94913cc66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467a82d82b5c4f646e5e32a94913cc66");
            return;
        }
        this.e = qVar.b("dianping_mock_url", (String) null);
        this.d = -1;
        if (TextUtils.isEmpty(this.e)) {
            this.e = "appmock.sankuai.com";
            this.f = "http";
            return;
        }
        String[] split = this.e.split(CommonConstant.Symbol.COLON);
        if (split.length > 1) {
            try {
                this.d = Integer.parseInt(split[split.length - 1]);
            } catch (Exception unused) {
                this.d = -1;
            }
        }
        t e = t.e(this.e);
        this.f = "http";
        this.e = e.f();
    }

    private void b(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062103df52d2efc41f69d717be22875b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062103df52d2efc41f69d717be22875b");
            return;
        }
        this.c = qVar.b("dianping_mock_enable", false);
        if (this.c) {
            a(qVar);
        }
    }
}
