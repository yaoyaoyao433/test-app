package com.meituan.met.mercury.load.repository.task;

import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends a {
    public static ChangeQuickRedirect p;
    private String q;
    private String r;
    private File s;

    public d(String str, String str2, File file, String str3, File file2, int i, File file3, boolean z) {
        Object[] objArr = {str, str2, file, str3, file2, Integer.valueOf(i), file3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19aa85031f3cf1efbc7a427e05b9eb7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19aa85031f3cf1efbc7a427e05b9eb7b");
            return;
        }
        this.q = str;
        this.r = str2;
        this.s = file;
        this.c = str3;
        this.d = file2;
        this.k = i;
        this.l = file3;
        this.n = z;
    }

    @Override // com.meituan.met.mercury.load.repository.task.a
    public final void f() {
        String str;
        int i;
        String str2;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda744031e4b2c0542281e3c1246e430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda744031e4b2c0542281e3c1246e430");
            return;
        }
        e();
        if (this.d.exists() && e.a(this.d, this.c)) {
            this.e = true;
            a(this.d.length(), 0);
            return;
        }
        String str3 = this.k > 0 ? "preloadXzip" : "xzip";
        if (this.l != null && this.l.exists() && e.a(this.l, this.r)) {
            this.m = true;
            if (this.k > 0) {
                a(str3, 0L, true, 0, null);
                a(this.d.length(), 1);
                return;
            }
            this.s = this.l;
        }
        if (this.k > 0) {
            this.s = this.l;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!this.m) {
                com.meituan.met.mercury.load.download.a.a(this.f, this.q, this.s, this.r, this.n);
            }
            a(str3, System.currentTimeMillis() - currentTimeMillis, true, 0, null);
            if (this.k > 0) {
                a(this.l.length(), 1);
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                try {
                    long a = e.a(this.s, this.d);
                    if (a <= 0) {
                        File file = this.s;
                        File file2 = this.d;
                        Object[] objArr2 = {file, file2};
                        ChangeQuickRedirect changeQuickRedirect2 = e.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3338e66f3fea0a44446b8f793fb42722", RobustBitConfig.DEFAULT_VALUE)) {
                            a = ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3338e66f3fea0a44446b8f793fb42722")).longValue();
                        } else {
                            long j = -1;
                            ZipFile zipFile = new ZipFile(file);
                            Enumeration<? extends ZipEntry> entries = zipFile.entries();
                            while (true) {
                                if (!entries.hasMoreElements()) {
                                    break;
                                }
                                ZipEntry nextElement = entries.nextElement();
                                if (nextElement != null && !nextElement.isDirectory()) {
                                    j = e.a(file2, zipFile.getInputStream(nextElement));
                                    break;
                                }
                            }
                            a = j;
                        }
                    }
                    long j2 = a;
                    if (!e.a(this.d, this.c)) {
                        throw new f((short) 4, "md5 not same!", this.g, this.h);
                    }
                    b("DDDBundleUnzip", System.currentTimeMillis() - currentTimeMillis2, true, 0, null);
                    this.s.delete();
                    a(j2, 0);
                } catch (Exception e) {
                    String exc = e.toString();
                    if (e instanceof f) {
                        i2 = ((f) e).c;
                        str2 = e.getMessage();
                    } else {
                        str2 = exc;
                        i2 = 102;
                    }
                    b("DDDBundleUnzip", System.currentTimeMillis() - currentTimeMillis2, false, i2, str2);
                    a(e);
                    this.s.delete();
                }
            } catch (Throwable th) {
                this.s.delete();
                throw th;
            }
        } catch (Exception e2) {
            String exc2 = e2.toString();
            if (e2 instanceof f) {
                i = ((f) e2).c;
                str = e2.getMessage();
            } else {
                str = exc2;
                i = 101;
            }
            a(str3, System.currentTimeMillis() - currentTimeMillis, false, i, str);
            a(e2);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da53c03c7bbbf123dfb5479546049ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da53c03c7bbbf123dfb5479546049ea");
        }
        return "DownloadUnzipTask{xzipUrl='" + this.q + "', xzipMd5='" + this.r + "', xzipFile=" + this.s + ", priority=" + this.b + ", expectMd5='" + this.c + "', destFile=" + this.d + ", fileAlreadyCached=" + this.e + ", business='" + this.f + "', resourceName='" + this.g + "', resourceVersion='" + this.h + "', taskState=" + this.i + ", taskCallBack=" + this.j + ", preloadTag=" + this.k + ", preloadFile=" + this.l + ", hasPreloadFile=" + this.m + ", dddProcessLock=" + this.o + '}';
    }
}
