package com.dianping.voyager.widgets.container.secondfloor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.component.utils.AnimationsContainer;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.utils.ViewUtils;
import com.dianping.shield.component.widgets.internal.GCLoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private LinearLayout h;
    private ImageView i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private PageContainerThemePackage m;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad9738b27421dc450e0f37463b5ff58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad9738b27421dc450e0f37463b5ff58");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d726c3b99796cc746139d605ca19835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d726c3b99796cc746139d605ca19835");
            return;
        }
        this.m = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        this.h = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.vy_listview_header_dper, (ViewGroup) this, false);
        addView(this.h, layoutParams);
        setGravity(80);
        this.k = (ImageView) findViewById(R.id.listview_header_background);
        this.i = (ImageView) findViewById(R.id.listview_header_image);
        this.j = (TextView) findViewById(R.id.listview_header_hint_textview);
        this.l = (LinearLayout) findViewById(R.id.listview_header_text);
        this.i.setImageDrawable(getResources().getDrawable(getDefaultDrawableResId()));
        if (this.m.getDropDownArray() != null) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
        }
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final void setState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10c10332013a1efcc809985a1b1ef676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10c10332013a1efcc809985a1b1ef676");
        } else if (i == this.c) {
        } else {
            switch (i) {
                case 0:
                    this.j.setText(R.string.shield_component_listview_header_hint_normal);
                    break;
                case 1:
                    if (this.m.getDropDownArray() != null) {
                        this.i.setImageResource(this.m.getDropDownArray()[this.m.getDropDownArray().length - 1]);
                        break;
                    }
                    break;
                case 2:
                    this.j.setText(R.string.shield_component_listview_header_hint_loading);
                    this.i.clearAnimation();
                    this.i.setImageResource(this.m.getLoadingResId());
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.m.getLoadingAnimId());
                    loadAnimation.setInterpolator(new LinearInterpolator());
                    this.i.startAnimation(loadAnimation);
                    break;
                case 3:
                    this.j.setText(R.string.shield_component_listview_header_hint_ready);
                    break;
                case 4:
                    this.i.clearAnimation();
                    if (this.c == 2) {
                        if (this.d && this.m.getLoadingSuccessResId() != 0) {
                            ImageView imageView = this.i;
                            int loadingSuccessResId = this.m.getLoadingSuccessResId();
                            final GCLoadingView.OnFrameAnimationListener onFrameAnimationListener = new GCLoadingView.OnFrameAnimationListener() { // from class: com.dianping.voyager.widgets.container.secondfloor.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.dianping.shield.component.widgets.internal.GCLoadingView.OnFrameAnimationListener
                                public final void onStart() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a342e5ec25c4056e2959e8647e98dac6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a342e5ec25c4056e2959e8647e98dac6");
                                    }
                                }

                                @Override // com.dianping.shield.component.widgets.internal.GCLoadingView.OnFrameAnimationListener
                                public final void onEnd() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3adaf2396e59c81b500df032ae39f3b9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3adaf2396e59c81b500df032ae39f3b9");
                                        return;
                                    }
                                    if (a.this.e != null) {
                                        a.this.e.onRefreshComplete();
                                    }
                                    a.this.a();
                                }
                            };
                            Object[] objArr2 = {imageView, Integer.valueOf(loadingSuccessResId), onFrameAnimationListener};
                            ChangeQuickRedirect changeQuickRedirect2 = b.b;
                            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9410dc3473d3a16f829f0da733a2858f", RobustBitConfig.DEFAULT_VALUE)) {
                                if (this.f == null) {
                                    this.f = new AnimationsContainer(getContext(), loadingSuccessResId, 58);
                                    this.f.isRecycle(false);
                                }
                                this.g = this.f.createProgressDialogAnim(imageView);
                                this.g.setOnAnimStopListener(new AnimationsContainer.OnAnimationStoppedListener() { // from class: com.dianping.voyager.widgets.container.secondfloor.b.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.dianping.shield.component.utils.AnimationsContainer.OnAnimationStoppedListener
                                    public final void AnimationStopped() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "267473bf8bb3076b9df7554dd26b7290", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "267473bf8bb3076b9df7554dd26b7290");
                                        } else if (onFrameAnimationListener != null) {
                                            onFrameAnimationListener.onEnd();
                                        }
                                    }
                                });
                                this.g.start();
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9410dc3473d3a16f829f0da733a2858f");
                                break;
                            }
                        } else {
                            if (this.e != null) {
                                this.e.onRefreshComplete();
                            }
                            a();
                            break;
                        }
                    }
                    break;
            }
            this.c = i;
        }
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32dbe3d7eabd97ed366838eb1e8636d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32dbe3d7eabd97ed366838eb1e8636d");
        } else if (this.c == 2 || this.m.getDropDownArray() == null) {
        } else {
            if (this.c == 1) {
                this.i.setImageBitmap(ViewUtils.readBitMap(getContext(), this.m.getDropDownArray()[this.m.getDropDownArray().length - 1]));
                return;
            }
            int floor = (int) Math.floor(Math.min(1.0f, f) * this.m.getDropDownArray().length);
            if (floor < this.m.getDropDownArray().length) {
                this.i.setImageBitmap(ViewUtils.readBitMap(getContext(), this.m.getDropDownArray()[floor]));
            } else {
                this.i.setImageBitmap(ViewUtils.readBitMap(getContext(), this.m.getDropDownArray()[this.m.getDropDownArray().length - 1]));
            }
        }
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final int getVisiableHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c7befd63a14d40c165364330ddda43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c7befd63a14d40c165364330ddda43")).intValue() : this.h.getLayoutParams().height;
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final void setVisiableHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d221bd89c1723f00ac1b22d79b4e9068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d221bd89c1723f00ac1b22d79b4e9068");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.height = i;
        this.h.setLayoutParams(layoutParams);
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17bc9589225504a12434bc6a4bce582b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17bc9589225504a12434bc6a4bce582b");
            return;
        }
        this.i.setImageResource(getDefaultDrawableResId());
        this.i.clearAnimation();
        setState(0);
        super.b();
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eccde965802f0a4059c5e8c9544b745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eccde965802f0a4059c5e8c9544b745");
            return;
        }
        this.d = z;
        setState(4);
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final int getDefaultDrawableResId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079e1837bbc6f2238d40a9e1c8d4e80f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079e1837bbc6f2238d40a9e1c8d4e80f")).intValue() : this.m.getLoadingDefaultResId();
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.b
    public final void setLoadingDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a92bd51942d385e533489cade2f117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a92bd51942d385e533489cade2f117");
        } else {
            this.k.setBackgroundDrawable(drawable);
        }
    }
}
