package com.sankuai.meituan.takeoutnew.ui.page.boot.ad;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.cache.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.business.page.home.cache.a {
    public static ChangeQuickRedirect a;
    public final File b;
    public final c c;
    private String d;
    private String e;
    private String f;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da99dd2f86cb162f3f96ccc40b1e0b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da99dd2f86cb162f3f96ccc40b1e0b2");
            return;
        }
        this.e = "waimai";
        this.f = "ad";
        this.b = q.a(context, this.e, this.f, u.e);
        if (!this.b.exists()) {
            this.b.mkdirs();
        }
        this.c = new c(context);
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final InputStream a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fab324cebdafdf8f9b07846166fcdc4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fab324cebdafdf8f9b07846166fcdc4b");
        }
        File file = new File(this.b, com.sankuai.waimai.business.page.home.cache.b.a(this.d));
        FileInputStream fileInputStream = null;
        if (file.exists() && file.canRead()) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return fileInputStream == null ? this.c.a() : fileInputStream;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f486609629557b6b406d4d1ee46e5a88", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f486609629557b6b406d4d1ee46e5a88");
        }
        File file = new File(this.b, com.sankuai.waimai.business.page.home.cache.b.a(this.d));
        if (file.exists() && file.canRead()) {
            String absolutePath = file.getAbsolutePath();
            if (!TextUtils.isEmpty(absolutePath)) {
                return absolutePath;
            }
        }
        return this.c.b();
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final boolean a(InputStream inputStream) throws Exception {
        FileOutputStream fileOutputStream;
        File file;
        File file2;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd66aeea0efd97e4373795200a19938f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd66aeea0efd97e4373795200a19938f")).booleanValue();
        }
        boolean a2 = this.c.a(inputStream);
        InputStream a3 = this.c.a();
        File createTempFile = File.createTempFile("tmp", "", this.b);
        try {
            file = createTempFile;
            fileOutputStream = new FileOutputStream(createTempFile);
        } catch (FileNotFoundException unused) {
            fileOutputStream = null;
            file = null;
        }
        if (fileOutputStream != null) {
            try {
                Object[] objArr2 = {a3, fileOutputStream};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cdd9a7c90a06b31b5477d6b19c3fccea", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cdd9a7c90a06b31b5477d6b19c3fccea")).intValue();
                } else {
                    int i = (a(a3, fileOutputStream) > 2147483647L ? 1 : (a(a3, fileOutputStream) == 2147483647L ? 0 : -1));
                }
                Object[] objArr3 = {file};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b35765b40ee222b620d8c8b0b3ae84f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b35765b40ee222b620d8c8b0b3ae84f1");
                } else {
                    try {
                        file2 = new File(this.b, com.sankuai.waimai.business.page.home.cache.b.a(com.sankuai.waimai.business.page.home.cache.b.a((Object) this.d)));
                    } catch (Exception unused2) {
                        file2 = null;
                    }
                    file.renameTo(file2);
                }
                return true;
            } finally {
                a(fileOutputStream);
            }
        }
        return a2;
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e6f455c08bd53f8d6588e0bf61160e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e6f455c08bd53f8d6588e0bf61160e")).booleanValue();
        }
        File file = new File(this.b, com.sankuai.waimai.business.page.home.cache.b.a(this.d));
        return (file.exists() && file.canRead()) || this.c.c();
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091cd3e23a649061c5c7bfc72b7aa210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091cd3e23a649061c5c7bfc72b7aa210");
            return;
        }
        File file = new File(this.b, com.sankuai.waimai.business.page.home.cache.b.a(this.d));
        if (file.exists() && file.canWrite()) {
            file.delete();
        }
        this.c.d();
    }

    @Override // com.sankuai.waimai.business.page.home.cache.a
    public final com.sankuai.waimai.business.page.home.cache.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9518482e0de5eff9cdb89e04f29a80", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.home.cache.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9518482e0de5eff9cdb89e04f29a80");
        }
        this.d = str;
        this.c.d = str;
        return this;
    }

    private static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a0c81262e7a229ac853c408ca41bbf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a0c81262e7a229ac853c408ca41bbf3");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b147b47f9022ce504f0d4ca3d9f03454", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b147b47f9022ce504f0d4ca3d9f03454")).longValue();
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
