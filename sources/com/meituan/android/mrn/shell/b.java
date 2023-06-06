package com.meituan.android.mrn.shell;

import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.components.MRNProgressManager;
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
import com.meituan.android.mrn.module.MRNReportModule;
import com.meituan.android.mrn.module.MRNRequestModule;
import com.meituan.android.mrn.module.MRNSntpModule;
import com.meituan.android.mrn.module.MRNTimeModule;
import com.meituan.android.mrn.module.MRNToastModule;
import com.meituan.android.mrn.module.MRNUtilsModule;
import com.meituan.android.mrn.module.MRNViewModule;
import com.meituan.android.mrn.module.MRNWarmUpModule;
import com.meituan.android.mrn.module.PageRouterModule;
import com.meituan.android.mrn.module.msi.MSIBridgeModule;
import com.meituan.android.mrn.services.KNBBridgeModule;
import com.meituan.metrics.rn.MetricsModule;
import com.meituan.metrics.rn.MetricsSpeedMeterTaskModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import javax.inject.Provider;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class b extends LazyReactPackage {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.LazyReactPackage
    public final List<ModuleSpec> getNativeModules(final ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26abce362201ada445a050ba6804a21", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26abce362201ada445a050ba6804a21") : Arrays.asList(ModuleSpec.nativeModuleSpec(KNBBridgeModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.1
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "658c1f75f2b379ddd48c4b2dc59e1da3", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "658c1f75f2b379ddd48c4b2dc59e1da3") : new KNBBridgeModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNBundleModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.12
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e664c07fc0beab4e19752d31fcf4d5b2", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e664c07fc0beab4e19752d31fcf4d5b2") : new MRNBundleModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNEnvModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.17
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4776e8ad84ae1dfc6c1e50d31b5321ad", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4776e8ad84ae1dfc6c1e50d31b5321ad") : new MRNEnvModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(PageRouterModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.18
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa827ea53a2023ea9264988fc1e29925", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa827ea53a2023ea9264988fc1e29925") : new PageRouterModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNRequestModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.19
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "666c6240e2d0965a6e60eed4fa37b61d", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "666c6240e2d0965a6e60eed4fa37b61d") : new MRNRequestModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNToastModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.20
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07eecb63fa3f424c3c458c8ff92016ed", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07eecb63fa3f424c3c458c8ff92016ed") : new MRNToastModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNViewModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.21
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e0bde441da0efcfee0cf4dcb969fa64", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e0bde441da0efcfee0cf4dcb969fa64") : new MRNViewModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNUtilsModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.22
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eca097e63c957e5d068f524988db676c", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eca097e63c957e5d068f524988db676c") : new MRNUtilsModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNContainerControlModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.23
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82198cb57a1f7dc0ed4c52375c436937", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82198cb57a1f7dc0ed4c52375c436937") : new MRNContainerControlModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNABTestStrategyModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.2
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "337db48cc1b2fcb6518620aa37ce0da7", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "337db48cc1b2fcb6518620aa37ce0da7") : new MRNABTestStrategyModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNDebugModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.3
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e02b19a6aa830b06dd05f7d4a5643c3c", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e02b19a6aa830b06dd05f7d4a5643c3c") : new MRNDebugModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNSntpModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.4
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3edd4100b2fef69d4a3624fea14b209f", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3edd4100b2fef69d4a3624fea14b209f") : new MRNSntpModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNMonitorModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.5
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ef29dd292e352b1d20143efe3910b1d", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ef29dd292e352b1d20143efe3910b1d") : new MRNMonitorModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNWarmUpModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.6
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f26342d28c7f41eb77e35de430457b66", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f26342d28c7f41eb77e35de430457b66") : new MRNWarmUpModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNPageLoadBridgeModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.7
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28530ce4c2296da6efe0ee5383470124", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28530ce4c2296da6efe0ee5383470124") : new MRNPageLoadBridgeModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNPreLoadModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.8
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d65f4c171634daf0a7141e7e37392c1", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d65f4c171634daf0a7141e7e37392c1") : new MRNPreLoadModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MetricsModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.9
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1d5849c063a014f67e7f4c758a2e18d", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1d5849c063a014f67e7f4c758a2e18d") : new MetricsModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MetricsSpeedMeterTaskModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.10
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d51f45ef600851be2f5217ce3e785698", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d51f45ef600851be2f5217ce3e785698") : new MetricsSpeedMeterTaskModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(AuditsBridgeModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.11
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25eec793795ac11a78f1fa43b69f02c4", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25eec793795ac11a78f1fa43b69f02c4") : new AuditsBridgeModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNTimeModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.13
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f1623b4f0ed201f42ac363ee72a5c2f", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f1623b4f0ed201f42ac363ee72a5c2f") : new MRNTimeModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNRaptorMetricsModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.14
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7971c45cd7a13949df2c905d99641c5a", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7971c45cd7a13949df2c905d99641c5a") : new MRNRaptorMetricsModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MRNReportModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.15
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a60e39018f7e40554072d82ca3357200", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a60e39018f7e40554072d82ca3357200") : new MRNReportModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(MSIBridgeModule.class, new Provider<NativeModule>() { // from class: com.meituan.android.mrn.shell.b.16
            public static ChangeQuickRedirect a;

            @Override // javax.inject.Provider
            public final /* synthetic */ NativeModule get() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "771f70ed9a03c0ec74a418683561f8ba", RobustBitConfig.DEFAULT_VALUE) ? (NativeModule) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "771f70ed9a03c0ec74a418683561f8ba") : new MSIBridgeModule(reactApplicationContext);
            }
        }));
    }

    @Override // com.facebook.react.LazyReactPackage, com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e050294d2e55a0659860742d28c8c80", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e050294d2e55a0659860742d28c8c80") : Arrays.asList(new MRNProgressManager());
    }

    @Override // com.facebook.react.LazyReactPackage
    public final com.facebook.react.module.model.a getReactModuleInfoProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5443300ab1386584c3abc2a073d35303", RobustBitConfig.DEFAULT_VALUE) ? (com.facebook.react.module.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5443300ab1386584c3abc2a073d35303") : LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }
}
