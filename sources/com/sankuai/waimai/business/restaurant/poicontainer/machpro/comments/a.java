package com.sankuai.waimai.business.restaurant.poicontainer.machpro.comments;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.b;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a<FrameLayout> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.restaurant.poicontainer.comment.a b;

    public static /* synthetic */ com.sankuai.waimai.business.restaurant.poicontainer.comment.a a(a aVar, com.sankuai.waimai.business.restaurant.poicontainer.comment.a aVar2) {
        aVar.b = null;
        return null;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ View createView() {
        WMRestaurantActivity wMRestaurantActivity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d763869c9b6ef74dfb5788e9b4269a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d763869c9b6ef74dfb5788e9b4269a9");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        b bVar = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a46b18ec946a64d93d5a3cc2e2f78bba", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a46b18ec946a64d93d5a3cc2e2f78bba");
        } else {
            Context context = this.mMachContext.getContext();
            if ((context instanceof WMRestaurantActivity) && (wMRestaurantActivity = (WMRestaurantActivity) context) != null) {
                bVar = wMRestaurantActivity.e;
            }
        }
        if (bVar != null) {
            this.b = new com.sankuai.waimai.business.restaurant.poicontainer.comment.a(bVar);
            frameLayout.addView(this.b.i());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.comments.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d3cf1b71d0e4b3c483b78edb0d7d74a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d3cf1b71d0e4b3c483b78edb0d7d74a");
                    } else if (a.this.b != null) {
                        a.this.b.a(true);
                    }
                }
            });
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c78d152668ba800cdf61ee3b17c4db31", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c78d152668ba800cdf61ee3b17c4db31");
            } else {
                bVar.k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.comments.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr4 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2b4ac63638f99d162b1bc4aa454ec843", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2b4ac63638f99d162b1bc4aa454ec843");
                        } else if (!bool2.booleanValue() || a.this.b == null) {
                        } else {
                            a.this.b.aX_();
                        }
                    }
                }).a(a());
                bVar.l.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.comments.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr4 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "55be8a451465912aa50946559e74fa77", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "55be8a451465912aa50946559e74fa77");
                        } else if (!bool2.booleanValue() || a.this.b == null) {
                        } else {
                            a.this.b.bD_();
                        }
                    }
                }).a(a());
                bVar.m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.comments.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5fb010ef4b7d1cec8f0f82ae6e6cada5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5fb010ef4b7d1cec8f0f82ae6e6cada5");
                            return;
                        }
                        if (a.this.b != null) {
                            a.this.b.bE_();
                        }
                        a.a(a.this, null);
                    }
                }).a(a());
            }
        }
        return frameLayout;
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd4486221d026d4eb4723b3758be77c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd4486221d026d4eb4723b3758be77c8");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daffaf75b80cbe3ee3f64105c798493e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daffaf75b80cbe3ee3f64105c798493e");
            return;
        }
        super.updateAttribute(str, obj);
        StringBuilder sb = new StringBuilder("updateAttribute() called with: attribute = [");
        sb.append(str);
        sb.append("], value = [");
        sb.append(obj);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c400ca4ceda30af2e05ccb28732a017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c400ca4ceda30af2e05ccb28732a017");
            return;
        }
        super.addEventListener(str);
        StringBuilder sb = new StringBuilder("addEventListener() called with: event = [");
        sb.append(str);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
    }
}
