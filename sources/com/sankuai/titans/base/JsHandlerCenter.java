package com.sankuai.titans.base;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.ErrorJsHandler;
import com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeErrorInfo;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsHandlerCenter {
    public static final String TAG = "JsHandlerCenter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashSet<AbsJsHost> sJsHosts = new HashSet<>();

    public static AbsJsHandler createJsHandler(AbsJsHost absJsHost, String str) {
        Object[] objArr = {absJsHost, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "776845c2de6d0048d5e49aa274b85ca8", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsJsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "776845c2de6d0048d5e49aa274b85ca8");
        }
        JsMessageInfo parseJsMessage = parseJsMessage(absJsHost, str);
        if (parseJsMessage == null) {
            return null;
        }
        return createJsHandler(absJsHost, parseJsMessage.getMethod(), parseJsMessage.getCallbackId(), parseJsMessage.getArgs(), TitansConstants.BridgeConstants.SOURCE_TITANS);
    }

    public static AbsJsHandler createJsHandler(AbsJsHost absJsHost, String str, String str2, String str3) {
        Object[] objArr = {absJsHost, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01b9d8e15dd6d5aee9786ff1e3f99ca9", RobustBitConfig.DEFAULT_VALUE) ? (AbsJsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01b9d8e15dd6d5aee9786ff1e3f99ca9") : createJsHandler(absJsHost, str, str2, str3, TitansConstants.BridgeConstants.SOURCE_THIRD);
    }

    public static JsMessageInfo parseJsMessage(AbsJsHost absJsHost, String str) {
        Throwable th;
        String str2;
        String str3;
        String str4;
        String str5;
        Object[] objArr = {absJsHost, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cadc6e33c5a9d562b82a04e91a5201f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsMessageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cadc6e33c5a9d562b82a04e91a5201f9");
        }
        Uri parse = Uri.parse(str);
        try {
            str3 = parse.getQueryParameter("method");
            try {
                String queryParameter = parse.getQueryParameter("callbackId");
                try {
                    str5 = parse.getQueryParameter("args");
                    str4 = str3;
                    str2 = queryParameter;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = queryParameter;
                    str4 = str3;
                    reportBridgeErrorInfo(Titans.serviceManager().getStatisticsService(), absJsHost, str4, null, null, "JsHandlerCenter@parseJsMessage", th);
                    str5 = null;
                    if (!TextUtils.isEmpty(str4)) {
                    }
                    reportBridgeErrorInfo(Titans.serviceManager().getStatisticsService(), absJsHost, str4, str5, null, "JsHandlerCenter@parseJsMessage: method is empty || callbackId is empty || args is null", null);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            str2 = null;
            str3 = null;
        }
        if (!TextUtils.isEmpty(str4) || TextUtils.isEmpty(str2) || str5 == null) {
            reportBridgeErrorInfo(Titans.serviceManager().getStatisticsService(), absJsHost, str4, str5, null, "JsHandlerCenter@parseJsMessage: method is empty || callbackId is empty || args is null", null);
            return null;
        }
        return new JsMessageInfo(str4, str2, str5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class JsMessageInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String args;
        private String callbackId;
        private String method;

        public JsMessageInfo(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "677e5d8dcede1df6a1c47ceea1b39d72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "677e5d8dcede1df6a1c47ceea1b39d72");
                return;
            }
            this.method = str;
            this.callbackId = str2;
            this.args = str3;
        }

        public String getMethod() {
            return this.method;
        }

        public String getCallbackId() {
            return this.callbackId;
        }

        public String getArgs() {
            return this.args;
        }
    }

    private static void reportBridgeErrorInfo(IStatisticsService iStatisticsService, AbsJsHost absJsHost, String str, String str2, String str3, String str4, Throwable th) {
        String str5;
        Object[] objArr = {iStatisticsService, absJsHost, str, str2, str3, str4, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ff15c4d5189e3b5ff803456e2d92aee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ff15c4d5189e3b5ff803456e2d92aee");
            return;
        }
        String originalUrl = (absJsHost == null || absJsHost.getPageContext() == null) ? "" : absJsHost.getPageContext().getOriginalUrl();
        String url = (absJsHost == null || absJsHost.getPageContext() == null) ? "" : absJsHost.getPageContext().getUrl();
        if (th != null) {
            str5 = str4 + "ReferURL: " + absJsHost.getPageContext().getReferrer() + ", errorLog: " + Log.getStackTraceString(th);
        } else {
            str5 = str4;
        }
        iStatisticsService.reportBridgeErrorInfo(new BridgeErrorInfo(str, str2, TitansConstants.BridgeConstants.SOURCE_TITANS, originalUrl, url, str3, str5));
    }

    public static AbsJsHandler createJsHandler(AbsJsHost absJsHost, String str, String str2, String str3, String str4) {
        String str5;
        AbsJsHandler absJsHandler;
        IKnbWebBridgeDelegate iKnbWebBridgeDelegate;
        Object[] objArr = {absJsHost, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a0edfecb150fd4193296459b65ad535", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsJsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a0edfecb150fd4193296459b65ad535");
        }
        try {
            absJsHandler = loadFromServiceLoader(str);
            str5 = null;
        } catch (Throwable th) {
            str5 = null;
            reportBridgeErrorInfo(Titans.serviceManager().getStatisticsService(), absJsHost, str, str3, null, "JsHandlerCenter@loadFromServiceLoader", th);
            absJsHandler = null;
        }
        if (absJsHandler == null && (iKnbWebBridgeDelegate = (IKnbWebBridgeDelegate) b.a(IKnbWebBridgeDelegate.class, str5).get(0)) != null) {
            absJsHandler = iKnbWebBridgeDelegate.createJsHandler(absJsHost, str, str2, str3, str4);
        }
        if (absJsHandler == null) {
            absJsHandler = new ErrorJsHandler(JsHandlerResultInfo.Error_4_NoBridge);
        }
        absJsHandler.init(str, str2, absJsHost, str3, str4);
        return absJsHandler;
    }

    private static AbsJsHandler loadFromServiceLoader(String str) throws Throwable {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "781eb79ad674af58dd94125ff7f7d2ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsJsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "781eb79ad674af58dd94125ff7f7d2ed");
        }
        List a = b.a(AbsJsHandler.class, str);
        if (a == null || a.isEmpty()) {
            return null;
        }
        return (AbsJsHandler) a.get(0);
    }
}
