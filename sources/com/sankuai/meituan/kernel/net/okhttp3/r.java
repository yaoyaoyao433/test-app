package com.sankuai.meituan.kernel.net.okhttp3;

import android.content.Context;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r implements ah, Interceptor {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;

    public r(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1bc16f411e78bf619832f47e7cc9535", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1bc16f411e78bf619832f47e7cc9535");
            return;
        }
        this.b = false;
        this.c = 0;
        String str = com.sankuai.meituan.kernel.net.base.c.b.getPackageName() + "_preferences";
        com.meituan.android.cipstorage.q a2 = com.sankuai.meituan.kernel.net.utils.d.a(com.sankuai.meituan.kernel.net.base.c.b);
        a2.a(this);
        x a3 = x.a(a2);
        a(a3, (com.meituan.android.cipstorage.q) null, str);
        b(a3, null, str);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91bc100a79c8872f1a3c66a5046fc730", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91bc100a79c8872f1a3c66a5046fc730");
        }
        Request request = chain.request();
        if (this.b && this.c > 0) {
            try {
                Thread.sleep(this.c * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return chain.proceed(request);
    }

    private void a(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "930e3c08c890cde041af24262b29e20e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "930e3c08c890cde041af24262b29e20e");
        } else if (xVar != null) {
            this.b = xVar.b("enable_simulate_network_timeout", false, str);
        } else if (qVar != null) {
            this.b = qVar.b("enable_simulate_network_timeout", false);
        }
    }

    private void b(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6a51503ad742c7414bbdd3d497feed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6a51503ad742c7414bbdd3d497feed");
        } else if (xVar != null) {
            this.c = xVar.b("simulate_network_timeout_value", 0, str);
        } else if (qVar != null) {
            this.c = qVar.b("simulate_network_timeout_value", 0);
        }
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d87cfa50d43a74b9de329a99ffd431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d87cfa50d43a74b9de329a99ffd431");
            return;
        }
        com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(com.sankuai.meituan.kernel.net.base.c.b, str);
        if ("enable_simulate_network_timeout".equals(str2)) {
            a((x) null, a2, (String) null);
        } else if ("simulate_network_timeout_value".equals(str2)) {
            b(null, a2, null);
        }
    }
}
