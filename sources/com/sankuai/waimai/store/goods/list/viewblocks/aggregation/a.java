package com.sankuai.waimai.store.goods.list.viewblocks.aggregation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.viewblocks.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements d.a, c.a, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    public ViewGroup d;
    public View e;
    private PrioritySmoothNestedScrollView f;
    private f g;
    private b h;
    private ShopContentRootBlock i;

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
    }

    public a(@NonNull d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd09ff46e4e6b6f4b70327251fad9f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd09ff46e4e6b6f4b70327251fad9f0");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3429ac485f02083f90df5a15f19c3d2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3429ac485f02083f90df5a15f19c3d2b");
        }
        c.a().a(this);
        return layoutInflater.inflate(R.layout.wm_st_goods_list_layout_aggregation_container, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    @SuppressLint({"ResourceType"})
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf73e96d693163ee8dabda2d31ad4f8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf73e96d693163ee8dabda2d31ad4f8d");
            return;
        }
        super.onViewCreated();
        this.f = (PrioritySmoothNestedScrollView) findView(R.id.container_scrollview);
        this.f.a(this);
        ViewGroup viewGroup = (ViewGroup) findView(R.id.wm_action_bar);
        View findView = findView(R.id.gradient_helper_layout);
        Object[] objArr2 = {findView};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2ea594c9bead1938a86cccaf2f3bcfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2ea594c9bead1938a86cccaf2f3bcfa");
        } else if (findView != null && k.b(this.a.k())) {
            findView.getLayoutParams().height = u.a(this.mContext);
            u.a(findView);
        }
        this.g = new f(getContext());
        this.g.bindView(viewGroup);
        f fVar = this.g;
        Object[] objArr3 = {Integer.valueOf((int) R.string.wm_sc_polymerize_activity_title)};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "43ee35281abfa7bc370fd670453aa22f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "43ee35281abfa7bc370fd670453aa22f");
        } else {
            fVar.b.setText(R.string.wm_sc_polymerize_activity_title);
        }
        this.d = (ViewGroup) findView(R.id.layout_content_container);
        this.h = new b(getContext());
        this.h.createView((ViewGroup) findView(R.id.fl_poi_header_container));
        this.e = findView(R.id.view_poi_head_line);
        this.i = new com.sankuai.waimai.store.goods.list.templet.newmarket.a(this.a, null);
        this.d.addView(this.i.a(LayoutInflater.from(getContext()), this.d));
        this.f.a(this.d, h.a(getContext(), 1.0f));
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226046025b0d43cf7ef6cbcba62e29f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226046025b0d43cf7ef6cbcba62e29f8");
            return;
        }
        b bVar = this.h;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ba7ef3596d02aaad165b355facf3687d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ba7ef3596d02aaad165b355facf3687d");
        } else if (bVar.getView().getVisibility() == 8 || i > bVar.c) {
        } else {
            float f = (bVar.c - i) / (bVar.c * 1.0f);
            if (f < 1.0E-5d) {
                f = 0.0f;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.m.getLayoutParams();
            layoutParams.height = bVar.a(bVar.j, bVar.k, f);
            bVar.m.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) bVar.n.getLayoutParams();
            layoutParams2.width = bVar.a(bVar.f, bVar.h, f);
            layoutParams2.height = bVar.a(bVar.g, bVar.i, f);
            layoutParams2.bottomMargin = bVar.a(bVar.d, bVar.e, f);
            bVar.n.setLayoutParams(layoutParams2);
            if (bVar.p.getVisibility() == 0) {
                bVar.p.setAlpha(f);
            }
            bVar.l.setAlpha(f);
            bVar.r.setAlpha(f);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d81866590b840e2fb6ac765cff2313c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d81866590b840e2fb6ac765cff2313c");
            return;
        }
        super.a(restMenuResponse);
        Object[] objArr2 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8df3690701906d5f21cda881aa0533f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8df3690701906d5f21cda881aa0533f");
        } else {
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            if (restMenuResponse.showPoiInfo) {
                layoutParams.height = h.a(getContext(), 6.0f);
                this.f.a(this.d, h.a(getContext(), 52.0f));
            } else {
                this.f.a(this.d, h.a(getContext(), 1.0f));
                layoutParams.height = h.a(getContext(), 1.0f);
            }
            this.e.setLayoutParams(layoutParams);
        }
        final b bVar = this.h;
        Object[] objArr3 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7e30fcba6978472b2ea01725d80915f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7e30fcba6978472b2ea01725d80915f9");
        } else {
            final Poi poi = restMenuResponse.getPoi();
            if (poi == null || !restMenuResponse.showPoiInfo) {
                u.c(bVar.getView());
            } else {
                com.sankuai.waimai.store.manager.judas.b.b(bVar.getContext(), "b_waimai_39gtkl0d_mv").a("poi_id", poi.getOfficialPoiId()).a();
                u.a(bVar.getView());
                Object[] objArr4 = {poi};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e5fd7260d8624e0e1701b4d1bfaf366d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e5fd7260d8624e0e1701b4d1bfaf366d");
                } else {
                    b.C0608b a = m.a(poi.picUrl, (int) bVar.getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_78), ImageQualityUtil.b());
                    a.j = R.drawable.wm_sc_common_loading_large;
                    a.i = R.drawable.wm_sc_common_loading_large;
                    a.a(bVar.o);
                }
                bVar.a(poi);
                Object[] objArr5 = {poi};
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "9d5f08ec5c5d68916887c11fe6637574", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "9d5f08ec5c5d68916887c11fe6637574");
                } else {
                    u.a(bVar.q, poi.name);
                }
                Object[] objArr6 = {poi};
                ChangeQuickRedirect changeQuickRedirect6 = b.a;
                if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "9a2d38dd493fe6839247ac48ae39ff4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "9a2d38dd493fe6839247ac48ae39ff4d");
                } else {
                    Poi.PoiLabel newPoiLabels = poi.getNewPoiLabels();
                    ArrayList<Poi.PoiImpressLabel> arrayList = newPoiLabels == null ? null : newPoiLabels.labels;
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                        bVar.r.removeAllViews();
                        bVar.r.setVisibility(0);
                        Iterator<Poi.PoiImpressLabel> it = arrayList.iterator();
                        while (it.hasNext()) {
                            Poi.PoiImpressLabel next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.mLabelText)) {
                                bVar.r.addView(bVar.a(bVar.r, next));
                            }
                        }
                    } else {
                        bVar.r.setVisibility(4);
                    }
                }
                Object[] objArr7 = {poi};
                ChangeQuickRedirect changeQuickRedirect7 = b.a;
                if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "202493fa39446bee57700b845c914d56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "202493fa39446bee57700b845c914d56");
                } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) poi.getLabelInfoList())) {
                    u.a(bVar.l);
                    bVar.l.removeAllViews();
                    int c2 = com.sankuai.shangou.stone.util.a.c(poi.getLabelInfoList());
                    for (int i = 0; i < c2 && i < 10; i++) {
                        View a2 = bVar.a(bVar.l, (Poi.LabelInfoListItem) com.sankuai.shangou.stone.util.a.a((List<Object>) poi.getLabelInfoList(), i));
                        if (a2 != null) {
                            bVar.l.addView(a2);
                        }
                    }
                } else {
                    u.c(bVar.l);
                }
                Object[] objArr8 = {poi};
                ChangeQuickRedirect changeQuickRedirect8 = b.a;
                if (PatchProxy.isSupport(objArr8, bVar, changeQuickRedirect8, false, "792179090ac2cdd41f347166c92416fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, bVar, changeQuickRedirect8, false, "792179090ac2cdd41f347166c92416fe");
                } else {
                    bVar.getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.aggregation.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr9 = {view};
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3b23f787617976636d9d22347363a051", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3b23f787617976636d9d22347363a051");
                                return;
                            }
                            com.sankuai.waimai.store.router.d.a(view.getContext(), poi.restaurantScheme);
                            com.sankuai.waimai.store.manager.judas.b.a(bVar.getContext(), "b_waimai_ehfp57wr_mc").a("poi_id", poi.getOfficialPoiId()).a();
                        }
                    });
                }
            }
        }
        this.i.a(restMenuResponse);
        this.i.l = restMenuResponse.extendInfo;
        Object[] objArr9 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect9 = c;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "93b638899f691f77fbc528ff87d00751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "93b638899f691f77fbc528ff87d00751");
        } else if (restMenuResponse != null && restMenuResponse.receiveCouponStatus == 0 && !t.a(restMenuResponse.receiveCouponAlert)) {
            am.a((Activity) this.a.k(), restMenuResponse.receiveCouponAlert);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37eeb2afa934cb220d7fd9bd65f251e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37eeb2afa934cb220d7fd9bd65f251e3");
            return;
        }
        if (this.g != null) {
            this.g.onDestroy();
        }
        if (this.h != null) {
            this.h.onDestroy();
        }
        if (this.i != null) {
            this.i.b();
        }
        c.a().b(this);
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e770a10b293c2ede1a82b6976d2049e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e770a10b293c2ede1a82b6976d2049e5");
        } else {
            this.a.d().a(poiCouponItem);
        }
    }
}
