package com.sankuai.waimai.mach.render;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.mach.render.c
    public final void a(com.sankuai.waimai.mach.model.b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc751cfb68bb8796c7fb6941a262a928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc751cfb68bb8796c7fb6941a262a928");
        } else {
            bVar.a(i, i2);
        }
    }

    @Override // com.sankuai.waimai.mach.render.a
    public List<Class<? extends com.sankuai.waimai.mach.component.base.a>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f0fc3a34d35044c4960b13bd1c761d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f0fc3a34d35044c4960b13bd1c761d");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.sankuai.waimai.mach.component.swiper.b.class);
        arrayList.add(com.sankuai.waimai.mach.component.scroller.b.class);
        return arrayList;
    }
}
