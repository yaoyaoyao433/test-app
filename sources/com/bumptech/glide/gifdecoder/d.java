package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public ByteBuffer b;
    public c c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public void a() {
        boolean z = false;
        while (!z && !c()) {
            int g = g();
            if (g == 33) {
                int g2 = g();
                if (g2 == 1) {
                    e();
                } else if (g2 == 249) {
                    this.c.d = new b();
                    g();
                    int g3 = g();
                    this.c.d.g = (g3 & 28) >> 2;
                    if (this.c.d.g == 0) {
                        this.c.d.g = 1;
                    }
                    this.c.d.f = (g3 & 1) != 0;
                    short s = this.b.getShort();
                    if (s < 2) {
                        s = 10;
                    }
                    this.c.d.i = s * 10;
                    this.c.d.h = g();
                    g();
                } else {
                    switch (g2) {
                        case 254:
                            e();
                            continue;
                        case 255:
                            f();
                            String str = "";
                            for (int i = 0; i < 11; i++) {
                                str = str + ((char) this.a[i]);
                            }
                            if (str.equals("NETSCAPE2.0")) {
                                d();
                                break;
                            } else {
                                e();
                                continue;
                            }
                        default:
                            e();
                            continue;
                    }
                }
            } else if (g == 44) {
                if (this.c.d == null) {
                    this.c.d = new b();
                }
                this.c.d.a = this.b.getShort();
                this.c.d.b = this.b.getShort();
                this.c.d.c = this.b.getShort();
                this.c.d.d = this.b.getShort();
                int g4 = g();
                boolean z2 = (g4 & 128) != 0;
                int pow = (int) Math.pow(2.0d, (g4 & 7) + 1);
                this.c.d.e = (g4 & 64) != 0;
                if (z2) {
                    this.c.d.k = a(pow);
                } else {
                    this.c.d.k = null;
                }
                this.c.d.j = this.b.position();
                g();
                e();
                if (!c()) {
                    this.c.c++;
                    this.c.e.add(this.c.d);
                }
            } else if (g != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private void d() {
        do {
            f();
            if (this.a[0] == 1) {
                this.c.m = (this.a[1] & 255) | ((this.a[2] & 255) << 8);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!c());
    }

    public void b() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) g());
        }
        if (!str.startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        this.c.f = this.b.getShort();
        this.c.g = this.b.getShort();
        int g = g();
        this.c.h = (g & 128) != 0;
        this.c.i = 2 << (g & 7);
        this.c.j = g();
        this.c.k = g();
        if (!this.c.h || c()) {
            return;
        }
        this.c.a = a(this.c.i);
        this.c.l = this.c.a[this.c.j];
    }

    private int[] a(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
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
                    this.c.b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            e = e2;
            iArr = null;
        }
        return iArr;
    }

    private void e() {
        int g;
        do {
            g = g();
            this.b.position(this.b.position() + g);
        } while (g > 0);
    }

    private int f() {
        this.d = g();
        int i = 0;
        if (this.d > 0) {
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d, e);
                    }
                    this.c.b = 1;
                }
            }
        }
        return i;
    }

    private int g() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public boolean c() {
        return this.c.b != 0;
    }
}
