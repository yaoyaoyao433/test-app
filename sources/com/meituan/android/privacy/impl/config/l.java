package com.meituan.android.privacy.impl.config;

import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.impl.config.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class l {
    public static ChangeQuickRedirect a;
    private static final o<String, l> b = new o<>();
    private final String c;
    @GuardedBy("this")
    private FileLock d;
    @GuardedBy("this")
    private FileOutputStream e;
    @GuardedBy("this")
    private FileChannel f;
    @GuardedBy("this")
    private int g;
    private final ReentrantLock h;

    @NonNull
    public static l a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22b9964a54e0d2769f07bcaff2b17c93", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22b9964a54e0d2769f07bcaff2b17c93");
        }
        l a2 = b.a(str);
        if (a2 != null) {
            return a2;
        }
        synchronized (l.class) {
            l a3 = b.a(str);
            if (a3 != null) {
                return a3;
            }
            l lVar = new l(str);
            o<String, l> oVar = b;
            Object[] objArr2 = {str, lVar};
            ChangeQuickRedirect changeQuickRedirect2 = o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "691b1e035eca21aab04fdc2a478b1bf7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "691b1e035eca21aab04fdc2a478b1bf7");
            } else {
                o.a aVar = new o.a(str, lVar, oVar.c);
                synchronized (oVar) {
                    oVar.b.put(str, aVar);
                }
            }
            return lVar;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57a9c5bb8a5e13cfbf90a92e6f73a571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57a9c5bb8a5e13cfbf90a92e6f73a571");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            b.a();
        }
    }

    private l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00c8f99371a632133b6c1b363e1dad0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00c8f99371a632133b6c1b363e1dad0");
            return;
        }
        this.c = str;
        this.h = new ReentrantLock();
    }

    public final void b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c72cef121faca291dbddd2117670c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c72cef121faca291dbddd2117670c00");
            return;
        }
        this.h.lock();
        this.g++;
        if (this.g == 1) {
            File file = new File(this.c);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            this.e = new FileOutputStream(file);
            this.f = this.e.getChannel();
            d();
        } else if (this.d != null) {
        } else {
            throw new IOException("FileLock failed: " + this.c);
        }
    }

    private void d() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841ef2823ec52f3885528ac2083152ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841ef2823ec52f3885528ac2083152ab");
            return;
        }
        for (int i = 0; i < 6; i++) {
            try {
                this.d = this.f.lock();
                return;
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Resource deadlock would occur")) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    throw e;
                }
            }
        }
        throw new IOException("FileLock failed: (over retry)");
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94bed076a624968036ed4a2f6143d2e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94bed076a624968036ed4a2f6143d2e8");
            return;
        }
        this.g--;
        if (this.g == 0) {
            if (this.d != null) {
                try {
                    this.d.close();
                } catch (Throwable unused) {
                }
            }
            IOUtils.close(this.f);
            IOUtils.close(this.e);
            this.d = null;
            this.f = null;
            this.e = null;
        }
        this.h.unlock();
    }
}
