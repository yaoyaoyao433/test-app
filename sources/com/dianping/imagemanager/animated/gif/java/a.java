package com.dianping.imagemanager.animated.gif.java;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a implements com.dianping.imagemanager.animated.b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private boolean A;
    private Bitmap B;
    private String C;
    private int[] c;
    private final int[] d;
    private ByteBuffer e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private int i;
    private int j;
    private d k;
    private short[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private int[] p;
    private int q;
    private c r;
    private InterfaceC0076a s;
    private Bitmap t;
    private Bitmap u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.animated.gif.java.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0076a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        void a(Bitmap bitmap);

        byte[] a(int i);

        int[] b(int i);
    }

    @Override // com.dianping.imagemanager.animated.b
    public final String q_() {
        return "gifdecode.java";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7252dbc469d08799f4951f56cfec875d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7252dbc469d08799f4951f56cfec875d");
            return;
        }
        this.d = new int[256];
        this.i = 0;
        this.j = 0;
        this.s = new e();
        this.r = new c();
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int a() {
        return this.r.g;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int b() {
        return this.r.h;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int c() {
        return this.w;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277aae55d50e1b8c4ffe5473d1a756bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277aae55d50e1b8c4ffe5473d1a756bf");
        } else {
            this.q = (this.q + 1) % this.r.d;
        }
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf8fdcd2636c5ddd02b48ada3a747f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf8fdcd2636c5ddd02b48ada3a747f9")).intValue();
        }
        if (this.r.d <= 0 || this.q < 0) {
            return 0;
        }
        int i = this.q;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09a8a550de682caa653329db6122bcc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09a8a550de682caa653329db6122bcc3")).intValue();
        }
        if (i < 0 || i >= this.r.d) {
            return -1;
        }
        return this.r.f.get(i).i;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final int f() {
        return this.r.d;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final void g() {
        this.q = -1;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final synchronized Bitmap h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca380ade92998f5a68f8345ebbf829b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca380ade92998f5a68f8345ebbf829b");
        }
        if (this.r.d <= 0 || this.q < 0) {
            if (Log.isLoggable(b, 3)) {
                StringBuilder sb = new StringBuilder("Unable to decode frame, frameCount=");
                sb.append(this.r.d);
                sb.append(", framePointer=");
                sb.append(this.q);
            }
            this.w = 1;
        }
        if (this.w != 1 && this.w != 2) {
            this.w = 0;
            b bVar = this.r.f.get(this.q);
            int i = this.q - 1;
            b bVar2 = i >= 0 ? this.r.f.get(i) : null;
            this.c = bVar.k != null ? bVar.k : this.r.b;
            if (this.c == null) {
                if (Log.isLoggable(b, 3)) {
                    new StringBuilder("No valid color table found for frame #").append(this.q);
                }
                this.w = 1;
                return null;
            }
            if (bVar.f) {
                System.arraycopy(this.c, 0, this.d, 0, this.c.length);
                this.c = this.d;
                this.c[bVar.h] = 0;
                if (this.q == 0) {
                    this.A = true;
                }
            }
            return a(bVar, bVar2);
        }
        if (Log.isLoggable(b, 3)) {
            new StringBuilder("Unable to decode frame, status=").append(this.w);
        }
        return null;
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e275f1abe735298ef01ca26fcda036d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e275f1abe735298ef01ca26fcda036d0");
            return;
        }
        this.r = null;
        if (this.t != null) {
            this.s.a(this.t);
        }
        this.u = null;
        this.t = null;
        this.e = null;
        this.A = false;
    }

    private synchronized void a(c cVar, byte[] bArr) {
        Object[] objArr = {cVar, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd14dfe8209f1c58f9cbb2429bd9bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd14dfe8209f1c58f9cbb2429bd9bf5");
        } else {
            a(cVar, ByteBuffer.wrap(bArr));
        }
    }

    private synchronized void a(c cVar, ByteBuffer byteBuffer) {
        Object[] objArr = {cVar, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81160197ab178a78f17b78674d9b1f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81160197ab178a78f17b78674d9b1f7f");
        } else {
            a(cVar, byteBuffer, 1);
        }
    }

    private synchronized void a(c cVar, ByteBuffer byteBuffer, int i) {
        Object[] objArr = {cVar, byteBuffer, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27a55243369e8d62ce3a56b95a87d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27a55243369e8d62ce3a56b95a87d96");
            return;
        }
        int highestOneBit = Integer.highestOneBit(1);
        this.w = 0;
        this.r = cVar;
        this.A = false;
        this.q = -1;
        this.e = byteBuffer.asReadOnlyBuffer();
        this.e.position(0);
        this.e.order(ByteOrder.LITTLE_ENDIAN);
        this.v = false;
        Iterator<b> it = cVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g == 3) {
                this.v = true;
                break;
            }
        }
        this.x = highestOneBit;
        this.z = cVar.g / highestOneBit;
        this.y = cVar.h / highestOneBit;
        this.o = this.s.a(cVar.g * cVar.h);
        this.p = this.s.b(this.z * this.y);
    }

    @Override // com.dianping.animated.base.AnimatedImageDecoder
    public final synchronized int a(byte[] bArr) {
        d dVar;
        c cVar;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4941080ab9c1bdfcb7e6075fd95fbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4941080ab9c1bdfcb7e6075fd95fbd")).intValue();
        }
        this.f = bArr;
        if (bArr != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "018e8c104941d1992b7585f97f3807e5", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "018e8c104941d1992b7585f97f3807e5");
            } else {
                if (this.k == null) {
                    this.k = new d();
                }
                dVar = this.k;
            }
            Object[] objArr3 = {bArr};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "a00a5a333f40ee1b02a6951b01ff188a", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (d) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "a00a5a333f40ee1b02a6951b01ff188a");
            } else {
                dVar.a();
                if (bArr != null) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    Object[] objArr4 = {wrap};
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "b60c58772de68fdf8f9e2ae08ca623b8", RobustBitConfig.DEFAULT_VALUE)) {
                        d dVar2 = (d) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "b60c58772de68fdf8f9e2ae08ca623b8");
                    } else {
                        dVar.a();
                        dVar.b = wrap.asReadOnlyBuffer();
                        dVar.b.position(0);
                        dVar.b.order(ByteOrder.LITTLE_ENDIAN);
                    }
                } else {
                    dVar.b = null;
                    dVar.c.c = 2;
                }
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = d.a;
            if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "4bad61ff0d90c250a83085018465d85d", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "4bad61ff0d90c250a83085018465d85d");
            } else if (dVar.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            } else {
                if (!dVar.c()) {
                    dVar.b();
                    if (!dVar.c()) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = d.a;
                        if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "085357fa3b3f8922bd646cd0ca041940", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "085357fa3b3f8922bd646cd0ca041940");
                        } else {
                            dVar.a(Integer.MAX_VALUE);
                        }
                        if (dVar.c.d < 0) {
                            dVar.c.c = 1;
                        }
                    }
                }
                cVar = dVar.c;
            }
            this.r = cVar;
            a(this.r, bArr);
        } else {
            this.w = 2;
        }
        return this.w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x03af, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r38.r.k == r39.h) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(com.dianping.imagemanager.animated.gif.java.b r39, com.dianping.imagemanager.animated.gif.java.b r40) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.animated.gif.java.a.a(com.dianping.imagemanager.animated.gif.java.b, com.dianping.imagemanager.animated.gif.java.b):android.graphics.Bitmap");
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ed348e53ac2d00cac2dfea45283691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ed348e53ac2d00cac2dfea45283691");
        } else if (this.i > this.j) {
        } else {
            if (this.h == null) {
                this.h = this.s.a(16384);
            }
            this.j = 0;
            this.i = Math.min(this.e.remaining(), 16384);
            this.e.get(this.h, 0, this.i);
        }
    }

    private int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54768381fb9da48ca9a369529391ab2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54768381fb9da48ca9a369529391ab2b")).intValue();
        }
        try {
            l();
            byte[] bArr = this.h;
            int i = this.j;
            this.j = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.w = 1;
            return 0;
        }
    }

    private int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a02147200d6ffa925144d8f03ddd9b69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a02147200d6ffa925144d8f03ddd9b69")).intValue();
        }
        int m = m();
        if (m > 0) {
            try {
                if (this.g == null) {
                    this.g = this.s.a(255);
                }
                int i = this.i - this.j;
                if (i >= m) {
                    System.arraycopy(this.h, this.j, this.g, 0, m);
                    this.j += m;
                } else if (this.e.remaining() + i >= m) {
                    System.arraycopy(this.h, this.j, this.g, 0, i);
                    this.j = this.i;
                    l();
                    int i2 = m - i;
                    System.arraycopy(this.h, 0, this.g, i, i2);
                    this.j += i2;
                } else {
                    this.w = 1;
                }
            } catch (Exception unused) {
                this.w = 1;
            }
        }
        return m;
    }

    private Bitmap o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9591e7407b90c828d7ba032148297a2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9591e7407b90c828d7ba032148297a2d");
        }
        Bitmap a2 = this.s.a(this.z, this.y, this.A ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        a(a2);
        return a2;
    }

    @TargetApi(12)
    private static void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8bcdb45e4166bc33b3db587a32ad26f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8bcdb45e4166bc33b3db587a32ad26f");
        } else if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }

    @Override // com.dianping.imagemanager.animated.b
    public final synchronized Bitmap p_() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491b91110d3e6c21bfa5cef1ee80d0fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491b91110d3e6c21bfa5cef1ee80d0fa");
        } else if (this.B != null) {
            return this.B;
        } else {
            this.B = com.dianping.imagemanager.image.cache.memory.b.a().a(this.C, com.dianping.imagemanager.image.cache.a.DEFAULT, false, true);
            if (this.B != null) {
                return this.B;
            }
            try {
                b bVar2 = this.r.f.get(0);
                Bitmap.Config config = bVar2.f ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                this.A = bVar2.f;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = config;
                this.B = com.sankuai.waimai.launcher.util.image.a.a(this.f, 0, this.f.length, options);
            } catch (Exception unused) {
                Log.e(b, "can't decode first frame using BitmapFactory");
            }
            if (this.B != null) {
                com.dianping.imagemanager.image.cache.memory.b.a().a(this.C, com.dianping.imagemanager.image.cache.a.DEFAULT, this.B, true);
                return this.B;
            }
            try {
                bVar = this.r.f.get(0);
                this.c = bVar.k != null ? bVar.k : this.r.b;
            } catch (Exception unused2) {
                Log.e(b, "can't decode first frame");
            }
            if (this.c == null) {
                Log.isLoggable(b, 3);
                this.w = 1;
                return null;
            }
            if (bVar.f) {
                this.A = true;
                System.arraycopy(this.c, 0, this.d, 0, this.c.length);
                this.c = this.d;
                this.c[bVar.h] = 0;
            }
            this.B = a(bVar, (b) null).copy(this.A ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, false);
            if (this.B != null) {
                com.dianping.imagemanager.image.cache.memory.b.a().a(this.C, com.dianping.imagemanager.image.cache.a.DEFAULT, this.B, true);
            }
            return this.B;
        }
    }

    @Override // com.dianping.imagemanager.animated.b
    public final void a(String str) {
        this.C = str;
    }
}
