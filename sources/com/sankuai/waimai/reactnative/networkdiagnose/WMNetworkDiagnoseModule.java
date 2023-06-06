package com.sankuai.waimai.reactnative.networkdiagnose;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.diagnose.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMNetworkDiagnoseModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMNetworkDiagnoseModule";
    }

    public WMNetworkDiagnoseModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12cf7a0d18d425372ceebfb0d011efc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12cf7a0d18d425372ceebfb0d011efc8");
        }
    }

    @ReactMethod
    public void startDiagnose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8db98e6da1f827ebefe5d04282dcdf02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8db98e6da1f827ebefe5d04282dcdf02");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.reactnative.networkdiagnose.WMNetworkDiagnoseModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b94453949215d0c6f5553ab37f5b5ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b94453949215d0c6f5553ab37f5b5ec");
                    } else {
                        a.a().a(new a.InterfaceC1068a() { // from class: com.sankuai.waimai.reactnative.networkdiagnose.WMNetworkDiagnoseModule.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.net.diagnose.a.InterfaceC1068a
                            public final void a(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fcb4c20a027af0524758a81bee0021bd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fcb4c20a027af0524758a81bee0021bd");
                                } else {
                                    WMNetworkDiagnoseModule.this.publishProgress(i);
                                }
                            }

                            @Override // com.sankuai.waimai.platform.net.diagnose.a.InterfaceC1068a
                            public final void a(String str) {
                                Object[] objArr3 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "90d25b9109331331e4c4c682a9257f9c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "90d25b9109331331e4c4c682a9257f9c");
                                    return;
                                }
                                WMNetworkDiagnoseModule.this.publishProgress(100);
                                WMNetworkDiagnoseModule.this.publishComplete(true ^ TextUtils.isEmpty(str));
                                WMNetworkDiagnoseModule.this.publishResult(str);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishResult(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de62535bcdf88840b24b49fce0dc50ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de62535bcdf88840b24b49fce0dc50ba");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("event_diagnose_result", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcd8044720540a6b6d2d9044ae19d5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcd8044720540a6b6d2d9044ae19d5ab");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("event_diagnose_progress", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishComplete(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82768007a46399dbdf7b0a94d205d43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82768007a46399dbdf7b0a94d205d43d");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("event_diagnose_complete", Boolean.valueOf(z));
        }
    }
}
