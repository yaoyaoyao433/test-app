package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.quickpass.uptsm.TSMInit;
import com.meituan.android.quickpass.uptsm.common.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ab extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "QuickpassInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2332f80b8441cda31d264fdef5eb86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2332f80b8441cda31d264fdef5eb86");
        } else {
            TSMInit.init(application, com.sankuai.meituan.takeoutnew.a.d, new d.a() { // from class: com.sankuai.waimai.launcher.init.mainly.ab.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.quickpass.uptsm.common.utils.d.a
                public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
                    Object[] objArr2 = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb790e7f17b5b8cf500bf6fea23322af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb790e7f17b5b8cf500bf6fea23322af");
                    } else {
                        com.sankuai.waimai.platform.capacity.log.c.a().pv3(j, str, i, i2, i3, i4, i5, i6, str2);
                    }
                }
            });
        }
    }
}
