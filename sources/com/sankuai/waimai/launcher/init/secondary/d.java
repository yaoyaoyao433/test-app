package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "BusinessDiagnosReportInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02fafb79bbf3dce7be0096a74bbee4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02fafb79bbf3dce7be0096a74bbee4cd");
            return;
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.e();
        com.sankuai.waimai.platform.bizdiagnosis.a.f();
    }
}
