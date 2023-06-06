package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.n;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.event.i;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiNearByTitleCard extends BaseCard implements n {
    public static ChangeQuickRedirect h;
    private View i;
    private TextView j;
    private com.sankuai.waimai.store.param.a k;
    private boolean l;

    public static /* synthetic */ void a(PoiNearByTitleCard poiNearByTitleCard, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiNearByTitleCard, changeQuickRedirect, false, "d44bb8116c42daab882fe2b34dd27a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiNearByTitleCard, changeQuickRedirect, false, "d44bb8116c42daab882fe2b34dd27a83");
            return;
        }
        if (poiVerticalityDataResponse != null) {
            Object[] objArr2 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (!(PatchProxy.isSupport(objArr2, poiNearByTitleCard, changeQuickRedirect2, false, "4d865b88af1370bbc4756b616af264e1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, poiNearByTitleCard, changeQuickRedirect2, false, "4d865b88af1370bbc4756b616af264e1")).booleanValue() : com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.getPoiList())) && (poiVerticalityDataResponse.subNaviInfo == null || b.a(poiNearByTitleCard.k, poiVerticalityDataResponse.subNaviInfo.categoryInfos))) {
                u.a(poiNearByTitleCard.i);
                Object[] objArr3 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, poiNearByTitleCard, changeQuickRedirect3, false, "d460d808c2ed2e0067fe29e08c30290e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, poiNearByTitleCard, changeQuickRedirect3, false, "d460d808c2ed2e0067fe29e08c30290e");
                    return;
                } else if (poiVerticalityDataResponse != null) {
                    try {
                        if (!TextUtils.isEmpty(poiVerticalityDataResponse.categoryTitle)) {
                            poiNearByTitleCard.j.setText(poiVerticalityDataResponse.categoryTitle);
                        } else {
                            poiNearByTitleCard.j.setText(R.string.wm_sc_common_nearby_poi);
                        }
                        com.sankuai.waimai.store.poi.list.refactor.cat.a.a(poiNearByTitleCard.k.c, poiNearByTitleCard.getClass().getSimpleName());
                        return;
                    } catch (Exception e) {
                        com.sankuai.waimai.store.poi.list.refactor.cat.a.a(poiNearByTitleCard.k.c, poiNearByTitleCard.getClass().getSimpleName(), e);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        u.c(poiNearByTitleCard.i);
    }

    public PoiNearByTitleCard(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c0be06596de327a898d83043013d17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c0be06596de327a898d83043013d17");
        } else {
            this.l = false;
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0583736fc5c9c1281744d2b9b34c912", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0583736fc5c9c1281744d2b9b34c912") : LayoutInflater.from(this.e).inflate(R.layout.wm_sc_home_channel_refactor_near_by_title_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feecee57a5accb192014790917753c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feecee57a5accb192014790917753c18");
            return;
        }
        super.a(view);
        this.i = view.findViewById(R.id.fl_container);
        this.j = (TextView) view.findViewById(R.id.tv_list_title);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.k = poiPageViewModel.d.a();
        a(i.class, new l<i>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiNearByTitleCard.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable i iVar) {
                i iVar2 = iVar;
                Object[] objArr2 = {iVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e00177830d570a421f89662e0f35585f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e00177830d570a421f89662e0f35585f");
                } else if (iVar2 == null || PoiNearByTitleCard.this.f == null) {
                } else {
                    PoiNearByTitleCard.this.f.a(PoiNearByTitleCard.this, iVar2.a, PoiNearByTitleCard.this.k.aW);
                }
            }
        });
        u.c(this.i);
        poiPageViewModel.c.a(this.d, new l<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiNearByTitleCard.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
                PoiVerticalityDataResponse poiVerticalityDataResponse2 = poiVerticalityDataResponse;
                Object[] objArr2 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d24eee64af44b9cf107099660ba44d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d24eee64af44b9cf107099660ba44d3");
                } else {
                    PoiNearByTitleCard.a(PoiNearByTitleCard.this, poiVerticalityDataResponse2);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.assembler.component.n
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab21d2ffc9bd920d62a6c867f04f3e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab21d2ffc9bd920d62a6c867f04f3e21");
        } else if (this.k.y) {
            if (z) {
                if (this.l) {
                    return;
                }
                this.l = true;
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.d(true));
            } else if (this.l) {
                this.l = false;
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.d(false));
            }
        }
    }
}
