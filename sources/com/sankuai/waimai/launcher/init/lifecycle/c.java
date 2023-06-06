package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static long c = -1;
    private static long d;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "LogForegroundLifecycle";
    }

    public static boolean a() {
        return b;
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d91a7a1b3959d0b99078e94148017be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d91a7a1b3959d0b99078e94148017be")).longValue();
        }
        if (b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d += elapsedRealtime - c;
            c = elapsedRealtime;
        }
        return d;
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb69ad02f0f4c4dcc08cf55000c2a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb69ad02f0f4c4dcc08cf55000c2a7c");
            return;
        }
        b = true;
        c = SystemClock.elapsedRealtime();
        com.sankuai.waimai.platform.capacity.log.i.b(new com.sankuai.waimai.launcher.log.a().a("appLife").d("onAppToForeground").b());
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c977cb36ac3fdb641c6804154bb235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c977cb36ac3fdb641c6804154bb235");
            return;
        }
        b = false;
        if (c > 0) {
            d += SystemClock.elapsedRealtime() - c;
        }
        com.sankuai.waimai.platform.capacity.log.i.b(new com.sankuai.waimai.launcher.log.a().a("appLife").d("onAppToBackground").b());
    }
}
