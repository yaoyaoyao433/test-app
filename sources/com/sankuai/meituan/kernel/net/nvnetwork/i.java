package com.sankuai.meituan.kernel.net.nvnetwork;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.r;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i implements r, ah {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5023ef331e3a311422e80f5b251c885d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5023ef331e3a311422e80f5b251c885d");
            return;
        }
        this.b = false;
        this.c = 0;
        String str = com.sankuai.meituan.kernel.net.base.c.b.getPackageName() + "_preferences";
        q a2 = com.sankuai.meituan.kernel.net.utils.d.a(com.sankuai.meituan.kernel.net.base.c.b);
        a2.a(this);
        x a3 = x.a(a2);
        a(a3, (q) null, str);
        b(a3, null, str);
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<com.dianping.nvnetwork.q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a79a96b40dd1dddddfb964e3db0f04", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a79a96b40dd1dddddfb964e3db0f04");
        }
        Request a2 = aVar.a();
        if (this.b && this.c > 0) {
            try {
                Thread.sleep(this.c * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return aVar.a(a2);
    }

    private void a(x xVar, q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a840c260324ad59f16a425665c1e0500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a840c260324ad59f16a425665c1e0500");
        } else if (xVar != null) {
            this.b = xVar.b("enable_simulate_network_timeout", false, str);
        } else if (qVar != null) {
            this.b = qVar.b("enable_simulate_network_timeout", false);
        }
    }

    private void b(x xVar, q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7debf74254dd45553cc6080a005056c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7debf74254dd45553cc6080a005056c");
        } else if (xVar != null) {
            this.c = xVar.b("simulate_network_timeout_value", 0, str);
        } else if (qVar != null) {
            this.c = qVar.b("simulate_network_timeout_value", 0);
        }
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865ead0f0b445ebd5022bf983ee259f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865ead0f0b445ebd5022bf983ee259f6");
            return;
        }
        q a2 = q.a(com.sankuai.meituan.kernel.net.base.c.b, str);
        if ("enable_simulate_network_timeout".equals(str2)) {
            a((x) null, a2, (String) null);
        } else if ("simulate_network_timeout_value".equals(str2)) {
            b(null, a2, null);
        }
    }
}
