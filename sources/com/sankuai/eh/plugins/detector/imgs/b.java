package com.sankuai.eh.plugins.detector.imgs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Comparator<C0561b> b = new Comparator<C0561b>() { // from class: com.sankuai.eh.plugins.detector.imgs.b.1
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C0561b c0561b, C0561b c0561b2) {
            C0561b c0561b3 = c0561b;
            C0561b c0561b4 = c0561b2;
            Object[] objArr = {c0561b3, c0561b4};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5a13ddc8a2a34be39a1f434a60213d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5a13ddc8a2a34be39a1f434a60213d")).intValue() : c0561b3.b(false) - c0561b4.b(false);
        }
    };
    private static final Comparator<C0561b> c = new Comparator<C0561b>() { // from class: com.sankuai.eh.plugins.detector.imgs.b.2
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C0561b c0561b, C0561b c0561b2) {
            C0561b c0561b3 = c0561b;
            C0561b c0561b4 = c0561b2;
            Object[] objArr = {c0561b3, c0561b4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a61763d7a883b4716b6b402a98b4229", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a61763d7a883b4716b6b402a98b4229")).intValue();
            }
            int b2 = c0561b3.b(false);
            int b3 = c0561b4.b(false);
            int a2 = c0561b3.a(false);
            int a3 = c0561b4.a(false);
            return b2 == b3 ? a2 - a3 : Long.compare(b2 * a2, b3 * a3);
        }
    };

    public static int a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5682c1f5e0f0b9cb430d926ffe3fd7e2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5682c1f5e0f0b9cb430d926ffe3fd7e2")).intValue() : (i << 10) + (i2 << 5) + i3;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.detector.imgs.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0561b implements Cloneable {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        final int[] h;
        int[] i;
        private Integer j;
        private Integer k;

        public C0561b(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445dfd476856939784ce845766063e00", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445dfd476856939784ce845766063e00");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = iArr;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0eec34d46d05e4b5c702e2a4c7e86e5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0eec34d46d05e4b5c702e2a4c7e86e5");
            }
            return "r1: " + this.b + " / r2: " + this.c + " / g1: " + this.d + " / g2: " + this.e + " / b1: " + this.f + " / b2: " + this.g;
        }

        public final int a(boolean z) {
            Object[] objArr = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edbff591a201bbe0e3a08f32a91aaba5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edbff591a201bbe0e3a08f32a91aaba5")).intValue();
            }
            if (this.j == null) {
                this.j = Integer.valueOf(((this.c - this.b) + 1) * ((this.e - this.d) + 1) * ((this.g - this.f) + 1));
            }
            return this.j.intValue();
        }

        public final int b(boolean z) {
            int i = 0;
            Object[] objArr = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "204677041413c204b77ab6855457d98c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "204677041413c204b77ab6855457d98c")).intValue();
            }
            if (this.k == null) {
                for (int i2 = this.b; i2 <= this.c; i2++) {
                    for (int i3 = this.d; i3 <= this.e; i3++) {
                        for (int i4 = this.f; i4 <= this.g; i4++) {
                            i += this.h[b.a(i2, i3, i4)];
                        }
                    }
                }
                this.k = Integer.valueOf(i);
            }
            return this.k.intValue();
        }

        /* renamed from: a */
        public final C0561b clone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba7ad620ff1153652e72375b4034506", RobustBitConfig.DEFAULT_VALUE) ? (C0561b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba7ad620ff1153652e72375b4034506") : new C0561b(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public final ArrayList<C0561b> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db2b56e1c2ac39c454c458c25eda64a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db2b56e1c2ac39c454c458c25eda64a");
            } else {
                this.c = new ArrayList<>();
            }
        }

        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r8v22 */
        public final float[][] a() {
            char c;
            int[] iArr;
            ChangeQuickRedirect changeQuickRedirect;
            ?? r8 = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2734133e48371820ba5672753863f45", RobustBitConfig.DEFAULT_VALUE)) {
                return (float[][]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2734133e48371820ba5672753863f45");
            }
            Collections.sort(this.c, new Comparator<C0561b>() { // from class: com.sankuai.eh.plugins.detector.imgs.b.a.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(C0561b c0561b, C0561b c0561b2) {
                    C0561b c0561b3 = c0561b;
                    C0561b c0561b4 = c0561b2;
                    Object[] objArr2 = {c0561b3, c0561b4};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "173a8ec1d4777e2a2ea3ac0c58dd861e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "173a8ec1d4777e2a2ea3ac0c58dd861e")).intValue() : c0561b4.k.intValue() - c0561b3.k.intValue();
                }
            });
            int size = this.c.size();
            float[][] fArr = (float[][]) Array.newInstance(float.class, size, 2);
            int i = 0;
            while (i < size) {
                C0561b c0561b = this.c.get(i);
                Object[] objArr2 = new Object[1];
                objArr2[r8] = Byte.valueOf((byte) r8);
                ChangeQuickRedirect changeQuickRedirect3 = C0561b.a;
                if (PatchProxy.isSupport(objArr2, c0561b, changeQuickRedirect3, false, "8f69b4e459e499d55215a03e9175f24b", RobustBitConfig.DEFAULT_VALUE)) {
                    iArr = (int[]) PatchProxy.accessDispatch(objArr2, c0561b, changeQuickRedirect3, r8, "8f69b4e459e499d55215a03e9175f24b");
                    c = 2;
                } else {
                    if (c0561b.i == null) {
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        for (int i6 = c0561b.b; i6 <= c0561b.c; i6++) {
                            for (int i7 = c0561b.d; i7 <= c0561b.e; i7++) {
                                int i8 = c0561b.f;
                                while (i8 <= c0561b.g) {
                                    int i9 = c0561b.h[b.a(i6, i7, i8)];
                                    int i10 = i2 + i9;
                                    double d = i9;
                                    i4 = (int) (i4 + ((i7 + 0.5d) * d * 8.0d));
                                    i5 = (int) (i5 + (d * (i8 + 0.5d) * 8.0d));
                                    i8++;
                                    i2 = i10;
                                    i3 = (int) (i3 + ((i6 + 0.5d) * d * 8.0d));
                                }
                            }
                        }
                        if (i2 > 0) {
                            c = 2;
                            c0561b.i = new int[]{~(~(i3 / i2)), ~(~(i4 / i2)), ~(~(i5 / i2))};
                        } else {
                            c = 2;
                            c0561b.i = new int[]{~(~((((c0561b.b + c0561b.c) + 1) * 8) / 2)), ~(~((((c0561b.d + c0561b.e) + 1) * 8) / 2)), ~(~((((c0561b.f + c0561b.g) + 1) * 8) / 2))};
                        }
                    } else {
                        c = 2;
                    }
                    iArr = c0561b.i;
                }
                float[] fArr2 = fArr[i];
                float f = iArr[0];
                float f2 = iArr[1];
                float f3 = iArr[c];
                Object[] objArr3 = new Object[3];
                objArr3[0] = Float.valueOf(f);
                objArr3[1] = Float.valueOf(f2);
                objArr3[c] = Float.valueOf(f3);
                fArr2[0] = PatchProxy.isSupport(objArr3, null, c.a, true, "084b18d3da56b18dc5e064c01923ddfa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect, true, "084b18d3da56b18dc5e064c01923ddfa")).intValue() : ((int) ((f3 * 255.0f) + 0.5f)) | (-16777216) | (((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f2 * 255.0f) + 0.5f)) << 8);
                fArr[i][1] = Float.valueOf(String.format("%.5f", Float.valueOf(this.c.get(i).k.intValue() / this.b))).floatValue();
                i++;
                r8 = 0;
            }
            return fArr;
        }
    }

    private static int[] a(int[][] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9040368669b645f9cfa147c26fdde3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9040368669b645f9cfa147c26fdde3b");
        }
        int[] iArr2 = new int[32768];
        for (int[] iArr3 : iArr) {
            int a2 = a(iArr3[0] >> 3, iArr3[1] >> 3, iArr3[2] >> 3);
            iArr2[a2] = iArr2[a2] + 1;
        }
        return iArr2;
    }

    private static C0561b a(int[][] iArr, int[] iArr2) {
        Object[] objArr = {iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcfebb0727505fc1d5491c6dd06eb8ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0561b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcfebb0727505fc1d5491c6dd06eb8ff");
        }
        int i = 0;
        int i2 = 1000000;
        int i3 = 0;
        int i4 = 1000000;
        int i5 = 0;
        int i6 = 1000000;
        for (int[] iArr3 : iArr) {
            int i7 = iArr3[0] >> 3;
            int i8 = iArr3[1] >> 3;
            int i9 = iArr3[2] >> 3;
            if (i7 < i4) {
                i4 = i7;
            } else if (i7 > i5) {
                i5 = i7;
            }
            if (i8 < i6) {
                i6 = i8;
            } else if (i8 > i) {
                i = i8;
            }
            if (i9 < i2) {
                i2 = i9;
            } else if (i9 > i3) {
                i3 = i9;
            }
        }
        return new C0561b(i4, i5, i6, i, i2, i3, iArr2);
    }

    private static C0561b[] a(int[] iArr, C0561b c0561b) {
        int i;
        Object[] objArr = {iArr, c0561b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd79c867d4a74451d681c94d8c07cb32", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0561b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd79c867d4a74451d681c94d8c07cb32");
        }
        if (c0561b.b(false) == 0) {
            return null;
        }
        if (c0561b.b(false) == 1) {
            return new C0561b[]{c0561b.clone(), null};
        }
        int i2 = (c0561b.c - c0561b.b) + 1;
        int i3 = (c0561b.e - c0561b.d) + 1;
        int max = Math.max(Math.max(i2, i3), (c0561b.g - c0561b.f) + 1);
        int[] iArr2 = new int[32];
        Arrays.fill(iArr2, -1);
        int[] iArr3 = new int[32];
        Arrays.fill(iArr3, -1);
        if (max == i2) {
            i = 0;
            for (int i4 = c0561b.b; i4 <= c0561b.c; i4++) {
                int i5 = 0;
                for (int i6 = c0561b.d; i6 <= c0561b.e; i6++) {
                    for (int i7 = c0561b.f; i7 <= c0561b.g; i7++) {
                        i5 += iArr[a(i4, i6, i7)];
                    }
                }
                i += i5;
                iArr2[i4] = i;
            }
        } else if (max == i3) {
            i = 0;
            for (int i8 = c0561b.d; i8 <= c0561b.e; i8++) {
                int i9 = 0;
                for (int i10 = c0561b.b; i10 <= c0561b.c; i10++) {
                    for (int i11 = c0561b.f; i11 <= c0561b.g; i11++) {
                        i9 += iArr[a(i10, i8, i11)];
                    }
                }
                i += i9;
                iArr2[i8] = i;
            }
        } else {
            i = 0;
            for (int i12 = c0561b.f; i12 <= c0561b.g; i12++) {
                int i13 = 0;
                for (int i14 = c0561b.b; i14 <= c0561b.c; i14++) {
                    for (int i15 = c0561b.d; i15 <= c0561b.e; i15++) {
                        i13 += iArr[a(i14, i15, i12)];
                    }
                }
                i += i13;
                iArr2[i12] = i;
            }
        }
        for (int i16 = 0; i16 < 32; i16++) {
            if (iArr2[i16] != -1) {
                iArr3[i16] = i - iArr2[i16];
            }
        }
        if (max == i2) {
            return a('r', c0561b, iArr2, iArr3, i);
        }
        if (max == i3) {
            return a('g', c0561b, iArr2, iArr3, i);
        }
        return a('b', c0561b, iArr2, iArr3, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
        r7.c = r1;
        r9.b = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.sankuai.eh.plugins.detector.imgs.b.C0561b[] a(char r16, com.sankuai.eh.plugins.detector.imgs.b.C0561b r17, int[] r18, int[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.plugins.detector.imgs.b.a(char, com.sankuai.eh.plugins.detector.imgs.b$b, int[], int[], int):com.sankuai.eh.plugins.detector.imgs.b$b[]");
    }

    public static a a(int[][] iArr, int i) {
        Object[] objArr = {iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d9adf3e02c74fa0a473715c97298d5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d9adf3e02c74fa0a473715c97298d5c");
        }
        if (iArr.length == 0 || i < 2 || i > 256) {
            return null;
        }
        int[] a2 = a(iArr);
        C0561b a3 = a(iArr, a2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a3);
        a(arrayList, b, (int) Math.ceil(i * 0.75d), a2);
        Collections.sort(arrayList, c);
        if (i > arrayList.size()) {
            a(arrayList, c, i, a2);
        }
        Collections.reverse(arrayList);
        a aVar = new a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0561b c0561b = (C0561b) it.next();
            Object[] objArr2 = {c0561b};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e32a65873415002c59515bca267f07e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e32a65873415002c59515bca267f07e1");
            } else {
                aVar.c.add(c0561b);
            }
        }
        aVar.b = iArr.length;
        return aVar;
    }

    private static void a(List<C0561b> list, Comparator<C0561b> comparator, int i, int[] iArr) {
        Object[] objArr = {list, comparator, Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e0b9e84c887ea3a3579e10eeec3ddbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e0b9e84c887ea3a3579e10eeec3ddbb");
            return;
        }
        int i2 = 0;
        while (i2 < 1000) {
            C0561b c0561b = list.get(list.size() - 1);
            if (c0561b.b(false) == 0) {
                Collections.sort(list, comparator);
                i2++;
            } else {
                list.remove(list.size() - 1);
                C0561b[] a2 = a(iArr, c0561b);
                C0561b c0561b2 = a2[0];
                C0561b c0561b3 = a2[1];
                if (c0561b2 == null) {
                    throw new RuntimeException("vbox1 not defined; shouldn't happen!");
                }
                list.add(c0561b2);
                if (c0561b3 != null) {
                    list.add(c0561b3);
                }
                Collections.sort(list, comparator);
                if (list.size() >= i) {
                    return;
                }
                int i3 = i2 + 1;
                if (i2 > 1000) {
                    return;
                }
                i2 = i3;
            }
        }
    }
}
