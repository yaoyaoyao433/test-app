package com.sankuai.waimai.rocks.rn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2187d46ee2fde59f82f84b829374ef4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2187d46ee2fde59f82f84b829374ef4d");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WMRocksPageModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5be765c64537f60f025d9f17e199bb", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5be765c64537f60f025d9f17e199bb") : Collections.emptyList();
    }
}
