package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class aa extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PushServiceInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d1e42c9010b5760ff5a391408a477d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d1e42c9010b5760ff5a391408a477d");
        } else {
            com.sankuai.waimai.platform.utils.l.a(new l.a() { // from class: com.sankuai.waimai.launcher.init.mainly.aa.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e602cb3a20e6fbafe0cbf58807fb478", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e602cb3a20e6fbafe0cbf58807fb478");
                    } else {
                        com.dianping.base.push.pushservice.f.a(application);
                    }
                }
            }, (String) null);
        }
    }
}
