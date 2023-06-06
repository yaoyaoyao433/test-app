package android.support.v7.util;

import android.support.annotation.Nullable;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    private static final Comparator<e> a = new Comparator<e>() { // from class: android.support.v7.util.b.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            int i = eVar3.a - eVar4.a;
            return i == 0 ? eVar3.b - eVar4.b : i;
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static C0010b a(a aVar, boolean z) {
        int oldListSize = aVar.getOldListSize();
        int newListSize = aVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new d(0, oldListSize, 0, newListSize));
        int abs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            d dVar = (d) arrayList2.remove(arrayList2.size() - 1);
            e a2 = a(aVar, dVar.a, dVar.b, dVar.c, dVar.d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.c > 0) {
                    arrayList.add(a2);
                }
                a2.a += dVar.a;
                a2.b += dVar.c;
                d dVar2 = arrayList3.isEmpty() ? new d() : (d) arrayList3.remove(arrayList3.size() - 1);
                dVar2.a = dVar.a;
                dVar2.c = dVar.c;
                if (a2.e) {
                    dVar2.b = a2.a;
                    dVar2.d = a2.b;
                } else if (a2.d) {
                    dVar2.b = a2.a - 1;
                    dVar2.d = a2.b;
                } else {
                    dVar2.b = a2.a;
                    dVar2.d = a2.b - 1;
                }
                arrayList2.add(dVar2);
                if (a2.e) {
                    if (a2.d) {
                        dVar.a = a2.a + a2.c + 1;
                        dVar.c = a2.b + a2.c;
                    } else {
                        dVar.a = a2.a + a2.c;
                        dVar.c = a2.b + a2.c + 1;
                    }
                } else {
                    dVar.a = a2.a + a2.c;
                    dVar.c = a2.b + a2.c;
                }
                arrayList2.add(dVar);
            } else {
                arrayList3.add(dVar);
            }
        }
        Collections.sort(arrayList, a);
        return new C0010b(aVar, arrayList, iArr, iArr2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r26[r15 - 1] < r26[r15 + r9]) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
        if (r27[r9 - 1] < r27[r9 + 1]) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[LOOP:2: B:22:0x005f->B:26:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007e A[EDGE_INSN: B:82:0x007e->B:28:0x007e ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.support.v7.util.b.e a(android.support.v7.util.b.a r21, int r22, int r23, int r24, int r25, int[] r26, int[] r27, int r28) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.util.b.a(android.support.v7.util.b$a, int, int, int, int, int[], int[], int):android.support.v7.util.b$e");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e {
        int a;
        int b;
        int c;
        boolean d;
        boolean e;

        e() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d {
        int a;
        int b;
        int c;
        int d;

        public d() {
        }

        public d(int i, int i2, int i3, int i4) {
            this.a = 0;
            this.b = i2;
            this.c = 0;
            this.d = i4;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.v7.util.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010b {
        private final List<e> a;
        private final int[] b;
        private final int[] c;
        private final a d;
        private final int e;
        private final int f;
        private final boolean g;

        C0010b(a aVar, List<e> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(this.b, 0);
            Arrays.fill(this.c, 0);
            this.d = aVar;
            this.e = aVar.getOldListSize();
            this.f = aVar.getNewListSize();
            this.g = z;
            e eVar = this.a.isEmpty() ? null : this.a.get(0);
            if (eVar == null || eVar.a != 0 || eVar.b != 0) {
                e eVar2 = new e();
                eVar2.a = 0;
                eVar2.b = 0;
                eVar2.d = false;
                eVar2.c = 0;
                eVar2.e = false;
                this.a.add(0, eVar2);
            }
            a();
        }

        private void a() {
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e eVar = this.a.get(size);
                int i3 = eVar.a + eVar.c;
                int i4 = eVar.b + eVar.c;
                if (this.g) {
                    while (i > i3) {
                        if (this.b[i - 1] == 0) {
                            a(i, i2, size, false);
                        }
                        i--;
                    }
                    while (i2 > i4) {
                        if (this.c[i2 - 1] == 0) {
                            a(i, i2, size, true);
                        }
                        i2--;
                    }
                }
                for (int i5 = 0; i5 < eVar.c; i5++) {
                    int i6 = eVar.a + i5;
                    int i7 = eVar.b + i5;
                    int i8 = this.d.areContentsTheSame(i6, i7) ? 1 : 2;
                    this.b[i6] = (i7 << 5) | i8;
                    this.c[i7] = (i6 << 5) | i8;
                }
                i = eVar.a;
                i2 = eVar.b;
            }
        }

        private boolean a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                e eVar = this.a.get(i3);
                int i7 = eVar.a + eVar.c;
                int i8 = eVar.b + eVar.c;
                if (z) {
                    for (int i9 = i4 - 1; i9 >= i7; i9--) {
                        if (this.d.areItemsTheSame(i9, i5)) {
                            i6 = this.d.areContentsTheSame(i9, i5) ? 8 : 4;
                            this.c[i5] = (i9 << 5) | 16;
                            this.b[i9] = (i5 << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i8; i10--) {
                        if (this.d.areItemsTheSame(i5, i10)) {
                            i6 = this.d.areContentsTheSame(i5, i10) ? 8 : 4;
                            int i11 = i - 1;
                            this.b[i11] = (i10 << 5) | 16;
                            this.c[i10] = (i11 << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = eVar.a;
                i2 = eVar.b;
                i3--;
            }
            return false;
        }

        public final void a(android.support.v7.util.c cVar) {
            android.support.v7.util.a aVar = new android.support.v7.util.a(cVar);
            List<c> arrayList = new ArrayList<>();
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e eVar = this.a.get(size);
                int i3 = eVar.c;
                int i4 = eVar.a + i3;
                int i5 = eVar.b + i3;
                if (i4 < i) {
                    b(arrayList, aVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    a(arrayList, aVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.b[eVar.a + i6] & 31) == 2) {
                        aVar.onChanged(eVar.a + i6, 1, this.d.getChangePayload(eVar.a + i6, eVar.b + i6));
                    }
                }
                i = eVar.a;
                i2 = eVar.b;
            }
            aVar.a();
        }

        private static c a(List<c> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                c cVar = list.get(size);
                if (cVar.a == i && cVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).b += z ? 1 : -1;
                        size++;
                    }
                    return cVar;
                }
                size--;
            }
            return null;
        }

        private void a(List<c> list, android.support.v7.util.c cVar, int i, int i2, int i3) {
            if (!this.g) {
                cVar.onInserted(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.c[i5] & 31;
                if (i6 == 0) {
                    cVar.onInserted(i, 1);
                    for (c cVar2 : list) {
                        cVar2.b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.c[i5] >> 5;
                    cVar.onMoved(a(list, i7, true).b, i);
                    if (i6 == 4) {
                        cVar.onChanged(i, 1, this.d.getChangePayload(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new c(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + StringUtil.SPACE + Long.toBinaryString(i6));
                }
            }
        }

        private void b(List<c> list, android.support.v7.util.c cVar, int i, int i2, int i3) {
            if (!this.g) {
                cVar.onRemoved(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.b[i5] & 31;
                if (i6 == 0) {
                    cVar.onRemoved(i + i4, 1);
                    for (c cVar2 : list) {
                        cVar2.b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.b[i5] >> 5;
                    c a = a(list, i7, false);
                    cVar.onMoved(i + i4, a.b - 1);
                    if (i6 == 4) {
                        cVar.onChanged(a.b - 1, 1, this.d.getChangePayload(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new c(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + StringUtil.SPACE + Long.toBinaryString(i6));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        int a;
        int b;
        boolean c;

        public c(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }
}
