package com.meituan.android.common.sniffer.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.gson.Gson;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.ProcessLock;
import com.meituan.android.common.sniffer.bean.SnifferLogEntity;
import com.meituan.android.common.sniffer.report.SnifferExReport;
import com.meituan.android.common.sniffer.util.GsonUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SnifferDBHandler {
    private SnifferDBHelper dbHelper;
    private Gson gson = GsonUtil.getGson();
    private Context mContext;

    public SnifferDBHandler(Context context) {
        this.dbHelper = new SnifferDBHelper(context);
        this.mContext = context;
    }

    public void cache(String str, Log.Builder builder, long j) {
        ProcessLock lock;
        long j2;
        ProcessLock processLock = null;
        try {
            try {
                lock = ProcessLock.lock(this.mContext, ProcessLock.LOCK_SNIFFER);
                if (j <= 0) {
                    j = 1;
                }
                j2 = j;
            } catch (IOException e) {
                Logger.getBabelLogger().e(e.getMessage(), e);
                return;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Log.Builder query = query(str);
            if (query == null) {
                insert(str, builder);
            } else {
                query.reduce(new Log.ValueStrategy() { // from class: com.meituan.android.common.sniffer.db.SnifferDBHandler.1
                    @Override // com.meituan.android.common.kitefly.Log.ValueStrategy
                    public Long calculate(Long l, Long l2) {
                        return Long.valueOf(l.longValue() + l2.longValue());
                    }
                }, j2, 0L);
                update(str, this.gson.toJson(query));
            }
            if (lock != null) {
                lock.close();
            }
        } catch (Throwable th2) {
            th = th2;
            processLock = lock;
            try {
                Logger.getBabelLogger().e(th.getMessage(), th);
                if (processLock != null) {
                    processLock.close();
                }
            } catch (Throwable th3) {
                ProcessLock processLock2 = processLock;
                if (processLock2 != null) {
                    try {
                        processLock2.close();
                    } catch (IOException e2) {
                        Logger.getBabelLogger().e(e2.getMessage(), e2);
                    }
                }
                throw th3;
            }
        }
    }

    public void cacheBatch(List<SnifferLogEntity> list) {
        ProcessLock processLock = null;
        try {
            try {
                ProcessLock lock = ProcessLock.lock(this.mContext, ProcessLock.LOCK_SNIFFER);
                try {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (SnifferLogEntity snifferLogEntity : list) {
                        Log.Builder query = query(snifferLogEntity.md5);
                        snifferLogEntity.weight = snifferLogEntity.weight <= 0 ? 1L : snifferLogEntity.weight;
                        if (query == null) {
                            if (hashMap.containsKey(snifferLogEntity.md5)) {
                                hashMap.get(snifferLogEntity.md5).logData.reduce(new Log.ValueStrategy() { // from class: com.meituan.android.common.sniffer.db.SnifferDBHandler.2
                                    @Override // com.meituan.android.common.kitefly.Log.ValueStrategy
                                    public Long calculate(Long l, Long l2) {
                                        return Long.valueOf(l.longValue() + l2.longValue());
                                    }
                                }, 1L, 0L);
                            } else {
                                hashMap.put(snifferLogEntity.md5, snifferLogEntity);
                            }
                        } else {
                            query.reduce(new Log.ValueStrategy() { // from class: com.meituan.android.common.sniffer.db.SnifferDBHandler.3
                                @Override // com.meituan.android.common.kitefly.Log.ValueStrategy
                                public Long calculate(Long l, Long l2) {
                                    return Long.valueOf(l.longValue() + l2.longValue());
                                }
                            }, snifferLogEntity.weight, 0L);
                            snifferLogEntity.logData = query;
                            arrayList.add(snifferLogEntity);
                        }
                    }
                    insertBatch(hashMap);
                    updateBatch(arrayList);
                    if (lock != null) {
                        lock.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    processLock = lock;
                    try {
                        Logger.getBabelLogger().e(th.getMessage(), th);
                        if (processLock != null) {
                            processLock.close();
                        }
                    } catch (Throwable th2) {
                        ProcessLock processLock2 = processLock;
                        if (processLock2 != null) {
                            try {
                                processLock2.close();
                            } catch (IOException e) {
                                Logger.getBabelLogger().e(e.getMessage(), e);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Logger.getBabelLogger().e(e2.getMessage(), e2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void insert(String str, Log.Builder builder) {
        try {
            SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
            if (writableDatabase == null) {
                SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_FAILED, "insert", "insert db null.");
                return;
            }
            String json = this.gson.toJson(builder);
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put(SnifferDBHelper.COLUMN_LOG, json);
            if (writableDatabase.insert(SnifferDBHelper.TABLE_NAME, null, contentValues) < 0) {
                SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_FAILED, "insert", "insert data failed.");
            }
        } catch (Throwable unused) {
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
    private void insertBatch(java.util.Map<java.lang.String, com.meituan.android.common.sniffer.bean.SnifferLogEntity> r7) {
        /*
            r6 = this;
            r0 = 0
            com.meituan.android.common.sniffer.db.SnifferDBHelper r1 = r6.dbHelper     // Catch: java.lang.Throwable -> L82
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L1d
            java.lang.String r7 = "sniffer_failed"
            java.lang.String r0 = "insert"
            java.lang.String r2 = "insert db null."
            com.meituan.android.common.sniffer.report.SnifferExReport.reportErrorLog(r7, r0, r2)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L1a
            r1.endTransaction()
        L1a:
            return
        L1b:
            r7 = move-exception
            goto L7c
        L1d:
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L78
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L78
        L28:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L78
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L78
            com.meituan.android.common.sniffer.bean.SnifferLogEntity r2 = (com.meituan.android.common.sniffer.bean.SnifferLogEntity) r2     // Catch: java.lang.Throwable -> L78
            com.google.gson.Gson r3 = r6.gson     // Catch: java.lang.Throwable -> L78
            com.meituan.android.common.kitefly.Log$Builder r4 = r2.logData     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = r3.toJson(r4)     // Catch: java.lang.Throwable -> L78
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L78
            r4.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = "key"
            java.lang.String r2 = r2.md5     // Catch: java.lang.Throwable -> L78
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "log"
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "sniffer_log"
            long r2 = r1.insert(r2, r0, r4)     // Catch: java.lang.Throwable -> L78
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L28
            java.lang.String r2 = "sniffer_failed"
            java.lang.String r3 = "insert"
            java.lang.String r4 = "insert data failed."
            com.meituan.android.common.sniffer.report.SnifferExReport.reportErrorLog(r2, r3, r4)     // Catch: java.lang.Throwable -> L78
            goto L28
        L6f:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L88
            r1.endTransaction()
            return
        L78:
            r0 = r1
            goto L82
        L7a:
            r7 = move-exception
            r1 = r0
        L7c:
            if (r1 == 0) goto L81
            r1.endTransaction()
        L81:
            throw r7
        L82:
            if (r0 == 0) goto L88
            r0.endTransaction()
            return
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.sniffer.db.SnifferDBHandler.insertBatch(java.util.Map):void");
    }

    private void update(String str, String str2) {
        try {
            SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
            if (writableDatabase == null) {
                SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_FAILED, "update", "update db null.");
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put(SnifferDBHelper.COLUMN_LOG, str2);
            if (writableDatabase.update(SnifferDBHelper.TABLE_NAME, contentValues, "key =? ", new String[]{str}) < 0) {
                SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_FAILED, "update", "update data failed.");
            }
        } catch (Throwable unused) {
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
    private void updateBatch(java.util.List<com.meituan.android.common.sniffer.bean.SnifferLogEntity> r7) {
        /*
            r6 = this;
            r0 = 0
            com.meituan.android.common.sniffer.db.SnifferDBHelper r1 = r6.dbHelper     // Catch: java.lang.Throwable -> L7f
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L7f
            if (r1 != 0) goto L1d
            java.lang.String r7 = "sniffer_failed"
            java.lang.String r0 = "update"
            java.lang.String r2 = "update db null."
            com.meituan.android.common.sniffer.report.SnifferExReport.reportErrorLog(r7, r0, r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L1a
            r1.endTransaction()
        L1a:
            return
        L1b:
            r7 = move-exception
            goto L79
        L1d:
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L75
        L24:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L75
            com.meituan.android.common.sniffer.bean.SnifferLogEntity r0 = (com.meituan.android.common.sniffer.bean.SnifferLogEntity) r0     // Catch: java.lang.Throwable -> L75
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L75
            r2.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "key"
            java.lang.String r4 = r0.md5     // Catch: java.lang.Throwable -> L75
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L75
            com.google.gson.Gson r3 = r6.gson     // Catch: java.lang.Throwable -> L75
            com.meituan.android.common.kitefly.Log$Builder r4 = r0.logData     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r3.toJson(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "log"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "key =? "
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L75
            r5 = 0
            java.lang.String r0 = r0.md5     // Catch: java.lang.Throwable -> L75
            r4[r5] = r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "sniffer_log"
            int r0 = r1.update(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L75
            if (r0 >= 0) goto L24
            java.lang.String r0 = "sniffer_failed"
            java.lang.String r2 = "update"
            java.lang.String r3 = "update data failed."
            com.meituan.android.common.sniffer.report.SnifferExReport.reportErrorLog(r0, r2, r3)     // Catch: java.lang.Throwable -> L75
            goto L24
        L6c:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L85
            r1.endTransaction()
            return
        L75:
            r0 = r1
            goto L7f
        L77:
            r7 = move-exception
            r1 = r0
        L79:
            if (r1 == 0) goto L7e
            r1.endTransaction()
        L7e:
            throw r7
        L7f:
            if (r0 == 0) goto L85
            r0.endTransaction()
            return
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.sniffer.db.SnifferDBHandler.updateBatch(java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private com.meituan.android.common.kitefly.Log.Builder query(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            com.meituan.android.common.sniffer.db.SnifferDBHelper r1 = r11.dbHelper     // Catch: java.lang.Throwable -> L74
            android.database.sqlite.SQLiteDatabase r2 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L74
            if (r2 != 0) goto L16
            java.lang.String r12 = "sniffer_failed"
            java.lang.String r1 = "query"
            java.lang.String r2 = "query db null."
            com.meituan.android.common.sniffer.report.SnifferExReport.reportErrorLog(r12, r1, r2)     // Catch: java.lang.Throwable -> L74
            return r0
        L16:
            java.lang.String r5 = "key =? "
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L74
            r1 = 0
            r6[r1] = r12     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "sniffer_log"
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L74
            if (r12 != 0) goto L32
            if (r12 == 0) goto L31
            r12.close()
        L31:
            return r0
        L32:
            int r1 = r12.getCount()     // Catch: java.lang.Throwable -> L6d
            if (r1 <= 0) goto L4b
            r1 = r0
        L39:
            boolean r2 = r12.moveToNext()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4c
            java.lang.String r1 = "log"
            int r1 = r12.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r12.getString(r1)     // Catch: java.lang.Throwable -> L6d
            goto L39
        L4b:
            r1 = r0
        L4c:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L62
            com.google.gson.Gson r2 = r11.gson     // Catch: java.lang.Throwable -> L6d
            java.lang.Class<com.meituan.android.common.kitefly.Log$Builder> r3 = com.meituan.android.common.kitefly.Log.Builder.class
            java.lang.Object r1 = r2.fromJson(r1, r3)     // Catch: java.lang.Throwable -> L6d
            com.meituan.android.common.kitefly.Log$Builder r1 = (com.meituan.android.common.kitefly.Log.Builder) r1     // Catch: java.lang.Throwable -> L6d
            if (r12 == 0) goto L61
            r12.close()
        L61:
            return r1
        L62:
            if (r12 == 0) goto L7e
            r12.close()
            goto L7e
        L68:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L81
        L6d:
            r1 = move-exception
            r10 = r1
            r1 = r12
            r12 = r10
            goto L76
        L72:
            r12 = move-exception
            goto L81
        L74:
            r12 = move-exception
            r1 = r0
        L76:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L7e
            r1.close()
        L7e:
            return r0
        L7f:
            r12 = move-exception
            r0 = r1
        L81:
            if (r0 == 0) goto L86
            r0.close()
        L86:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.sniffer.db.SnifferDBHandler.query(java.lang.String):com.meituan.android.common.kitefly.Log$Builder");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized java.util.List<com.meituan.android.common.kitefly.Log> queryAll() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.sniffer.db.SnifferDBHandler.queryAll():java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized void deleteAll() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            android.content.Context r1 = r5.mContext     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "sniffer.lock"
            com.meituan.android.common.metricx.utils.ProcessLock r1 = com.meituan.android.common.metricx.utils.ProcessLock.lock(r1, r2)     // Catch: java.lang.Throwable -> L69
            com.meituan.android.common.sniffer.db.SnifferDBHelper r2 = r5.dbHelper     // Catch: java.lang.Throwable -> L50
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L33
            java.lang.String r0 = "sniffer_failed"
            java.lang.String r2 = "deleteAll"
            java.lang.String r3 = "query db null."
            com.meituan.android.common.sniffer.report.SnifferExReport.reportErrorLog(r0, r2, r3)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L70
            monitor-exit(r5)
            return
        L25:
            r0 = move-exception
            com.meituan.android.common.metricx.utils.ILogger r1 = com.meituan.android.common.metricx.utils.Logger.getBabelLogger()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L70
            r1.e(r2, r0)     // Catch: java.lang.Throwable -> L70
        L31:
            monitor-exit(r5)
            return
        L33:
            java.lang.String r3 = "sniffer_log"
            r2.delete(r3, r0, r0)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L82
            r1.close()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L70
            monitor-exit(r5)
            return
        L40:
            r0 = move-exception
            com.meituan.android.common.metricx.utils.ILogger r1 = com.meituan.android.common.metricx.utils.Logger.getBabelLogger()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L70
            r1.e(r2, r0)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)
            return
        L4e:
            r0 = move-exception
            goto L56
        L50:
            r0 = r1
            goto L69
        L52:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L56:
            if (r1 == 0) goto L68
            r1.close()     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L70
            goto L68
        L5c:
            r1 = move-exception
            com.meituan.android.common.metricx.utils.ILogger r2 = com.meituan.android.common.metricx.utils.Logger.getBabelLogger()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L70
            r2.e(r3, r1)     // Catch: java.lang.Throwable -> L70
        L68:
            throw r0     // Catch: java.lang.Throwable -> L70
        L69:
            if (r0 == 0) goto L82
            r0.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            monitor-exit(r5)
            return
        L70:
            r0 = move-exception
            goto L80
        L72:
            r0 = move-exception
            com.meituan.android.common.metricx.utils.ILogger r1 = com.meituan.android.common.metricx.utils.Logger.getBabelLogger()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L70
            r1.e(r2, r0)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)
            return
        L80:
            monitor-exit(r5)
            throw r0
        L82:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.sniffer.db.SnifferDBHandler.deleteAll():void");
    }
}
