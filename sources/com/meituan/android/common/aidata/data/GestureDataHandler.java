package com.meituan.android.common.aidata.data;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.table.GestureTable;
import com.meituan.android.common.aidata.database.BaseTable;
import com.meituan.android.common.aidata.database.DBManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.SPCacheHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureDataHandler {
    private static final int MAX_DAILY_GESTURE_DATA_STORE_COUNT = 5000;
    private static final String TAG = "GestureDataHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mTodayGestureDataStoreCount;

    public GestureDataHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "812ce8512dc66c2a6d44d1127cba1f5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "812ce8512dc66c2a6d44d1127cba1f5e");
        } else {
            this.mTodayGestureDataStoreCount = SPCacheHelper.getInstance().getTodayGestureDataStoreCount();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class GestureDataHandlerHolder {
        private static final GestureDataHandler INSTANCE = new GestureDataHandler();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static GestureDataHandler getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e18fa198eb0fcf1714b7ab4b15fa073", RobustBitConfig.DEFAULT_VALUE) ? (GestureDataHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e18fa198eb0fcf1714b7ab4b15fa073") : GestureDataHandlerHolder.INSTANCE;
    }

    public long storeData(GestureBean gestureBean) {
        Object[] objArr = {gestureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f16f249e0d87d65a68cd9de6e375ceb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f16f249e0d87d65a68cd9de6e375ceb")).longValue();
        }
        if (gestureBean == null) {
            return -1L;
        }
        SPCacheHelper sPCacheHelper = SPCacheHelper.getInstance();
        if (AppUtil.checkOverdue(sPCacheHelper.getLastStoreTimeOfGestureData())) {
            this.mTodayGestureDataStoreCount = 0;
        }
        new StringBuilder("today gesture data store count is ").append(this.mTodayGestureDataStoreCount);
        if (this.mTodayGestureDataStoreCount + 1 > 5000) {
            return -1L;
        }
        BaseTable<GestureBean> table = getTable();
        long insert = table != null ? table.insert((BaseTable<GestureBean>) gestureBean) : -1L;
        if (insert >= 0) {
            this.mTodayGestureDataStoreCount++;
            sPCacheHelper.setLastStoreTimeOfGestureData(System.currentTimeMillis());
            sPCacheHelper.setTodayGestureDataStoreCount(this.mTodayGestureDataStoreCount);
        }
        return insert;
    }

    public int deletePostData(long j) {
        BaseTable<GestureBean> table;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bea17e7663202b345bcacc9d15d0af0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bea17e7663202b345bcacc9d15d0af0")).intValue();
        }
        new StringBuilder("GestureDataHandler--- deletePostData entry time:").append(j);
        if (j > 0 && (table = getTable()) != null) {
            return table.deleteByCase("tm <= ?", new String[]{String.valueOf(j)});
        }
        return -1;
    }

    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "641a7e41d4a339369d90d1ffcba916ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "641a7e41d4a339369d90d1ffcba916ae")).intValue();
        }
        BaseTable<GestureBean> table = getTable();
        if (table == null) {
            return 0;
        }
        return table.getCount(null, null);
    }

    @Nullable
    private static BaseTable<GestureBean> getTable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dca0864af559845794930bba868a4c9", RobustBitConfig.DEFAULT_VALUE) ? (BaseTable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dca0864af559845794930bba868a4c9") : DBManager.getInstance().getTable(GestureTable.class);
    }
}
