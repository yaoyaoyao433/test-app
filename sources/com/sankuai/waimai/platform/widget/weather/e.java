package com.sankuai.waimai.platform.widget.weather;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.facebook.react.uimanager.ao;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.meituan.roodesign.widgets.animator.b;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.widget.weather.f;
import com.squareup.picasso.PicassoDrawable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static int b = 800;
    private AnimatorSet A;
    private AnimatorSet B;
    @NonNull
    private final ImageView C;
    @NonNull
    private final ImageView D;
    @NonNull
    private final ImageView E;
    @NonNull
    private final ImageView F;
    @NonNull
    private final ImageView G;
    @NonNull
    private final ImageView H;
    @NonNull
    private final ImageView I;
    @NonNull
    private final ImageView J;
    @NonNull
    private final ImageView K;
    @NonNull
    private ImageView L;
    @NonNull
    private ImageView M;
    @NonNull
    private ImageView N;
    @NonNull
    private ImageView O;
    @NonNull
    private ImageView P;
    @NonNull
    private ImageView Q;
    @NonNull
    private ImageView R;
    @NonNull
    private ImageView S;
    @NonNull
    private ImageView T;
    private Context U;
    private int V;
    private int W;
    private float X;
    private ValueAnimator Y;
    private ValueAnimator Z;
    private AnimatorSet aa;
    private Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> ab;
    private Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> ac;
    private WeatherView c;
    private ImageView d;
    private ImageView e;
    private FrameLayout f;
    private RooImageView g;
    private RooImageView h;
    private RooImageView i;
    private RooImageView j;
    private ImageView k;
    private FrameLayout l;
    private RooImageView m;
    private RooImageView n;
    private AnimationSet o;
    private RooImageView p;
    private Animation q;
    private final RooImageView r;
    private RotateAnimation s;
    @NonNull
    private final ImageView t;
    private Animation u;
    private FrameLayout v;
    @NonNull
    private final ScrollImageView w;
    private int x;
    private ValueAnimator y;
    private ValueAnimator z;

    public e(View view, Context context) {
        Object[] objArr = {view, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c0682926af0dc95927001c884d178e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c0682926af0dc95927001c884d178e");
            return;
        }
        this.ab = new HashMap();
        this.ac = new HashMap();
        this.U = context;
        this.c = (WeatherView) view.findViewById(R.id.weather_view);
        this.d = (ImageView) view.findViewById(R.id.mask_weather_iv);
        this.e = (ImageView) view.findViewById(R.id.animation_under_cloud);
        this.f = (FrameLayout) view.findViewById(R.id.weather_cloud_container);
        this.g = (RooImageView) view.findViewById(R.id.weather_cloud_fast1);
        this.h = (RooImageView) view.findViewById(R.id.weather_cloud_slow1);
        this.i = (RooImageView) view.findViewById(R.id.weather_cloud_fast2);
        this.j = (RooImageView) view.findViewById(R.id.weather_cloud_slow2);
        this.k = (ImageView) view.findViewById(R.id.rain_bounce);
        this.l = (FrameLayout) view.findViewById(R.id.fl_high_temp_new_root);
        this.m = (RooImageView) view.findViewById(R.id.weather_high_temperature_sun_shadow);
        this.n = (RooImageView) view.findViewById(R.id.weather_high_temperature_scaled_halo_new);
        this.p = (RooImageView) view.findViewById(R.id.weather_high_temperature_rotate_sun);
        this.r = (RooImageView) view.findViewById(R.id.weather_high_temperature_rotate_facula);
        this.t = (ImageView) view.findViewById(R.id.weather_strong_wind);
        this.v = (FrameLayout) view.findViewById(R.id.fl_strong_wind_root);
        this.L = (ImageView) view.findViewById(R.id.strong_wind_leaf_first);
        this.M = (ImageView) view.findViewById(R.id.strong_wind_leaf_second);
        this.N = (ImageView) view.findViewById(R.id.strong_wind_leaf_third);
        this.O = (ImageView) view.findViewById(R.id.strong_wind_stone_first);
        this.P = (ImageView) view.findViewById(R.id.strong_wind_stone_second);
        this.Q = (ImageView) view.findViewById(R.id.strong_wind_stone_third);
        this.R = (ImageView) view.findViewById(R.id.strong_wind_cloud_first);
        this.S = (ImageView) view.findViewById(R.id.strong_wind_cloud_second);
        this.T = (ImageView) view.findViewById(R.id.strong_wind_grass);
        this.w = (ScrollImageView) view.findViewById(R.id.weather_smog);
        this.C = (ImageView) view.findViewById(R.id.dust_storm_leaf_first);
        this.D = (ImageView) view.findViewById(R.id.dust_storm_leaf_second);
        this.E = (ImageView) view.findViewById(R.id.dust_storm_leaf_third);
        this.F = (ImageView) view.findViewById(R.id.dust_storm_stone_first);
        this.G = (ImageView) view.findViewById(R.id.dust_storm_stone_second);
        this.H = (ImageView) view.findViewById(R.id.dust_storm_stone_third);
        this.I = (ImageView) view.findViewById(R.id.dust_storm_cloud_first);
        this.J = (ImageView) view.findViewById(R.id.dust_storm_cloud_second);
        this.K = (ImageView) view.findViewById(R.id.dust_storm_grass);
        b = g.a(this.U, 267.0f);
        a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "440cc9a15bbb6481badbafadd1a7c6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "440cc9a15bbb6481badbafadd1a7c6a9");
            return;
        }
        a(this.g, 475, 136, 0, 36, -1);
        a(this.h, 557, 142, 0, 240, 1);
        a(this.i, 475, 136, 0, 750, 1);
        a(this.j, 557, 142, 0, 1092, 1);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eae23913efb56ad733ab3eadf5e7fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eae23913efb56ad733ab3eadf5e7fc8");
            return;
        }
        this.V = g.a(this.U);
        this.W = g.b(this.U);
        this.X = this.V / 750.0f;
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        layoutParams.width = g.a(this.U);
        layoutParams.height = (int) (g.b(this.U) * 0.65d);
        if (layoutParams.height > 0) {
            this.d.setLayoutParams(layoutParams);
        }
    }

    private void a(ImageView imageView, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {imageView, Integer.valueOf(i), Integer.valueOf(i2), 0, Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7beb9d8058fefe4be5ecf966c7f4da54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7beb9d8058fefe4be5ecf966c7f4da54");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = Math.round(i * this.X);
        layoutParams.height = Math.round(i2 * this.X);
        layoutParams.setMargins(Math.round(this.X * 0.0f) * i5, 0, Math.round(i4 * this.X) * i5, 0);
        imageView.setLayoutParams(layoutParams);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa4e3a3ee3b58e179bedfc63232f6aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa4e3a3ee3b58e179bedfc63232f6aa");
            return;
        }
        this.x = i;
        b(this.x);
        d(this.x);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b61550034f6befad479555c22330d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b61550034f6befad479555c22330d5e");
            return;
        }
        this.t.setVisibility(8);
        this.w.setVisibility(8);
        h();
        this.l.setVisibility(8);
        this.v.setVisibility(8);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239f20cb2153dee60f2be2c26875e6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239f20cb2153dee60f2be2c26875e6d9");
            return;
        }
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.G.setVisibility(8);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        this.K.setVisibility(8);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea72c71a45ade37c53bec0b4d7e7a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea72c71a45ade37c53bec0b4d7e7a1d");
            return;
        }
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        this.H.setVisibility(0);
        this.I.setVisibility(0);
        this.J.setVisibility(0);
        this.K.setVisibility(0);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552eb166b9d64b4826485e9289dba70e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552eb166b9d64b4826485e9289dba70e");
        } else if (i == 5) {
            this.w.setVisibility(0);
            this.c.setDrawerType(f.a.SMOG);
            this.c.setVisibility(0);
            this.f.setVisibility(8);
            this.d.setVisibility(8);
            h();
            this.t.setVisibility(8);
            this.l.setVisibility(8);
            this.v.setVisibility(8);
        } else if (i == 8) {
            this.d.setVisibility(0);
            this.d.setImageResource(R.drawable.wm_widget_weather_mask_strong_wind);
            this.c.setDrawerType(f.a.STRONG_WIND);
            this.c.setVisibility(0);
            this.t.setVisibility(0);
            this.f.setVisibility(8);
            h();
            this.w.setVisibility(8);
            this.l.setVisibility(8);
            this.v.setVisibility(8);
        } else if (i == 31) {
            this.d.setVisibility(0);
            this.d.setImageResource(R.drawable.wm_widget_weather_mask_dust_storms_wind);
            this.c.setDrawerType(f.a.DUST_STORM);
            this.c.setVisibility(0);
            this.t.setVisibility(8);
            this.f.setVisibility(8);
            i();
            this.w.setVisibility(8);
            this.l.setVisibility(8);
            this.v.setVisibility(8);
        } else if (i == 41) {
            this.d.setVisibility(0);
            this.d.setImageResource(R.drawable.wm_widget_weather_mask_high_temperature_new);
            this.l.setVisibility(0);
            j();
            this.f.setVisibility(8);
            this.c.setVisibility(8);
            this.t.setVisibility(8);
            h();
            this.w.setVisibility(8);
            this.v.setVisibility(8);
        } else if (i != 80) {
            switch (i) {
                case 11:
                    this.c.setDrawerType(f.a.RAIN_MEDIUM);
                    this.d.setVisibility(0);
                    this.d.setImageResource(R.drawable.wm_widget_weather_mask_medium_rain);
                    this.f.setVisibility(0);
                    this.g.setImageResourceByResName("waimai_c_wm_order_weather_lightmoderate_rain_yun2");
                    this.h.setImageResourceByResName("waimai_c_wm_order_weather_lightmoderate_rain_yun1");
                    this.i.setImageResourceByResName("waimai_c_wm_order_weather_lightmoderate_rain_yun2");
                    this.j.setImageResourceByResName("waimai_c_wm_order_weather_lightmoderate_rain_yun1");
                    g();
                    return;
                case 12:
                    this.c.setDrawerType(f.a.RAIN_LARGE);
                    this.d.setVisibility(0);
                    this.d.setImageResource(R.drawable.wm_widget_weather_mask_large_rain);
                    this.f.setVisibility(0);
                    this.g.setImageResourceByResName("waimai_c_wm_order_weather_heavy_rain_yun2");
                    this.h.setImageResourceByResName("waimai_c_wm_order_weather_heavy_rain_yun1");
                    this.i.setImageResourceByResName("waimai_c_wm_order_weather_heavy_rain_yun2");
                    this.j.setImageResourceByResName("waimai_c_wm_order_weather_heavy_rain_yun1");
                    g();
                    return;
                case 13:
                    this.c.setDrawerType(f.a.RAIN_LARGE);
                    this.d.setVisibility(0);
                    this.d.setImageResource(R.drawable.wm_widget_weather_mask_thunder_storm);
                    this.f.setVisibility(0);
                    this.g.setImageResourceByResName("waimai_c_wm_order_weather_thunderstorm_rain_yun2_new");
                    this.h.setImageResourceByResName("waimai_c_wm_order_weather_thunderstorm_rain_yun1_new");
                    this.i.setImageResourceByResName("waimai_c_wm_order_weather_thunderstorm_rain_yun2_new");
                    this.j.setImageResourceByResName("waimai_c_wm_order_weather_thunderstorm_rain_yun1_new");
                    g();
                    return;
                case 14:
                    this.c.setDrawerType(f.a.RAIN_STORM);
                    this.d.setVisibility(0);
                    this.d.setImageResource(R.drawable.wm_widget_weather_mask_large_rain);
                    this.f.setVisibility(0);
                    this.g.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_rain_yun2");
                    this.h.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_rain_yun1");
                    this.i.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_rain_yun2");
                    this.j.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_rain_yun1");
                    g();
                    return;
                default:
                    switch (i) {
                        case 21:
                            this.c.setDrawerType(f.a.SNOW_MEDIUM);
                            this.d.setVisibility(0);
                            this.d.setImageResource(R.drawable.wm_widget_weather_mask_medium_snow);
                            this.f.setVisibility(0);
                            this.g.setImageResourceByResName("waimai_c_wm_order_weather_moderate_snow_yun2");
                            this.h.setImageResourceByResName("waimai_c_wm_order_weather_moderate_snow_yun1");
                            this.i.setImageResourceByResName("waimai_c_wm_order_weather_moderate_snow_yun2");
                            this.j.setImageResourceByResName("waimai_c_wm_order_weather_moderate_snow_yun1");
                            this.d.setAlpha(1.0f);
                            g();
                            return;
                        case 22:
                            this.c.setDrawerType(f.a.SNOW_LARGE);
                            this.d.setVisibility(0);
                            this.d.setImageResource(R.drawable.wm_widget_weather_mask_large_snow);
                            this.f.setVisibility(0);
                            this.g.setImageResourceByResName("waimai_c_wm_order_weather_heavy_snow_yun2");
                            this.h.setImageResourceByResName("waimai_c_wm_order_weather_heavy_snow_yun1");
                            this.i.setImageResourceByResName("waimai_c_wm_order_weather_heavy_snow_yun2");
                            this.j.setImageResourceByResName("waimai_c_wm_order_weather_heavy_snow_yun1");
                            this.d.setAlpha(1.0f);
                            g();
                            return;
                        case 23:
                            this.c.setDrawerType(f.a.SNOW_BLIZZARD);
                            this.d.setVisibility(0);
                            this.d.setImageResource(R.drawable.wm_widget_weather_mask_blizzard_snow);
                            this.f.setVisibility(0);
                            this.g.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_snow_yun2");
                            this.h.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_snow_yun1");
                            this.i.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_snow_yun2");
                            this.j.setImageResourceByResName("waimai_c_wm_order_weather_rainstorm_snow_yun1");
                            this.d.setAlpha(1.0f);
                            g();
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.d.setVisibility(0);
            this.d.setImageResource(R.drawable.wm_widget_weather_mask_strong_wind_new);
            this.c.setDrawerType(f.a.STRONG_WIND_NEW);
            this.c.setVisibility(0);
            this.t.setVisibility(8);
            this.f.setVisibility(8);
            this.v.setVisibility(0);
            this.w.setVisibility(8);
            this.l.setVisibility(8);
            h();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1cefad2edde7250d2132825f7a43aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1cefad2edde7250d2132825f7a43aec");
        } else {
            this.l.post(new Runnable() { // from class: com.sankuai.waimai.platform.widget.weather.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "add919e3d9d98c852d3e5382a727f9bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "add919e3d9d98c852d3e5382a727f9bf");
                        return;
                    }
                    int measuredWidth = e.this.m.getMeasuredWidth();
                    int measuredHeight = e.this.m.getMeasuredHeight();
                    if (measuredWidth < measuredHeight) {
                        measuredWidth = measuredHeight;
                    }
                    int measuredWidth2 = e.this.n.getMeasuredWidth();
                    int measuredHeight2 = e.this.n.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.n.getLayoutParams();
                    marginLayoutParams.topMargin = (measuredHeight - measuredHeight2) / 2;
                    marginLayoutParams.leftMargin = (measuredWidth - measuredWidth2) / 2;
                    e.this.n.setLayoutParams(marginLayoutParams);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.l.getLayoutParams();
                    double d = measuredWidth;
                    marginLayoutParams2.topMargin = ((int) (0.55d * d)) * (-1);
                    marginLayoutParams2.leftMargin = ((int) (d * 0.35d)) * (-1);
                    e.this.l.setLayoutParams(marginLayoutParams2);
                }
            });
        }
    }

    private void c(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac19a91fb222f681a0215bdebf7314b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac19a91fb222f681a0215bdebf7314b8");
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, RecceAnimUtils.TRANSLATION_X, 0.0f, Math.round(this.X * 786.0f));
        ofFloat.setDuration(98025L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.h, RecceAnimUtils.TRANSLATION_X, 0.0f, Math.round(this.X * 786.0f));
        ofFloat2.setDuration(98025L);
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.i, RecceAnimUtils.TRANSLATION_X, 0.0f, Math.round(this.X * 786.0f));
        ofFloat3.setDuration(98025L);
        ofFloat3.setRepeatCount(-1);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.j, RecceAnimUtils.TRANSLATION_X, 0.0f, Math.round(this.X * 786.0f));
        ofFloat4.setDuration(98025L);
        ofFloat4.setRepeatCount(-1);
        this.A.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        if (i == 11 || i == 12 || i == 13 || i == 14) {
            this.k.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams.width = this.V;
            layoutParams.height = 200;
            layoutParams.setMargins(0, ((int) (g.b(this.U) * 0.65d)) - 130, 0, 0);
            this.k.setLayoutParams(layoutParams);
            if (i == 11) {
                this.k.setAlpha(0.7f);
                str = "https://p0.meituan.net/travelcube/8e2dd6bf3034db0052838424a0e1526b42874.gif";
            } else if (i == 14) {
                this.k.setAlpha(0.6f);
                str = "https://p0.meituan.net/travelcube/a75b2d1121386c72837ce8c36b03762768889.gif";
            } else {
                this.k.setAlpha(0.6f);
                str = "https://p0.meituan.net/travelcube/47049d02e8e4067320306ab6e28b373b82337.gif";
            }
            String str2 = str;
            ImageView imageView = this.k;
            Object[] objArr2 = {imageView, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "576bb6c615a81a230c0bc0775e0d8078", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "576bb6c615a81a230c0bc0775e0d8078");
                return;
            }
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = com.meituan.android.singleton.b.a;
            a2.c = str2;
            a2.f = ImageQualityUtil.a(0);
            a2.a(new b.d() { // from class: com.sankuai.waimai.platform.widget.weather.e.2
                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i2, Exception exc) {
                }
            }).a(imageView);
            return;
        }
        this.k.setVisibility(8);
    }

    private void d(int i) {
        float f;
        float l;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bea25ac427c6371514b4081c02723a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bea25ac427c6371514b4081c02723a2");
        } else if (i == 5) {
            this.w.a(com.meituan.roodesign.resfetcher.runtime.c.a(this.U, "waimai_c_weather_haze"), g.a(this.U, 320.0f), g.a(this.U, 700.0f));
            this.w.setSpeed(g.a(this.U, 25.0f));
        } else if (i == 8) {
            if (this.u == null) {
                float dimension = this.U.getResources().getDimension(R.dimen.wm_widget_weather_strong_wind_image_width);
                float f2 = -dimension;
                this.u = new TranslateAnimation(f2, f2 + dimension + com.sankuai.waimai.platform.b.A().l() + (1.5f * g.a(this.U, 300.0f)), 0.0f, 0.0f);
                this.u.setInterpolator(new LinearInterpolator());
                this.u.setRepeatCount(-1);
                this.u.setRepeatMode(1);
                this.u.setDuration((l / f) * 1000.0f);
            }
        } else if (i == 31) {
            m();
        } else if (i == 41) {
            if (this.o == null) {
                this.o = new AnimationSet(true);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 3.5f, 1.0f, 3.5f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                scaleAnimation.setRepeatCount(-1);
                scaleAnimation.setRepeatMode(1);
                scaleAnimation.setDuration(2500L);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(1);
                alphaAnimation.setStartOffset(1250L);
                alphaAnimation.setDuration(1250L);
                this.o.addAnimation(scaleAnimation);
                this.o.addAnimation(alphaAnimation);
            }
            if (this.q == null) {
                this.q = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                this.q.setInterpolator(new LinearInterpolator());
                this.q.setRepeatCount(-1);
                this.q.setRepeatMode(1);
                this.q.setDuration(72000L);
            }
            if (this.s == null) {
                this.s = new RotateAnimation(0.0f, 60.0f, 1, 0.5f, 1, 0.5f);
                this.s.setInterpolator(new LinearInterpolator());
                this.s.setRepeatCount(-1);
                this.s.setRepeatMode(2);
                this.s.setDuration(10000L);
            }
        } else if (i != 80) {
            switch (i) {
                case 11:
                case 12:
                case 14:
                    break;
                case 13:
                    if (this.A == null) {
                        this.A = new AnimatorSet();
                    }
                    c(i);
                    if (this.y == null) {
                        this.y = ValueAnimator.ofObject(new c(), Float.valueOf(1.0f), Float.valueOf(0.6f));
                        this.y.setInterpolator(new LinearInterpolator());
                        this.y.setDuration(4000L);
                        this.y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.platform.widget.weather.e.3
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr2 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4de4e66f338bffe340153d0e343871d7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4de4e66f338bffe340153d0e343871d7");
                                } else if (e.this.d != null) {
                                    e.this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            }
                        });
                        this.y.setRepeatCount(-1);
                    }
                    if (this.z == null) {
                        this.z = ValueAnimator.ofObject(new b(), Float.valueOf(1.0f), Float.valueOf(0.0f));
                        this.z.setInterpolator(new LinearInterpolator());
                        this.z.setDuration(4000L);
                        this.z.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.platform.widget.weather.e.4
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr2 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdf1781ccddbb0358c1e50eec55e5637", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdf1781ccddbb0358c1e50eec55e5637");
                                } else if (e.this.e != null) {
                                    e.this.e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            }
                        });
                        this.z.setRepeatCount(-1);
                    }
                    if (this.B == null) {
                        this.B = new AnimatorSet();
                        return;
                    }
                    return;
                default:
                    switch (i) {
                        case 21:
                        case 22:
                        case 23:
                            break;
                        default:
                            return;
                    }
            }
            if (this.A == null) {
                this.A = new AnimatorSet();
            }
            c(i);
        } else {
            n();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fcd514c803b96301255108f69ec06a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fcd514c803b96301255108f69ec06a");
        } else {
            e();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a290cf1c1203c7e4a69782085471eef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a290cf1c1203c7e4a69782085471eef1");
            return;
        }
        this.c.a();
        if (this.x == 14 || this.x == 22 || this.x == 23 || this.x == 11 || this.x == 12 || this.x == 21) {
            if (this.A == null || !this.A.isRunning()) {
                return;
            }
            this.A.pause();
        } else if (this.x == 5) {
            this.w.b();
        } else if (this.x == 41) {
            if (this.o != null) {
                this.o.cancel();
            }
            if (this.q != null) {
                this.q.cancel();
            }
            if (this.s != null) {
                this.s.cancel();
            }
        } else if (this.x == 13) {
            if (this.B != null && this.B.isRunning()) {
                this.B.pause();
            }
            if (this.A == null || !this.A.isRunning()) {
                return;
            }
            this.A.pause();
        } else if (this.x == 80) {
            if (this.aa != null) {
                this.aa.cancel();
            }
            if (this.Z != null) {
                this.Z.cancel();
            }
        } else {
            f();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b86946fa1965c477e29739f4e09a700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b86946fa1965c477e29739f4e09a700");
        } else {
            f();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfe5e45fa2622ec45a30d033a6c2d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfe5e45fa2622ec45a30d033a6c2d4e");
            return;
        }
        if (this.x == 11 || this.x == 12 || this.x == 14 || this.x == 22 || this.x == 23 || this.x == 21) {
            t();
            s();
            l();
            r();
            u();
            this.d.setVisibility(0);
            this.c.setVisibility(0);
            this.c.b();
            if (this.A != null) {
                if (this.A.isRunning()) {
                    if (this.A.isPaused()) {
                        this.A.start();
                    }
                } else {
                    this.A.start();
                }
            }
        } else if (this.x == 13) {
            if (this.B == null || this.z == null || this.y == null) {
                return;
            }
            t();
            s();
            l();
            r();
            u();
            this.d.setVisibility(0);
            this.c.setVisibility(0);
            this.c.b();
            if (this.A != null && (!this.A.isRunning() || this.A.isPaused())) {
                this.A.start();
            }
            if (this.y != null) {
                this.y.removeAllListeners();
                this.y.end();
                this.y.cancel();
            }
            if (this.z != null) {
                this.z.removeAllListeners();
                this.z.end();
                this.z.cancel();
            }
            this.e.setImageDrawable(null);
            this.e.setVisibility(8);
            this.B.cancel();
            this.B = new AnimatorSet();
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.U;
            a2.c = "https://p0.meituan.net/travelcube/e8927f3d3cafa9f88ce8a047065fcf4940683.gif";
            a2.f = ImageQualityUtil.a(0);
            a2.a(new com.sankuai.meituan.mtimageloader.utils.d() { // from class: com.sankuai.waimai.platform.widget.weather.e.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.utils.d
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.utils.d
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80174598d8e4d20ab544499f8767411c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80174598d8e4d20ab544499f8767411c");
                    } else if (!(obj instanceof PicassoDrawable) || e.this.B == null) {
                    } else {
                        final PicassoDrawable picassoDrawable = (PicassoDrawable) obj;
                        picassoDrawable.a(1);
                        e.this.e.setImageDrawable(picassoDrawable);
                        e.this.B.playTogether(e.this.y, e.this.z);
                        e.this.z.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.platform.widget.weather.e.5.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                Object[] objArr3 = {animator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d63124a8c3e9f78f958ea1893f06784", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d63124a8c3e9f78f958ea1893f06784");
                                } else {
                                    e.this.e.setVisibility(0);
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Object[] objArr3 = {animator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46185b8f4cebb8ed390483637ef24f57", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46185b8f4cebb8ed390483637ef24f57");
                                } else {
                                    picassoDrawable.stop();
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                Object[] objArr3 = {animator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5257a6db782ad82db4e90d1a915b2da7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5257a6db782ad82db4e90d1a915b2da7");
                                } else {
                                    picassoDrawable.stop();
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                                Object[] objArr3 = {animator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f560cd3d498c5aed079c90119d771d2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f560cd3d498c5aed079c90119d771d2");
                                } else {
                                    picassoDrawable.d();
                                }
                            }
                        });
                        try {
                            e.this.B.start();
                        } catch (IllegalStateException unused) {
                        }
                        l.a(new Runnable() { // from class: com.sankuai.waimai.platform.widget.weather.e.5.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "44bc2d36bcf2566136b1e5c2a89e363a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "44bc2d36bcf2566136b1e5c2a89e363a");
                                } else {
                                    picassoDrawable.start();
                                }
                            }
                        }, 550, "gif.start");
                    }
                }
            });
        } else if (this.x == 5) {
            t();
            s();
            k();
            r();
            u();
            this.c.setVisibility(0);
            this.c.b();
            this.w.setVisibility(0);
            this.w.a();
        } else if (this.x == 8) {
            k();
            l();
            r();
            u();
            this.c.setVisibility(0);
            this.c.b();
            this.t.setVisibility(0);
            this.t.startAnimation(this.u);
        } else if (this.x == 80) {
            t();
            k();
            l();
            r();
            u();
            this.c.setVisibility(0);
            this.c.b();
            p();
        } else if (this.x == 31) {
            t();
            s();
            k();
            l();
            u();
            this.c.setVisibility(0);
            this.c.b();
            o();
        }
        if (this.x == 41) {
            t();
            s();
            k();
            l();
            r();
            this.d.setVisibility(0);
            this.l.setVisibility(0);
            if (!this.o.hasStarted() || this.o.hasEnded()) {
                this.n.startAnimation(this.o);
            }
            if (!this.q.hasStarted() || this.q.hasEnded()) {
                this.p.startAnimation(this.q);
            }
            if (!this.s.hasStarted() || this.s.hasEnded()) {
                this.r.startAnimation(this.s);
                return;
            }
            return;
        }
        this.c.b();
        this.d.setVisibility(0);
        this.c.setVisibility(0);
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10033d9f09c99fc537f08b3f8c1011a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10033d9f09c99fc537f08b3f8c1011a");
            return;
        }
        this.c.b = false;
        if (this.x == 11 || this.x == 12 || this.x == 21) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.f.setVisibility(8);
            k();
        } else if (this.x == 5) {
            l();
            this.w.setVisibility(8);
            this.c.setVisibility(8);
        } else if (this.x == 8) {
            t();
            this.t.setVisibility(8);
            this.c.setVisibility(8);
        } else if (this.x == 80) {
            s();
            this.v.setVisibility(8);
            this.c.setVisibility(8);
        } else if (this.x == 31) {
            r();
            h();
            this.c.setVisibility(8);
        } else if (this.x == 41) {
            u();
            this.d.setVisibility(8);
            this.l.setVisibility(8);
        } else {
            k();
            t();
            l();
            r();
            u();
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd7d39391717eb53e7039b23bdce01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd7d39391717eb53e7039b23bdce01e");
            return;
        }
        if (this.y != null && this.y.isRunning()) {
            this.y.removeAllUpdateListeners();
            this.y.cancel();
            this.y = null;
        }
        if (this.B != null && this.B.isRunning()) {
            this.B.removeAllListeners();
            this.B.end();
            this.B.cancel();
            this.B = null;
        }
        if (this.z != null && this.z.isRunning()) {
            this.y.removeAllUpdateListeners();
            this.y.cancel();
            this.y = null;
        }
        if (this.A == null || !this.A.isRunning()) {
            return;
        }
        this.A.removeAllListeners();
        this.A.end();
        this.A.cancel();
        this.A = null;
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5588f2c4dc7864ae6b8b41f051a4e6b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5588f2c4dc7864ae6b8b41f051a4e6b0");
        } else {
            this.w.b();
        }
    }

    private long a(long j) {
        return ((float) j) * this.X;
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea670eabd6f59e4416531fe2262af95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea670eabd6f59e4416531fe2262af95");
            return;
        }
        a(this.C, this.ab);
        b(this.D, this.ab);
        c(this.E, this.ab);
        d(this.F, this.ab);
        e(this.G, this.ab);
        f(this.H, this.ab);
        a(this.I, this.J, this.ab);
        g(this.K, this.ab);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13098f2a2c93553511d1f196d258b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13098f2a2c93553511d1f196d258b25");
            return;
        }
        a(this.L, this.ac);
        b(this.M, this.ac);
        c(this.N, this.ac);
        d(this.O, this.ac);
        e(this.P, this.ac);
        f(this.Q, this.ac);
        b(this.R, this.S, this.ac);
        h(this.T, this.ac);
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8115a93602e5d1149e15e73cd231ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8115a93602e5d1149e15e73cd231ffb");
            return;
        }
        if (this.Y != null) {
            this.Y.start();
        }
        if (this.ab.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        a(animatorSet, this.ab.values());
        animatorSet.start();
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1291ef996b6525036b0a400ec349a30a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1291ef996b6525036b0a400ec349a30a");
            return;
        }
        if (this.Z != null && (!this.Z.isRunning() || this.Z.isPaused())) {
            this.Z.start();
        }
        if (this.ac.isEmpty()) {
            return;
        }
        if (this.aa == null) {
            this.aa = new AnimatorSet();
            a(this.aa, this.ac.values());
        } else if (this.aa.isRunning() && this.aa.isStarted()) {
        } else {
            this.aa.start();
        }
    }

    private <T extends Animator> void a(AnimatorSet animatorSet, Collection<T> collection) {
        Object[] objArr = {animatorSet, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c38f97a4fe12225695bdbac346d0c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c38f97a4fe12225695bdbac346d0c82");
            return;
        }
        if (collection != null && collection.size() > 0) {
            AnimatorSet.Builder builder = null;
            for (T t : collection) {
                if (builder == null) {
                    builder = animatorSet.play(t);
                } else {
                    builder.with(t);
                }
            }
        }
        animatorSet.start();
    }

    private void a(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2d631f201ff4444105bf4ff00db407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2d631f201ff4444105bf4ff00db407");
            return;
        }
        long[] jArr = {0, 1000, PayTask.j};
        float[] fArr = {(float) a(-120L), (float) a(840L), (float) a(840L)};
        float[] fArr2 = {(float) a(275L), (float) a(135L), (float) a(135L)};
        imageView.setAlpha(0.5f);
        imageView.setScaleX(0.45f);
        imageView.setScaleY(0.45f);
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(PayTask.j);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(PayTask.j);
        a3.f = RecceAnimUtils.TRANSLATION_Y;
        a3.c = fArr2;
        a3.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c4.a(PayTask.j);
        a4.f = RecceAnimUtils.ROTATION;
        a4.c = new float[]{-30.0f, 60.0f, 60.0f};
        a4.d = 1.0f;
        ValueAnimator a5 = a(a2, map);
        ValueAnimator a6 = a(a3, map);
        ValueAnimator a7 = a(a4, map);
        if (a5 != null) {
            a5.setTarget(imageView);
        }
        if (a6 != null) {
            a6.setTarget(imageView);
        }
        if (a7 != null) {
            a7.setTarget(imageView);
        }
    }

    private void b(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4adad402c0dbb0c5055d02b52421a9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4adad402c0dbb0c5055d02b52421a9c6");
            return;
        }
        long[] jArr = {500, 1500, PayTask.j};
        float[] fArr = {(float) a(-115L), (float) a(835L), (float) a(835L)};
        float[] fArr2 = {(float) a(195L), (float) a(315L), (float) a(315L)};
        imageView.setAlpha(0.4f);
        imageView.setScaleX(0.3f);
        imageView.setScaleY(0.3f);
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(PayTask.j);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(PayTask.j);
        a3.f = RecceAnimUtils.TRANSLATION_Y;
        a3.c = fArr2;
        a3.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c4.a(PayTask.j);
        a4.f = RecceAnimUtils.ROTATION;
        a4.c = new float[]{10.0f, 160.0f, 160.0f};
        a4.d = 1.0f;
        ValueAnimator a5 = a(a2, map);
        ValueAnimator a6 = a(a3, map);
        ValueAnimator a7 = a(a4, map);
        if (a5 != null) {
            a5.setTarget(imageView);
        }
        if (a6 != null) {
            a6.setTarget(imageView);
        }
        if (a7 != null) {
            a7.setTarget(imageView);
        }
    }

    private void c(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bcfb7a88c16fe08cb4351e2736da11c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bcfb7a88c16fe08cb4351e2736da11c");
            return;
        }
        long[] jArr = {1000, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, PayTask.j};
        float[] fArr = {(float) a(-115L), (float) a(835L), (float) a(835L)};
        float[] fArr2 = {(float) a(440L), (float) a(380L), (float) a(380L)};
        imageView.setAlpha(0.3f);
        imageView.setScaleX(0.36f);
        imageView.setScaleY(0.36f);
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(PayTask.j);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(PayTask.j);
        a3.f = RecceAnimUtils.TRANSLATION_Y;
        a3.c = fArr2;
        a3.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c4.a(PayTask.j);
        a4.f = RecceAnimUtils.ROTATION;
        a4.c = new float[]{10.0f, 140.0f, 140.0f};
        a4.d = 1.0f;
        ValueAnimator a5 = a(a2, map);
        ValueAnimator a6 = a(a3, map);
        ValueAnimator a7 = a(a4, map);
        if (a5 != null) {
            a5.setTarget(imageView);
        }
        if (a6 != null) {
            a6.setTarget(imageView);
        }
        if (a7 != null) {
            a7.setTarget(imageView);
        }
    }

    private void d(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97fa72c7046b2cc869e1ebeeca8a4a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97fa72c7046b2cc869e1ebeeca8a4a20");
            return;
        }
        long[] jArr = {1000, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, 4500};
        float[] fArr = {(float) a(-65L), (float) a(875L), (float) a(875L)};
        float[] fArr2 = {(float) a(525L), (float) a(425L), (float) a(425L)};
        imageView.setAlpha(0.5f);
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(4500L);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(4500L);
        a3.f = RecceAnimUtils.TRANSLATION_Y;
        a3.c = fArr2;
        a3.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c4.a(4500L);
        a4.f = RecceAnimUtils.ROTATION;
        a4.c = new float[]{0.0f, 180.0f, 180.0f};
        a4.d = 1.0f;
        ValueAnimator a5 = a(a2, map);
        ValueAnimator a6 = a(a3, map);
        ValueAnimator a7 = a(a4, map);
        if (a5 != null) {
            a5.setTarget(imageView);
        }
        if (a6 != null) {
            a6.setTarget(imageView);
        }
        if (a7 != null) {
            a7.setTarget(imageView);
        }
    }

    private void e(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9eb5f749197225ea0f7ef25ffc63b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9eb5f749197225ea0f7ef25ffc63b2");
            return;
        }
        long[] jArr = {1000, 2500, 4500};
        float[] fArr = {(float) a(-115L), (float) a(835L), (float) a(835L)};
        float[] fArr2 = {(float) a(295L), (float) a(415L), (float) a(415L)};
        imageView.setAlpha(0.4f);
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(4500L);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(4500L);
        a3.f = RecceAnimUtils.TRANSLATION_Y;
        a3.c = fArr2;
        a3.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c4.a(4500L);
        a4.f = RecceAnimUtils.ROTATION;
        a4.c = new float[]{10.0f, 160.0f, 160.0f};
        a4.d = 1.0f;
        ValueAnimator a5 = a(a2, map);
        ValueAnimator a6 = a(a3, map);
        ValueAnimator a7 = a(a4, map);
        if (a5 != null) {
            a5.setTarget(imageView);
        }
        if (a6 != null) {
            a6.setTarget(imageView);
        }
        if (a7 != null) {
            a7.setTarget(imageView);
        }
    }

    private void f(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70359f2bd243d2bf2b99e04ffa4cfe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70359f2bd243d2bf2b99e04ffa4cfe4");
            return;
        }
        long[] jArr = {ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, 3500, 4500};
        float[] fArr = {(float) a(-115L), (float) a(835L), (float) a(835L)};
        float[] fArr2 = {(float) a(540L), (float) a(480L), (float) a(480L)};
        imageView.setAlpha(0.3f);
        imageView.setScaleX(0.7f);
        imageView.setScaleY(0.7f);
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(4500L);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(4500L);
        a3.f = RecceAnimUtils.TRANSLATION_Y;
        a3.c = fArr2;
        a3.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c4.a(4500L);
        a4.f = RecceAnimUtils.ROTATION;
        a4.c = new float[]{10.0f, 140.0f, 140.0f};
        a4.d = 1.0f;
        ValueAnimator a5 = a(a2, map);
        ValueAnimator a6 = a(a3, map);
        ValueAnimator a7 = a(a4, map);
        if (a5 != null) {
            a5.setTarget(imageView);
        }
        if (a6 != null) {
            a6.setTarget(imageView);
        }
        if (a7 != null) {
            a7.setTarget(imageView);
        }
    }

    private void a(ImageView imageView, ImageView imageView2, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, imageView2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2ee6cfb8cdd9791e139ea9334ccede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2ee6cfb8cdd9791e139ea9334ccede");
            return;
        }
        imageView.getLayoutParams().width = (int) a(1150L);
        imageView.getLayoutParams().height = (int) a(417L);
        imageView.setAlpha(0.65f);
        imageView2.getLayoutParams().width = (int) a(1150L);
        imageView2.getLayoutParams().height = (int) a(417L);
        imageView2.setAlpha(0.65f);
        float[] fArr = {(float) a(-1075L), (float) a(75L)};
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = new long[]{0, 1050};
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(1050L);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        float[] fArr2 = {(float) a(75L), (float) a(1225L)};
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = new long[]{0, 1050};
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(1050L);
        a3.f = RecceAnimUtils.TRANSLATION_X;
        a3.c = fArr2;
        a3.d = 1.0f;
        ValueAnimator a4 = a(a2, map);
        ValueAnimator a5 = a(a3, map);
        if (a4 != null) {
            a4.setTarget(imageView);
        }
        if (a5 != null) {
            a5.setTarget(imageView2);
        }
    }

    private void b(ImageView imageView, ImageView imageView2, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, imageView2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ce2138199ac85278c13131a8f3b1d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ce2138199ac85278c13131a8f3b1d6");
            return;
        }
        imageView.getLayoutParams().width = (int) a(2402L);
        imageView.getLayoutParams().height = (int) a(417L);
        imageView.setAlpha(0.65f);
        imageView2.getLayoutParams().width = (int) a(2402L);
        imageView2.getLayoutParams().height = (int) a(417L);
        imageView2.setAlpha(0.65f);
        float[] fArr = {(float) a(-2402L), (float) a(-626L)};
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = new long[]{0, 1500};
        com.meituan.roodesign.widgets.animator.b a2 = c2.a(1500L);
        a2.f = RecceAnimUtils.TRANSLATION_X;
        a2.c = fArr;
        a2.d = 1.0f;
        float[] fArr2 = {(float) a(-626L), (float) a(1150L)};
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = new long[]{0, 1500};
        com.meituan.roodesign.widgets.animator.b a3 = c3.a(1500L);
        a3.f = RecceAnimUtils.TRANSLATION_X;
        a3.c = fArr2;
        a3.d = 1.0f;
        ValueAnimator a4 = a(a2, map);
        ValueAnimator a5 = a(a3, map);
        if (a4 != null) {
            a4.setTarget(imageView);
        }
        if (a5 != null) {
            a5.setTarget(imageView2);
        }
    }

    private void g(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45789febc478690e21dce4d334d1b711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45789febc478690e21dce4d334d1b711");
            return;
        }
        imageView.setAlpha(0.6f);
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        int e = e(a(imageView, this.W));
        int a2 = g.a(this.U, 25.0f);
        Point point = new Point(0, e);
        Point point2 = new Point(0, e);
        Point point3 = new Point(this.V, e);
        this.Y = new ValueAnimator();
        this.Y.setDuration(4000L);
        this.Y.setRepeatCount(-1);
        this.Y.setRepeatMode(1);
        this.Y.setObjectValues(point, point2, point3);
        this.Y.setEvaluator(new com.sankuai.waimai.platform.widget.weather.a(new Point(this.V / 3, e - a2)));
        this.Y.setInterpolator(new LinearInterpolator());
        this.Y.addUpdateListener(new a(imageView));
        long[] jArr = {0, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, 2667, 3333, 4000};
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c2.a(4000L);
        a3.f = RecceAnimUtils.ROTATION;
        a3.c = new float[]{0.0f, 0.0f, 360.0f, 720.0f, 1080.0f};
        a3.d = 1.0f;
        ValueAnimator a4 = a(a3, map);
        if (a4 != null) {
            a4.setTarget(imageView);
        }
    }

    private void h(ImageView imageView, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        Object[] objArr = {imageView, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "474b9f27f93434ab72afddc5f98c783d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "474b9f27f93434ab72afddc5f98c783d");
            return;
        }
        imageView.setAlpha(0.6f);
        imageView.setScaleX(0.45f);
        imageView.setScaleY(0.45f);
        if (this.Z == null) {
            this.Z = new ValueAnimator();
            int e = e(a(imageView, this.W));
            int a2 = g.a(imageView.getContext(), 35.0f);
            int i = -a2;
            Point point = new Point(i, e);
            Point point2 = new Point(i, e);
            Point point3 = new Point(i, e);
            Point point4 = new Point(this.V, e);
            this.Z.setDuration(3500L);
            this.Z.setRepeatCount(-1);
            this.Z.setRepeatMode(1);
            this.Z.setObjectValues(point, point2, point3, point4);
            this.Z.setEvaluator(new com.sankuai.waimai.platform.widget.weather.a(new Point(this.V / 3, e - a2)));
            this.Z.setInterpolator(new LinearInterpolator());
            this.Z.addUpdateListener(new a(imageView));
        }
        long[] jArr = {0, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, 2500, PayTask.j, 3500};
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c2.a(3500L);
        a3.f = RecceAnimUtils.ROTATION;
        a3.c = new float[]{0.0f, 0.0f, 120.0f, 240.0f, 360.0f};
        a3.d = 1.0f;
        ValueAnimator a4 = a(a3, map);
        if (a4 != null) {
            a4.setTarget(imageView);
        }
    }

    private int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297b30c13bd5b7d9a5f136b4ebf466b0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297b30c13bd5b7d9a5f136b4ebf466b0")).intValue() : q() ? ((int) (i * 0.6f)) + g.e(com.meituan.android.singleton.b.a) : (int) (i * 0.6f);
    }

    private static boolean q() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private int a(ImageView imageView, int i) {
        int a2;
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97195df21730916c1ce56139ba31cd40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97195df21730916c1ce56139ba31cd40")).intValue();
        }
        try {
            Context context = imageView.getContext();
            if (context instanceof ao) {
                Activity currentActivity = ((ao) context).getCurrentActivity();
                if (currentActivity == null) {
                    return i;
                }
                a2 = g.a(currentActivity);
            } else {
                a2 = g.a((Activity) context);
            }
            return a2;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private View c;

        public a(View view) {
            Object[] objArr = {e.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e5882f0ac9402d84d2acbffd45f8c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e5882f0ac9402d84d2acbffd45f8c4");
            } else {
                this.c = view;
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba5d08e22b42dc8635e20d5176a1d0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba5d08e22b42dc8635e20d5176a1d0c");
                return;
            }
            Point point = (Point) valueAnimator.getAnimatedValue();
            this.c.setX(point.x);
            this.c.setY(point.y);
        }
    }

    private ValueAnimator a(com.meituan.roodesign.widgets.animator.b bVar, Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        ValueAnimator a2;
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942a7ae5a41f8b505ab6ffe0952eb36e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ValueAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942a7ae5a41f8b505ab6ffe0952eb36e");
        }
        if (bVar == null || (a2 = com.meituan.roodesign.widgets.animator.a.a().a(bVar)) == null) {
            return null;
        }
        a2.setRepeatCount(-1);
        map.put(bVar, a2);
        return a2;
    }

    private void a(Map<com.meituan.roodesign.widgets.animator.b, ValueAnimator> map) {
        char c2 = 1;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8936bfafe79fefea6e9a3b07157427e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8936bfafe79fefea6e9a3b07157427e8");
        } else if (!map.isEmpty()) {
            for (Map.Entry<com.meituan.roodesign.widgets.animator.b, ValueAnimator> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    com.meituan.roodesign.widgets.animator.b key = entry.getKey();
                    ValueAnimator value = entry.getValue();
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = key;
                    objArr2[c2] = value;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c9fa2b6cfcb63aab7015b12e174f8cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c9fa2b6cfcb63aab7015b12e174f8cf");
                    } else if (key != null && value != null) {
                        value.cancel();
                    }
                    c2 = 1;
                }
            }
            map.clear();
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971564f226c51207a2a4b2e862357ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971564f226c51207a2a4b2e862357ec9");
            return;
        }
        a(this.ab);
        if (this.Y != null) {
            this.Y.cancel();
        }
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19d3bab75daf45e58cd292eb69cc34b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19d3bab75daf45e58cd292eb69cc34b");
            return;
        }
        a(this.ac);
        if (this.aa != null) {
            this.aa.cancel();
            this.aa = null;
        }
        if (this.Z != null) {
            this.Z.removeAllUpdateListeners();
            this.Z.cancel();
            this.Z = null;
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1043101c329dcea625dbb503a5f3658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1043101c329dcea625dbb503a5f3658");
        } else {
            this.t.clearAnimation();
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e58b5f9221ff4a2c5ea5736d529a9fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e58b5f9221ff4a2c5ea5736d529a9fa");
            return;
        }
        this.n.clearAnimation();
        this.p.clearAnimation();
        this.r.clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements TypeEvaluator<Float> {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
            Object[] objArr = {Float.valueOf(f), f2, f3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c13af052a940b00e13f49e7931fcca", RobustBitConfig.DEFAULT_VALUE)) {
                return (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c13af052a940b00e13f49e7931fcca");
            }
            if (f < 0.2f || f >= 0.325f) {
                if (f >= 0.325f && f <= 0.45f) {
                    return Float.valueOf((((f - 0.2f) - 0.125f) * 3.2f) + 0.6f);
                }
                return Float.valueOf(1.0f);
            }
            return Float.valueOf(1.0f - ((f - 0.2f) * 3.2f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements TypeEvaluator<Float> {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
            Object[] objArr = {Float.valueOf(f), f2, f3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13948c3664ae3a01878a80ebd9a96aa3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13948c3664ae3a01878a80ebd9a96aa3");
            }
            if (f < 0.2f || f > 0.55f) {
                if (f < 0.2f) {
                    return Float.valueOf(1.0f);
                }
                return Float.valueOf(0.0f);
            }
            return Float.valueOf(Math.max(1.0f - ((f - 0.2f) * 4.0f), 0.0f));
        }
    }
}
