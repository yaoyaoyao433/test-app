package com.sankuai.meituan.takeoutnew.provider.scheme.interceptor;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ExternalJumpLifeCycle extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "ExternalJumpLifeCycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb665b1c1491a54c9cc44b04b3afca70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb665b1c1491a54c9cc44b04b3afca70");
        } else {
            com.sankuai.meituan.takeoutnew.util.b.a(false);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eec6293e0700fb9602d0c5b918a16b0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eec6293e0700fb9602d0c5b918a16b0e");
        } else {
            com.sankuai.meituan.takeoutnew.util.b.a(true);
        }
    }
}
