package com.sankuai.rn.component.lottie;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7270a05fe623a3e5447754024ea566", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7270a05fe623a3e5447754024ea566") : Collections.emptyList();
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7569df8bfbc698b6366e71e71989ec24", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7569df8bfbc698b6366e71e71989ec24") : Collections.singletonList(new MRNLottieAnimationViewManager());
    }
}
