package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.e;
import com.facebook.soloader.l;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends e {
    final int a;
    final Map<String, String> b;

    public a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.b = new HashMap();
        this.a = i;
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.l
    protected final l.e a() throws IOException {
        return new C0153a(this);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0153a extends e.b {
        private File e;
        private final int f;

        C0153a(e eVar) throws IOException {
            super(eVar);
            this.e = new File(a.this.g.getApplicationInfo().nativeLibraryDir);
            this.f = a.this.a;
        }

        @Override // com.facebook.soloader.e.b
        protected final boolean a(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = true;
            if (str.equals(a.this.h)) {
                a.this.h = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.f & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.e, str);
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
            a.this.b.put(str, str2);
            return z;
        }
    }

    @Override // com.facebook.soloader.l
    protected final byte[] b() throws IOException {
        File canonicalFile = this.e.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(j.a(this.g));
            if ((this.a & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.g.getApplicationInfo().nativeLibraryDir;
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
