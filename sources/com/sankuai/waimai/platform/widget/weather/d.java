package com.sankuai.waimai.platform.widget.weather;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends f {
    public static ChangeQuickRedirect a;
    public c[] b;
    public double c;
    public float d;
    private ArrayList<b> i;
    private Paint j;
    private Matrix k;
    private Random l;
    private long m;
    private Bitmap[][] n;

    private d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4bdf42b68ec0da75464d2ddde5d1c26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4bdf42b68ec0da75464d2ddde5d1c26");
            return;
        }
        this.j = new Paint();
        this.k = new Matrix();
        this.l = new Random();
        this.m = 0L;
        this.c = 0.016666666666666666d;
        this.n = (Bitmap[][]) Array.newInstance(Bitmap.class, 0, 0);
        this.d = context.getResources().getDisplayMetrics().density;
        this.m = System.currentTimeMillis();
    }

    public d(Context context, c[] cVarArr) {
        this(context);
        Object[] objArr = {context, cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8eb70ba78c68bfc0c26beb1d96cb12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8eb70ba78c68bfc0c26beb1d96cb12");
            return;
        }
        Object[] objArr2 = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df6072f416115cef7b1f3f0c4cbeaa56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df6072f416115cef7b1f3f0c4cbeaa56");
            return;
        }
        this.b = cVarArr;
        Object[] objArr3 = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39cc5af2eaa6cdfc4f0c2c2f1d717ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39cc5af2eaa6cdfc4f0c2c2f1d717ac0");
        } else if (cVarArr != null && cVarArr.length > 0) {
            this.n = (Bitmap[][]) Array.newInstance(Bitmap.class, cVarArr.length, 0);
            for (int i = 0; i < cVarArr.length; i++) {
                c cVar = cVarArr[i];
                if (cVar.A != null && cVar.A.length > 0) {
                    int length = cVar.A.length;
                    final Bitmap[] bitmapArr = new Bitmap[length];
                    for (final int i2 = 0; i2 < length; i2++) {
                        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                        a2.c = cVar.A[i2];
                        a2.a(new com.sankuai.meituan.mtimageloader.utils.a() { // from class: com.sankuai.waimai.platform.widget.weather.d.1
                            public static ChangeQuickRedirect a;

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.sankuai.meituan.mtimageloader.utils.a, com.sankuai.meituan.mtimageloader.utils.d
                            public final void a(Bitmap bitmap) {
                                Object[] objArr4 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1c4662d170965ca73857c100d5882024", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1c4662d170965ca73857c100d5882024");
                                } else {
                                    bitmapArr[i2] = bitmap;
                                }
                            }
                        });
                    }
                    this.n[i] = bitmapArr;
                } else if (!TextUtils.isEmpty(cVar.z)) {
                    final Bitmap[] bitmapArr2 = new Bitmap[1];
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.c = cVar.z;
                    a3.a(new com.sankuai.meituan.mtimageloader.utils.a() { // from class: com.sankuai.waimai.platform.widget.weather.d.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.sankuai.meituan.mtimageloader.utils.a, com.sankuai.meituan.mtimageloader.utils.d
                        public final void a(Bitmap bitmap) {
                            Object[] objArr4 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae5cb159b9e3819c4ee2b55df8411a92", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae5cb159b9e3819c4ee2b55df8411a92");
                            } else {
                                bitmapArr2[0] = bitmap;
                            }
                        }
                    });
                    this.n[i] = bitmapArr2;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.weather.f
    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6451c734259618ccc37e7fe03f36f824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6451c734259618ccc37e7fe03f36f824");
        } else {
            canvas.drawColor(this.h.getResources().getColor(R.color.wm_common_transparent));
        }
    }

    @Override // com.sankuai.waimai.platform.widget.weather.f
    public final void b(Canvas canvas) {
        Bitmap bitmap;
        char c = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92c2b570e3590bd69b9f9af12e4b868a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92c2b570e3590bd69b9f9af12e4b868a");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c = (currentTimeMillis - this.m) / 1000.0d;
        this.m = currentTimeMillis;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6f1568b6f8514b5a022d1370f3009f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6f1568b6f8514b5a022d1370f3009f1");
        } else if (this.i != null) {
            Iterator<b> it = this.i.iterator();
            while (it.hasNext()) {
                b next = it.next();
                a(next, this.c);
                if (next.a <= 0.0f) {
                    a(next, this.b[next.l]);
                }
            }
        }
        Object[] objArr3 = {canvas};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6eed99e9b1d1f064c67bfad4b011974d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6eed99e9b1d1f064c67bfad4b011974d");
        } else if (this.i == null || canvas == null) {
        } else {
            Iterator<b> it2 = this.i.iterator();
            while (it2.hasNext()) {
                b next2 = it2.next();
                int i = next2.l;
                int i2 = next2.m;
                Object[] objArr4 = new Object[2];
                objArr4[0] = Integer.valueOf(i);
                objArr4[c] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "181f38c4e7959529b1ef44ce7948af5e", RobustBitConfig.DEFAULT_VALUE)) {
                    bitmap = (Bitmap) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "181f38c4e7959529b1ef44ce7948af5e");
                } else {
                    bitmap = (this.n == null || i < 0 || i >= this.n.length || i2 >= this.n[i].length) ? null : this.n[i][i2];
                }
                if (bitmap != null) {
                    this.j.setAlpha((int) (next2.b * 255.0f));
                    this.k.reset();
                    this.k.postRotate(next2.e, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
                    this.k.postScale((next2.j * this.d) / 2.0f, (next2.j * this.d) / 2.0f);
                    this.k.postTranslate(next2.c * this.d, next2.d * this.d);
                    canvas.drawBitmap(bitmap, this.k, this.j);
                }
                c = 1;
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.weather.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafa0430caeedec3ddb7417ec954bbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafa0430caeedec3ddb7417ec954bbab");
            return;
        }
        super.a(i, i2);
        if (this.i == null || this.i.size() <= 0) {
            a(this.b);
        }
    }

    private void a(c[] cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a6ace2d4871c56f841eeeebebdf6cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a6ace2d4871c56f841eeeebebdf6cd");
        } else if (cVarArr != null) {
            this.i = new ArrayList<>();
            for (int i = 0; i < cVarArr.length; i++) {
                c cVar = cVarArr[i];
                for (int i2 = 0; i2 < cVar.f; i2++) {
                    b bVar = new b();
                    bVar.l = i;
                    a(bVar, cVar);
                    if (cVar.f > 1 && cVar.h > 0.0d) {
                        float f = bVar.a / 2.0f;
                        float f2 = 0.0f;
                        Object[] objArr2 = {Float.valueOf(0.0f), Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect2 = f.e;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "16cc2bc170c9b86692585797741a52ab", RobustBitConfig.DEFAULT_VALUE)) {
                            f2 = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "16cc2bc170c9b86692585797741a52ab")).floatValue();
                        } else if (f >= 0.0f) {
                            f2 = (float) ((Math.random() * (f - 0.0f)) + 0.0d);
                        }
                        a(bVar, f2);
                    }
                    this.i.add(bVar);
                }
            }
        }
    }

    private void a(b bVar, c cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01cc627ae3619824bced6b7924319366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01cc627ae3619824bced6b7924319366");
        } else if (cVar == null || bVar == null) {
        } else {
            if (cVar.A != null && cVar.A.length > 0) {
                bVar.m = this.l.nextInt(cVar.A.length);
            }
            bVar.a = a(cVar.g, cVar.h);
            bVar.c = a(cVar.n, cVar.o);
            bVar.d = a(cVar.p, cVar.q);
            bVar.e = a(cVar.v, cVar.w);
            if (cVar.x > 0.0d) {
                bVar.h = (a(cVar.x, cVar.y) - bVar.e) / bVar.a;
            }
            bVar.b = a(cVar.r, cVar.s);
            if (cVar.t > 0.0d) {
                bVar.i = (a(cVar.t, cVar.u) - bVar.b) / bVar.a;
            }
            bVar.j = a(cVar.b, cVar.c);
            if (cVar.d > 0.0d) {
                bVar.k = (a(cVar.d, cVar.e) - bVar.j) / bVar.a;
            }
            double radians = Math.toRadians(a(cVar.i, cVar.j));
            double a2 = a(1.0d, cVar.l);
            if (cVar.B) {
                a2 *= bVar.j;
            }
            double a3 = a(cVar.k * a2, cVar.m);
            bVar.f = (float) (Math.cos(radians) * a3);
            bVar.g = (float) (Math.sin(radians) * a3);
        }
    }

    private void a(b bVar, double d) {
        Object[] objArr = {bVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d05126c8dc2e17a9df79930229319fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d05126c8dc2e17a9df79930229319fd");
            return;
        }
        bVar.c = (float) (bVar.c + (bVar.f * d));
        bVar.d = (float) (bVar.d + (bVar.g * d));
        bVar.e = (float) (bVar.e + (bVar.h * d));
        bVar.b = (float) (bVar.b + (bVar.i * d));
        bVar.j = (float) (bVar.j + (bVar.k * d));
        bVar.a = (float) (bVar.a - d);
    }

    private float a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d52c3fe8782158fdb943de904a99494", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d52c3fe8782158fdb943de904a99494")).floatValue() : (float) (d + a(d2));
    }

    private static double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b7a68cd159c7303136941be1887b1f", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b7a68cd159c7303136941be1887b1f")).doubleValue() : d * 2.0d * (Math.random() - 0.5d);
    }
}
