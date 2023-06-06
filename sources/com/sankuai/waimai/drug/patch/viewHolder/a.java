package com.sankuai.waimai.drug.patch.viewHolder;

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
import com.sankuai.waimai.drug.patch.contract.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.widgets.recycler.e;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public final List<GoodsSpu> b;
    public com.sankuai.waimai.store.widgets.recycler.a<b> c;
    @NonNull
    protected final com.sankuai.waimai.store.expose.a<Integer> d;
    public PriceOptAB e;
    private RecyclerView f;
    @NonNull
    private final c g;
    private com.sankuai.waimai.drug.patch.contract.a h;

    public a(View view, c cVar, com.sankuai.waimai.drug.patch.contract.a aVar) {
        super(view);
        w wVar;
        Object[] objArr = {view, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0d707381d31bcc2d29f8d0644cd37a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0d707381d31bcc2d29f8d0644cd37a5");
            return;
        }
        this.b = new ArrayList();
        this.g = cVar;
        this.f = (RecyclerView) view;
        this.h = aVar;
        this.d = new com.sankuai.waimai.store.expose.a<Integer>() { // from class: com.sankuai.waimai.drug.patch.viewHolder.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view2, Integer num) {
                GoodsSpu goodsSpu;
                Integer num2 = num;
                Object[] objArr2 = {view2, num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6407a35b545ae1e3570d70168b096cef", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6407a35b545ae1e3570d70168b096cef")).booleanValue();
                }
                if (view2 != null && num2 != null && (goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, num2.intValue())) != null && a.this.h != null) {
                    a.this.h.a(goodsSpu, num2.intValue(), "");
                }
                return true;
            }
        };
        view.setBackground(com.sankuai.waimai.store.util.e.b(view.getContext(), (int) R.color.wm_st_common_white, (int) R.dimen.wm_sc_common_dimen_12));
        this.f.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.c = new com.sankuai.waimai.store.widgets.recycler.a<b>() { // from class: com.sankuai.waimai.drug.patch.viewHolder.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final int a(int i) {
                return 0;
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final /* synthetic */ void a(b bVar, int i) {
                b bVar2 = bVar;
                Object[] objArr2 = {bVar2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66fea5eead660a2a326a529f59c7e4ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66fea5eead660a2a326a529f59c7e4ec");
                    return;
                }
                GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, i);
                if (goodsSpu != null) {
                    goodsSpu.mPriceOptAB = a.this.e;
                    a.this.d.b(bVar2.itemView, Integer.valueOf(i));
                    bVar2.a(goodsSpu, "", i);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c4d62885f5a1701cd089ac8ff83c5d4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c4d62885f5a1701cd089ac8ff83c5d4")).intValue() : com.sankuai.shangou.stone.util.a.a(a.this.b);
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.a
            public final e a(ViewGroup viewGroup, int i) {
                Object[] objArr2 = {viewGroup, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0f9857e1342326072f5420423d69a0d", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0f9857e1342326072f5420423d69a0d") : new b(new DrugPatchworkListSpuCell(viewGroup.getContext()), a.this.g, null);
            }
        };
        this.c.a(new com.sankuai.waimai.store.widgets.recycler.c() { // from class: com.sankuai.waimai.drug.patch.viewHolder.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.c
            public final void a(com.sankuai.waimai.store.widgets.recycler.a aVar2, e eVar, int i, int i2, int i3) {
                Object[] objArr2 = {aVar2, eVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6e945b83fe5d11d42c6ab0c9631ecd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6e945b83fe5d11d42c6ab0c9631ecd8");
                } else if (a.this.g != null) {
                    a.this.g.a((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) a.this.b, i3), "", i3);
                }
            }
        });
        this.f.setAdapter(new l(this.c));
        RecyclerView recyclerView = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "343f58a98c7cba3d6e797f0ce084d3ac", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "343f58a98c7cba3d6e797f0ce084d3ac");
        } else {
            wVar = new w(this.itemView.getContext(), 1);
            Drawable drawable = ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.wm_drug_recyclerview_divider);
            if (drawable != null) {
                wVar.a(drawable);
            }
        }
        recyclerView.addItemDecoration(wVar);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59ef70ab9e021b60ebcbc180717d4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59ef70ab9e021b60ebcbc180717d4bc");
        } else {
            this.d.a();
        }
    }
}
