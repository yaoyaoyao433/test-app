package com.sankuai.waimai.drug.patch.block.v2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.drug.patch.block.v2.c;
import com.sankuai.waimai.store.drug.newwidgets.PrioritySmoothNestedScrollView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends com.sankuai.waimai.store.base.b implements g {
    public static ChangeQuickRedirect a;
    public c b;
    public b c;
    public com.sankuai.waimai.drug.patch.block.v2.spulist.a d;
    public PrioritySmoothNestedScrollView e;
    public final com.sankuai.waimai.drug.contract.b f;
    public RecyclerView g;
    private final com.sankuai.waimai.drug.patch.contract.a h;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a i;
    private final com.sankuai.waimai.drug.patch.contract.c j;

    public h(com.sankuai.waimai.drug.contract.b bVar, @NonNull @NotNull Context context, com.sankuai.waimai.drug.patch.contract.a aVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2, com.sankuai.waimai.drug.patch.contract.c cVar) {
        super(context);
        Object[] objArr = {bVar, context, aVar, aVar2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b75da1cf25e40e6c122fff3eb44e02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b75da1cf25e40e6c122fff3eb44e02");
            return;
        }
        this.h = aVar;
        this.i = aVar2;
        this.j = cVar;
        this.f = bVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c7d8433e8d5e1e514da107dc6c1f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c7d8433e8d5e1e514da107dc6c1f02");
            return;
        }
        this.e = (PrioritySmoothNestedScrollView) this.mView.findViewById(R.id.new_rv_patchwork_list_v2);
        this.e.setIsVertical(true);
        this.b = new c(getContext(), this);
        c cVar = this.b;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        cVar.f = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4502bc408b041ef7a502b45ed952b4ed", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4502bc408b041ef7a502b45ed952b4ed") : new i(this);
        this.b.createAndReplaceView((ViewGroup) this.mView.findViewById(R.id.collect_view));
        this.c = new b(getContext(), this);
        this.c.createAndReplaceView((ViewGroup) this.mView.findViewById(R.id.pinned_view));
        this.g = (RecyclerView) this.mView.findViewById(R.id.spu_list);
        this.g.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.drug.patch.block.v2.h.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca9f205b8657b17a973ee0787f82e236", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca9f205b8657b17a973ee0787f82e236");
                } else {
                    h.this.c.a(q.d(h.this.g));
                }
            }
        });
        this.d = new com.sankuai.waimai.drug.patch.block.v2.spulist.a(getContext(), this);
        this.d.bindView(this.g);
    }

    public int a(com.sankuai.waimai.drug.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d372766d4f27d6e6aadcdd241e4b5e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d372766d4f27d6e6aadcdd241e4b5e7")).intValue();
        }
        if (bVar != null && com.sankuai.shangou.stone.util.a.a((List) bVar.b) > 0) {
            return com.sankuai.shangou.stone.util.h.a(this.mContext, 86.0f);
        }
        return 0;
    }

    @Override // com.sankuai.waimai.drug.patch.block.v2.g
    public final com.sankuai.waimai.drug.patch.contract.c a() {
        return this.j;
    }

    @Override // com.sankuai.waimai.drug.patch.block.v2.g
    public final com.sankuai.waimai.drug.patch.contract.a b() {
        return this.h;
    }

    @Override // com.sankuai.waimai.drug.patch.block.v2.g
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.drug.patch.block.v2.g
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddd38809bba1b0bb15f8db9dd8446d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddd38809bba1b0bb15f8db9dd8446d4");
            return;
        }
        com.sankuai.waimai.drug.model.c a2 = this.c.a(i);
        if (a2 != null) {
            com.sankuai.waimai.drug.patch.contract.a aVar = this.h;
            b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            aVar.a(PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3c8a33f17a3fa2f7506d6019980240e7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3c8a33f17a3fa2f7506d6019980240e7")).intValue() : bVar.b.getItemCount(), a2.a, i);
            this.d.a(a2);
        }
    }
}
