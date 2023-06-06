package com.meituan.android.soloader;

import android.content.Context;
import android.os.Parcel;
import com.meituan.android.soloader.f;
import com.meituan.android.soloader.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends f {
    public static ChangeQuickRedirect a;
    final int b;
    final Map<String, String> c;

    public c(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        Object[] objArr = {context, file, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216e305ca2432cdb3966d794b218af48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216e305ca2432cdb3966d794b218af48");
            return;
        }
        this.c = new HashMap();
        this.b = i;
    }

    @Override // com.meituan.android.soloader.f, com.meituan.android.soloader.o
    public final o.e a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4105059d3812a50da40950936f9bade6", RobustBitConfig.DEFAULT_VALUE) ? (o.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4105059d3812a50da40950936f9bade6") : new a(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends f.b {
        public static ChangeQuickRedirect a;
        private File g;
        private final int h;

        public a(f fVar) throws IOException {
            super(fVar);
            Object[] objArr = {c.this, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee77145ce17d007e119fe1fa856ce94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee77145ce17d007e119fe1fa856ce94");
                return;
            }
            this.g = new File(c.this.l.getApplicationInfo().nativeLibraryDir);
            this.h = c.this.b;
        }

        @Override // com.meituan.android.soloader.f.b
        public final boolean a(ZipEntry zipEntry, String str) {
            String str2;
            boolean z = true;
            Object[] objArr = {zipEntry, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449f759751e82b38d48f9fc15738c673", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449f759751e82b38d48f9fc15738c673")).booleanValue();
            }
            String name = zipEntry.getName();
            if (str.equals(c.this.m)) {
                c.this.m = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.h & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.g, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        z = false;
                    }
                }
            }
            c.this.c.put(str, str2);
            return z;
        }
    }

    @Override // com.meituan.android.soloader.o
    public final byte[] b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e5b4ac9d9e35f1dc84644061815c1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e5b4ac9d9e35f1dc84644061815c1f");
        }
        File canonicalFile = this.h.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.a(this.l));
            if ((this.b & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.l.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
