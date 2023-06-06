package com.sankuai.waimai.store.poi.list.newp.home;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public final void a(final List<BaseModuleDesc> list, final g gVar, String str, final int i, com.sankuai.waimai.store.poi.list.newp.home.model.a aVar, final com.sankuai.waimai.store.poi.list.newp.home.callback.a aVar2) {
        Object[] objArr = {list, gVar, str, Integer.valueOf(i), aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f847af9f4917223690d60901367c66aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f847af9f4917223690d60901367c66aa");
        } else if (com.sankuai.shangou.stone.util.a.b(list) || gVar == null) {
        } else {
            al.a(new al.b<List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.home.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                @Nullable
                public final /* synthetic */ List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> a() {
                    BaseModuleDesc baseModuleDesc;
                    com.sankuai.waimai.store.poilist.mach.f fVar;
                    Integer num;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b97778b759dbf84eb07601443c69237d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b97778b759dbf84eb07601443c69237d");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        g gVar2 = gVar;
                        BaseModuleDesc baseModuleDesc2 = (BaseModuleDesc) list.get(i2);
                        int i3 = i;
                        Object[] objArr3 = {baseModuleDesc2, Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = g.a;
                        if (PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "82671d0ac695f523f3dfea3907f9a828", RobustBitConfig.DEFAULT_VALUE)) {
                            fVar = (com.sankuai.waimai.store.poilist.mach.f) PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "82671d0ac695f523f3dfea3907f9a828");
                        } else {
                            com.sankuai.waimai.mach.recycler.c cVar = null;
                            if (baseModuleDesc2 == null || t.a(baseModuleDesc2.templateId)) {
                                baseModuleDesc = baseModuleDesc2;
                            } else {
                                int i4 = gVar2.b;
                                if (gVar2.d != null && (num = gVar2.d.h.get(baseModuleDesc2.templateId)) != null) {
                                    Integer num2 = num;
                                    if (num2.intValue() > 0) {
                                        i4 = num2.intValue();
                                    }
                                }
                                baseModuleDesc = baseModuleDesc2;
                                cVar = gVar2.a(i2, baseModuleDesc2, baseModuleDesc2.moduleId, i4, i3);
                            }
                            fVar = new com.sankuai.waimai.store.poilist.mach.f(baseModuleDesc, cVar);
                        }
                        arrayList.add(fVar);
                    }
                    return arrayList;
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2) {
                    List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "376ccafe7ea6d8b4df3ac5a69fda2b7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "376ccafe7ea6d8b4df3ac5a69fda2b7e");
                    } else if (aVar2 != null) {
                        aVar2.a(list3);
                    }
                }
            }, str);
        }
    }
}
