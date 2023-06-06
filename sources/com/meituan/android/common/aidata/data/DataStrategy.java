package com.meituan.android.common.aidata.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.SPCacheHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DataStrategy {
    private static final String EXPOSURE_BID = "b_techportal_rc597jbn_sc";
    private static final String GESTURE_BID = "b_group_l7i3gq32_sc";
    public static final String TOUCH_EVENT_BID = "b_techportal_wv5d9mbb_sc";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile long timeForLastCache = System.currentTimeMillis();
    private static volatile int totalCacheCount;

    public static synchronized void init() {
        synchronized (DataStrategy.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a7fa981b208d7c7d8f95809dc984707", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a7fa981b208d7c7d8f95809dc984707");
                return;
            }
            totalCacheCount = SPCacheHelper.getInstance().getTodayCachedCount();
            timeForLastCache = SPCacheHelper.getInstance().getLastCachedTime();
        }
    }

    public static boolean dataAllowed(@Nullable JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e5cbc356e0a05b79e8ac04cb455fdba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e5cbc356e0a05b79e8ac04cb455fdba")).booleanValue();
        }
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("evs")) == null) {
            return false;
        }
        return (isScEvent(optJSONObject) && (("b_techportal_92es55v1_sc".equalsIgnoreCase(optJSONObject.optString("val_bid")) && "c_techportal_jvnk06h2".equalsIgnoreCase(optJSONObject.optString("val_cid")) && "data_sdk_techportal".equalsIgnoreCase(jSONObject.optString("category"))) || TOUCH_EVENT_BID.equals(optJSONObject.optString("val_bid")))) ? false : true;
    }

    public static boolean dataCacheAllowed4EventBid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7c5bf25a1b36ae247ccdc383660a3f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7c5bf25a1b36ae247ccdc383660a3f4")).booleanValue() : (GESTURE_BID.equalsIgnoreCase(str) || EXPOSURE_BID.equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean dataCacheAllowed(@NonNull EventBean eventBean, int i) {
        Object[] objArr = {eventBean, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d31b5a9018f19fa91a7d1caf365eaf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d31b5a9018f19fa91a7d1caf365eaf2")).booleanValue();
        }
        if (dataCacheAllowed4EventBid(eventBean.bid)) {
            if (AppUtil.checkOverdue(timeForLastCache)) {
                totalCacheCount = 0;
            }
            if (totalCacheCount + i > ConfigManager.getInstance().getCacheMaxCount()) {
                return false;
            }
            SPCacheHelper.getInstance().updateTodayCachedCount(totalCacheCount + i);
            totalCacheCount += i;
            SPCacheHelper.getInstance().updateLastCachedTime(timeForLastCache);
            timeForLastCache = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    public static boolean isScEvent(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09130789518f1310cd7bdbe04e684a86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09130789518f1310cd7bdbe04e684a86")).booleanValue() : "SC".equalsIgnoreCase(jSONObject.optString("nm"));
    }
}
