package com.bumptech.glide.gifdecoder;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    private static final String k = "a";
    private static final Bitmap.Config l = Bitmap.Config.ARGB_8888;
    public ByteBuffer a;
    public byte[] b;
    public int[] c;
    public byte[] d;
    public c e;
    public InterfaceC0036a f;
    public Bitmap g;
    public ImageHeaderParser.ImageType h;
    public com.bumptech.glide.webpdecoder.a i;
    public AtomicBoolean j;
    private int[] m;
    private final int[] n;
    private final byte[] o;
    private short[] p;
    private byte[] q;
    private byte[] r;
    private int s;
    private boolean t;
    private int u;

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.gifdecoder.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0036a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        void a(Bitmap bitmap);
    }

    public a(InterfaceC0036a interfaceC0036a) {
        this(interfaceC0036a, ImageHeaderParser.ImageType.GIF);
    }

    public a(InterfaceC0036a interfaceC0036a, ImageHeaderParser.ImageType imageType) {
        this.n = new int[256];
        this.o = new byte[256];
        this.h = ImageHeaderParser.ImageType.GIF;
        this.j = new AtomicBoolean(false);
        this.f = interfaceC0036a;
        this.h = imageType;
        this.i = new com.bumptech.glide.webpdecoder.a();
        this.e = new c();
    }

    public final void a() {
        if (this.j.compareAndSet(true, false)) {
            if (ImageHeaderParser.ImageType.ANIMATED_WEBP != this.h) {
                this.s = -1;
            } else {
                this.i.a.g();
            }
        }
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP != this.h) {
            this.s = (this.s + 1) % this.e.c;
        } else {
            this.i.a.d();
        }
    }

    public final int a(int i) {
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP != this.h) {
            if (i < 0 || i >= this.e.c) {
                return -1;
            }
            return this.e.e.get(i).i;
        }
        return this.i.a.a(i);
    }

    public final int b() {
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP != this.h) {
            if (this.e.c <= 0 || this.s < 0) {
                return -1;
            }
            return a(this.s);
        }
        return this.i.a.e();
    }

    public final int c() {
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP != this.h) {
            return this.e.c;
        }
        return this.i.a.f();
    }

    public final int d() {
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP != this.h) {
            return this.s;
        }
        return this.i.a.j();
    }

    public final synchronized Bitmap e() {
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP == this.h) {
            return this.i.a();
        }
        if (this.e.c <= 0 || this.s < 0) {
            if (Log.isLoggable(k, 3)) {
                StringBuilder sb = new StringBuilder("unable to decode frame, frameCount=");
                sb.append(this.e.c);
                sb.append(" framePointer=");
                sb.append(this.s);
            }
            this.u = 1;
        }
        if (this.u != 1 && this.u != 2) {
            this.u = 0;
            b bVar = this.e.e.get(this.s);
            int i = this.s - 1;
            b bVar2 = i >= 0 ? this.e.e.get(i) : null;
            this.m = bVar.k != null ? bVar.k : this.e.a;
            if (this.m == null) {
                Log.isLoggable(k, 3);
                this.u = 1;
                return null;
            }
            if (bVar.f) {
                System.arraycopy(this.m, 0, this.n, 0, this.m.length);
                this.m = this.n;
                this.m[bVar.h] = 0;
            }
            return a(bVar, bVar2);
        }
        if (Log.isLoggable(k, 3)) {
            new StringBuilder("Unable to decode frame, status=").append(this.u);
        }
        return null;
    }

    public final void a(c cVar, byte[] bArr) {
        if (ImageHeaderParser.ImageType.ANIMATED_WEBP == this.h) {
            this.i.a(bArr);
            return;
        }
        this.d = bArr;
        this.u = 0;
        this.s = -1;
        this.e = cVar;
        this.a = ByteBuffer.wrap(bArr);
        this.a.rewind();
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.t = false;
        Iterator<b> it = cVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g == 3) {
                this.t = true;
                break;
            }
        }
        this.b = new byte[cVar.f * cVar.g];
        this.c = new int[cVar.f * cVar.g];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r33.e.j == r34.h) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2 A[EDGE_INSN: B:139:0x01f2->B:94:0x01f2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf A[LOOP:2: B:51:0x00bd->B:52:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f6 A[LOOP:4: B:95:0x01f4->B:96:0x01f6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(com.bumptech.glide.gifdecoder.b r34, com.bumptech.glide.gifdecoder.b r35) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.a.a(com.bumptech.glide.gifdecoder.b, com.bumptech.glide.gifdecoder.b):android.graphics.Bitmap");
    }

    private int f() {
        try {
            return this.a.get() & 255;
        } catch (Exception unused) {
            this.u = 1;
            return 0;
        }
    }

    private int g() {
        int f = f();
        int i = 0;
        if (f > 0) {
            while (i < f) {
                int i2 = f - i;
                try {
                    this.a.get(this.o, i, i2);
                    i += i2;
                } catch (Exception e) {
                    Log.w(k, "Error Reading Block", e);
                    this.u = 1;
                }
            }
        }
        return i;
    }

    private Bitmap h() {
        Bitmap a = this.f.a(this.e.f, this.e.g, l);
        if (a == null) {
            a = Bitmap.createBitmap(this.e.f, this.e.g, l);
        }
        a(a);
        return a;
    }

    @TargetApi(12)
    private static void a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }
}
