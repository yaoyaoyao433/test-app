package android.support.v7.graphics;

import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.graphics.b;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final Comparator<C0008a> g = new Comparator<C0008a>() { // from class: android.support.v7.graphics.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C0008a c0008a, C0008a c0008a2) {
            return c0008a2.a() - c0008a.a();
        }
    };
    final int[] a;
    final int[] b;
    final List<b.d> c;
    final b.InterfaceC0009b[] e;
    private final float[] f = new float[3];
    final TimingLogger d = null;

    static int a(int i) {
        return (i >> 10) & 31;
    }

    static int b(int i) {
        return (i >> 5) & 31;
    }

    private static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int c(int i) {
        return i & 31;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int[] iArr, int i, b.InterfaceC0009b[] interfaceC0009bArr) {
        this.e = interfaceC0009bArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int b = b(Color.blue(i3), 8, 5) | (b(Color.red(i3), 8, 5) << 10) | (b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = b;
            iArr2[b] = iArr2[b] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int d = d(i5);
                ColorUtils.colorToHSL(d, this.f);
                if (a(d, this.f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.c = new ArrayList();
            for (int i8 : iArr3) {
                this.c.add(new b.d(d(i8), iArr2[i8]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, g);
        priorityQueue.offer(new C0008a(0, this.a.length - 1));
        a(priorityQueue, i);
        this.c = a(priorityQueue);
    }

    private static void a(PriorityQueue<C0008a> priorityQueue, int i) {
        C0008a poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.b()) {
            if (!poll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int d = poll.d();
            C0008a c0008a = new C0008a(d + 1, poll.a);
            poll.a = d;
            poll.c();
            priorityQueue.offer(c0008a);
            priorityQueue.offer(poll);
        }
    }

    private List<b.d> a(Collection<C0008a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C0008a c0008a : collection) {
            b.d e = c0008a.e();
            if (!a(e.a, e.a())) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: android.support.v7.graphics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0008a {
        int a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;

        C0008a(int i, int i2) {
            this.c = i;
            this.a = i2;
            c();
        }

        final int a() {
            return ((this.f - this.e) + 1) * ((this.h - this.g) + 1) * ((this.j - this.i) + 1);
        }

        final boolean b() {
            return f() > 1;
        }

        private int f() {
            return (this.a + 1) - this.c;
        }

        final void c() {
            int[] iArr = a.this.a;
            int[] iArr2 = a.this.b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = this.c; i8 <= this.a; i8++) {
                int i9 = iArr[i8];
                i3 += iArr2[i9];
                int a = a.a(i9);
                int b = a.b(i9);
                int c = a.c(i9);
                if (a > i2) {
                    i2 = a;
                }
                if (a < i) {
                    i = a;
                }
                if (b > i5) {
                    i5 = b;
                }
                if (b < i4) {
                    i4 = b;
                }
                if (c > i7) {
                    i7 = c;
                }
                if (c < i6) {
                    i6 = c;
                }
            }
            this.e = i;
            this.f = i2;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = i7;
            this.d = i3;
        }

        final b.d e() {
            int[] iArr = a.this.a;
            int[] iArr2 = a.this.b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.c; i5 <= this.a; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i += i7;
                i2 += a.a(i6) * i7;
                i3 += a.b(i6) * i7;
                i4 += i7 * a.c(i6);
            }
            float f = i;
            return new b.d(a.a(Math.round(i2 / f), Math.round(i3 / f), Math.round(i4 / f)), i);
        }

        final int d() {
            int i = this.f - this.e;
            int i2 = this.h - this.g;
            int i3 = this.j - this.i;
            int i4 = (i < i2 || i < i3) ? (i2 < i || i2 < i3) ? -1 : -2 : -3;
            int[] iArr = a.this.a;
            int[] iArr2 = a.this.b;
            a.a(iArr, i4, this.c, this.a);
            Arrays.sort(iArr, this.c, this.a + 1);
            a.a(iArr, i4, this.c, this.a);
            int i5 = this.d / 2;
            int i6 = 0;
            for (int i7 = this.c; i7 <= this.a; i7++) {
                i6 += iArr2[iArr[i7]];
                if (i6 >= i5) {
                    return Math.min(this.a - 1, i7);
                }
            }
            return this.c;
        }
    }

    static void a(int[] iArr, int i, int i2, int i3) {
        switch (i) {
            case -3:
                return;
            case -2:
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                    i2++;
                }
                return;
            case -1:
                while (i2 <= i3) {
                    int i5 = iArr[i2];
                    iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                    i2++;
                }
                return;
            default:
                return;
        }
    }

    private boolean a(int i, float[] fArr) {
        if (this.e != null && this.e.length > 0) {
            int length = this.e.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.e[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(b(i, 5, 8), b(i2, 5, 8), b(i3, 5, 8));
    }

    private static int d(int i) {
        return a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }
}
