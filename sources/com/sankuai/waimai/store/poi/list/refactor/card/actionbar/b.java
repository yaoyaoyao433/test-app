package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.f;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.UnreadMessageBlock;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.TopNavigationEntity;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect ad;
    private Drawable aA;
    private Drawable aB;
    private ImageView aC;
    private View aD;
    private View aE;
    private final View.OnClickListener aF;
    private final com.sankuai.waimai.store.param.a af;
    private final boolean ag;
    private ViewGroup ah;
    private TextView ai;
    private ImageView aj;
    private View ak;
    private TextView al;
    private View am;
    private Space an;
    private boolean ao;
    private GradientDrawable ap;
    private ImageView aq;
    private ImageView ar;
    private ImageView as;
    private Drawable at;
    private Drawable au;
    private Drawable av;
    private int aw;
    private UnreadMessageBlock ax;
    private Drawable ay;
    private Drawable az;

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final int n() {
        return R.id.vs_home_location;
    }

    public b(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2, boolean z) {
        super(fragmentActivity, aVar, aVar2, z);
        Object[] objArr = {fragmentActivity, aVar, aVar2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683a8c3325104449c35de2654a5e6e9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683a8c3325104449c35de2654a5e6e9a");
            return;
        }
        this.ao = false;
        this.ap = new GradientDrawable();
        this.aw = -1;
        this.aF = new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec2472604e6f024f586aad62ef3ac6da", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec2472604e6f024f586aad62ef3ac6da");
                } else if (b.this.c != null) {
                    b.this.c.bG_();
                }
            }
        };
        this.af = aVar;
        this.ag = z;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.c, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c8c8cecc15cad40468e85ccf773599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c8c8cecc15cad40468e85ccf773599");
            return;
        }
        this.q = str;
        if (this.al != null) {
            this.al.setText(str);
        }
        if (this.l != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(GearsLocator.ADDRESS, str);
            this.l.a("home_nav_change_location", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d6637d217cf487fa05563f8bc8b77fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d6637d217cf487fa05563f8bc8b77fd");
            return;
        }
        super.onViewCreated();
        this.at = ContextCompat.getDrawable(this.mContext, R.drawable.wm_sg_function_entrance_icon);
        this.au = ContextCompat.getDrawable(this.mContext, R.drawable.wm_sc_common_left_back_arrow);
        this.ay = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_search_shopcart_light);
        this.aA = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_search_more_information_light);
        this.ap.setCornerRadius(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16));
        this.al = (TextView) this.ah.findViewById(R.id.txt_kong_location);
        this.ar = (ImageView) this.ah.findViewById(R.id.main_location_icon_title);
        this.as = (ImageView) this.ah.findViewById(R.id.iv_arrow_right);
        this.al.setOnClickListener(this.aF);
        this.as.setOnClickListener(this.aF);
        r();
        d(this.ag);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ad;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "939fe0f0e60c2cfcbd238c76df04087c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "939fe0f0e60c2cfcbd238c76df04087c");
        } else {
            this.aq = (ImageView) this.y.findViewById(R.id.iv_menu);
            if (this.aq != null) {
                this.aq.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1ff69d9e098638f1c177f14dc67699e5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1ff69d9e098638f1c177f14dc67699e5");
                        } else if (b.this.c != null) {
                            b.this.c.b(b.this.aq);
                        }
                    }
                });
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = ad;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f9098792de7b6a9e9e80f21d5de5b564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f9098792de7b6a9e9e80f21d5de5b564");
        } else {
            this.ax = new UnreadMessageBlock(a(), this.af.c);
            this.aD = this.y.findViewById(R.id.fl_unread_message_container);
            this.ax.createAndReplaceView((ViewGroup) this.aD);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = ad;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8fb7442a4694690a51e8fbcf59b6b7dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8fb7442a4694690a51e8fbcf59b6b7dd");
        } else {
            this.aE = this.y.findViewById(R.id.rl_right_area);
            this.aC = (ImageView) this.y.findViewById(R.id.iv_navigation_activity);
            if (this.aq != null) {
                u.c(this.aq);
            }
            if (this.aD != null) {
                u.c(this.aD);
            }
            if (this.aC != null) {
                this.aC.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e07ea866b23e8c6b91f5336a8267d458", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e07ea866b23e8c6b91f5336a8267d458");
                        } else if (view.getTag() instanceof TopNavigationEntity.NavigationActivity) {
                            b.this.c.a((TopNavigationEntity.NavigationActivity) view.getTag());
                        }
                    }
                });
            }
        }
        f();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f982cf8103943cec158ff1ca69a8bc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f982cf8103943cec158ff1ca69a8bc53");
            return;
        }
        if (this.ah != null) {
            this.ah.setVisibility(8);
        }
        if (this.aj != null) {
            this.aj.setVisibility(8);
        }
        if (this.ai != null) {
            this.ai.setVisibility(8);
        }
        if (this.aE != null) {
            this.aE.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf2a844d7426f919246f2937f16b55c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf2a844d7426f919246f2937f16b55c");
            return;
        }
        d(this.ag);
        if (this.aE != null) {
            this.aE.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final HashMap<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "019b3f8cbeba1663e2ba082d1bcf7d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "019b3f8cbeba1663e2ba082d1bcf7d0f");
        }
        HashMap<String, Object> k = super.k();
        k.put(GearsLocator.ADDRESS, this.q);
        return k;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.c, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a7c023be845dbcb3a7e8b37072ec04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a7c023be845dbcb3a7e8b37072ec04");
            return;
        }
        this.ah = (ViewGroup) this.y.findViewById(R.id.address_layout);
        this.ai = (TextView) this.y.findViewById(R.id.tv_main_sugoo_text);
        this.ak = this.y.findViewById(R.id.location_line);
        this.aj = (ImageView) this.y.findViewById(R.id.iv_main_sugoo_text);
        this.am = this.y.findViewById(R.id.rl_action_home_content);
        this.an = (Space) this.y.findViewById(R.id.v_space_location);
        ((ViewGroup.MarginLayoutParams) this.am.getLayoutParams()).topMargin = u.a();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.c, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de97210aa29d33ba9f13daf42b06c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de97210aa29d33ba9f13daf42b06c63");
            return;
        }
        this.ah.setAlpha(f);
        this.aj.setAlpha(f);
        this.ai.setAlpha(f);
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = ad;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ca0158993ffe3cf38ef8d1f50aa134c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ca0158993ffe3cf38ef8d1f50aa134c");
        } else {
            if (this.aq != null && !this.af.Y && this.at != null) {
                this.aq.setBackground(e.a(this.at, com.sankuai.waimai.store.poi.list.util.d.a(1.0f - f)));
            }
            if (!this.af.Y && this.ax != null) {
                UnreadMessageBlock unreadMessageBlock = this.ax;
                Object[] objArr3 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect3 = UnreadMessageBlock.a;
                if (PatchProxy.isSupport(objArr3, unreadMessageBlock, changeQuickRedirect3, false, "ad32418595fbcac536dc19821e47687b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, unreadMessageBlock, changeQuickRedirect3, false, "ad32418595fbcac536dc19821e47687b");
                } else if (unreadMessageBlock.c != null) {
                    unreadMessageBlock.b.setImageDrawable(e.a(unreadMessageBlock.c, com.sankuai.waimai.store.poi.list.util.d.a(1.0f - f)));
                }
            }
        }
        if (this.aC != null) {
            this.aC.setAlpha(f);
        }
        if (this.g != null) {
            this.g.setAlpha(f);
            if (this.af.bb) {
                if (f == 0.0f) {
                    u.b(this.g);
                } else {
                    u.a(this.g);
                }
            }
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb8bb5f4ff063620c18d6f672084838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb8bb5f4ff063620c18d6f672084838");
        } else if (z) {
            u.a(this.ah);
            u.c(this.ai, this.aj);
        } else {
            u.c(this.ah);
            if (this.ao) {
                u.a(this.aj);
                u.c(this.ai);
                return;
            }
            u.a(this.ai);
            u.c(this.aj);
        }
    }

    private void r() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560df1c87c32e38319d236d0c3b10d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560df1c87c32e38319d236d0c3b10d9e");
            return;
        }
        boolean a = j.h().a(SCConfigPath.SG_NEW_HOME_V3_LOGO_SWITCH, false);
        String a2 = j.h().a(SCConfigPath.SG_NEW_HOME_V3_LOGO, "");
        if (this.ag && this.ar != null && !TextUtils.isEmpty(a2)) {
            g(a2);
        } else if (this.aj != null) {
            if (a && !TextUtils.isEmpty(a2)) {
                z = true;
            }
            this.ao = z;
            if (z) {
                f(a2);
            } else {
                this.ai.setText(this.af.d());
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.c, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a849a604ab2acccdd127b87e76915330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a849a604ab2acccdd127b87e76915330");
            return;
        }
        boolean z = this.af.Y;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = ad;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31f9bdd74af9e04d97f283bc69bb8322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31f9bdd74af9e04d97f283bc69bb8322");
        } else if (a() != null) {
            if (this.aw < 0) {
                this.aw = z ? 1 : 2;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
            } else {
                int i2 = z ? 1 : 2;
                if (i2 != this.aw) {
                    this.aw = i2;
                    com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
                }
            }
        }
        if (this.ai != null) {
            this.ai.setTextColor(i);
        }
        if (this.aq != null && this.at != null) {
            this.aq.setBackground(e.a(this.at, i));
        }
        if (this.ax != null) {
            UnreadMessageBlock unreadMessageBlock = this.ax;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = UnreadMessageBlock.a;
            if (PatchProxy.isSupport(objArr3, unreadMessageBlock, changeQuickRedirect3, false, "9819921c52fa7362a826801258bd706c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, unreadMessageBlock, changeQuickRedirect3, false, "9819921c52fa7362a826801258bd706c");
            } else if (unreadMessageBlock.c != null) {
                unreadMessageBlock.b.setImageDrawable(e.a(unreadMessageBlock.c, i));
            }
        }
        Object[] objArr4 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = ad;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "707f20fe61740fd2a5e0eb77b7addfd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "707f20fe61740fd2a5e0eb77b7addfd0");
        } else if (this.t != null && this.au != null) {
            if (this.av == null) {
                this.av = e.a(this.au, i);
            } else {
                DrawableCompat.setTintList(this.av, ColorStateList.valueOf(i));
            }
            this.t.setBackground(this.av);
        }
        Object[] objArr5 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect5 = ad;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4db695541ab7b27b4f7364d2ae4529b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4db695541ab7b27b4f7364d2ae4529b5");
            return;
        }
        if (this.ak != null) {
            this.ak.setBackgroundColor(this.af.Y ? 855638016 : 1728053247);
        }
        f.a().a(this.an);
        f.a().b(this.ak);
        if (this.al != null) {
            f.a();
            this.al.setTextColor(f.a(getContext(), i, this.af.Y));
        }
        f.a().a(getContext(), this.as, this.af.Y);
        f.a();
        getContext();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(@Nullable PoiVerticalityDataResponse.Promotion promotion, @Nullable NavigationTileConfig navigationTileConfig) {
        Object[] objArr = {promotion, navigationTileConfig};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8072fcddfb0249e1a5cf22846ec3171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8072fcddfb0249e1a5cf22846ec3171");
            return;
        }
        String str = "";
        if (promotion != null && !TextUtils.isEmpty(promotion.pageTitleUrl)) {
            str = promotion.pageTitleUrl;
        } else if (navigationTileConfig != null && !TextUtils.isEmpty(navigationTileConfig.pageTitleUrl)) {
            str = navigationTileConfig.pageTitleUrl;
        }
        boolean a = j.h().a(SCConfigPath.SG_NEW_HOME_V3_LOGO_SWITCH, false);
        if (this.ag) {
            if (!TextUtils.isEmpty(str)) {
                g(str);
                return;
            }
            String a2 = j.h().a(SCConfigPath.SG_NEW_HOME_V3_LOGO, "");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            g(a2);
        } else if (a && !TextUtils.isEmpty(str)) {
            f(str);
        } else {
            r();
        }
    }

    private void f(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0518c1feb8bd75b8c2e95aeb2d230844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0518c1feb8bd75b8c2e95aeb2d230844");
            return;
        }
        b.C0608b d = m.d(str, getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_20));
        d.g = false;
        d.f = ImageQualityUtil.a();
        d.a(this.aj);
    }

    private void g(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89fca050ecaf09923487d86a3bc795b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89fca050ecaf09923487d86a3bc795b");
            return;
        }
        b.C0608b d = m.d(str, h.a(getContext(), 24.0f));
        d.g = false;
        d.f = ImageQualityUtil.a();
        d.a(this.ar);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final int f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = ad;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c736409b0b71e2deed1ab5c8b871ebd8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c736409b0b71e2deed1ab5c8b871ebd8")).intValue() : super.f(i);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final void e(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        int i = 0;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8093d9fb38a7582a6e7e2a7423e8361d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8093d9fb38a7582a6e7e2a7423e8361d");
            return;
        }
        BaseTile<BaseModuleDesc, NavigationTileConfig> navigationBlock = poiVerticalityDataResponse.getNavigationBlock();
        if (navigationBlock == null || navigationBlock.propsData == null || navigationBlock.data == null) {
            return;
        }
        NavigationTileConfig navigationTileConfig = navigationBlock.propsData;
        BaseModuleDesc baseModuleDesc = navigationBlock.data;
        q();
        if (baseModuleDesc.searchCarouselTextInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) baseModuleDesc.searchCarouselTextInfo.searchCarouselTextList) && baseModuleDesc.searchCarouselTextInfo.carouselTime > 0) {
            u.a(this.W);
            u.c(this.V);
            a(baseModuleDesc.searchCarouselTextInfo.searchCarouselTextList, baseModuleDesc.searchCarouselTextInfo.carouselTime);
        } else if (!TextUtils.isEmpty(baseModuleDesc.searchText)) {
            u.c(this.W);
            u.a(this.V, baseModuleDesc.searchText);
        }
        PoiVerticalityDataResponse.ButtonArea c = c();
        Integer a = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchIconColor : c.endColor);
        if (a != null) {
            this.Y.setBackground(e.a(getContext().getResources().getDrawable(R.drawable.wm_st_actionbar_search_white), a.intValue()));
        }
        int a2 = com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarBgColor, -1);
        this.X.setVisibility(0);
        int a3 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.startColor)) ? navigationTileConfig.searchButtonBgFromColor : c.startColor, -7859);
        int a4 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchButtonBgToColor : c.endColor, -15539);
        int d = b() ? d() : com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchButtonTextColor, -14539738);
        Drawable a5 = e.a(getContext(), new int[]{a3, a4}, R.dimen.wm_sc_common_dimen_16, GradientDrawable.Orientation.TL_BR);
        if (this.af.y || !this.af.aS) {
            this.X.setBackground(a5);
            this.X.setTextColor(d);
        }
        if (this.af.y) {
            this.X.getBackground().setAlpha(0);
            this.aa.setVisibility(0);
        }
        e.a c2 = new e.a().a(getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_16)).c(a2);
        if (c != null && !t.a(c.endColor)) {
            c2.b(3).a(com.sankuai.shangou.stone.util.d.a(c.endColor, -15539));
        } else if (!t.a(navigationTileConfig.searchBarFrameColor)) {
            if (!this.af.aS || this.af.y) {
                c2.b(3).a(com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarFrameColor, -15539));
            }
        } else {
            c2.b(3).a(-15539);
        }
        this.ab = c2.a();
        if (!this.af.y) {
            this.A.setBackground(this.ab);
        } else {
            this.A.setBackground(this.ac);
        }
        if (com.sankuai.waimai.store.goods.list.utils.e.b() && this.af.ba) {
            this.X.getBackground().setAlpha(255);
            this.aa.setVisibility(8);
            this.A.setBackground(this.ab);
        }
        this.V.setTextColor(com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarPlaceholderFontColor, -6711404));
        if (this.af.aS) {
            this.r.setVisibility(d(poiVerticalityDataResponse) ? 0 : 8);
            int width = this.Z - ((this.r == null || this.r.getVisibility() != 0) ? 0 : this.r.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13));
            if (this.af.bb && this.s != null && this.s.getVisibility() == 0) {
                i = this.s.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10);
            }
            this.A.getLayoutParams().width = width - i;
            a(this.af);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar, com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        boolean z;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0024ae8d74694654d4c9dc73285d2ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0024ae8d74694654d4c9dc73285d2ecb");
            return;
        }
        super.a(poiVerticalityDataResponse);
        Object[] objArr2 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect2 = ad;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae03e9a482d3f34389f02c1576c567a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae03e9a482d3f34389f02c1576c567a4");
        } else {
            BaseTile<BaseModuleDesc, NavigationTileConfig> navigationBlock = poiVerticalityDataResponse.getNavigationBlock();
            Object[] objArr3 = {navigationBlock};
            ChangeQuickRedirect changeQuickRedirect3 = ad;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5201f1286bbf5f66bc2fd2fef5dcee1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5201f1286bbf5f66bc2fd2fef5dcee1")).booleanValue();
            } else {
                z = (navigationBlock == null || navigationBlock.data == null || com.sankuai.shangou.stone.util.a.b(navigationBlock.data.navigationActivitys)) ? false : true;
            }
            if (z) {
                List<TopNavigationEntity.NavigationActivity> list = navigationBlock.data.navigationActivitys;
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", Long.valueOf(this.af.c));
                hashMap.put("stid", this.af.T);
                TopNavigationEntity.NavigationActivity navigationActivity = list.get(0);
                Object[] objArr4 = {navigationActivity, hashMap};
                ChangeQuickRedirect changeQuickRedirect4 = ad;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7b7b4cdf3621d589f8dadc1c13ae98dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7b7b4cdf3621d589f8dadc1c13ae98dc");
                } else if (!TextUtils.isEmpty(navigationActivity.picUrl)) {
                    String str = navigationActivity.picUrl;
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect5 = ad;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d4f4a6a81e6706bd030651a51414dec4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d4f4a6a81e6706bd030651a51414dec4");
                    } else {
                        b.C0608b a = m.a(str, h.a(getContext(), 60.0f), h.a(getContext(), 24.0f), ImageQualityUtil.a());
                        a.g = false;
                        a.a(this.aC);
                    }
                    this.aC.setTag(navigationActivity);
                    u.a(this.aC);
                    if (!this.f) {
                        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_aekmcwqp_mv", this.aC);
                        bVar.a("activity_id", navigationActivity.activityId);
                        bVar.b(hashMap);
                        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
                            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) getContext(), bVar);
                        }
                    }
                    if (this.al != null) {
                        this.al.setMaxEms(8);
                    }
                }
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = ad;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "142907f6b0f63d84f6d7cb26d710f7c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "142907f6b0f63d84f6d7cb26d710f7c9");
                } else if (this.aC != null) {
                    u.c(this.aC);
                    if (this.al != null) {
                        this.al.setMaxEms(10);
                    }
                }
            }
        }
        if (!this.af.bc || this.am == null) {
            return;
        }
        this.am.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + (this.af.y ? this.S : 0) + this.o;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = ad;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac966e6633d02c8510201fbdbfeb681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac966e6633d02c8510201fbdbfeb681");
            return;
        }
        super.a(f);
        if (this.af.Y) {
            return;
        }
        int a = com.sankuai.waimai.store.poi.list.util.d.a(f);
        if (this.r != null && this.ay != null && this.af.aS && (this.af.aX || this.af.aY)) {
            if (this.az == null) {
                this.az = e.a(this.ay, a);
            } else {
                DrawableCompat.setTintList(this.az, ColorStateList.valueOf(a));
            }
            this.r.setBackground(this.ay);
        }
        if (this.af.bb && this.s != null && this.aA != null && this.af.aS && (this.af.aX || this.af.aY)) {
            if (this.aB == null) {
                this.aB = e.a(this.aA, a);
            } else {
                DrawableCompat.setTintList(this.aB, ColorStateList.valueOf(a));
            }
            this.s.setBackground(this.aA);
        }
        if (this.au == null || b() || this.af.aS) {
            if (this.au == null) {
                return;
            }
            if ((!this.af.aX && !this.af.aY) || !this.af.aS) {
                return;
            }
        }
        if (this.av == null) {
            this.av = e.a(this.au, a);
        } else {
            DrawableCompat.setTintList(this.av, ColorStateList.valueOf(a));
        }
        this.t.setBackground(this.av);
    }
}
