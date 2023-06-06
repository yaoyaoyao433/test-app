package com.sankuai.titans.adapter.base.observers.jsinject;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.MD5;
import com.sankuai.titans.adapter.base.observers.SankuaiUrlUtil;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.config.Inject;
import com.sankuai.titans.config.InjectPath;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "TitansJsInjectPlugin", version = "20.14.1")
/* loaded from: classes4.dex */
public class JsInjectPlugin implements ITitansPlugin {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Config config;

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IContainerLifeCycle getContainerLifeCycle() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public View getDebugItem(Activity activity) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public void onTitansReady(ITitansContext iTitansContext) {
    }

    public JsInjectPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b0d48ba101a5d1e3556c3882d7e9aee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b0d48ba101a5d1e3556c3882d7e9aee");
        } else {
            this.config = ConfigManager.getConfig();
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9720eb3d7152750b6a48e4f5e035f9ba", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9720eb3d7152750b6a48e4f5e035f9ba") : new JsInjectWebPageLifeCycle();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class JsInjectWebPageLifeCycle extends WebPageLifeCycleAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        public JsInjectWebPageLifeCycle() {
            Object[] objArr = {JsInjectPlugin.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3824e5b33bc4838d3d1762554801d5f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3824e5b33bc4838d3d1762554801d5f9");
            }
        }

        @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
        public void onWebPageFinish(ITitansWebPageContext iTitansWebPageContext) {
            Object[] objArr = {iTitansWebPageContext};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b6dcaf0c1138547cea7710c82cc8adf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b6dcaf0c1138547cea7710c82cc8adf");
                return;
            }
            if (SankuaiUrlUtil.isUrlInAccessWhite(iTitansWebPageContext.getUrl(), JsInjectPlugin.this.config.access)) {
                StringBuffer stringBuffer = new StringBuffer();
                Map<String, String> jsEventParams = getJsEventParams(iTitansWebPageContext.getContainerContext().getActivity());
                for (String str : jsEventParams.keySet()) {
                    stringBuffer.append(String.format("event.%s = \"%s\";", str, jsEventParams.get(str)));
                }
                iTitansWebPageContext.getContainerContext().loadJs(String.format(SankuaiJS.JS_FUNCTION_DP, stringBuffer), null);
            } else {
                iTitansWebPageContext.getContainerContext().loadJs(SankuaiJS.JS_FUNCTION_DEFAULT, null);
            }
            iTitansWebPageContext.getContainerContext().loadJs(String.format("javascript:window.getWebViewState = function() {return %s}", getWebViewEnv(iTitansWebPageContext)), null);
            try {
                injectJs(iTitansWebPageContext.getContainerContext(), iTitansWebPageContext.getUrl());
            } catch (Exception unused) {
            }
        }

        private JSONObject getWebViewEnv(ITitansWebPageContext iTitansWebPageContext) {
            String webViewKernel;
            Object[] objArr = {iTitansWebPageContext};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254810da0c079280072fae8bc3858367", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254810da0c079280072fae8bc3858367");
            }
            JSONObject jSONObject = new JSONObject();
            ITitansContainerContext containerContext = iTitansWebPageContext.getContainerContext();
            try {
                webViewKernel = containerContext.getWebViewKernel();
            } catch (Throwable th) {
                containerContext.getTitansContext().getServiceManager().getStatisticsService().reportClassError("JsInjectPlugin", "getWebViewEnv", th);
            }
            if (webViewKernel == null) {
                return jSONObject;
            }
            jSONObject.put(TitansConstants.WebKernel.TAG_KERNEL, webViewKernel);
            return jSONObject;
        }

        private void injectJs(ITitansContainerContext iTitansContainerContext, String str) {
            List<InjectPath> list;
            Object[] objArr = {iTitansContainerContext, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b80e51ad67ee8cf82b64d7d9f43217d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b80e51ad67ee8cf82b64d7d9f43217d");
                return;
            }
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical() || TextUtils.isEmpty(parse.getQueryParameter("patch"))) {
                Inject inject = JsInjectPlugin.this.config.inject;
                if (inject == null || (list = inject.patches) == null || list.size() == 0) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    InjectPath injectPath = list.get(i);
                    String str2 = injectPath.page;
                    List<String> list2 = injectPath.more;
                    if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                        if (list2 == null || list2.size() == 0) {
                            String messageDigest = MD5.getMessageDigest(UrlUtils.clearQueryAndFragment(parse).getBytes());
                            if (!TextUtils.isEmpty(messageDigest)) {
                                iTitansContainerContext.loadJs(String.format(SankuaiJS.JS_INJECT, messageDigest), null);
                            }
                        } else {
                            for (String str3 : list2) {
                                if (!TextUtils.isEmpty(str3)) {
                                    iTitansContainerContext.loadJs(String.format("javascript:(function(){\nvar script = document.createElement('script');\nscript.src = '%s';\ndocument.head.appendChild(script);\n})();", str3), null);
                                }
                            }
                        }
                    }
                }
                return;
            }
            String messageDigest2 = MD5.getMessageDigest(UrlUtils.clearQueryAndFragment(parse).getBytes());
            String queryParameter = parse.getQueryParameter("patch");
            if (!"default".equals(queryParameter)) {
                messageDigest2 = messageDigest2 + CommonConstant.Symbol.MINUS + queryParameter;
            }
            iTitansContainerContext.loadJs(String.format(SankuaiJS.JS_INJECT, messageDigest2), null);
        }

        private Map<String, String> getJsEventParams(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a74c8ff44006e90f94b946e60f2fc2d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a74c8ff44006e90f94b946e60f2fc2d");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("osVersion", Build.VERSION.RELEASE);
            hashMap.put("appName", AppUtils.getPackageName(context));
            hashMap.put("appVersion", AppUtils.getVersionName(context));
            return hashMap;
        }
    }
}
