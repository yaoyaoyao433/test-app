package com.meituan.android.common.aidata.database;

import android.database.sqlite.SQLiteDatabase;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.cache.table.EventTableV2;
import com.meituan.android.common.aidata.cache.table.GestureTable;
import com.meituan.android.common.aidata.config.DBConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.concurrent.locks.Lock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBAIDataHelper extends DataBaseHelper {
    private static final String DB_NAME = "aidata";
    private static final int DB_VERSION = 11;
    private static final String TAG = "DBAIDataHelper";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DBAIDataHelper sInstance;

    public static DBAIDataHelper getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "974377a51d5a1eace4cbfa886db037af", RobustBitConfig.DEFAULT_VALUE)) {
            return (DBAIDataHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "974377a51d5a1eace4cbfa886db037af");
        }
        if (sInstance == null) {
            synchronized (DBAIDataHelper.class) {
                if (sInstance == null) {
                    sInstance = new DBAIDataHelper();
                }
            }
        }
        return sInstance;
    }

    public DBAIDataHelper() {
        super(AIData.getContext(), "aidata", 11);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01632faff8330ffcdcb54b170783b0c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01632faff8330ffcdcb54b170783b0c9");
        }
    }

    @Override // com.meituan.android.common.aidata.database.DataBaseHelper
    public void initTables(DataBaseHelper dataBaseHelper) {
        Object[] objArr = {dataBaseHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58dc4f0350d5288dd8646b47834a5982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58dc4f0350d5288dd8646b47834a5982");
            return;
        }
        addTable(EventTableV2.class, new EventTableV2(dataBaseHelper));
        addTable(GestureTable.class, new GestureTable(dataBaseHelper));
    }

    @Override // com.meituan.android.common.aidata.database.DataBaseHelper, android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d2b094673aabed5ba4b6200ea3c5dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d2b094673aabed5ba4b6200ea3c5dc7");
            return;
        }
        super.onCreate(sQLiteDatabase);
        createEventTable(sQLiteDatabase);
        createGestureTable(sQLiteDatabase);
    }

    private void createGestureTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95ade4dfc9a33f1db6531b397eeb80ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95ade4dfc9a33f1db6531b397eeb80ac");
            return;
        }
        GestureTable gestureTable = (GestureTable) getTable(GestureTable.class);
        if (gestureTable != null) {
            gestureTable.createTable(sQLiteDatabase);
        }
    }

    private void createEventTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aecda47bcc1859c40694f6496950a7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aecda47bcc1859c40694f6496950a7d0");
            return;
        }
        EventTableV2 eventTableV2 = (EventTableV2) getTable(EventTableV2.class);
        if (eventTableV2 != null) {
            eventTableV2.createTable(sQLiteDatabase);
        }
    }

    @Override // com.meituan.android.common.aidata.database.DataBaseHelper
    public void onUpgradeImpl(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19ba7bda83c8819f593bc107e06376c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19ba7bda83c8819f593bc107e06376c2");
            return;
        }
        super.onUpgradeImpl(sQLiteDatabase, i, i2);
        StringBuilder sb = new StringBuilder("update db from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46f87fdea76f6f6018e5811a833cfa7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46f87fdea76f6f6018e5811a833cfa7b");
            return;
        }
        super.onConfigure(sQLiteDatabase);
        boolean isAidataWalEnabled = DBConfig.getInstance().isAidataWalEnabled();
        StringBuilder sb = new StringBuilder("start to switch DB WAL Mode to ");
        sb.append(isAidataWalEnabled);
        sb.append(" when configuring db");
        switchDBWALMode(sQLiteDatabase, isAidataWalEnabled);
    }

    public void switchDBWALMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "681dd6b77222178864b525e80563607c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "681dd6b77222178864b525e80563607c");
            return;
        }
        new StringBuilder("start to switch DB WAL Mode to ").append(z);
        try {
            switchDBWALMode(getWritableDatabase(), z);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("switch DB WAL mode to ");
            sb.append(z);
            sb.append(" failed: ");
            sb.append(e);
        }
    }

    private void switchDBWALMode(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c467174c9f74f4387cf5401ec11c5366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c467174c9f74f4387cf5401ec11c5366");
        } else if (sQLiteDatabase == null) {
        } else {
            DBLocks.AIDATA_DB_RW_LOCK.writeLock().lock();
            try {
                try {
                    if (z) {
                        sQLiteDatabase.enableWriteAheadLogging();
                    } else {
                        sQLiteDatabase.disableWriteAheadLogging();
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("switch DB WAL mode to ");
                    sb.append(z);
                    sb.append(" failed: ");
                    sb.append(e);
                }
                DBLocks.AIDATA_DB_RW_LOCK.writeLock().unlock();
            } catch (Throwable th) {
                DBLocks.AIDATA_DB_RW_LOCK.writeLock().unlock();
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.support.annotation.Nullable
    public java.util.List<com.meituan.android.common.aidata.cache.result.ResultRow> query(java.lang.String r19, java.lang.String[] r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.database.DBAIDataHelper.query(java.lang.String, java.lang.String[], java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getAutoVacuumMode() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.aidata.database.DBAIDataHelper.changeQuickRedirect
            java.lang.String r10 = "c9b040e0fc8c1dd94604f533a3f6a88f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            java.lang.String r1 = "-1"
            com.meituan.android.common.aidata.cache.result.ResultSet r2 = new com.meituan.android.common.aidata.cache.result.ResultSet
            r2.<init>()
            java.util.concurrent.locks.ReadWriteLock r3 = com.meituan.android.common.aidata.database.DBLocks.AIDATA_DB_RW_LOCK
            java.util.concurrent.locks.Lock r3 = r3.readLock()
            r3.lock()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r6 = "PRAGMA auto_vacuum"
            android.database.Cursor r5 = r5.rawQuery(r6, r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r2.addRows(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            if (r5 == 0) goto L44
            boolean r4 = r5.isClosed()
            if (r4 != 0) goto L44
            r5.close()
        L44:
            r3.unlock()
            goto L69
        L48:
            r0 = move-exception
            r4 = r5
            goto L8f
        L4b:
            r4 = move-exception
            r11 = r5
            r5 = r4
            r4 = r11
            goto L53
        L50:
            r0 = move-exception
            goto L8f
        L52:
            r5 = move-exception
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "get auto-vacuum mode failed: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L50
            r6.append(r5)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L44
            boolean r5 = r4.isClosed()
            if (r5 != 0) goto L44
            r4.close()
            goto L44
        L69:
            java.util.List r2 = r2.getResultList()
            boolean r3 = com.meituan.android.common.aidata.utils.CollectionUtils.isEmpty(r2)
            if (r3 != 0) goto L8d
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L82
            com.meituan.android.common.aidata.cache.result.ResultRow r2 = (com.meituan.android.common.aidata.cache.result.ResultRow) r2     // Catch: java.lang.Exception -> L82
            com.meituan.android.common.aidata.cache.result.ResultColumnValue r0 = r2.getValueAtIndex(r0)     // Catch: java.lang.Exception -> L82
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L82
            goto L8e
        L82:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "get auto-vacuum mode from query result failed: "
            r2.<init>(r3)
            r2.append(r0)
        L8d:
            r0 = r1
        L8e:
            return r0
        L8f:
            if (r4 == 0) goto L9a
            boolean r1 = r4.isClosed()
            if (r1 != 0) goto L9a
            r4.close()
        L9a:
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.database.DBAIDataHelper.getAutoVacuumMode():java.lang.String");
    }

    public float getDBDiskSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81d63864558d1dbb5e8266e7ee168504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81d63864558d1dbb5e8266e7ee168504")).floatValue();
        }
        float f = -1.0f;
        Lock readLock = DBLocks.AIDATA_DB_RW_LOCK.readLock();
        readLock.lock();
        try {
            f = (((float) new File(getReadableDatabase().getPath()).length()) / 1024.0f) / 1024.0f;
        } catch (Exception unused) {
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
        readLock.unlock();
        return f;
    }
}
