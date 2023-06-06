package com.meituan.android.neohybrid.framework.neo.js;

import android.support.annotation.Keep;
import android.webkit.JavascriptInterface;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.JsHandlerVerifyImpl;
import com.dianping.titans.js.jshandler.JsHandlerVerifyStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.Collections;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class WebKNBInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final JsHandlerVerifyStrategy jsHandlerVerifyStrategy;
    private final a webJsHost;

    public WebKNBInterface(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f917bd5449929a2df8df0dc79ed2e7d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f917bd5449929a2df8df0dc79ed2e7d1");
            return;
        }
        this.webJsHost = aVar;
        this.jsHandlerVerifyStrategy = new JsHandlerVerifyImpl(KNBConfig.getStringListConfig(KNBConfig.CONFIG_BRIDGE_GREEN, Collections.emptyList()), KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST), KNBWebManager.getEnvironment().getKNBAppId(), KNBWebManager.showDebugUrl());
    }

    @JavascriptInterface
    public void sendMessage(String str) {
        JsHandler createJsHandler;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a435181c8d873266d7af85f871b66d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a435181c8d873266d7af85f871b66d89");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!str.startsWith(TitansConstants.JS_SCHEMA) || (createJsHandler = JsHandlerFactory.createJsHandler(this.webJsHost, str)) == null) {
                return;
            }
            if (createJsHandler instanceof BaseJsHandler) {
                ((BaseJsHandler) createJsHandler).timeRecordT2 = currentTimeMillis;
            }
            createJsHandler.setJsHandlerVerifyStrategy(this.jsHandlerVerifyStrategy);
            createJsHandler.doExec();
            this.webJsHost.putJsHandler(createJsHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
