package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.sdk.utilities.heatmap.Gradient;
import com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.mapsdk.internal.jy;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bv extends HeatMapTileProvider {
    static final double a = 1.0d;
    private static final boolean b = false;
    private static final int c = 256;
    private static final int d = 1280;
    private static final int e = 5;
    private static final int f = 11;
    private static final int g = 22;
    private final HeatMapTileProvider.OnHeatMapReadyListener h;
    private HeatMapTileProvider.HeatTileGenerator i;
    private fv<bw> j;
    private Collection<bw> k;
    private fl l;
    private int m;
    private Gradient n;
    private int[] o;
    private double[] p;
    private double q;
    private double[] r;
    private boolean s;

    static /* synthetic */ boolean f(bv bvVar) {
        bvVar.s = true;
        return true;
    }

    public bv(HeatMapTileProvider.Builder builder) {
        this.k = d(builder.getData());
        this.m = builder.getRadius();
        this.n = builder.getGradient();
        this.q = builder.getOpacity();
        this.h = builder.getReadyListener();
        this.i = builder.getHeatTileGenerator();
        if (this.k != null) {
            jy.a((jy.g) new AnonymousClass1()).a((jy.b.a) Boolean.FALSE);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.bv$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends jy.g<Boolean> {
        AnonymousClass1() {
        }

        private Boolean a() throws Exception {
            if (!bv.this.s) {
                if (bv.this.i != null) {
                    bv.this.p = bv.this.i.generateKernel(bv.this.m);
                } else {
                    bv.this.p = bv.a(bv.this.m, bv.this.m / 3.0d);
                }
                bv.this.setGradient(bv.this.n);
                bv.this.a(bv.this.k);
                bv.f(bv.this);
                if (bv.this.h != null) {
                    bv.this.h.onHeatMapReady();
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            if (!bv.this.s) {
                if (bv.this.i != null) {
                    bv.this.p = bv.this.i.generateKernel(bv.this.m);
                } else {
                    bv.this.p = bv.a(bv.this.m, bv.this.m / 3.0d);
                }
                bv.this.setGradient(bv.this.n);
                bv.this.a(bv.this.k);
                bv.f(bv.this);
                if (bv.this.h != null) {
                    bv.this.h.onHeatMapReady();
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    private void a() {
        if (this.k != null) {
            jy.a((jy.g) new AnonymousClass1()).a((jy.b.a) Boolean.FALSE);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        if (!this.s) {
            kj.d("TileOverlay", "热力图未初始化完成，返回空瓦块");
            return TileProvider.NO_TILE;
        }
        double pow = 1.0d / Math.pow(2.0d, i3);
        double d2 = (this.m * pow) / 256.0d;
        double d3 = ((2.0d * d2) + pow) / ((this.m * 2) + 256);
        double d4 = (i * pow) - d2;
        double d5 = ((i + 1) * pow) + d2;
        double d6 = (i2 * pow) - d2;
        double d7 = ((i2 + 1) * pow) + d2;
        Collection<bw> arrayList = new ArrayList<>();
        double d8 = 0.0d;
        if (d4 < 0.0d) {
            d8 = -1.0d;
            arrayList = this.j.a(new fl(d4 + 1.0d, 1.0d, d6, d7));
        } else if (d5 > 1.0d) {
            arrayList = this.j.a(new fl(0.0d, d5 - 1.0d, d6, d7));
            d8 = 1.0d;
        }
        fl flVar = new fl(d4, d5, d6, d7);
        double d9 = d8;
        if (!flVar.a(new fl(this.l.a - d2, this.l.c + d2, this.l.b - d2, this.l.d + d2))) {
            kj.d("TileOverlay", "热力图超出有效边界，返回空瓦块-" + i + CommonConstant.Symbol.COLON + i2 + CommonConstant.Symbol.COLON + i3);
            return TileProvider.NO_TILE;
        }
        Collection<bw> a2 = this.j.a(flVar);
        if (a2.isEmpty()) {
            kj.d("TileOverlay", "热力图没有热力数据，返回空瓦块-" + i + CommonConstant.Symbol.COLON + i2 + CommonConstant.Symbol.COLON + i3);
            return TileProvider.NO_TILE;
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, (this.m * 2) + 256, (this.m * 2) + 256);
        for (Iterator<bw> it = a2.iterator(); it.hasNext(); it = it) {
            bw next = it.next();
            fm fmVar = next.b;
            int i4 = (int) ((fmVar.b - d6) / d3);
            double[] dArr2 = dArr[(int) ((fmVar.a - d4) / d3)];
            dArr2[i4] = dArr2[i4] + next.c;
        }
        for (bw bwVar : arrayList) {
            fm fmVar2 = bwVar.b;
            int i5 = (int) (((fmVar2.a + d9) - d4) / d3);
            int i6 = (int) ((fmVar2.b - d6) / d3);
            double[] dArr3 = dArr[i5];
            dArr3[i6] = dArr3[i6] + bwVar.c;
        }
        Bitmap a3 = a(a(dArr, this.p), this.o, this.r[i3]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a3.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(256, 256, byteArrayOutputStream.toByteArray());
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final <T extends WeightedLatLng> void setWeightedData(Collection<T> collection) {
        a(d(collection));
    }

    public final void a(Collection<bw> collection) {
        this.k = collection;
        if (this.k.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        this.l = b(this.k);
        this.j = new fv<>(this.l);
        for (bw bwVar : this.k) {
            this.j.a((fv<bw>) bwVar);
        }
        this.r = a(this.m);
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setGradient(Gradient gradient) {
        this.n = gradient;
        if (this.i != null) {
            this.o = this.i.generateColorMap(this.q);
        } else {
            this.o = this.n.generateColorMap(this.q);
        }
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setRadius(int i) {
        if (i <= 0) {
            return;
        }
        this.m = i;
        if (this.i != null) {
            this.p = this.i.generateKernel(this.m);
        } else {
            this.p = a(this.m, this.m / 3.0d);
        }
        this.r = a(this.m);
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setOpacity(double d2) {
        this.q = d2;
        setGradient(this.n);
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setHeatTileGenerator(HeatMapTileProvider.HeatTileGenerator heatTileGenerator) {
        this.i = heatTileGenerator;
        if (this.i != null) {
            this.p = this.i.generateKernel(this.m);
            this.o = this.i.generateColorMap(this.q);
        }
    }

    private double[] a(int i) {
        int i2;
        double[] dArr = new double[22];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = a(this.k, this.l, i, (int) (Math.pow(2.0d, i3 - 3) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 22; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private static Tile a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(256, 256, byteArrayOutputStream.toByteArray());
    }

    private static fl b(Collection<bw> collection) {
        Iterator<bw> it = collection.iterator();
        bw next = it.next();
        double d2 = next.b.a;
        double d3 = next.b.a;
        double d4 = d2;
        double d5 = d3;
        double d6 = next.b.b;
        double d7 = next.b.b;
        while (it.hasNext()) {
            bw next2 = it.next();
            double d8 = next2.b.a;
            double d9 = next2.b.b;
            if (d8 < d4) {
                d4 = d8;
            }
            if (d8 > d5) {
                d5 = d8;
            }
            if (d9 < d6) {
                d6 = d9;
            }
            if (d9 > d7) {
                d7 = d9;
            }
        }
        return new fl(d4, d5, d6, d7);
    }

    static double[] a(int i, double d2) {
        double[] dArr = new double[(i * 2) + 1];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((-i2) * i2) / ((2.0d * d2) * d2));
        }
        return dArr;
    }

    private static double[][] a(double[][] dArr, double[] dArr2) {
        int floor = (int) Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i = length - (floor * 2);
        int i2 = (floor + i) - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, length, length);
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                double d2 = dArr[i3][i4];
                if (d2 != 0.0d) {
                    int i5 = i3 + floor;
                    if (i2 < i5) {
                        i5 = i2;
                    }
                    int i6 = i5 + 1;
                    int i7 = i3 - floor;
                    for (int i8 = floor > i7 ? floor : i7; i8 < i6; i8++) {
                        double[] dArr4 = dArr3[i8];
                        dArr4[i4] = dArr4[i4] + (dArr2[i8 - i7] * d2);
                    }
                }
            }
        }
        double[][] dArr5 = (double[][]) Array.newInstance(double.class, i, i);
        for (int i9 = floor; i9 < i2 + 1; i9++) {
            for (int i10 = 0; i10 < length; i10++) {
                double d3 = dArr3[i9][i10];
                if (d3 != 0.0d) {
                    int i11 = i10 + floor;
                    if (i2 < i11) {
                        i11 = i2;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 - floor;
                    for (int i14 = floor > i13 ? floor : i13; i14 < i12; i14++) {
                        double[] dArr6 = dArr5[i9 - floor];
                        int i15 = i14 - floor;
                        dArr6[i15] = dArr6[i15] + (dArr2[i14 - i13] * d3);
                    }
                }
            }
        }
        return dArr5;
    }

    private static Bitmap a(double[][] dArr, int[] iArr, double d2) {
        int i = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d2;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d3 = dArr[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d3 * length);
                if (d3 != 0.0d) {
                    if (i5 < iArr.length) {
                        iArr2[i4] = iArr[i5];
                    } else {
                        iArr2[i4] = i;
                    }
                } else {
                    iArr2[i4] = 0;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static double a(Collection<bw> collection, fl flVar, int i, int i2) {
        double d2 = flVar.a;
        double d3 = flVar.c;
        double d4 = flVar.b;
        double d5 = d3 - d2;
        double d6 = flVar.d - d4;
        if (d5 <= d6) {
            d5 = d6;
        }
        double d7 = ((int) ((i2 / (i * 2)) + 0.5d)) / d5;
        HashMap hashMap = new HashMap();
        double d8 = 0.0d;
        for (bw bwVar : collection) {
            int i3 = (int) ((bwVar.b.a - d2) * d7);
            int i4 = (int) ((bwVar.b.b - d4) * d7);
            Map map = (Map) hashMap.get(Integer.valueOf(i3));
            if (map == null) {
                map = new HashMap();
                hashMap.put(Integer.valueOf(i3), map);
            }
            Double d9 = (Double) map.get(Integer.valueOf(i4));
            if (d9 == null) {
                d9 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d9.doubleValue() + bwVar.c);
            map.put(Integer.valueOf(i4), valueOf);
            if (valueOf.doubleValue() > d8) {
                d8 = valueOf.doubleValue();
            }
        }
        return d8;
    }

    private static Collection<bw> c(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : collection) {
            arrayList.add(new bw(latLng));
        }
        return arrayList;
    }

    private static <T extends WeightedLatLng> Collection<bw> d(Collection<T> collection) {
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            arrayList.add(new bw(t.getPoint(), t.getIntensity()));
        }
        return arrayList;
    }

    @Override // com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider
    public final void setData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : collection) {
            arrayList.add(new bw(latLng));
        }
        a(arrayList);
    }
}
