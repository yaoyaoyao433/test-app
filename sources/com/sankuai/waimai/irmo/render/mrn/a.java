package com.sankuai.waimai.irmo.render.mrn;

import android.support.annotation.NonNull;
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
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    @NonNull
    public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f745e2302670f219326d041dcd6b4be1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f745e2302670f219326d041dcd6b4be1") : Collections.emptyList();
    }

    @Override // com.facebook.react.i
    @NonNull
    public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d808d3a169845f4dc0d94f1e807d63ba", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d808d3a169845f4dc0d94f1e807d63ba") : Collections.singletonList(new MRNEffectViewManager());
    }
}
