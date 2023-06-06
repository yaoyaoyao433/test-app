package com.sankuai.waimai.business.page.common.util;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, final com.meituan.android.privacy.interfaces.d dVar) {
        Object[] objArr = {activity, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f61226404c6f51dfab4c7e0efd88301d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f61226404c6f51dfab4c7e0efd88301d");
        } else if (com.sankuai.waimai.business.page.home.d.b()) {
            Privacy.createPermissionGuard().a(activity, "Locate.once", "dj-b5e9814e9fb3a8f6", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.page.common.util.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32544d278c7ea6e6f6c8e068ff88dc5d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32544d278c7ea6e6f6c8e068ff88dc5d");
                        return;
                    }
                    com.sankuai.waimai.platform.capacity.permission.a.a(str, i);
                    if (i > 0 && com.sankuai.waimai.platform.model.c.a().c()) {
                        com.sankuai.waimai.platform.model.c.a().a(0);
                    }
                    com.meituan.android.privacy.interfaces.d.this.onResult(str, i);
                }
            });
        } else {
            dVar.onResult("Locate.once", 2);
            if (com.sankuai.waimai.platform.model.c.a().c()) {
                com.sankuai.waimai.platform.model.c.a().a(0);
            }
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("4").b());
        }
    }

    public static boolean a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d522272ceab1afb84522fc8979c4d8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d522272ceab1afb84522fc8979c4d8e")).booleanValue() : wMLocation == null || wMLocation.getLocationResultCode() == null || wMLocation.getLocationResultCode().a != 1200;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d29db1b88a56f2c3117ce7f65dce518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d29db1b88a56f2c3117ce7f65dce518");
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
        }
    }

    public static void b(final Activity activity) {
        Long l;
        boolean z = false;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7d6695e3c3644634c71d3dec53d7fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7d6695e3c3644634c71d3dec53d7fcf");
        } else if (Build.VERSION.SDK_INT < 23) {
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3cc86d60ff48ef19d4e5ee95685d47a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3cc86d60ff48ef19d4e5ee95685d47a5");
                return;
            }
            WMLocation p = g.a().p();
            if (p == null || g.a().b(p) || com.sankuai.waimai.platform.model.c.a().c()) {
                com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
            }
        } else {
            int a2 = Privacy.createPermissionGuard().a(activity, "Locate.once", "dj-b5e9814e9fb3a8f6");
            com.sankuai.waimai.platform.capacity.permission.c a3 = com.sankuai.waimai.platform.capacity.permission.c.a();
            Object[] objArr3 = {"Locate.once"};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.capacity.permission.c.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "2135190b3f01d7fbddc3ba62d30212a2", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "2135190b3f01d7fbddc3ba62d30212a2")).booleanValue();
            } else {
                HashMap<String, Long> hashMap = com.sankuai.waimai.platform.capacity.permission.c.b;
                if (hashMap != null && hashMap.size() != 0 && (l = hashMap.get("Locate.once")) != null && l.longValue() > 0) {
                    long b = a3.c.b(com.sankuai.waimai.platform.capacity.permission.c.a("Locate.once"), 0L);
                    if (b != 0 && System.currentTimeMillis() - b <= l.longValue()) {
                        z = true;
                    }
                }
            }
            if (a2 >= 0) {
                if (com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN) || !g.a().b(g.a().p())) {
                    return;
                }
                com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
            } else if (z) {
                if (g.a().b(g.a().p()) || com.sankuai.waimai.platform.model.c.a().c()) {
                    com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
                }
            } else {
                Privacy.createPermissionGuard().a(activity, "Locate.once", "dj-b5e9814e9fb3a8f6", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.page.common.util.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str, int i) {
                        Object[] objArr4 = {str, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3691a8617e3b3d89a895316962efcf2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3691a8617e3b3d89a895316962efcf2");
                            return;
                        }
                        if (com.sankuai.waimai.platform.model.c.a().c()) {
                            com.sankuai.waimai.platform.model.c.a().a(0);
                        }
                        com.sankuai.waimai.platform.capacity.permission.a.a(str, i);
                        if (i > 0) {
                            if (!com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN)) {
                                com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
                                return;
                            } else {
                                g.a().a(new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.business.page.common.util.d.2.1
                                    @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                                    public final void a(@Nullable WmAddress wmAddress) {
                                    }
                                }, true, "CheckPermission", new k(activity, "dj-b5e9814e9fb3a8f6"));
                                return;
                            }
                        }
                        com.sankuai.waimai.platform.capacity.permission.c a4 = com.sankuai.waimai.platform.capacity.permission.c.a();
                        Object[] objArr5 = {str};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.capacity.permission.c.a;
                        if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "a329501364a12a1e8c3be77b0b61b45b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "a329501364a12a1e8c3be77b0b61b45b");
                        } else {
                            a4.c.a(com.sankuai.waimai.platform.capacity.permission.c.a(str), System.currentTimeMillis());
                        }
                        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
                    }
                });
            }
        }
    }
}
