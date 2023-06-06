package com.sankuai.waimai.drug.patch.block.v2.spulist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.w;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.patch.adapter.DrugPatchworkListSpuCell;
import com.sankuai.waimai.drug.patch.block.v2.g;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.recycler.c;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    final List<GoodsSpu> b;
    public com.sankuai.waimai.store.widgets.recycler.a<com.sankuai.waimai.drug.patch.viewHolder.b> c;
    protected com.sankuai.waimai.store.expose.a<Integer> d;
    public PriceOptAB e;
    final g f;
    String g;

    public a(@NonNull @NotNull Context context, g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0ca665d955b1f6c81f888dd6753e38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0ca665d955b1f6c81f888dd6753e38");
            return;
        }
        this.b = new ArrayList();
        this.f = gVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        w wVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82ff814ec6f84e685a951ec241b8413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82ff814ec6f84e685a951ec241b8413");
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.mView;
        this.d = new com.sankuai.waimai.store.expose.a<Integer>() { // from class: com.sankuai.waimai.drug.patch.block.v2.spulist.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, Integer num) {
                GoodsSpu goodsSpu;
                Integer num2 = num;
                Object[] objArr2 = {view, num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f91056189edd43a8271c9decb9260e0d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f91056189edd43a8271c9decb9260e0d")).booleanValue();
                }
                if (view != null && num2 != null && (goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, num2.intValue())) != null && a.this.f.b() != null) {
                    a.this.f.b().a(goodsSpu, num2.intValue(), a.this.g);
                }
                return true;
            }
        };
        this.mView.setBackground(e.b(getContext(), (int) R.color.wm_st_common_white, (int) R.dimen.wm_sc_common_dimen_12));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c = new com.sankuai.waimai.store.widgets.recycler.a<com.sankuai.waimai.drug.patch.viewHolder.b>() { // from class: com.sankuai.waimai.drug.patch.block.v2.spulist.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final int a(int i) {
                return 0;
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final /* synthetic */ void a(com.sankuai.waimai.drug.patch.viewHolder.b bVar, int i) {
                com.sankuai.waimai.drug.patch.viewHolder.b bVar2 = bVar;
                Object[] objArr2 = {bVar2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d324528296991dae83e0a7a8e7e6f353", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d324528296991dae83e0a7a8e7e6f353");
                    return;
                }
                GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, i);
                if (goodsSpu != null) {
                    goodsSpu.mPriceOptAB = a.this.e;
                    a.this.d.b(bVar2.itemView, Integer.valueOf(i));
                    bVar2.a(goodsSpu, a.this.g, i);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fec3a6a78efb420b094b9c423a079909", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fec3a6a78efb420b094b9c423a079909")).intValue() : com.sankuai.shangou.stone.util.a.a((List) a.this.b);
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
                Object[] objArr2 = {viewGroup, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc4393cbedd96d5de6bf2b4ae5eab718", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc4393cbedd96d5de6bf2b4ae5eab718") : new com.sankuai.waimai.drug.patch.viewHolder.b(new DrugPatchworkListSpuCell(viewGroup.getContext()), a.this.f.a(), null);
            }
        };
        this.c.a(new c() { // from class: com.sankuai.waimai.drug.patch.block.v2.spulist.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.c
            public final void a(com.sankuai.waimai.store.widgets.recycler.a aVar, com.sankuai.waimai.store.widgets.recycler.e eVar, int i, int i2, int i3) {
                Object[] objArr2 = {aVar, eVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb7133cd089591dbee31dbda3819e36f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb7133cd089591dbee31dbda3819e36f");
                } else if (a.this.f.a() != null) {
                    a.this.f.a().a((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, i3), a.this.g, i3);
                }
            }
        });
        recyclerView.setAdapter(new l(this.c));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46cbdc3f80f0e4a31ad8185b03ba13bf", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46cbdc3f80f0e4a31ad8185b03ba13bf");
        } else {
            wVar = new w(getContext(), 1);
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.wm_drug_recyclerview_divider);
            if (drawable != null) {
                wVar.a(drawable);
            }
        }
        recyclerView.addItemDecoration(wVar);
    }

    public final void a(com.sankuai.waimai.drug.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1f808d13ed88fba9bbb8c1dc124421b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1f808d13ed88fba9bbb8c1dc124421b");
            return;
        }
        a();
        this.b.clear();
        if (cVar != null && !com.sankuai.shangou.stone.util.a.b(cVar.b)) {
            this.b.addAll(cVar.b);
        }
        if (cVar == null) {
            this.g = "";
        } else {
            this.g = cVar.a;
        }
        this.c.m();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb16d44707a554152689bbbc1ab7a40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb16d44707a554152689bbbc1ab7a40");
        } else {
            this.d.a();
        }
    }
}
