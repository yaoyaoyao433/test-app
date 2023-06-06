package com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;
    public Map<String, Object> b;
    private com.sankuai.waimai.bussiness.order.confirm.a c;

    public a(com.sankuai.waimai.bussiness.order.confirm.a aVar, Map<String, Object> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33186e0535001ef74a9b8aa22c0297c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33186e0535001ef74a9b8aa22c0297c6");
            return;
        }
        this.c = aVar;
        this.b = map;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.e
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9649f49544bcb878ae929d6bba8f01b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9649f49544bcb878ae929d6bba8f01b");
            return;
        }
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce20b9784e698f141695ee723665c4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce20b9784e698f141695ee723665c4fe");
            return;
        }
        if (map.containsKey("state")) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            int a2 = r.a(String.valueOf(map.get("cacheType")), 0);
            Object obj = map.get("state");
            if (a2 == 0) {
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19a09b5f60eee0643b856cd21d3988ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19a09b5f60eee0643b856cd21d3988ea");
                } else {
                    Map<? extends String, ? extends Object> map2 = obj instanceof Map ? (Map) obj : null;
                    if (map2 != null) {
                        this.b.putAll(map2);
                    }
                }
            } else if (a2 == 2) {
                a(obj);
            }
        }
        if (map.containsKey("data")) {
            Object obj2 = map.get("data");
            Object[] objArr4 = {obj2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a6f2c61eb355fdc511e6773da22bcec6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a6f2c61eb355fdc511e6773da22bcec6");
            } else {
                Map<String, Object> map3 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map3 != null) {
                    this.c.ac.a((com.meituan.android.cube.pga.common.b<Map<String, Object>>) map3);
                }
            }
            if (map.containsKey("extra")) {
                Object obj3 = map.get("extra");
                Object[] objArr5 = {obj3};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4a4b3fd8e3cc32a64b6714c2eb2d4c86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4a4b3fd8e3cc32a64b6714c2eb2d4c86");
                } else if (obj3 instanceof Map) {
                    this.c.ae.b((Map) obj3);
                }
            }
            int a3 = r.a(String.valueOf(map.get("isUpdate")), 0);
            if (a3 == 1) {
                this.c.ab.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
            } else if (a3 == 2) {
                this.c.aa.a();
            }
        }
    }

    private void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a9dffa31adc7ed1438498ab2ac800d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a9dffa31adc7ed1438498ab2ac800d");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || "".equals(value)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, (String) null);
            } else if (value instanceof Boolean) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, (String) value);
            } else if (value instanceof Integer) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, ((Long) value).longValue());
            }
        }
    }
}
