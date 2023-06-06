package com.sankuai.waimai.store.drug.mrn.bridge;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.ad.a;
import com.sankuai.waimai.foundation.core.service.ad.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMRNADChargeReporter extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "MEDMRNADChargeReporterBridge";
    }

    public DrugMRNADChargeReporter(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "604d85e195b9c0d3049efcc47cef3311", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "604d85e195b9c0d3049efcc47cef3311");
        }
    }

    @ReactMethod
    public void adReport(String str, int i, int i2, ReadableMap readableMap) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76afcbb437950c234393eb2449177d2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76afcbb437950c234393eb2449177d2e");
            return;
        }
        String str2 = null;
        if (readableMap != null && readableMap.hasKey("eventId")) {
            str2 = readableMap.getString("eventId");
        }
        if (2 == i) {
            b.a().b(new a.C0946a(i2, str2, str).b);
        } else if (3 == i) {
            b.a().a(new a.C0946a(i2, str2, str).b);
        }
    }
}
