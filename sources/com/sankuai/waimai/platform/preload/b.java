package com.sankuai.waimai.platform.preload;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;

    public b() {
        final e a2 = e.a();
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e.a;
        if (PatchProxy.isSupport(objArr, a2, changeQuickRedirect, false, "909a126dc6b39f3f911b8c42a83765a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, a2, changeQuickRedirect, false, "909a126dc6b39f3f911b8c42a83765a0");
        } else {
            l.a(new l.a() { // from class: com.sankuai.waimai.platform.preload.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1658c796b97a39069f43c0add3dbc6bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1658c796b97a39069f43c0add3dbc6bd");
                    } else if (a2.b == null) {
                        a2.b = com.sankuai.waimai.platform.utils.sharedpreference.a.j();
                    }
                }
            }, (String) null);
        }
    }

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf78be912e7ac558dabf3bc853d1eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf78be912e7ac558dabf3bc853d1eaf");
            return;
        }
        e.a().a(jVar);
        gVar.a();
    }
}
