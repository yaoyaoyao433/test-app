package com.facebook.react.animated;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends s {
    private static final Pattern i = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
    private final double[] j;
    private final double[] k;
    private String l;
    private double[][] m;
    private final boolean n;
    private final Matcher o;
    private final String p;
    private final String q;
    @Nullable
    private s r;
    private boolean s;
    private int t;

    private static double[] a(ReadableArray readableArray) {
        double[] dArr = new double[readableArray.size()];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = readableArray.getDouble(i2);
        }
        return dArr;
    }

    public i(ReadableMap readableMap) {
        this.j = a(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        this.n = array.getType(0) == ReadableType.String;
        if (this.n) {
            int size = array.size();
            this.k = new double[size];
            this.l = array.getString(0);
            this.s = this.l.startsWith("rgb");
            this.o = i.matcher(this.l);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                Matcher matcher = i.matcher(array.getString(i2));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.k[i2] = ((Double) arrayList2.get(0)).doubleValue();
            }
            this.t = ((ArrayList) arrayList.get(0)).size();
            this.m = new double[this.t];
            for (int i3 = 0; i3 < this.t; i3++) {
                double[] dArr = new double[size];
                this.m[i3] = dArr;
                for (int i4 = 0; i4 < size; i4++) {
                    dArr[i4] = ((Double) ((ArrayList) arrayList.get(i4)).get(i3)).doubleValue();
                }
            }
        } else {
            this.k = a(array);
            this.o = null;
        }
        this.p = readableMap.getString("extrapolateLeft");
        this.q = readableMap.getString("extrapolateRight");
    }

    @Override // com.facebook.react.animated.b
    public final void a(b bVar) {
        if (this.r != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(bVar instanceof s)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.r = (s) bVar;
    }

    @Override // com.facebook.react.animated.b
    public final void b(b bVar) {
        if (bVar != this.r) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.r = null;
    }

    @Override // com.facebook.react.animated.b
    public final void a() {
        if (this.r == null) {
            return;
        }
        double b = this.r.b();
        this.f = a(b, this.j, this.k, this.p, this.q);
        if (this.n) {
            if (this.t > 1) {
                StringBuffer stringBuffer = new StringBuffer(this.l.length());
                this.o.reset();
                int i2 = 0;
                while (this.o.find()) {
                    int i3 = i2 + 1;
                    double a = a(b, this.j, this.m[i2], this.p, this.q);
                    if (this.s) {
                        boolean z = i3 == 4;
                        if (z) {
                            a *= 1000.0d;
                        }
                        int round = (int) Math.round(a);
                        this.o.appendReplacement(stringBuffer, z ? Double.toString(round / 1000.0d) : Integer.toString(round));
                    } else {
                        int i4 = (int) a;
                        this.o.appendReplacement(stringBuffer, ((double) i4) != a ? Double.toString(a) : Integer.toString(i4));
                    }
                    i2 = i3;
                }
                this.o.appendTail(stringBuffer);
                this.e = stringBuffer.toString();
                return;
            }
            this.e = this.o.replaceFirst(String.valueOf(this.f));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double a(double r19, double[] r21, double[] r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.i.a(double, double[], double[], java.lang.String, java.lang.String):double");
    }
}
