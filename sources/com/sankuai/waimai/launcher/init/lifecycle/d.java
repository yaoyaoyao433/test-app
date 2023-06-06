package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "NetLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f742ac408c3c72705ad74ebcfe7ac373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f742ac408c3c72705ad74ebcfe7ac373");
            return;
        }
        try {
            if (com.dianping.nvnetwork.g.u()) {
                com.dianping.nvnetwork.g.b(false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a823cc894b0c3ec88c3cd2d263d12ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a823cc894b0c3ec88c3cd2d263d12ae");
            return;
        }
        try {
            if (com.dianping.nvnetwork.g.u()) {
                com.dianping.nvnetwork.g.b(true);
            }
        } catch (Exception unused) {
        }
    }
}
