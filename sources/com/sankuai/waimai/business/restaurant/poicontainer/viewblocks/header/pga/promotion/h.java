package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.content.Context;
import android.support.constraint.R;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.FloatCouponHelper;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.d;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.e;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.f;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.g;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.widget.HorizontalFlowLayout;
import com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends com.meituan.android.cube.pga.view.a<ViewGroup> {
    public static ChangeQuickRedirect d = null;
    private static int i = 160;
    private static int j = 400;
    private ObservableHorizontalScrollView e;
    private LinearLayout f;
    private View g;
    private HorizontalFlowLayout h;
    private final int k;
    private final SparseArray<Poi.PoiCouponItem> l;
    private final SparseArray<Poi.PoiCouponItem> m;
    private boolean n;
    private a o;
    private com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a p;
    private boolean q;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a a();

        void a(View view, Poi.PoiCouponItem poiCouponItem);

        com.sankuai.waimai.business.restaurant.base.manager.order.g b();

        View.OnClickListener c();
    }

    public static /* synthetic */ void a(h hVar, SparseArray sparseArray) {
        int i2 = 1;
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "1af2ca13eab0628a2c0b3eda0835ebce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "1af2ca13eab0628a2c0b3eda0835ebce");
        } else if (sparseArray.size() != 0) {
            int i3 = 0;
            while (i3 < hVar.f.getChildCount()) {
                Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) sparseArray.get(i3);
                View childAt = hVar.f.getChildAt(i3);
                if (childAt != null && poiCouponItem != null) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = childAt;
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "b6477052f6e3f2f1b7d643d609819612", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "b6477052f6e3f2f1b7d643d609819612")).booleanValue() : ah.a(childAt).intersect(ah.a(hVar.e))) {
                        c.a(hVar.c, poiCouponItem, hVar.o.b().g.poiActivityType, i3, hVar.o.b().f(), false);
                        sparseArray.delete(i3);
                    }
                }
                i3++;
                i2 = 1;
            }
        }
    }

    public h(Context context, View view) {
        super(context, view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91eb206c7877848272f0ef7eb8920ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91eb206c7877848272f0ef7eb8920ec7");
            return;
        }
        this.k = com.sankuai.waimai.foundation.utils.g.a(this.c, 15.0f);
        this.l = new SparseArray<>();
        this.m = new SparseArray<>();
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4225a8f38c3d8ae347425737aa080670", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4225a8f38c3d8ae347425737aa080670");
            return;
        }
        super.b();
        this.e = (ObservableHorizontalScrollView) ((ViewGroup) this.b).findViewById(R.id.shop_coupon_layout_scroll_parent);
        this.f = (LinearLayout) ((ViewGroup) this.b).findViewById(R.id.shop_coupon_layout);
        this.g = ((ViewGroup) this.b).findViewById(R.id.shop_coupon_holder);
        this.h = (HorizontalFlowLayout) ((ViewGroup) this.b).findViewById(R.id.layout_poi_coupon_container);
        this.q = com.sankuai.waimai.platform.accessibility.a.a().b();
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c66774034c0a765ab8f70f2b88841e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c66774034c0a765ab8f70f2b88841e5");
            return;
        }
        this.o = aVar;
        this.p = aVar.a();
        this.p.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcbb67b94dfe34ce2c7bdc3b982e3bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcbb67b94dfe34ce2c7bdc3b982e3bd7");
        } else if (this.e != null) {
            this.e.setOnScrollListener(new ObservableHorizontalScrollView.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView.a
                public final void a(ObservableHorizontalScrollView observableHorizontalScrollView, boolean z, int i2, int i3, int i4, int i5) {
                    Object[] objArr3 = {observableHorizontalScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "008784808b16592615e7896c25474d34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "008784808b16592615e7896c25474d34");
                    } else {
                        h.a(h.this, h.this.l);
                    }
                }
            });
            this.f.setOnClickListener(this.o.c());
        }
    }

    public final void a(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d14e35dc0da214f8579e29ae85cde09f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d14e35dc0da214f8579e29ae85cde09f");
            return;
        }
        this.n = z;
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4287982e221b72d162eb82ccf7692426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4287982e221b72d162eb82ccf7692426");
        } else if (this.f != null) {
            if (i2 <= 0) {
                this.f.setAlpha(1.0f);
            } else if (i2 >= 80) {
                this.f.setAlpha(0.0f);
            } else {
                this.f.setAlpha(1.0f - ((i2 + 0) / 80.0f));
            }
        }
        a(i2);
        if (!this.q || this.e == null) {
            return;
        }
        if (z) {
            com.sankuai.waimai.restaurant.shopcart.utils.g.a(this.e, false);
        } else {
            com.sankuai.waimai.restaurant.shopcart.utils.g.a(this.e, true);
        }
    }

    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72aa12c5ea22554cf027799e7e889403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72aa12c5ea22554cf027799e7e889403");
            return;
        }
        this.l.clear();
        if (com.sankuai.waimai.foundation.utils.b.a(iVar.b)) {
            this.f.removeAllViews();
            this.f.setVisibility(0);
            boolean z = false;
            byte b = 0;
            for (int i2 = 0; i2 < iVar.b.size(); i2++) {
                Poi.PoiCouponItem poiCouponItem = iVar.b.get(i2);
                if (poiCouponItem != null) {
                    if (poiCouponItem.isExchangeCoupon() || poiCouponItem.isMagicCoupon() || poiCouponItem.isNormalCoupon()) {
                        z = true;
                    } else {
                        b = 1;
                    }
                    a(poiCouponItem, (ViewGroup) this.f, i2, false);
                    this.l.put(i2, poiCouponItem);
                }
            }
            a().post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1de689033aa426969952a503c546c21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1de689033aa426969952a503c546c21");
                    } else {
                        h.a(h.this, h.this.l);
                    }
                }
            });
            Context context = this.c;
            Object[] objArr2 = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect2 = FloatCouponHelper.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c4e7ec5c81ec41c9e57e5aeaf64a5dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c4e7ec5c81ec41c9e57e5aeaf64a5dc");
            } else {
                FloatCouponHelper.b = new Pair<>((!z || b == 0) ? b != 0 ? new String[]{context.getString(R.string.wm_restaurant_tab_float_coupon_voucher)} : new String[]{context.getString(R.string.wm_restaurant_tab_float_coupon_member)} : new String[]{context.getString(R.string.wm_restaurant_tab_float_coupon_member), context.getString(R.string.wm_restaurant_tab_float_coupon_voucher)}, Boolean.valueOf(z));
            }
            if (z) {
                Context context2 = this.c;
                Object[] objArr3 = {context2};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d59692b58a15e4a9d555bd7c22c9a0d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d59692b58a15e4a9d555bd7c22c9a0d4");
                    return;
                }
                JudasManualManager.a a2 = JudasManualManager.b("b_2kkdls2u").a("c_CijEL");
                a2.b = AppUtil.generatePageInfoKey(context2);
                a2.a();
                return;
            }
            return;
        }
        this.f.setVisibility(8);
    }

    public final boolean a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f905c47c53633a3cd446eae369de249", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f905c47c53633a3cd446eae369de249")).booleanValue() : a(poi.getPoiCoupon());
    }

    public final boolean a(Poi.PoiCouponEntity poiCouponEntity) {
        Object[] objArr = {poiCouponEntity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82df9bbd4d4437fa6a7d4d693db6e70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82df9bbd4d4437fa6a7d4d693db6e70")).booleanValue();
        }
        if (this.h == null) {
            return false;
        }
        this.m.clear();
        if (poiCouponEntity != null && com.sankuai.waimai.foundation.utils.b.a(poiCouponEntity.getFoldPoiCouponItems())) {
            this.h.removeAllViews();
            this.g.setVisibility(0);
            this.h.setVisibility(0);
            ArrayList<Poi.PoiCouponItem> foldPoiCouponItems = poiCouponEntity.getFoldPoiCouponItems();
            for (int i2 = 0; i2 < foldPoiCouponItems.size(); i2++) {
                Poi.PoiCouponItem poiCouponItem = foldPoiCouponItems.get(i2);
                if (poiCouponItem != null) {
                    a(poiCouponItem, (ViewGroup) this.h, i2, true);
                    this.m.put(i2, poiCouponItem);
                }
            }
            return true;
        }
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        return false;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "944be8a262cd218c1242854642ad5885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "944be8a262cd218c1242854642ad5885");
        } else {
            this.p.b();
        }
    }

    public static void f() {
        i = 160;
        j = 400;
    }

    public final void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24644f0e80a830a04965fe13068b2669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24644f0e80a830a04965fe13068b2669");
        } else if (this.h == null) {
        } else {
            float f = 0.0f;
            if (i2 <= i && !this.n) {
                this.h.setAlpha(0.0f);
                f = this.k;
            } else if (i2 >= j || this.n) {
                this.h.setAlpha(1.0f);
                a(this.m);
            } else {
                float f2 = (i2 - i) / (j - i);
                f = (1.0f - f2) * this.k;
                this.h.setAlpha(f2);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams.height = (int) f;
            this.g.setLayoutParams(layoutParams);
        }
    }

    private void a(Poi.PoiCouponItem poiCouponItem, ViewGroup viewGroup, int i2, boolean z) {
        Object[] objArr = {poiCouponItem, viewGroup, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407efa039e265c32105a0b8238058815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407efa039e265c32105a0b8238058815");
        } else if (poiCouponItem.isExchangeCoupon()) {
            a(i2, poiCouponItem, viewGroup, z);
        } else if (poiCouponItem.isGoodsCoupon() || poiCouponItem.isPoiCoupon()) {
            b(i2, poiCouponItem, viewGroup, z);
        } else if (poiCouponItem.isMagicCoupon()) {
            c(i2, poiCouponItem, viewGroup, z);
        } else if (poiCouponItem.isNormalCoupon()) {
            d(i2, poiCouponItem, viewGroup, z);
        } else {
            e(i2, poiCouponItem, viewGroup, z);
        }
    }

    private void a(final int i2, Poi.PoiCouponItem poiCouponItem, ViewGroup viewGroup, final boolean z) {
        Object[] objArr = {Integer.valueOf(i2), poiCouponItem, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488017cf8c516010fab0dd1af5263d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488017cf8c516010fab0dd1af5263d89");
            return;
        }
        g gVar = new g(this.c);
        viewGroup.addView(gVar.a(viewGroup));
        gVar.b = new g.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.g.a
            public final void a(View view, Poi.PoiCouponItem poiCouponItem2) {
                Object[] objArr2 = {view, poiCouponItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a29a357f90e8378eb45623507ffdb090", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a29a357f90e8378eb45623507ffdb090");
                    return;
                }
                c.a(h.this.c, poiCouponItem2, h.this.o.b().g.poiActivityType, i2, com.sankuai.waimai.platform.domain.core.poi.b.a(h.this.o.b().f()), h.this.o.b().f(), z);
                h.this.o.a(view, poiCouponItem2);
            }
        };
        gVar.a(poiCouponItem);
    }

    private void b(final int i2, Poi.PoiCouponItem poiCouponItem, ViewGroup viewGroup, final boolean z) {
        Object[] objArr = {Integer.valueOf(i2), poiCouponItem, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8589da5a56fc0fd84fbdc9b9a7a74f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8589da5a56fc0fd84fbdc9b9a7a74f3e");
            return;
        }
        b bVar = new b(this.c, poiCouponItem.mCouponStatus == 1);
        viewGroup.addView(bVar.a(viewGroup));
        bVar.b = new b.d() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b.d
            public final void a(View view, Poi.PoiCouponItem poiCouponItem2) {
                Object[] objArr2 = {view, poiCouponItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45b98fcc17fcf5bda712ee4240d1563b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45b98fcc17fcf5bda712ee4240d1563b");
                    return;
                }
                c.a(h.this.c, poiCouponItem2, h.this.o.b().g.poiActivityType, i2, com.sankuai.waimai.platform.domain.core.poi.b.a(h.this.o.b().f()), h.this.o.b().f(), z);
                h.this.o.a(view, poiCouponItem2);
                com.sankuai.waimai.ai.uat.b.a().a("GET_COUPON_KEY", Boolean.TRUE);
            }
        };
        bVar.a(poiCouponItem);
    }

    private void c(final int i2, Poi.PoiCouponItem poiCouponItem, ViewGroup viewGroup, final boolean z) {
        Object[] objArr = {Integer.valueOf(i2), poiCouponItem, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5233039cb0997ab4ccdf03735f474b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5233039cb0997ab4ccdf03735f474b");
            return;
        }
        d dVar = new d(this.c);
        viewGroup.addView(dVar.a(viewGroup));
        dVar.d = new d.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.d.a
            public final void a(View view, Poi.PoiCouponItem poiCouponItem2) {
                Object[] objArr2 = {view, poiCouponItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50a8a18044ad927e3b21e2b21c283cab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50a8a18044ad927e3b21e2b21c283cab");
                    return;
                }
                c.a(h.this.c, poiCouponItem2, h.this.o.b().g.poiActivityType, i2, com.sankuai.waimai.platform.domain.core.poi.b.a(h.this.o.b().f()), h.this.o.b().f(), z);
                h.this.o.a(view, poiCouponItem2);
            }
        };
        dVar.a(poiCouponItem);
    }

    private void d(final int i2, Poi.PoiCouponItem poiCouponItem, ViewGroup viewGroup, final boolean z) {
        Object[] objArr = {Integer.valueOf(i2), poiCouponItem, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea20269d999b1f5a5a6fd8e72e37d5c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea20269d999b1f5a5a6fd8e72e37d5c4");
            return;
        }
        e eVar = new e(this.c);
        viewGroup.addView(eVar.a(viewGroup));
        eVar.b = new e.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.e.a
            public final void a(View view, Poi.PoiCouponItem poiCouponItem2) {
                Object[] objArr2 = {view, poiCouponItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0579973697853a0cbd2594d0e32177fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0579973697853a0cbd2594d0e32177fc");
                    return;
                }
                c.a(h.this.c, poiCouponItem2, h.this.o.b().g.poiActivityType, i2, com.sankuai.waimai.platform.domain.core.poi.b.a(h.this.o.b().f()), h.this.o.b().f(), z);
                com.sankuai.waimai.ai.uat.b.a().a("GET_COUPON_KEY", Boolean.TRUE);
                h.this.o.a(view, poiCouponItem2);
            }
        };
        eVar.a(poiCouponItem);
    }

    private void e(final int i2, Poi.PoiCouponItem poiCouponItem, ViewGroup viewGroup, final boolean z) {
        Object[] objArr = {Integer.valueOf(i2), poiCouponItem, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c3b7bc9516101cc39f471925f5796c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c3b7bc9516101cc39f471925f5796c");
            return;
        }
        f fVar = new f(this.c);
        viewGroup.addView(fVar.a(viewGroup));
        fVar.b = new f.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.f.a
            public final void a(View view, Poi.PoiCouponItem poiCouponItem2) {
                Object[] objArr2 = {view, poiCouponItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e48ee0381a2c4a56998d8dedd112cb0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e48ee0381a2c4a56998d8dedd112cb0a");
                    return;
                }
                c.a(h.this.c, poiCouponItem2, h.this.o.b().g.poiActivityType, i2, com.sankuai.waimai.platform.domain.core.poi.b.a(h.this.o.b().f()), h.this.o.b().f(), z);
                com.sankuai.waimai.ai.uat.b.a().a("GET_COUPON_KEY", Boolean.TRUE);
                h.this.o.a(view, poiCouponItem2);
            }
        };
        fVar.a(poiCouponItem);
    }

    private void a(SparseArray<Poi.PoiCouponItem> sparseArray) {
        Poi.PoiCouponItem poiCouponItem;
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6bf2228fa70e49b52d701843e344b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6bf2228fa70e49b52d701843e344b2");
            return;
        }
        for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
            View childAt = this.h.getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0 && (poiCouponItem = sparseArray.get(i2)) != null) {
                sparseArray.delete(i2);
                c.a(this.c, poiCouponItem, this.o.b().g.poiActivityType, i2, this.o.b().f(), true);
            }
        }
    }
}
