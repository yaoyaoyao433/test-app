package com.sankuai.meituan.android.knb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.JsHandlerReportImpl;
import com.dianping.titans.js.jshandler.JsHandlerReportStrategy;
import com.dianping.titans.js.jshandler.JsHandlerVerifyImpl;
import com.dianping.titans.js.jshandler.JsHandlerVerifyStrategy;
import com.dianping.titans.utils.Constants;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JsHandlerReportStrategy jsHandlerReportStrategy;
    private JsHandlerVerifyStrategy jsHandlerVerifyStrategy;
    private KNBWebCompatDelegate knbWebCompatDelegate;

    public KNBInterface(KNBWebCompatDelegate kNBWebCompatDelegate) {
        Object[] objArr = {kNBWebCompatDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b8e2c9c91f2881661842f99cf96fa89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b8e2c9c91f2881661842f99cf96fa89");
            return;
        }
        this.knbWebCompatDelegate = kNBWebCompatDelegate;
        this.jsHandlerReportStrategy = new JsHandlerReportImpl(KNBConfig.getStringListConfig(KNBConfig.CONFIG_REPORT_QUERY, Collections.EMPTY_LIST));
        this.jsHandlerVerifyStrategy = new JsHandlerVerifyImpl(KNBConfig.getStringListConfig(KNBConfig.CONFIG_BRIDGE_GREEN, Collections.emptyList()), KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST), KNBWebManager.getEnvironment().getKNBAppId(), KNBWebManager.showDebugUrl());
    }

    @JavascriptInterface
    public void sendMessage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd50a23b878f65e1ff6293eee02c798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd50a23b878f65e1ff6293eee02c798");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (str.startsWith(TitansConstants.JS_SCHEMA)) {
                if (this.jsHandlerReportStrategy != null) {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.isHierarchical() ? parse.getQueryParameter("method") : "";
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.jsHandlerReportStrategy.reportBridgeArrival(queryParameter, JsHandler.Source.TITANS, this.knbWebCompatDelegate.getUrl());
                        b.a aVar = new b.a();
                        aVar.b = b.EnumC0496b.TITANS;
                        aVar.c = "titans";
                        aVar.d = queryParameter;
                        b.a(aVar.a(false));
                    }
                }
                JsHandler createJsHandler = JsHandlerFactory.createJsHandler(this.knbWebCompatDelegate, str);
                if (createJsHandler != null) {
                    if (createJsHandler instanceof BaseJsHandler) {
                        ((BaseJsHandler) createJsHandler).timeRecordT2 = currentTimeMillis;
                    }
                    createJsHandler.setJsHandlerVerifyStrategy(this.jsHandlerVerifyStrategy);
                    createJsHandler.setJsHandlerReportStrategy(this.jsHandlerReportStrategy);
                    createJsHandler.doExec();
                    this.knbWebCompatDelegate.putJsHandler(createJsHandler);
                }
            }
        } catch (Throwable th) {
            if (KNBWebManager.isDebug()) {
                Log.e(Constants.TAG_PREFIX, null, th);
            }
        }
    }
}
