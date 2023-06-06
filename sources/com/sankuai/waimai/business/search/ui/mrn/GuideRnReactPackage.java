package com.sankuai.waimai.business.search.ui.mrn;

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
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GuideRnReactPackage implements MRNReactPackageInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.shell.MRNReactPackageInterface
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11efb6659c41d936325e9f8c11af708a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11efb6659c41d936325e9f8c11af708a");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.business.search.ui.mrn.GuideRnReactPackage.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            @Nonnull
            public final List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e32257c5f78f122116797156ba2eadc", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e32257c5f78f122116797156ba2eadc");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new SearchGuideNativeModule(reactApplicationContext));
                arrayList2.add(new SearchKeyboardNativeModule(reactApplicationContext));
                return arrayList2;
            }

            @Override // com.facebook.react.i
            @Nonnull
            public final List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3112369ae02c208e67666288e26a14ed", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3112369ae02c208e67666288e26a14ed") : Collections.emptyList();
            }
        });
        return arrayList;
    }
}
