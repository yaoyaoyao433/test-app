package okio;

import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class q extends f {
    final transient byte[][] f;
    final transient int[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(c cVar, int i) {
        super(null);
        u.a(cVar.b, 0L, i);
        int i2 = 0;
        Segment segment = cVar.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (segment.limit == segment.pos) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += segment.limit - segment.pos;
            i4++;
            segment = segment.next;
        }
        this.f = new byte[i4];
        this.g = new int[i4 * 2];
        Segment segment2 = cVar.a;
        int i5 = 0;
        while (i2 < i) {
            this.f[i5] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            if (i2 > i) {
                i2 = i;
            }
            this.g[i5] = i2;
            this.g[this.f.length + i5] = segment2.pos;
            segment2.shared = true;
            i5++;
            segment2 = segment2.next;
        }
    }

    @Override // okio.f
    public final String a() {
        return k().a();
    }

    @Override // okio.f
    public final String b() {
        return k().b();
    }

    @Override // okio.f
    public final String f() {
        return k().f();
    }

    @Override // okio.f
    public final f g() {
        return k().g();
    }

    @Override // okio.f
    public final f c() {
        return k().c();
    }

    @Override // okio.f
    public final f d() {
        return k().d();
    }

    @Override // okio.f
    public final f e() {
        return k().e();
    }

    @Override // okio.f
    public final f a(int i, int i2) {
        return k().a(i, i2);
    }

    @Override // okio.f
    public final byte a(int i) {
        u.a(this.g[this.f.length - 1], i, 1L);
        int b = b(i);
        return this.f[b][(i - (b == 0 ? 0 : this.g[b - 1])) + this.g[this.f.length + b]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // okio.f
    public final int h() {
        return this.g[this.f.length - 1];
    }

    @Override // okio.f
    public final byte[] i() {
        byte[] bArr = new byte[this.g[this.f.length - 1]];
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            System.arraycopy(this.f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // okio.f
    public final void a(c cVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            Segment segment = new Segment(this.f[i], i3, (i3 + i4) - i2, true, false);
            if (cVar.a == null) {
                segment.prev = segment;
                segment.next = segment;
                cVar.a = segment;
            } else {
                cVar.a.prev.push(segment);
            }
            i++;
            i2 = i4;
        }
        cVar.b += i2;
    }

    @Override // okio.f
    public final boolean a(int i, f fVar, int i2, int i3) {
        if (h() - i3 < 0) {
            return false;
        }
        int b = b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            if (!fVar.a(i2, this.f[b], (i - i4) + this.g[this.f.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    @Override // okio.f
    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            if (!u.a(this.f[b], (i - i4) + this.g[this.f.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    private f k() {
        return new f(i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // okio.f
    public final byte[] j() {
        return i();
    }

    @Override // okio.f
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.h() == h() && a(0, fVar, 0, h())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.f
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int i5 = this.g[length + i2];
            int i6 = this.g[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    @Override // okio.f
    public final String toString() {
        return k().toString();
    }

    private Object writeReplace() {
        return k();
    }
}
