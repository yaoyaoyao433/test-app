package com.dianping.live.live.mrn;

import com.dianping.live.addressBridge.LiveAddressModule;
import com.dianping.live.im.mrn.LiveIMModule;
import com.dianping.live.report.mrn.MLiveReportModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.facebook.react.i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d927c3a8d1cbf081cba34dab267a34", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d927c3a8d1cbf081cba34dab267a34");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MLiveFloatBridgeModule(reactApplicationContext));
        arrayList.add(new LiveIMModule(reactApplicationContext));
        arrayList.add(new LiveAddressModule(reactApplicationContext));
        arrayList.add(new MLiveReportModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "847d0fcee2bdafc83d4df6720293c93b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "847d0fcee2bdafc83d4df6720293c93b") : Arrays.asList(new MLivePlayerModule(), new MLivePusherModule());
    }
}
