package com.sankuai.waimai.launcher.init.lifecycle.business.page;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.platform.domain.manager.home.AgainstCheatingProvider;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;
    private List<AgainstCheatingProvider> b;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "AgainstCheatingLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e06f2abacd025a24217db20aa3fae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e06f2abacd025a24217db20aa3fae6");
            return;
        }
        if (this.b == null) {
            this.b = com.sankuai.waimai.router.a.a(AgainstCheatingProvider.class);
        }
        if (this.b != null) {
            for (AgainstCheatingProvider againstCheatingProvider : this.b) {
                if (againstCheatingProvider != null) {
                    againstCheatingProvider.syncUpload();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e24a2afc2df825591034aa901c85c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e24a2afc2df825591034aa901c85c1");
            return;
        }
        if (this.b == null) {
            this.b = com.sankuai.waimai.router.a.a(AgainstCheatingProvider.class);
        }
        if (this.b != null) {
            for (AgainstCheatingProvider againstCheatingProvider : this.b) {
                if (againstCheatingProvider != null) {
                    againstCheatingProvider.upload("exit");
                }
            }
        }
    }
}
