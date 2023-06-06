package com.sankuai.waimai.business.restaurant.poicontainer.machpro.poidetail;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.b;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.restaurant.shopcart.ui.s;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    private s b;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        WMRestaurantActivity wMRestaurantActivity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3e436ef472e9e170949cd9f6ca7f03", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3e436ef472e9e170949cd9f6ca7f03");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        b bVar = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9adb2cc35c956093ffdbe863c70abe12", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9adb2cc35c956093ffdbe863c70abe12");
        } else {
            Context context = this.mMachContext.getContext();
            if ((context instanceof WMRestaurantActivity) && (wMRestaurantActivity = (WMRestaurantActivity) context) != null) {
                bVar = wMRestaurantActivity.e;
            }
        }
        if (bVar == null) {
            return frameLayout;
        }
        this.b = new s(bVar);
        frameLayout.addView(this.b.i());
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.poidetail.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "056ce9500e08aec7d01a519480e0de89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "056ce9500e08aec7d01a519480e0de89");
                } else if (a.this.b != null) {
                    a.this.b.a(true);
                }
            }
        });
        return frameLayout;
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbe52b638ab6268f31c59a8703426ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbe52b638ab6268f31c59a8703426ca");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e7639c98359d6b3c9195ccb42368a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e7639c98359d6b3c9195ccb42368a2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e85615bb180ec231f77f9502d8bce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e85615bb180ec231f77f9502d8bce1");
            return;
        }
        super.addEventListener(str);
        StringBuilder sb = new StringBuilder("addEventListener() called with: event = [");
        sb.append(str);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
    }
}
