package com.sankuai.waimai.store.mach.page.mach;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.TileList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.mach.recycler.b b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c2f7dfaac5ceac09cb19d6f6b2b70b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c2f7dfaac5ceac09cb19d6f6b2b70b");
        } else {
            this.b = new com.sankuai.waimai.mach.recycler.b("supermarket");
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map<java.lang.String, java.lang.Object>, T] */
    public final List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> a(SCBaseActivity sCBaseActivity, String str, TileList tileList, Map<String, Object> map, String str2) {
        int i;
        Object obj;
        Object[] objArr = {sCBaseActivity, str, tileList, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b759728b2af50e0194109bd1fe492e85", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b759728b2af50e0194109bd1fe492e85");
        }
        ArrayList arrayList = new ArrayList();
        if (sCBaseActivity == null || tileList == null) {
            return arrayList;
        }
        List<BaseModuleDesc> list = tileList.itemList;
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return arrayList;
        }
        com.sankuai.waimai.mach.recycler.b bVar = this.b;
        int a2 = com.sankuai.waimai.foundation.utils.g.a((Context) sCBaseActivity);
        int i2 = 0;
        while (i2 < com.sankuai.waimai.foundation.utils.b.c(list)) {
            BaseModuleDesc baseModuleDesc = (BaseModuleDesc) com.sankuai.waimai.foundation.utils.b.a(list, i2);
            if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                com.sankuai.waimai.store.mach.page.d dVar = new com.sankuai.waimai.store.mach.page.d();
                dVar.b = 3;
                if (!t.a(str)) {
                    dVar.c = str;
                } else if (!t.a(baseModuleDesc.templateId)) {
                    dVar.c = baseModuleDesc.templateId;
                }
                dVar.d = baseModuleDesc.jsonData;
                if (map != null && (obj = map.get("current_page_start")) != null) {
                    try {
                        map.put("index", Integer.valueOf(((Integer) obj).intValue() + i2));
                    } catch (Exception unused) {
                    }
                }
                i = i2;
                try {
                    MachCommonData a3 = f.a(dVar, bVar, sCBaseActivity, a2, map, null, str2);
                    if (a3 != null) {
                        arrayList.add(dVar.a(a3));
                    }
                } catch (Exception unused2) {
                }
                i2 = i + 1;
            }
            i = i2;
            i2 = i + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map<java.lang.String, java.lang.Object>, T] */
    public final List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> a(SCBaseActivity sCBaseActivity, String str, List<BaseModuleDesc> list, Map<String, Object> map, String str2) {
        int i;
        Object obj;
        Object[] objArr = {sCBaseActivity, str, list, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6959a479dbd9b1359e697cae95112d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6959a479dbd9b1359e697cae95112d");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.b.b(list) || sCBaseActivity == null) {
            return arrayList;
        }
        com.sankuai.waimai.mach.recycler.b bVar = this.b;
        int a2 = com.sankuai.waimai.foundation.utils.g.a((Context) sCBaseActivity);
        int i2 = 0;
        while (i2 < com.sankuai.waimai.foundation.utils.b.c(list)) {
            BaseModuleDesc baseModuleDesc = (BaseModuleDesc) com.sankuai.waimai.foundation.utils.b.a(list, i2);
            if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                com.sankuai.waimai.store.mach.page.d dVar = new com.sankuai.waimai.store.mach.page.d();
                dVar.b = 3;
                if (!t.a(str)) {
                    dVar.c = str;
                } else if (!t.a(baseModuleDesc.templateId)) {
                    dVar.c = baseModuleDesc.templateId;
                }
                dVar.d = baseModuleDesc.jsonData;
                if (map != null && (obj = map.get("current_page_start")) != null) {
                    try {
                        map.put("index", Integer.valueOf(((Integer) obj).intValue() + i2));
                    } catch (Exception unused) {
                    }
                }
                i = i2;
                try {
                    MachCommonData a3 = f.a(dVar, bVar, sCBaseActivity, a2, map, null, str2);
                    if (a3 != null) {
                        arrayList.add(dVar.a(a3));
                    }
                } catch (Exception unused2) {
                }
                i2 = i + 1;
            }
            i = i2;
            i2 = i + 1;
        }
        return arrayList;
    }
}
