package com.sankuai.waimai.business.page.common.list.ai;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String d = "c";
    public int b;
    public int c;
    private int e;
    private com.sankuai.waimai.rocks.view.recyclerview.b f;

    public c(com.sankuai.waimai.rocks.view.recyclerview.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df16f31c6a8304780226b44e61a02944", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df16f31c6a8304780226b44e61a02944");
            return;
        }
        this.e = 0;
        this.b = 0;
        this.c = 0;
        this.f = bVar;
    }

    public final void a() {
        this.c = 0;
        this.b = 0;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ace50ada6de443cb2e5097a7db34efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ace50ada6de443cb2e5097a7db34efa");
            return;
        }
        if (i > this.c) {
            this.c = i;
        }
        String str = d;
        com.sankuai.waimai.foundation.utils.log.a.b(str, "CurExposeIndex: " + this.e + " MaxExposedIndex: " + this.b + "  mMaxExposePoiIndex: " + this.c, new Object[0]);
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da59a38b8bfca378b5dabf71c6ba2364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da59a38b8bfca378b5dabf71c6ba2364");
            return;
        }
        this.e = i;
        if (this.e > this.b) {
            this.b = this.e;
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f70f5715421f5cd7e1163ef617e7db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f70f5715421f5cd7e1163ef617e7db")).intValue();
        }
        if (this.f != null) {
            return this.f.u();
        }
        return 0;
    }

    public final com.sankuai.waimai.rocks.view.viewmodel.e c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d911668b63d8934d9092f1bb2ebf82", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.viewmodel.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d911668b63d8934d9092f1bb2ebf82");
        }
        if (this.f == null || this.f.G() == null || this.f.G().o == null || i < 0 || i >= this.f.u()) {
            return null;
        }
        return this.f.G().o.get(i);
    }

    public final List<String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89b8807fb807b721aad4f0bbd700a49", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89b8807fb807b721aad4f0bbd700a49");
        }
        com.sankuai.waimai.rocks.view.viewmodel.d G = this.f.G();
        if (G == null || com.sankuai.waimai.modular.utils.a.a(G.o)) {
            return null;
        }
        return a(true, G.o.size() - 1);
    }

    public final List<String> a(com.sankuai.waimai.mach.node.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b980220604efcfd7403c96c05855a867", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b980220604efcfd7403c96c05855a867") : a(z, this.f.g.getChildViewHolder(aVar.c().f.getContainer()).getAdapterPosition());
    }

    private List<String> a(boolean z, int i) {
        Map<String, Object> map;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36e463449f48892e0ad835eccfda711", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36e463449f48892e0ad835eccfda711");
        }
        com.sankuai.waimai.rocks.view.viewmodel.d G = this.f.G();
        if (G == null || com.sankuai.waimai.modular.utils.a.a(G.o)) {
            return null;
        }
        List<com.sankuai.waimai.rocks.view.viewmodel.e> list = G.o;
        int i2 = i - 20;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i + 20;
        if (i3 >= list.size()) {
            i3 = list.size() - 1;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 <= i3) {
            com.sankuai.waimai.rocks.view.viewmodel.e eVar = G.o.get(i2);
            if (eVar != null) {
                if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.c) {
                    com.sankuai.waimai.rocks.view.viewmodel.c cVar = (com.sankuai.waimai.rocks.view.viewmodel.c) eVar;
                    if (cVar.q != null) {
                        map = cVar.q.g;
                        if (map.containsKey("interactiveCardId") && (map.get("interactiveCardId") instanceof List)) {
                            arrayList.addAll((List) map.get("interactiveCardId"));
                        }
                        if (!z && !arrayList.contains(eVar.s.e)) {
                            arrayList.add(eVar.s.e);
                        }
                    }
                }
                map = eVar.g;
                if (map.containsKey("interactiveCardId")) {
                    arrayList.addAll((List) map.get("interactiveCardId"));
                }
                if (!z) {
                    arrayList.add(eVar.s.e);
                }
            }
            i2++;
        }
        return arrayList;
    }
}
