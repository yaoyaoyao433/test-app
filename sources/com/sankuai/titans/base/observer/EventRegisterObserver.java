package com.sankuai.titans.base.observer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.base.observer.SensorHandler;
import com.sankuai.titans.base.utils.InjectJs;
import com.sankuai.titans.base.utils.JsCustomEvent;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.utils.NetworkUtils;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class EventRegisterObserver extends ContainerLifeCycleAdapter {
    private static final String ACTION_NET_CHANGED = "android.net.conn.CONNECTIVITY_CHANGE";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isPause;
    private BroadcastReceiver netChangedListener;
    private SensorHandler.IShakeListener shakeListener;
    private OnWebEventListener webEventListener;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class NetWorkChangedEventData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("networkType")
        @Expose
        public String networkType;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class WebViewResizedEventData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("from")
        @Expose
        public Size from;
        @SerializedName(RemoteMessageConst.TO)
        @Expose
        public Size to;
    }

    public EventRegisterObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbbd2a43d9e9800c58eec9fcd3af6a3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbbd2a43d9e9800c58eec9fcd3af6a3a");
        } else {
            this.isPause = false;
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerCreated(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adc6fc78be56c1f89f6dd7ff763a5026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adc6fc78be56c1f89f6dd7ff763a5026");
            return;
        }
        init(iTitansContainerContext);
        Context applicationContext = iTitansContainerContext.getTitansContext().getApplicationContext();
        iTitansContainerContext.registerWebEventListener(this.webEventListener);
        SensorHandler.getInstance(applicationContext).registerShakeListener(this.shakeListener);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_NET_CHANGED);
        iTitansContainerContext.getActivity().registerReceiver(this.netChangedListener, intentFilter);
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerDestroy(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2225a7e7330b59332e01e9cdc8629169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2225a7e7330b59332e01e9cdc8629169");
            return;
        }
        iTitansContainerContext.unregisterWebEventListener(this.webEventListener);
        SensorHandler.getInstance(iTitansContainerContext.getTitansContext().getApplicationContext()).unregisterShakeListener(this.shakeListener);
        try {
            iTitansContainerContext.getActivity().unregisterReceiver(this.netChangedListener);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerPause(ITitansContainerContext iTitansContainerContext) {
        this.isPause = true;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerResume(ITitansContainerContext iTitansContainerContext) {
        this.isPause = false;
    }

    private void init(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6d5fd00b61bb53a865b132d1f93574f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6d5fd00b61bb53a865b132d1f93574f");
        } else if (AppUtils.isActivityAlive(iTitansContainerContext.getActivity())) {
            final WeakReference weakReference = new WeakReference(iTitansContainerContext);
            this.netChangedListener = new BroadcastReceiver() { // from class: com.sankuai.titans.base.observer.EventRegisterObserver.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.BroadcastReceiver
                public void onReceive(final Context context, Intent intent) {
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "97309000bcb75fa4e7dc2094a444350d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "97309000bcb75fa4e7dc2094a444350d");
                    } else if (TextUtils.equals(intent.getAction(), EventRegisterObserver.ACTION_NET_CHANGED) && !isInitialStickyBroadcast()) {
                        Runnable runnable = new Runnable() { // from class: com.sankuai.titans.base.observer.EventRegisterObserver.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e8070e1014ac8fa8cf07ba20403d3b9f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e8070e1014ac8fa8cf07ba20403d3b9f");
                                    return;
                                }
                                try {
                                    NetWorkChangedEventData netWorkChangedEventData = new NetWorkChangedEventData();
                                    netWorkChangedEventData.networkType = NetworkUtils.getNetworkTypeString(context, "pt-e855f47ed9ccf2a5");
                                    ITitansContainerContext iTitansContainerContext2 = (ITitansContainerContext) weakReference.get();
                                    if (iTitansContainerContext2 != null) {
                                        iTitansContainerContext2.loadJs(InjectJs.makeCustomEvent(new JsCustomEvent("KNB:networkChanged", netWorkChangedEventData)), null);
                                    }
                                } catch (Exception e) {
                                    Titans.serviceManager().getStatisticsService().reportClassError("EventRegisterObserver", "init", e);
                                }
                            }
                        };
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, 200L);
                    }
                }
            };
            this.webEventListener = new OnWebEventListener() { // from class: com.sankuai.titans.base.observer.EventRegisterObserver.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.utils.OnWebEventListener
                public void onWebViewSizeChanged(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a1a524f323afd609a7fbbc0e67692f9a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a1a524f323afd609a7fbbc0e67692f9a");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("action", "resize");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", i3);
                        jSONObject2.put("height", i4);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("width", i);
                        jSONObject3.put("height", i2);
                        jSONObject.put("from", jSONObject2);
                        jSONObject.put(RemoteMessageConst.TO, jSONObject3);
                        ITitansContainerContext iTitansContainerContext2 = (ITitansContainerContext) weakReference.get();
                        if (iTitansContainerContext2 != null) {
                            iTitansContainerContext2.getBridgePubSub().publish("resize", jSONObject);
                        }
                    } catch (JSONException e) {
                        Titans.serviceManager().getStatisticsService().reportClassError("EventRegisterObserver", "onWebViewSizeChanged", e);
                    }
                    WebViewResizedEventData webViewResizedEventData = new WebViewResizedEventData();
                    webViewResizedEventData.from = new Size(i3, i4);
                    webViewResizedEventData.to = new Size(i, i2);
                    ITitansContainerContext iTitansContainerContext3 = (ITitansContainerContext) weakReference.get();
                    if (iTitansContainerContext3 != null) {
                        iTitansContainerContext3.loadJs(InjectJs.makeCustomEvent(new JsCustomEvent("KNB:WebViewSizeChanged", webViewResizedEventData)), null);
                    }
                }

                @Override // com.sankuai.titans.protocol.utils.OnWebEventListener
                public void onVisibleChanged(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7384d58c8d842371d542e7cb012e823f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7384d58c8d842371d542e7cb012e823f");
                        return;
                    }
                    ITitansContainerContext iTitansContainerContext2 = (ITitansContainerContext) weakReference.get();
                    if (iTitansContainerContext2 != null) {
                        iTitansContainerContext2.loadJs(InjectJs.makeCustomEvent(new JsCustomEvent("KNB:visibilityChanged", new VisibilityChangEntity(z))), null);
                    }
                }

                @Override // com.sankuai.titans.protocol.utils.OnWebEventListener
                public void onWebViewScrollChanged(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e64410e7a4f78aaa59ed8bb3f398e176", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e64410e7a4f78aaa59ed8bb3f398e176");
                        return;
                    }
                    ITitansContainerContext iTitansContainerContext2 = (ITitansContainerContext) weakReference.get();
                    if (iTitansContainerContext2 != null) {
                        iTitansContainerContext2.loadJs("javascript:window.DPApp && window.DPApp.onScroll && window.DPApp.onScroll({offset:" + i2 + "});", null);
                    }
                }
            };
            this.shakeListener = new SensorHandler.IShakeListener() { // from class: com.sankuai.titans.base.observer.EventRegisterObserver.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.base.observer.SensorHandler.IShakeListener
                public void onShake() {
                    ITitansContainerContext iTitansContainerContext2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d6082b36730335bc7bf2fca23cbda073", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d6082b36730335bc7bf2fca23cbda073");
                    } else if (EventRegisterObserver.this.isPause || (iTitansContainerContext2 = (ITitansContainerContext) weakReference.get()) == null) {
                    } else {
                        iTitansContainerContext2.loadJs(InjectJs.makeCustomEvent("KNB:shaked", ""), null);
                    }
                }
            };
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Size {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("height")
        @Expose
        public int height;
        @SerializedName("width")
        @Expose
        public int width;

        public Size(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class VisibilityChangEntity {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean visible;

        public VisibilityChangEntity(boolean z) {
            this.visible = z;
        }
    }
}
