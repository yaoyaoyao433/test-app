package com.sankuai.titans.base;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.JsHandlerCenter;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.ErrorJsHandler;
import com.sankuai.titans.protocol.jsbridge.IJsBridgeManager;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeErrorInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeInfo;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AbsJsHost jsHost;
    private final IJsBridgeManager mJsBridgeManager;

    public KNBInterface(AbsJsHost absJsHost, IJsBridgeManager iJsBridgeManager) {
        Object[] objArr = {absJsHost, iJsBridgeManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ee4ec7e3ea303608af2fbe884a4bf3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ee4ec7e3ea303608af2fbe884a4bf3b");
            return;
        }
        this.jsHost = absJsHost;
        this.mJsBridgeManager = iJsBridgeManager;
    }

    @JavascriptInterface
    public void sendMessage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0b8725b41243202db00208bbe0afd64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0b8725b41243202db00208bbe0afd64");
        } else {
            createJsHandler(this.jsHost, this.mJsBridgeManager, str);
        }
    }

    public static void createJsHandler(final AbsJsHost absJsHost, IJsBridgeManager iJsBridgeManager, String str) {
        Object[] objArr = {absJsHost, iJsBridgeManager, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2a960ea90a41ae4f61d8a2b0551c6c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2a960ea90a41ae4f61d8a2b0551c6c1");
        } else if (str.startsWith(TitansConstants.JS_SCHEMA)) {
            IStatisticsService statisticsService = Titans.serviceManager().getStatisticsService();
            final long currentTimeMillis = System.currentTimeMillis();
            JsHandlerCenter.JsMessageInfo parseJsMessage = JsHandlerCenter.parseJsMessage(absJsHost, str);
            if (parseJsMessage == null) {
                return;
            }
            final String method = parseJsMessage.getMethod();
            final String callbackId = parseJsMessage.getCallbackId();
            final String args = parseJsMessage.getArgs();
            String url = (absJsHost == null || absJsHost.getPageContext() == null) ? "" : absJsHost.getPageContext().getUrl();
            String originalUrl = (absJsHost == null || absJsHost.getPageContext() == null) ? "" : absJsHost.getPageContext().getOriginalUrl();
            b.a aVar = new b.a();
            aVar.b = b.EnumC0496b.TITANS;
            aVar.c = "titans";
            aVar.d = method;
            b.a(aVar.a(true));
            if (TextUtils.isEmpty(originalUrl) && TextUtils.isEmpty(url)) {
                ErrorJsHandler errorJsHandler = new ErrorJsHandler(JsHandlerResultInfo.Error_UNKNOWN_EmptyUrl);
                errorJsHandler.init(method, callbackId, absJsHost, args, TitansConstants.BridgeConstants.SOURCE_TITANS);
                errorJsHandler.doExec();
                return;
            }
            if (TextUtils.isEmpty(url)) {
                HashMap hashMap = new HashMap();
                hashMap.put("case", "targetURL为空");
                hashMap.put("method", method);
                hashMap.put("targetURL", url);
                hashMap.put("originalURL", originalUrl);
                hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
                statisticsService.reportGeneralInfo(hashMap);
            }
            statisticsService.reportBridgeInfo(new BridgeInfo(method, TitansConstants.BridgeConstants.SOURCE_TITANS, originalUrl, url));
            try {
                iJsBridgeManager.init(absJsHost.getTitansContext().getAppInfo(), absJsHost.getTitansContext().getApplicationContext(), originalUrl);
                iJsBridgeManager.verify(method, !TextUtils.isEmpty(url) ? url : originalUrl, absJsHost.getTitansContext().getAppInfo().isDebugMode(), new IJsBridgeManager.VerifyCallback() { // from class: com.sankuai.titans.base.KNBInterface.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.protocol.jsbridge.IJsBridgeManager.VerifyCallback
                    public final void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "667ff753485a02e8e9e9c788f9acb228", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "667ff753485a02e8e9e9c788f9acb228");
                            return;
                        }
                        AbsJsHandler createJsHandler = JsHandlerCenter.createJsHandler(AbsJsHost.this, method, callbackId, args, TitansConstants.BridgeConstants.SOURCE_TITANS);
                        if (createJsHandler == null) {
                            return;
                        }
                        createJsHandler.timeRecordT2 = currentTimeMillis;
                        createJsHandler.doExec();
                        AbsJsHost.this.getBridgeManager().putJsHandler(createJsHandler);
                    }

                    @Override // com.sankuai.titans.protocol.jsbridge.IJsBridgeManager.VerifyCallback
                    public final void onFail(JsHandlerResultInfo jsHandlerResultInfo) {
                        Object[] objArr2 = {jsHandlerResultInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5cf2d876240608acf654e53a9f852b5b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5cf2d876240608acf654e53a9f852b5b");
                            return;
                        }
                        ErrorJsHandler errorJsHandler2 = new ErrorJsHandler(jsHandlerResultInfo);
                        errorJsHandler2.init(method, callbackId, AbsJsHost.this, args, TitansConstants.BridgeConstants.SOURCE_TITANS);
                        errorJsHandler2.doExec();
                    }
                });
            } catch (Throwable th) {
                statisticsService.reportBridgeErrorInfo(new BridgeErrorInfo(method, args, TitansConstants.BridgeConstants.SOURCE_TITANS, originalUrl, url, "", "ReferURL: " + absJsHost.getPageContext().getReferrer() + ", errorLog: " + Log.getStackTraceString(th)));
            }
        }
    }
}
