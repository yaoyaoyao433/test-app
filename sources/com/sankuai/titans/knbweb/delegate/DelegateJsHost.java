package com.sankuai.titans.knbweb.delegate;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.utils.Constants;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
import com.sankuai.waimai.launcher.util.image.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DelegateJsHost implements JsHost {
    private static final String JS_GET_PIC = "function jsGetPic(id){\n var str = 'getCapturePic://' + document.getElementById(id).toDataURL();\n return str;\n}";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AbsJsHost impl;
    private final Map<String, JsHandler> mJsHandlerMap;
    protected boolean mOnScroll;
    private final HashMap<String, JsHandler> mSubscribeJsHandlerMap;

    @Override // com.dianping.titans.js.JsHost
    @Deprecated
    public FrameLayout getLayVideo() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    @Deprecated
    public LinearLayout getLayWeb() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public ITitleBar getTitleBarHost() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public TitansUIManager getUIManager() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public int getWebTimeout() {
        return 0;
    }

    @Override // com.dianping.titans.js.JsHost
    public void hiddenWindow() {
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isInWhiteList(String str) {
        return false;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isShowTitlebarOnReceivedError() {
        return true;
    }

    @Override // com.dianping.titans.js.JsHost
    public void replaceTitleBar(BaseTitleBar baseTitleBar) {
    }

    @Override // com.dianping.titans.js.JsHost
    public String requestId() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public void resetJsHandler() {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setBackgroundColor(int i) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUIManager(TitansUIManager titansUIManager) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUrl(String str) {
    }

    @Override // com.dianping.titans.js.JsHost
    public void share() {
    }

    public DelegateJsHost(AbsJsHost absJsHost) {
        Object[] objArr = {absJsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b66dc0c5ff8235fbb1eb734b2854998", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b66dc0c5ff8235fbb1eb734b2854998");
            return;
        }
        this.mJsHandlerMap = new HashMap();
        this.mSubscribeJsHandlerMap = new HashMap<>();
        this.impl = absJsHost;
        JsHandlerFactory.addJsHost(this);
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e63f4b666d4eaf9d67e90337716d99a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e63f4b666d4eaf9d67e90337716d99a0");
        } else {
            this.impl.startActivity(intent);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ea925cf1fc37a68a9c1ff59f03b40af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ea925cf1fc37a68a9c1ff59f03b40af");
        } else {
            this.impl.startActivityForResult(intent, i);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fad1364c9c1e2039a3852d9678bcb118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fad1364c9c1e2039a3852d9678bcb118");
            return;
        }
        this.impl.getUiManager().onActivityFinish();
        JsHandlerFactory.removeJsHost(this);
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadJs(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52dcda611e8354c660a77aefad89cb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52dcda611e8354c660a77aefad89cb00");
        } else {
            this.impl.getUiManager().loadUrl(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void post(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8ae714b84e6ad55d6e0056827312051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8ae714b84e6ad55d6e0056827312051");
        } else {
            this.impl.getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(runnable);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d15e7c784723b84970bcefd556c2e8f", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d15e7c784723b84970bcefd556c2e8f") : this.impl.getContext();
    }

    @Override // com.dianping.titans.js.JsHost
    public JsHandler getJsHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51b440890bc95799ee8e542a40f0986e", RobustBitConfig.DEFAULT_VALUE) ? (JsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51b440890bc95799ee8e542a40f0986e") : this.mJsHandlerMap.get(str);
    }

    @Override // com.dianping.titans.js.JsHost
    public void putJsHandler(JsHandler jsHandler) {
        Object[] objArr = {jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee459c3e2165c2857359756f7178c92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee459c3e2165c2857359756f7178c92b");
        } else {
            this.mJsHandlerMap.put(jsHandler.jsBean().method, jsHandler);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void subscribe(String str, JsHandler jsHandler) {
        Object[] objArr = {str, jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb8ac8ab6d3fa4d5a2cd6f2eec0c4e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb8ac8ab6d3fa4d5a2cd6f2eec0c4e26");
        } else {
            this.mSubscribeJsHandlerMap.put(str, jsHandler);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void unsubscribe(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31c9a7bf43116606dce2dd4724cae61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31c9a7bf43116606dce2dd4724cae61d");
        } else {
            this.mSubscribeJsHandlerMap.remove(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a17c81f1c8b84c9ea2f4e9fe8a876a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a17c81f1c8b84c9ea2f4e9fe8a876a7");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e) {
            this.impl.getTitansContext().getServiceManager().getStatisticsService().reportClassError("DelegateJsHost", Constants.MULTI_PROCESS_PUBLISH_DATA, e);
        }
        publish(jSONObject);
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde4b49af4a0576c8dd0a8e615784556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde4b49af4a0576c8dd0a8e615784556");
            return;
        }
        try {
            jSONObject.put("status", "action");
        } catch (JSONException e) {
            this.impl.getTitansContext().getServiceManager().getStatisticsService().reportClassError("DelegateJsHost", Constants.MULTI_PROCESS_PUBLISH_DATA, e);
        }
        JsHandler subscribeJsHandler = getSubscribeJsHandler(jSONObject.optString("action"));
        if (subscribeJsHandler != null) {
            subscribeJsHandler.jsCallback(jSONObject);
        }
    }

    public JsHandler getSubscribeJsHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad38e7207fded63074e3497bc93bc85b", RobustBitConfig.DEFAULT_VALUE) ? (JsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad38e7207fded63074e3497bc93bc85b") : this.mSubscribeJsHandlerMap.get(str);
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f76f77560437052f07dc562b3fc126d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f76f77560437052f07dc562b3fc126d");
        } else {
            this.impl.getUiManager().loadUrl(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fadba7d95bf6fe4bb6f512680cb6fe95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fadba7d95bf6fe4bb6f512680cb6fe95");
        } else {
            this.impl.getUiManager().loadUrl(str, map);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map, boolean z) {
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e54fe68ec6f9586b9a1b792bf92f3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e54fe68ec6f9586b9a1b792bf92f3fc");
        } else {
            this.impl.getUiManager().loadUrl(str, map);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isOnScroll() {
        return this.mOnScroll;
    }

    @Override // com.dianping.titans.js.JsHost
    public void setOnScroll(boolean z) {
        this.mOnScroll = z;
    }

    @Override // com.dianping.titans.js.JsHost
    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7f9215566b5b3b041dd4e892f321141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7f9215566b5b3b041dd4e892f321141");
        } else {
            this.impl.getTitansContext().getServiceManager().getThreadPoolService().executeOnThreadPool("performBackPress", new Runnable() { // from class: com.sankuai.titans.knbweb.delegate.DelegateJsHost.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a4453ccb939bcb0f9d7968c15876d105", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a4453ccb939bcb0f9d7968c15876d105");
                        return;
                    }
                    try {
                        new Instrumentation().sendKeyDownUpSync(4);
                    } catch (Throwable th) {
                        DelegateJsHost.this.impl.getTitansContext().getServiceManager().getStatisticsService().reportClassError("DelegateJsHost", "goBack", th);
                    }
                }
            });
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "140c343233cf6c6479f3d51855432964", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "140c343233cf6c6479f3d51855432964") : this.impl.getActivity();
    }

    @Override // com.dianping.titans.js.JsHost
    public String getVersionName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "012253f701b239dd5ce2a43ba41c4683", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "012253f701b239dd5ce2a43ba41c4683") : AppUtils.getVersionName(this.impl.getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public String getPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a2b189e034a54c3059038794358d42", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a2b189e034a54c3059038794358d42");
        }
        Context context = this.impl.getContext();
        return context != null ? context.getPackageName() : "";
    }

    @Override // com.dianping.titans.js.JsHost
    public String getTitleText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e2368c0cd4140c286fbea2b68b62f56", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e2368c0cd4140c286fbea2b68b62f56") : this.impl.getUiManager().getTitle();
    }

    @Override // com.dianping.titans.js.JsHost
    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39a84d6f4bf581e0d1ac3fda2e3bb2ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39a84d6f4bf581e0d1ac3fda2e3bb2ed") : this.impl.getPageContext().getOriginalUrl();
    }

    @Override // com.dianping.titans.js.JsHost
    public TextView getTvUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ae2f42a250b67cde5dd9e963d127d6", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ae2f42a250b67cde5dd9e963d127d6") : this.impl.getUiManager().getDebugBar();
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isActivated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3e3669ccc06d298027aac0f54a955c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3e3669ccc06d298027aac0f54a955c8")).booleanValue() : AppUtils.isActivityAlive(this.impl.getActivity());
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isBtnCloseShow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "938797cf5c061f9a262fc04f87d96a3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "938797cf5c061f9a262fc04f87d96a3a")).booleanValue();
        }
        IUIManager uiManager = this.impl.getUiManager();
        if (uiManager == null || uiManager.getTitleBar() == null) {
            return false;
        }
        return uiManager.getTitleBar().isTitleBarBtnCloseShow();
    }

    @Override // com.dianping.titans.js.JsHost
    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26cbd3fed7bc5c36793a9bd29fde9bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26cbd3fed7bc5c36793a9bd29fde9bb6");
        } else {
            this.impl.getUiManager().setTitle(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void showMask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4373b4c508e765d1eae8c2e504d63f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4373b4c508e765d1eae8c2e504d63f9b");
        } else {
            this.impl.getUiManager().showErrorView(0, null, null);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d2fc66d5af65749e1e694639c8908b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d2fc66d5af65749e1e694639c8908b1")).booleanValue() : this.impl.getTitansContext().getAppInfo().isDebugMode();
    }

    @Override // com.dianping.titans.js.JsHost
    public void getCapture(final String str, final CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Object[] objArr = {str, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43fd74d3e8af9ad7f10e8fe448b362e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43fd74d3e8af9ad7f10e8fe448b362e6");
        } else if (this.impl.getUiManager().getWebView() == null) {
            if (bitmapCallbackListener != null) {
                bitmapCallbackListener.onGetBitmap(null, null);
            }
        } else {
            final WeakReference weakReference = new WeakReference(bitmapCallbackListener);
            try {
                IThreadPoolService threadPoolService = this.impl.getTitansContext().getServiceManager().getThreadPoolService();
                if (TextUtils.equals(CaptureJsHandler.CAPTURE_TYPE_DEFAULT, str)) {
                    bitmapCallbackListener.onGetBitmap(getCaptureScreen(), Bitmap.CompressFormat.JPEG);
                } else if (TextUtils.equals("webview", str)) {
                    threadPoolService.executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.knbweb.delegate.DelegateJsHost.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d69642481cbe259b6f2dcd78a5c097c1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d69642481cbe259b6f2dcd78a5c097c1");
                                return;
                            }
                            try {
                                bitmapCallbackListener.onGetBitmap(DelegateJsHost.this.impl.getUiManager().getCaptureWebView(), Bitmap.CompressFormat.JPEG);
                            } catch (OutOfMemoryError e) {
                                bitmapCallbackListener.onOOM();
                                DelegateJsHost.this.impl.getTitansContext().getServiceManager().getStatisticsService().reportClassError("DelegateJsHost", "getCapture", e);
                            }
                        }
                    });
                } else if (TextUtils.isEmpty(str) || !str.startsWith("#")) {
                } else {
                    threadPoolService.executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.knbweb.delegate.DelegateJsHost.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6162f1d855064772a63d69fdc2a8c818", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6162f1d855064772a63d69fdc2a8c818");
                                return;
                            }
                            DelegateJsHost.this.impl.getUiManager().loadJs("javascript:function jsGetPic(id){\n var str = 'getCapturePic://' + document.getElementById(id).toDataURL();\n return str;\n}", null);
                            IUIManager uiManager = DelegateJsHost.this.impl.getUiManager();
                            uiManager.loadJs("javascript:jsGetPic(\"" + str.substring(1) + "\")", new ValueCallback<String>() { // from class: com.sankuai.titans.knbweb.delegate.DelegateJsHost.3.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // android.webkit.ValueCallback
                                public void onReceiveValue(String str2) {
                                    String substring;
                                    Object[] objArr3 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b0afdc38ffd0ae442212394ba0f5f41b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b0afdc38ffd0ae442212394ba0f5f41b");
                                        return;
                                    }
                                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                                    int indexOf = str2.indexOf("base64,");
                                    if (indexOf < 0) {
                                        substring = str2;
                                    } else {
                                        substring = str2.substring(indexOf + 7);
                                        if (str2.substring(0, indexOf).contains("image/jpeg")) {
                                            compressFormat = Bitmap.CompressFormat.JPEG;
                                        } else if (str2.substring(0, indexOf).contains("image/webp")) {
                                            compressFormat = Bitmap.CompressFormat.WEBP;
                                        }
                                    }
                                    if (weakReference.get() != null) {
                                        try {
                                            byte[] decode = Base64.decode(substring, 0);
                                            ((CaptureJsHandler.BitmapCallbackListener) weakReference.get()).onGetBitmap(a.a(decode, 0, decode.length), compressFormat);
                                        } catch (OutOfMemoryError unused) {
                                            ((CaptureJsHandler.BitmapCallbackListener) weakReference.get()).onOOM();
                                        }
                                        weakReference.clear();
                                    }
                                }
                            });
                        }
                    });
                    threadPoolService.executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.knbweb.delegate.DelegateJsHost.4
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db57e950c6826e6e38b2efb2a1446fab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db57e950c6826e6e38b2efb2a1446fab");
                                return;
                            }
                            if (weakReference.get() != null) {
                                ((CaptureJsHandler.BitmapCallbackListener) weakReference.get()).onTimeOut();
                            }
                            weakReference.clear();
                        }
                    }, 10000L);
                }
            } catch (OutOfMemoryError e) {
                bitmapCallbackListener.onOOM();
                this.impl.getTitansContext().getServiceManager().getStatisticsService().reportClassError("DelegateJsHost", "getCapture", e);
            }
        }
    }

    private Bitmap getCaptureScreen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e2287835fbf2f489324bc137214b59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e2287835fbf2f489324bc137214b59");
        }
        Activity activity = this.impl.getActivity();
        if (activity == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        }
        View decorView = activity.getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        decorView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.dianping.titans.js.JsHost
    public WebView getWebView() {
        ViewGroup viewGroup;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "811382665ad3bffb6d1a7e18d881460b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "811382665ad3bffb6d1a7e18d881460b");
        }
        IWebView webView = this.impl.getUiManager().getWebView();
        if (webView == null || (viewGroup = webView.get()) == null || !(viewGroup instanceof WebView)) {
            return null;
        }
        return (WebView) viewGroup;
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84847f2ecc86d582d0fb0b8b56161764", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84847f2ecc86d582d0fb0b8b56161764") : this.impl.getActivityResult();
    }

    @Override // com.dianping.titans.js.JsHost
    public void onWebViewTitleReceived(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "477860fa6999e9da3eac9a8e9a3d2d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "477860fa6999e9da3eac9a8e9a3d2d38");
        } else {
            this.impl.getUiManager().setTitle(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getWebViewEnv() {
        String webViewKernel;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2614aa4627970af12edc610079cf8f02", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2614aa4627970af12edc610079cf8f02");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            webViewKernel = this.impl.getUiManager().getWebViewKernel();
        } catch (Throwable th) {
            this.impl.getTitansContext().getServiceManager().getStatisticsService().reportClassError("DelegateJsHost", "getWebViewEnv", th);
        }
        if (webViewKernel == null) {
            return jSONObject;
        }
        jSONObject.put(TitansConstants.WebKernel.TAG_KERNEL, webViewKernel);
        return jSONObject;
    }
}
