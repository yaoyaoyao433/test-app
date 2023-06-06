package com.dianping.picassocontroller.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.jscore.Value;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.bridge.b;
import com.dianping.picassocontroller.jse.h;
import com.dianping.picassocontroller.vc.e;
import com.dianping.titans.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "broadcast")
/* loaded from: classes.dex */
public class BroadcastModule extends a {
    private static final String TAG = "BroadcastModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, BroadcastReceiver> localReceivers;
    private HashMap<String, HashMap<String, b>> subscribedCallbacks;
    private HashMap<String, BroadcastReceiver> systemReceivers;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class ActionArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String action;
        public int channel = -1;
        public String handleId;
        public String info;
    }

    public BroadcastModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68915811dd58c805426b2731ba73cf9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68915811dd58c805426b2731ba73cf9d");
            return;
        }
        this.subscribedCallbacks = new HashMap<>();
        this.localReceivers = new HashMap<>();
        this.systemReceivers = new HashMap<>();
    }

    @Keep
    @PCSBMethod(name = "subscribe")
    public Value subscribe(com.dianping.picassocontroller.vc.b bVar, ActionArgument actionArgument, b bVar2) {
        Object[] objArr = {bVar, actionArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ef57efa6702ed89ef7ec1b3d4159b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ef57efa6702ed89ef7ec1b3d4159b0");
        }
        subscribeAction(actionArgument.action, bVar2, actionArgument.channel);
        return new Value(bVar2.b);
    }

    @Keep
    @PCSBMethod(name = "unSubscribe")
    public void unSubscribe(com.dianping.picassocontroller.vc.b bVar, ActionArgument actionArgument, b bVar2) {
        Object[] objArr = {bVar, actionArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c59740b8d34ef34f60b1d99921d3aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c59740b8d34ef34f60b1d99921d3aa");
        } else {
            unSubscribeAction(actionArgument.action, actionArgument.handleId);
        }
    }

    @Keep
    @PCSBMethod(name = Constants.MULTI_PROCESS_PUBLISH_DATA)
    public Value publish(com.dianping.picassocontroller.vc.b bVar, ActionArgument actionArgument, b bVar2) {
        Object[] objArr = {bVar, actionArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48235062e219c8a964888f3575706127", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48235062e219c8a964888f3575706127");
        }
        Intent intent = new Intent(actionArgument.action);
        intent.putExtra("info", actionArgument.info);
        intent.setPackage(bVar.b().getPackageName());
        if (actionArgument.channel != 1) {
            LocalBroadcastManager.getInstance(bVar.b()).sendBroadcast(intent);
        }
        if (actionArgument.channel != 0 && actionArgument.channel != -1) {
            com.sankuai.meituan.takeoutnew.util.aop.b.a(bVar.b(), intent);
        }
        bVar2.a(null);
        return new Value(true);
    }

    @Override // com.dianping.picassocontroller.module.a
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a4631383ee4250e3f67f9f87d296f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a4631383ee4250e3f67f9f87d296f15");
            return;
        }
        this.subscribedCallbacks.clear();
        for (BroadcastReceiver broadcastReceiver : this.localReceivers.values()) {
            LocalBroadcastManager.getInstance(this.host.b()).unregisterReceiver(broadcastReceiver);
        }
        for (BroadcastReceiver broadcastReceiver2 : this.systemReceivers.values()) {
            try {
                this.host.b().getApplicationContext().unregisterReceiver(broadcastReceiver2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.localReceivers.clear();
        this.systemReceivers.clear();
    }

    private void subscribeAction(final String str, b bVar, int i) {
        Object[] objArr = {str, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13364e946ae86a798266742ad5906d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13364e946ae86a798266742ad5906d48");
            return;
        }
        HashMap<String, b> hashMap = this.subscribedCallbacks.get(str);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(bVar.b, bVar);
        this.subscribedCallbacks.put(str, hashMap);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.dianping.picassocontroller.module.BroadcastModule.1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Bundle extras;
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77e8171b1951a3f694f13ba2737ca7fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77e8171b1951a3f694f13ba2737ca7fd");
                    return;
                }
                String a2 = f.a(intent, "info");
                if (TextUtils.isEmpty(a2) && (extras = intent.getExtras()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : extras.keySet()) {
                        try {
                            jSONObject.put(str2, extras.get(str2));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    a2 = jSONObject.toString();
                }
                BroadcastModule.this.publishAction(str, a2);
            }
        };
        if (i != 1 && this.localReceivers.get(str) == null) {
            this.localReceivers.put(str, broadcastReceiver);
            LocalBroadcastManager.getInstance(this.host.b()).registerReceiver(broadcastReceiver, new IntentFilter(str));
        }
        if (i == 0 || this.systemReceivers.get(str) != null) {
            return;
        }
        this.systemReceivers.put(str, broadcastReceiver);
        try {
            this.host.b().getApplicationContext().registerReceiver(broadcastReceiver, new IntentFilter(str));
        } catch (IllegalArgumentException unused) {
            Log.e(TAG, "register too many Broadcast Receivers");
        }
    }

    private void unSubscribeAction(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "885c4eebbefcc97c969b1b7371ca1f3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "885c4eebbefcc97c969b1b7371ca1f3f");
            return;
        }
        HashMap<String, b> hashMap = this.subscribedCallbacks.get(str);
        if (hashMap != null) {
            hashMap.remove(str2);
            this.subscribedCallbacks.put(str, hashMap);
        }
        if (hashMap == null || hashMap.size() == 0) {
            BroadcastReceiver remove = this.localReceivers.remove(str);
            if (remove != null) {
                LocalBroadcastManager.getInstance(this.host.b()).unregisterReceiver(remove);
            }
            BroadcastReceiver remove2 = this.systemReceivers.remove(str);
            if (remove2 != null) {
                try {
                    this.host.b().getApplicationContext().unregisterReceiver(remove2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishAction(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1ef577ba2e49b05652b8582f3e3020d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1ef577ba2e49b05652b8582f3e3020d");
        } else {
            postOnJSThread(new Runnable() { // from class: com.dianping.picassocontroller.module.BroadcastModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d2abd65a55a0c02bca95c42b806594e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d2abd65a55a0c02bca95c42b806594e8");
                        return;
                    }
                    HashMap hashMap = (HashMap) BroadcastModule.this.subscribedCallbacks.get(str);
                    if (hashMap == null || hashMap.size() == 0) {
                        String unused = BroadcastModule.TAG;
                        new StringBuilder("publish no callbacks,action=").append(str);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("action", str);
                        jSONObject.put("info", str2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    for (b bVar : (b[]) hashMap.values().toArray(new b[hashMap.values().size()])) {
                        bVar.c(jSONObject);
                    }
                    String unused2 = BroadcastModule.TAG;
                    new StringBuilder("publish,action=").append(str);
                }
            });
        }
    }

    private void postOnJSThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5eac0b80fdd11a823bf3bf8fe9052e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5eac0b80fdd11a823bf3bf8fe9052e8");
        } else if (this.host instanceof e) {
            h.a((e) this.host, runnable);
        }
    }
}
