package com.meituan.android.qianbao.mmpwidget2rn.rn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    @Nonnull
    public final List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ff3329baad95d50b20c3333fb0a3c2", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ff3329baad95d50b20c3333fb0a3c2") : Collections.emptyList();
    }

    @Override // com.facebook.react.i
    @Nonnull
    public final List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cbd148934599f2ac89b85e164fab6e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cbd148934599f2ac89b85e164fab6e") : Arrays.asList(new QBRNViewManager(reactApplicationContext));
    }
}
