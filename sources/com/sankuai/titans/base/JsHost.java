package com.sankuai.titans.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.base.jshost.MsgCenter;
import com.sankuai.titans.base.utils.ProcessUtils;
import com.sankuai.titans.protocol.bean.HostState;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.jsbridge.IKnbWebBridgeDelegate;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.IWebViewClient;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import com.sankuai.titans.protocol.webcompat.jshost.AbsMsgCenter;
import com.sankuai.titans.protocol.webcompat.jshost.ActivityResultListener;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgeManager;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
import com.sankuai.titans.protocol.webcompat.jshost.RequestPermissionsResultListener;
import com.tencent.mapsdk.internal.y;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsHost implements AbsJsHost {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Activity activity;
    private final Map<Integer, List<ActivityResultListener>> activityResultListenersMap;
    private final IActivityStatus activityStatus;
    private final IBridgeActions bridgeActions;
    private final IBridgeManager bridgeManager;
    private final IBridgePubSub bridgePubSub;
    private HostState hostState;
    private AbsMsgCenter msgCenter;
    private ITitansWebPageContext pageContext;
    private final Map<Integer, List<RequestPermissionsResultListener>> requestPermissionsResultListenersMap;
    private OpenPageResult result;
    private final ITitansContext titansContext;
    private final IUIManager uIManager;

    public JsHost(Activity activity, @NonNull ITitansContext iTitansContext, IUIManager iUIManager, IActivityStatus iActivityStatus, BaseJsBridgeActions baseJsBridgeActions) {
        Object[] objArr = {activity, iTitansContext, iUIManager, iActivityStatus, baseJsBridgeActions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c7860c32158e1ffa0a054787e1004d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c7860c32158e1ffa0a054787e1004d8");
            return;
        }
        this.requestPermissionsResultListenersMap = new HashMap();
        this.activityResultListenersMap = new HashMap();
        this.titansContext = iTitansContext;
        this.activity = activity;
        this.activityStatus = iActivityStatus;
        this.bridgeManager = baseJsBridgeActions;
        this.bridgePubSub = baseJsBridgeActions;
        this.bridgeActions = baseJsBridgeActions;
        this.uIManager = iUIManager;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    @NonNull
    public ITitansContext getTitansContext() {
        return this.titansContext;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public ITitansWebPageContext getPageContext() {
        return this.pageContext;
    }

    public void setPageContext(ITitansWebPageContext iTitansWebPageContext) {
        this.pageContext = iTitansWebPageContext;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10c3a962d1c0cff99c3cda76debf633c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10c3a962d1c0cff99c3cda76debf633c");
            return;
        }
        synchronized (this.activityResultListenersMap) {
            List<ActivityResultListener> list = this.activityResultListenersMap.get(Integer.valueOf(i));
            if (list != null) {
                for (ActivityResultListener activityResultListener : list) {
                    activityResultListener.onActivityResult(i, i2, intent);
                }
            }
        }
        this.bridgeActions.onActivityResult(i, i2, intent);
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void registerActivityResultListener(int i, ActivityResultListener activityResultListener) {
        Object[] objArr = {Integer.valueOf(i), activityResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c656ca202219a788d2e39fa22479ff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c656ca202219a788d2e39fa22479ff9");
            return;
        }
        synchronized (this.activityResultListenersMap) {
            List<ActivityResultListener> list = this.activityResultListenersMap.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.activityResultListenersMap.put(Integer.valueOf(i), list);
            }
            if (list.contains(activityResultListener)) {
                return;
            }
            list.add(activityResultListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void unregisterActivityResultListener(int i, ActivityResultListener activityResultListener) {
        Object[] objArr = {Integer.valueOf(i), activityResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66d9d4ac8e9bcd32cf91d370ef9f1517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66d9d4ac8e9bcd32cf91d370ef9f1517");
            return;
        }
        synchronized (this.activityResultListenersMap) {
            if (this.activityResultListenersMap.containsKey(Integer.valueOf(i))) {
                List<ActivityResultListener> list = this.activityResultListenersMap.get(Integer.valueOf(i));
                if (list == null) {
                    return;
                }
                list.remove(activityResultListener);
            }
        }
    }

    public void setActivityResult(OpenPageResult openPageResult) {
        this.result = openPageResult;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public JSONObject getActivityResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70b7d238593ba9f91b6e5fe92fedf5a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70b7d238593ba9f91b6e5fe92fedf5a6");
        }
        if (this.result == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constant.KEY_RESULT_CODE, this.result.resultCode);
            jSONObject.put("resultData", this.result.resultData);
        } catch (JSONException e) {
            Titans.serviceManager().getStatisticsService().reportClassError("JsHost", "getActivityResult", e);
        }
        return jSONObject;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac094255661e69eb6c3150c29063fd4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac094255661e69eb6c3150c29063fd4c");
            return;
        }
        synchronized (this.requestPermissionsResultListenersMap) {
            List<RequestPermissionsResultListener> list = this.requestPermissionsResultListenersMap.get(Integer.valueOf(i));
            if (list != null) {
                for (RequestPermissionsResultListener requestPermissionsResultListener : list) {
                    requestPermissionsResultListener.onRequestPermissionsResult(i, strArr, iArr);
                }
            }
        }
        this.bridgeActions.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void registerRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener) {
        Object[] objArr = {Integer.valueOf(i), requestPermissionsResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0257ba49717633e36df9d3c07b3fdfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0257ba49717633e36df9d3c07b3fdfc");
            return;
        }
        synchronized (this.requestPermissionsResultListenersMap) {
            List<RequestPermissionsResultListener> list = this.requestPermissionsResultListenersMap.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.requestPermissionsResultListenersMap.put(Integer.valueOf(i), list);
            }
            if (list.contains(requestPermissionsResultListener)) {
                return;
            }
            list.add(requestPermissionsResultListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void unregisterRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener) {
        Object[] objArr = {Integer.valueOf(i), requestPermissionsResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb562478627130954c8e3f62c64706f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb562478627130954c8e3f62c64706f7");
            return;
        }
        synchronized (this.requestPermissionsResultListenersMap) {
            if (this.requestPermissionsResultListenersMap.containsKey(Integer.valueOf(i))) {
                List<RequestPermissionsResultListener> list = this.requestPermissionsResultListenersMap.get(Integer.valueOf(i));
                if (list == null) {
                    return;
                }
                list.remove(requestPermissionsResultListener);
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fba2b3eb9804ed9de8ffe365fb33e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fba2b3eb9804ed9de8ffe365fb33e27");
            return;
        }
        synchronized (this.requestPermissionsResultListenersMap) {
            this.requestPermissionsResultListenersMap.clear();
        }
        synchronized (this.activityResultListenersMap) {
            this.activityResultListenersMap.clear();
        }
        getTitansContext().getJsHostCenter().unSubscribeAll(this);
        IKnbWebBridgeDelegate iKnbWebBridgeDelegate = null;
        List a = b.a(IKnbWebBridgeDelegate.class, (String) null);
        if (a != null && a.size() > 0) {
            iKnbWebBridgeDelegate = (IKnbWebBridgeDelegate) a.get(0);
        }
        if (iKnbWebBridgeDelegate != null) {
            iKnbWebBridgeDelegate.removeDelegateJsHost(this);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public IUIManager getUiManager() {
        return this.uIManager;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    @NonNull
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3793272f0f1e74639ac860d6fa2c17d6", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3793272f0f1e74639ac860d6fa2c17d6") : this.titansContext.getApplicationContext();
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3106f033deceb7e484a4fa2b69a7b54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3106f033deceb7e484a4fa2b69a7b54d");
            return;
        }
        Context context = getContext();
        if (intent == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            intent.setFlags(y.a);
        }
        context.startActivity(intent);
        this.activityStatus.setHasStartActivity(true);
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba5f3ab49646ce443bd367c7a9a27bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba5f3ab49646ce443bd367c7a9a27bf0");
        } else if (this.activity == null || intent == null) {
        } else {
            this.activity.startActivityForResult(intent, i);
            this.activityStatus.setHasStartActivity(true);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    public HostState getHostState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8803690c702d04b098378d5560fcc62", RobustBitConfig.DEFAULT_VALUE)) {
            return (HostState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8803690c702d04b098378d5560fcc62");
        }
        if (this.hostState == null) {
            this.hostState = new HostState();
        }
        this.hostState.appear = this.activityStatus.isAppear();
        this.hostState.foreground = !ProcessUtils.isBackground(getContext());
        this.hostState.page_tti_done = false;
        IWebView webView = this.uIManager.getWebView();
        IWebViewClient webViewClient = webView == null ? null : webView.getWebViewClient();
        if (webViewClient != null) {
            this.hostState.page_start_load_time = webViewClient.obtainPageStartedTime();
        }
        return this.hostState;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    @NonNull
    public IBridgePubSub getBridgePubSub() {
        return this.bridgePubSub;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    @NonNull
    public IBridgeManager getBridgeManager() {
        return this.bridgeManager;
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost
    @NonNull
    public AbsMsgCenter getMsgCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dc18bfd28f426459118d895434b85c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsMsgCenter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dc18bfd28f426459118d895434b85c7");
        }
        if (this.msgCenter != null) {
            return this.msgCenter;
        }
        MsgCenter msgCenter = new MsgCenter();
        this.msgCenter = msgCenter;
        return msgCenter;
    }
}
