package com.meituan.msi.lib.map.view.model;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.LinearInterpolator;
import com.dianping.titans.client.ImageTitleHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a;
    final MTMap b;
    Circle c;
    Circle d;
    Circle e;
    Marker f;
    public int g;
    public int h;
    public int i;
    private ValueAnimator j;

    public s(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07033a9ace6a8b82060417479c09a15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07033a9ace6a8b82060417479c09a15");
            return;
        }
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.b = mTMap;
    }

    public void a(CircleOptions circleOptions, CircleOptions circleOptions2, CircleOptions circleOptions3) {
        Object[] objArr = {circleOptions, circleOptions2, circleOptions3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2088fb75f343322ca6b4dc37aecfc349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2088fb75f343322ca6b4dc37aecfc349");
            return;
        }
        this.c = this.b.addCircle(circleOptions);
        this.d = this.b.addCircle(circleOptions2);
        this.e = this.b.addCircle(circleOptions3);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c14d1dc143275d9271eba333704664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c14d1dc143275d9271eba333704664");
        } else if (this.c == null || this.e == null || this.d == null) {
        } else {
            final int red = Color.red(this.g);
            final int green = Color.green(this.g);
            final int blue = Color.blue(this.g);
            final int red2 = Color.red(this.h);
            final int green2 = Color.green(this.h);
            final int blue2 = Color.blue(this.h);
            final int red3 = Color.red(this.i);
            final int green3 = Color.green(this.i);
            final int blue3 = Color.blue(this.i);
            this.j = ValueAnimator.ofInt(0, 1850);
            this.j.setDuration(1850L);
            this.j.setInterpolator(new LinearInterpolator());
            this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.msi.lib.map.view.model.s.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "298b97e67ab03693141b6f1e9bff7f38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "298b97e67ab03693141b6f1e9bff7f38");
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue < 600) {
                        s.this.e.setRadius(((intValue * 0.12f) / 10.0f) + 10.0f);
                    } else if (intValue >= 600 && intValue <= 700) {
                        s.this.e.setRadius(17.0d);
                    } else if (intValue > 700 && intValue <= 1300) {
                        s.this.e.setRadius(17.0d - (((intValue - 700) * 0.08d) / 10.0d));
                    }
                    if (intValue <= 600) {
                        s.this.e.setFillColor(Color.argb((int) (intValue * 0.077d), red, green, blue));
                    } else if (intValue > 600 && intValue <= 1300) {
                        s.this.e.setFillColor(Color.argb((int) (46.0d - ((intValue - 600) * 0.065d)), red, green, blue));
                    }
                    if (intValue >= 260 && intValue < 700) {
                        s.this.d.setRadius((((intValue - 260) * 0.26d) / 10.0d) + 23.0d);
                    } else if (intValue >= 700 && intValue < 800) {
                        s.this.d.setRadius(35.0d);
                    } else if (intValue >= 800 && intValue <= 1400) {
                        s.this.d.setRadius(35.0d - (((intValue - 800) * 0.019d) / 10.0d));
                    }
                    if (intValue <= 700) {
                        s.this.d.setFillColor(Color.argb((int) (intValue * 0.021d), red2, green2, blue2));
                    } else if (intValue > 700 && intValue <= 1400) {
                        s.this.d.setFillColor(Color.argb((int) (15.0d - ((intValue - 700) * 0.021d)), red2, green2, blue2));
                    }
                    if (intValue >= 400 && intValue <= 1650) {
                        s.this.c.setRadius((((intValue + ImageTitleHelper.ERR_IMG_OBTAIN) * 0.536d) / 10.0d) + 30.0d);
                    }
                    if (intValue > 300 && intValue <= 400) {
                        s.this.c.setStrokeColor(Color.argb((int) ((intValue - 300) * 0.0765d), red3, green3, blue3));
                    } else if (intValue > 400 && intValue <= 800) {
                        s.this.c.setStrokeColor(Color.argb((int) (((intValue + ImageTitleHelper.ERR_IMG_OBTAIN) * 0.09d) + 7.65d), red3, green3, blue3));
                    } else if (intValue > 800 && intValue <= 1650) {
                        s.this.c.setStrokeColor(Color.argb((int) (46.0d - ((intValue - 800) * 0.054d)), red3, green3, blue3));
                    }
                    if (intValue <= 400 || intValue > 1650) {
                        return;
                    }
                    s.this.c.setStrokeWidth(com.meituan.msi.util.f.b((float) (((intValue - 400) * 8.0E-4d) + 3.0d)) / 2.0f);
                }
            });
            this.j.setRepeatCount(-1);
            this.j.setRepeatMode(1);
            this.j.start();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc67ec7dbb292aa1000ec73fbcd56a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc67ec7dbb292aa1000ec73fbcd56a4");
            return;
        }
        if (this.j != null) {
            this.j.cancel();
            this.j = null;
        }
        if (this.f != null) {
            this.f.remove();
        }
        if (this.e != null) {
            this.e.remove();
        }
        if (this.d != null) {
            this.d.remove();
        }
        if (this.c != null) {
            this.c.remove();
        }
    }
}
