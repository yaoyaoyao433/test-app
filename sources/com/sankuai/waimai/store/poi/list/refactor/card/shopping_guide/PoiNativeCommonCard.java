package com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.event.g;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiNativeCommonCard extends BaseCard {
    public static ChangeQuickRedirect h;
    private a i;
    private b j;
    private com.sankuai.waimai.store.param.a k;

    public PoiNativeCommonCard(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f65bb579e2cdc7d03327adfc386b8bbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f65bb579e2cdc7d03327adfc386b8bbd");
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64a366e347482befa8c98dccce34430", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64a366e347482befa8c98dccce34430") : LayoutInflater.from(this.e).inflate(R.layout.wm_sc_home_channel_refactor_native_common_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0e32104f523cc6c9891c6207d2b2f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0e32104f523cc6c9891c6207d2b2f97");
            return;
        }
        super.a(view);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.k = poiPageViewModel.d.a();
        this.i = (a) this.c.c;
        this.j = new b(this.k, (SCBaseActivity) this.e, this.i);
        b bVar = this.j;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d402923486cf4a439fff370e18c8ea97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d402923486cf4a439fff370e18c8ea97");
        } else {
            bVar.h = (LinearLayout) view.findViewById(R.id.ll_module_container);
        }
        if ("3".equals(this.i.c)) {
            this.c.b = this.i.e.templateId;
        } else if ("2".equals(this.i.c)) {
            this.c.b = this.i.a;
        }
        a(g.class, new l<g>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide.PoiNativeCommonCard.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable g gVar) {
                g gVar2 = gVar;
                Object[] objArr3 = {gVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ad25c477dd2bbf5791d4c27e792baf51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ad25c477dd2bbf5791d4c27e792baf51");
                } else if (gVar2 != null) {
                    PoiNativeCommonCard.this.j.c();
                }
            }
        });
        if (poiPageViewModel.b.a() != null) {
            try {
                final b bVar2 = this.j;
                final PoiVerticalityDataResponse poiVerticalityDataResponse = poiPageViewModel.b.a().response;
                Object[] objArr3 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
                if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "275830aff2553bd061478d7422a87d9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "275830aff2553bd061478d7422a87d9c");
                } else {
                    bVar2.h.removeAllViews();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "ad7df7a1e24d91f4fe6219058a884af7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "ad7df7a1e24d91f4fe6219058a884af7");
                    } else {
                        for (com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar : bVar2.e) {
                            if (aVar != null) {
                                bVar2.f.a(aVar.e, aVar);
                                aVar.g = null;
                            }
                        }
                        bVar2.e.clear();
                    }
                    bVar2.d();
                    Object[] objArr5 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
                    if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "a1601b5149dde3905bf3c45246fcbfbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "a1601b5149dde3905bf3c45246fcbfbf");
                    } else {
                        Object[] objArr6 = {poiVerticalityDataResponse};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
                        com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar3 = PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "e24f021d167205f599c646e84768f198", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.idata.b) PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "e24f021d167205f599c646e84768f198") : new com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.optimization.a.2
                            @Override // com.sankuai.waimai.store.base.idata.b
                            @NonNull
                            public final /* bridge */ /* synthetic */ PoiVerticalityDataResponse a(int i) {
                                return poiVerticalityDataResponse;
                            }
                        };
                        for (com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar2 : bVar2.e) {
                            aVar2.b((com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>>) bVar3);
                        }
                    }
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
                    if (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "2f90f09f9f42fc54e2471f888a51eb88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "2f90f09f9f42fc54e2471f888a51eb88");
                    } else {
                        bVar2.h.removeAllViews();
                        for (com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar3 : bVar2.e) {
                            aVar3.a((ViewGroup.LayoutParams) null);
                        }
                    }
                    if (com.sankuai.shangou.stone.util.a.b(bVar2.e)) {
                        u.c(bVar2.h);
                    } else {
                        u.a(bVar2.h);
                    }
                }
                com.sankuai.waimai.store.poi.list.refactor.cat.a.a(this.k.c, getClass().getSimpleName());
            } catch (Exception e) {
                com.sankuai.waimai.store.poi.list.refactor.cat.a.a(this.k.c, getClass().getSimpleName(), e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba02d1ed1277b108855a3ecc01602525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba02d1ed1277b108855a3ecc01602525");
            return;
        }
        super.onResume();
        if (this.j != null) {
            this.j.a();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6280c66c47c7a0c298e466978a291f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6280c66c47c7a0c298e466978a291f93");
            return;
        }
        super.onPause();
        if (this.j != null) {
            this.j.b();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b1e8fb99e328cc19f53e0c07fa8488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b1e8fb99e328cc19f53e0c07fa8488");
            return;
        }
        super.onDestroy();
        if (this.j != null) {
            b bVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c44ab168f3f54c6ec3a1b3375e4b6d06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c44ab168f3f54c6ec3a1b3375e4b6d06");
            } else {
                bVar.f.a();
            }
        }
    }
}
