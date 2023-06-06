package com.dianping.live.report.mrn;

import com.dianping.live.live.mrn.a;
import com.dianping.live.report.d;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveReportModule extends ReactContextBaseJavaModule {
    private static String MODULE_NAME = "MLiveReportModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    public MLiveReportModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7371b1a9eee72b91208a6721f170504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7371b1a9eee72b91208a6721f170504");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void reportToMetrics(ReadableMap readableMap, ReadableMap readableMap2) {
        HashMap hashMap;
        Object[] objArr = {readableMap, readableMap2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a135ad19f361879d438ad40fa63389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a135ad19f361879d438ad40fa63389");
        } else if (readableMap != null && !readableMap.toHashMap().isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (String str : readableMap.toHashMap().keySet()) {
                if (readableMap.getDynamic(str).getType().equals(ReadableType.Number)) {
                    hashMap2.put(str, Double.valueOf(readableMap.getDouble(str)));
                }
            }
            if (readableMap2 == null || readableMap2.toHashMap().isEmpty()) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                for (String str2 : readableMap2.toHashMap().keySet()) {
                    hashMap.put(str2, readableMap2.toHashMap().get(str2));
                }
            }
            if (hashMap2.isEmpty()) {
                return;
            }
            d.b.a(null, hashMap2, hashMap);
        }
    }

    @ReactMethod
    public void joinNewLiveFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cb20ba25ba2008bf2b9bc5a0321d1c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cb20ba25ba2008bf2b9bc5a0321d1c7");
        } else if (!(getCurrentActivity() instanceof a) || ((a) getCurrentActivity()).getMLivePlayerStatusMonitor() == null) {
        } else {
            ((a) getCurrentActivity()).getMLivePlayerStatusMonitor().a((String) null, -1.0d);
        }
    }

    @ReactMethod
    public void setPlayStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aceb32500f7df64a8a4d531e50981d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aceb32500f7df64a8a4d531e50981d9");
        } else if (getCurrentActivity() instanceof a) {
            d dVar = d.b;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "75a01731928c8c1c1a4f63fd88c66cc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "75a01731928c8c1c1a4f63fd88c66cc7");
            } else if (dVar.f == null || dVar.d == null || !dVar.d.containsKey(dVar.f)) {
            } else {
                Map<String, String> map = dVar.d.get(dVar.f);
                map.put("playStatus", String.valueOf(i));
                dVar.d.put(dVar.f, map);
            }
        }
    }
}
