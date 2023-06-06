package com.sankuai.waimai.drug.mrn;

import android.support.constraint.R;
import android.view.ViewGroup;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugMRNShopCartView extends SimpleViewManager<DrugShopCartViewDelegate> {
    private static String MODULE_NAME = "MEDMRNShoppingCartView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public DrugShopCartViewDelegate createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2165732753dba95861d6077e15eb5c1b", RobustBitConfig.DEFAULT_VALUE) ? (DrugShopCartViewDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2165732753dba95861d6077e15eb5c1b") : new DrugShopCartViewDelegate(aoVar);
    }

    @ReactProp(name = "cid")
    public void setCid(DrugShopCartViewDelegate drugShopCartViewDelegate, String str) {
        Object[] objArr = {drugShopCartViewDelegate, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37921752235e1c1529f52be55dd37e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37921752235e1c1529f52be55dd37e90");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.d("ShoppingCar", "require cid=", str);
        drugShopCartViewDelegate.setCid(str);
    }

    @ReactProp(name = "rootTag")
    public void setRootTag(DrugShopCartViewDelegate drugShopCartViewDelegate, int i) {
        Object[] objArr = {drugShopCartViewDelegate, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5be1df050ae163cf4e4b114b1218520c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5be1df050ae163cf4e4b114b1218520c");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.d("setRootTag", "setRootTag=", Integer.valueOf(i));
        drugShopCartViewDelegate.setRootTag(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull DrugShopCartViewDelegate drugShopCartViewDelegate) {
        Object[] objArr = {drugShopCartViewDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123ae06003c7dadb2d489ec6e3462e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123ae06003c7dadb2d489ec6e3462e69");
            return;
        }
        super.onAfterUpdateTransaction((DrugMRNShopCartView) drugShopCartViewDelegate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = DrugShopCartViewDelegate.a;
        if (PatchProxy.isSupport(objArr2, drugShopCartViewDelegate, changeQuickRedirect3, false, "c51261135e8a84ea4246cdd720972ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugShopCartViewDelegate, changeQuickRedirect3, false, "c51261135e8a84ea4246cdd720972ed8");
        } else if (drugShopCartViewDelegate.a() || drugShopCartViewDelegate.c != null) {
        } else {
            ViewGroup viewGroup = (ViewGroup) drugShopCartViewDelegate.getActivity().getLayoutInflater().inflate(R.layout.wm_drug_shopcart_bridge_vessel, (ViewGroup) null);
            drugShopCartViewDelegate.d = viewGroup;
            drugShopCartViewDelegate.c = (ViewGroup) viewGroup.findViewById(R.id.fl_shopcart_container);
            drugShopCartViewDelegate.c.setVisibility(8);
            drugShopCartViewDelegate.addView(viewGroup);
            e eVar = DrugMRNShopCartModule.successEventMap.get(drugShopCartViewDelegate.getActivity().hashCode());
            if (eVar != null) {
                drugShopCartViewDelegate.onMRNLoadShopCartSuccess(eVar);
            }
        }
    }
}
