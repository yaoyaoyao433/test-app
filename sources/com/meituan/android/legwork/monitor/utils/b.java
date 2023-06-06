package com.meituan.android.legwork.monitor.utils;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private File b;
    private FileOutputStream c;
    private FileChannel d;
    private FileLock e;

    public b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e856a8eeb880d1693c87e08030520a26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e856a8eeb880d1693c87e08030520a26");
            return;
        }
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91d4b5690ee77a23aa37a10af4aa4896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91d4b5690ee77a23aa37a10af4aa4896");
            return;
        }
        try {
            File a2 = q.a(context, "banma", "");
            if (!a2.exists()) {
                a2.mkdirs();
            }
            this.b = new File(a2, str + ".lock");
            if (this.b.exists()) {
                return;
            }
            this.b.createNewFile();
        } catch (Throwable th) {
            x.e("ProcessLock.initLockFile()", "create lock file error, exception msg:", th);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f7c5a13002fcd93284fd76e6c6fefb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f7c5a13002fcd93284fd76e6c6fefb");
        } else if (this.b == null || !this.b.exists()) {
        } else {
            try {
                this.c = new FileOutputStream(this.b);
                this.d = this.c.getChannel();
            } catch (FileNotFoundException e) {
                x.e("ProcessLock.acquire()", "create lock file error, exception msg:", e);
            }
            if (this.d != null) {
                try {
                    this.e = this.d.lock();
                } catch (Throwable th) {
                    x.e("ProcessLock.acquire()", "acquire file clock error, exception msg:", th);
                }
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742a1ba9faf777d4bdadc19dedcaea0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742a1ba9faf777d4bdadc19dedcaea0f");
            return;
        }
        if (this.e != null) {
            try {
                this.e.release();
                this.e = null;
            } catch (Throwable th) {
                x.e("ProcessLock.release()", "release file clock error, exception msg:", th);
            }
        }
        if (this.d != null) {
            try {
                this.d.close();
                this.d = null;
            } catch (Throwable th2) {
                x.e("ProcessLock.release()", "close fileChannel error, exception msg:", th2);
            }
        }
        if (this.c != null) {
            try {
                this.c.close();
                this.c = null;
            } catch (Throwable th3) {
                x.e("ProcessLock.release()", "close fileOutputStream error, exception msg:", th3);
            }
        }
    }
}
