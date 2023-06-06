package com.facebook.react;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.at;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CoreModulesPackage extends n implements k {
    private final com.facebook.react.modules.core.b mHardwareBackBtnHandler;
    private final boolean mLazyViewManagersEnabled;
    private final int mMinTimeLeftInFrameForNonBatchedOperationMs;
    private final ReactInstanceManager mReactInstanceManager;

    public CoreModulesPackage(ReactInstanceManager reactInstanceManager, com.facebook.react.modules.core.b bVar, @Nullable at atVar, boolean z, int i) {
        this.mReactInstanceManager = reactInstanceManager;
        this.mHardwareBackBtnHandler = bVar;
        this.mLazyViewManagersEnabled = z;
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
    }

    @Override // com.facebook.react.n
    public com.facebook.react.module.model.a getReactModuleInfoProvider() {
        try {
            return (com.facebook.react.module.model.a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < 7; i++) {
                Class cls = clsArr[i];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(cls)));
            }
            return new com.facebook.react.module.model.a() { // from class: com.facebook.react.CoreModulesPackage.1
                @Override // com.facebook.react.module.model.a
                public final Map<String, ReactModuleInfo> a() {
                    return hashMap;
                }
            };
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.n
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        char c;
        switch (str.hashCode()) {
            case -1789797270:
                if (str.equals(TimingModule.NAME)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1520650172:
                if (str.equals(DeviceInfoModule.NAME)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1037217463:
                if (str.equals(DeviceEventManagerModule.NAME)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -790603268:
                if (str.equals(AndroidInfoModule.NAME)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 881516744:
                if (str.equals(SourceCodeModule.NAME)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1256514152:
                if (str.equals(HeadlessJsTaskSupportModule.NAME)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new AndroidInfoModule(reactApplicationContext);
            case 1:
                return new DeviceEventManagerModule(reactApplicationContext, this.mHardwareBackBtnHandler);
            case 2:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case 3:
                return new SourceCodeModule(reactApplicationContext);
            case 4:
                return new TimingModule(reactApplicationContext, this.mReactInstanceManager.getDevSupportManager());
            case 5:
                return createUIManager(reactApplicationContext);
            case 6:
                return new DeviceInfoModule(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.systrace.a.a(0L, "createUIManagerModule");
        try {
            if (this.mLazyViewManagersEnabled) {
                return new UIManagerModule(reactApplicationContext, new UIManagerModule.c() { // from class: com.facebook.react.CoreModulesPackage.2
                    @Override // com.facebook.react.uimanager.UIManagerModule.c
                    @Nullable
                    public final ViewManager a(String str) {
                        return CoreModulesPackage.this.mReactInstanceManager.createViewManager(str);
                    }

                    @Override // com.facebook.react.uimanager.UIManagerModule.c
                    public final List<String> a() {
                        return CoreModulesPackage.this.mReactInstanceManager.getViewManagerNames();
                    }
                }, this.mMinTimeLeftInFrameForNonBatchedOperationMs);
            }
            return new UIManagerModule(reactApplicationContext, this.mReactInstanceManager.getOrCreateViewManagers(reactApplicationContext), this.mMinTimeLeftInFrameForNonBatchedOperationMs);
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.k
    public void startProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.k
    public void endProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }
}
