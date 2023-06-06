package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.mrn.container.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.bizdiagnosis.a;
import com.sankuai.waimai.reactnative.WmRNActivity;
import com.sankuai.waimai.reactnative.utils.d;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNNetworkDiagnosisModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "NetworkDiagnosisModule";
    }

    public WMRNNetworkDiagnosisModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a3240702c2b1e8fa304d7ea9d33c812", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a3240702c2b1e8fa304d7ea9d33c812");
        }
    }

    @ReactMethod
    public void doDiagnosis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7678d6169e3ce783f770946b305fc06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7678d6169e3ce783f770946b305fc06");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof WmRNActivity) {
            WmRNActivity wmRNActivity = (WmRNActivity) currentActivity;
            g k = wmRNActivity.k();
            String b = k.p() != null ? k.p().b() : "";
            String a = wmRNActivity.a();
            if (TextUtils.isEmpty(a) || !d.a(a)) {
                return;
            }
            com.sankuai.waimai.platform.bizdiagnosis.a.a(a.EnumC1038a.RN, a, b);
        }
    }
}
