package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.poilist.mach.b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.delegate.d b;

    public d(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.mach.d dVar, String str, com.sankuai.waimai.mach.recycler.b bVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(baseActivity, dVar, str, bVar, aVar);
        Object[] objArr = {baseActivity, dVar, str, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76562aa6b7e4e6502169f35dbf5e63a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76562aa6b7e4e6502169f35dbf5e63a7");
        }
    }

    @Override // com.sankuai.waimai.store.poilist.mach.b
    public final Mach.d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1361f0cf08934c200fc46cd0086612", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1361f0cf08934c200fc46cd0086612");
        }
        com.sankuai.waimai.store.goods.list.mach.event.c cVar = new com.sankuai.waimai.store.goods.list.mach.event.c();
        cVar.a(new com.sankuai.waimai.store.goods.list.mach.event.b(this.g, this.e)).a(new com.sankuai.waimai.store.goods.list.mach.event.a(this.b, this.g, this.e != null ? this.e.d() : "-1")).a(new com.sankuai.waimai.store.goods.list.mach.event.c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.mach.event.c
            public final List a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3869795a6fddc96e833129f1f073f401", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3869795a6fddc96e833129f1f073f401") : Arrays.asList("std_trigger_expose_event", "goods_detail_load_shopcart_account");
            }

            @Override // com.sankuai.waimai.store.goods.list.mach.event.c
            public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c10a3827fbd982cdc0e9fa64bb98264d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c10a3827fbd982cdc0e9fa64bb98264d");
                    return;
                }
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 657114658) {
                    if (hashCode == 1491140376 && str.equals("goods_detail_load_shopcart_account")) {
                        c = 1;
                    }
                } else if (str.equals("std_trigger_expose_event")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        if (d.this.d == null || d.this.d.l() == null) {
                            return;
                        }
                        com.sankuai.waimai.mach.node.a rootNode = d.this.d.l().getRootNode();
                        d dVar = d.this;
                        Object[] objArr3 = {rootNode};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poilist.mach.b.c;
                        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "ad8203c1a81890f7d919775c8caf937d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "ad8203c1a81890f7d919775c8caf937d");
                            return;
                        } else if (rootNode == null || !(rootNode.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
                            return;
                        } else {
                            if (com.sankuai.waimai.store.mach.a.a(rootNode)) {
                                dVar.a(rootNode);
                            }
                            List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) rootNode.h).e();
                            List<com.sankuai.waimai.mach.node.a> b = rootNode.b();
                            if (com.sankuai.shangou.stone.util.a.b(e) || com.sankuai.shangou.stone.util.a.b(b)) {
                                return;
                            }
                            for (Integer num : e) {
                                com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b, num.intValue());
                                if (aVar != null && aVar.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar)) {
                                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                                    com.sankuai.waimai.store.mach.a.a(aVar, arrayList);
                                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                        for (com.sankuai.waimai.mach.node.a aVar2 : arrayList) {
                                            dVar.a(aVar2);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                    case 1:
                        if (d.this.j != null) {
                            d.this.j.a(d.this.d);
                            return;
                        }
                        return;
                    default:
                        super.a(str, map);
                        return;
                }
            }
        });
        return cVar.b();
    }
}
