package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.al;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMLogcenterReportModule extends ReactContextBaseJavaModule {
    private static final String TAG = "SGLogcenterReport";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SGIMLogcenterReportModule";
    }

    public SGIMLogcenterReportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38fcd97fdbd4fd9e96db4e77f463c884", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38fcd97fdbd4fd9e96db4e77f463c884");
        }
    }

    @ReactMethod
    public void report(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0169de5bb392b92ff5a355461aaec5e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0169de5bb392b92ff5a355461aaec5e9");
        } else if (readableMap == null) {
        } else {
            final com.sankuai.waimai.store.logcenter.d b = com.sankuai.waimai.store.logcenter.d.b();
            final HashMap<String, Object> hashMap = readableMap.toHashMap();
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.logcenter.d.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect3, false, "35608106df551ffa5aaa98dcc470443c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect3, false, "35608106df551ffa5aaa98dcc470443c");
            } else if (b.b || hashMap == null) {
            } else {
                al.a(new Runnable() { // from class: com.sankuai.waimai.store.logcenter.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ea1b9157bd68b71a0952fdfb44bfe164", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ea1b9157bd68b71a0952fdfb44bfe164");
                            return;
                        }
                        d.a(b, hashMap);
                        d.a(b);
                    }
                }, b.getClass().getSimpleName());
            }
        }
    }
}
