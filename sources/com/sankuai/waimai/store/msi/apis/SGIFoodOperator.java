package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.util.Log;
import com.meituan.msi.api.extension.sgc.operator.FoodOperatorParam;
import com.meituan.msi.api.extension.sgc.operator.IFoodOperator;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.msi.view.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIFoodOperator extends IFoodOperator {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.operator.IFoodOperator
    public final void a(final MsiCustomContext msiCustomContext, final FoodOperatorParam foodOperatorParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, foodOperatorParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286c32ecb13abfdb494c95e1f5ae433c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286c32ecb13abfdb494c95e1f5ae433c");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "increaseFoodWithPoiID msiCustomContext.getActivity() is dead or null");
        } else {
            Log.e("msc-store-shopcart", "increaseFoodWithPoiID " + foodOperatorParam.poiID);
            try {
                b.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIFoodOperator.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eca9a168dbf0399ec48da59d1b3d1e6f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eca9a168dbf0399ec48da59d1b3d1e6f");
                        } else if (a.a(msiCustomContext)) {
                            iVar.a(1000, "increaseFoodWithPoiID msiCustomContext.getActivity() is dead or null");
                        } else {
                            Activity activity = msiCustomContext.getActivity();
                            FoodOperatorParam foodOperatorParam2 = foodOperatorParam;
                            i iVar2 = iVar;
                            Object[] objArr3 = {activity, foodOperatorParam2, iVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.msi.shopcart.a.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6cb28039ec63275fbf360614095d63dd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6cb28039ec63275fbf360614095d63dd");
                            } else {
                                com.sankuai.waimai.store.msi.shopcart.a.a(activity, foodOperatorParam2.poiID, foodOperatorParam2.goodInfo, iVar2);
                            }
                            iVar.a(EmptyResponse.INSTANCE);
                        }
                    }
                });
            } catch (Exception e) {
                iVar.a(1000, e.getMessage());
            }
        }
    }
}
