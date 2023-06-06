package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import com.dianping.titans.utils.KNBLifecycleManager;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.mrn.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "NetLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e4804d01800808b2207f43c3ac92f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e4804d01800808b2207f43c3ac92f6");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("gxb", "onForeground", new Object[0]);
        LocationUtils.onAppForeground();
        com.meituan.android.clipboard.c.a();
        KNBLifecycleManager.onForeground();
        q.a();
        AppUtil.setIsForeground(true);
        com.meituan.android.privacy.impl.a.a();
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8899d93aec810013f457e2cfafc70609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8899d93aec810013f457e2cfafc70609");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("gxb", "onBackground", new Object[0]);
        LocationUtils.onAppBackground();
        com.meituan.android.clipboard.c.b();
        KNBLifecycleManager.onBackground();
        q.b();
        AppUtil.setIsForeground(false);
        com.meituan.android.privacy.impl.a.b();
    }
}
