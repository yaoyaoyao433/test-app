package com.sankuai.waimai.bussiness.order.detailnew.im;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(long j, short s, String str, d.a aVar) {
        Object[] objArr = {new Long(j), Short.valueOf(s), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bcaa7a3d38e88a3805fdfa482bb3e43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bcaa7a3d38e88a3805fdfa482bb3e43");
        } else {
            b.a().a((short) 1001, j, 0L, s, str, aVar);
        }
    }

    public static void b(long j, short s, String str, d.a aVar) {
        Object[] objArr = {new Long(j), (short) 0, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b656f97d9ab085d8d0e2eeface106d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b656f97d9ab085d8d0e2eeface106d32");
        } else {
            b.a().a((short) 1050, j, 0L, (short) 0, str, aVar);
        }
    }

    public static void a(Activity activity, long j, RiderInfo.b bVar, String str) {
        Object[] objArr = {activity, new Long(j), bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf3d0ac07d8c3ef10615978e8f3f1516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf3d0ac07d8c3ef10615978e8f3f1516");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putShort("rider_app_id", (short) bVar.d);
        com.sankuai.waimai.business.im.api.a.a().a(activity, (SessionId) null, j, str, 4, bVar.e, false, false, bundle);
    }

    public static void a(Activity activity, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z, @NonNull e eVar, com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        Object[] objArr = {activity, 3, new Long(j), new Long(j2), str, 0L, 10, str2, (byte) 0, eVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c365d7fe96477b5f50b284e2e54d6f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c365d7fe96477b5f50b284e2e54d6f2c");
            return;
        }
        a(eVar, eVar.f, bVar);
        com.sankuai.waimai.business.im.api.a.a().a(activity, null, 3, j, j2, str, 0L, 10, str2, false, eVar.f);
    }

    public static void a(Activity activity, long j, long j2, String str, int i, String str2, boolean z, boolean z2, int i2, final com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        Object[] objArr = {activity, new Long(j), new Long(j2), str, 10, str2, (byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b44ad7a433589198d3d016dd6470082d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b44ad7a433589198d3d016dd6470082d");
        } else if (activity.isFinishing()) {
        } else {
            int i3 = z2 ? 2 : 0;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("new_message_badge", Integer.valueOf(i3));
            hashMap.put("custom", hashMap2);
            hashMap.put("index", Integer.valueOf(i2));
            JudasManualManager.a("b_waimai_j01spip8_mc").a("c_hgowsqb").a((Map<String, Object>) hashMap).a(activity).a();
            b.a aVar2 = new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.im.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.api.b.a
                public final void a(boolean z3) {
                    Object[] objArr2 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "188e6cef4ccb8335c1125384b5af62c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "188e6cef4ccb8335c1125384b5af62c9");
                    } else if (z3 || com.sankuai.waimai.business.order.api.detail.block.a.this == null) {
                    } else {
                        com.sankuai.waimai.business.order.api.detail.block.a.this.a(true);
                    }
                }
            };
            Object[] objArr2 = {activity, new Long(j), new Long(j2), str, 10, 1, str2, (byte) 0, aVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "867b27fd1df2f8fe62af36eeb391bf12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "867b27fd1df2f8fe62af36eeb391bf12");
                return;
            }
            com.sankuai.waimai.business.im.api.a a2 = com.sankuai.waimai.business.im.api.a.a();
            Object[] objArr3 = {activity, new Long(j), new Long(j2), str, str2, 10, 1, (byte) 0, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.api.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "ce4bca07ae9e0dc5ce2f5ac31857bc3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "ce4bca07ae9e0dc5ce2f5ac31857bc3b");
            } else if (a2.b != null) {
                a2.b.a(activity, j, j2, str, str2, 10, 1, false, aVar2, 0);
            }
        }
    }

    public static void a(int i, Object obj) {
        Object[] objArr = {0, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4826c65dce9299dbced6973ca4e2a462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4826c65dce9299dbced6973ca4e2a462");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", 0);
        JudasManualManager.b("b_waimai_gyt2rom9_mv").a("c_hgowsqb").a((Map<String, Object>) hashMap).a(obj).a();
    }

    @NonNull
    public static Bundle a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar, e eVar) {
        Object[] objArr = {bVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53c6d99fa1eaf852d3346e9c0a18d8b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53c6d99fa1eaf852d3346e9c0a18d8b6");
        }
        Bundle bundle = new Bundle();
        if (bVar != null) {
            if (bVar.m != null) {
                bundle.putString("status_desc", bVar.m.b);
            }
            if (bVar.l != null) {
                bundle.putLong("delivery_time", bVar.l.m);
                bundle.putInt("status", bVar.l.e);
            }
            long j = 0;
            try {
                j = Long.parseLong(bVar.b);
            } catch (NumberFormatException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            bundle.putLong("order_view_id", j);
        }
        bundle.putDouble("total", eVar.b);
        bundle.putLong("order_time", eVar.c);
        bundle.putString("food_desc", eVar.d);
        return bundle;
    }

    private static void a(e eVar, @Nullable Bundle bundle, @Nullable com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        boolean z = false;
        Object[] objArr = {eVar, bundle, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "527dbd61db89997c88236b23085baa36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "527dbd61db89997c88236b23085baa36");
        } else if (bundle == null || bVar == null || eVar.e == null || bVar.l == null) {
        } else {
            if (eVar.e.b <= 0) {
                bundle.putBoolean("show_remind", true);
            } else if (eVar.e.a != bVar.l.m) {
            } else {
                long j = bVar.l.i + (eVar.e.c * 60);
                long b = c.b() / 1000;
                bundle.putBoolean("show_remind", (b > j || b > bVar.l.m) ? true : true);
            }
        }
    }
}
