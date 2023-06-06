package com.sankuai.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JsonStorage {
    private static final HashMap<String, FileEditor> EDIT_CACHE_MAP = new HashMap<>();
    private static final String JSON_STORAGE_DIR = "JsonStorage";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Callback {
        void onJsonLoaded(String str);

        void onJsonSaved(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File getJsonStorageFile(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9903e8bdffbde7e39124c352def5de6c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9903e8bdffbde7e39124c352def5de6c") : new File(q.a(context, Utils.CHANNEL, JSON_STORAGE_DIR), str);
    }

    public static void loadJsonAsync(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05ea5820cb839e15e4387b67cb527e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05ea5820cb839e15e4387b67cb527e4e");
        } else {
            loadJsonAsync(context, str, null);
        }
    }

    public static void loadJsonAsync(Context context, String str, Callback callback) {
        Object[] objArr = {context, str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bda0e3ad4c4148f5881d52b3254d10be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bda0e3ad4c4148f5881d52b3254d10be");
        } else if (context != null && !TextUtils.isEmpty(str)) {
            getEditor(context, str).loadAsync(callback);
        } else if (callback != null) {
            callback.onJsonSaved(false);
        }
    }

    public static String loadJsonSync(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aedd296b24bd28ae708623f381b30f0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aedd296b24bd28ae708623f381b30f0d");
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return getEditor(context, str).loadSync();
    }

    public static void saveJsonAsync(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d1bacbdd87327dd35be9da04643a5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d1bacbdd87327dd35be9da04643a5a2");
        } else {
            saveJsonAsync(context, str, str2, null);
        }
    }

    public static void saveJsonAsync(Context context, String str, String str2, Callback callback) {
        Object[] objArr = {context, str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c551195a2197168c8a53831951de9fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c551195a2197168c8a53831951de9fdc");
        } else if (context != null && !TextUtils.isEmpty(str)) {
            getEditor(context, str).saveAsync(str2, callback);
        } else if (callback != null) {
            callback.onJsonSaved(false);
        }
    }

    public static boolean saveJsonSync(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa968926e5a43cb64491075ba5980163", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa968926e5a43cb64491075ba5980163")).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return getEditor(context, str).saveSync(str2);
    }

    public static void removeJsonAsync(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54d0ebb27300d19ac9392a3f86add073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54d0ebb27300d19ac9392a3f86add073");
        } else {
            saveJsonAsync(context, str, null);
        }
    }

    public static void removeJsonAsync(Context context, String str, Callback callback) {
        Object[] objArr = {context, str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed64a107d0abf462c01e6f4ee3eb381d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed64a107d0abf462c01e6f4ee3eb381d");
        } else {
            saveJsonAsync(context, str, null, callback);
        }
    }

    public static boolean removeJsonSync(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0355cde2dc2eab1db31d391457af86f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0355cde2dc2eab1db31d391457af86f3")).booleanValue() : saveJsonSync(context, str, null);
    }

    private static synchronized FileEditor getEditor(Context context, String str) {
        synchronized (JsonStorage.class) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a83720dd3951cacd655c648da833d1d", RobustBitConfig.DEFAULT_VALUE)) {
                return (FileEditor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a83720dd3951cacd655c648da833d1d");
            }
            if (!EDIT_CACHE_MAP.containsKey(str)) {
                EDIT_CACHE_MAP.put(str, new FileEditor(context, str));
            }
            return EDIT_CACHE_MAP.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class FileEditor {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Context context;
        private volatile boolean isRemoving;
        private volatile String json;
        private final String key;
        private ReadWriteLock lock;

        public FileEditor(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02b97d13f523ab322a8fc4d9c595f9ca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02b97d13f523ab322a8fc4d9c595f9ca");
                return;
            }
            this.context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            this.key = str;
            this.lock = new ReentrantReadWriteLock();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
            r12.onJsonLoaded(r11.json);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void loadAsync(final com.sankuai.common.utils.JsonStorage.Callback r12) {
            /*
                r11 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = 0
                r0[r8] = r12
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.common.utils.JsonStorage.FileEditor.changeQuickRedirect
                java.lang.String r10 = "0d0f966bd03c856065c9bb3515b2dd72"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r0
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1b
                com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
                return
            L1b:
                android.content.Context r0 = r11.context
                if (r0 == 0) goto L4c
                java.lang.String r0 = r11.key
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L28
                goto L4c
            L28:
                monitor-enter(r11)
                boolean r0 = r11.isRemoving     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L40
                java.lang.String r0 = r11.json     // Catch: java.lang.Throwable -> L49
                if (r0 == 0) goto L32
                goto L40
            L32:
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L49
                java.util.concurrent.Executor r0 = com.sankuai.android.jarvis.c.a()
                com.sankuai.common.utils.JsonStorage$FileEditor$1 r1 = new com.sankuai.common.utils.JsonStorage$FileEditor$1
                r1.<init>()
                com.sankuai.waimai.launcher.util.aop.b.a(r0, r1)
                return
            L40:
                if (r12 == 0) goto L47
                java.lang.String r0 = r11.json     // Catch: java.lang.Throwable -> L49
                r12.onJsonLoaded(r0)     // Catch: java.lang.Throwable -> L49
            L47:
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L49
                return
            L49:
                r12 = move-exception
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L49
                throw r12
            L4c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.JsonStorage.FileEditor.loadAsync(com.sankuai.common.utils.JsonStorage$Callback):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String loadSync() {
            FileInputStream fileInputStream;
            InputStreamReader inputStreamReader;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb3dbe5fc28e5f3cb2d1da1e50611611", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb3dbe5fc28e5f3cb2d1da1e50611611");
            }
            InputStreamReader inputStreamReader2 = null;
            if (this.context == null || TextUtils.isEmpty(this.key)) {
                return null;
            }
            synchronized (this) {
                if (!this.isRemoving && this.json == null) {
                    this.lock.readLock().lock();
                    try {
                        File jsonStorageFile = JsonStorage.getJsonStorageFile(this.context, this.key);
                        if (!jsonStorageFile.exists()) {
                            this.lock.readLock().unlock();
                            IOUtils.close((Closeable) null);
                            IOUtils.close((Closeable) null);
                            return null;
                        }
                        fileInputStream = new AtomicFile(jsonStorageFile).openRead();
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                        } catch (IOException unused) {
                            inputStreamReader = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            StringBuilder sb = new StringBuilder();
                            char[] cArr = new char[16384];
                            while (true) {
                                int read = inputStreamReader.read(cArr);
                                if (read == -1) {
                                    String sb2 = sb.toString();
                                    this.lock.readLock().unlock();
                                    IOUtils.close(inputStreamReader);
                                    IOUtils.close(fileInputStream);
                                    return sb2;
                                }
                                sb.append(cArr, 0, read);
                            }
                        } catch (IOException unused2) {
                            this.lock.readLock().unlock();
                            IOUtils.close(inputStreamReader);
                            IOUtils.close(fileInputStream);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStreamReader2 = inputStreamReader;
                            this.lock.readLock().unlock();
                            IOUtils.close(inputStreamReader2);
                            IOUtils.close(fileInputStream);
                            throw th;
                        }
                    } catch (IOException unused3) {
                        fileInputStream = null;
                        inputStreamReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                    }
                }
                return this.json;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void saveAsync(final String str, final Callback callback) {
            boolean z = true;
            Object[] objArr = {str, callback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ef2669886ccc9f97403d77fba54f4c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ef2669886ccc9f97403d77fba54f4c4");
            } else if (this.context == null || TextUtils.isEmpty(this.key)) {
                if (callback != null) {
                    callback.onJsonSaved(false);
                }
            } else {
                synchronized (this) {
                    if (str == null) {
                        try {
                            if (!this.isRemoving) {
                                this.isRemoving = true;
                                this.json = str;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (this.json != str) {
                        this.isRemoving = false;
                    } else {
                        z = false;
                    }
                    this.json = str;
                }
                if (z) {
                    b.a(c.a(), new Runnable() { // from class: com.sankuai.common.utils.JsonStorage.FileEditor.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "41d7aeed3ccc21be6d2231b0fea0668c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "41d7aeed3ccc21be6d2231b0fea0668c");
                            } else if (FileEditor.this.json == str) {
                                boolean saveSync = FileEditor.this.saveSync(FileEditor.this.json, true);
                                if (callback != null) {
                                    callback.onJsonSaved(saveSync);
                                }
                            } else if (callback != null) {
                                callback.onJsonSaved(true);
                            }
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean saveSync(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd5dcc375daf9b88a3f72582f7565a5b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd5dcc375daf9b88a3f72582f7565a5b")).booleanValue() : saveSync(str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable, java.io.OutputStreamWriter] */
        /* JADX WARN: Type inference failed for: r2v8 */
        public boolean saveSync(String str, boolean z) {
            FileOutputStream fileOutputStream;
            AtomicFile atomicFile;
            ?? r2;
            File jsonStorageFile;
            boolean exists;
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b272f94a168967e92b300b3a3fc7b72b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b272f94a168967e92b300b3a3fc7b72b")).booleanValue();
            }
            if (this.context == null || TextUtils.isEmpty(this.key)) {
                return false;
            }
            synchronized (this) {
                if (!z) {
                    if (str == null) {
                        if (!this.isRemoving) {
                            this.isRemoving = true;
                            z = true;
                            this.json = str;
                        }
                    }
                    if (this.json != str) {
                        this.isRemoving = false;
                        z = true;
                    }
                    this.json = str;
                }
            }
            if (!z) {
                return true;
            }
            this.lock.writeLock().lock();
            synchronized (this) {
                FileOutputStream fileOutputStream2 = null;
                if (this.json == null && str == null && this.isRemoving) {
                    this.isRemoving = false;
                } else if (this.json != str) {
                    this.lock.writeLock().unlock();
                    return true;
                } else {
                    this.json = null;
                }
                try {
                    try {
                        jsonStorageFile = JsonStorage.getJsonStorageFile(this.context, this.key);
                        exists = jsonStorageFile.exists();
                        if (!exists) {
                            if (str == null) {
                                this.lock.writeLock().unlock();
                                IOUtils.close((Closeable) null);
                                IOUtils.close((Closeable) null);
                                return true;
                            }
                            exists = (jsonStorageFile.getParentFile().exists() || jsonStorageFile.getParentFile().mkdirs()) && jsonStorageFile.createNewFile();
                        }
                    } catch (IOException unused) {
                        atomicFile = null;
                        r2 = 0;
                    }
                    if (!exists) {
                        this.lock.writeLock().unlock();
                        IOUtils.close((Closeable) null);
                        IOUtils.close(fileOutputStream2);
                        return false;
                    }
                    atomicFile = new AtomicFile(jsonStorageFile);
                    try {
                        if (str == null) {
                            atomicFile.delete();
                            this.lock.writeLock().unlock();
                            IOUtils.close((Closeable) null);
                            IOUtils.close((Closeable) null);
                            return true;
                        }
                        fileOutputStream = atomicFile.startWrite();
                        try {
                            r2 = new OutputStreamWriter(fileOutputStream, "UTF-8");
                        } catch (IOException unused2) {
                            r2 = 0;
                        } catch (Throwable th) {
                            th = th;
                            this.lock.writeLock().unlock();
                            IOUtils.close(fileOutputStream2);
                            IOUtils.close(fileOutputStream);
                            throw th;
                        }
                        try {
                            r2.write(str);
                            r2.flush();
                            atomicFile.finishWrite(fileOutputStream);
                            this.lock.writeLock().unlock();
                            IOUtils.close((Closeable) r2);
                            IOUtils.close(fileOutputStream);
                            return true;
                        } catch (IOException unused3) {
                            fileOutputStream2 = fileOutputStream;
                            r2 = r2;
                            if (atomicFile != null) {
                                try {
                                    atomicFile.failWrite(fileOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = fileOutputStream2;
                                    fileOutputStream2 = r2;
                                    this.lock.writeLock().unlock();
                                    IOUtils.close(fileOutputStream2);
                                    IOUtils.close(fileOutputStream);
                                    throw th;
                                }
                            }
                            this.lock.writeLock().unlock();
                            IOUtils.close((Closeable) r2);
                            IOUtils.close(fileOutputStream2);
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream2 = r2;
                            this.lock.writeLock().unlock();
                            IOUtils.close(fileOutputStream2);
                            IOUtils.close(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException unused4) {
                        r2 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            }
        }
    }
}
