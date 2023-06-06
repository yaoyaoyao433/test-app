package com.meituan.android.common.aidata.feature.optimize.cep;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.data.DataStrategy;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.data.rule.ICepServiceListener;
import com.meituan.android.common.aidata.utils.CollectionUtils;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CEPSubTableCEPServiceManager {
    private static final String TAG = "CEPSubTableCEPServiceManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    private final Map<String, ICepServiceListener> mCepServiceListenerMap;

    public CEPSubTableCEPServiceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b527df824df05ef41b550c2b4fd7a74e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b527df824df05ef41b550c2b4fd7a74e");
        } else {
            this.mCepServiceListenerMap = new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CEPSubTableCEPServiceManagerHolder {
        private static final CEPSubTableCEPServiceManager INSTANCE = new CEPSubTableCEPServiceManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static CEPSubTableCEPServiceManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ef3d7816939ac587ad1698de17dd13d", RobustBitConfig.DEFAULT_VALUE) ? (CEPSubTableCEPServiceManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ef3d7816939ac587ad1698de17dd13d") : CEPSubTableCEPServiceManagerHolder.INSTANCE;
    }

    public void subscribeCepServiceCallback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cafe3d46f08a5ef87542f25783df61b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cafe3d46f08a5ef87542f25783df61b");
            return;
        }
        new StringBuilder("start subscribeCepServiceCallback for feature ").append(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            if (this.mCepServiceListenerMap.get(str) != null) {
                return;
            }
            ICepServiceListener iCepServiceListener = new ICepServiceListener() { // from class: com.meituan.android.common.aidata.feature.optimize.cep.CEPSubTableCEPServiceManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.data.rule.ICepServiceListener
                public void onRuleMatchSucceed(String str2, List<StreamData> list, int i) {
                    Object[] objArr2 = {str2, list, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "afb0b41aa616fa6a9fb56ba3a2ed31f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "afb0b41aa616fa6a9fb56ba3a2ed31f3");
                        return;
                    }
                    for (StreamData streamData : CollectionUtils.nonNullList(list)) {
                        if (streamData != null && DataStrategy.dataCacheAllowed4EventBid(streamData.val_bid) && !EventName.MODEL_DISAPPEAR.toString().equals(streamData.nm)) {
                            DBCEPSubTableDataHelper.getInstance().insertData(str2, streamData);
                        }
                    }
                }
            };
            this.mCepServiceListenerMap.put(str, iCepServiceListener);
            AIDataDelegate.getInstance().subscribeCepServiceCallback(new CEPSubscriberConfig.Builder().featureList(Collections.singletonList(str)).build(), iCepServiceListener);
        }
    }

    public void unsubscribeCepServiceCallback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869276b3705d80324958127cced06cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869276b3705d80324958127cced06cc8");
            return;
        }
        new StringBuilder("start unsubscribeCepServiceCallback for feature ").append(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            ICepServiceListener iCepServiceListener = this.mCepServiceListenerMap.get(str);
            if (iCepServiceListener == null) {
                StringBuilder sb = new StringBuilder("no callback for feature ");
                sb.append(str);
                sb.append(", unsubscribe abort");
                return;
            }
            this.mCepServiceListenerMap.remove(str);
            AIDataDelegate.getInstance().unsubscribeCepServiceCallback(iCepServiceListener);
        }
    }
}
