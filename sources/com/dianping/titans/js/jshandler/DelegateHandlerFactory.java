package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titansadapter.IJSBPerformer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.knbweb.delegate.DelegateJsHost;
import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DelegateHandlerFactory implements IKnbWebBridgeDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<AbsJsHost, DelegateJsHost> weakHashMap = new ConcurrentHashMap();

    @Override // com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate
    public String getApiVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fe7e5acb79fce5422adebcd24d084ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fe7e5acb79fce5422adebcd24d084ec");
        }
        String registerJsHandlerName = JsHandlerFactory.getRegisterJsHandlerName(str);
        if (!TextUtils.isEmpty(registerJsHandlerName) || Object.class.getName().equals(registerJsHandlerName)) {
            try {
                BaseJsHandler baseJsHandler = (BaseJsHandler) getClass().getClassLoader().loadClass(registerJsHandlerName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (baseJsHandler.isApiSupported()) {
                    return baseJsHandler.getApiVersion();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate
    public AbsJsHandler createJsHandler(AbsJsHost absJsHost, String str, String str2, String str3, String str4) {
        Object[] objArr = {absJsHost, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6957e003f86164c5c5afe2d98a3a12cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsJsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6957e003f86164c5c5afe2d98a3a12cf");
        }
        DelegateJsHost delegateJsHost = weakHashMap.get(absJsHost);
        if (delegateJsHost == null) {
            delegateJsHost = new DelegateJsHost(absJsHost);
            weakHashMap.put(absJsHost, delegateJsHost);
        }
        JsHandler.Source source = JsHandler.Source.TITANS;
        if (JsHandler.Source.MRN.name().equals(str4)) {
            source = JsHandler.Source.MRN;
        } else if (JsHandler.Source.THRID.name().equals(str4)) {
            source = JsHandler.Source.THRID;
        }
        JsHandler createJsHandler = JsHandlerFactory.createJsHandler(delegateJsHost, str, str3, str2, source);
        if (createJsHandler == null) {
            return null;
        }
        KnbWebDelegateJsHandler knbWebDelegateJsHandler = new KnbWebDelegateJsHandler(createJsHandler);
        knbWebDelegateJsHandler.source = str4;
        return knbWebDelegateJsHandler;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate
    public void removeDelegateJsHost(AbsJsHost absJsHost) {
        Object[] objArr = {absJsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee9c9f226b81f8abf95b3c14724076c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee9c9f226b81f8abf95b3c14724076c4");
            return;
        }
        DelegateJsHost remove = weakHashMap.remove(absJsHost);
        if (remove == null) {
            return;
        }
        IJSBPerformer jSBPerformer = BridgeManager.getJSBPerformer();
        if (jSBPerformer != null) {
            jSBPerformer.stopLocating();
        }
        JsHandlerFactory.removeJsHost(remove);
    }
}
