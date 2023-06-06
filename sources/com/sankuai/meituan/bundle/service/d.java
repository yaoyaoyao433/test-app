package com.sankuai.meituan.bundle.service;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.bundle.service.b;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d implements Runnable {
    public static ChangeQuickRedirect a;
    protected int b;
    protected a c;
    protected c d;
    public boolean e;
    protected String f;
    protected g g;
    protected b.a h;
    public int i;
    protected long j;
    protected File k;
    protected File l;
    protected File m;
    protected File n;
    protected File o;
    protected File p;
    protected File q;
    protected String r;
    protected long s;
    private String t;

    public abstract boolean c();

    public abstract boolean d();

    public d(c cVar, g gVar, a aVar, int i, b.a aVar2) {
        Object[] objArr = {cVar, gVar, aVar, 5, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604a6a2a12569bffde7b63e587b8eb0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604a6a2a12569bffde7b63e587b8eb0c");
            return;
        }
        this.i = 5;
        this.o = null;
        this.q = null;
        this.d = cVar;
        this.b = cVar.c;
        this.g = gVar;
        this.c = aVar;
        this.f = this.c.a;
        this.e = gVar.b;
        this.i = gVar.c;
        this.h = aVar2;
        switch (this.b) {
            case 100:
                this.t = "offline";
                return;
            case 101:
                this.t = "mrn";
                return;
            default:
                this.t = "unknown";
                return;
        }
    }

    private boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee55bb038de217a4e400a9dbf3ee9f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee55bb038de217a4e400a9dbf3ee9f2")).booleanValue();
        }
        if (str.length() <= 1) {
            com.sankuai.meituan.bundle.service.util.a.a("checkDestPath", "destPath.length() <=1:" + str);
            return false;
        } else if (URLUtil.isFileUrl(str)) {
            com.sankuai.meituan.bundle.service.util.a.a("checkDestPath", "destPath is File url:" + str);
            return false;
        } else {
            return true;
        }
    }

    private String b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23bcee8601e12c908a0669781fa8eeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23bcee8601e12c908a0669781fa8eeb");
        }
        if (this.g.f.charAt(this.g.f.length() - 1) == '/') {
            str = this.g.f.substring(0, this.g.f.length() - 1);
        }
        return str + "temp";
    }

    public boolean a() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1564bf5436b44e7f811a281a1899a75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1564bf5436b44e7f811a281a1899a75")).booleanValue();
        }
        if (this.g != null) {
            if (this.g.e) {
                this.n = new File(this.k, this.c.a);
                if (TextUtils.isEmpty(this.g.f)) {
                    this.p = new File(this.m, this.c.a);
                    z2 = false;
                } else if (!a(this.g.f)) {
                    b.a(this.h, 12, this);
                    return false;
                } else {
                    this.p = new File(b(this.g.f));
                    k.b(this.p);
                    this.q = new File(this.g.f);
                    k.c(this.q);
                    z2 = true;
                }
                if (z2 && this.q.exists()) {
                    com.sankuai.meituan.bundle.service.util.a.a("initFilesAndCheck", "hasDestPath && unzipFileFinal.exists():" + this.q.getAbsolutePath());
                    b.a(this.h, 15, this);
                    return false;
                }
                boolean exists = this.n.exists();
                if (exists && !(exists = TextUtils.equals(this.c.a, k.a(this.n)))) {
                    k.b(this.n);
                }
                if (f()) {
                    k.b(this.q);
                    k.b(this.p);
                } else if (!z2 && exists) {
                    File file = this.p;
                    if (this.q != null) {
                        file = this.q;
                    }
                    b.a(this.h, file, this);
                    return false;
                }
            } else {
                this.p = null;
                if (TextUtils.isEmpty(this.g.f)) {
                    this.n = new File(this.k, this.c.a);
                    z = false;
                } else if (!a(this.g.f)) {
                    b.a(this.h, 12, this);
                    return false;
                } else {
                    this.n = new File(b(this.g.f));
                    k.b(this.n);
                    this.o = new File(this.g.f);
                    k.c(this.o);
                    z = true;
                }
                if (z && this.o.exists()) {
                    com.sankuai.meituan.bundle.service.util.a.a("initFilesAndCheck", "hasDestPath && targetL0FileFinal.exists():" + this.o.getAbsolutePath());
                    b.a(this.h, 15, this);
                    return false;
                } else if (!f()) {
                    if (!z && this.n.exists()) {
                        if (this.n.isFile() && TextUtils.equals(this.c.a, k.a(this.n))) {
                            b.a(this.h, this.n, this);
                            return false;
                        }
                        String str = "";
                        int i = -1;
                        if (!this.n.isFile()) {
                            str = "targetL0.isFile() return false";
                            i = 16;
                        } else if (!TextUtils.equals(this.c.a, k.a(this.n))) {
                            str = "targetL0.hash doesn't equals targetL0File's md5";
                            i = 17;
                        }
                        com.sankuai.meituan.bundle.service.util.a.a("initFilesAndCheck", str + CommonConstant.Symbol.COLON + this.n.getAbsolutePath());
                        b.a(this.h, i, this);
                        return false;
                    }
                } else {
                    k.b(this.o);
                    k.b(this.n);
                }
            }
        } else {
            this.n = new File(this.k, this.c.a);
            this.p = new File(this.m, this.c.a);
            boolean exists2 = this.n.exists();
            if (exists2 && !(exists2 = TextUtils.equals(this.c.a, k.a(this.n)))) {
                k.b(this.n);
            }
            if (f()) {
                k.b(this.n);
                k.b(this.p);
            } else if (exists2) {
                b.a(this.h, this.p, this);
                return false;
            }
        }
        return true;
    }

    private boolean f() {
        return this.g != null && this.g.a;
    }

    public int b() {
        return this.i;
    }

    public final boolean a(@NonNull String str, @NonNull File file, @NonNull String str2) {
        InputStream inputStream;
        Response<ap> a2;
        Object[] objArr = {str, file, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8601be5820fcaad746cbc147382219", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8601be5820fcaad746cbc147382219")).booleanValue();
        }
        if ((file.exists() && file.length() > 0 && TextUtils.equals(str2, k.a(file))) ? false : true) {
            ar arVar = this.d.d;
            final b.a aVar = this.h;
            Object[] objArr2 = {str, arVar, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25a61fe55a562f198a7929f1625b0c11", RobustBitConfig.DEFAULT_VALUE)) {
                inputStream = (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25a61fe55a562f198a7929f1625b0c11");
            } else if (arVar == null || (a2 = a(str, (DownloadService) arVar.a(DownloadService.class))) == null) {
                inputStream = null;
            } else {
                InputStream source = a2.e().source();
                final long contentLength = a2.e().contentLength();
                inputStream = new e(source) { // from class: com.sankuai.meituan.bundle.service.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.bundle.service.e
                    public final void a(long j) {
                        Object[] objArr3 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6dda394c16e3e60e104f0335be2bce0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6dda394c16e3e60e104f0335be2bce0");
                            return;
                        }
                        try {
                            aVar.a(1, j, contentLength);
                        } catch (Exception e) {
                            Log.e("BundleService", e.getMessage());
                        }
                    }

                    @Override // com.sankuai.meituan.bundle.service.e
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ead6952d25b62346e5539b901ca624b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ead6952d25b62346e5539b901ca624b");
                            return;
                        }
                        com.sankuai.meituan.bundle.service.util.b.a().a(d.this.r, 200, (int) d.this.s, (int) (System.currentTimeMillis() - d.this.j));
                    }
                };
            }
            if (inputStream == null) {
                com.sankuai.meituan.bundle.service.util.a.a("downloadFileAndCheck", "inputStream is null");
                b.a(this.h, 13, this);
                return false;
            }
            try {
                if (k.a(file, inputStream) <= 0) {
                    com.sankuai.meituan.bundle.service.util.a.a("downloadFileAndCheck", "file.length <= 0");
                    b.a(this.h, 1, this);
                    return false;
                } else if (file != null && !file.exists()) {
                    com.sankuai.meituan.bundle.service.util.a.a("downloadFileAndCheck", "file.exists() is false");
                    b.a(this.h, 19, this);
                    return false;
                } else if (TextUtils.equals(str2, k.a(file))) {
                    return true;
                } else {
                    com.sankuai.meituan.bundle.service.util.a.a("downloadFileAndCheck", "fileHash doesn't equal file's md5");
                    k.b(file);
                    b.a(this.h, 3, this);
                    return false;
                }
            } catch (IOException e) {
                com.sankuai.meituan.bundle.service.util.a.a("downloadFileAndCheck", "catch IOException:" + Log.getStackTraceString(e));
                j.a("downloadFileAndCheck", e);
                b.a(this.h, 18, this);
                return false;
            }
        }
        return true;
    }

    private void g() {
        File file;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3f7b72d39fe9136055942ce95f3d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3f7b72d39fe9136055942ce95f3d65");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.p == null) {
            if (this.o == null) {
                file = this.n;
            } else if (this.n.renameTo(this.o)) {
                file = this.o;
            } else {
                com.sankuai.meituan.bundle.service.util.a.a("makeUnzipFile", "targetL0File.renameTo(targetL0FileFinal) return false");
                k.b(this.n);
                b.a(this.h, 20, this);
                return;
            }
            j.a("NoUnzipTotal", System.currentTimeMillis() - currentTimeMillis, true, b.a(this.b, this.c.a), this.h.k, this.h.l);
            b.a(this.h, file, this);
            return;
        }
        try {
            if (!this.p.exists()) {
                this.p.mkdirs();
            }
            com.sankuai.meituan.bundle.service.util.a.a("makeUnzipFile", "ZipFile(targetL0File) start:" + this.n.getAbsolutePath());
            long a2 = k.a(new ZipFile(this.n), this.p.getAbsolutePath());
            com.sankuai.meituan.bundle.service.util.a.a("makeUnzipFile", " ZipFile(targetL0File) end:" + this.n.getAbsolutePath());
            j.a("Unzip", System.currentTimeMillis() - currentTimeMillis, true, b.a(this.b, this.c.a), this.h.k, this.h.l);
            if (a2 > 0) {
                File file2 = this.p;
                if (this.q != null) {
                    if (this.p.renameTo(this.q)) {
                        file2 = this.q;
                    } else {
                        com.sankuai.meituan.bundle.service.util.a.a("makeUnzipFile", "unzipFile.renameTo(unzipFileFinal) return false");
                        k.b(this.p);
                        b.a(this.h, 11, this);
                        return;
                    }
                }
                j.a(Constants.TRACE_TYPE_TOTAL, System.currentTimeMillis() - this.j, true, b.a(this.b, this.c.a), this.h.k, this.h.l);
                b.a(this.h, file2, this);
                return;
            }
            com.sankuai.meituan.bundle.service.util.a.a("makeUnzipFile", "unzipLen <= 0");
            k.b(this.n);
            b.a(this.h, 6, this);
        } catch (Throwable th) {
            com.sankuai.meituan.bundle.service.util.a.a("makeUnzipFile", "catch throwable:" + Log.getStackTraceString(th));
            j.a("makeUnzipFile", th);
            k.b(this.n);
            b.a(this.h, 6, this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0033866cdd1a0b2daf590bb7adddf01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0033866cdd1a0b2daf590bb7adddf01");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3639a2147859330ca930d52e86a9cdc5", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3639a2147859330ca930d52e86a9cdc5")).booleanValue();
        } else if (this.d == null || TextUtils.isEmpty(this.f)) {
            z = true;
        } else {
            z = this.d.a(this.f, this);
            if (z) {
                k.a("onStart; hash=%s;bringToFront=%b", this.f, Boolean.valueOf(this.e));
            }
        }
        if (z) {
            try {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51b4401d7aaf27b863d1277940bc2e0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51b4401d7aaf27b863d1277940bc2e0e");
                    return;
                }
                this.j = System.currentTimeMillis();
                j.a(DiagnoseLog.ITEM_START, 0L, false, b.a(this.b, this.c.a), this.h.k, this.h.l);
                k.a("doWork; hash=%s", this.f);
                this.k = b.a(this.b);
                this.l = b.c(this.b);
                this.m = b.b(this.b);
                if (a()) {
                    this.h.l = true;
                    if (c() && d()) {
                        g();
                    }
                }
            } catch (Exception e) {
                k.a("exception =%s", e.getMessage());
            }
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cf02d84712229b49411d79463c53db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cf02d84712229b49411d79463c53db");
        } else if (this.d == null || TextUtils.isEmpty(this.f)) {
        } else {
            k.a("onFail hash=%s;bringToFront=%b", this.f, Boolean.valueOf(this.e));
            ArrayList<d> a2 = this.d.a(this.f);
            if (this.h != null) {
                this.h.a(i);
            }
            Iterator<d> it = a2.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next.h != null && next != this) {
                    next.h.a(i);
                }
            }
        }
    }

    public void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb89ec5a34ea4614c483b59f7cbfb192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb89ec5a34ea4614c483b59f7cbfb192");
        } else if (this.d == null || TextUtils.isEmpty(this.f)) {
        } else {
            k.a("onSuccess hash=%s;bringToFront=%b", this.f, Boolean.valueOf(this.e));
            ArrayList<d> a2 = this.d.a(this.f);
            if (this.h != null) {
                this.h.a(file);
            }
            Iterator<d> it = a2.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next.h != null && next != this) {
                    next.h.a(file);
                }
            }
        }
    }

    private String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d27c3616680cfc1744299473cd31deb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d27c3616680cfc1744299473cd31deb");
        }
        if (TextUtils.isEmpty(str)) {
            switch (this.b) {
                case 100:
                    str = "offline";
                    break;
                case 101:
                    str = "mrn";
                    break;
                default:
                    str = "unknown";
                    break;
            }
        }
        return "bundle-service/" + this.t + "/" + str + "/download/" + this.g.g;
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203a43c6d53e8ddf49228777bf2a2ce4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203a43c6d53e8ddf49228777bf2a2ce4");
        }
        return "bundle-service/" + this.t + "/host/diff/" + this.g.g;
    }

    private Response<ap> a(String str, DownloadService downloadService) {
        Response<ap> response;
        List<com.sankuai.meituan.bundle.service.entity.b> list;
        Call<ap> download;
        Response<ap> response2;
        Call<ap> download2;
        Response<ap> response3;
        Object[] objArr = {str, downloadService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc199d037c4b1b7ca795c3f2fd2ef59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc199d037c4b1b7ca795c3f2fd2ef59");
        }
        if (downloadService == null || (download2 = downloadService.download(str)) == null) {
            response = null;
        } else {
            try {
                response3 = download2.a();
            } catch (IOException unused) {
                response3 = null;
            }
            if (response3 != null && response3.f() && response3.e() != null) {
                this.r = c(null);
                return response3;
            }
            com.sankuai.meituan.bundle.service.util.b.a().a(c(null), response3 == null ? 10001 : response3.b());
            response = response3;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String scheme = parse.getScheme();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da9d94a2d86ebe1518d7c4261d4f122c", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da9d94a2d86ebe1518d7c4261d4f122c");
        } else {
            com.sankuai.meituan.bundle.service.entity.a a2 = b.a();
            if (a2 != null) {
                switch (this.b) {
                    case 100:
                        list = a2.b;
                        break;
                    case 101:
                        list = a2.a;
                        break;
                }
            }
            list = null;
        }
        if (list == null || list.size() <= 0 || TextUtils.isEmpty(host) || TextUtils.isEmpty(scheme)) {
            return null;
        }
        Response<ap> response4 = response;
        for (com.sankuai.meituan.bundle.service.entity.b bVar : list) {
            String replace = str.replace(scheme + "://" + host, bVar.a);
            if (downloadService != null && (download = downloadService.download(replace)) != null) {
                try {
                    response2 = download.a();
                } catch (IOException unused2) {
                    response2 = response4;
                }
                if (response2 != null && response2.f() && response2.e() != null) {
                    this.r = c(bVar.b);
                    return response2;
                }
                com.sankuai.meituan.bundle.service.util.b.a().a(c(bVar.b), response2 == null ? 10001 : response2.b());
                response4 = null;
            }
        }
        return null;
    }
}
