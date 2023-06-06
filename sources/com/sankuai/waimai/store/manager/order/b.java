package com.sankuai.waimai.store.manager.order;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.order.c;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.store.config.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {activity, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a055e1f015c979700b10484ea9209c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a055e1f015c979700b10484ea9209c9")).booleanValue() : c.a().checkAccount(activity, j, str, enumC0947a);
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82b43e4ea49466534240e03f372f4e0a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82b43e4ea49466534240e03f372f4e0a")).booleanValue() : j.h().a("order/scheme_order_confirm", true);
    }

    public static void a(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f223cc17c8b282e25379360e9fffe993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f223cc17c8b282e25379360e9fffe993");
        } else if (a()) {
            a(dVar, z ? 2 : 1, "");
        } else {
            c.a().perOrder(dVar);
        }
    }

    public static void a(final d dVar, int i, String str) {
        Object[] objArr = {dVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f88db568c1cf93959b99c6b04a346275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f88db568c1cf93959b99c6b04a346275");
        } else {
            com.sankuai.waimai.foundation.router.a.a().a(new e() { // from class: com.sankuai.waimai.store.manager.order.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull com.sankuai.waimai.router.core.j jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fd7412fe30e428977b24264149e7ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fd7412fe30e428977b24264149e7ce");
                    } else if (d.this.f != null) {
                        d.this.f.setEnabled(true);
                    }
                }

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, int i2) {
                    Object[] objArr2 = {jVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "894a77b6195806346c3e7504aae20544", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "894a77b6195806346c3e7504aae20544");
                    } else if (d.this.f != null) {
                        d.this.f.setEnabled(true);
                    }
                }
            }).a(dVar.b, SchemeFactory.a(dVar, i, str));
        }
    }
}
