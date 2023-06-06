package com.sankuai.meituan.bundle.service;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.bundle.service.b;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends d {
    public static ChangeQuickRedirect t;
    public a u;
    public File v;

    public f(c cVar, a aVar, a aVar2, g gVar, b.a aVar3) {
        super(cVar, gVar, aVar2, 5, aVar3);
        Object[] objArr = {cVar, aVar, aVar2, gVar, aVar3};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71efe143477ba793373f2ca64186dc84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71efe143477ba793373f2ca64186dc84");
        } else {
            this.u = aVar;
        }
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa2708e6bc9516e4a0a1b5f6244758e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa2708e6bc9516e4a0a1b5f6244758e")).booleanValue();
        }
        this.v = new File(this.l, this.u.a);
        boolean a = a(this.u.b, this.v, this.u.a);
        j.a("Fetch", System.currentTimeMillis() - this.j, true, b.a(this.b, this.c.a), this.h.k, this.h.l);
        if (this.g.h || !a) {
            return a;
        }
        k.a("doWork; preload unzip return! targetL9.hash:" + this.u.a + " targetL0.hash:" + this.c.a, new Object[0]);
        b.a(this.h, this.v, this);
        return false;
    }

    private boolean f() {
        ZipFile zipFile;
        Throwable th;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7404fa671ab9d3c696ded89db861129c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7404fa671ab9d3c696ded89db861129c")).booleanValue();
        }
        try {
            com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "ZipFile(targetL9File) start:" + this.v.getAbsolutePath());
            zipFile = new ZipFile(this.v);
        } catch (Throwable th2) {
            zipFile = null;
            th = th2;
        }
        try {
            com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "ZipFile(targetL9File) end:" + this.v.getAbsolutePath());
            if (zipFile.size() != 1) {
                com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "targetL9ZipFile.size() != 1");
                k.b(this.v);
                b.a(this.h, 4, this);
                try {
                    zipFile.close();
                } catch (Exception e) {
                    k.a("unzipL9File Exception:" + e.toString(), new Object[0]);
                }
                return false;
            }
            ZipEntry nextElement = zipFile.entries().nextElement();
            if (nextElement != null) {
                k.c(this.n);
                k.a(this.n, zipFile.getInputStream(nextElement));
                try {
                    zipFile.close();
                } catch (Exception e2) {
                    k.a("unzipL9File Exception:" + e2.toString(), new Object[0]);
                }
                return true;
            }
            com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "zipEntry is null");
            k.b(this.v);
            b.a(this.h, 4, this);
            try {
                zipFile.close();
            } catch (Exception e3) {
                k.a("unzipL9File Exception:" + e3.toString(), new Object[0]);
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            try {
                com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "catch IOException:" + Log.getStackTraceString(th));
                j.a("FullBundleTask,makeTargetL0", th);
                boolean a = com.sankuai.meituan.bundle.service.util.c.a(this.v, this.n);
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e4) {
                        k.a("unzipL9File Exception:" + e4.toString(), new Object[0]);
                    }
                }
                return a;
            } catch (Throwable th4) {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e5) {
                        k.a("unzipL9File Exception:" + e5.toString(), new Object[0]);
                    }
                }
                throw th4;
            }
        }
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4454802b902435b23d2f2826a62c1b75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4454802b902435b23d2f2826a62c1b75")).booleanValue();
        }
        if (f()) {
            k.b(this.v);
            if (!this.n.exists()) {
                com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "targetL0File.exists() is false:" + this.n.getAbsolutePath());
                b.a(this.h, 14, this);
                return false;
            } else if (TextUtils.equals(this.c.a, k.a(this.n))) {
                return true;
            } else {
                com.sankuai.meituan.bundle.service.util.a.a("FullBundleTask,makeTargetL0", "targetL0.hash doesn't equal targetL0File's md5:hash:" + this.c.a + "md5:" + k.a(this.n));
                k.b(this.n);
                b.a(this.h, 3, this);
                return false;
            }
        }
        b.a(this.h, 5, this);
        return false;
    }
}
