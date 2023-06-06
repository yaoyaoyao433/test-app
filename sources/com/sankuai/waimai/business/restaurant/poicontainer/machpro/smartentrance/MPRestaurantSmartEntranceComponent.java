package com.sankuai.waimai.business.restaurant.poicontainer.machpro.smartentrance;

import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.b;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.restaurant.shopcart.ui.m;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPRestaurantSmartEntranceComponent extends a<FrameLayout> {
    public static ChangeQuickRedirect a;
    private m b;

    @JSMethod(methodName = "onLoadSuccess")
    @Keep
    public void onLoadSuccess() {
    }

    public static /* synthetic */ m a(MPRestaurantSmartEntranceComponent mPRestaurantSmartEntranceComponent, m mVar) {
        mPRestaurantSmartEntranceComponent.b = null;
        return null;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ View createView() {
        WMRestaurantActivity wMRestaurantActivity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52a9c9b1c00ffb17bfc00eb85960809", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52a9c9b1c00ffb17bfc00eb85960809");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        b bVar = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5be1436aef8887c101164d67b85f552", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5be1436aef8887c101164d67b85f552");
        } else {
            Context context = this.mMachContext.getContext();
            if ((context instanceof WMRestaurantActivity) && (wMRestaurantActivity = (WMRestaurantActivity) context) != null) {
                bVar = wMRestaurantActivity.e;
            }
        }
        if (bVar != null) {
            this.b = new m(bVar);
            frameLayout.addView(this.b.i());
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17669a8d58a1f7e1979b41e0046a589e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17669a8d58a1f7e1979b41e0046a589e");
            } else {
                bVar.m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.smartentrance.MPRestaurantSmartEntranceComponent.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b487cb2e6c40933662e188db07f2e4c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b487cb2e6c40933662e188db07f2e4c");
                            return;
                        }
                        if (MPRestaurantSmartEntranceComponent.this.b != null) {
                            MPRestaurantSmartEntranceComponent.this.b.bE_();
                        }
                        MPRestaurantSmartEntranceComponent.a(MPRestaurantSmartEntranceComponent.this, null);
                    }
                }).a(a());
            }
        }
        return frameLayout;
    }

    public MPRestaurantSmartEntranceComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e7b4bbe8958719891ac738abb748956", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e7b4bbe8958719891ac738abb748956");
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a, com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eed6040b0b60b69c5ed936284bd8836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eed6040b0b60b69c5ed936284bd8836");
            return;
        }
        super.onDestroy();
        if (this.b != null) {
            this.b.bE_();
            this.b.J().a();
        }
    }
}
