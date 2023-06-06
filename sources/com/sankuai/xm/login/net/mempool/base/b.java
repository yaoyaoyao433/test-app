package com.sankuai.xm.login.net.mempool.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b<T> {
    public static ChangeQuickRedirect a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected boolean f;
    protected d<T> g;
    protected d<T> h;
    protected b<T>.a i;

    public abstract int a(T t, int i);

    public abstract void a(byte b);

    public abstract byte g(int i);

    public abstract byte h(int i);

    public abstract byte n();

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac677e04f4d36426094027c44eca81a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac677e04f4d36426094027c44eca81a1");
            return;
        }
        this.b = i;
        this.c = this.b;
        this.d = 0;
        this.e = -1;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public final boolean a(d<T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8658aa33896434c266d6611f0daeb1de", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8658aa33896434c266d6611f0daeb1de")).booleanValue();
        }
        if (dVar == null) {
            return false;
        }
        if (this.g == null) {
            this.g = dVar;
            this.h = this.g;
            this.i = new a();
            this.i.b = this.g;
            this.i.c = 0;
            this.i.d = 0;
        } else {
            this.h.a(dVar);
            this.h = dVar;
        }
        this.h.a((d) null);
        return true;
    }

    public final d<T> a() {
        return this.g;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf30e47e92c672c49f60b8de20b0099", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf30e47e92c672c49f60b8de20b0099");
        } else if (i > this.c || i < 0) {
            throw new IllegalArgumentException("Bad position " + i + " with limit " + this.c);
        } else {
            this.d = i;
            l();
            if (this.e > this.d) {
                this.e = -1;
            }
        }
    }

    public final int d() {
        return this.c;
    }

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342fe810ae836d42fa6aac1915573d7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342fe810ae836d42fa6aac1915573d7d");
        } else if (i > this.b || i < 0) {
            throw new IllegalArgumentException("Bad limit " + i + " with capacity " + this.b);
        } else {
            this.c = i;
            if (this.d > this.c) {
                this.d = this.c;
                l();
            }
            if (this.e > this.c) {
                this.e = -1;
            }
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "737d943f4613a9893e05af4f089a5d69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "737d943f4613a9893e05af4f089a5d69");
            return;
        }
        this.d = 0;
        this.c = this.b;
        this.e = -1;
        l();
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d995e5de3d267c9a52c730113ad3f5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d995e5de3d267c9a52c730113ad3f5c");
            return;
        }
        this.c = this.d;
        this.d = 0;
        this.e = -1;
        l();
    }

    public final int g() {
        return this.c - this.d;
    }

    public final boolean h() {
        return this.d < this.c;
    }

    public final int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc76a9f676c306a9ab3267dad86106b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc76a9f676c306a9ab3267dad86106b")).intValue();
        }
        if (this.d >= this.c) {
            throw new BufferUnderflowException();
        }
        a(true);
        int i = this.d;
        this.d = i + 1;
        return i;
    }

    public final int c(int i) {
        Object[] objArr = {4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b46a6d4cdf469d7f2caf7fbdda464c", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b46a6d4cdf469d7f2caf7fbdda464c")).intValue() : a(4, true);
    }

    public final int a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "311a39607eb18d9d06050dab82445643", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "311a39607eb18d9d06050dab82445643")).intValue();
        }
        if (this.c - this.d < i) {
            throw new BufferUnderflowException();
        }
        int i2 = this.d;
        this.d += i;
        c(i, z);
        return i2;
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1412e55e90e5dd259470c5490fa6ae27", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1412e55e90e5dd259470c5490fa6ae27")).intValue();
        }
        if (this.d >= this.c) {
            throw new BufferOverflowException();
        }
        a(true);
        int i = this.d;
        this.d = i + 1;
        return i;
    }

    public final int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec1a0d1e4c7d7860f1bfd5645009527", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec1a0d1e4c7d7860f1bfd5645009527")).intValue() : b(i, true);
    }

    public final int b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab04c07e280760f96770429c396c164", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab04c07e280760f96770429c396c164")).intValue();
        }
        if (this.c - this.d < i) {
            throw new BufferOverflowException();
        }
        int i2 = this.d;
        this.d += i;
        c(i, z);
        return i2;
    }

    public final int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f268767cd2fe22546859431dd1b1e12", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f268767cd2fe22546859431dd1b1e12")).intValue();
        }
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException("index=" + i + " out of bounds (limit=" + this.c + CommonConstant.Symbol.BRACKET_RIGHT);
        }
        return i;
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7bece235f5e79308084bc947cf8bce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7bece235f5e79308084bc947cf8bce");
            return;
        }
        int i4 = i + i2;
        if ((i | i2 | i4 | (i3 - i4)) >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("off=" + i + ", len=" + i2 + " out of bounds (size=" + i3 + CommonConstant.Symbol.BRACKET_RIGHT);
    }

    private b<T>.a a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38c110035d06520f8d99f827fc92678", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38c110035d06520f8d99f827fc92678");
        }
        if (this.i == null) {
            throw new IndexOutOfBoundsException("cursor is null");
        }
        if (this.i.a(true) == -1) {
            throw new IndexOutOfBoundsException("no more pages, cursor can not move to next");
        }
        return this.i;
    }

    private b<T>.a c(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9505ed28c9a396c1f2ea8fea34ca00", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9505ed28c9a396c1f2ea8fea34ca00");
        }
        if (this.i == null) {
            throw new IndexOutOfBoundsException("cursor is null");
        }
        if (this.i.a(i, z) == -1) {
            throw new IndexOutOfBoundsException("no more pages, cursor can not move to next");
        }
        return this.i;
    }

    public final b<T>.a k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca59f818e5cc166b96e782c2cfc404c", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca59f818e5cc166b96e782c2cfc404c");
        }
        if (this.i == null) {
            throw new IndexOutOfBoundsException("cursor is null");
        }
        return this.i;
    }

    public final b<T>.a f(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1164611bd38742ab5e6abd5871a58ae1", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1164611bd38742ab5e6abd5871a58ae1");
        }
        if (i < 0 || i > this.c) {
            throw new IndexOutOfBoundsException("index=" + i + " out of bounds (limit=" + this.c + CommonConstant.Symbol.BRACKET_RIGHT);
        }
        for (d<T> dVar = this.g; dVar != null; dVar = dVar.b()) {
            if (dVar.c() + i2 > i) {
                b<T>.a aVar = new a();
                aVar.b = dVar;
                aVar.c = i2;
                aVar.d = i - i2;
                return aVar;
            } else if (dVar.c() + i2 == i && dVar.b() == null) {
                b<T>.a aVar2 = new a();
                aVar2.b = dVar;
                aVar2.c = i2;
                aVar2.d = i - i2;
                return aVar2;
            } else {
                i2 += dVar.c();
            }
        }
        throw new IndexOutOfBoundsException("no more pages");
    }

    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea81703d574803e60ddaec743c1439db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea81703d574803e60ddaec743c1439db");
            return;
        }
        this.i = f(this.d);
        this.i.a();
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b88a9fe71d6293f1588d9946f1f0b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b88a9fe71d6293f1588d9946f1f0b6");
        } else if (this.i != null) {
            this.i.a();
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552e2ba00059524ce442cdfc4b7285d6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552e2ba00059524ce442cdfc4b7285d6");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TiBuffer {");
        sb.append(" mCapacity = " + this.b);
        sb.append(", mPosition = " + this.d);
        sb.append(", mLimit = " + this.c);
        sb.append(", mReadOnly = " + this.f);
        sb.append("\npages = [");
        for (d<T> dVar = this.g; dVar != null; dVar = dVar.b()) {
            sb.append("\n");
            sb.append("    ");
            sb.append(dVar.toString());
        }
        sb.append("\n]\n}");
        return sb.toString();
    }

    private void b(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcfd20a1891d5449d068ee0f3a2accb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcfd20a1891d5449d068ee0f3a2accb");
            return;
        }
        a(0, i2, bArr.length);
        if (i2 > g()) {
            throw new BufferUnderflowException();
        }
        int i3 = i2 + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = n();
        }
    }

    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78c54b97200a3a63dcc82fbb6f10f2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78c54b97200a3a63dcc82fbb6f10f2c");
        } else {
            b(bArr, 0, bArr.length);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5e8de298a2bdc08b24b3a22a95b16f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5e8de298a2bdc08b24b3a22a95b16f");
            return;
        }
        a(i, i2, bArr.length);
        if (i2 > g()) {
            throw new BufferOverflowException();
        }
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i]);
            i++;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public d<T> b;
        public int c;
        public int d;

        public a() {
        }

        private int b(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb9d5f38d49f55f38564e90e88008e0", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb9d5f38d49f55f38564e90e88008e0")).intValue();
            }
            if (this.d >= this.b.c() - 1) {
                return -1;
            }
            if (z) {
                this.b.b(1);
            }
            int i = this.d;
            this.d = i + 1;
            return i;
        }

        private int b(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbeebfdf460c8ca2b947bd7ed9e93f0", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbeebfdf460c8ca2b947bd7ed9e93f0")).intValue();
            }
            if (this.d >= this.b.c() - i) {
                return -1;
            }
            int i2 = this.d;
            this.d += i;
            if (z) {
                this.b.b(i);
            }
            return i2;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c79cf6e04b07e1c07a5aebee87931b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c79cf6e04b07e1c07a5aebee87931b");
            } else {
                this.b.c(this.d);
            }
        }

        private int c(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add7dad82ca5561c08a63077c18ce48d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add7dad82ca5561c08a63077c18ce48d")).intValue() : c(1, z);
        }

        private int c(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff4a5bd87121b8612e59ead0591c8b1", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff4a5bd87121b8612e59ead0591c8b1")).intValue();
            }
            while (this.b != null) {
                int c = this.b.c() - this.d;
                if (c > i) {
                    this.d = i;
                    if (z) {
                        this.b.c(this.d);
                    }
                    return this.d;
                }
                i -= c;
                this.d = this.b.c();
                if (z) {
                    this.b.c(this.b.c());
                }
                this.b = this.b.b();
                if (this.b == null) {
                    break;
                }
                if (z) {
                    this.b.c(0);
                }
                this.c += this.b.c();
                this.d = 0;
            }
            if (i == 0) {
                return this.d;
            }
            return -1;
        }

        public final int a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6975db4ee80f14675a37a3de055251", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6975db4ee80f14675a37a3de055251")).intValue();
            }
            int b = b(z);
            if (b != -1) {
                return b;
            }
            if (c(z) != -1) {
                return this.d;
            }
            return -1;
        }

        public final int a(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff4dd36cc312e68e13b3c61cd10c960", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff4dd36cc312e68e13b3c61cd10c960")).intValue();
            }
            int b = b(i, z);
            if (b != -1) {
                return b;
            }
            if (c(i, z) != -1) {
                return this.d;
            }
            return -1;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b37f1393eb8bc456f5b465ee1c75b2", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b37f1393eb8bc456f5b465ee1c75b2");
            }
            return "Position{page=" + this.b + ", offset=" + this.c + ", position=" + this.d + '}';
        }
    }

    public b<T> a(b<T> bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d555f267d3e38aa454e4ce2ebd5fb2dd", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d555f267d3e38aa454e4ce2ebd5fb2dd");
        }
        a(i, i2, bVar.b);
        if (i2 <= g()) {
            int i3 = i2 + i;
            while (i < i3) {
                a(bVar.g(i));
                i++;
            }
            return this;
        }
        throw new BufferOverflowException();
    }
}
