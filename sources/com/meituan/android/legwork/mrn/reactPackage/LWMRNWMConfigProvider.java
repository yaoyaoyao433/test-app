package com.meituan.android.legwork.mrn.reactPackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.pullrefresh.WMPullRefreshManager;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LWMRNWMConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return "banma";
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getBusinessReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d9bb792449164079ed23e16135051b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d9bb792449164079ed23e16135051b") : Collections.singletonList(new i() { // from class: com.meituan.android.legwork.mrn.reactPackage.LWMRNWMConfigProvider.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            @Nonnull
            public final List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c32f24fdafa99d38562e866824f3965", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c32f24fdafa99d38562e866824f3965") : Collections.emptyList();
            }

            @Override // com.facebook.react.i
            @Nonnull
            public final List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "948c3d7082d6fea7fee3cd6a87914ee7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "948c3d7082d6fea7fee3cd6a87914ee7") : Collections.singletonList(new WMPullRefreshManager());
            }
        });
    }
}
