package com.meituan.met.mercury.load.repository.task;

import com.meituan.android.bsdiff.BSPatchUtil;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends a {
    public static ChangeQuickRedirect p;
    private String q;
    private String r;
    private File s;
    private File t;

    public c(String str, String str2, String str3, File file, File file2, File file3, int i, File file4) {
        Object[] objArr = {str, str2, str3, file, file2, file3, Integer.valueOf(i), file4};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83bd836c3fb98afbeb230b75712579ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83bd836c3fb98afbeb230b75712579ed");
            return;
        }
        this.q = str;
        this.r = str2;
        this.c = str3;
        this.s = file;
        this.d = file2;
        this.t = file3;
        this.k = i;
        this.l = file4;
    }

    @Override // com.meituan.met.mercury.load.repository.task.a
    public final void f() {
        String str;
        int i;
        String str2;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acab34d2c521d01aba3dbb87a1aeb4f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acab34d2c521d01aba3dbb87a1aeb4f6");
            return;
        }
        e();
        if (this.d.exists() && e.a(this.d, this.c)) {
            this.e = true;
            a(this.d.length(), 0);
        } else if (this.s == null || !this.s.exists() || !this.s.isFile()) {
            a(new f((short) 4, "old file not exist!", this.g, this.h));
        } else {
            if (this.l != null && this.l.exists() && e.a(this.l, this.r)) {
                this.m = true;
                if (this.k > 0) {
                    a(this.d.length(), 2);
                    return;
                }
                this.t = this.l;
            }
            if (this.k > 0) {
                this.t = this.l;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (!this.m) {
                    com.meituan.met.mercury.load.download.a.a(this.f, this.q, this.t, this.r, this.n);
                }
                a("diff", System.currentTimeMillis() - currentTimeMillis, true, 0, null);
                if (this.k > 0) {
                    a(this.l.length(), 2);
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    try {
                        if (!this.d.getParentFile().exists()) {
                            this.d.getParentFile().mkdirs();
                        }
                        BSPatchUtil.a(this.s, this.d, this.t);
                        if (!e.a(this.d, this.c)) {
                            throw new f((short) 4, "md5 not same!", this.g, this.h);
                        }
                        b("DDDBundleDeltaPatch", System.currentTimeMillis() - currentTimeMillis2, true, 0, null);
                        this.t.delete();
                        a(this.d.length(), 0);
                    } catch (Exception e) {
                        String exc = e.toString();
                        if (e instanceof f) {
                            int i3 = ((f) e).c;
                            str2 = e.getMessage();
                            i2 = i3;
                        } else {
                            str2 = exc;
                            i2 = 103;
                        }
                        b("DDDBundleDeltaPatch", System.currentTimeMillis() - currentTimeMillis2, false, i2, str2);
                        a(e);
                        this.t.delete();
                    }
                } catch (Throwable th) {
                    this.t.delete();
                    throw th;
                }
            } catch (Exception e2) {
                String exc2 = e2.toString();
                if (e2 instanceof f) {
                    int i4 = ((f) e2).c;
                    str = e2.getMessage();
                    i = i4;
                } else {
                    str = exc2;
                    i = 101;
                }
                a("diff", System.currentTimeMillis() - currentTimeMillis, false, i, str);
                a(e2);
            }
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3622cdccade9980fc13480cc09583b9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3622cdccade9980fc13480cc09583b9c");
        }
        return "DownloadPatchTask{diffUrl='" + this.q + "', diffMd5='" + this.r + "', oldFile=" + this.s + ", patchFile=" + this.t + ", priority=" + this.b + ", expectMd5='" + this.c + "', destFile=" + this.d + ", fileAlreadyCached=" + this.e + ", business='" + this.f + "', resourceName='" + this.g + "', resourceVersion='" + this.h + "', taskState=" + this.i + ", taskCallBack=" + this.j + ", preloadTag=" + this.k + ", preloadFile=" + this.l + ", hasPreloadFile=" + this.m + ", dddProcessLock=" + this.o + '}';
    }
}
