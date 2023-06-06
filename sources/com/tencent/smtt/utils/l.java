package com.tencent.smtt.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
/* loaded from: classes6.dex */
public class l implements Runnable {
    public static String a = "TBSFileLock";
    private static Object f = new Object();
    private static Object g = new Object();
    private static HashMap<l, Object> h = null;
    private static Handler i = null;
    File b;
    RandomAccessFile c = null;
    FileLock d = null;
    long e = 0;

    public l(File file, String str) {
        this.b = null;
        this.b = new File(file, CommonConstant.Symbol.DOT + str + ".lock");
    }

    Handler a() {
        if (i == null) {
            synchronized (l.class) {
                if (i == null) {
                    HandlerThread handlerThread = new HandlerThread("QBFileLock.Thread");
                    handlerThread.start();
                    i = new Handler(handlerThread.getLooper());
                }
            }
        }
        return i;
    }

    public synchronized void a(boolean z) {
        new StringBuilder(">>> release lock: ").append(this.b.getName());
        if (this.d != null) {
            try {
                this.d.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.d = null;
        }
        if (this.c != null) {
            try {
                this.c.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.c = null;
        }
        if (i != null && this.e > 0) {
            i.removeCallbacks(this);
        }
        if (z) {
            d();
        }
    }

    public synchronized void b() {
        FileChannel channel;
        FileLock lock;
        try {
            this.c = new RandomAccessFile(this.b, "rw");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.c != null && (channel = this.c.getChannel()) != null) {
            if (this.e > 0) {
                a().postDelayed(this, this.e);
            }
            FileLock fileLock = null;
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                try {
                    lock = channel.lock();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (lock == null) {
                    fileLock = lock;
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                    if (Math.abs(System.currentTimeMillis() - currentTimeMillis) >= 1000) {
                        break;
                    }
                } else {
                    fileLock = lock;
                    break;
                }
            }
            this.d = fileLock;
            StringBuilder sb = new StringBuilder(">>> lock [");
            sb.append(this.b.getName());
            sb.append("] cost: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
        }
        if (this.d != null) {
            c();
        }
    }

    void c() {
        synchronized (g) {
            if (h == null) {
                h = new HashMap<>();
            }
            h.put(this, f);
        }
    }

    void d() {
        synchronized (g) {
            if (h == null) {
                return;
            }
            h.remove(this);
        }
    }

    public void e() {
        a(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        e();
    }
}
