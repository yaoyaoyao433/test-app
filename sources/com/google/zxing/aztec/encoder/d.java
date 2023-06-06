package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    static final int[][] c;
    private static final int[][] e;
    final byte[] d;

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 5, 256);
        e = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            e[0][i] = (i - 65) + 2;
        }
        e[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            e[1][i2] = (i2 - 97) + 2;
        }
        e[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            e[2][i3] = (i3 - 48) + 2;
        }
        e[2][44] = 12;
        e[2][46] = 13;
        int[] iArr2 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            e[3][iArr2[i4]] = i4;
        }
        int[] iArr3 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr3[i5] > 0) {
                e[4][iArr3[i5]] = i5;
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, 6, 6);
        c = iArr4;
        for (int[] iArr5 : iArr4) {
            Arrays.fill(iArr5, -1);
        }
        c[0][4] = 0;
        c[1][4] = 0;
        c[1][0] = 28;
        c[3][4] = 0;
        c[2][4] = 0;
        c[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar, int i, Collection<f> collection) {
        char c2 = (char) (this.d[i] & 255);
        boolean z = e[fVar.b][c2] > 0;
        f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = e[i2][c2];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i);
                }
                if (!z || i2 == fVar.b || i2 == 2) {
                    collection.add(fVar2.a(i2, i3));
                }
                if (!z && c[fVar.b][i2] >= 0) {
                    collection.add(fVar2.b(i2, i3));
                }
            }
        }
        if (fVar.c > 0 || e[fVar.b][c2] == 0) {
            collection.add(fVar.a(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection<f> a(Iterable<f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            a(fVar, i, i2, linkedList);
        }
        return a(linkedList);
    }

    private static void a(f fVar, int i, int i2, Collection<f> collection) {
        f b2 = fVar.b(i);
        collection.add(b2.a(4, i2));
        if (fVar.b != 4) {
            collection.add(b2.b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b2.a(2, 16 - i2).a(2, 1));
        }
        if (fVar.c > 0) {
            collection.add(fVar.a(i).a(i + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection<f> a(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.a(fVar)) {
                    z = false;
                    break;
                } else if (fVar.a(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }
}
