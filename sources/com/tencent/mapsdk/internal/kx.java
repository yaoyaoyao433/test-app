package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kx {
    public static final Random a = new Random();

    private static List<PointF> a(List<PointF> list, double d) {
        int size = list.size();
        if (list.isEmpty() || size < 3) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        int size2 = list.size() - 1;
        while (list.get(0).equals(list.get(size2))) {
            size2--;
            if (size2 <= 0) {
                return list;
            }
        }
        arrayList.add(Integer.valueOf(size2));
        a(list, 0, size2, d, arrayList);
        b(arrayList, 0, arrayList.size() - 1, new Comparator<Integer>() { // from class: com.tencent.mapsdk.internal.kx.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }

            private static int a(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(list.get(((Integer) arrayList.get(i)).intValue()));
        }
        return arrayList2;
    }

    private static <E> void a(ArrayList<E> arrayList, int i, int i2) {
        E e = arrayList.get(i);
        arrayList.set(i, arrayList.get(i2));
        arrayList.set(i2, e);
    }

    private static <E> int a(ArrayList<E> arrayList, int i, int i2, Comparator<? super E> comparator) {
        int nextInt = a.nextInt((i2 - i) + 1) + i;
        E e = arrayList.get(nextInt);
        a(arrayList, nextInt, i2);
        int i3 = i;
        while (i < i2) {
            if (comparator.compare(arrayList.get(i), e) <= 0) {
                a(arrayList, i3, i);
                i3++;
            }
            i++;
        }
        a(arrayList, i3, i2);
        return i3;
    }

    private static <E> void a(ArrayList<E> arrayList, Comparator<? super E> comparator) {
        b(arrayList, 0, arrayList.size() - 1, comparator);
    }

    private static void a(List<PointF> list, int i, int i2, double d, ArrayList<Integer> arrayList) {
        int i3 = i;
        while (true) {
            double d2 = 0.0d;
            int i4 = 0;
            for (int i5 = i3; i5 < i2; i5++) {
                PointF pointF = list.get(i3);
                PointF pointF2 = list.get(i2);
                PointF pointF3 = list.get(i5);
                double abs = (pointF.equals(pointF2) || pointF3.equals(pointF) || pointF3.equals(pointF2)) ? 0.0d : (Math.abs(((((((pointF.x * pointF2.y) + (pointF2.x * pointF3.y)) + (pointF3.x * pointF.y)) - (pointF2.x * pointF.y)) - (pointF3.x * pointF2.y)) - (pointF.x * pointF3.y)) * 0.5d) * 2.0d) / Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
                if (abs > d2) {
                    i4 = i5;
                    d2 = abs;
                }
            }
            if (d2 <= d || i4 == 0) {
                return;
            }
            arrayList.add(Integer.valueOf(i4));
            a(list, i3, i4, d, arrayList);
            i3 = i4;
        }
    }

    private static double a(PointF pointF, PointF pointF2, PointF pointF3) {
        if (pointF.equals(pointF2) || pointF3.equals(pointF) || pointF3.equals(pointF2)) {
            return 0.0d;
        }
        return (Math.abs(((((((pointF.x * pointF2.y) + (pointF2.x * pointF3.y)) + (pointF3.x * pointF.y)) - (pointF2.x * pointF.y)) - (pointF3.x * pointF2.y)) - (pointF.x * pointF3.y)) * 0.5d) * 2.0d) / Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    private static <E> void b(ArrayList<E> arrayList, int i, int i2, Comparator<? super E> comparator) {
        while (i2 > i) {
            int nextInt = a.nextInt((i2 - i) + 1) + i;
            E e = arrayList.get(nextInt);
            a(arrayList, nextInt, i2);
            int i3 = i;
            int i4 = i3;
            while (i3 < i2) {
                if (comparator.compare(arrayList.get(i3), e) <= 0) {
                    a(arrayList, i4, i3);
                    i4++;
                }
                i3++;
            }
            a(arrayList, i4, i2);
            b(arrayList, i, i4 - 1, comparator);
            i = i4 + 1;
        }
    }
}
