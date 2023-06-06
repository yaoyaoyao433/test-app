package com.dianping.titans.js;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.JsHandlerReportImpl;
import com.dianping.titans.js.jshandler.JsHandlerReportStrategy;
import com.dianping.titans.js.jshandler.JsHandlerVerifyStrategy;
import com.dianping.titans.utils.EventReporter;
import com.dianping.titansadapter.IJSBPerformer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.ijk.media.player.IMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BridgeManager {
    public static final int FOR_COMMON = 1;
    public static final int FOR_KNB = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static JsHandlerReportStrategy jsReportStrategy = new JsHandlerReportImpl(Collections.EMPTY_LIST);
    private static JsHandlerVerifyStrategy jsVerifyStrategy;
    private static IJSBPerformer jsbPerformer;
    private JsCallback jsCallback;
    protected final List<JsHandler> jsHandlers;
    private JsHost jsHost;

    public static void init(IJSBPerformer iJSBPerformer) {
        jsbPerformer = iJSBPerformer;
    }

    public static void initVerifyStrategy(JsHandlerVerifyStrategy jsHandlerVerifyStrategy) {
        jsVerifyStrategy = jsHandlerVerifyStrategy;
    }

    public static void initReportStrategy(JsHandlerReportStrategy jsHandlerReportStrategy) {
        jsReportStrategy = jsHandlerReportStrategy;
    }

    public static IJSBPerformer getJSBPerformer() {
        return jsbPerformer;
    }

    public BridgeManager(CommonJsHost commonJsHost, JsCallback jsCallback) {
        Object[] objArr = {commonJsHost, jsCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "980748655b506e34b7674bcbf3bda1d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "980748655b506e34b7674bcbf3bda1d5");
            return;
        }
        this.jsHandlers = new ArrayList();
        this.jsCallback = jsCallback;
        if (commonJsHost == null || commonJsHost.getActivity() == null) {
            return;
        }
        this.jsHost = commonJsHost;
        JsHandlerFactory.addJsHost(commonJsHost);
    }

    public BridgeManager(Activity activity, JsCallback jsCallback) {
        Object[] objArr = {activity, jsCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e43fadffe78ab2178110d1dbdefe6bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e43fadffe78ab2178110d1dbdefe6bf");
            return;
        }
        this.jsHandlers = new ArrayList();
        this.jsCallback = jsCallback;
        if (activity != null) {
            this.jsHost = new CommonJsHost(activity) { // from class: com.dianping.titans.js.BridgeManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.js.CommonJsHost, com.dianping.titans.js.JsHost
                public void getCapture(String str, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
                }
            };
            JsHandlerFactory.addJsHost(this.jsHost);
        }
    }

    public void destory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b14127b58157ee67426433b57ec82cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b14127b58157ee67426433b57ec82cae");
            return;
        }
        JsHandlerFactory.removeJsHost(this.jsHost);
        this.jsHost = null;
        this.jsCallback = null;
        for (JsHandler jsHandler : this.jsHandlers) {
            jsHandler.setJsCallback(null);
            jsHandler.onDestroy();
        }
        this.jsHandlers.clear();
    }

    public void invoke(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99af6ec1d93d164ba3d58efdf4dd7624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99af6ec1d93d164ba3d58efdf4dd7624");
        } else if (this.jsHost == null || TextUtils.isEmpty(str) || !str.startsWith(TitansConstants.JS_SCHEMA)) {
        } else {
            invokeJsHandler(JsHandlerFactory.createJsHandler(this.jsHost, str));
        }
    }

    public void invoke(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d88a9e26a355cb8c3414c423d08b20c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d88a9e26a355cb8c3414c423d08b20c");
        } else {
            invoke(str, str2, str3, JsHandler.Source.THRID);
        }
    }

    public void invoke(String str, String str2, String str3, JsHandler.Source source) {
        Object[] objArr = {str, str2, str3, source};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc7a029b77f3ed9d877cc4f0ddf6ef7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc7a029b77f3ed9d877cc4f0ddf6ef7a");
        } else if (this.jsHost != null) {
            invokeJsHandler(JsHandlerFactory.createJsHandler(this.jsHost, str, str2, str3, source));
        }
    }

    private void invokeJsHandler(JsHandler jsHandler) {
        Object[] objArr = {jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05001e23c22a904c68adf3850175cccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05001e23c22a904c68adf3850175cccd");
        } else if (jsHandler != null) {
            if (1 == jsHandler.jsHandlerType()) {
                if (jsVerifyStrategy != null) {
                    jsHandler.setJsHandlerVerifyStrategy(jsVerifyStrategy);
                }
                if (jsReportStrategy != null) {
                    jsHandler.setJsHandlerReportStrategy(jsReportStrategy);
                }
                jsHandler.setJsCallback(this.jsCallback);
                this.jsHandlers.add(jsHandler);
                try {
                    jsHandler.doExec();
                    return;
                } catch (Throwable th) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "fail");
                        jSONObject.put("errorCode", -304);
                        jSONObject.put("errMsg", "exe exception message: " + th.getMessage());
                    } catch (JSONException unused) {
                    }
                    if (this.jsCallback != null) {
                        this.jsCallback.jsCallback(jSONObject);
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", "fail");
                jSONObject2.put("errorCode", IMediaPlayer.MEDIA_ERROR_TIMED_OUT);
                jSONObject2.put("errMsg", "not for common");
                jSONObject2.put("errBridge", jsHandler.getClass().getSimpleName());
                EventReporter.reportException("BridgeManager_invokeJsHandler", jsHandler.getClass().getSimpleName(), new Exception("jsHandler not for common"));
            } catch (JSONException unused2) {
            }
            if (this.jsCallback != null) {
                this.jsCallback.jsCallback(jSONObject2);
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fea1293b9c98dfd0c0c5fc5b8bf327e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fea1293b9c98dfd0c0c5fc5b8bf327e");
            return;
        }
        for (JsHandler jsHandler : this.jsHandlers) {
            jsHandler.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbca2f52a61b9c9727c6ae885855bb5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbca2f52a61b9c9727c6ae885855bb5f");
            return;
        }
        for (JsHandler jsHandler : this.jsHandlers) {
            jsHandler.onActivityResult(i, i2, intent);
        }
    }
}
