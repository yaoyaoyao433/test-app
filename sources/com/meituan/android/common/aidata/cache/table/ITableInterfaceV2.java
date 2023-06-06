package com.meituan.android.common.aidata.cache.table;

import android.database.sqlite.SQLiteDatabase;
import com.meituan.android.common.aidata.cache.result.OpResult;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.data.EventBean;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ITableInterfaceV2 {
    void clearTable();

    void createTable(SQLiteDatabase sQLiteDatabase);

    OpResult deletePostData(long j);

    int getCount();

    int getCount(long j);

    void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    List<ResultRow> queryEvent(String str, String[] strArr, String str2, boolean z);

    List<ResultRow> queryEvent(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5);

    boolean removeEvent(EventBean eventBean);

    boolean removeEvent(List<EventBean> list);

    boolean removeEventById(Long l);

    boolean removeEventById(List<Long> list);

    OpResult writeEvent(EventBean eventBean);

    void writeEvent(List<EventBean> list);
}
