package com.meituan.android.legwork.mrn.reactPackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.legwork.mrn.bridge.CommonBridgeModule;
import com.meituan.android.legwork.mrn.bridge.EnvironmentBridgeModule;
import com.meituan.android.legwork.mrn.bridge.IMPushBridgeModule;
import com.meituan.android.legwork.mrn.bridge.LegworkJarvisModule;
import com.meituan.android.legwork.mrn.bridge.LinkMonitorBridgeModule;
import com.meituan.android.legwork.mrn.bridge.LocationBridgeModule;
import com.meituan.android.legwork.mrn.bridge.NodeMonitorBridgeModule;
import com.meituan.android.legwork.mrn.bridge.PhotoBridgeModule;
import com.meituan.android.legwork.mrn.view.BMLWGoodsListContentViewManager;
import com.meituan.android.legwork.mrn.view.DragDownCloseViewManager;
import com.meituan.android.legwork.mrn.view.PtNestedScrollContainerViewManager;
import com.meituan.android.legwork.mrn.view.WeatherViewManager;
import com.meituan.android.legwork.mrn.view.mapAnchor.BMLWOnceAnimViewManager;
import com.meituan.android.legwork.mrn.view.outlineText.ReactOutlineTextViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    @Nonnull
    public final List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f3cfd27362148b10ef4a2a6623ff60", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f3cfd27362148b10ef4a2a6623ff60") : Arrays.asList(new CommonBridgeModule(reactApplicationContext), new EnvironmentBridgeModule(reactApplicationContext), new LocationBridgeModule(reactApplicationContext), new LinkMonitorBridgeModule(reactApplicationContext), new IMPushBridgeModule(reactApplicationContext), new NodeMonitorBridgeModule(reactApplicationContext), new PhotoBridgeModule(reactApplicationContext), new LegworkJarvisModule(reactApplicationContext));
    }

    @Override // com.facebook.react.i
    @Nonnull
    public final List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f95a275f86342a06f8733f0df1590d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f95a275f86342a06f8733f0df1590d") : Arrays.asList(new PtNestedScrollContainerViewManager(), new BMLWGoodsListContentViewManager(), new WeatherViewManager(), new DragDownCloseViewManager(), new ReactOutlineTextViewManager(), new BMLWOnceAnimViewManager());
    }
}
