package com.sankuai.waimai.bussiness.order.confirm.rn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderConfirmInvoiceMrnReactPackage implements MRNReactPackageInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.shell.MRNReactPackageInterface
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b021a826e7de2e1fc0579c61932a69d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b021a826e7de2e1fc0579c61932a69d7");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.bussiness.order.confirm.rn.OrderConfirmInvoiceMrnReactPackage.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1195ae9044d35f17899dc156e0fd24b5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1195ae9044d35f17899dc156e0fd24b5") : Arrays.asList(new GlobalScreenShotModule(reactApplicationContext));
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b16fc02fc8d9e0b8139e503f2384986", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b16fc02fc8d9e0b8139e503f2384986") : Collections.emptyList();
            }
        });
        return arrayList;
    }
}
