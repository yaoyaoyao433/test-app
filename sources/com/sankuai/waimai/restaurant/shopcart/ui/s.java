package com.sankuai.waimai.restaurant.shopcart.ui;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_r_poi_info_mach_pro"}, viewModel = t.class)
/* loaded from: classes5.dex */
public class s extends com.sankuai.waimai.business.restaurant.base.config.b<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> implements com.sankuai.waimai.business.restaurant.framework.viewpager.a {
    public static ChangeQuickRedirect t;
    private PoiDetailMachProFragment u;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6add03a752d9aebaf976f89ab6f383d7", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6add03a752d9aebaf976f89ab6f383d7") : new t();
    }

    public s(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f62596a41cdf73c98ad3f76e858fb72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f62596a41cdf73c98ad3f76e858fb72");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495cdac62b6c04cc2c8185c58acd731f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495cdac62b6c04cc2c8185c58acd731f") : new com.meituan.android.cube.pga.view.a(l()) { // from class: com.sankuai.waimai.restaurant.shopcart.ui.s.1
            public static ChangeQuickRedirect d;

            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_restaurant_detail_mach_pro;
            }

            @Override // com.meituan.android.cube.pga.view.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7141f2d6f95e4f78bf06c90a5f68cc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7141f2d6f95e4f78bf06c90a5f68cc7");
                } else {
                    super.b();
                }
            }
        };
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.viewpager.a
    public final void a(boolean z) {
        final ViewGroup viewGroup;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695bd97516ac0105d8cca176cef9d7d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695bd97516ac0105d8cca176cef9d7d7");
        } else if (!z || (viewGroup = (ViewGroup) this.g.a().findViewById(R.id.layout_poi_detail_container_mach_pro)) == null) {
        } else {
            viewGroup.post(new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.s.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd40ddb16c0eb026a6373da29f5e817c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd40ddb16c0eb026a6373da29f5e817c");
                        return;
                    }
                    Context context = viewGroup.getContext();
                    if (context instanceof WMRestaurantActivity) {
                        WMRestaurantActivity wMRestaurantActivity = (WMRestaurantActivity) context;
                        FragmentTransaction beginTransaction = wMRestaurantActivity.getSupportFragmentManager().beginTransaction();
                        if (s.this.u == null) {
                            s.this.u = PoiDetailMachProFragment.e();
                        }
                        if (wMRestaurantActivity.findViewById(R.id.layout_poi_detail_container_mach_pro) == null) {
                            return;
                        }
                        beginTransaction.replace(R.id.layout_poi_detail_container_mach_pro, s.this.u);
                        beginTransaction.commitNowAllowingStateLoss();
                    }
                }
            });
        }
    }
}
