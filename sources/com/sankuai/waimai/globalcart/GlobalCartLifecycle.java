package com.sankuai.waimai.globalcart;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GlobalCartLifecycle extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToForeground(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "GlobalCartLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fecd47237f2c5fb5d0d7eb0aaa78700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fecd47237f2c5fb5d0d7eb0aaa78700");
        } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            GlobalCartManager.getInstance().cartUpload(new GlobalCartManager.a() { // from class: com.sankuai.waimai.globalcart.GlobalCartLifecycle.1
                @Override // com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager.a
                public final void a() {
                }
            });
        }
    }
}
