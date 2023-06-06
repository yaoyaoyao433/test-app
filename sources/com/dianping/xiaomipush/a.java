package com.dianping.xiaomipush;

import android.content.Context;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.xiaomi.mipush.sdk.g;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements f.a {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;

    @Override // com.dianping.base.push.pushservice.f.a
    public final int a() {
        return 2;
    }

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac8c2a51672274eedc1690516e4505d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac8c2a51672274eedc1690516e4505d");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9b1a784584c4fd0057386de1dc0abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9b1a784584c4fd0057386de1dc0abe");
            return;
        }
        if (f.b(context)) {
            n.a(context, 2);
        }
        g.a(context, this.b, this.c);
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a02aaa77de6c33f0dabe910a54bd57c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a02aaa77de6c33f0dabe910a54bd57c")).booleanValue() : e.b();
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18ebac21141f2838c8562f200c53e5e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18ebac21141f2838c8562f200c53e5e6");
        } else {
            c.b("XiaomiPush", str);
        }
    }
}
