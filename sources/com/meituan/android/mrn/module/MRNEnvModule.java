package com.meituan.android.mrn.module;

import android.os.Build;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.mrn.config.c;
import com.meituan.android.mrn.config.e;
import com.meituan.android.mrn.debug.a;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = "MRNEnvironment")
/* loaded from: classes2.dex */
public class MRNEnvModule extends BaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ReactApplicationContext mReactApplicationContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNEnvironment";
    }

    public MRNEnvModule(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd9f2fe413b032f25e63ea9a25fdc629", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd9f2fe413b032f25e63ea9a25fdc629");
        } else {
            this.mReactApplicationContext = reactApplicationContext;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "396a608531691260d514f08db21b37a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "396a608531691260d514f08db21b37a4");
        }
        HashMap hashMap = new HashMap();
        e a = c.a();
        hashMap.put("channel", a != null ? a.k() : "");
        hashMap.put("package", this.mReactApplicationContext != null ? this.mReactApplicationContext.getPackageName() : "");
        hashMap.put("version", a != null ? a.l() : "");
        hashMap.put("versionCode", a != null ? String.valueOf(a.m()) : "");
        hashMap.put("MRNVersion", a != null ? "3.1201.206" : "");
        hashMap.put("appID", a != null ? String.valueOf(a.f()) : "");
        hashMap.put("isDebug", Boolean.valueOf(a.b()));
        hashMap.put("buildNumber", a != null ? a.a() : "");
        hashMap.put("device", Build.MODEL);
        hashMap.put("systemVersion", Build.VERSION.RELEASE);
        hashMap.put("isOnline", Boolean.valueOf(a.c()));
        return hashMap;
    }

    @ReactMethod
    public void getSerial(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a15359baa8c8eba13345732ac258dc42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a15359baa8c8eba13345732ac258dc42");
            return;
        }
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        final d dVar = new d() { // from class: com.meituan.android.mrn.module.MRNEnvModule.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str2, int i) {
                Object[] objArr2 = {str2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba92c94a7f37cad5f0401ee09a5c5605", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba92c94a7f37cad5f0401ee09a5c5605");
                } else if (com.meituan.android.mrn.privacy.a.a(i)) {
                    promise.resolve(AppUtil.getSerial(MRNEnvModule.this.mReactApplicationContext));
                } else {
                    Promise promise2 = promise;
                    promise2.reject("permission denied,code=" + i);
                }
            }
        };
        Object[] objArr2 = {reactApplicationContext, PermissionGuard.PERMISSION_PHONE_READ, str, dVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.privacy.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "54b087e33a3c388acc31afa62d94ecb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "54b087e33a3c388acc31afa62d94ecb5");
        } else if (com.meituan.android.mrn.privacy.a.b(PermissionGuard.PERMISSION_PHONE_READ)) {
            Privacy.createPermissionGuard().a(reactApplicationContext, com.meituan.android.mrn.privacy.a.a(PermissionGuard.PERMISSION_PHONE_READ), str, new d() { // from class: com.meituan.android.mrn.privacy.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str2, int i) {
                    Object[] objArr3 = {str2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "58374e4280a7da52ce774329373927ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "58374e4280a7da52ce774329373927ef");
                    } else if (dVar != null) {
                        dVar.onResult(r2, i);
                    }
                }
            });
        } else {
            Privacy.createPermissionGuard().a(reactApplicationContext, PermissionGuard.PERMISSION_PHONE_READ, str, dVar);
        }
    }
}
