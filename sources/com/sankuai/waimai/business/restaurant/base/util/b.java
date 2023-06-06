package com.sankuai.waimai.business.restaurant.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.Mode3CheckPermissionI;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d709367abf7975cbefd47901986e48c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d709367abf7975cbefd47901986e48c8");
            return;
        }
        final Mode3CheckPermissionI mode3CheckPermissionI = (Mode3CheckPermissionI) com.sankuai.waimai.router.a.a(Mode3CheckPermissionI.class, Mode3CheckPermissionI.KEY);
        mode3CheckPermissionI.openLocationPermission(com.sankuai.waimai.foundation.utils.activity.a.a().b(), new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.restaurant.base.util.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4c41b23e7339acd78a5f5d7b3b1963c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4c41b23e7339acd78a5f5d7b3b1963c");
                } else if (i <= 0) {
                    Mode3CheckPermissionI.this.startLocateScheme(com.sankuai.waimai.foundation.utils.activity.a.a().b());
                }
            }
        });
    }
}
