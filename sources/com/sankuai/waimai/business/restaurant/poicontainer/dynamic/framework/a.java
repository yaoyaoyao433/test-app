package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Map<Integer, com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0840a {
        void a(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a aVar);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdeba49f1e302c0dcae3a9c62845611e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdeba49f1e302c0dcae3a9c62845611e");
        } else {
            this.b = new TreeMap();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d39f0c1d4ebd7b92f5a637605ee27a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d39f0c1d4ebd7b92f5a637605ee27a2");
        } else {
            this.b.clear();
        }
    }

    public final void a(int i, com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b28688c9c31ef7f6975ed7153b99ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b28688c9c31ef7f6975ed7153b99ba5");
        } else if (this.b.containsKey(Integer.valueOf(i))) {
            throw new RuntimeException("view id 重复");
        } else {
            this.b.put(Integer.valueOf(i), aVar);
        }
    }

    public final void a(InterfaceC0840a interfaceC0840a) {
        Object[] objArr = {interfaceC0840a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecd143c42002b6fc43e1fa2429c54d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecd143c42002b6fc43e1fa2429c54d91");
            return;
        }
        for (Map.Entry<Integer, com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a> entry : this.b.entrySet()) {
            interfaceC0840a.a(entry.getValue());
        }
    }
}
