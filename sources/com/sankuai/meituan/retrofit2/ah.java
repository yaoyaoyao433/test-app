package com.sankuai.meituan.retrofit2;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ah {
    public static ChangeQuickRedirect a;
    private RandomAccessFile b;
    private FileChannel c;
    private FileLock d;

    public ah() throws IOException {
        String str;
        FileLock lock;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ade6f0d2d8c70701ecc0e2537d3e832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ade6f0d2d8c70701ecc0e2537d3e832");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        FileLock fileLock = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ddaeaef92a77c0a5ba7dc685eb5fd1b", 6917529027641081856L)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ddaeaef92a77c0a5ba7dc685eb5fd1b");
        } else if (TextUtils.isEmpty(aa.b)) {
            str = null;
        } else {
            str = aa.b + File.separator + "retrofit_log";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str, "netlog.lock");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        this.b = new RandomAccessFile(file, "rw");
        this.c = this.b.getChannel();
        if (this.c == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            i++;
            try {
                lock = this.c.lock();
            } catch (Exception unused) {
            }
            if (lock != null) {
                fileLock = lock;
                break;
            }
            try {
                Thread.sleep(100L);
                fileLock = lock;
            } catch (Exception unused2) {
                fileLock = lock;
                Log.e("retrofit-mt ProcessLock", "getInfoLock Thread failed time:100");
            }
        }
        this.d = fileLock;
    }

    private void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba081f4cc4ab46667d90b19e7b976377", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba081f4cc4ab46667d90b19e7b976377");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aee5504018e4dd43847101116c26fd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aee5504018e4dd43847101116c26fd1");
            return;
        }
        if (this.d != null) {
            try {
                if (this.d.isValid()) {
                    this.d.release();
                }
            } catch (IOException unused) {
            }
        }
        if (this.c != null) {
            a(this.c);
        }
        if (this.b != null) {
            a(this.b);
        }
    }
}
