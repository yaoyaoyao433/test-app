package com.sankuai.meituan.kernel.net.zstd;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.MD5;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.kernel.net.zstd.b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public StringBuilder i;
    public b.a.C0597a j;
    public long k;
    public String l;
    public boolean m;
    public long n;
    public Throwable o;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        String a(String str);

        void a(String str, String str2);

        String b(String str);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a15e286f193a5879d70257e63309baf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a15e286f193a5879d70257e63309baf8");
            return;
        }
        this.b = 0;
        this.c = 3;
        this.d = 0;
        this.e = -1L;
        this.g = false;
        this.h = false;
        this.i = new StringBuilder();
        this.k = System.currentTimeMillis();
    }

    public final byte[] a(int i, byte[] bArr, a aVar) {
        byte[] bArr2;
        Object[] objArr = {Integer.valueOf(i), bArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2c69f52b4f2d69149a7def6e37329c", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2c69f52b4f2d69149a7def6e37329c");
        }
        try {
            Object[] objArr2 = {Integer.valueOf(i), bArr, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3f2b9ccd04ddb816caa5a8cf76baca0", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3f2b9ccd04ddb816caa5a8cf76baca0");
            }
            if (!a()) {
                if (this.m) {
                    com.sankuai.meituan.kernel.net.zstd.b.a().a(this.b, this.c, this.d);
                }
                return null;
            } else if (aVar == null) {
                f.a("tryUncompressResponseInner, headerAction==null");
                return null;
            } else {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (!(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90f7d724da4b2629eade89bea6dbed4a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90f7d724da4b2629eade89bea6dbed4a")).booleanValue() : ((i >= 100 && i < 200) || i == 204 || i == 304) ? false : true) || bArr == null) {
                    bArr2 = null;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = aVar.a("Content-Encoding");
                    if ("zstd".equals(a2)) {
                        bArr2 = a(aVar.a("Zstd-Dict-Id"), bArr, aVar.a("Zstd-Origin-Crc"));
                        f.a("zstd解压OK");
                    } else if ("gzip".equals(a2)) {
                        bArr2 = a(new ByteArrayInputStream(bArr));
                        f.a("gzip解压OK");
                    } else {
                        this.d = 4;
                        bArr2 = null;
                    }
                    if (!TextUtils.isEmpty(a2) && bArr2 != null) {
                        this.e = System.currentTimeMillis() - currentTimeMillis;
                        this.f = bArr2.length;
                        aVar.b("Content-Encoding");
                        aVar.a("nt_encoding", a2);
                    }
                    if (this.d == 1 || this.d == 2 || this.d == 3) {
                        com.sankuai.meituan.kernel.net.zstd.b.a().a(true, a("request_finish"));
                    }
                }
                aVar.a("nt_zstd", this.b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.d + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.e);
                if (this.m) {
                    com.sankuai.meituan.kernel.net.zstd.b.a().a(this.b, this.c, this.d);
                }
                return bArr2;
            }
        } catch (Throwable th) {
            f.a("tryUncompressResponse", th);
            return null;
        }
    }

    public final boolean a() {
        return this.j != null;
    }

    public String a(long j) {
        File file;
        String b2;
        FileInputStream fileInputStream;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d07b2cc9ea7bb8cb8bbb456ec79f6c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d07b2cc9ea7bb8cb8bbb456ec79f6c5");
        }
        com.sankuai.meituan.kernel.net.zstd.b a2 = com.sankuai.meituan.kernel.net.zstd.b.a();
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.kernel.net.zstd.b.a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d4cb6fcd942a50b9ce88162a950f88b3", RobustBitConfig.DEFAULT_VALUE)) {
            file = (File) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d4cb6fcd942a50b9ce88162a950f88b3");
        } else {
            com.sankuai.meituan.kernel.net.zstd.a aVar = a2.d;
            Object[] objArr3 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.kernel.net.zstd.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5c535a3d0eccef6ac38d6b97745e5f81", RobustBitConfig.DEFAULT_VALUE)) {
                file = (File) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5c535a3d0eccef6ac38d6b97745e5f81");
            } else {
                if (aVar.b != null) {
                    e eVar = aVar.b;
                    Object[] objArr4 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "04089802eefa40f07b95dea71b1676cb", RobustBitConfig.DEFAULT_VALUE)) {
                        b2 = (String) PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "04089802eefa40f07b95dea71b1676cb");
                    } else if (eVar.b == null) {
                        b2 = null;
                    } else {
                        b2 = eVar.b.b("dic_file_" + j, (String) null);
                    }
                    if (!TextUtils.isEmpty(b2)) {
                        file = new File(b2);
                    }
                }
                file = null;
            }
        }
        if (file == null || !file.exists()) {
            return j + " not exists";
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            byte[] byteArray = IOUtils.toByteArray(fileInputStream);
            if (byteArray != null && byteArray.length != 0) {
                String str = j + " md5=" + MD5.getMessageDigest(byteArray) + "|len=" + byteArray.length;
                IOUtils.close(fileInputStream);
                return str;
            }
            String str2 = j + " empty";
            IOUtils.close(fileInputStream);
            return str2;
        } catch (IOException e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            String str3 = j + " read error:" + e.toString();
            IOUtils.close(fileInputStream2);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.close(fileInputStream);
            throw th;
        }
    }

    private byte[] a(InputStream inputStream) {
        GZIPInputStream gZIPInputStream;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5783bde35ed3b3553bacadd0933eac02", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5783bde35ed3b3553bacadd0933eac02");
        }
        this.c = 0;
        try {
            gZIPInputStream = new GZIPInputStream(inputStream);
            try {
                try {
                    byte[] byteArray = IOUtils.toByteArray(gZIPInputStream);
                    IOUtils.close(gZIPInputStream);
                    return byteArray;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    this.o = e;
                    this.d = 3;
                    this.i.append("Gzip解压缩失败 ");
                    IOUtils.close(gZIPInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                IOUtils.close(gZIPInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            gZIPInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream = null;
            IOUtils.close(gZIPInputStream);
            throw th;
        }
    }

    private byte[] a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        long j;
        Object[] objArr = {str, bArr, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cac6324b5dc076fa1659928540e43bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cac6324b5dc076fa1659928540e43bf");
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
            this.o = th;
            this.i.append("Zstd解压缩失败 ");
        }
        if (TextUtils.isEmpty(str)) {
            this.c = 1;
            bArr2 = com.sankuai.meituan.kernel.net.zstd.b.a().a((Object) null, bArr);
        } else {
            this.c = 2;
            Object a2 = com.sankuai.meituan.kernel.net.zstd.b.a().a(NumberUtils.parseLong(str, -1L));
            if (a2 != null) {
                bArr2 = com.sankuai.meituan.kernel.net.zstd.b.a().a(a2, bArr);
            } else {
                this.d = 2;
                f.a("tryDecompressResponse 内存无字典数据");
                bArr2 = null;
            }
        }
        if (bArr2 != null && !TextUtils.isEmpty(str2)) {
            long parseLong = NumberUtils.parseLong(str2, -1L);
            Object[] objArr2 = {bArr2, -1L};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f5a4b20f0ad9e9112641e6fc15cf1a23", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f5a4b20f0ad9e9112641e6fc15cf1a23")).longValue();
            } else if (bArr2 != null) {
                CRC32 crc32 = new CRC32();
                crc32.update(bArr2);
                j = crc32.getValue();
            } else {
                j = -1;
            }
            if (parseLong == -1 || parseLong != j) {
                this.d = 6;
                StringBuilder sb = this.i;
                sb.append("originCrc32:");
                sb.append(str2);
                sb.append(" newCrc32:");
                sb.append(j);
                f.a(this.d, this.c, this.i.toString());
                return null;
            }
            f.a("crc ok:", Long.valueOf(parseLong), Long.valueOf(j));
        }
        if (bArr2 == null) {
            if (this.d != 2) {
                this.d = 1;
            }
            f.a(this.d, this.c, this.i.toString());
        }
        return bArr2;
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb760308b6b1fc0d799fc2fb7c816c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb760308b6b1fc0d799fc2fb7c816c5");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(",result=");
        sb.append(this.d);
        sb.append(",zstdHit=");
        sb.append(this.b);
        sb.append(",zstdMode=");
        sb.append(this.c);
        sb.append(",isDicLoaded=");
        sb.append(this.h);
        sb.append(",isSoLoaded=");
        sb.append(this.g);
        if (this.j != null) {
            sb.append(",dic_reason=");
            sb.append(a(this.j.c));
        }
        return sb.toString();
    }

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ab84d30be3de312cc5b3fcb640ddee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ab84d30be3de312cc5b3fcb640ddee");
        } else if (com.sankuai.meituan.kernel.net.base.c.b()) {
            System.out.println(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;
        private Map<String, String> b;

        public b(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3298b471298230932b8b590ad14e44d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3298b471298230932b8b590ad14e44d");
            } else {
                this.b = map;
            }
        }

        @Override // com.sankuai.meituan.kernel.net.zstd.c.a
        public final String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39668b8d6bc26d59fe80f494690a16f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39668b8d6bc26d59fe80f494690a16f");
            }
            if (this.b != null) {
                return this.b.get(str);
            }
            return null;
        }

        @Override // com.sankuai.meituan.kernel.net.zstd.c.a
        public final void a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae7e7619e8168ecfe37848c7e8ccc29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae7e7619e8168ecfe37848c7e8ccc29");
            } else if (this.b != null) {
                this.b.put(str, str2);
            }
        }

        @Override // com.sankuai.meituan.kernel.net.zstd.c.a
        public final String b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffb5772fc3fa28e4548c94eecdf970b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffb5772fc3fa28e4548c94eecdf970b");
            }
            if (this.b != null) {
                return this.b.remove(str);
            }
            return null;
        }
    }
}
