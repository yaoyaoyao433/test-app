package com.sankuai.waimai.store.repository.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.CardScenes;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public SpuInfo b;
    public PoiVerticality c;
    public int d;
    public int e;
    public String f;
    public String g;
    public List<CardScenes.CardScene> h;
    public PoiCardInfo i;
    public com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> j;

    public final PoiVerticality a() {
        if (this.c != null) {
            return this.c;
        }
        if (this.i != null) {
            return this.i.poi;
        }
        return null;
    }

    public static List<f> a(List<? extends PoiCardInfo> list) {
        f fVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf47d3cd48b7e88f5a875161b5d4d034", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf47d3cd48b7e88f5a875161b5d4d034");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i = 0; i < a2; i++) {
            PoiCardInfo poiCardInfo = (PoiCardInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            Object[] objArr2 = {poiCardInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "304982d43dad659759ed2e2e1156317e", RobustBitConfig.DEFAULT_VALUE)) {
                fVar = (f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "304982d43dad659759ed2e2e1156317e");
            } else if (poiCardInfo != null) {
                f fVar2 = new f();
                fVar2.b = null;
                fVar2.c = null;
                fVar2.i = poiCardInfo;
                fVar = fVar2;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }
}
