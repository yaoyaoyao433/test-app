package com.meituan.android.common.aidata.feature.optimize.cep;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.cep.rule.cep.CepDataConvertor;
import com.meituan.android.common.aidata.data.EventBean;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBCEPSubTableDataHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "db_cep_sub_tables";
    private static final int DB_VERSION = 1;
    private static final String TAG = "DBCEPSubTable";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DBCEPSubTableDataHelper sInstance;
    private static final Lock sRLock;
    @NonNull
    private static final ReadWriteLock sRWLock;
    private static final Lock sWLock;
    @NonNull
    private final Map<String, CEPSubTable> mCreatedCepSubTableMap;
    @NonNull
    private final CEPSubTable mTriggerSubTable;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        sRWLock = reentrantReadWriteLock;
        sRLock = reentrantReadWriteLock.readLock();
        sWLock = sRWLock.writeLock();
    }

    public static DBCEPSubTableDataHelper getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42bb49775d9b119a99cc7cadcc16528c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DBCEPSubTableDataHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42bb49775d9b119a99cc7cadcc16528c");
        }
        if (sInstance == null) {
            synchronized (DBCEPSubTableDataHelper.class) {
                if (sInstance == null) {
                    sInstance = new DBCEPSubTableDataHelper();
                }
            }
        }
        return sInstance;
    }

    public boolean createTable(@NonNull FeatureBean featureBean, String str, List<String> list) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {featureBean, str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17389640f6dc94d91cf7f644f6c053f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17389640f6dc94d91cf7f644f6c053f8")).booleanValue();
        }
        String str2 = featureBean.feature;
        StringBuilder sb = new StringBuilder("start create table ");
        sb.append(str);
        sb.append(" for feature ");
        sb.append(str2);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        BlueException blueException = null;
        CEPSubTable cEPSubTable = new CEPSubTable(str, list);
        sWLock.lock();
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                CEPSubTable cEPSubTable2 = this.mCreatedCepSubTableMap.get(str2);
                if (cEPSubTable2 != null) {
                    cEPSubTable2.dropTable(writableDatabase);
                }
                z = cEPSubTable.createTable(writableDatabase);
                if (z) {
                    try {
                        this.mCreatedCepSubTableMap.put(str2, cEPSubTable);
                    } catch (Exception e) {
                        z2 = z;
                        e = e;
                        blueException = new BlueException(e.getMessage());
                        sWLock.unlock();
                        z = z2;
                        RaptorUploaderImpl.reportSubTableCreate(featureBean, SystemClock.elapsedRealtime() - elapsedRealtime, blueException);
                        return z;
                    }
                }
            } finally {
                sWLock.unlock();
            }
        } catch (Exception e2) {
            e = e2;
        }
        RaptorUploaderImpl.reportSubTableCreate(featureBean, SystemClock.elapsedRealtime() - elapsedRealtime, blueException);
        return z;
    }

    public void dropTable(@NonNull FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "727bc2b3065c2fea1712b9ec84e5833a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "727bc2b3065c2fea1712b9ec84e5833a");
            return;
        }
        String str = featureBean.feature;
        new StringBuilder("start drop table for feature ").append(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        BlueException blueException = null;
        sWLock.lock();
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                CEPSubTable cEPSubTable = this.mCreatedCepSubTableMap.get(str);
                if (cEPSubTable != null) {
                    cEPSubTable.dropTable(writableDatabase);
                    this.mCreatedCepSubTableMap.remove(str);
                }
            } catch (Exception e) {
                blueException = new BlueException(e.getMessage());
            }
            sWLock.unlock();
            RaptorUploaderImpl.reportSubTableDelete(featureBean, SystemClock.elapsedRealtime() - elapsedRealtime, blueException);
        } catch (Throwable th) {
            sWLock.unlock();
            throw th;
        }
    }

    public void insertData(String str, StreamData streamData) {
        Object[] objArr = {str, streamData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c27da409cf92b8abc7c16e6573834ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c27da409cf92b8abc7c16e6573834ba1");
            return;
        }
        new StringBuilder("start insert data for feature ").append(str);
        if (TextUtils.isEmpty(str) || streamData == null) {
            return;
        }
        sWLock.lock();
        try {
            CEPSubTable cEPSubTable = this.mCreatedCepSubTableMap.get(str);
            if (cEPSubTable != null) {
                cEPSubTable.insertData(getWritableDatabase(), streamData);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            sWLock.unlock();
            throw th;
        }
        sWLock.unlock();
    }

    public void updateExposeEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65044fc8e06863ec230607876b5f9a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65044fc8e06863ec230607876b5f9a41");
        } else if (eventBean != null) {
            sWLock.lock();
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                for (CEPSubTable cEPSubTable : this.mCreatedCepSubTableMap.values()) {
                    cEPSubTable.updateExposeEvent(writableDatabase, eventBean);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                sWLock.unlock();
                throw th;
            }
            sWLock.unlock();
        }
    }

    public void updateTriggerEvent(@NonNull EventData eventData) {
        Object[] objArr = {eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f99f8e517d8a06f78018ca1da620f1c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f99f8e517d8a06f78018ca1da620f1c0");
            return;
        }
        sWLock.lock();
        try {
            if (!this.mCreatedCepSubTableMap.isEmpty()) {
                this.mTriggerSubTable.insertData(getWritableDatabase(), CepDataConvertor.convertToStreamData(eventData));
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            sWLock.unlock();
            throw th;
        }
        sWLock.unlock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r12.isClosed() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r12.isClosed() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.meituan.android.common.aidata.cache.result.ResultRow> query(java.lang.String r12, java.lang.String[] r13, @android.support.annotation.Nullable java.lang.String r14, boolean r15) {
        /*
            r11 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper.changeQuickRedirect
            java.lang.String r10 = "5cd0b61b3469b74b38c88af96d8662b6"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2b
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.util.List r12 = (java.util.List) r12
            return r12
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start query for "
            r0.<init>(r1)
            r0.append(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 == 0) goto L3e
            return r1
        L3e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            com.meituan.android.common.aidata.cache.result.ResultSet r0 = new com.meituan.android.common.aidata.cache.result.ResultSet
            r0.<init>()
            java.util.concurrent.locks.Lock r4 = com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper.sRLock
            r4.lock()
            android.database.sqlite.SQLiteDatabase r4 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            android.database.Cursor r12 = r4.rawQuery(r12, r13)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7a
            if (r12 == 0) goto L62
            int r13 = r12.getCount()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> La5
            if (r13 <= 0) goto L62
            r0.addRows(r12)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> La5
            goto L62
        L60:
            r13 = move-exception
            goto L7c
        L62:
            if (r12 == 0) goto L6d
            boolean r13 = r12.isClosed()
            if (r13 != 0) goto L6d
        L6a:
            r12.close()
        L6d:
            java.util.List r12 = r0.getResultList()
            java.util.concurrent.locks.Lock r13 = com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper.sRLock
            r13.unlock()
            goto L9a
        L77:
            r13 = move-exception
            r12 = r1
            goto La6
        L7a:
            r13 = move-exception
            r12 = r1
        L7c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = " - query failed:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La5
            r4.append(r13)     // Catch: java.lang.Throwable -> La5
            if (r15 == 0) goto L91
            com.meituan.android.common.aidata.raptoruploader.BlueException r1 = new com.meituan.android.common.aidata.raptoruploader.BlueException     // Catch: java.lang.Throwable -> La5
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> La5
            r1.<init>(r13)     // Catch: java.lang.Throwable -> La5
        L91:
            if (r12 == 0) goto L6d
            boolean r13 = r12.isClosed()
            if (r13 != 0) goto L6d
            goto L6a
        L9a:
            if (r15 == 0) goto La4
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl.reportSubTableQuery(r14, r4, r1)
        La4:
            return r12
        La5:
            r13 = move-exception
        La6:
            if (r12 == 0) goto Lb1
            boolean r14 = r12.isClosed()
            if (r14 != 0) goto Lb1
            r12.close()
        Lb1:
            r0.getResultList()
            java.util.concurrent.locks.Lock r12 = com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper.sRLock
            r12.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper.query(java.lang.String, java.lang.String[], java.lang.String, boolean):java.util.List");
    }

    public boolean isSubTableCreated(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36cec9f066ceb6d019c290c870157474", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36cec9f066ceb6d019c290c870157474")).booleanValue();
        }
        StringBuilder sb = new StringBuilder("check table ");
        sb.append(str);
        sb.append(" created or not");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        sRLock.lock();
        Iterator<CEPSubTable> it = this.mCreatedCepSubTableMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (str.equalsIgnoreCase(it.next().getTableName())) {
                break;
            }
        }
        sRLock.unlock();
        return z;
    }

    private void deleteOldDB() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cda0bf002787a860b46b95e32555440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cda0bf002787a860b46b95e32555440");
            return;
        }
        sWLock.lock();
        try {
            try {
                new StringBuilder("delete database db_cep_sub_tables success: ").append(AIData.getContext().deleteDatabase(DB_NAME));
            } catch (Exception e) {
                new StringBuilder("delete database db_cep_sub_tables failed: ").append(e);
            }
        } finally {
            sWLock.unlock();
        }
    }

    public DBCEPSubTableDataHelper() {
        super(AIData.getContext(), DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "856f0092fc2c3124e306f134900055de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "856f0092fc2c3124e306f134900055de");
            return;
        }
        this.mCreatedCepSubTableMap = new HashMap();
        this.mTriggerSubTable = new CEPSubTable(CEPSubTable.TABLE_NAME_TRIGGER_TABLE);
        deleteOldDB();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14e432d7d4458b8bdcf86122cb5667b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14e432d7d4458b8bdcf86122cb5667b4");
            return;
        }
        try {
            this.mTriggerSubTable.createTable(sQLiteDatabase);
        } catch (Exception e) {
            new StringBuilder("create trigger subTable failed: ").append(e);
        }
    }
}
