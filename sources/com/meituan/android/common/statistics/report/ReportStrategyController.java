package com.meituan.android.common.statistics.report;

import android.content.Context;
import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.utils.DateTimeUtils;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ReportStrategyController {
    private static final String TAG = "rep_strategy";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicBoolean sShouldReport = new AtomicBoolean(true);
    private static AtomicInteger sUploadCounter = new AtomicInteger(0);
    private static AtomicInteger sGestureScUploadCounter = new AtomicInteger(0);

    public static synchronized void shouldUpLoad(boolean z) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cc97730aa6830efc196ab2ad01efc94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cc97730aa6830efc196ab2ad01efc94");
            } else {
                sShouldReport.set(z);
            }
        }
    }

    public static synchronized void CounterIncrease() {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc1d16e0b72b468fc7cce4beadaacb99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc1d16e0b72b468fc7cce4beadaacb99");
                return;
            }
            sUploadCounter.incrementAndGet();
            LogUtil.log(TAG, "CounterIncrease: " + sUploadCounter.get());
        }
    }

    public static synchronized boolean checkIfNeedReport(Context context, ICacheHandler iCacheHandler, int i) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {context, iCacheHandler, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0032c53ff23d92a99e832a6e9d410832", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0032c53ff23d92a99e832a6e9d410832")).booleanValue();
            }
            return sShouldReport.get() && sUploadCounter.get() < ConfigManager.getInstance(context).maxReportNumPerDay() && iCacheHandler.getCount(i) > 0;
        }
    }

    public static synchronized boolean checkIfAllowReport(Context context) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76b384a77c01a56e4a4ffc5ff716a1c1", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76b384a77c01a56e4a4ffc5ff716a1c1")).booleanValue();
            }
            return sShouldReport.get() && sUploadCounter.get() < ConfigManager.getInstance(context).maxReportNumPerDay();
        }
    }

    public static synchronized int getCurrentCount() {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8155c0f7501a525939089d0065c9bfe", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8155c0f7501a525939089d0065c9bfe")).intValue();
            }
            return sUploadCounter.get();
        }
    }

    public static synchronized void setCurrentCount(int i) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98a630de65637ed72e5ea5be84ecefe5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98a630de65637ed72e5ea5be84ecefe5");
            } else {
                sUploadCounter.set(i);
            }
        }
    }

    public static synchronized boolean checkGestureScIfNeedReport() {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f501240a8d3ed021c24b3b9cb3fd92bc", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f501240a8d3ed021c24b3b9cb3fd92bc")).booleanValue();
            }
            return sGestureScUploadCounter.get() < 10000;
        }
    }

    public static synchronized void gestureScCounterIncrease() {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb5056c0560f81b26d653582f406e3a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb5056c0560f81b26d653582f406e3a0");
            } else {
                sGestureScUploadCounter.incrementAndGet();
            }
        }
    }

    public static synchronized void getGestureScCounterFromCache(Context context) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76ca02204ad4647b684a94b62c048c4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76ca02204ad4647b684a94b62c048c4d");
            } else if (DateTimeUtils.stmToDate(SntpUtil.currentTimeMillis()).equals(getLastSyncGestureScCountDate(context))) {
                sGestureScUploadCounter.set(getCachedGestureCount(context));
            } else {
                sGestureScUploadCounter.set(0);
                setCachedGestureCount(context, 0);
            }
        }
    }

    private static String getLastSyncGestureScCountDate(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87218fa8d228dc30da01e0a85ba78db5", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87218fa8d228dc30da01e0a85ba78db5") : SharedPreferencesHelper.getInstance(context).getLastSyncGestureScCountDate();
    }

    private static void setLastSyncGestureScCountDate(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4354d4ceb5bd4ae6e196d6355202803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4354d4ceb5bd4ae6e196d6355202803");
        } else {
            SharedPreferencesHelper.getInstance(context).setLastSyncGestureScCountDate(str);
        }
    }

    private static int getCachedGestureCount(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "262843ef08af79f8e36b6459a6f10102", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "262843ef08af79f8e36b6459a6f10102")).intValue() : SharedPreferencesHelper.getInstance(context).getCachedGestureScCount();
    }

    private static void setCachedGestureCount(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea83a65d2d02ad1f54f4ec03d4123e4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea83a65d2d02ad1f54f4ec03d4123e4f");
        } else {
            SharedPreferencesHelper.getInstance(context).setCachedGestureCount(i);
        }
    }

    public static void saveGestureCounterToCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18a5d5a7ea9324e3757dfdc5300d2135", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18a5d5a7ea9324e3757dfdc5300d2135");
        } else if (context == null) {
        } else {
            setCachedGestureCount(context, sGestureScUploadCounter.get());
            setLastSyncGestureScCountDate(context, DateTimeUtils.stmToDate(SntpUtil.currentTimeMillis()));
        }
    }

    public static synchronized void clearPostData(ICacheHandler iCacheHandler) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {iCacheHandler};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ff190898ee1fe2e2fd4799f6fe8db66", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ff190898ee1fe2e2fd4799f6fe8db66");
                return;
            }
            try {
                if (iCacheHandler.getCount() > 2000) {
                    Date date = new Date();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    calendar.add(6, -7);
                    iCacheHandler.deletePostData(calendar.getTime().getTime());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void getCounterFromCache(Context context) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "508f1a16d91279dacde15c8443e3e144", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "508f1a16d91279dacde15c8443e3e144");
            } else if (AppUtil.checkOverdue(getLastSyncCountTime(context))) {
                setCounterPref(context, 0);
                sUploadCounter.set(0);
                LogUtil.log(TAG, "getCounterFromCache: reset counter");
            } else {
                sUploadCounter.set(getCounterPref(context));
                LogUtil.log(TAG, "getCounterFromCache: " + sUploadCounter.get());
            }
        }
    }

    public static void saveCounterToCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e9c954a586d6e1ccd1225d5e343d7eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e9c954a586d6e1ccd1225d5e343d7eb");
            return;
        }
        setCounterPref(context, sUploadCounter.get());
        setLastSyncCountTime(context, System.currentTimeMillis());
    }

    public static void setCounterPref(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "659a40ea97fd0ff6d8b41dcbe1b04609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "659a40ea97fd0ff6d8b41dcbe1b04609");
        } else {
            SharedPreferencesHelper.getInstance(context).setCounterPref(i);
        }
    }

    private static int getCounterPref(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9400e6c4032a709a30a572399a59a458", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9400e6c4032a709a30a572399a59a458")).intValue() : SharedPreferencesHelper.getInstance(context).getCounterPref();
    }

    private static long getLastSyncCountTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e92f7c5af481b1f5028271b3f6ad5a4b", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e92f7c5af481b1f5028271b3f6ad5a4b")).longValue() : SharedPreferencesHelper.getInstance(context).getLastSyncCountTime();
    }

    private static void setLastSyncCountTime(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f96a03ff548c28c766b8940384ebeb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f96a03ff548c28c766b8940384ebeb1");
        } else {
            SharedPreferencesHelper.getInstance(context).setLastSyncCountTime(j);
        }
    }

    public static synchronized void handleJsonPackFailed(List<ICacheHandler.Event> list, ICacheHandler iCacheHandler) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {list, iCacheHandler};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8341d2bc84ddfaac6a9d68b06f8de6ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8341d2bc84ddfaac6a9d68b06f8de6ab");
            } else {
                iCacheHandler.updateJsonPackFailedCount(list);
            }
        }
    }

    public static synchronized void clearJsonPackFailedData(ICacheHandler iCacheHandler) {
        synchronized (ReportStrategyController.class) {
            Object[] objArr = {iCacheHandler};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2dfa7a5013afe21cc4bbc184c01d208", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2dfa7a5013afe21cc4bbc184c01d208");
            } else {
                iCacheHandler.deleteJsonSyntaxErrorData(5);
            }
        }
    }
}
