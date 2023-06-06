package com.meituan.android.mrn.module;

import com.facebook.common.logging.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.engine.p;
import com.meituan.android.mrn.engine.q;
import com.meituan.android.mrn.engine.x;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.c;
import com.meituan.android.mrn.utils.s;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
@ReactModule(name = "MRNBundleModule")
/* loaded from: classes2.dex */
public class MRNBundleModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNBundleModule";
    private static final String TAG = "MRNBundleModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNBundleModule";
    }

    @ReactMethod
    public void initSuccess() {
    }

    public MRNBundleModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10996fdf1966b57c6757aeca2c0e67a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10996fdf1966b57c6757aeca2c0e67a4");
        }
    }

    @ReactMethod
    public void loadScript(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "032e3feff4e8754fd291dc268f15e647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "032e3feff4e8754fd291dc268f15e647");
            return;
        }
        try {
            String str3 = TAG;
            a.b(str3, "bundlePath:" + str + "bundleName:" + str2);
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.MRNBundleModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "975c218375248092bf47aca4fbf2000b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "975c218375248092bf47aca4fbf2000b");
                        return;
                    }
                    String[] split = str2.split(CommonConstant.Symbol.UNDERLINE);
                    if (split == null || split.length != 4) {
                        return;
                    }
                    k a2 = n.a().a(split[0] + CommonConstant.Symbol.UNDERLINE + split[1] + CommonConstant.Symbol.UNDERLINE + split[2]);
                    if (a2 != null) {
                        if (a2.i != null) {
                            promise.resolve(null);
                            return;
                        }
                        x a3 = x.a();
                        String str4 = str2;
                        Object[] objArr3 = {str4};
                        ChangeQuickRedirect changeQuickRedirect4 = x.a;
                        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "eae033d235d50cdd4be57e18bcc684a8", RobustBitConfig.DEFAULT_VALUE)) {
                            file = (File) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "eae033d235d50cdd4be57e18bcc684a8");
                        } else {
                            if (!str4.endsWith(MRNBundleManager.DIO_BUNDLE_SUFFIX)) {
                                str4 = str4 + MRNBundleManager.DIO_BUNDLE_SUFFIX;
                            }
                            file = new File(a3.d(), str4);
                        }
                        if (new DioFile(file, str).c()) {
                            a2.b.runJsBundle(q.a(file.toString(), str, new File(file, str).getAbsolutePath(), false, null));
                            return;
                        }
                        s.a(MRNBundleModule.this.getReactApplicationContext());
                        a2.f = p.ERROR;
                        c.a("[MRNBundleModule@loadScript@run]", str2);
                    }
                }
            });
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
