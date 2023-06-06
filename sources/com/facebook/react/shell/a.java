package com.facebook.react.shell;

import android.support.annotation.Nullable;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends n {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.n
    @Nullable
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        char c;
        switch (str.hashCode()) {
            case -2115067288:
                if (str.equals(ToastModule.NAME)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -2033388651:
                if (str.equals(AsyncStorageModule.NAME)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1962922905:
                if (str.equals(ImageStoreManager.NAME)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1850625090:
                if (str.equals(SoundManagerModule.NAME)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1654566518:
                if (str.equals(DialogModule.NAME)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1505215509:
                if (str.equals(CameraRollManager.NAME)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1344126773:
                if (str.equals(FileReaderModule.NAME)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1062061717:
                if (str.equals(PermissionsModule.NAME)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -570370161:
                if (str.equals(I18nManagerModule.NAME)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -504784764:
                if (str.equals(AppearanceModule.NAME)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -457866500:
                if (str.equals(AccessibilityInfoModule.NAME)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -382654004:
                if (str.equals(StatusBarModule.NAME)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -254310125:
                if (str.equals("WebSocketModule")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 283572496:
                if (str.equals(ImageEditingManager.NAME)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 403570038:
                if (str.equals(ClipboardModule.NAME)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 563961875:
                if (str.equals(IntentModule.NAME)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1221389072:
                if (str.equals(AppStateModule.NAME)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1515242260:
                if (str.equals(NetworkingModule.NAME)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1547941001:
                if (str.equals(BlobModule.NAME)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1555425035:
                if (str.equals(ShareModule.NAME)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1721274886:
                if (str.equals(NativeAnimatedModule.NAME)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1922110066:
                if (str.equals(VibrationModule.NAME)) {
                    c = 20;
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
                return new AccessibilityInfoModule(reactApplicationContext);
            case 1:
                return new AppearanceModule(reactApplicationContext);
            case 2:
                return new AppStateModule(reactApplicationContext);
            case 3:
                return new BlobModule(reactApplicationContext);
            case 4:
                return new FileReaderModule(reactApplicationContext);
            case 5:
                return new AsyncStorageModule(reactApplicationContext);
            case 6:
                return new CameraRollManager(reactApplicationContext);
            case 7:
                return new ClipboardModule(reactApplicationContext);
            case '\b':
                return new DialogModule(reactApplicationContext);
            case '\t':
                return new I18nManagerModule(reactApplicationContext);
            case '\n':
                return new ImageEditingManager(reactApplicationContext);
            case 11:
                return new ImageStoreManager(reactApplicationContext);
            case '\f':
                return new IntentModule(reactApplicationContext);
            case '\r':
                return new NativeAnimatedModule(reactApplicationContext);
            case 14:
                return new NetworkingModule(reactApplicationContext);
            case 15:
                return new PermissionsModule(reactApplicationContext);
            case 16:
                return new ShareModule(reactApplicationContext);
            case 17:
                return new StatusBarModule(reactApplicationContext);
            case 18:
                return new SoundManagerModule(reactApplicationContext);
            case 19:
                return new ToastModule(reactApplicationContext);
            case 20:
                return new VibrationModule(reactApplicationContext);
            case 21:
                return new WebSocketModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.n, com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactViewPagerManager());
        arrayList.add(new ReactVirtualTextViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.n
    public final com.facebook.react.module.model.a getReactModuleInfoProvider() {
        try {
            return (com.facebook.react.module.model.a) Class.forName("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, FileReaderModule.class, AsyncStorageModule.class, CameraRollManager.class, ClipboardModule.class, DialogModule.class, I18nManagerModule.class, ImageEditingManager.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < 22; i++) {
                Class cls = clsArr[i];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(cls)));
            }
            return new com.facebook.react.module.model.a() { // from class: com.facebook.react.shell.a.1
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
}
