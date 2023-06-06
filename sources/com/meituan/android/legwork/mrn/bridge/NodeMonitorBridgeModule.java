package com.meituan.android.legwork.mrn.bridge;

import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.legwork.bean.monitor.Node;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NodeMonitorBridgeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "NodeMonitor";
    }

    public NodeMonitorBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92ee3c2ed2795b6dea8fdf1bf9966f78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92ee3c2ed2795b6dea8fdf1bf9966f78");
        }
    }

    @ReactMethod
    public void getLink(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e44f26dafe5817cc844b4f2a26673cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e44f26dafe5817cc844b4f2a26673cfe");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            promise.resolve(null);
        } else if (com.meituan.android.legwork.monitor.e.a().a(str, str2, str3) == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            promise.resolve(Boolean.TRUE);
        }
    }

    @ReactMethod
    public void addNode(String str, String str2, ReadableMap readableMap, Promise promise) {
        Object[] objArr = {str, str2, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52c7b99c3fbe9a916fdca5e28a127af4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52c7b99c3fbe9a916fdca5e28a127af4");
        } else if (readableMap == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            Node node = new Node();
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            if (hashMap.get("nodeName") instanceof String) {
                node.nodeName = (String) hashMap.get("nodeName");
            }
            if (hashMap.get("nodeType") instanceof String) {
                node.nodeType = (String) hashMap.get("nodeType");
            }
            if (hashMap.get(Node.FILED_NODE_STATUS) instanceof Double) {
                node.nodeStatus = (String) hashMap.get(Node.FILED_NODE_STATUS);
            }
            promise.resolve(Boolean.valueOf(com.meituan.android.legwork.monitor.e.a().a(str, str2, node)));
        }
    }

    @ReactMethod
    public void updateNodeStatus(String str, String str2, ReadableMap readableMap, Promise promise) {
        Object[] objArr = {str, str2, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c6a7f0722c720db71b75f5b2c419b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c6a7f0722c720db71b75f5b2c419b4e");
        } else if (readableMap == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            Node node = new Node();
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            if (hashMap.get("nodeName") instanceof String) {
                node.nodeName = (String) hashMap.get("nodeName");
            }
            if (hashMap.get("nodeType") instanceof String) {
                node.nodeType = (String) hashMap.get("nodeType");
            }
            if (hashMap.get(Node.FILED_NODE_STATUS) instanceof String) {
                node.nodeStatus = (String) hashMap.get(Node.FILED_NODE_STATUS);
            }
            if (hashMap.get("errorCode") instanceof Double) {
                node.errorCode = ((Double) hashMap.get("errorCode")).intValue();
            }
            if (hashMap.get("errorMsg") instanceof String) {
                node.errorMsg = (String) hashMap.get("errorMsg");
            }
            promise.resolve(Boolean.valueOf(com.meituan.android.legwork.monitor.e.a().b(str, str2, node)));
        }
    }
}
