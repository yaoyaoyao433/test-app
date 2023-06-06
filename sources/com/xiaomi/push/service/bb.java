package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.he;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
/* loaded from: classes6.dex */
public final class bb implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ he b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(Context context, he heVar) {
        this.a = context;
        this.b = heVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable, java.io.IOException] */
    @Override // java.lang.Runnable
    public final void run() {
        RandomAccessFile randomAccessFile;
        FileLock lock;
        synchronized (ba.a) {
            FileLock fileLock = null;
            try {
                try {
                    try {
                        File file = new File(this.a.getFilesDir(), "tiny_data.lock");
                        com.xiaomi.push.b.b(file);
                        randomAccessFile = new RandomAccessFile(file, "rw");
                        try {
                            lock = randomAccessFile.getChannel().lock();
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    randomAccessFile = null;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = null;
                }
                try {
                    ?? r1 = this.a;
                    ba.b(r1, this.b);
                    fileLock = r1;
                    if (lock != null) {
                        boolean isValid = lock.isValid();
                        fileLock = isValid;
                        if (isValid) {
                            try {
                                lock.release();
                                fileLock = isValid;
                            } catch (IOException e3) {
                                com.xiaomi.channel.commonutils.logger.c.a((Throwable) e3);
                                fileLock = e3;
                            }
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileLock = lock;
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    fileLock = fileLock;
                    if (fileLock != null) {
                        boolean isValid2 = fileLock.isValid();
                        fileLock = fileLock;
                        if (isValid2) {
                            try {
                                fileLock.release();
                                fileLock = fileLock;
                            } catch (IOException e5) {
                                com.xiaomi.channel.commonutils.logger.c.a((Throwable) e5);
                                fileLock = e5;
                            }
                        }
                    }
                    com.xiaomi.push.b.a(randomAccessFile);
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = lock;
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e6) {
                            com.xiaomi.channel.commonutils.logger.c.a(e6);
                        }
                    }
                    com.xiaomi.push.b.a(randomAccessFile);
                    throw th;
                }
                com.xiaomi.push.b.a(randomAccessFile);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
