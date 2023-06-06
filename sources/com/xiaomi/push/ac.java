package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;
/* loaded from: classes6.dex */
public final class ac {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private final InputStream e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private ac(InputStream inputStream) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.k = 67108864;
        this.a = new byte[4096];
        this.b = 0;
        this.d = 0;
        this.e = inputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(byte[] bArr, int i, int i2) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.k = 67108864;
        this.a = bArr;
        this.b = i2 + i;
        this.d = i;
        this.e = null;
    }

    public static ac a(InputStream inputStream) {
        return new ac(inputStream);
    }

    private boolean a(boolean z) {
        if (this.d >= this.b) {
            if (this.g + this.b == this.h) {
                if (z) {
                    throw ce.a();
                }
                return false;
            }
            this.g += this.b;
            this.d = 0;
            this.b = this.e == null ? -1 : this.e.read(this.a);
            if (this.b == 0 || this.b < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.b + "\nThe InputStream implementation is buggy.");
            } else if (this.b == -1) {
                this.b = 0;
                if (z) {
                    throw ce.a();
                }
                return false;
            } else {
                g();
                int i = this.g + this.b + this.c;
                if (i > this.k || i < 0) {
                    throw ce.h();
                }
                return true;
            }
        }
        throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    }

    private byte[] c(int i) {
        if (i < 0) {
            throw ce.b();
        }
        if (this.g + this.d + i > this.h) {
            d((this.h - this.g) - this.d);
            throw ce.a();
        } else if (i <= this.b - this.d) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.a, this.d, bArr, 0, i);
            this.d += i;
            return bArr;
        } else if (i >= 4096) {
            int i2 = this.d;
            int i3 = this.b;
            this.g += this.b;
            this.d = 0;
            this.b = 0;
            int i4 = i3 - i2;
            int i5 = i - i4;
            Vector vector = new Vector();
            while (i5 > 0) {
                byte[] bArr2 = new byte[Math.min(i5, 4096)];
                int i6 = 0;
                while (i6 < bArr2.length) {
                    int read = this.e == null ? -1 : this.e.read(bArr2, i6, bArr2.length - i6);
                    if (read == -1) {
                        throw ce.a();
                    }
                    this.g += read;
                    i6 += read;
                }
                i5 -= bArr2.length;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.a, i2, bArr3, 0, i4);
            for (int i7 = 0; i7 < vector.size(); i7++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i7);
                System.arraycopy(bArr4, 0, bArr3, i4, bArr4.length);
                i4 += bArr4.length;
            }
            return bArr3;
        } else {
            byte[] bArr5 = new byte[i];
            int i8 = this.b - this.d;
            System.arraycopy(this.a, this.d, bArr5, 0, i8);
            this.d = this.b;
            while (true) {
                a(true);
                int i9 = i - i8;
                if (i9 <= this.b) {
                    System.arraycopy(this.a, 0, bArr5, i8, i9);
                    this.d = i9;
                    return bArr5;
                }
                System.arraycopy(this.a, 0, bArr5, i8, this.b);
                i8 += this.b;
                this.d = this.b;
            }
        }
    }

    private void d(int i) {
        if (i < 0) {
            throw ce.b();
        }
        if (this.g + this.d + i > this.h) {
            d((this.h - this.g) - this.d);
            throw ce.a();
        } else if (i <= this.b - this.d) {
            this.d += i;
        } else {
            int i2 = this.b - this.d;
            this.g += this.b;
            this.d = 0;
            this.b = 0;
            while (i2 < i) {
                int skip = this.e == null ? -1 : (int) this.e.skip(i - i2);
                if (skip <= 0) {
                    throw ce.a();
                }
                i2 += skip;
                this.g += skip;
            }
        }
    }

    private void g() {
        this.b += this.c;
        int i = this.g + this.b;
        if (i <= this.h) {
            this.c = 0;
            return;
        }
        this.c = i - this.h;
        this.b -= this.c;
    }

    private byte h() {
        if (this.d == this.b) {
            a(true);
        }
        byte[] bArr = this.a;
        int i = this.d;
        this.d = i + 1;
        return bArr[i];
    }

    public final void a(int i) {
        if (this.f != i) {
            throw ce.e();
        }
    }

    public final boolean b() {
        return e() != 0;
    }

    public final String c() {
        int e = e();
        if (e > this.b - this.d || e <= 0) {
            return new String(c(e), "UTF-8");
        }
        String str = new String(this.a, this.d, e, "UTF-8");
        this.d += e;
        return str;
    }

    public final a d() {
        int e = e();
        if (e > this.b - this.d || e <= 0) {
            return a.a(c(e));
        }
        a a = a.a(this.a, this.d, e);
        this.d += e;
        return a;
    }

    public final int e() {
        int i;
        byte h = h();
        if (h >= 0) {
            return h;
        }
        int i2 = h & Byte.MAX_VALUE;
        byte h2 = h();
        if (h2 >= 0) {
            i = h2 << 7;
        } else {
            i2 |= (h2 & Byte.MAX_VALUE) << 7;
            byte h3 = h();
            if (h3 >= 0) {
                i = h3 << 14;
            } else {
                i2 |= (h3 & Byte.MAX_VALUE) << 14;
                byte h4 = h();
                if (h4 < 0) {
                    int i3 = i2 | ((h4 & Byte.MAX_VALUE) << 21);
                    byte h5 = h();
                    int i4 = i3 | (h5 << 28);
                    if (h5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (h() >= 0) {
                                return i4;
                            }
                        }
                        throw ce.c();
                    }
                    return i4;
                }
                i = h4 << 21;
            }
        }
        return i2 | i;
    }

    public final long f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte h = h();
            j |= (h & Byte.MAX_VALUE) << i;
            if ((h & 128) == 0) {
                return j;
            }
        }
        throw ce.c();
    }

    public final int a() {
        if (this.d == this.b && !a(false)) {
            this.f = 0;
            return 0;
        }
        this.f = e();
        if (this.f != 0) {
            return this.f;
        }
        throw ce.d();
    }

    public final boolean b(int i) {
        int a;
        switch (ef.a(i)) {
            case 0:
                e();
                return true;
            case 1:
                h();
                h();
                h();
                h();
                h();
                h();
                h();
                h();
                return true;
            case 2:
                d(e());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                h();
                h();
                h();
                h();
                return true;
            default:
                throw ce.f();
        }
        do {
            a = a();
            if (a != 0) {
            }
            a(ef.a(ef.b(i), 4));
            return true;
        } while (b(a));
        a(ef.a(ef.b(i), 4));
        return true;
    }

    public final void a(de deVar) {
        int e = e();
        if (this.i >= this.j) {
            throw ce.g();
        }
        if (e < 0) {
            throw ce.b();
        }
        int i = e + this.g + this.d;
        int i2 = this.h;
        if (i > i2) {
            throw ce.a();
        }
        this.h = i;
        g();
        this.i++;
        deVar.b(this);
        a(0);
        this.i--;
        this.h = i2;
        g();
    }
}
