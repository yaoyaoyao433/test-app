package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    LatLng b;
    float c;
    int d;
    double e;
    float f;
    boolean g;
    private MTMap h;
    private BitmapDescriptor i;
    private GradientDrawable j;
    private int k;
    private volatile float l;
    private float m;
    private int n;
    private int o;
    private List<GroundOverlay> p;
    private AnimatorSet q;

    public a(MTMap mTMap, Context context) {
        Object[] objArr = {mTMap, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "068cec1b1f5a5f8152600a8ca2baab59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "068cec1b1f5a5f8152600a8ca2baab59");
            return;
        }
        this.k = 0;
        this.c = 0.0f;
        this.n = 1;
        this.d = 1500;
        this.e = 1000.0d;
        this.o = 1000;
        this.q = null;
        this.g = false;
        this.p = new ArrayList();
        this.h = mTMap;
        this.j = (GradientDrawable) ContextCompat.getDrawable(context, R.drawable.wm_order_status_map_bad_weather_ripper_background);
        this.l = (float) (((com.sankuai.waimai.foundation.utils.g.a(context) * 1.0d) / 750.0d) * 334.0d);
        this.f = 1.0f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdee32f93fbe2c161ef5efbf97cf91e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdee32f93fbe2c161ef5efbf97cf91e5");
            return;
        }
        this.q = new AnimatorSet();
        this.q.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.a.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr3 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a6b7c612bc20c300975638d662395ffd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a6b7c612bc20c300975638d662395ffd");
                    return;
                }
                super.onAnimationCancel(animator);
                a.this.g = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr3 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d7e9c66867cc223e00c2502af5bfb87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d7e9c66867cc223e00c2502af5bfb87");
                    return;
                }
                super.onAnimationStart(animator);
                a.this.g = true;
            }
        });
    }

    public final a a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0025df4ede166c270e43848f8fa85cd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0025df4ede166c270e43848f8fa85cd7");
        }
        this.m = f;
        this.l *= f;
        return this;
    }

    public final a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46cfe92b5df886ba5418de79973a70b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46cfe92b5df886ba5418de79973a70b2");
        }
        this.k = i;
        if (this.k == 1) {
            this.l = (float) (this.l * 1.4d);
            this.n = 1;
            this.d = 1800;
            this.e = 1200.0d;
        } else if (this.k == 2) {
            this.l = (float) (this.l * 1.6d);
            this.n = 2;
            this.o = 1200;
            this.d = 2400;
            this.e = 1200.0d;
        } else if (this.k == 3) {
            this.l *= 2.0f;
            this.n = 2;
            this.o = 1200;
            this.d = 2000;
            this.e = 800.0d;
        }
        return this;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec463f043b7b4487b70aa75061a9a873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec463f043b7b4487b70aa75061a9a873");
        } else if (!this.g) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9186333b476f0a13afb0406465a28a87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9186333b476f0a13afb0406465a28a87");
            } else {
                this.i = BitmapDescriptorFactory.fromBitmap(com.sankuai.waimai.foundation.utils.c.a(this.j));
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.n; i++) {
                final GroundOverlay addGroundOverlay = this.h.addGroundOverlay(new GroundOverlayOptions().position(this.b, 0).transparency(this.c).image(this.i));
                this.p.add(addGroundOverlay);
                final float f = this.l;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3ad75ae61a91e9da2275b49e8548ce4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3ad75ae61a91e9da2275b49e8548ce4");
                        } else if (addGroundOverlay == null) {
                        } else {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * a.this.f;
                            addGroundOverlay.setDimensions(floatValue);
                            double d = floatValue / (f * a.this.f);
                            double d2 = (a.this.e * 1.0d) / a.this.d;
                            if (d > d2) {
                                addGroundOverlay.setTransparency((float) ((d - d2) / (1.0d - d2)));
                                return;
                            }
                            a.this.c = 0.0f;
                            addGroundOverlay.setTransparency(a.this.c);
                        }
                    }
                });
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(this.d);
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.setStartDelay(this.o * i);
                arrayList.add(ofFloat);
            }
            this.q.playTogether(arrayList);
            this.q.start();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d027d65e0e474765e7a33f50889cd37f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d027d65e0e474765e7a33f50889cd37f");
            return;
        }
        if (this.g) {
            this.q.cancel();
        }
        for (GroundOverlay groundOverlay : this.p) {
            if (groundOverlay != null) {
                groundOverlay.remove();
            }
        }
    }
}
