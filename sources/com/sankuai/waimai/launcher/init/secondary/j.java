package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "DynloaderInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c4598a0466533535ec350476f7c7e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c4598a0466533535ec350476f7c7e1");
            return;
        }
        if (com.sankuai.waimai.foundation.core.a.b()) {
            com.meituan.android.loader.impl.a.a(true);
        }
        com.meituan.android.loader.impl.a.a(application, new com.meituan.android.loader.impl.g() { // from class: com.sankuai.waimai.launcher.init.secondary.j.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.loader.impl.g
            public final long a(Context context) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ac5bc66434f5d02b8c7a8a0abd0a216", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ac5bc66434f5d02b8c7a8a0abd0a216")).longValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            }

            @Override // com.meituan.android.loader.impl.g
            public final String b(Context context) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d216510821aa8b092f5594d55b8a446a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d216510821aa8b092f5594d55b8a446a") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.meituan.android.loader.impl.g
            public final String c(Context context) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb827f917cddd69f3e85d4e2b32e768f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb827f917cddd69f3e85d4e2b32e768f") : com.sankuai.waimai.platform.b.A().c();
            }
        });
    }
}
