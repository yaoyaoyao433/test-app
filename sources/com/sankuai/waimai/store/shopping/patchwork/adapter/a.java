package com.sankuai.waimai.store.shopping.patchwork.adapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.widgets.recycler.a<e> {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final d b;
    private final List<GoodsSpu> c;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(e eVar, int i) {
        e eVar2 = eVar;
        Object[] objArr = {eVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37a2fe7c9cb0c00fa8442995cc56b14b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37a2fe7c9cb0c00fa8442995cc56b14b");
        } else if (eVar2 != null) {
            GoodsSpu b = b(i);
            Object[] objArr2 = {b, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "831306dc582773fd48522096e26501cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "831306dc582773fd48522096e26501cc");
            } else if (b != null) {
                eVar2.b.a(b, i);
            }
        }
    }

    public a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00739eb2f0682efe65cda0166895a301", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00739eb2f0682efe65cda0166895a301");
            return;
        }
        this.c = new ArrayList();
        this.b = dVar;
        a(new com.sankuai.waimai.store.widgets.recycler.c() { // from class: com.sankuai.waimai.store.shopping.patchwork.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.c
            public final void a(com.sankuai.waimai.store.widgets.recycler.a aVar, com.sankuai.waimai.store.widgets.recycler.e eVar, int i, int i2, int i3) {
                Object[] objArr2 = {aVar, eVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82491c00f3ae80b639066f23ea965036", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82491c00f3ae80b639066f23ea965036");
                } else {
                    a.this.b.a(a.this.b(i3), i3);
                }
            }
        });
    }

    public final GoodsSpu b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13de57e2045a4e5c443902c2b6224abc", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13de57e2045a4e5c443902c2b6224abc") : (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
    }

    public final void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901c94b0beb951e7e2d654c733b27c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901c94b0beb951e7e2d654c733b27c28");
            return;
        }
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        m();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb308c33b809d2f3875f9c8d574cd9b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb308c33b809d2f3875f9c8d574cd9b")).intValue() : this.c.size();
    }
}
