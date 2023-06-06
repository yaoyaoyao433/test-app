package com.sankuai.waimai.business.page.home.cache;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    public final File b;
    public final File c;
    public String d;
    private String e;
    private String f;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36538e592aaa244526935f0d1a9c374e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36538e592aaa244526935f0d1a9c374e");
            return;
        }
        this.e = "waimai";
        this.f = ICashierJSHandler.KEY_PROMOTION;
        this.c = q.a(context, this.e, this.f, u.e);
        if (!this.c.exists()) {
            this.c.getParentFile().mkdirs();
        }
        this.b = q.b(context, this.e, this.f, u.e);
        if (this.b.exists()) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e34e69c28aebd1def928f540e96ef853", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e34e69c28aebd1def928f540e96ef853")).booleanValue() : Environment.getExternalStorageState().equals("mounted")) {
            this.b.mkdirs();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final InputStream a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e48d1296c8e62c34e720e0e99a07abb", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e48d1296c8e62c34e720e0e99a07abb");
        }
        String a2 = b.a(this.d);
        File file = new File(this.b, a2);
        if (!file.exists() || !file.canRead()) {
            file = new File(this.c, a2);
        }
        if (file.exists() && file.canRead()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b3e2a8272f36625caf1e94e025f91c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b3e2a8272f36625caf1e94e025f91c");
        }
        String a2 = b.a(this.d);
        File file = new File(this.b, a2);
        if (file.exists() && file.canRead()) {
            return file.getAbsolutePath();
        }
        File file2 = new File(this.c, a2);
        if (file2.exists() && file2.canRead()) {
            return file2.getAbsolutePath();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.sankuai.waimai.business.page.home.cache.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.io.InputStream r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.cache.c.a(java.io.InputStream):boolean");
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1b75f2c358190eb6d0330748c7ba94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1b75f2c358190eb6d0330748c7ba94")).booleanValue();
        }
        String a2 = b.a(this.d);
        File file = new File(this.b, a2);
        if (file.exists() && file.canRead()) {
            return true;
        }
        File file2 = new File(this.c, a2);
        return file2.exists() && file2.canRead();
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cbba7d27556b4dcc21df5d49ce8c639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cbba7d27556b4dcc21df5d49ce8c639");
            return;
        }
        String a2 = b.a(this.d);
        File file = new File(this.b, a2);
        if (file.exists() && file.canWrite()) {
            file.delete();
        }
        File file2 = new File(this.c, a2);
        if (file2.exists() && file2.canWrite()) {
            file2.delete();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final a a(String str) {
        this.d = str;
        return this;
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8990fc5078ac9398d61c520ecf54c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8990fc5078ac9398d61c520ecf54c7")).booleanValue();
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            return b(this.b.getAbsolutePath());
        }
        return true;
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3182ff288af1e31256181876ee7aeb47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3182ff288af1e31256181876ee7aeb47")).booleanValue();
        }
        try {
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()) < 3145728;
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(th);
            return false;
        }
    }

    private static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f82b71859aac8a1d530c43dd2cc34238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f82b71859aac8a1d530c43dd2cc34238");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1b4b1b91728d82011c6c341ab29dd4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1b4b1b91728d82011c6c341ab29dd4d")).longValue();
        }
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
