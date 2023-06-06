package com.sankuai.waimai.store.drug.home.refactor.card.actionbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard;
import com.sankuai.waimai.store.drug.util.d;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends b {
    public static ChangeQuickRedirect G;
    LottieAnimationView H;
    boolean I;
    private Drawable J;
    private Drawable K;
    private LinearLayout L;
    private com.sankuai.waimai.store.expose.v2.entity.c M;

    public c(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.drug.home.callback.a aVar2) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9161f7f3f471ae3e20b9372ef38f171b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9161f7f3f471ae3e20b9372ef38f171b");
            return;
        }
        this.I = false;
        this.J = ContextCompat.getDrawable(fragmentActivity, R.drawable.wm_sc_poi_channel_new_style_action_bar_shop_cart_icon);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "128e3eaabb9ae97b3083488b68ec9eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "128e3eaabb9ae97b3083488b68ec9eb2");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = G;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7866d120584d3865b004542dbb1d1eb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7866d120584d3865b004542dbb1d1eb5");
        } else {
            this.x = (ImageView) this.e.findViewById(R.id.new_style_action_bar_right_top_shop_cart);
            e(-14539738);
            this.M = new com.sankuai.waimai.store.expose.v2.entity.c(this.b.G, "b_dCrTp", this.x);
            com.sankuai.waimai.store.expose.v2.b.a().a(a(), this.M);
            this.M.b(c());
            this.x.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1fae2152fadfd58de147a900da058af2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1fae2152fadfd58de147a900da058af2");
                        return;
                    }
                    if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                        com.sankuai.waimai.store.manager.user.a.a(c.this.mContext);
                    } else {
                        Context context = c.this.getContext();
                        Object[] objArr4 = {context};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8af9b0fad08e8acc3687e87215e809c5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8af9b0fad08e8acc3687e87215e809c5");
                        } else {
                            com.sankuai.waimai.platform.capacity.abtest.d.a(context, "scene=drug");
                        }
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(c.this.b.G, com.sankuai.waimai.store.manager.judas.b.a((Object) c.this.mContext), "b_ay8J4").b(c.this.c()).a();
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = G;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b9ec7ac483ebd9bfb37114235509e0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b9ec7ac483ebd9bfb37114235509e0e");
            return;
        }
        u.a(this.m);
        this.s.setTextSize(2, 11.0f);
        this.s.setTextColor(-16777216);
        this.s.setGravity(3);
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        layoutParams.height = h.a(a(), 8.0f);
        layoutParams.width = h.a(a(), 8.0f);
        u.c(this.y);
        this.n.setImageDrawable(ContextCompat.getDrawable(a(), R.drawable.wm_drug_home_camera));
        if (this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).rightMargin = h.a(a(), 7.0f);
        }
        this.w.getLayoutParams().width = h.a(a(), 56.0f);
        if (this.u != null) {
            this.u.setTextSize(2, 13.0f);
            this.u.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
        }
        if (this.H != null) {
            this.H.getLayoutParams().height = h.a(a(), 44.0f);
            this.H.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (this.x == null || !(this.x.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).leftMargin = h.a(a(), 6.0f);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "780fbb2d39b140ed9dad1b11004043b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "780fbb2d39b140ed9dad1b11004043b3");
            return;
        }
        super.b(i);
        e(i);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b, com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a
    public final void a(int i, View view, View view2) {
        Object[] objArr = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4664bccc1fed922a01e8d44a0bbc5e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4664bccc1fed922a01e8d44a0bbc5e8d");
            return;
        }
        super.a(i, view, view2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = G;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47ec1a0a64fb8da6ac393cad0fe2d368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47ec1a0a64fb8da6ac393cad0fe2d368");
        } else if (this.F != this.E) {
            if (this.E) {
                this.x.setBackground(this.J);
                this.f.setBackground(this.z);
                this.F = this.E;
                return;
            }
            if (!t.a(this.D)) {
                b.C0608b b = m.b(this.D, ImageQualityUtil.a());
                b.b = this.mContext;
                b.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.8
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr3 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98047d03e3cc2fdd68230b77f9c13e0b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98047d03e3cc2fdd68230b77f9c13e0b");
                            return;
                        }
                        super.a(drawable);
                        c.this.f.setBackground(drawable);
                    }
                });
            }
            if (!t.a(this.C)) {
                b.C0608b b2 = m.b(this.C, ImageQualityUtil.a());
                b2.b = this.mContext;
                b2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.9
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr3 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9f4c7fae15c9460ba0e83ec630129aa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9f4c7fae15c9460ba0e83ec630129aa");
                            return;
                        }
                        super.a(drawable);
                        c.this.x.setBackground(drawable);
                    }
                });
            }
            this.F = false;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c6e2ca6babfef981dd964054813115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c6e2ca6babfef981dd964054813115");
            return;
        }
        super.b();
        this.L = (LinearLayout) this.e.findViewById(R.id.ll_new_change_location);
        this.H = (LottieAnimationView) this.e.findViewById(R.id.lottie_animation_style_title);
        this.L.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33d369a8f9382fb50c95a509e3b58f38", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33d369a8f9382fb50c95a509e3b58f38");
                } else if (c.this.c != null) {
                    c.this.c.be_();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b, com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4402ddf737aaf13c89b18e7e990c438b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4402ddf737aaf13c89b18e7e990c438b");
            return;
        }
        super.a(poiVerticalityDataResponse);
        if (poiVerticalityDataResponse.drugBackgroundConfig != null) {
            this.B = poiVerticalityDataResponse.drugBackgroundConfig.statusBarColorRule;
            this.C = poiVerticalityDataResponse.drugBackgroundConfig.shoppingCartPic;
            this.D = poiVerticalityDataResponse.drugBackgroundConfig.returnArrowPic;
            if (!t.a(poiVerticalityDataResponse.drugBackgroundConfig.addressColor)) {
                this.s.setTextColor(com.sankuai.shangou.stone.util.d.a(poiVerticalityDataResponse.drugBackgroundConfig.addressColor, -16777216));
            }
            if (!t.a(poiVerticalityDataResponse.drugBackgroundConfig.addressLocPic)) {
                b.C0608b b = m.b(poiVerticalityDataResponse.drugBackgroundConfig.addressLocPic, ImageQualityUtil.a());
                b.b = this.mContext;
                b.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.3
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9aa5147e704f9d5cff1877da403003a6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9aa5147e704f9d5cff1877da403003a6");
                            return;
                        }
                        super.a(drawable);
                        c.this.m.setBackground(drawable);
                    }
                });
            }
            if (!t.a(poiVerticalityDataResponse.drugBackgroundConfig.addressArrowPic)) {
                b.C0608b b2 = m.b(poiVerticalityDataResponse.drugBackgroundConfig.addressArrowPic, ImageQualityUtil.a());
                b2.b = this.mContext;
                b2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.4
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c380677156cf5ef2441e203df97dc4f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c380677156cf5ef2441e203df97dc4f");
                            return;
                        }
                        super.a(drawable);
                        c.this.t.setBackground(drawable);
                    }
                });
            }
            if (!t.a(poiVerticalityDataResponse.drugBackgroundConfig.shoppingCartPic)) {
                b.C0608b b3 = m.b(poiVerticalityDataResponse.drugBackgroundConfig.shoppingCartPic, ImageQualityUtil.a());
                b3.b = this.mContext;
                b3.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.5
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23a1cb43ec556f7ef7e606a2db4a12e2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23a1cb43ec556f7ef7e606a2db4a12e2");
                            return;
                        }
                        super.a(drawable);
                        c.this.x.setBackground(drawable);
                    }
                });
            }
            if (t.a(poiVerticalityDataResponse.drugBackgroundConfig.returnArrowPic)) {
                return;
            }
            b.C0608b b4 = m.b(poiVerticalityDataResponse.drugBackgroundConfig.returnArrowPic, ImageQualityUtil.a());
            b4.b = this.mContext;
            b4.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.6
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "004812db57de945f542fba8b756a334c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "004812db57de945f542fba8b756a334c");
                        return;
                    }
                    super.a(drawable);
                    c.this.f.setBackground(drawable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PoiActionBarCard.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fea7e8152ba4bdea491616d2543247a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fea7e8152ba4bdea491616d2543247a");
            return;
        }
        u.c(this.H);
        if (t.a(aVar.f)) {
            return;
        }
        u.a(this.l);
        u.c(this.j);
        b.C0608b b = m.b(aVar.f);
        b.b = this.mContext;
        b.a(this.l);
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02329f687c80f653d2603de5023dbf6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02329f687c80f653d2603de5023dbf6c");
            return;
        }
        if (this.K == null) {
            this.K = e.a(this.J, i);
        } else {
            DrawableCompat.setTintList(this.K, ColorStateList.valueOf(i));
        }
        if (this.x != null) {
            this.x.setBackground(this.K);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423788a47c995d4ed45557ad1938a577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423788a47c995d4ed45557ad1938a577");
        } else if (!t.a(str)) {
            this.L.setVisibility(0);
            this.s.setText(str);
            com.sankuai.waimai.store.expose.v2.b.a().a(a(), new com.sankuai.waimai.store.expose.v2.entity.b(this.b.G, "b_waimai_a90lzwad_mv", this.L).a("cat_id", Long.valueOf(this.b.c)).a("media_type", "0"));
        } else {
            this.L.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab13518ead7e9d1d7fbaee830064013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab13518ead7e9d1d7fbaee830064013");
            return;
        }
        super.d(i);
        com.sankuai.waimai.store.drug.home.b.a();
        this.s.setTextColor(com.sankuai.waimai.store.drug.home.b.a(getContext(), i, this.b.Y));
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ec38cb1d03b440c66caf3c6ae06cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ec38cb1d03b440c66caf3c6ae06cc4");
            return;
        }
        this.j.setAlpha(f);
        this.H.setAlpha(f);
        this.l.setAlpha(f);
        this.L.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e345674d1176f967bcf02afa2ff7823c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e345674d1176f967bcf02afa2ff7823c");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tip_icon", 0);
        hashMap.put("category_code", Long.valueOf(this.b.c));
        hashMap.put("sub_category_code", this.b.f);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74dea93dd9726e2f58b47cbc7394a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74dea93dd9726e2f58b47cbc7394a76");
            return;
        }
        super.a(f);
        if (this.b.Y) {
            return;
        }
        e(Color.argb(255, 34, 36, 38));
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b
    public final int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5972404968b694671d40743d200ba5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5972404968b694671d40743d200ba5")).intValue();
        }
        if (this.x != null) {
            ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? i + this.x.getWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6) : i;
        }
        return getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_30);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.card.actionbar.b, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = G;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f85cc49d078c96805d831e5eea322b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f85cc49d078c96805d831e5eea322b");
            return;
        }
        super.onDestroy();
        if (this.H != null) {
            if (this.H.d()) {
                this.H.f();
            }
            this.H.clearAnimation();
            this.H.c();
        }
    }
}
