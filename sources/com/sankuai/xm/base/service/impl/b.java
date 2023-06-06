package com.sankuai.xm.base.service.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.util.LruCache;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.d;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.service.a implements d {
    public static ChangeQuickRedirect a;
    private final LruCache<Uri, a> b;
    private final String[] c;
    private t d;
    private volatile ContentObserver e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c74c90ee2f656a3744c893866acc151", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c74c90ee2f656a3744c893866acc151");
            return;
        }
        this.b = new LruCache<>(100);
        if (Build.VERSION.SDK_INT > 29) {
            this.c = new String[]{"_display_name", "relative_path", "_size", "date_modified", "mime_type"};
        } else {
            this.c = new String[]{"_display_name", "_data", "_size", "date_modified", "mime_type"};
        }
    }

    @Override // com.sankuai.xm.base.service.d
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378b1e95b44b2976bf969389469e1df6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378b1e95b44b2976bf969389469e1df6");
        }
        if (str == null) {
            return null;
        }
        File j = j(str);
        if (j != null) {
            return j.getName();
        }
        return c(str, "_display_name");
    }

    @Override // com.sankuai.xm.base.service.d
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cdb195591857d81903d18d27e1ed205", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cdb195591857d81903d18d27e1ed205");
        }
        if (str == null) {
            return null;
        }
        File j = j(str);
        if (j != null) {
            return j.getPath();
        }
        return c(str, Build.VERSION.SDK_INT > 29 ? "relative_path" : "_data");
    }

    @Override // com.sankuai.xm.base.service.d
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754a949a277f4c12106df53cf794c22a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754a949a277f4c12106df53cf794c22a")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        File j = j(str);
        if (j != null) {
            if (Build.VERSION.SDK_INT > 29) {
                return j.exists() && j.canRead();
            }
            return j.exists();
        }
        Uri i = i(str);
        if (a(i)) {
            a aVar = this.b.get(i);
            return (aVar != null && aVar.a(null)) || b(i) != null;
        }
        return false;
    }

    @Override // com.sankuai.xm.base.service.d
    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8323adeb037e211e12dc8fdbab9c4c64", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8323adeb037e211e12dc8fdbab9c4c64")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        File j = j(str);
        if (j != null) {
            if (j.isDirectory()) {
                return k.b(j);
            }
            return j.delete();
        }
        Uri i = i(str);
        return a(i) && b().a(i, (String) null, (String[]) null) > 0;
    }

    @Override // com.sankuai.xm.base.service.d
    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c644d0549337bf1566538fbc9b9a0454", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c644d0549337bf1566538fbc9b9a0454")).booleanValue();
        }
        if (ac.a(str) || ac.a(str2)) {
            return false;
        }
        File j = j(str);
        File j2 = j(str2);
        if (j != null && j2 != null) {
            return k.d(str, str2);
        }
        return k.c(str, str2);
    }

    @Override // com.sankuai.xm.base.service.d
    public final long e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142597f266fde8db7f80d413833d3e62", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142597f266fde8db7f80d413833d3e62")).longValue();
        }
        if (str == null) {
            return 0L;
        }
        File j = j(str);
        if (j != null) {
            return j.length();
        }
        return b(str, "_size");
    }

    @Override // com.sankuai.xm.base.service.d
    public final String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc5e6e6076e771cb5cc7f00abb2e782", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc5e6e6076e771cb5cc7f00abb2e782");
        }
        if (str == null) {
            return null;
        }
        if (j(str) != null) {
            return k.i(str);
        }
        return c(str, "mime_type");
    }

    @Override // com.sankuai.xm.base.service.d
    public final InputStream g(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d396fda28d744cf8287cce9b4edc88cd", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d396fda28d744cf8287cce9b4edc88cd");
        }
        if (str == null) {
            return null;
        }
        File j = j(str);
        if (j != null) {
            return new FileInputStream(j);
        }
        Uri i = i(str);
        if (a(i)) {
            return b().b(i);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.service.d
    public final OutputStream h(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ecabc1fb84cf3f4f128b0745bd12b7", 6917529027641081856L)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ecabc1fb84cf3f4f128b0745bd12b7");
        }
        Object[] objArr2 = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89037c502aee8dddf58c80fcf201eb4e", 6917529027641081856L)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89037c502aee8dddf58c80fcf201eb4e");
        }
        if (str != null) {
            File j = j(str);
            if (j != null) {
                k.s(str);
                return new FileOutputStream(j);
            }
            Uri i = i(str);
            if (a(i)) {
                return b().c(i);
            }
            return null;
        }
        return null;
    }

    private static Uri i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1338533243c71d0026fd003388042a4", 6917529027641081856L)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1338533243c71d0026fd003388042a4");
        }
        if (ac.a(str)) {
            str = "";
        }
        if (str.startsWith(File.separator)) {
            return Uri.fromFile(new File(str));
        }
        return Uri.parse(str);
    }

    private File j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa242c79ac9bc4f90b0a134ab4ad6723", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa242c79ac9bc4f90b0a134ab4ad6723");
        }
        if (str == null) {
            return null;
        }
        if (str.startsWith(File.separator) || !str.contains("://")) {
            return new File(str);
        }
        if (str.startsWith("file://")) {
            return new File(str.substring(7));
        }
        return null;
    }

    private boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "126a3b6dae1c774cb6058b970fbfc0e3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "126a3b6dae1c774cb6058b970fbfc0e3")).booleanValue() : ac.a(uri.getScheme(), "content", "android.resource");
    }

    private long b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5912f90620e0af0fa94f77e82d45cf72", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5912f90620e0af0fa94f77e82d45cf72")).longValue();
        }
        String c = c(str, str2);
        if (c != null) {
            try {
                return Long.parseLong(c);
            } catch (Exception e) {
                com.sankuai.xm.log.a.a(e);
                return 0L;
            }
        }
        return 0L;
    }

    private String c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450ce34f0ec29e85d4edb69b97c3f865", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450ce34f0ec29e85d4edb69b97c3f865");
        }
        Uri i = i(str);
        if (!a(i)) {
            com.sankuai.xm.log.a.c("readStringColumn: scheme not support: " + i, new Object[0]);
            return null;
        }
        a aVar = this.b.get(i);
        if (aVar != null && aVar.a(str2)) {
            return aVar.d.get(str2);
        }
        a b = b(i);
        if (b == null) {
            return null;
        }
        return b.d.get(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    private a b(Uri uri) {
        Cursor cursor;
        String[] strArr;
        ?? r0 = 1;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b6e5ca5eacc5896e3b75fd6a799b42", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b6e5ca5eacc5896e3b75fd6a799b42");
        }
        try {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48ee63317bbd71a25861daab98b915f2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48ee63317bbd71a25861daab98b915f2");
                } else if (this.e == null) {
                    synchronized (this) {
                        if (this.e == null) {
                            this.e = new ContentObserver(null) { // from class: com.sankuai.xm.base.service.impl.b.1
                                public static ChangeQuickRedirect a;

                                {
                                    super(null);
                                }

                                @Override // android.database.ContentObserver
                                public final void onChange(boolean z, @Nullable Uri uri2) {
                                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a784d88fcff1c5209c0cfe91f28c069", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a784d88fcff1c5209c0cfe91f28c069");
                                        return;
                                    }
                                    super.onChange(z, uri2);
                                    if (uri2 != null) {
                                        com.sankuai.xm.log.a.b("FileService::mMediaObserver.change, %s", (a) b.this.b.remove(uri2));
                                    }
                                }
                            };
                            b().a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.e);
                            b().a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.e);
                        }
                    }
                }
                cursor = b().a(uri, this.c, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            a aVar = new a();
                            aVar.b = uri;
                            aVar.d = new HashMap(this.c.length);
                            for (String str : this.c) {
                                int columnIndex = cursor.getColumnIndex(str);
                                if (columnIndex >= 0) {
                                    aVar.d.put(str, cursor.getString(columnIndex));
                                }
                            }
                            aVar.c = System.currentTimeMillis();
                            this.b.put(uri, aVar);
                            m.a(cursor);
                            return aVar;
                        }
                    } catch (Exception e) {
                        e = e;
                        com.sankuai.xm.log.a.a(e);
                        m.a(cursor);
                        return null;
                    }
                }
                this.b.remove(uri);
            } catch (Throwable th) {
                th = th;
                m.a(r0);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            r0 = 0;
            m.a(r0);
            throw th;
        }
        m.a(cursor);
        return null;
    }

    private t b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e3e8257cea7f7a53b2067e8053f36f", 6917529027641081856L)) {
            return (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e3e8257cea7f7a53b2067e8053f36f");
        }
        if (this.d == null) {
            this.d = k.b(f.m().g());
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Uri b;
        public long c;
        public Map<String, String> d;

        public a() {
        }

        public final boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a24432682b07b66eca46242496ad219", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a24432682b07b66eca46242496ad219")).booleanValue();
            }
            return this.c != 0 && Math.abs(System.currentTimeMillis() - this.c) <= 1000 && this.d != null && (ac.a(str) || this.d.get(str) != null);
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad9a9a30832ec09f84fc48cb5fc4b85", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad9a9a30832ec09f84fc48cb5fc4b85")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffad9dd149781dccdd7250a9487af51", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffad9dd149781dccdd7250a9487af51")).intValue() : Objects.hash(this.b);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d641bf297a23a26f00ca9d4514b171bd", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d641bf297a23a26f00ca9d4514b171bd");
            }
            return "CRFileInfo{uri=" + this.b + ", lastStamp=" + this.c + '}';
        }
    }
}
