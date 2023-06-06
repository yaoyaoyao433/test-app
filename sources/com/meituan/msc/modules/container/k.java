package com.meituan.msc.modules.container;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    private final String g;
    private final String h;

    public k(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd14f273735e0dc52372c48035a0516", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd14f273735e0dc52372c48035a0516");
        } else if (MSCEnvHelper.getEnvInfo().isProdEnv()) {
            this.b = false;
            this.c = "";
            this.d = "";
            this.e = "";
            this.g = "";
            this.h = "";
            this.f = "";
        } else {
            this.b = com.meituan.msc.modules.engine.b.a(intent);
            this.c = com.meituan.msc.common.utils.y.a(intent, "debugProxyServer");
            this.d = com.meituan.msc.common.utils.y.a(intent, "checkUpdateUrl");
            this.e = com.meituan.msc.common.utils.y.a(intent, "mscVersion");
            this.g = com.meituan.msc.common.utils.y.a(intent, "appEnvironment");
            this.h = com.meituan.msc.common.utils.y.a(intent, "publishId");
            this.f = com.meituan.msc.common.utils.y.a(intent, "debug");
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693a2ca4c114028e8435b33e1ac3aa23", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693a2ca4c114028e8435b33e1ac3aa23")).booleanValue() : this.b || !TextUtils.isEmpty(this.d);
    }
}
