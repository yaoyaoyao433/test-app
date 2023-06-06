package com.sankuai.waimai.business.knb.init;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.f;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PreloadInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec61211c7291eb150078e9f48863de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec61211c7291eb150078e9f48863de8");
            return;
        }
        super.init(application);
        f.a();
    }
}
