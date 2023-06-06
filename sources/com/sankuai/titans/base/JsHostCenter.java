package com.sankuai.titans.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.IJsHostCenter;
import com.sankuai.titans.protocol.utils.PublishCenter;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsHostCenter implements IJsHostCenter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<AbsJsHost, Set<String>> hostSetMap;

    public JsHostCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b94cf0db595ba0a08e6e585205cba7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b94cf0db595ba0a08e6e585205cba7d");
            return;
        }
        this.hostSetMap = new HashMap();
        PublishCenter.getInstance().registerCallback(new PublishCenter.ReceivedActionCallback() { // from class: com.sankuai.titans.base.JsHostCenter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.utils.PublishCenter.ReceivedActionCallback
            public void onReceivedAction(String str, JSONObject jSONObject) {
                Object[] objArr2 = {str, jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be6b8af450903c4bc914373810eedd48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be6b8af450903c4bc914373810eedd48");
                } else {
                    JsHostCenter.this.publish(str, jSONObject);
                }
            }
        });
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IJsHostCenter
    public void publish(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5f6ec61c421207a30472679d671cd46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5f6ec61c421207a30472679d671cd46");
            return;
        }
        synchronized (this.hostSetMap) {
            for (AbsJsHost absJsHost : this.hostSetMap.keySet()) {
                Set<String> set = this.hostSetMap.get(absJsHost);
                if (set != null && !set.isEmpty()) {
                    if (set.contains(str)) {
                        absJsHost.getBridgePubSub().publish(str, jSONObject);
                    }
                }
                return;
            }
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IJsHostCenter
    public void subscribe(String str, AbsJsHost absJsHost, AbsJsHandler absJsHandler) {
        Object[] objArr = {str, absJsHost, absJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a18fa3bddba9ffb3fb5b97d52b52951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a18fa3bddba9ffb3fb5b97d52b52951");
            return;
        }
        synchronized (this.hostSetMap) {
            Set<String> set = this.hostSetMap.get(absJsHost);
            if (set == null) {
                set = new HashSet<>();
                this.hostSetMap.put(absJsHost, set);
            }
            set.add(str);
            absJsHost.getBridgePubSub().subscribe(str, absJsHandler);
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IJsHostCenter
    public void unSubscribe(String str, AbsJsHost absJsHost) {
        Object[] objArr = {str, absJsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdae33dd3495daac3abaca03871d220d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdae33dd3495daac3abaca03871d220d");
            return;
        }
        synchronized (this.hostSetMap) {
            Set<String> set = this.hostSetMap.get(absJsHost);
            if (set == null) {
                return;
            }
            set.remove(str);
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IJsHostCenter
    public void unSubscribeAll(AbsJsHost absJsHost) {
        Object[] objArr = {absJsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "948b4b048eeed89f816cfcc5e66d5cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "948b4b048eeed89f816cfcc5e66d5cc6");
            return;
        }
        synchronized (this.hostSetMap) {
            this.hostSetMap.remove(absJsHost);
        }
    }
}
