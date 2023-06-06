package com.dianping.shield.debug;

import android.content.Context;
import android.database.Cursor;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class PerformanceManager {
    private static final String COMMA_SEP = ",";
    private static final String DB_FILE = "section-performance.db";
    private static final int DB_VERSION = 1;
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String PRIMARY_KEY = " PRIMARY KEY";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIME_TYPE = " DATETIME";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public void clearData() {
    }

    @Deprecated
    public void clearData(String str) {
    }

    @Deprecated
    public Cursor findPages() {
        return null;
    }

    @Deprecated
    public long insertPerformanceRecord(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2) {
        return 0L;
    }

    @Deprecated
    public void insertRecord(String str, c cVar, String str2, long j, long j2) {
    }

    @Deprecated
    public Cursor searchPage(String str) {
        return null;
    }

    public PerformanceManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2e15cdd8b3e1498a356f42e6cbc6a85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2e15cdd8b3e1498a356f42e6cbc6a85");
        }
    }
}
