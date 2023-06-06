package com.sankuai.waimai.store.mrn.shopcartbridge;

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
/* loaded from: classes5.dex */
public class SMMRNShopCartView extends SimpleViewManager<ShopCartViewDelegate> {
    private static String MODULE_NAME = "SMMRNShoppingCartView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public ShopCartViewDelegate createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b106f7cbf99fe1f626dc32e5ff130d1e", RobustBitConfig.DEFAULT_VALUE) ? (ShopCartViewDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b106f7cbf99fe1f626dc32e5ff130d1e") : new ShopCartViewDelegate(aoVar);
    }

    @ReactProp(name = "cid")
    public void setCid(ShopCartViewDelegate shopCartViewDelegate, String str) {
        Object[] objArr = {shopCartViewDelegate, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f575f39f62d12c8b3b5d2dff36fc33fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f575f39f62d12c8b3b5d2dff36fc33fb");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.d("ShoppingCar", "require cid=", str);
        shopCartViewDelegate.setCid(str);
    }

    @ReactProp(name = "rootTag")
    public void setRootTag(ShopCartViewDelegate shopCartViewDelegate, int i) {
        Object[] objArr = {shopCartViewDelegate, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "280ebc953999ed330b2a9fac8316318e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "280ebc953999ed330b2a9fac8316318e");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.d("setRootTag", "setRootTag=", Integer.valueOf(i));
        shopCartViewDelegate.setRootTag(i);
    }

    @ReactProp(name = "localBusinessExtra")
    public void setLocalBusinessExtra(ShopCartViewDelegate shopCartViewDelegate, String str) {
        Object[] objArr = {shopCartViewDelegate, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6418f0e58c793dac8571ccc4a7248c67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6418f0e58c793dac8571ccc4a7248c67");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.d("localBusinessExtra", "", str);
        shopCartViewDelegate.setLocalBusinessExtra(str);
    }

    @ReactProp(name = "mrnMinVersion")
    public void setMRNMinVersion(ShopCartViewDelegate shopCartViewDelegate, String str) {
        Object[] objArr = {shopCartViewDelegate, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2575f30b376bbafa786c721644989bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2575f30b376bbafa786c721644989bc4");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.d("shopcart_mrn_min_version", "", str);
        shopCartViewDelegate.setMrnMinVersion(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull ShopCartViewDelegate shopCartViewDelegate) {
        Object[] objArr = {shopCartViewDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c337920a77735104e70763b2d3a54754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c337920a77735104e70763b2d3a54754");
            return;
        }
        super.onAfterUpdateTransaction((SMMRNShopCartView) shopCartViewDelegate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = ShopCartViewDelegate.a;
        if (PatchProxy.isSupport(objArr2, shopCartViewDelegate, changeQuickRedirect3, false, "58c0cb6b8589c0bf19bac84b29a2abd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, shopCartViewDelegate, changeQuickRedirect3, false, "58c0cb6b8589c0bf19bac84b29a2abd1");
        } else if (shopCartViewDelegate.a() || shopCartViewDelegate.c != null) {
        } else {
            ViewGroup viewGroup = (ViewGroup) shopCartViewDelegate.getActivity().getLayoutInflater().inflate(R.layout.wm_sc_shopcart_bridge_vessel, (ViewGroup) null);
            shopCartViewDelegate.d = viewGroup;
            shopCartViewDelegate.c = (ViewGroup) viewGroup.findViewById(R.id.fl_shopcart_container);
            shopCartViewDelegate.c.setVisibility(8);
            shopCartViewDelegate.addView(viewGroup);
            e eVar = SMMRNShopCartModule.successEventMap.get(shopCartViewDelegate.getActivity().hashCode());
            if (eVar != null) {
                shopCartViewDelegate.onMRNLoadShopCartSuccess(eVar);
            }
        }
    }
}
