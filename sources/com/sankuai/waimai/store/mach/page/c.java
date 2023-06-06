package com.sankuai.waimai.store.mach.page;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.mach.page.mach.MachCommonData;
import com.sankuai.waimai.store.mach.page.mach.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.widgets.recycler.b<com.sankuai.waimai.store.widgets.recycler.e> {
    public static ChangeQuickRedirect a;
    public List<d<?>> b;
    private Context c;

    public c(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d15bc482522636926ef51b0bfcc42a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d15bc482522636926ef51b0bfcc42a9");
            return;
        }
        this.b = new ArrayList();
        this.c = context;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11e6f2759ae190c284922ede7b0f7b5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11e6f2759ae190c284922ede7b0f7b5")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    public final d<?> b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df5c76c85135f4e120571745f701091", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df5c76c85135f4e120571745f701091") : (d) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfda92951536e16b9de480eb3b8752f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfda92951536e16b9de480eb3b8752f7")).intValue();
        }
        d<?> b = b(i);
        if (b == null) {
            return super.e(i);
        }
        return b.b;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f78d80234d833fec81bc7ae9ffb869", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f78d80234d833fec81bc7ae9ffb869") : new a(new h(this.c), viewGroup);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59cc9e8b3839926c572ac359e751920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59cc9e8b3839926c572ac359e751920");
            return;
        }
        d dVar = (d) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            Object[] objArr2 = {dVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "eb6446d8785113f312efdc0c64d60978", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "eb6446d8785113f312efdc0c64d60978");
            } else if (dVar == null || p.a(dVar.d)) {
            } else {
                aVar.b.a(i, (MachCommonData) dVar.d, dVar.e);
            }
        }
    }

    public final void a(ArrayList<d<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc795bc06e30b5d3cead3be74182824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc795bc06e30b5d3cead3be74182824");
            return;
        }
        this.b.clear();
        if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
            this.b.addAll(arrayList);
        }
        m();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.poilist.viewholders.a {
        public static ChangeQuickRedirect a;
        public h b;

        public a(@NonNull h hVar, ViewGroup viewGroup) {
            super(hVar.a(viewGroup));
            Object[] objArr = {c.this, hVar, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1348069dc4bd809d93099ef804903e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1348069dc4bd809d93099ef804903e");
            } else {
                this.b = hVar;
            }
        }
    }
}
