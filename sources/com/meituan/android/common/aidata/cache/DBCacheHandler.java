package com.meituan.android.common.aidata.cache;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.result.OpResult;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.cache.table.EventTableV2;
import com.meituan.android.common.aidata.cache.table.ITableInterfaceV2;
import com.meituan.android.common.aidata.data.EventBean;
import com.meituan.android.common.aidata.data.MVTimeStampEvent;
import com.meituan.android.common.aidata.database.BaseTable;
import com.meituan.android.common.aidata.database.DBManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBCacheHandler {
    private static final String TAG = "DBCacheHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DBCacheHandler instance;

    public static DBCacheHandler getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c4ba9b1f504d4cfe88452a568d7d2a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DBCacheHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c4ba9b1f504d4cfe88452a568d7d2a4");
        }
        if (instance == null) {
            synchronized (DBCacheHandler.class) {
                if (instance == null) {
                    instance = new DBCacheHandler();
                }
            }
        }
        return instance;
    }

    public OpResult writeEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae4c19fae5cf0f59bec7f5bfa499ce81", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae4c19fae5cf0f59bec7f5bfa499ce81");
        }
        if (eventBean == null) {
            return new OpResult(-1, "event is null");
        }
        ITableInterfaceV2 table = getTable();
        if (table != null) {
            try {
                return table.writeEvent(eventBean);
            } catch (Exception e) {
                new BaseRaptorUploader().addTags("path", "aidata_140001_info").addTags("errorType", 2).addValues("aidata_140001_info", 1).addExtra("errorInfo", e.getMessage()).send();
                new StringBuilder("write event failed: ").append(e);
            }
        }
        return new OpResult(-1, "not found table");
    }

    public void writeEvent(List<EventBean> list) {
        ITableInterfaceV2 table;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3af9b98fc246fdbf078c502910000d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3af9b98fc246fdbf078c502910000d3");
        } else if (list == null || list.size() == 0 || (table = getTable()) == null) {
        } else {
            try {
                table.writeEvent(list);
            } catch (Throwable th) {
                new StringBuilder("write events failed: ").append(th);
            }
        }
    }

    public boolean removeEvent(EventBean eventBean) {
        ITableInterfaceV2 table;
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8cbfeca4940cd570678fd64eebf92ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8cbfeca4940cd570678fd64eebf92ab")).booleanValue();
        }
        if (eventBean != null && (table = getTable()) != null) {
            try {
                return table.removeEvent(eventBean);
            } catch (Throwable th) {
                new StringBuilder("remove event failed: ").append(th);
            }
        }
        return false;
    }

    public boolean removeEvent(List<EventBean> list) {
        ITableInterfaceV2 table;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3261b698358ac258096d30c70f3d8418", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3261b698358ac258096d30c70f3d8418")).booleanValue();
        }
        if (list != null && list.size() != 0 && (table = getTable()) != null) {
            try {
                return table.removeEvent(list);
            } catch (Throwable th) {
                new StringBuilder("remove events failed: ").append(th);
            }
        }
        return false;
    }

    public boolean removeEventById(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94b42de24a61b618713aeedee7660909", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94b42de24a61b618713aeedee7660909")).booleanValue();
        }
        ITableInterfaceV2 table = getTable();
        if (table != null) {
            return table.removeEventById(l);
        }
        return false;
    }

    public boolean removeEventById(List<Long> list) {
        ITableInterfaceV2 table;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cace3e9b780d3e5fd2109372bd94f40d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cace3e9b780d3e5fd2109372bd94f40d")).booleanValue();
        }
        if (list == null || (table = getTable()) == null) {
            return false;
        }
        return table.removeEventById(list);
    }

    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40faaa32fc0bed53dafd4a40866c6aae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40faaa32fc0bed53dafd4a40866c6aae")).intValue();
        }
        ITableInterfaceV2 table = getTable();
        if (table != null) {
            try {
                return table.getCount();
            } catch (Throwable th) {
                new StringBuilder("getCount failed: ").append(th);
            }
        }
        return 0;
    }

    public int getCount(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e55f227dc9cd0b8c7300415735ee574b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e55f227dc9cd0b8c7300415735ee574b")).intValue();
        }
        ITableInterfaceV2 table = getTable();
        if (table != null) {
            return table.getCount(j);
        }
        return 0;
    }

    private List<ResultRow> query(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Object[] objArr = {strArr, str, strArr2, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40b84e0062971e722d58ba0887b2dfd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40b84e0062971e722d58ba0887b2dfd7");
        }
        try {
            ITableInterfaceV2 table = getTable();
            if (table != null) {
                return table.queryEvent(strArr, str, strArr2, str2, str3, str4, str5);
            }
            return null;
        } catch (Throwable th) {
            new StringBuilder("query failed: ").append(th);
            return null;
        }
    }

    @Nullable
    public List<ResultRow> query(String str, String[] strArr, String str2) {
        Object[] objArr = {str, strArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1df5314cf38322b30100fad7aa88a60", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1df5314cf38322b30100fad7aa88a60") : query(str, strArr, str2, false);
    }

    @Nullable
    public List<ResultRow> query(String str, String[] strArr, String str2, boolean z) {
        Object[] objArr = {str, strArr, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8da6d4ea1209dc30d646a6f1dd2bfbf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8da6d4ea1209dc30d646a6f1dd2bfbf2");
        }
        ITableInterfaceV2 table = getTable();
        if (table != null) {
            try {
                return table.queryEvent(str, strArr, str2, z);
            } catch (Throwable th) {
                new StringBuilder("query failed: ").append(th);
                return null;
            }
        }
        return null;
    }

    @Nullable
    public OpResult deletePostData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fec9236eb5fd5f050e5feb4fe9cb3513", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fec9236eb5fd5f050e5feb4fe9cb3513");
        }
        new StringBuilder("DBCacheHandler--- deletePostData entry time:").append(j);
        ITableInterfaceV2 table = getTable();
        if (table != null) {
            try {
                return table.deletePostData(j);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("deletePostData ");
                sb.append(j);
                sb.append(" failed: ");
                sb.append(th);
                return null;
            }
        }
        return null;
    }

    @Nullable
    private static ITableInterfaceV2 getTable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1c82e515c45111d16568d6652bc3a5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITableInterfaceV2) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1c82e515c45111d16568d6652bc3a5e");
        }
        BaseTable table = DBManager.getInstance().getTable(EventTableV2.class);
        if (table instanceof ITableInterfaceV2) {
            return (ITableInterfaceV2) table;
        }
        return null;
    }

    public OpResult updateExposureEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842b186599df95367d9f64f25b936a73", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842b186599df95367d9f64f25b936a73");
        }
        if (eventBean == null) {
            return new OpResult(-1, "event is null");
        }
        ITableInterfaceV2 table = getTable();
        if (table instanceof EventTableV2) {
            return ((EventTableV2) table).updateExposeEvent(eventBean);
        }
        return new OpResult(-1, "not found table");
    }

    public void execSQL(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0b49bf54ebd988b5bcbd4261373518c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0b49bf54ebd988b5bcbd4261373518c");
            return;
        }
        BaseTable table = DBManager.getInstance().getTable(EventTableV2.class);
        if (table != null) {
            table.execSQL(str);
        }
    }

    @NonNull
    public OpResult updateMVTimeStampEvent(@NonNull MVTimeStampEvent mVTimeStampEvent) {
        Object[] objArr = {mVTimeStampEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b21f770841f5b7a63661dd11c0f0329c", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b21f770841f5b7a63661dd11c0f0329c");
        }
        ITableInterfaceV2 table = getTable();
        if (table instanceof EventTableV2) {
            return ((EventTableV2) table).updateMVTimeStampEvent(mVTimeStampEvent);
        }
        return new OpResult(-1, "not found table");
    }

    @Nullable
    public SQLiteDatabase getDatabase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd7245e1d6fba3cdbf1c7654ef6faba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd7245e1d6fba3cdbf1c7654ef6faba8");
        }
        ITableInterfaceV2 table = getTable();
        if (table instanceof EventTableV2) {
            return ((EventTableV2) table).getDatabase();
        }
        return null;
    }
}
