package com.sankuai.waimai.store.mach.page.mach;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.platform.mach.monitor.a b = new com.sankuai.waimai.platform.mach.monitor.a("sg-mach-container");

    public static MachCommonData a(@NonNull com.sankuai.waimai.store.mach.page.d dVar, com.sankuai.waimai.mach.recycler.b bVar, SCBaseActivity sCBaseActivity, int i, Map<String, Object> map, Map<String, Object> map2, String str) {
        com.sankuai.waimai.store.mach.page.event.d a2;
        Object[] objArr = {dVar, bVar, sCBaseActivity, Integer.valueOf(i), map, map2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64a6e4f48c50089380bfb17882f80068", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachCommonData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64a6e4f48c50089380bfb17882f80068");
        }
        if (TextUtils.isEmpty(dVar.c) || (a2 = a(bVar, dVar, sCBaseActivity, "supermarket", i, map, map2, str)) == null || a2.b() == null) {
            return null;
        }
        MachCommonData machCommonData = new MachCommonData(a2);
        machCommonData.setMachLogicList(bVar);
        return machCommonData;
    }

    private static com.sankuai.waimai.store.mach.page.event.d a(@NonNull com.sankuai.waimai.mach.recycler.b bVar, @Nullable com.sankuai.waimai.store.mach.page.d dVar, @NonNull BaseActivity baseActivity, String str, int i, Map<String, Object> map, Map<String, Object> map2, String str2) {
        Map<String, Object> hashMap;
        Object[] objArr = {bVar, dVar, baseActivity, str, Integer.valueOf(i), map, map2, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c832d3e642ef9bda3cead3fcf4ee54c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.mach.page.event.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c832d3e642ef9bda3cead3fcf4ee54c8");
        }
        if (dVar == null || TextUtils.isEmpty(dVar.c)) {
            return null;
        }
        try {
            com.sankuai.waimai.mach.recycler.h a2 = bVar.a(dVar.c, dVar.c, "sg-mach-container", 5000);
            if (a2 == null || baseActivity.isDestroyed()) {
                return null;
            }
            Map<String, Object> map3 = (Map) dVar.d;
            if (map != null) {
                map.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
                if (map3 != null) {
                    map3.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, map);
                }
            }
            if (map3 != null && map2 != null) {
                map3.putAll(map2);
            }
            e eVar = new e(baseActivity, str2);
            c cVar = new c(baseActivity, "sg", baseActivity.w());
            g gVar = new g(dVar.c, b);
            Object[] objArr2 = {gVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "cf4d5a9ddcfb3310b94cb64b331b1475", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "cf4d5a9ddcfb3310b94cb64b331b1475");
            } else {
                cVar.c.f = gVar;
            }
            Object[] objArr3 = {eVar};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "313ea213f263e531d63207f0d75c6047", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "313ea213f263e531d63207f0d75c6047");
            } else {
                cVar.c.d = eVar;
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f676f73a44cec1ab26b5d2b6accf3025", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f676f73a44cec1ab26b5d2b6accf3025");
            } else {
                hashMap = new HashMap<>();
                hashMap.put("product_channel", "sg");
            }
            Object[] objArr5 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "bf5db29b6a1ae45ab3fd61288f2bedf5", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "bf5db29b6a1ae45ab3fd61288f2bedf5");
            } else {
                cVar.c.n = hashMap;
            }
            b bVar2 = new b();
            Object[] objArr6 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect6 = c.a;
            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "e744e903696ed8e51a711643bca712be", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "e744e903696ed8e51a711643bca712be");
            } else {
                cVar.c.l = bVar2;
            }
            try {
                final com.sankuai.waimai.store.mach.page.event.d dVar2 = new com.sankuai.waimai.store.mach.page.event.d(dVar.c, a2, cVar.a(), "sg-mach-container", str);
                dVar2.h = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.store.mach.page.mach.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.f
                    public final void a() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bd950d5b1b7e49b046e5e25633ed0852", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bd950d5b1b7e49b046e5e25633ed0852");
                        } else {
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mach.page.event.g(com.sankuai.waimai.store.mach.page.event.d.this));
                        }
                    }
                };
                bVar.a(baseActivity, dVar2, i, 0, map3, "sg-mach-container");
                return dVar2;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
