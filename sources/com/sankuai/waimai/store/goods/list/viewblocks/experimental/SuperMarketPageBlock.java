package com.sankuai.waimai.store.goods.list.viewblocks.experimental;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.goods.list.base.c;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.utils.d;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMscFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.ShopAllSpuFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.SuperMarketMainFragment;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.g;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.ar;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.standard.FlashTab;
import com.sankuai.waimai.store.view.standard.FlashTabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SuperMarketPageBlock extends b implements c {
    public static ChangeQuickRedirect a;
    final e b;
    public List<RestMenuResponse.b> c;
    public final List<Fragment> d;
    public SuperMarketMainFragment e;
    public ShopAllSpuFragment f;
    public int g;
    long h;
    private FlashTab i;
    private LinearLayout j;
    private ImageView k;
    private com.sankuai.waimai.store.expose.v2.entity.b l;

    public SuperMarketPageBlock(e eVar) {
        super(eVar.k());
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d4f2592684a247b680db306fe476ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d4f2592684a247b680db306fe476ba");
            return;
        }
        this.d = new ArrayList();
        this.h = 0L;
        this.b = eVar;
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa26b0a3b46219c6c3bcae5fdcf7fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa26b0a3b46219c6c3bcae5fdcf7fcf");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8f6f27032d509b17a4dd60553672e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8f6f27032d509b17a4dd60553672e0b");
        } else {
            this.j = (LinearLayout) findView(R.id.ll_coupon_info);
            this.k = (ImageView) findView(R.id.iv_coupon_arrow);
            this.l = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_to2rz4nn_mv", this.j);
            com.sankuai.waimai.store.expose.v2.b.a().a(this.b.k(), this.l);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79b5dea7c9591abf7625b0965e88ff29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79b5dea7c9591abf7625b0965e88ff29");
            return;
        }
        this.i = (FlashTab) findView(R.id.wm_sc_flash_tab);
        this.i.setOnTabSelectedListener(new FlashTabLayout.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketPageBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void b(FlashTabLayout.e eVar) {
            }

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void c(FlashTabLayout.e eVar) {
            }

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void a(FlashTabLayout.e eVar) {
                Object[] objArr4 = {eVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b62c5355792ccef88e594b1305572868", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b62c5355792ccef88e594b1305572868");
                    return;
                }
                int i = eVar.h;
                RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) SuperMarketPageBlock.this.c, i);
                com.sankuai.waimai.store.manager.judas.b.a(SuperMarketPageBlock.this.b.k(), "b_waimai_sdv8t367_mc").a("poi_id", SuperMarketPageBlock.this.b.d().d()).a("title", bVar.b).a("codes", Integer.valueOf(bVar.c)).a("type", 0).a("stid", SuperMarketPageBlock.this.b.d().b.abExpInfo).a();
                SuperMarketPageBlock superMarketPageBlock = SuperMarketPageBlock.this;
                Object[] objArr5 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = SuperMarketPageBlock.a;
                if (PatchProxy.isSupport(objArr5, superMarketPageBlock, changeQuickRedirect5, false, "30d2918234e16b4fa19efc6875cc2173", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, superMarketPageBlock, changeQuickRedirect5, false, "30d2918234e16b4fa19efc6875cc2173");
                    return;
                }
                Fragment fragment = (Fragment) com.sankuai.shangou.stone.util.a.a((List<Object>) superMarketPageBlock.d, superMarketPageBlock.g);
                Fragment fragment2 = (Fragment) com.sankuai.shangou.stone.util.a.a((List<Object>) superMarketPageBlock.d, i);
                try {
                    FragmentTransaction beginTransaction = superMarketPageBlock.b.k().getSupportFragmentManager().beginTransaction();
                    if (fragment != null && fragment.isAdded()) {
                        beginTransaction.hide(fragment);
                    }
                    if (fragment2 != null) {
                        if (fragment2.isAdded()) {
                            beginTransaction.show(fragment2);
                        } else {
                            beginTransaction.add(R.id.viewpager_content, fragment2);
                            beginTransaction.show(fragment2);
                        }
                    }
                    beginTransaction.commitNowAllowingStateLoss();
                    RestMenuResponse.b bVar2 = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) superMarketPageBlock.c, superMarketPageBlock.g);
                    if (bVar2 != null) {
                        bVar2.d = false;
                    }
                    RestMenuResponse.b bVar3 = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) superMarketPageBlock.c, i);
                    if (bVar3 != null) {
                        bVar3.d = true;
                    }
                    if (fragment2 instanceof ShopAllSpuFragment) {
                        ShopAllSpuFragment shopAllSpuFragment = (ShopAllSpuFragment) fragment2;
                        long j = superMarketPageBlock.h;
                        Object[] objArr6 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect6 = ShopAllSpuFragment.a;
                        if (PatchProxy.isSupport(objArr6, shopAllSpuFragment, changeQuickRedirect6, false, "a85fdf7cb1e5fb6511a8bd74f3673c68", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, shopAllSpuFragment, changeQuickRedirect6, false, "a85fdf7cb1e5fb6511a8bd74f3673c68");
                        } else if (shopAllSpuFragment.c != null) {
                            shopAllSpuFragment.c.a(j);
                        }
                    }
                    superMarketPageBlock.h = 0L;
                    superMarketPageBlock.g = i;
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        });
        this.i.setRelationMove(true);
        this.i.setTabCreateListener(new FlashTabLayout.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketPageBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.a
            public final void a(View view, int i) {
                Object[] objArr4 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f026e8d6f417f3ffbbb2dfd2abe67f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f026e8d6f417f3ffbbb2dfd2abe67f4");
                } else if (SuperMarketPageBlock.this.b.k() == null) {
                } else {
                    RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) SuperMarketPageBlock.this.c, i);
                    com.sankuai.waimai.store.expose.v2.entity.b bVar2 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sdv8t367_mv", view);
                    com.sankuai.waimai.store.expose.v2.b.a().a(SuperMarketPageBlock.this.b.k(), bVar2);
                    bVar2.e = Integer.toString(bVar.c);
                    bVar2.a("poi_id", SuperMarketPageBlock.this.b.d().d()).a("title", bVar.b).a("codes", Integer.valueOf(bVar.c)).a("stid", SuperMarketPageBlock.this.b.d().b.abExpInfo);
                }
            }
        });
    }

    public void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a628753b3c1add2709c87ba98b9f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a628753b3c1add2709c87ba98b9f71");
        } else if (b() == null || b().b == null) {
        } else {
            this.k.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.mContext, (int) R.dimen.wm_sc_common_dimen_5, (int) R.dimen.wm_sc_common_dimen_3, (int) R.color.wm_st_common_text_money, a.EnumC1338a.DOWN));
            if (!w.a(b().b) || g.b(restMenuResponse)) {
                u.c(this.j);
                return;
            }
            u.a(this.j);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketPageBlock.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "409610e357c1170dd7bfd823ae31d4ff", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "409610e357c1170dd7bfd823ae31d4ff");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(SuperMarketPageBlock.this.getContext(), "b_waimai_to2rz4nn_mc").a("poi_id", SuperMarketPageBlock.this.b().d()).a();
                    com.sankuai.waimai.store.coupons.a.a().a(SuperMarketPageBlock.this.mContext, SuperMarketPageBlock.this.b());
                }
            });
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.l;
            bVar.e = Integer.toString(this.j.hashCode());
            bVar.a("poi_id", b().d());
        }
    }

    private int a(int i) {
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad3811286bb5c5d15dddd47bc0d499f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad3811286bb5c5d15dddd47bc0d499f")).intValue();
        }
        int c = com.sankuai.shangou.stone.util.a.c(this.c);
        for (int i2 = 0; i2 < c; i2++) {
            RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i2);
            if (bVar != null && bVar.c == 2) {
                return i2;
            }
        }
        return 0;
    }

    public void b(RestMenuResponse restMenuResponse) {
        Context context;
        float f;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0547968e78cf1862efb1b679a1632a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0547968e78cf1862efb1b679a1632a3");
        } else if (com.sankuai.shangou.stone.util.a.b(this.c)) {
            this.i.setSelectIndex(0);
        } else {
            int c = com.sankuai.shangou.stone.util.a.c(this.c);
            boolean a2 = a(this.c);
            ArrayList arrayList = new ArrayList();
            String[] strArr = new String[c];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < c; i3++) {
                RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i3);
                if (bVar != null) {
                    a(restMenuResponse, bVar, a2);
                    if (bVar.d) {
                        i = i3;
                    }
                    strArr[i3] = bVar.f != null ? bVar.f.bubbleIcon : "";
                    FlashTab.b bVar2 = new FlashTab.b();
                    bVar2.b = a(bVar);
                    bVar2.a = i2;
                    if (bVar.f != null) {
                        bVar2.c = bVar.f.promotionSelectedPic;
                        bVar2.d = bVar.f.promotionUnselectedPic;
                        bVar2.g = 1;
                        if ((TextUtils.isEmpty(bVar.b) ? 0 : bVar.b.length()) > 2) {
                            context = this.mContext;
                            f = 74.0f;
                        } else {
                            context = this.mContext;
                            f = 45.0f;
                        }
                        bVar2.e = h.a(context, f);
                        bVar2.f = h.a(this.mContext, 6.0f);
                    }
                    arrayList.add(bVar2);
                    i2++;
                }
            }
            this.i.setTabs(arrayList);
            int c2 = com.sankuai.shangou.stone.util.a.c(strArr);
            for (int i4 = 0; i4 < c2; i4++) {
                String str = (String) com.sankuai.shangou.stone.util.a.a(strArr, i4);
                if (!t.a(str)) {
                    ImageView imageView = new ImageView(getContext());
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.i.a(i4, true, imageView);
                    m.b(str, imageView, h.a(this.mContext, 17.0f));
                }
            }
            this.i.setSelectIndex(i);
        }
    }

    private CharSequence a(@NonNull RestMenuResponse.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572aebb0d6451aaa0a18305a9dc235c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572aebb0d6451aaa0a18305a9dc235c4");
        }
        if (bVar.f == null) {
            return bVar.b;
        }
        if (bVar.c == 4) {
            double d = this.b.d().b.score;
            if (d > 0.0d) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.b);
                if (i.d(Double.valueOf(d), Double.valueOf(5.0d))) {
                    d = 5.0d;
                }
                sb.append(d);
                SpannableString spannableString = new SpannableString(sb.toString());
                int b = com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_858687);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_textsize_12));
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(b);
                int length = bVar.b.length();
                int length2 = spannableString.length();
                spannableString.setSpan(absoluteSizeSpan, length, length2, 34);
                spannableString.setSpan(foregroundColorSpan, length, length2, 34);
                return spannableString;
            }
        } else if (!TextUtils.isEmpty(bVar.f.commentCount)) {
            SpannableString spannableString2 = new SpannableString(bVar.b + bVar.f.commentCount);
            int b2 = com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_BCBCBD);
            AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_textsize_11));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(b2);
            SuperscriptSpan superscriptSpan = new SuperscriptSpan();
            int length3 = bVar.b.length();
            int length4 = spannableString2.length();
            spannableString2.setSpan(superscriptSpan, length3, length4, 34);
            spannableString2.setSpan(absoluteSizeSpan2, length3, length4, 34);
            spannableString2.setSpan(foregroundColorSpan2, length3, length4, 34);
            return spannableString2;
        }
        return bVar.b;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAnchorSecondCategoryEvent(com.sankuai.waimai.store.coupons.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45289099019bee342f4179825ed119f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45289099019bee342f4179825ed119f9");
        } else if (aVar == null || TextUtils.isEmpty(aVar.a)) {
        } else {
            a(0L);
        }
    }

    private boolean a(@NonNull List<RestMenuResponse.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b16bfd5f4de8de913d351b0f0dc6f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b16bfd5f4de8de913d351b0f0dc6f3")).booleanValue();
        }
        for (RestMenuResponse.b bVar : list) {
            if (bVar != null && bVar.c == 1) {
                return true;
            }
        }
        return false;
    }

    private void a(RestMenuResponse restMenuResponse, @NonNull RestMenuResponse.b bVar, boolean z) {
        Object[] objArr = {restMenuResponse, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bee000915e6e3ed79d010839dbd6e3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bee000915e6e3ed79d010839dbd6e3d");
            return;
        }
        switch (bVar.c) {
            case 1:
                this.e = SuperMarketMainFragment.a(this.b, restMenuResponse);
                this.d.add(this.e);
                return;
            case 2:
                bVar.g = z;
                this.f = ShopAllSpuFragment.a(this.b, restMenuResponse);
                this.d.add(this.f);
                return;
            case 3:
                this.d.add(c(bVar));
                return;
            case 4:
                this.d.add(b(bVar));
                return;
            default:
                return;
        }
    }

    private Fragment b(@NonNull RestMenuResponse.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd549b710fc173d7745fa41fef78ea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd549b710fc173d7745fa41fef78ea3");
        }
        if (b().b.isMscPoiCommentTab() && k.d()) {
            String a2 = com.sankuai.waimai.store.config.i.h().a("msc_schemes/poi/comment_tab", "imeituan://www.meituan.com/msc?appId=7122f6e193de47c1&reload=true&targetPath=%2Fpages%2Fcomment-tab%2Findex");
            if (bVar.f != null && !t.a(bVar.f.scheme)) {
                a2 = bVar.f.scheme;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cid", this.b.b());
            hashMap.put("poi_id", String.valueOf(this.b.d().f()));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, b().h());
            hashMap.put("extra", c());
            PoiTabMscFragment a3 = PoiTabMscFragment.a(Uri.parse(com.sankuai.waimai.store.router.g.a(a2, hashMap)), new HashMap());
            a3.a(this.b);
            return a3;
        }
        String str = "flashbuy-store-info";
        String str2 = "supermarket";
        if (b() != null && b().b.addition != null && "A".equals(b().b.addition.level2FoodPageJump)) {
            str2 = "sgc";
            str = "flashbuy-restaurant-info";
        }
        PoiTabMRNFragment a4 = PoiTabMRNFragment.a(str2, str, "flashbuy-store-comments");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("poi_id", String.valueOf(b().f()));
        hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, b().h());
        hashMap2.put("cid", this.b.b());
        ((SGCommonRNFragment) a4).j = hashMap2;
        a4.a(this.b);
        a4.a(new PoiTabMRNFragment.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketPageBlock.4
            @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.a
            public final void a(@NonNull com.facebook.react.views.scroll.e eVar) {
            }
        });
        return a4;
    }

    private Fragment c(@NonNull RestMenuResponse.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a4d7a175decc0305b12715218a1cef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a4d7a175decc0305b12715218a1cef");
        }
        Poi poi = b().b;
        if (poi != null && poi.isMscPoiVip() && k.d()) {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", String.valueOf(this.b.d().f()));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.b.d().h());
            hashMap.put("extra", c());
            hashMap.put("cid", this.b.b());
            String str = "imeituan://www.meituan.com/msc?isWidget=true&appId=7122f6e193de47c1&targetPath=%2Fpages%2Fsgc_poi_memeber%2Findex";
            if (bVar.f != null && !t.a(bVar.f.scheme)) {
                str = bVar.f.scheme;
            }
            PoiTabMscFragment a2 = PoiTabMscFragment.a(Uri.parse(com.sankuai.waimai.store.router.g.a(str, hashMap)), new HashMap());
            a2.a(this.b);
            return a2;
        }
        PoiTabMRNFragment a3 = PoiTabMRNFragment.a("supermarket", "flashbuy-membercard-detail", "flashbuy-poi-membercard-detail");
        a3.a(this.b);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("poi_id", String.valueOf(b().f()));
        hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, b().h());
        hashMap2.put("extra", c());
        a3.a(new PoiTabMRNFragment.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketPageBlock.5
            @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.a
            public final void a(@NonNull com.facebook.react.views.scroll.e eVar) {
            }
        });
        ((SGCommonRNFragment) a3).j = hashMap2;
        return a3;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d0aecea9fd9c11b5f06b8ae533fb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d0aecea9fd9c11b5f06b8ae533fb91");
        } else if (this.j.getVisibility() != 0 || ab.b().b(this.mContext, "show_poi_discounts_tip", false)) {
        } else {
            ab.b().a(this.mContext, "show_poi_discounts_tip", true);
            final Context context = this.mContext;
            final String string = this.mContext.getString(R.string.wm_sc_goods_list_discounts_tip);
            final LinearLayout linearLayout = this.j;
            final String l = this.b.l();
            Object[] objArr2 = {context, string, linearLayout, l};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.controller.i.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "724f23c3ab1c6dc06dcd9bdfb96c10e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "724f23c3ab1c6dc06dcd9bdfb96c10e4");
                return;
            }
            Object[] objArr3 = {context, string, linearLayout, l, 0, null};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.controller.i.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d24aa3f52d2142a40211774b3fd4d865", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d24aa3f52d2142a40211774b3fd4d865");
            } else {
                al.a(new Runnable() { // from class: com.sankuai.waimai.store.controller.i.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "abada463af8585ea8e04a089c7181001", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "abada463af8585ea8e04a089c7181001");
                            return;
                        }
                        Context context2 = context;
                        String str = string;
                        View view = linearLayout;
                        String str2 = l;
                        String str3 = r5;
                        Object[] objArr5 = {context2, str, view, str2, str3};
                        ChangeQuickRedirect changeQuickRedirect5 = i.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "beeb0e5730a76c4650d7c96c8b2ef780", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "beeb0e5730a76c4650d7c96c8b2ef780");
                        } else if (com.sankuai.waimai.store.util.b.a(context2) || view == null || view.getContext() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        } else {
                            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16);
                            final PopupWindow a2 = com.sankuai.waimai.store.newwidgets.tips.a.a(context2, str, dimensionPixelOffset, dimensionPixelOffset);
                            Object[] objArr6 = {a2, view, 0, 5};
                            ChangeQuickRedirect changeQuickRedirect6 = ar.a;
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "5afa32764448129a0373d1e9794ac978", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "5afa32764448129a0373d1e9794ac978");
                            } else if (a2 != null) {
                                try {
                                    a2.showAsDropDown(view, 0, 5);
                                } catch (Exception e) {
                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                }
                            }
                            com.sankuai.waimai.store.util.c.a(context2, str3, 1, 1);
                            al.a(new Runnable() { // from class: com.sankuai.waimai.store.controller.i.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e647a3bd14ae9a921a8198ef56f4d265", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e647a3bd14ae9a921a8198ef56f4d265");
                                    } else {
                                        ar.a(a2);
                                    }
                                }
                            }, 3000, str2);
                        }
                    }
                }, 0, l);
            }
        }
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a36c48f8571d21744e6e13396aa40d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a36c48f8571d21744e6e13396aa40d") : d.a(this.b.k().getIntent(), "extra", "extra", "");
    }

    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ece4e185fa647e6503a5aef56f23056", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ece4e185fa647e6503a5aef56f23056") : this.b.d();
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254adf98310c5603f2e201c0520e2ebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254adf98310c5603f2e201c0520e2ebc");
            return;
        }
        this.h = j;
        this.i.setSelectIndex(a(2));
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bd469cbc8d33b8db32837fc61585cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bd469cbc8d33b8db32837fc61585cb");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        super.onDestroy();
    }
}
