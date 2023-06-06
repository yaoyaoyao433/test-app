package com.meituan.android.mtplayer.video.proxy.file;

import com.meituan.android.mtplayer.video.proxy.j;
import com.meituan.android.mtplayer.video.proxy.n;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.meituan.android.mtplayer.video.proxy.a {
    public static ChangeQuickRedirect a;
    public File b;
    private final a c;
    private RandomAccessFile d;

    public b(File file, a aVar) throws j {
        File file2;
        Object[] objArr = {file, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc600ae24e2cdb650190a6c98d1a415", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc600ae24e2cdb650190a6c98d1a415");
            return;
        }
        try {
            n.a(aVar);
            this.c = aVar;
            File parentFile = file.getParentFile();
            Object[] objArr2 = {parentFile};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8c332c2fa960542e92d0fd39cdc6ed95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8c332c2fa960542e92d0fd39cdc6ed95");
            } else if (parentFile.exists()) {
                if (!parentFile.isDirectory()) {
                    throw new IOException("File " + parentFile + " is not directory!");
                }
            } else if (!parentFile.mkdirs()) {
                throw new IOException(String.format("Directory %s can't be created", parentFile.getAbsolutePath()));
            }
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                File parentFile2 = file.getParentFile();
                file2 = new File(parentFile2, file.getName() + ".download");
            }
            this.b = file2;
            this.d = new RandomAccessFile(this.b, exists ? r.o : "rw");
        } catch (IOException e) {
            throw new j("Error using file " + file + " as disc cache", e);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.a
    public final synchronized long a() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e46785537239eef9f0df1e5d32fa2d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e46785537239eef9f0df1e5d32fa2d0")).longValue();
        }
        try {
            return this.d.length();
        } catch (IOException e) {
            throw new j("Error reading length of file " + this.b, e);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.a
    public final synchronized int a(byte[] bArr, long j, int i) throws j {
        Object[] objArr = {bArr, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf5f803f0572a8c0295b7169ed7491da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf5f803f0572a8c0295b7169ed7491da")).intValue();
        }
        try {
            this.d.seek(j);
        } catch (IOException e) {
            e = e;
        }
        try {
            return this.d.read(bArr, 0, i);
        } catch (IOException e2) {
            e = e2;
            throw new j(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(a()), Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.a
    public final synchronized void a(byte[] bArr, int i) throws j {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d3951e397ec80d25fe6f5ddaaa98b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d3951e397ec80d25fe6f5ddaaa98b5");
            return;
        }
        try {
            if (d()) {
                throw new j("Error append cache: cache file " + this.b + " is completed!");
            }
            this.d.seek(a());
            this.d.write(bArr, 0, i);
        } catch (IOException e) {
            throw new j(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.d, 8192), e);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.a
    public final synchronized void b() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09ef3ed25af30e3cc43178ca5429df5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09ef3ed25af30e3cc43178ca5429df5");
            return;
        }
        try {
            this.d.close();
            this.c.a(this.b);
        } catch (IOException e) {
            throw new j("Error closing file " + this.b, e);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.a
    public final synchronized void c() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575f31eb511444b07efc148ac6e935e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575f31eb511444b07efc148ac6e935e8");
        } else if (d()) {
        } else {
            b();
            File file = new File(this.b.getParentFile(), this.b.getName().substring(0, this.b.getName().length() - 9));
            if (!this.b.renameTo(file)) {
                throw new j("Error renaming file " + this.b + " to " + file + " for completion!");
            }
            this.b = file;
            try {
                this.d = new RandomAccessFile(this.b, r.o);
                this.c.a(this.b);
            } catch (IOException e) {
                throw new j("Error opening " + this.b + " as disc cache", e);
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.a
    public final synchronized boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166e2722992b33fef7a618019d389c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166e2722992b33fef7a618019d389c1c")).booleanValue();
        }
        File file = this.b;
        Object[] objArr2 = {file};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return !(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c2f0f095eb7f1deaef94696aa8e986b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c2f0f095eb7f1deaef94696aa8e986b")).booleanValue() : file.getName().endsWith(".download"));
    }
}
