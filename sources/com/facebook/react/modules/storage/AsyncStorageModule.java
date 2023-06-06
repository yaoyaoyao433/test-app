package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = AsyncStorageModule.NAME)
/* loaded from: classes.dex */
public final class AsyncStorageModule extends ReactContextBaseJavaModule {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final a executor;
    private c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    @Override // com.facebook.react.bridge.NativeModule
    public final String getName() {
        return NAME;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements Executor {
        private final ArrayDeque<Runnable> b = new ArrayDeque<>();
        private Runnable c;
        private final Executor d;

        a(Executor executor) {
            this.d = executor;
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(final Runnable runnable) {
            this.b.offer(new Runnable() { // from class: com.facebook.react.modules.storage.AsyncStorageModule.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }

        final synchronized void a() {
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                this.d.execute(this.c);
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, com.sankuai.android.jarvis.c.a());
    }

    @VisibleForTesting
    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new a(executor);
        this.mReactDatabaseSupplier = c.a(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public final void clearSensitiveData() {
        this.mReactDatabaseSupplier.c();
    }

    @ReactMethod
    public final void multiGet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray == null) {
            callback.invoke(b.a(null, "Invalid key"), null);
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.1
                /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[LOOP:3: B:21:0x00c2->B:23:0x00c8, LOOP_END] */
                @Override // com.facebook.react.bridge.GuardedAsyncTask
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void doInBackgroundGuarded(java.lang.Void[] r20) {
                    /*
                        Method dump skipped, instructions count: 281
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.AnonymousClass1.doInBackgroundGuarded(java.lang.Object[]):void");
                }
            }, this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public final void multiSet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(b.a(null, "Invalid key"));
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.2
                @Override // com.facebook.react.bridge.GuardedAsyncTask
                public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                    WritableMap writableMap = null;
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        callback.invoke(b.a(null, "Database Error"));
                        return;
                    }
                    SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.b().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                    try {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().beginTransaction();
                            for (int i = 0; i < readableArray.size(); i++) {
                                if (readableArray.getArray(i).size() != 2) {
                                    WritableMap a2 = b.a(null, "Invalid Value");
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e) {
                                        com.facebook.common.logging.a.c("ReactNative", e.getMessage(), e);
                                        if (a2 == null) {
                                            b.a(null, e.getMessage());
                                            return;
                                        }
                                        return;
                                    }
                                } else if (readableArray.getArray(i).getString(0) == null) {
                                    WritableMap a3 = b.a(null, "Invalid key");
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e2) {
                                        com.facebook.common.logging.a.c("ReactNative", e2.getMessage(), e2);
                                        if (a3 == null) {
                                            b.a(null, e2.getMessage());
                                            return;
                                        }
                                        return;
                                    }
                                } else if (readableArray.getArray(i).getString(1) == null) {
                                    WritableMap a4 = b.a(null, "Invalid Value");
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e3) {
                                        com.facebook.common.logging.a.c("ReactNative", e3.getMessage(), e3);
                                        if (a4 == null) {
                                            b.a(null, e3.getMessage());
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    compileStatement.clearBindings();
                                    compileStatement.bindString(1, readableArray.getArray(i).getString(0));
                                    compileStatement.bindString(2, readableArray.getArray(i).getString(1));
                                    compileStatement.execute();
                                }
                            }
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().setTransactionSuccessful();
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                            } catch (Exception e4) {
                                com.facebook.common.logging.a.c("ReactNative", e4.getMessage(), e4);
                                writableMap = b.a(null, e4.getMessage());
                            }
                        } catch (Throwable th) {
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                            } catch (Exception e5) {
                                com.facebook.common.logging.a.c("ReactNative", e5.getMessage(), e5);
                                b.a(null, e5.getMessage());
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        com.facebook.common.logging.a.c("ReactNative", e6.getMessage(), e6);
                        WritableMap a5 = b.a(null, e6.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e7) {
                            com.facebook.common.logging.a.c("ReactNative", e7.getMessage(), e7);
                            if (a5 == null) {
                                a5 = b.a(null, e7.getMessage());
                            }
                        }
                        writableMap = a5;
                    }
                    if (writableMap != null) {
                        callback.invoke(writableMap);
                    } else {
                        callback.invoke(new Object[0]);
                    }
                }
            }, this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public final void multiRemove(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(b.a(null, "Invalid key"));
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.3
                @Override // com.facebook.react.bridge.GuardedAsyncTask
                public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                    WritableMap writableMap = null;
                    if (AsyncStorageModule.this.ensureDatabase()) {
                        try {
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().beginTransaction();
                                for (int i = 0; i < readableArray.size(); i += 999) {
                                    int min = Math.min(readableArray.size() - i, 999);
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().delete("catalystLocalStorage", com.facebook.react.modules.storage.a.a(min), com.facebook.react.modules.storage.a.a(readableArray, i, min));
                                }
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().setTransactionSuccessful();
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                } catch (Exception e) {
                                    com.facebook.common.logging.a.c("ReactNative", e.getMessage(), e);
                                    writableMap = b.a(null, e.getMessage());
                                }
                            } catch (Exception e2) {
                                com.facebook.common.logging.a.c("ReactNative", e2.getMessage(), e2);
                                WritableMap a2 = b.a(null, e2.getMessage());
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                } catch (Exception e3) {
                                    com.facebook.common.logging.a.c("ReactNative", e3.getMessage(), e3);
                                    if (a2 == null) {
                                        a2 = b.a(null, e3.getMessage());
                                    }
                                }
                                writableMap = a2;
                            }
                            if (writableMap != null) {
                                callback.invoke(writableMap);
                                return;
                            } else {
                                callback.invoke(new Object[0]);
                                return;
                            }
                        } catch (Throwable th) {
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                            } catch (Exception e4) {
                                com.facebook.common.logging.a.c("ReactNative", e4.getMessage(), e4);
                                b.a(null, e4.getMessage());
                            }
                            throw th;
                        }
                    }
                    callback.invoke(b.a(null, "Database Error"));
                }
            }, this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public final void multiMerge(final ReadableArray readableArray, final Callback callback) {
        com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                WritableMap writableMap = null;
                try {
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        callback.invoke(b.a(null, "Database Error"));
                        return;
                    }
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.b().beginTransaction();
                        for (int i = 0; i < readableArray.size(); i++) {
                            if (readableArray.getArray(i).size() != 2) {
                                WritableMap a2 = b.a(null, "Invalid Value");
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e) {
                                    com.facebook.common.logging.a.c("ReactNative", e.getMessage(), e);
                                    if (a2 == null) {
                                        b.a(null, e.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (readableArray.getArray(i).getString(0) == null) {
                                WritableMap a3 = b.a(null, "Invalid key");
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e2) {
                                    com.facebook.common.logging.a.c("ReactNative", e2.getMessage(), e2);
                                    if (a3 == null) {
                                        b.a(null, e2.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (readableArray.getArray(i).getString(1) == null) {
                                WritableMap a4 = b.a(null, "Invalid Value");
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e3) {
                                    com.facebook.common.logging.a.c("ReactNative", e3.getMessage(), e3);
                                    if (a4 == null) {
                                        b.a(null, e3.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                SQLiteDatabase b = AsyncStorageModule.this.mReactDatabaseSupplier.b();
                                String string = readableArray.getArray(i).getString(0);
                                String string2 = readableArray.getArray(i).getString(1);
                                String a5 = com.facebook.react.modules.storage.a.a(b, string);
                                if (a5 != null) {
                                    JSONObject jSONObject = new JSONObject(a5);
                                    com.facebook.react.modules.storage.a.a(jSONObject, new JSONObject(string2));
                                    string2 = jSONObject.toString();
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("key", string);
                                contentValues.put("value", string2);
                                if (!(-1 != b.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5))) {
                                    WritableMap a6 = b.a(null, "Database Error");
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e4) {
                                        com.facebook.common.logging.a.c("ReactNative", e4.getMessage(), e4);
                                        if (a6 == null) {
                                            b.a(null, e4.getMessage());
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.b().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e5) {
                            com.facebook.common.logging.a.c("ReactNative", e5.getMessage(), e5);
                            writableMap = b.a(null, e5.getMessage());
                        }
                    } catch (Exception e6) {
                        com.facebook.common.logging.a.c("ReactNative", e6.getMessage(), e6);
                        WritableMap a7 = b.a(null, e6.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e7) {
                            com.facebook.common.logging.a.c("ReactNative", e7.getMessage(), e7);
                            if (a7 == null) {
                                a7 = b.a(null, e7.getMessage());
                            }
                        }
                        writableMap = a7;
                    }
                    if (writableMap != null) {
                        callback.invoke(writableMap);
                    } else {
                        callback.invoke(new Object[0]);
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                    } catch (Exception e8) {
                        com.facebook.common.logging.a.c("ReactNative", e8.getMessage(), e8);
                        b.a(null, e8.getMessage());
                    }
                    throw th;
                }
            }
        }, this.executor, new Void[0]);
    }

    @ReactMethod
    public final void clear(final Callback callback) {
        com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.5
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d();
                    callback.invoke(new Object[0]);
                } catch (Exception e) {
                    com.facebook.common.logging.a.c("ReactNative", e.getMessage(), e);
                    callback.invoke(b.a(null, e.getMessage()));
                }
            }
        }, this.executor, new Void[0]);
    }

    @ReactMethod
    public final void getAllKeys(final Callback callback) {
        com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.6
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(b.a(null, "Database Error"), null);
                    return;
                }
                WritableArray createArray = Arguments.createArray();
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.b().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
                try {
                    try {
                        if (query.moveToFirst()) {
                            do {
                                createArray.pushString(query.getString(0));
                            } while (query.moveToNext());
                            query.close();
                            callback.invoke(null, createArray);
                        }
                        query.close();
                        callback.invoke(null, createArray);
                    } catch (Exception e) {
                        com.facebook.common.logging.a.c("ReactNative", e.getMessage(), e);
                        callback.invoke(b.a(null, e.getMessage()), null);
                        query.close();
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        }, this.executor, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        if (this.mShuttingDown) {
            return false;
        }
        this.mReactDatabaseSupplier.a();
        return true;
    }
}
