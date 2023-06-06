package com.meituan.mmp.lib.update;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.bg;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.x;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPPackageInfo implements Parcelable {
    public static final Parcelable.Creator<MMPPackageInfo> CREATOR = new Parcelable.Creator<MMPPackageInfo>() { // from class: com.meituan.mmp.lib.update.MMPPackageInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MMPPackageInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a5cf292337b3de4eaa7e084ddfc7de", RobustBitConfig.DEFAULT_VALUE) ? (MMPPackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a5cf292337b3de4eaa7e084ddfc7de") : new MMPPackageInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MMPPackageInfo[] newArray(int i) {
            return new MMPPackageInfo[i];
        }
    };
    public static ChangeQuickRedirect a = null;
    public static final String b = "app-service.js";
    public static final String c = "service.js";
    @SerializedName("version")
    public String d;
    @SerializedName("url")
    public String e;
    @SerializedName("md5")
    public String f;
    @SerializedName("name")
    public String g;
    @SerializedName("appId")
    public String h;
    @SerializedName("file")
    public String i;
    public transient int j;
    public transient long k;
    public transient int l;
    public transient int m;
    public transient String n;
    @SerializedName("root")
    public String o;
    @SerializedName("pages")
    public ArrayList<String> p;
    public boolean q;
    public int r;
    public transient int s;
    public boolean t;
    public volatile transient boolean u;
    public boolean v;
    @SerializedName("type")
    public String w;
    private String x;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PackageType {
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6b17708e585c5e525509677b1c3fdde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6b17708e585c5e525509677b1c3fdde");
        }
        switch (i) {
            case 1:
                return "foreground";
            case 2:
                return "background";
            case 3:
                return PackageLoadReporter.Source.PREFETCH;
            case 4:
                return "prefetchSubPkg";
            case 5:
                return "prefetchOthers";
            case 6:
                return PackageLoadReporter.LoadType.INNER;
            case 7:
                return LaunchMode.LAUNCH_MODE_PRELOAD;
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MMPPackageInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00bd790aa8e37b67d7ea60533fcdf88e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00bd790aa8e37b67d7ea60533fcdf88e");
            return;
        }
        this.k = -1L;
        this.l = -1;
        this.m = -1;
        this.v = false;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.createStringArrayList();
        this.q = parcel.readByte() != 0;
        this.r = parcel.readInt();
        this.v = parcel.readByte() != 0;
        this.x = parcel.readString();
        this.t = parcel.readByte() != 0;
        this.s = parcel.readInt();
        this.j = parcel.readInt();
        this.n = parcel.readString();
        this.u = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1aaf40fa30819ccdc566deb0e8015a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1aaf40fa30819ccdc566deb0e8015a1");
            return;
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.o);
        parcel.writeStringList(this.p);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.r);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeString(this.x);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.s);
        parcel.writeInt(this.j);
        parcel.writeString(this.n);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
    }

    private MMPPackageInfo a(boolean z) {
        this.t = true;
        this.j = 6;
        this.s = 3;
        return this;
    }

    public final boolean a() {
        return 2 == this.s;
    }

    public final String b() {
        switch (this.r) {
            case 1:
                return "framework";
            case 2:
                return "main";
            case 3:
                return "sub";
            default:
                return null;
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7aaaf1aa9edb4115ec3d0ae6890a4ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7aaaf1aa9edb4115ec3d0ae6890a4ca")).booleanValue();
        }
        if (!TextUtils.isEmpty(this.i)) {
            a(true);
        }
        return TextUtils.isEmpty(this.f) || (TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.i));
    }

    public final boolean d() {
        return this.r == 1;
    }

    public final boolean e() {
        return this.r == 2;
    }

    public final boolean f() {
        return this.r == 3;
    }

    private String i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b97bd8885b8b235657118d62b600e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b97bd8885b8b235657118d62b600e6");
        }
        switch (this.r) {
            case 1:
                String str = this.f;
                Object[] objArr2 = {context, str};
                ChangeQuickRedirect changeQuickRedirect2 = p.a;
                return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "98d510d093158a11b7495e7c635ea244", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "98d510d093158a11b7495e7c635ea244") : p.a(ay.b(context).getAbsolutePath(), str);
            case 2:
            case 3:
                String str2 = this.h;
                String str3 = this.f;
                Object[] objArr3 = {context, str2, str3};
                ChangeQuickRedirect changeQuickRedirect3 = p.a;
                return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d4fe4d0c4b5502f12ab3beb7d496dec5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d4fe4d0c4b5502f12ab3beb7d496dec5") : p.a(p.c(context, str2).getAbsolutePath(), str3);
            default:
                return null;
        }
    }

    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7460284707683eea4b4a1f73ad45ad04", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7460284707683eea4b4a1f73ad45ad04");
        }
        if (this.t) {
            switch (this.r) {
                case 1:
                case 2:
                case 3:
                    String str = this.h;
                    String str2 = this.i;
                    Object[] objArr2 = {context, str, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = p.a;
                    return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7d3344d55e4de022dae349b4f701959c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7d3344d55e4de022dae349b4f701959c") : new File(p.a(context, str), str2)).getAbsolutePath();
                default:
                    return null;
            }
        }
        switch (this.r) {
            case 1:
                return p.b(context, this.f).getAbsolutePath();
            case 2:
            case 3:
                return p.a(context, this.h, this.f).getAbsolutePath();
            default:
                return null;
        }
    }

    public final String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b4c94c17da1ae9943d111dba6203e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b4c94c17da1ae9943d111dba6203e4");
        }
        String a2 = a(context);
        if (this.x == null) {
            a(a2);
        }
        return this.x != null ? new DioFile(a2, this.x).h() : a2;
    }

    public final synchronized boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557c8ed62bd45096bf9c269b26e5cf78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557c8ed62bd45096bf9c269b26e5cf78")).booleanValue();
        }
        return a(context, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileInputStream, java.io.InputStream] */
    public final synchronized boolean a(Context context, int i) {
        Closeable[] closeableArr;
        ?? fileInputStream;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1780b3e11e10c32f49b58ba940151fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1780b3e11e10c32f49b58ba940151fa2")).booleanValue();
        } else if (this.u) {
            return true;
        } else {
            this.u = (this.t || bg.b(a(context), "__mmp_file_unzip_done_check")) && f(context);
            if (this.u && !this.t) {
                this.s = i;
                Properties properties = new Properties();
                Charset charset = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(new File(a(context), "__mmp_file_unzip_done_check"));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (FileNotFoundException e) {
                    e = e;
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                } catch (IOException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    charset = StandardCharsets.UTF_8;
                    properties.load(new InputStreamReader((InputStream) fileInputStream, charset));
                    closeableArr = new Closeable[]{fileInputStream};
                } catch (FileNotFoundException e5) {
                    e = e5;
                    charset = fileInputStream;
                    e.printStackTrace();
                    closeableArr = new Closeable[]{charset};
                    x.a(closeableArr);
                    this.j = Integer.parseInt(properties.getProperty("downloadType", "0"));
                    this.n = properties.getProperty("extraSource");
                    return this.u;
                } catch (UnsupportedEncodingException e6) {
                    e = e6;
                    charset = fileInputStream;
                    e.printStackTrace();
                    closeableArr = new Closeable[]{charset};
                    x.a(closeableArr);
                    this.j = Integer.parseInt(properties.getProperty("downloadType", "0"));
                    this.n = properties.getProperty("extraSource");
                    return this.u;
                } catch (IOException e7) {
                    e = e7;
                    charset = fileInputStream;
                    e.printStackTrace();
                    closeableArr = new Closeable[]{charset};
                    x.a(closeableArr);
                    this.j = Integer.parseInt(properties.getProperty("downloadType", "0"));
                    this.n = properties.getProperty("extraSource");
                    return this.u;
                } catch (Exception e8) {
                    e = e8;
                    charset = fileInputStream;
                    e.printStackTrace();
                    closeableArr = new Closeable[]{charset};
                    x.a(closeableArr);
                    this.j = Integer.parseInt(properties.getProperty("downloadType", "0"));
                    this.n = properties.getProperty("extraSource");
                    return this.u;
                } catch (Throwable th2) {
                    th = th2;
                    charset = fileInputStream;
                    x.a((Closeable[]) new Closeable[]{charset});
                    throw th;
                }
                x.a(closeableArr);
                this.j = Integer.parseInt(properties.getProperty("downloadType", "0"));
                this.n = properties.getProperty("extraSource");
            }
            return this.u;
        }
    }

    public final boolean d(Context context) {
        Closeable[] closeableArr;
        FileOutputStream fileOutputStream;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3418afebad7a7d5e67c3fe7f2805c20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3418afebad7a7d5e67c3fe7f2805c20")).booleanValue();
        }
        this.s = 2;
        Properties properties = new Properties();
        properties.setProperty("md5", TextUtils.isEmpty(this.f) ? "0" : this.f);
        properties.setProperty("downloadType", String.valueOf(this.j));
        if (!TextUtils.isEmpty(this.n)) {
            properties.setProperty("extraSource", String.valueOf(this.n));
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(a(context), "__mmp_file_unzip_done_check"));
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            e = e;
        } catch (UnsupportedEncodingException e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        try {
            properties.store(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8), (String) null);
            closeableArr = new Closeable[]{fileOutputStream};
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            closeableArr = new Closeable[]{fileOutputStream2};
            x.a(closeableArr);
            return true;
        } catch (UnsupportedEncodingException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            closeableArr = new Closeable[]{fileOutputStream2};
            x.a(closeableArr);
            return true;
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            closeableArr = new Closeable[]{fileOutputStream2};
            x.a(closeableArr);
            return true;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            x.a(fileOutputStream2);
            throw th;
        }
        x.a(closeableArr);
        return true;
    }

    public final boolean e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803dbb12ab1d145979941d7f2b751cdf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803dbb12ab1d145979941d7f2b751cdf")).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        sb.append("/__mmp_file_unzip_done_check");
        boolean z = s.a(sb.toString()) && s.a(a(context)) && (this.t || s.a(i(context)));
        com.meituan.mmp.lib.trace.b.b("MMPPackageInfo#clearStorage", Boolean.valueOf(z), toString());
        return z;
    }

    public final boolean f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd057bb0855bb2e89777c9daa4336ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd057bb0855bb2e89777c9daa4336ae")).booleanValue();
        }
        if (this.v && !a(a(context))) {
            com.meituan.mmp.lib.trace.b.d("MMPPackageInfo#checkSourceFileReady", "dioFileNotExist");
            return false;
        } else if (!g(context).c()) {
            com.meituan.mmp.lib.trace.b.d("MMPPackageInfo#checkSourceFileReady", "serviceFileNotExist");
            return false;
        } else if (!e() || j(context).c()) {
            return true;
        } else {
            com.meituan.mmp.lib.trace.b.d("MMPPackageInfo#checkSourceFileReady", "configFileNotExist");
            return false;
        }
    }

    private DioFile j(Context context) {
        String b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a12a77a52cbad1730310f7080c53e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a12a77a52cbad1730310f7080c53e9");
        }
        if (!e() || (b2 = b(context)) == null) {
            return null;
        }
        return new DioFile(b2, "app-config.json");
    }

    public final DioFile g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fed41029cdd1af5e1a21b320141d16", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fed41029cdd1af5e1a21b320141d16");
        }
        String b2 = b(context);
        if (b2 != null) {
            return new DioFile(b2, d() ? c : b);
        }
        return null;
    }

    public final DioFile h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924fa49db7b648d64b1fca0de74bc9b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924fa49db7b648d64b1fca0de74bc9b0");
        }
        String b2 = b(context);
        if (b2 != null) {
            return new DioFile(b2, PackageInfoWrapper.PACKAGE_PAGE_BOOTSTRAP);
        }
        return null;
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9216ba0ea41d735893d5cf635dee0f0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9216ba0ea41d735893d5cf635dee0f0c")).booleanValue();
        }
        DioFile[] m = new DioFile(str).m();
        if (m != null) {
            for (DioFile dioFile : m) {
                if (dioFile.o()) {
                    this.x = dioFile.e();
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aaa2508867c4c1f62873c10fdca6fa9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aaa2508867c4c1f62873c10fdca6fa9");
        }
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + "{name:" + this.g + " type: " + this.r + " isInner: " + this.t + " version: " + this.d + " md5: " + this.f + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf74ce8029f3e2e280db0d8aa1eb647f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf74ce8029f3e2e280db0d8aa1eb647f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MMPPackageInfo mMPPackageInfo = (MMPPackageInfo) obj;
        return Objects.equals(this.d, mMPPackageInfo.d) && Objects.equals(this.f, mMPPackageInfo.f) && Objects.equals(this.g, mMPPackageInfo.g) && Objects.equals(this.h, mMPPackageInfo.h);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10bcb9a9d26a6622d81d3819be7e1189", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10bcb9a9d26a6622d81d3819be7e1189")).intValue() : Objects.hash(this.d, this.f, this.g, this.h);
    }
}
