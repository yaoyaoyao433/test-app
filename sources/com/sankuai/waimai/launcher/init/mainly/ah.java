package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.common.weaver.impl.WeaverProxy;
import com.meituan.android.common.weaver.impl.shellcommon.CommonShell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ah extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "WeaverProxyInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d3b05b8c496c7e40a217291440a686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d3b05b8c496c7e40a217291440a686");
        } else {
            WeaverProxy.init(application, new CommonShell());
        }
    }
}
