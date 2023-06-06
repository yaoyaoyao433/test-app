package com.sankuai.waimai.business.restaurant.goodsdetail.module;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager;
import com.sankuai.waimai.platform.machpro.mrn.MRNMachProViewManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65af60ecdfc60ea918a4e988d29c9f74", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65af60ecdfc60ea918a4e988d29c9f74");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GoodDetailLogicModule(reactApplicationContext));
        arrayList.add(new WMRNShoppingCartManager(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9363e743e66eef81fa4886427b9ce119", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9363e743e66eef81fa4886427b9ce119");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MRNMachProViewManager());
        return arrayList;
    }
}
