package com.sankuai.waimai.business.page.home.head.majorcategory;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.lottie.SafeLottieAnimationView;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    protected Context b;
    public FrameLayout c;
    public TextView d;
    public int e;
    public int f;
    SafeLottieAnimationView g;
    ImageView h;
    ImageView i;
    int j;
    public View k;
    private TextView l;
    private int m;

    public abstract void a(int i);

    public final void a(NavigateItem navigateItem, View.OnClickListener onClickListener) {
        Object[] objArr = {navigateItem, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a115290797593c3e2dead884348188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a115290797593c3e2dead884348188");
            return;
        }
        this.k.setOnClickListener(onClickListener);
        if (navigateItem == null || navigateItem.getCode() != 910) {
            return;
        }
        final j jVar = new j(this.b, navigateItem.getSkipProtocol());
        this.k.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e09bcefaf811b7d4732aef6a6cee54c2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e09bcefaf811b7d4732aef6a6cee54c2")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.preload.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c7dacfc30aec97288e4531a98405c6e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c7dacfc30aec97288e4531a98405c6e0");
                    } else {
                        com.sankuai.waimai.platform.capacity.log.c.a().a(5001, "waimai_kingkong_ftr", SystemClock.elapsedRealtime());
                    }
                    d.this.k.setTag(Integer.valueOf(e.a().a(jVar)));
                }
                return false;
            }
        });
    }

    public d(View view, Context context, int i, int i2, int i3) {
        super(view);
        Object[] objArr = {view, context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d41ed68c55ee95411deb0c620135ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d41ed68c55ee95411deb0c620135ea");
            return;
        }
        this.k = view;
        this.b = context;
        this.j = i;
        this.m = i3;
        this.c = (FrameLayout) view.findViewById(R.id.fl_img_container);
        this.g = (SafeLottieAnimationView) view.findViewById(R.id.lottie_item);
        this.h = (ImageView) view.findViewById(R.id.img_item);
        this.i = (ImageView) view.findViewById(R.id.img_bubble_item);
        this.l = (TextView) view.findViewById(R.id.txt_bubble_item);
        this.d = (TextView) view.findViewById(R.id.txt_item);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b16d0cca806111d3b5ee548bf1b9f4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b16d0cca806111d3b5ee548bf1b9f4d0");
        } else {
            this.g.c();
            this.g.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.d.4
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ad0bf595229429899767fa719ee883ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ad0bf595229429899767fa719ee883ab");
                        return;
                    }
                    d.this.h.setVisibility(0);
                    d.this.g.setVisibility(8);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fdb2ab3eb7aeb7eb5d6273d61b37a34d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fdb2ab3eb7aeb7eb5d6273d61b37a34d");
                        return;
                    }
                    d.this.h.setVisibility(0);
                    d.this.g.setVisibility(8);
                }
            });
        }
        a(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NavigateItem navigateItem, boolean z) {
        Object[] objArr = {navigateItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae7db5c034c3c162275dcf6f62783b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae7db5c034c3c162275dcf6f62783b4");
        } else if (navigateItem == null || navigateItem.mBubble == null || !z) {
            this.i.setVisibility(8);
            this.l.setVisibility(8);
        } else if (TextUtils.isEmpty(navigateItem.mBubble.e)) {
            this.i.setVisibility(8);
            this.l.setVisibility(8);
        } else if (navigateItem.mBubble.j == 1) {
            this.l.setVisibility(8);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = navigateItem.mBubble.e;
            a2.e = 1;
            a2.a(new b.a() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e466af49e83950404fc17bf58184b47f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e466af49e83950404fc17bf58184b47f");
                        return;
                    }
                    d.this.i.setVisibility(0);
                    d.this.i.setImageBitmap(bitmap);
                    d.this.a(d.this.i);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6cbdde02c5ff0c2d60077a92b29b125", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6cbdde02c5ff0c2d60077a92b29b125");
                    } else {
                        d.this.i.setVisibility(8);
                    }
                }
            });
        } else {
            this.i.setVisibility(8);
            this.l.setText(navigateItem.mBubble.e);
            GradientDrawable gradientDrawable = (GradientDrawable) this.l.getBackground();
            if (!TextUtils.isEmpty(navigateItem.mBubble.f)) {
                try {
                    this.l.setTextColor(Color.parseColor(navigateItem.mBubble.f));
                } catch (Exception e) {
                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_major_category_bubble_show").b("color_error").c(e.getMessage()).b());
                }
            }
            if (!TextUtils.isEmpty(navigateItem.mBubble.c)) {
                try {
                    gradientDrawable.setColor(Color.parseColor(navigateItem.mBubble.c));
                } catch (Exception e2) {
                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_major_category_bubble_show").b("bg_color_error").c(e2.getMessage()).b());
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.l.measure(makeMeasureSpec, makeMeasureSpec);
            this.l.setVisibility(0);
            a(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a96efd82502fef6796cbe835b27f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a96efd82502fef6796cbe835b27f39");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (a(view, g.a(this.b, this.f))) {
            layoutParams.addRule(14, 0);
            layoutParams.addRule(11, -1);
            view.setTranslationX(0.0f);
        } else {
            layoutParams.addRule(11, 0);
            layoutParams.addRule(14, -1);
            view.setTranslationX(g.a(this.b, this.f) / 2);
        }
        view.setLayoutParams(layoutParams);
    }

    private boolean a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48441102fb5777cbba44eb3fe3313e6f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48441102fb5777cbba44eb3fe3313e6f")).booleanValue() : view.getMeasuredWidth() > this.m - i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NavigateItem navigateItem) {
        Object[] objArr = {navigateItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23343edbb246ed5ecb76da3e019e77f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23343edbb246ed5ecb76da3e019e77f1");
            return;
        }
        this.g.setVisibility(8);
        String iconUrl = navigateItem.getIconUrl();
        if (!TextUtils.isEmpty(iconUrl)) {
            this.h.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = iconUrl;
            a2.f = ImageQualityUtil.a(2);
            a2.a(this.h);
            return;
        }
        this.h.setVisibility(4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends d {
        public static ChangeQuickRedirect l;

        public a(View view, Context context, int i, int i2, int i3) {
            super(view, context, i, i2, i3);
            Object[] objArr = {view, context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = l;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf306aaf7dcb279c1669f87aff8acbd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf306aaf7dcb279c1669f87aff8acbd");
            }
        }

        @Override // com.sankuai.waimai.business.page.home.head.majorcategory.d
        public final void a(int i) {
            int i2;
            int i3 = 0;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = l;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1ba4e63bf0e692a35dfe59ed91753e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1ba4e63bf0e692a35dfe59ed91753e4");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
            if (i == 2) {
                i3 = g.a(this.b, 30.0f);
                this.e = g.a(this.b, 4.0f);
                this.f = 30;
                i2 = g.a(this.b, 10.0f);
            } else if (i == 1) {
                i3 = g.a(this.b, 54.0f);
                this.e = g.a(this.b, 6.0f);
                this.f = 54;
                i2 = g.a(this.b, 10.0f);
            } else if (i == 3) {
                i3 = g.a(this.b, 54.0f);
                this.e = g.a(this.b, 3.0f);
                this.f = 54;
                i2 = g.a(this.b, 10.0f);
            } else if (i == 4) {
                i3 = g.a(this.b, 38.0f);
                this.e = g.a(this.b, 2.0f);
                this.f = 38;
                i2 = g.a(this.b, 10.0f);
            } else {
                i2 = 0;
            }
            layoutParams.width = i3;
            layoutParams.height = i3;
            layoutParams.topMargin = i2;
            ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = this.e;
        }
    }
}
