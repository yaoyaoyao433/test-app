package com.sankuai.waimai.business.user.rn.studentcenter;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StudentCenterMrnReactPackage implements MRNReactPackageInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.shell.MRNReactPackageInterface
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9cb11ef12ee3c1c8f2d881b979186c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9cb11ef12ee3c1c8f2d881b979186c5");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.StudentCenterMrnReactPackage.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9126ade969b1c6d24750b75cf26706d9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9126ade969b1c6d24750b75cf26706d9") : Collections.singletonList(new StudentCenterModule(reactApplicationContext));
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62495ef058e2f4fcd1be7c2705bde63f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62495ef058e2f4fcd1be7c2705bde63f") : Collections.emptyList();
            }
        });
        return arrayList;
    }
}
