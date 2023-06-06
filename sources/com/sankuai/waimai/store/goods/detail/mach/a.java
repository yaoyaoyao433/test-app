package com.sankuai.waimai.store.goods.detail.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.store.goods.list.mach.event.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.poilist.mach.b;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(a aVar, final Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8cd185e2779b3297bb10a1a5af326e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8cd185e2779b3297bb10a1a5af326e0d");
        } else if (map == null || map.get("spu") == null) {
        } else {
            al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.detail.mach.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ GoodsSpu a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48dddd688e461e458ac905281ba45655", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48dddd688e461e458ac905281ba45655") : (GoodsSpu) i.a(i.a(map.get("spu")), GoodsSpu.class);
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    GoodsSpu goodsSpu2 = goodsSpu;
                    Object[] objArr2 = {goodsSpu2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb06c87bb6f7706821c7e14c687d71e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb06c87bb6f7706821c7e14c687d71e9");
                    } else if (goodsSpu2 != null) {
                        g.a(a.this.g, goodsSpu2, a.this.e.b, 2);
                    }
                }
            }, aVar.g.w());
        }
    }

    public a(@NonNull BaseActivity baseActivity, @NonNull d dVar, String str, com.sankuai.waimai.mach.recycler.b bVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(baseActivity, dVar, str, bVar, aVar);
        Object[] objArr = {baseActivity, dVar, str, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dec1bc18549555dc67fea80a752d988", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dec1bc18549555dc67fea80a752d988");
        }
    }

    @Override // com.sankuai.waimai.store.poilist.mach.b
    public final Mach.d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b2c22b661dde8b4c970b5c1f2fc136", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b2c22b661dde8b4c970b5c1f2fc136");
        }
        c cVar = new c();
        cVar.a(new com.sankuai.waimai.store.goods.list.mach.event.b(this.g, this.e)).a(new c() { // from class: com.sankuai.waimai.store.goods.detail.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.mach.event.c
            public final List a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f38d0c81ca9548e31c14776671979f2d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f38d0c81ca9548e31c14776671979f2d") : Arrays.asList("goods_detail_sku_dialog");
            }

            @Override // com.sankuai.waimai.store.goods.list.mach.event.c
            public final void a(String str, Map<String, Object> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e42f3b9e8fddc927e41c71a09567c581", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e42f3b9e8fddc927e41c71a09567c581");
                } else if (t.a(str)) {
                } else {
                    char c = 65535;
                    if (str.hashCode() == 396221103 && str.equals("goods_detail_sku_dialog")) {
                        c = 0;
                    }
                    if (c != 0) {
                        return;
                    }
                    a.a(a.this, map);
                }
            }
        });
        return cVar.b();
    }
}
