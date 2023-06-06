package com.meituan.android.mrn.module;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.container.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNContainerControlModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNContainerControlModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNContainerControl";
    private static final String TAG = "MRNContainerControlModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNContainerControlModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77c8ff24cd36ef53a9f92f6df830353e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77c8ff24cd36ef53a9f92f6df830353e");
        }
    }

    @ReactMethod
    public void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a6378c0ba38888f51723e788cedc951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a6378c0ba38888f51723e788cedc951");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNContainerControlModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a3d40cfd6fe77722746b158a0899ad0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a3d40cfd6fe77722746b158a0899ad0");
                    } else if (MRNContainerControlModule.this.getCurrentActivity() == null || !(MRNContainerControlModule.this.getCurrentActivity() instanceof b)) {
                    } else {
                        ((b) MRNContainerControlModule.this.getCurrentActivity()).f();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void startLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ef0403df6b79a9f279547a40c889efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ef0403df6b79a9f279547a40c889efa");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNContainerControlModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b44545fc50d71d5361e095c29cbaed24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b44545fc50d71d5361e095c29cbaed24");
                    } else if (MRNContainerControlModule.this.getCurrentActivity() == null || !(MRNContainerControlModule.this.getCurrentActivity() instanceof b)) {
                    } else {
                        ((b) MRNContainerControlModule.this.getCurrentActivity()).i();
                    }
                }
            });
        }
    }
}
