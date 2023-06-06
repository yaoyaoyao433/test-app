package com.sankuai.waimai.business.restaurant.poicontainer.machpro.shopcart;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.util.d;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.b;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.restaurant.shopcart.ui.aa;
import com.sankuai.waimai.restaurant.shopcart.ui.n;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPRestaurantShopCartComponent extends a<FrameLayout> {
    public static ChangeQuickRedirect a;
    private n b;

    @JSMethod(methodName = "onLoadSuccess")
    @Keep
    public void onLoadSuccess() {
    }

    public static /* synthetic */ n a(MPRestaurantShopCartComponent mPRestaurantShopCartComponent, n nVar) {
        mPRestaurantShopCartComponent.b = null;
        return null;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ View createView() {
        WMRestaurantActivity wMRestaurantActivity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af60e90f60922c59d2a2b2123982a06", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af60e90f60922c59d2a2b2123982a06");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        b bVar = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2364bec293a1c9e686f3fab9bc51cd71", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2364bec293a1c9e686f3fab9bc51cd71");
        } else {
            Context context = this.mMachContext.getContext();
            if ((context instanceof WMRestaurantActivity) && (wMRestaurantActivity = (WMRestaurantActivity) context) != null) {
                bVar = wMRestaurantActivity.e;
            }
        }
        if (bVar != null) {
            this.b = new n(bVar);
            frameLayout.addView(this.b.i());
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "948d2dd9b80d25b52ad1a54c92c5ddd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "948d2dd9b80d25b52ad1a54c92c5ddd6");
            } else {
                bVar.k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.shopcart.MPRestaurantShopCartComponent.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr4 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d3642bf967d919c079c0bc45f1aa1910", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d3642bf967d919c079c0bc45f1aa1910");
                        } else if (!bool2.booleanValue() || MPRestaurantShopCartComponent.this.b == null) {
                        } else {
                            MPRestaurantShopCartComponent.this.b.aX_();
                        }
                    }
                }).a(a());
                bVar.j.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.shopcart.MPRestaurantShopCartComponent.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr4 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "005ad0704d96dc0b1e67b3035de636d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "005ad0704d96dc0b1e67b3035de636d4");
                        } else if (!bool2.booleanValue() || MPRestaurantShopCartComponent.this.b == null) {
                        } else {
                            MPRestaurantShopCartComponent.this.b.bc_();
                        }
                    }
                }).a(a());
                bVar.l.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.shopcart.MPRestaurantShopCartComponent.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr4 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3dd72873cc20794eea3ab4003076ee6f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3dd72873cc20794eea3ab4003076ee6f");
                        } else if (!bool2.booleanValue() || MPRestaurantShopCartComponent.this.b == null) {
                        } else {
                            MPRestaurantShopCartComponent.this.b.bD_();
                        }
                    }
                }).a(a());
                bVar.m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.shopcart.MPRestaurantShopCartComponent.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2755db3b6e26b285b7accc7852966a5e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2755db3b6e26b285b7accc7852966a5e");
                            return;
                        }
                        if (MPRestaurantShopCartComponent.this.b != null) {
                            MPRestaurantShopCartComponent.this.b.bE_();
                        }
                        MPRestaurantShopCartComponent.a(MPRestaurantShopCartComponent.this, null);
                    }
                }).a(a());
            }
        }
        return frameLayout;
    }

    public MPRestaurantShopCartComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c68949a8e21c269aad7e3415b7a674", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c68949a8e21c269aad7e3415b7a674");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb603faff4db92571033678d420b8b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb603faff4db92571033678d420b8b4");
            return;
        }
        super.updateAttribute(str, obj);
        StringBuilder sb = new StringBuilder("updateAttribute() called with: attribute = [");
        sb.append(str);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if ("data".equalsIgnoreCase(str)) {
            String a2 = com.sankuai.waimai.machpro.util.b.a(obj, "");
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47c77235823154631ebd426197d0abe6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47c77235823154631ebd426197d0abe6");
            } else if (TextUtils.isEmpty(a2)) {
            } else {
                aa aaVar = (aa) d.a().fromJson(a2, (Class<Object>) aa.class);
                if (this.b != null) {
                    this.b.c(aaVar);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6005fb02e658c837560668bfcfd4c59c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6005fb02e658c837560668bfcfd4c59c");
            return;
        }
        super.updateViewStyle(str, obj);
        if (!TextUtils.isEmpty(str) && RemoteMessageConst.Notification.VISIBILITY.equals(str)) {
            if ("hidden".equals(obj)) {
                hidden();
            } else {
                show();
            }
        }
    }

    @JSMethod(methodName = "show")
    @Keep
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e70b248d40ff1924b28e983b0c1eae59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e70b248d40ff1924b28e983b0c1eae59");
            return;
        }
        n nVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n.r;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "7eaa97f2a983060a47b5234b858161cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "7eaa97f2a983060a47b5234b858161cb");
        } else {
            nVar.t.i();
        }
    }

    @JSMethod(methodName = "hide")
    @Keep
    public void hidden() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79a2c419bca220e39407185ddab7edf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79a2c419bca220e39407185ddab7edf");
            return;
        }
        n nVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n.r;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "c5f0f60dc2257dcfa53547c29fec32d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "c5f0f60dc2257dcfa53547c29fec32d5");
        } else {
            nVar.t.j();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a, com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62961e71998cfdcae41811795608cb6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62961e71998cfdcae41811795608cb6f");
            return;
        }
        super.onDestroy();
        if (this.b != null) {
            this.b.bE_();
            this.b.J().a();
        }
    }
}
