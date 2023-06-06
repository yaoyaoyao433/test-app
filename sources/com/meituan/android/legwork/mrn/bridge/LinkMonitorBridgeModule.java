package com.meituan.android.legwork.mrn.bridge;

import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.legwork.bean.monitor.Link;
import com.meituan.android.legwork.bean.monitor.LinkNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LinkMonitorBridgeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "LinkMonitor";
    }

    public LinkMonitorBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a57a19e5b1cb1e007e590703d9cff0e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a57a19e5b1cb1e007e590703d9cff0e3");
        }
    }

    @ReactMethod
    public void getLink(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eebd84a4896751fb56c720bf7f573bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eebd84a4896751fb56c720bf7f573bfd");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            promise.resolve(null);
        } else {
            Link a = com.meituan.android.legwork.monitor.b.a().a(str, str2, str3);
            if (a == null) {
                promise.resolve(null);
            } else {
                promise.resolve(com.meituan.android.legwork.net.util.b.a().toJson(a));
            }
        }
    }

    @ReactMethod
    public void updateLinksStatus(String str, String str2, int i, Promise promise) {
        Object[] objArr = {str, str2, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485b4c2c89bb5ee01f1df49cbe8c7fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485b4c2c89bb5ee01f1df49cbe8c7fe8");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            promise.resolve(Boolean.FALSE);
        } else {
            com.meituan.android.legwork.monitor.b.a().a(str, str2, i);
            promise.resolve(Boolean.TRUE);
        }
    }

    @ReactMethod
    public void addNode(String str, String str2, ReadableMap readableMap, Promise promise) {
        Object[] objArr = {str, str2, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9a697e8b24c99b8bf14d2c58dbc12a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9a697e8b24c99b8bf14d2c58dbc12a3");
        } else if (readableMap == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            LinkNode linkNode = new LinkNode();
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            if (hashMap.get("nodeName") instanceof String) {
                linkNode.nodeName = (String) hashMap.get("nodeName");
            }
            if (hashMap.get("nodeType") instanceof String) {
                linkNode.nodeType = (String) hashMap.get("nodeType");
            }
            if (hashMap.get("timeout") instanceof Double) {
                linkNode.timeout = ((Double) hashMap.get("timeout")).longValue();
            }
            promise.resolve(Boolean.valueOf(com.meituan.android.legwork.monitor.b.a().a(str, str2, linkNode)));
        }
    }
}
