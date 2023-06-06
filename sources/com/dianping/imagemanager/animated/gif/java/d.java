package com.dianping.imagemanager.animated.gif.java;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    ByteBuffer b;
    c c;
    private final byte[] d;
    private int e;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb24fb32e3c36d76b2ea5eca67e1dcea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb24fb32e3c36d76b2ea5eca67e1dcea");
            return;
        }
        this.d = new byte[256];
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7eea79d3cf489f2cf1f1b37db6d1b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7eea79d3cf489f2cf1f1b37db6d1b86");
            return;
        }
        this.b = null;
        Arrays.fill(this.d, (byte) 0);
        this.c = new c();
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.MAX_VALUE};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98a6d7cd2780a399d33299f2387ccdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98a6d7cd2780a399d33299f2387ccdf");
            return;
        }
        boolean z = false;
        while (!z && !c() && this.c.d <= Integer.MAX_VALUE) {
            int j = j();
            if (j == 33) {
                int j2 = j();
                if (j2 == 1) {
                    h();
                } else if (j2 == 249) {
                    this.c.e = new b();
                    d();
                } else {
                    switch (j2) {
                        case 254:
                            h();
                            continue;
                        case 255:
                            i();
                            String str = "";
                            for (int i2 = 0; i2 < 11; i2++) {
                                str = str + ((char) this.d[i2]);
                            }
                            if (str.equals("NETSCAPE2.0")) {
                                f();
                                break;
                            } else {
                                h();
                                continue;
                            }
                        default:
                            h();
                            continue;
                    }
                }
            } else if (j == 44) {
                if (this.c.e == null) {
                    this.c.e = new b();
                }
                e();
            } else if (j != 59) {
                this.c.c = 1;
            } else {
                z = true;
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff09cceb38a436bca754e94e44ea366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff09cceb38a436bca754e94e44ea366");
            return;
        }
        j();
        int j = j();
        this.c.e.g = (j & 28) >> 2;
        if (this.c.e.g == 0) {
            this.c.e.g = 1;
        }
        this.c.e.f = (j & 1) != 0;
        int k = k();
        if (k < 2) {
            k = 10;
        }
        this.c.e.i = k * 10;
        this.c.e.h = j();
        j();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d797445cfd29a28e87a8572223b8d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d797445cfd29a28e87a8572223b8d6");
            return;
        }
        this.c.e.a = k();
        this.c.e.b = k();
        this.c.e.c = k();
        this.c.e.d = k();
        int j = j();
        boolean z = (j & 128) != 0;
        int pow = (int) Math.pow(2.0d, (j & 7) + 1);
        this.c.e.e = (j & 64) != 0;
        if (z) {
            this.c.e.k = b(pow);
        } else {
            this.c.e.k = null;
        }
        this.c.e.j = this.b.position();
        g();
        if (c()) {
            return;
        }
        this.c.d++;
        this.c.f.add(this.c.e);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b8240018d579557187cee09de8990e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b8240018d579557187cee09de8990e");
            return;
        }
        do {
            i();
            if (this.d[0] == 1) {
                this.c.n = (this.d[1] & 255) | ((this.d[2] & 255) << 8);
            }
            if (this.e <= 0) {
                return;
            }
        } while (!c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098a16a6fedf5f24c3cfa4f7a4b3af2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098a16a6fedf5f24c3cfa4f7a4b3af2c");
            return;
        }
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) j());
        }
        if (!str.startsWith("GIF")) {
            this.c.c = 1;
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34fecd1dc2931425e7b5165cf9188ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34fecd1dc2931425e7b5165cf9188ac5");
        } else {
            this.c.g = k();
            this.c.h = k();
            int j = j();
            this.c.i = (j & 128) != 0;
            this.c.j = 2 << (j & 7);
            this.c.k = j();
            this.c.l = j();
        }
        if (!this.c.i || c()) {
            return;
        }
        this.c.b = b(this.c.j);
        this.c.m = this.c.b[this.c.k];
    }

    private int[] b(int i) {
        int[] iArr;
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9556fa7ac32e1e3d62aafe03cd547f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9556fa7ac32e1e3d62aafe03cd547f7");
        }
        byte[] bArr = new byte[i * 3];
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    e = e;
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
                    }
                    this.c.c = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            e = e2;
            iArr = null;
        }
        return iArr;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73dacd340511dd10001eb3b2d076d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73dacd340511dd10001eb3b2d076d3e");
            return;
        }
        j();
        h();
    }

    private void h() {
        int j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb816c4d6e93b0ca0958f7087c7a9a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb816c4d6e93b0ca0958f7087c7a9a8");
            return;
        }
        do {
            try {
                j = j();
                this.b.position(this.b.position() + j);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (j > 0);
    }

    private int i() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6668dbca44b6131b354209310ea8dc1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6668dbca44b6131b354209310ea8dc1")).intValue();
        }
        this.e = j();
        if (this.e > 0) {
            int i2 = 0;
            while (i < this.e) {
                try {
                    i2 = this.e - i;
                    this.b.get(this.d, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.e, e);
                    }
                    this.c.c = 1;
                }
            }
        }
        return i;
    }

    private int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad850d060e7278559d2455a2e7af8113", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad850d060e7278559d2455a2e7af8113")).intValue();
        }
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.c = 1;
            return 0;
        }
    }

    private int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b52e34f9187ee6de2e543c951edcadfa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b52e34f9187ee6de2e543c951edcadfa")).intValue() : this.b.getShort();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.c.c != 0;
    }
}
