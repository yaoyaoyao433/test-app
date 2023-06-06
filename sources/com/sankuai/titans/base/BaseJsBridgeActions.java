package com.sankuai.titans.base;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.utils.JsonUtils;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgeManager;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseJsBridgeActions implements IBridgeActions, IBridgeManager, IBridgePubSub {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, AbsJsHandler> mJsHandlerMap;
    protected final Map<String, List<AbsJsHandler>> mSubscribeJsHandlerMap;
    private final IStatisticsService statisticsService;

    public BaseJsBridgeActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "376f92e89a7e7454368709e0b17e7483", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "376f92e89a7e7454368709e0b17e7483");
            return;
        }
        this.mJsHandlerMap = new ConcurrentHashMap();
        this.mSubscribeJsHandlerMap = new ConcurrentHashMap();
        this.statisticsService = Titans.serviceManager().getStatisticsService();
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeManager
    public AbsJsHandler getJsHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f473ffca90c3594bc3585f3c1567b13", RobustBitConfig.DEFAULT_VALUE) ? (AbsJsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f473ffca90c3594bc3585f3c1567b13") : this.mJsHandlerMap.get(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeManager
    public void putJsHandler(AbsJsHandler absJsHandler) {
        Object[] objArr = {absJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cc9d0c963c972e1b11d833af4596079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cc9d0c963c972e1b11d833af4596079");
        } else {
            this.mJsHandlerMap.put(absJsHandler.callbackId, absJsHandler);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub
    public void subscribe(String str, AbsJsHandler absJsHandler) {
        Object[] objArr = {str, absJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3b2ac6ac571a75b1c8f81fc3d805a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3b2ac6ac571a75b1c8f81fc3d805a0");
            return;
        }
        synchronized (this.mSubscribeJsHandlerMap) {
            List<AbsJsHandler> list = this.mSubscribeJsHandlerMap.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.mSubscribeJsHandlerMap.put(str, list);
            }
            if (list.contains(absJsHandler)) {
                return;
            }
            list.add(absJsHandler);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub
    public void unsubscribe(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8878b33d3948426e693fab610a485d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8878b33d3948426e693fab610a485d2");
            return;
        }
        synchronized (this.mSubscribeJsHandlerMap) {
            if (this.mSubscribeJsHandlerMap.get(str) == null) {
                return;
            }
            this.mSubscribeJsHandlerMap.remove(str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub
    public void unsubscribeAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d385cd08987fa1521b9c5b8ee974f96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d385cd08987fa1521b9c5b8ee974f96");
        } else {
            this.mSubscribeJsHandlerMap.clear();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub
    public void publish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef02a2e0c4da0d02b5f0ec04e1d4c044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef02a2e0c4da0d02b5f0ec04e1d4c044");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e) {
            this.statisticsService.reportClassError("BaseJsBridgeActions", Constants.MULTI_PROCESS_PUBLISH_DATA, e);
        }
        publish(str, jSONObject);
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub
    public void publish(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2999883fb2065ed89dd939f48ae884eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2999883fb2065ed89dd939f48ae884eb");
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                jSONObject.put("status", "action");
            } catch (JSONException e) {
                this.statisticsService.reportClassError("BaseJsBridgeActions", "publish#JSONObject", e);
            }
            synchronized (this.mSubscribeJsHandlerMap) {
                List<AbsJsHandler> list = this.mSubscribeJsHandlerMap.get(str);
                if (list == null) {
                    return;
                }
                for (AbsJsHandler absJsHandler : list) {
                    absJsHandler.publish(jSONObject);
                }
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub
    public void publish(String str, RespResult respResult) {
        Object[] objArr = {str, respResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c745de43cc3b9f3cbc7cd1402804224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c745de43cc3b9f3cbc7cd1402804224");
        } else if (TextUtils.isEmpty(str) || respResult == null) {
        } else {
            try {
                publish(str, new JSONObject(JsonUtils.getExcludeGson().toJson(respResult)));
            } catch (Throwable th) {
                this.statisticsService.reportClassError("BaseJsBridgeActions", "publish#RespResult", th);
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeManager
    public void removeAllJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53de5d8895406ff504dfeef384efbf7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53de5d8895406ff504dfeef384efbf7b");
            return;
        }
        for (AbsJsHandler absJsHandler : this.mJsHandlerMap.values()) {
            absJsHandler.onDestroy();
        }
        this.mJsHandlerMap.clear();
        this.mSubscribeJsHandlerMap.clear();
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd97db85a60c54b5553815b76cc1d0a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd97db85a60c54b5553815b76cc1d0a8");
            return;
        }
        for (Map.Entry<String, AbsJsHandler> entry : this.mJsHandlerMap.entrySet()) {
            AbsJsHandler value = entry.getValue();
            if (value != null) {
                value.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57a59fb7a9faafe4379ca13fecd4d5f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57a59fb7a9faafe4379ca13fecd4d5f9");
            return;
        }
        for (Map.Entry<String, AbsJsHandler> entry : this.mJsHandlerMap.entrySet()) {
            AbsJsHandler value = entry.getValue();
            if (value != null) {
                value.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55c0710e9be073f25d8de41153b6818f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55c0710e9be073f25d8de41153b6818f");
            return;
        }
        for (Map.Entry<String, AbsJsHandler> entry : this.mJsHandlerMap.entrySet()) {
            AbsJsHandler value = entry.getValue();
            if (value != null) {
                value.onResume();
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af9565e0afc20e1913acca9fa2c3f2dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af9565e0afc20e1913acca9fa2c3f2dd");
            return;
        }
        for (Map.Entry<String, AbsJsHandler> entry : this.mJsHandlerMap.entrySet()) {
            AbsJsHandler value = entry.getValue();
            if (value != null) {
                value.onPause();
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15409302600071d5f6f5337d59f45ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15409302600071d5f6f5337d59f45ef0");
            return;
        }
        for (Map.Entry<String, AbsJsHandler> entry : this.mJsHandlerMap.entrySet()) {
            AbsJsHandler value = entry.getValue();
            if (value != null) {
                value.onStop();
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.jshost.IBridgeActions
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b9798778119ecef796c8f6e2bfc0b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b9798778119ecef796c8f6e2bfc0b23");
            return;
        }
        removeAllJsHandler();
        unsubscribeAll();
    }
}
