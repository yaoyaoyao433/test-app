package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
/* loaded from: classes6.dex */
public class b {
    private static volatile b j;
    volatile String b;
    Context c;
    private volatile String i;
    final Object a = new Object();
    private final Object d = new Object();
    private final String e = "mipush_region";
    private final String f = "mipush_country_code";
    private final String g = "mipush_region.lock";
    private final String h = "mipush_country_code.lock";

    private b(Context context) {
        this.c = context;
    }

    public static b a(Context context) {
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new b(context);
                }
            }
        }
        return j;
    }

    private static String a(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock2 = null;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.c.a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                try {
                    File file2 = new File(context.getFilesDir(), str2);
                    com.xiaomi.push.b.b(file2);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        try {
                            try {
                                String a = com.xiaomi.push.b.a(file);
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e) {
                                        com.xiaomi.channel.commonutils.logger.c.a(e);
                                    }
                                }
                                com.xiaomi.push.b.a(randomAccessFile);
                                return a;
                            } catch (Exception e2) {
                                e = e2;
                                com.xiaomi.channel.commonutils.logger.c.a(e);
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e3) {
                                        com.xiaomi.channel.commonutils.logger.c.a(e3);
                                    }
                                }
                                com.xiaomi.push.b.a(randomAccessFile);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileLock2 = fileLock;
                            if (fileLock2 != null && fileLock2.isValid()) {
                                try {
                                    fileLock2.release();
                                } catch (IOException e4) {
                                    com.xiaomi.channel.commonutils.logger.c.a(e4);
                                }
                            }
                            com.xiaomi.push.b.a(randomAccessFile);
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        fileLock = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLock2 != null) {
                            fileLock2.release();
                        }
                        com.xiaomi.push.b.a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (Exception e6) {
                e = e6;
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void a(Context context, String str, String str2, String str3, Object obj) {
        FileLock lock;
        synchronized (obj) {
            FileLock fileLock = null;
            try {
                try {
                    try {
                        File file = new File(context.getFilesDir(), (String) str3);
                        com.xiaomi.push.b.b(file);
                        str3 = new RandomAccessFile(file, "rw");
                        try {
                            lock = str3.getChannel().lock();
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        ?? file2 = new File(context.getFilesDir(), str2);
                        com.xiaomi.push.b.a((File) file2, str);
                        fileLock = file2;
                        str3 = str3;
                        if (lock != null) {
                            fileLock = file2;
                            str3 = str3;
                            if (lock.isValid()) {
                                try {
                                    lock.release();
                                    fileLock = file2;
                                    str3 = str3;
                                } catch (IOException e2) {
                                    com.xiaomi.channel.commonutils.logger.c.a(e2);
                                    fileLock = file2;
                                    str3 = str3;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileLock = lock;
                        com.xiaomi.channel.commonutils.logger.c.a(e);
                        fileLock = fileLock;
                        str3 = str3;
                        if (fileLock != null) {
                            boolean isValid = fileLock.isValid();
                            fileLock = fileLock;
                            str3 = str3;
                            if (isValid) {
                                try {
                                    fileLock.release();
                                    fileLock = fileLock;
                                    str3 = str3;
                                } catch (IOException e4) {
                                    com.xiaomi.channel.commonutils.logger.c.a(e4);
                                    fileLock = fileLock;
                                    str3 = str3;
                                }
                            }
                        }
                        com.xiaomi.push.b.a((Closeable) str3);
                    } catch (Throwable th2) {
                        th = th2;
                        fileLock = lock;
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e5) {
                                com.xiaomi.channel.commonutils.logger.c.a(e5);
                            }
                        }
                        com.xiaomi.push.b.a((Closeable) str3);
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    str3 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    str3 = 0;
                }
                com.xiaomi.push.b.a((Closeable) str3);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = a(this.c, "mipush_region", "mipush_region.lock", this.a);
        }
        return this.b;
    }

    public final void a(String str) {
        if (TextUtils.equals(str, this.i)) {
            return;
        }
        this.i = str;
        a(this.c, this.i, "mipush_country_code", "mipush_country_code.lock", this.d);
    }

    public final String b() {
        if (TextUtils.isEmpty(this.i)) {
            this.i = a(this.c, "mipush_country_code", "mipush_country_code.lock", this.d);
        }
        return this.i;
    }
}
