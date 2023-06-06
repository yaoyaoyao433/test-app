package com.meituan.android.common.aidata.utils;

import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.AIData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SPCacheHelper {
    public static final String AIDATA_SDK_CIPSTORAGE_CHANNEL = "aidata_";
    private static final String CACHED_COUNT = "today_cached_count";
    private static final String LAST_CACHED_TIME = "last_cached_time";
    private static final String LAST_CLEAR_TIME_OF_GESTURE_DATA = "last_clear_time_of_gesture_data";
    private static final String LAST_DATA_REMOVED_TIME = "data_last_removed_time";
    private static final String LAST_REPORT_TIME_OF_EVENT_DATA = "last_report_time_of_event_data";
    private static final String LAST_REPORT_TIME_OF_GESTURE_DATA = "last_report_time_of_gesture_data";
    private static final String LAST_STORE_TIME_OF_GESTURE_DATA = "last_store_time_of_gesture_data";
    private static final String SP_FILE_NAME = "sp_file";
    public static final String TAG = "SPCacheHelper";
    private static final String TODAY_GESTURE_DATA_STORE_COUNT = "today_gesture_data_store_count";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SPCacheHelper instance;
    private q mCipStorageCenter;
    private long mLastClearTimeOfGestureData;
    private long mLastReportTimeOfEventData;
    private long mLastReportTimeOfGestureData;
    private long mLastStoreTimeOfGestureData;
    private int mTodayGestureDataStoreCount;
    private long timeForDataLastRemoved;

    public SPCacheHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "375aa66f389d52b7018bd2d9c6802df8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "375aa66f389d52b7018bd2d9c6802df8");
            return;
        }
        this.mCipStorageCenter = null;
        this.timeForDataLastRemoved = 0L;
        this.mLastClearTimeOfGestureData = 0L;
        this.mLastStoreTimeOfGestureData = 0L;
        this.mTodayGestureDataStoreCount = 0;
        this.mLastReportTimeOfEventData = 0L;
        this.mLastReportTimeOfGestureData = 0L;
        try {
            this.mCipStorageCenter = q.a(AIData.getContext(), "aidata_sp_file", 0);
        } catch (Exception e) {
            new StringBuilder("init get an exception ").append(e);
        }
    }

    public static SPCacheHelper getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c83f1943de19035a850b69d91723b43", RobustBitConfig.DEFAULT_VALUE)) {
            return (SPCacheHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c83f1943de19035a850b69d91723b43");
        }
        if (instance == null) {
            synchronized (SPCacheHelper.class) {
                if (instance == null) {
                    instance = new SPCacheHelper();
                }
            }
        }
        return instance;
    }

    public void updateTodayCachedCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c23e1e3d3549e9b566a64f9f1b63dc87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c23e1e3d3549e9b566a64f9f1b63dc87");
        } else if (this.mCipStorageCenter != null) {
            this.mCipStorageCenter.a(CACHED_COUNT, i);
        }
    }

    public int getTodayCachedCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "391f089c1549c985156af2c668b231f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "391f089c1549c985156af2c668b231f3")).intValue();
        }
        if (this.mCipStorageCenter != null) {
            return this.mCipStorageCenter.b(CACHED_COUNT, 0);
        }
        return 0;
    }

    public void updateLastCachedTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "901547ad5b4fa3682af056af0fe934e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "901547ad5b4fa3682af056af0fe934e4");
        } else if (this.mCipStorageCenter != null) {
            this.mCipStorageCenter.a(LAST_CACHED_TIME, j);
        }
    }

    public long getLastCachedTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e67fdb9178243cbfeb553d934c4fb7f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e67fdb9178243cbfeb553d934c4fb7f0")).longValue();
        }
        if (this.mCipStorageCenter != null) {
            return this.mCipStorageCenter.b(LAST_CACHED_TIME, 0L);
        }
        return 0L;
    }

    public long timeForDataLastRemoved() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cfcfdecbf08b61bc5c4d846bf5dcfa6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cfcfdecbf08b61bc5c4d846bf5dcfa6")).longValue();
        }
        synchronized (this) {
            if (this.timeForDataLastRemoved <= 0) {
                this.timeForDataLastRemoved = this.mCipStorageCenter != null ? this.mCipStorageCenter.b(LAST_DATA_REMOVED_TIME, 0L) : 0L;
            }
            j = this.timeForDataLastRemoved;
        }
        return j;
    }

    public void setTimeForDataRemoved(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67405b027108c7448f2be56a532ca8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67405b027108c7448f2be56a532ca8a");
            return;
        }
        synchronized (this) {
            if (j > 0) {
                try {
                    if (this.mCipStorageCenter != null) {
                        this.mCipStorageCenter.a(LAST_DATA_REMOVED_TIME, j);
                    }
                    this.timeForDataLastRemoved = j;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public long getLastClearTimeOfGestureData() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbcd9db49fc9404dea44f28ec16e30d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbcd9db49fc9404dea44f28ec16e30d0")).longValue();
        }
        synchronized (this) {
            if (this.mLastClearTimeOfGestureData <= 0) {
                this.mLastClearTimeOfGestureData = this.mCipStorageCenter != null ? this.mCipStorageCenter.b(LAST_CLEAR_TIME_OF_GESTURE_DATA, 0L) : 0L;
            }
            j = this.mLastClearTimeOfGestureData;
        }
        return j;
    }

    public void setLastClearTimeOfGestureData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b0617ad396e0b30d40608a9c962629f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b0617ad396e0b30d40608a9c962629f");
        } else if (j <= 0) {
        } else {
            synchronized (this) {
                if (this.mCipStorageCenter != null) {
                    this.mCipStorageCenter.a(LAST_CLEAR_TIME_OF_GESTURE_DATA, j);
                }
                this.mLastClearTimeOfGestureData = j;
            }
        }
    }

    public long getLastStoreTimeOfGestureData() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e4351a58761112c693c81732f9c95b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e4351a58761112c693c81732f9c95b")).longValue();
        }
        synchronized (this) {
            if (this.mLastStoreTimeOfGestureData <= 0) {
                this.mLastStoreTimeOfGestureData = this.mCipStorageCenter != null ? this.mCipStorageCenter.b(LAST_STORE_TIME_OF_GESTURE_DATA, 0L) : 0L;
            }
            j = this.mLastStoreTimeOfGestureData;
        }
        return j;
    }

    public void setLastStoreTimeOfGestureData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94d99cd85cd2f619f1d4dcd59796d634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94d99cd85cd2f619f1d4dcd59796d634");
        } else if (j <= 0) {
        } else {
            synchronized (this) {
                if (this.mCipStorageCenter != null) {
                    this.mCipStorageCenter.a(LAST_STORE_TIME_OF_GESTURE_DATA, j);
                }
                this.mLastStoreTimeOfGestureData = j;
            }
        }
    }

    public int getTodayGestureDataStoreCount() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe810c70a3b52a0245573ba1ecbf29fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe810c70a3b52a0245573ba1ecbf29fc")).intValue();
        }
        synchronized (this) {
            if (this.mTodayGestureDataStoreCount <= 0) {
                this.mTodayGestureDataStoreCount = this.mCipStorageCenter != null ? this.mCipStorageCenter.b(TODAY_GESTURE_DATA_STORE_COUNT, 0) : 0;
            }
            i = this.mTodayGestureDataStoreCount;
        }
        return i;
    }

    public void setTodayGestureDataStoreCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f37f08fac11d26e00afbc01aba6b1a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f37f08fac11d26e00afbc01aba6b1a70");
        } else if (i <= 0) {
        } else {
            synchronized (this) {
                if (this.mCipStorageCenter != null) {
                    this.mCipStorageCenter.a(TODAY_GESTURE_DATA_STORE_COUNT, i);
                }
                this.mTodayGestureDataStoreCount = i;
            }
        }
    }

    public long getLastReportTimeOfEventData() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dd9d36ded8e31adc81a4067b91eb146", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dd9d36ded8e31adc81a4067b91eb146")).longValue();
        }
        synchronized (this) {
            if (this.mLastReportTimeOfEventData <= 0) {
                this.mLastReportTimeOfEventData = this.mCipStorageCenter != null ? this.mCipStorageCenter.b(LAST_REPORT_TIME_OF_EVENT_DATA, 0L) : 0L;
            }
            j = this.mLastReportTimeOfEventData;
        }
        return j;
    }

    public void setLastReportTimeOfEventData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c219cddf3b35730a24468a6b7160a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c219cddf3b35730a24468a6b7160a54");
        } else if (j <= 0) {
        } else {
            synchronized (this) {
                if (this.mCipStorageCenter != null) {
                    this.mCipStorageCenter.a(LAST_REPORT_TIME_OF_EVENT_DATA, j);
                }
                this.mLastReportTimeOfEventData = j;
            }
        }
    }

    public long getLastReportTimeOfGestureData() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4830f9494ba31823c2558f892226546f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4830f9494ba31823c2558f892226546f")).longValue();
        }
        synchronized (this) {
            if (this.mLastReportTimeOfGestureData <= 0) {
                this.mLastReportTimeOfGestureData = this.mCipStorageCenter != null ? this.mCipStorageCenter.b(LAST_REPORT_TIME_OF_GESTURE_DATA, 0L) : 0L;
            }
            j = this.mLastReportTimeOfGestureData;
        }
        return j;
    }

    public void setLastReportTimeOfGestureData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5c43c97226052143aae3f0bffecda0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5c43c97226052143aae3f0bffecda0d");
        } else if (j <= 0) {
        } else {
            synchronized (this) {
                if (this.mCipStorageCenter != null) {
                    this.mCipStorageCenter.a(LAST_REPORT_TIME_OF_GESTURE_DATA, j);
                }
                this.mLastReportTimeOfGestureData = j;
            }
        }
    }
}
