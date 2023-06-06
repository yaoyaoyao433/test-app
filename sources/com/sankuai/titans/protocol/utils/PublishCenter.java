package com.sankuai.titans.protocol.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PublishCenter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<ReceivedActionCallback> mCallbackList;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ReceivedActionCallback {
        void onReceivedAction(String str, JSONObject jSONObject);
    }

    public PublishCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55cdd2d47a8bd10fd92307fc7a98ee38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55cdd2d47a8bd10fd92307fc7a98ee38");
        } else {
            this.mCallbackList = new ArrayList();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class SingleTon {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final PublishCenter sInstance = new PublishCenter();
    }

    public static PublishCenter getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "778f93fbb1c8469bc3ebca0f3077a884", RobustBitConfig.DEFAULT_VALUE) ? (PublishCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "778f93fbb1c8469bc3ebca0f3077a884") : SingleTon.sInstance;
    }

    public void registerCallback(ReceivedActionCallback receivedActionCallback) {
        Object[] objArr = {receivedActionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c66609d05521f4211534bc84995d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c66609d05521f4211534bc84995d01");
        } else if (receivedActionCallback == null || this.mCallbackList.contains(receivedActionCallback)) {
        } else {
            this.mCallbackList.add(receivedActionCallback);
        }
    }

    public void publish(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ecc45cfeebde4c821e0e1bf29817ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ecc45cfeebde4c821e0e1bf29817ac3");
            return;
        }
        for (ReceivedActionCallback receivedActionCallback : this.mCallbackList) {
            if (receivedActionCallback != null) {
                receivedActionCallback.onReceivedAction(str, jSONObject);
            }
        }
    }
}
