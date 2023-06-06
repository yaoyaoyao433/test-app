package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    ImageView b;
    Poi.PoiCouponItem c;
    a d;
    private RelativeLayout e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, Poi.PoiCouponItem poiCouponItem);
    }

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21124aa5f41d56759356a3574c1d45de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21124aa5f41d56759356a3574c1d45de");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1f93173629b80d45f8f4d5555db7e6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1f93173629b80d45f8f4d5555db7e6") : layoutInflater.inflate(R.layout.wm_restaurant_layout_magic_coupon_fold, viewGroup, false);
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069fb841be7054245685973f84348759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069fb841be7054245685973f84348759");
            return;
        }
        final View h = h();
        if (h == null) {
            return;
        }
        this.e = (RelativeLayout) h.findViewById(R.id.layout_coupon_background);
        this.b = (ImageView) h.findViewById(R.id.image_coupon_animation);
        this.f = (TextView) h.findViewById(R.id.txt_coupon_text_ahead);
        this.g = (TextView) h.findViewById(R.id.txt_coupon_symbol);
        this.h = (TextView) h.findViewById(R.id.txt_coupon_value);
        this.i = (TextView) h.findViewById(R.id.txt_coupon_limit);
        this.j = (TextView) h.findViewById(R.id.txt_coupon_status);
        h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ddfaac956c64d539d32960c6984b964", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ddfaac956c64d539d32960c6984b964");
                } else if (d.this.d != null) {
                    d.this.d.a(h, d.this.c);
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab3bf60ff29ecf391d8a7836f55a4d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab3bf60ff29ecf391d8a7836f55a4d0b");
        } else {
            this.b.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b183fb591dcc6c7ca2801390c5d8c8fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b183fb591dcc6c7ca2801390c5d8c8fb");
                        return;
                    }
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.c = "https://p0.meituan.net/travelcube/b2818188e697cc5b1f9b3b908e520bf89172.png";
                    a2.a(d.this.b);
                }
            });
        }
    }

    public final void a(Poi.PoiCouponItem poiCouponItem) {
        int i;
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4c8248e9321f8ea87776ab7db518ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4c8248e9321f8ea87776ab7db518ce");
            return;
        }
        this.c = poiCouponItem;
        if (poiCouponItem == null) {
            j();
            return;
        }
        i();
        if (poiCouponItem.mCouponStatus == 3 || poiCouponItem.mCouponStatus == 4) {
            int color = f().getResources().getColor(R.color.ceres_all_f);
            Drawable drawable = f().getDrawable(R.drawable.wm_restaurant_magic_coupon_inflatable_bg);
            if (drawable != null) {
                boolean padding = drawable.getPadding(new Rect());
                this.e.setBackground(drawable);
                if (!padding) {
                    this.e.setPadding(0, 0, 0, 0);
                }
            }
            this.f.setVisibility(0);
            this.f.setText(poiCouponItem.mCouponConditionShortTextPrefix);
            this.g.setVisibility(8);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4c4d354e15999c366fd6923271d2497", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4c4d354e15999c366fd6923271d2497");
            } else {
                a();
                final TranslateAnimation translateAnimation = new TranslateAnimation(0, -f().getResources().getDimension(R.dimen.wm_restaurant_coupon_magic_animation_width), 2, 1.0f, 2, 0.0f, 2, 0.0f);
                translateAnimation.setDuration(1000L);
                translateAnimation.setRepeatCount(2);
                translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.d.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr3 = {animation};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0a42eb69785e793cfd660c5fd22e96f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0a42eb69785e793cfd660c5fd22e96f");
                        } else {
                            d.this.a();
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                        Object[] objArr3 = {animation};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96622afc1105ec17c802386915cd89ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96622afc1105ec17c802386915cd89ee");
                        } else {
                            translateAnimation.setStartOffset(1000L);
                        }
                    }
                });
                this.b.startAnimation(translateAnimation);
                this.b.setVisibility(0);
            }
            i = color;
        } else {
            i = f().getResources().getColor(R.color.wm_restaurant_ff4a26);
            Drawable drawable2 = f().getDrawable(R.drawable.wm_restaurant_magic_coupon_received_bg);
            if (drawable2 != null) {
                boolean padding2 = drawable2.getPadding(new Rect());
                this.e.setBackground(drawable2);
                if (!padding2) {
                    this.e.setPadding(0, 0, 0, 0);
                }
            }
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            a();
        }
        this.h.setText(com.sankuai.waimai.foundation.utils.h.a(poiCouponItem.mCouponValue));
        this.h.setTextColor(i);
        this.i.setText(poiCouponItem.mCouponConditionShortText);
        this.i.setTextColor(i);
        this.j.setText(poiCouponItem.mCouponButtonText);
        this.j.setTextColor(i);
        com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.a.a(h(), this.f, this.g, this.h, this.i, this.j, poiCouponItem);
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a944a59d2c8b3b2a0ce3faa006be91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a944a59d2c8b3b2a0ce3faa006be91");
            return;
        }
        this.b.clearAnimation();
        this.b.setVisibility(8);
    }
}
