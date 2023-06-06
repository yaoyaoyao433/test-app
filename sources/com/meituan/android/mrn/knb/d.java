package com.meituan.android.mrn.knb;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.module.AuditsBridgeModule;
import com.meituan.android.mrn.module.MRNABTestStrategyModule;
import com.meituan.android.mrn.module.MRNBundleModule;
import com.meituan.android.mrn.module.MRNContainerControlModule;
import com.meituan.android.mrn.module.MRNDebugModule;
import com.meituan.android.mrn.module.MRNEnvModule;
import com.meituan.android.mrn.module.MRNMonitorModule;
import com.meituan.android.mrn.module.MRNPageLoadBridgeModule;
import com.meituan.android.mrn.module.MRNPreLoadModule;
import com.meituan.android.mrn.module.MRNRaptorMetricsModule;
import com.meituan.android.mrn.module.MRNRequestModule;
import com.meituan.android.mrn.module.MRNSntpModule;
import com.meituan.android.mrn.module.MRNStatistics;
import com.meituan.android.mrn.module.MRNTimeModule;
import com.meituan.android.mrn.module.MRNToastModule;
import com.meituan.android.mrn.module.MRNUtilsModule;
import com.meituan.android.mrn.module.MRNViewModule;
import com.meituan.android.mrn.module.MRNWarmUpModule;
import com.meituan.android.mrn.module.PageRouterModule;
import com.meituan.android.mrn.services.KNBBridgeModule;
import com.meituan.metrics.rn.MetricsModule;
import com.meituan.metrics.rn.MetricsSpeedMeterTaskModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.reactnativecommunity.netinfo.NetInfoModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69df8c4b762f9583fc3f5ab5dc10f248", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69df8c4b762f9583fc3f5ab5dc10f248") : Arrays.asList(new AndroidInfoModule(reactApplicationContext), new SourceCodeModule(reactApplicationContext), new DeviceInfoModule(reactApplicationContext), new AccessibilityInfoModule(reactApplicationContext), new AppStateModule(reactApplicationContext), new BlobModule(reactApplicationContext), new FileReaderModule(reactApplicationContext), new AsyncStorageModule(reactApplicationContext), new ClipboardModule(reactApplicationContext), new DialogModule(reactApplicationContext), new I18nManagerModule(reactApplicationContext), new ImageEditingManager(reactApplicationContext), new ImageLoaderModule(reactApplicationContext), new ImageStoreManager(reactApplicationContext), new IntentModule(reactApplicationContext), new NetworkingModule(reactApplicationContext), new PermissionsModule(reactApplicationContext), new ShareModule(reactApplicationContext), new StatusBarModule(reactApplicationContext), new ToastModule(reactApplicationContext), new VibrationModule(reactApplicationContext), new WebSocketModule(reactApplicationContext), new KNBBridgeModule(reactApplicationContext), new MRNBundleModule(reactApplicationContext), new MRNEnvModule(reactApplicationContext), new PageRouterModule(reactApplicationContext), new MRNRequestModule(reactApplicationContext), new MRNToastModule(reactApplicationContext), new MRNViewModule(reactApplicationContext), new MRNUtilsModule(reactApplicationContext), new MRNContainerControlModule(reactApplicationContext), new MRNStatistics(reactApplicationContext), new MRNABTestStrategyModule(reactApplicationContext), new MRNDebugModule(reactApplicationContext), new MRNSntpModule(reactApplicationContext), new MRNMonitorModule(reactApplicationContext), new MRNWarmUpModule(reactApplicationContext), new MRNPageLoadBridgeModule(reactApplicationContext), new MRNPreLoadModule(reactApplicationContext), new MetricsModule(reactApplicationContext), new MetricsSpeedMeterTaskModule(reactApplicationContext), new AuditsBridgeModule(reactApplicationContext), new MRNTimeModule(reactApplicationContext), new MRNRaptorMetricsModule(reactApplicationContext), new NetInfoModule(reactApplicationContext));
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605ef056762fdb665b8f1dd00922a7e9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605ef056762fdb665b8f1dd00922a7e9") : Collections.emptyList();
    }
}
