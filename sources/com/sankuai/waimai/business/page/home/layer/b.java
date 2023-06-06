package com.sankuai.waimai.business.page.home.layer;

import android.app.Activity;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public View b;
    public View c;
    private boolean d;

    public b(Fragment fragment, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        Object[] objArr = {fragment, viewGroup, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7842aba5e56981dc0390ce420f17c502", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7842aba5e56981dc0390ce420f17c502");
            return;
        }
        this.d = false;
        this.b = viewGroup.findViewById(R.id.bottom_location_permission_layer);
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.layer.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.b.findViewById(R.id.location_layer_open).setOnClickListener(onClickListener);
        this.c = viewGroup.findViewById(R.id.header_location_permission_layer);
        if (fragment.getActivity() != null && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) fragment.getActivity())) {
            int e = g.e(com.meituan.android.singleton.b.a) + g.a(com.meituan.android.singleton.b.a, 40.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            marginLayoutParams.topMargin = e;
            this.c.setLayoutParams(marginLayoutParams);
        }
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.layer.b.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        View findViewById = this.c.findViewById(R.id.location_wm_up_arrow);
        View findViewById2 = this.c.findViewById(R.id.location_mt_up_arrow);
        int i = 8;
        findViewById.setVisibility((!com.sankuai.waimai.foundation.core.a.d() || (fragment instanceof FKKFragment)) ? 8 : 0);
        findViewById2.setVisibility((!com.sankuai.waimai.foundation.core.a.d() || (fragment instanceof FKKFragment)) ? 0 : 0);
        this.c.findViewById(R.id.location_layer_open).setOnClickListener(onClickListener);
        this.c.findViewById(R.id.location_layer_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.layer.b.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3a14ce3ce05f62338adcd4e7dbb009e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3a14ce3ce05f62338adcd4e7dbb009e");
                } else {
                    b.this.a(false);
                }
            }
        });
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbde6c2e1ad3958c3b846aab936601f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbde6c2e1ad3958c3b846aab936601f");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            int i = 8;
            this.c.setVisibility((!z || this.d) ? 8 : 0);
            View view = this.b;
            if (z && this.d) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098415e807c12f7b4a68ed0778c4d8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098415e807c12f7b4a68ed0778c4d8b1");
        } else if (this.d || this.c.getVisibility() != 0) {
        } else {
            this.d = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.page.home.layer.b.4
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee1021b7d666b47be4b729422f4931f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee1021b7d666b47be4b729422f4931f1");
                        return;
                    }
                    b.this.c.setVisibility(8);
                    b.this.c.clearAnimation();
                }
            });
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(300L);
            alphaAnimation2.setFillAfter(true);
            alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.page.home.layer.b.5
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f37738e78154a591b4d0b628a62ddaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f37738e78154a591b4d0b628a62ddaf");
                        return;
                    }
                    b.this.b.setVisibility(0);
                    b.this.b.clearAnimation();
                }
            });
            this.c.startAnimation(alphaAnimation);
            this.b.startAnimation(alphaAnimation2);
        }
    }
}
