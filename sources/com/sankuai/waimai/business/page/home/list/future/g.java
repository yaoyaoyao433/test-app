package com.sankuai.waimai.business.page.home.list.future;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.platform.widget.tag.virtualtag.j;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    int b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9d435d65dbc4fc305367a0c1a2b5b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9d435d65dbc4fc305367a0c1a2b5b3");
        } else {
            this.b = 0;
        }
    }

    public static /* synthetic */ void a(g gVar, com.sankuai.waimai.mach.node.a aVar, Map map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "2841e13b34804bda58dbb20565287b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "2841e13b34804bda58dbb20565287b57");
        } else if (aVar == null || !aVar.h().containsKey("show-label-count")) {
        } else {
            gVar.b = 0;
            if (!(aVar.h instanceof com.sankuai.waimai.platform.mach.tag.a)) {
                com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.business.page.home.list.future.g.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                    public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                        boolean a2;
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb9b9fd9341598dc74709e85a6c47371", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb9b9fd9341598dc74709e85a6c47371");
                        } else if (aVar2 == null || aVar2.h() == null || !aVar2.h().containsKey("is-label")) {
                        } else {
                            g gVar2 = g.this;
                            Object[] objArr3 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = g.a;
                            if (PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "8065e90db6e1eca45c2dbbf0a107b9af", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = ((Boolean) PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "8065e90db6e1eca45c2dbbf0a107b9af")).booleanValue();
                            } else {
                                int a3 = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 2.0f);
                                com.sankuai.waimai.mach.node.a aVar3 = aVar2.e;
                                a2 = aVar3 != null ? com.sankuai.waimai.mach.node.a.a(aVar3, aVar2, a3) : true;
                            }
                            if (a2) {
                                g.this.b++;
                            }
                        }
                    }
                });
            } else {
                com.sankuai.waimai.platform.widget.tag.virtualtag.g gVar2 = ((com.sankuai.waimai.platform.mach.tag.a) aVar.h).b;
                if (gVar2 == null) {
                    return;
                }
                List<j> b = gVar2.b();
                if (com.sankuai.waimai.foundation.utils.d.a(b) || b.get(0) == null || com.sankuai.waimai.foundation.utils.d.a(b.get(0).d())) {
                    return;
                }
                gVar.b = b.get(0).d().size();
            }
            map.put(aVar.h().get("show-label-count").toString(), Integer.valueOf(gVar.b));
        }
    }
}
