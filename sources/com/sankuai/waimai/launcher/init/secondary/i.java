package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.android.cube.pga.dynamic.IDynamicInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "DynamicInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72f7db09dab0a50dd766f0a9ac0a34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72f7db09dab0a50dd766f0a9ac0a34a");
            return;
        }
        for (IDynamicInit iDynamicInit : com.sankuai.waimai.router.a.a(IDynamicInit.class)) {
            iDynamicInit.init();
        }
    }
}
