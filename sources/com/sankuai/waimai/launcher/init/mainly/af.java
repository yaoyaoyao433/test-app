package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.Context;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class af extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "UuidInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1086dc789d98b548235dc5e53998dbc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1086dc789d98b548235dc5e53998dbc6");
        } else {
            com.sankuai.waimai.kit.uuid.b.a(application, new com.sankuai.waimai.kit.uuid.a() { // from class: com.sankuai.waimai.launcher.init.mainly.af.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.uuid.a
                public final void a(Context context, String str) {
                    Object[] objArr2 = {context, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2438a1ce1d3b309fb7e11ab034442d34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2438a1ce1d3b309fb7e11ab034442d34");
                        return;
                    }
                    com.sankuai.waimai.platform.b.A().a(context, str);
                    LocationUtils.setUuid(str);
                    com.dianping.monitor.impl.a.setUnionId(str);
                    com.sankuai.waimai.launcher.manager.user.a.b();
                    com.sankuai.waimai.platform.b A = com.sankuai.waimai.platform.b.A();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.b.i;
                    if (PatchProxy.isSupport(objArr3, A, changeQuickRedirect3, false, "464c2a0496006b73cbbf80caaf39bcb7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, A, changeQuickRedirect3, false, "464c2a0496006b73cbbf80caaf39bcb7");
                    } else if (!com.sankuai.waimai.foundation.utils.d.a(A.m)) {
                        for (b.InterfaceC1037b interfaceC1037b : A.m) {
                            if (interfaceC1037b != null) {
                                interfaceC1037b.a();
                            }
                        }
                    }
                }
            });
        }
    }
}
