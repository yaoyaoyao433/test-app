package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserAnchorUtils;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserStickEvent;
import com.sankuai.waimai.store.mach.poitag.PoiLabelInfoListItem;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.RoundedCornerImageView;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGNewUserLandAdapter extends com.sankuai.waimai.store.newwidgets.list.f<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
    public static ChangeQuickRedirect a;
    j b;
    private Context c;
    private SGNewUserAnchorUtils d;
    private RecyclerView.LayoutManager j;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaee6b6c88b26a2ae5d61c72ec04ed6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaee6b6c88b26a2ae5d61c72ec04ed6c");
            return;
        }
        super.onViewRecycled(cVar2);
        if (cVar2.b instanceof e) {
            ((e) cVar2.b).g();
        }
    }

    public SGNewUserLandAdapter(@NonNull com.sankuai.waimai.store.goods.list.viewblocks.newuser.e eVar, Context context, SGNewUserAnchorUtils sGNewUserAnchorUtils, RecyclerView.LayoutManager layoutManager) {
        super(eVar);
        Object[] objArr = {eVar, context, sGNewUserAnchorUtils, layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9966875cccb2fc79d6c301b07fd59bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9966875cccb2fc79d6c301b07fd59bb");
            return;
        }
        this.c = context;
        this.d = sGNewUserAnchorUtils;
        this.j = layoutManager;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a932864e19c85c2be5c03049256c7385", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a932864e19c85c2be5c03049256c7385");
        }
        switch (i) {
            case 1:
            case 4:
            case 7:
            case 12:
            case 13:
                return new g(this.c, this.b);
            case 2:
                a aVar = new a(this.c, this.b);
                aVar.a((a) this.i);
                return aVar;
            case 3:
                return new f(1, this.b, this.c);
            case 5:
            case 15:
                return new b(this.c, this.b);
            case 6:
                return new f(2, this.b, this.c);
            case 8:
            case 11:
                return new e(new com.sankuai.waimai.store.goods.list.viewblocks.newuser.a(this.c, ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.i).o()));
            case 9:
                return new f(3, this.b, this.c);
            case 10:
                return new d(new com.sankuai.waimai.store.goods.list.viewblocks.newuser.a(this.c, ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.i).o()), this.c);
            case 14:
                return new f(h.p, this.b, this.c);
            case 16:
                return new c(this.c, this.b);
            case 17:
                return new f(h.q, this.b, this.c);
            default:
                return null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672c426a14af61407e59a8aa8dcbf336", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672c426a14af61407e59a8aa8dcbf336")).intValue();
        }
        com.sankuai.waimai.store.goods.list.viewblocks.newuser.b h = h(i);
        if (h != null) {
            return h.q;
        }
        return super.getItemViewType(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class g extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
        public static ChangeQuickRedirect a;
        public TextView b;
        public ImageView c;
        public LinearLayout d;
        public RelativeLayout e;
        public View f;
        public Context g;
        public Drawable h;
        public Drawable i;
        public Drawable j;
        public View k;
        public j l;
        public boolean m;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_new_user_land_title_item;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, int i) {
            com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25c29e7df73f604b653230c66cf9425e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25c29e7df73f604b653230c66cf9425e");
            } else if (bVar2 == null || bVar2.t == null) {
            } else {
                boolean equals = TextUtils.equals((String) this.p.getTag(-103), "sticky");
                if (this.f != null) {
                    if (equals) {
                        this.f.setBackground(this.j);
                    } else {
                        this.f.setBackground(this.i);
                    }
                }
                SGNewUserLandResponse.SGNewUserItemTitleData sGNewUserItemTitleData = (SGNewUserLandResponse.SGNewUserItemTitleData) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(bVar2.t.jsonData), SGNewUserLandResponse.SGNewUserItemTitleData.class);
                if (sGNewUserItemTitleData != null || bVar2.q == 1) {
                    if (sGNewUserItemTitleData == null && bVar2.q == 1) {
                        sGNewUserItemTitleData = new SGNewUserLandResponse.SGNewUserItemTitleData();
                        sGNewUserItemTitleData.title = "减免配送费0元起送";
                    }
                    u.a(this.b, sGNewUserItemTitleData.title);
                    u.a(this.b);
                    ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
                    u.c(this.k);
                    if (bVar2.q == 1) {
                        u.a(this.c);
                        u.a(this.f);
                        a(this.m);
                        this.e.setBackground(this.h);
                        m.b("https://p0.meituan.net/ingee/b82af8f15f3bb27927fa65951990b40c7340.png", ImageQualityUtil.b()).a(this.c);
                    } else if (bVar2.q == 4) {
                        if (i == 0) {
                            u.a(this.c);
                            u.a(this.f);
                            layoutParams.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_41);
                            this.e.setBackground(this.h);
                            m.b("https://p0.meituan.net/ingee/b82af8f15f3bb27927fa65951990b40c7340.png", ImageQualityUtil.b()).a(this.c);
                        } else {
                            layoutParams.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                            u.c(this.f);
                            u.c(this.c);
                            this.e.setBackgroundColor(this.g.getResources().getColor(R.color.wm_st_common_white));
                        }
                    } else if (bVar2.q == 7) {
                        layoutParams.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_41);
                        u.a(this.f);
                        this.e.setBackground(this.h);
                        if (com.sankuai.shangou.stone.util.f.c(sGNewUserItemTitleData.newUserProducts) > 0.0f) {
                            m.b("https://p0.meituan.net/ingee/23aaf9a8293a95ba4d065aa913f9d5a97938.png", ImageQualityUtil.b()).a(this.c);
                        } else {
                            m.b("https://p0.meituan.net/ingee/9c78f30038f4cefbf73d0a78166b26fb10396.png", ImageQualityUtil.b()).a(this.c);
                        }
                        u.a(this.c);
                    } else if (bVar2.q == 12 || bVar2.q == 13) {
                        layoutParams.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_41);
                        u.c(this.f);
                        u.c(this.c);
                        this.e.setBackgroundColor(this.g.getResources().getColor(R.color.wm_st_common_white));
                    } else {
                        u.c(this.b);
                        u.c(this.c);
                        u.c(this.f);
                    }
                    this.e.setLayoutParams(layoutParams);
                }
            }
        }

        public g(Context context, j jVar) {
            Object[] objArr = {context, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11db5bd18c4e28e2c7fb14650f847a28", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11db5bd18c4e28e2c7fb14650f847a28");
                return;
            }
            this.m = false;
            this.g = context;
            this.l = jVar;
        }

        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3021e39d2d8f1d4395504720445e10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3021e39d2d8f1d4395504720445e10");
                return;
            }
            this.m = z;
            if (this.e == null || this.f == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
            if (z) {
                layoutParams.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                layoutParams2.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_35);
            } else {
                layoutParams.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_41);
                layoutParams2.height = this.g.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_40);
            }
            this.e.setLayoutParams(layoutParams);
            this.f.setLayoutParams(layoutParams2);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abdff4c5db3ebf0d3575f6155e82ff13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abdff4c5db3ebf0d3575f6155e82ff13");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.tv_title);
            this.c = (ImageView) view.findViewById(R.id.iv_new_user_icon);
            this.k = view.findViewById(R.id.view_empty);
            this.d = (LinearLayout) view.findViewById(R.id.ll_title_container);
            this.e = (RelativeLayout) view.findViewById(R.id.rl_title_container);
            this.f = view.findViewById(R.id.v_title_bg);
            this.h = new e.a().a(com.sankuai.shangou.stone.util.h.a(this.g, 12.0f), com.sankuai.shangou.stone.util.h.a(this.g, 12.0f), 0.0f, 0.0f).a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(this.g, R.color.wm_st_common_white), ContextCompat.getColor(this.g, R.color.wm_st_common_white)}).a();
            this.i = new e.a().a(com.sankuai.shangou.stone.util.h.a(this.g, 12.0f), com.sankuai.shangou.stone.util.h.a(this.g, 12.0f), 0.0f, 0.0f).a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(this.g, R.color.wm_sg_color_FFEBEB), ContextCompat.getColor(this.g, R.color.wm_st_common_white)}).a();
            this.j = new e.a().a(0.0f, 0.0f, 0.0f, 0.0f).a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(this.g, R.color.wm_sg_color_FFEBEB), ContextCompat.getColor(this.g, R.color.wm_st_common_white)}).a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
        public static ChangeQuickRedirect a;
        LinearLayoutManager b;
        private j c;
        private Context d;
        private RecyclerView e;
        private com.sankuai.waimai.store.goods.list.viewblocks.newuser.f f;
        private View g;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_new_user_land_hotproduct_tab;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, int i) {
            final com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d4d1849ae582e5c5a49e2361f89b47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d4d1849ae582e5c5a49e2361f89b47");
                return;
            }
            Object[] objArr2 = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0993a450b49310f6acb833a6d754b39f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0993a450b49310f6acb833a6d754b39f");
                return;
            }
            final boolean equals = TextUtils.equals((String) this.p.getTag(-103), "sticky");
            if (bVar2 == null || bVar2.t == null || bVar2.n == null || com.sankuai.shangou.stone.util.a.b(bVar2.n.tabs)) {
                return;
            }
            if (equals) {
                u.c(this.g);
            } else {
                u.a(this.g);
                if (bVar2.p) {
                    u.b(this.e);
                } else {
                    u.a(this.e);
                }
            }
            com.sankuai.waimai.store.goods.list.viewblocks.newuser.f fVar = this.f;
            SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs = bVar2.n;
            Object[] objArr3 = {hotSaleProductTabs, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.viewblocks.newuser.f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "2104bae3d8ef91213b34521d252c6c98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "2104bae3d8ef91213b34521d252c6c98");
            } else {
                fVar.c = hotSaleProductTabs;
                fVar.e = i;
                fVar.notifyDataSetChanged();
            }
            HashMap hashMap = new HashMap();
            com.sankuai.waimai.store.expose.v2.entity.b bVar3 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_gongjitab_mv", this.e);
            bVar3.b(hashMap);
            bVar3.e = "mHotTabRecyclerViewKey";
            com.sankuai.waimai.store.expose.v2.b.a().a(((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o).r(), bVar3);
            this.e.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c1d77fefe244594a5a520d9b753b6bff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c1d77fefe244594a5a520d9b753b6bff");
                        return;
                    }
                    if (equals) {
                        if (!bVar2.n.isTop) {
                            i2 = (int) (bVar2.n.offsetX * 0.8d);
                        }
                        i2 = (int) bVar2.n.offsetX;
                    } else {
                        if (bVar2.n.isTop) {
                            i2 = (int) (bVar2.n.offsetX * 1.2d);
                        }
                        i2 = (int) bVar2.n.offsetX;
                    }
                    c.this.b.scrollToPositionWithOffset(bVar2.n.firstVisibleItemPosition, -i2);
                }
            }, 64L);
        }

        public c(Context context, j jVar) {
            Object[] objArr = {context, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "061175efa45fba801bb66d9300943432", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "061175efa45fba801bb66d9300943432");
                return;
            }
            this.d = context;
            this.c = jVar;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a6a8c85dcffe92ef72b2ef82286d0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a6a8c85dcffe92ef72b2ef82286d0a");
                return;
            }
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e59853cb2f2f37eae2e8e758ca6bd40b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e59853cb2f2f37eae2e8e758ca6bd40b");
                return;
            }
            final boolean equals = TextUtils.equals((String) view.getTag(-103), "sticky");
            this.g = view.findViewById(R.id.tab_empty_view);
            this.e = (RecyclerView) view.findViewById(R.id.hot_tab_recyclerView);
            this.b = new LinearLayoutManager(this.d);
            this.b.setOrientation(0);
            this.e.setLayoutManager(this.b);
            this.f = new com.sankuai.waimai.store.goods.list.viewblocks.newuser.f(this.d, this.c, equals, (com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o);
            this.e.setAdapter(this.f);
            this.e.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.c.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    LinearLayoutManager linearLayoutManager;
                    int findFirstVisibleItemPosition;
                    View findViewByPosition;
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae7ee9e03909d85e73d9815086ab2baa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae7ee9e03909d85e73d9815086ab2baa");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i != 0 || recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager) || (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition()) < 0 || (findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition)) == null) {
                        return;
                    }
                    Rect rect = new Rect();
                    findViewByPosition.getLocalVisibleRect(rect);
                    ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) c.this.o).a(findFirstVisibleItemPosition, findViewByPosition.getWidth() - rect.width(), equals);
                    if (equals) {
                        com.meituan.android.bus.a.a().c(new SGNewUserStickEvent());
                    }
                }
            });
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            View view;
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3706e6192b1fa9932b05a1dba9f7ee3", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3706e6192b1fa9932b05a1dba9f7ee3");
            }
            try {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_new_user_land_hotproduct_tab, viewGroup, false);
            } catch (Exception e) {
                e = e;
                view = null;
            }
            try {
                view.setTag(-103, viewGroup.getTag(-103));
            } catch (Exception e2) {
                e = e2;
                com.sankuai.shangou.stone.util.log.a.a(e);
                return view;
            }
            return view;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g, com.sankuai.waimai.store.newwidgets.list.h
        public final void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ec64dd74938e54e2f1b08e631dab984", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ec64dd74938e54e2f1b08e631dab984");
            } else {
                super.g();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
        public static ChangeQuickRedirect f;
        public com.sankuai.waimai.store.goods.list.viewblocks.newuser.a g;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public void a(@NonNull View view) {
        }

        public e(com.sankuai.waimai.store.goods.list.viewblocks.newuser.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf17b48677e5e2c8c477d706407cba1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf17b48677e5e2c8c477d706407cba1");
            } else {
                this.g = aVar;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c83609a5961ce60525d0d98ce28f929", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c83609a5961ce60525d0d98ce28f929");
            } else {
                this.g.a(bVar, i);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = f;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e836774eacd6f5dc73597fcf73e3854", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e836774eacd6f5dc73597fcf73e3854") : this.g.createView(viewGroup);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g, com.sankuai.waimai.store.newwidgets.list.h
        public void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f3e0ab5e4f9b3cb1d69e6da76ae144", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f3e0ab5e4f9b3cb1d69e6da76ae144");
            } else if (this.g != null) {
                com.sankuai.waimai.store.goods.list.viewblocks.newuser.a aVar = this.g;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.newuser.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1042477229fd220fb9baba31a9151dd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1042477229fd220fb9baba31a9151dd8");
                } else if (aVar.b == null || aVar.b.b() == null) {
                } else {
                    aVar.b.b().b(aVar.c);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class d extends e {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.store.widgets.filterbar.home.a b;
        public Context c;
        public View d;

        public d(com.sankuai.waimai.store.goods.list.viewblocks.newuser.a aVar, Context context) {
            super(aVar);
            Object[] objArr = {SGNewUserLandAdapter.this, aVar, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27421646e345aca9ecc101facf12fff1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27421646e345aca9ecc101facf12fff1");
            } else {
                this.c = context;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.e, com.sankuai.waimai.store.newwidgets.list.g
        public final void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49b0904dd58ac8dc7920b0883d2ed20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49b0904dd58ac8dc7920b0883d2ed20");
            } else if (bVar == null || bVar.t == null || bVar.t.jsonData == null) {
            } else {
                if (bVar.q == 10 && TextUtils.equals((String) this.d.getTag(-103), "sticky")) {
                    bVar.t.jsonData.put("layoutType", "SMALL");
                    if (this.b != null) {
                        this.b.a(bVar.t, 0, true);
                        return;
                    }
                    return;
                }
                bVar.t.jsonData.put("layoutType", "TALL");
                this.g.a(bVar, i);
                if (bVar.m == null || bVar.m.size() <= 0) {
                    return;
                }
                com.sankuai.waimai.store.goods.list.viewblocks.newuser.a aVar = this.g;
                Map<String, Object> map = bVar.m;
                Object[] objArr2 = {"newUsercouponStatusChanged", map};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.newuser.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4c321a3667b44c2a000ee6bf919b5ddb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4c321a3667b44c2a000ee6bf919b5ddb");
                } else if (aVar.c == null || aVar.c.l() == null) {
                } else {
                    aVar.c.l().sendJsEvent("newUsercouponStatusChanged", map);
                }
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.e, com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            this.d = view;
        }

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.e, com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab2c9e853dc6b897daca29ab60c67d8", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab2c9e853dc6b897daca29ab60c67d8");
            }
            if (TextUtils.equals((String) viewGroup.getTag(-103), "sticky")) {
                if (this.b == null) {
                    this.b = new com.sankuai.waimai.store.widgets.filterbar.home.a(this.c, new com.sankuai.waimai.store.param.a());
                }
                return this.b.a();
            }
            return this.g.createView(viewGroup);
        }

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.e, com.sankuai.waimai.store.newwidgets.list.g, com.sankuai.waimai.store.newwidgets.list.h
        public final void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8514847a9bd449869256d5c3a4562248", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8514847a9bd449869256d5c3a4562248");
                return;
            }
            super.g();
            if (this.b == null || this.d == null || !TextUtils.equals((String) this.d.getTag(-103), "sticky")) {
                return;
            }
            this.b.b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
        public static ChangeQuickRedirect a;
        private ItemBlock b;
        private Drawable c;
        private Drawable d;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_new_user_land_cent_item;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, int i) {
            com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c238d070fb204a075126b9ea6275917", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c238d070fb204a075126b9ea6275917");
                return;
            }
            this.b.setContract((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o);
            this.b.setData(bVar2);
            if (bVar2.k) {
                bVar2.k = false;
                this.b.showPriceAnimation();
            }
        }

        public a(Context context, j jVar) {
            Object[] objArr = {context, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6935fdd26d4df6a0f66fd4d0a1028a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6935fdd26d4df6a0f66fd4d0a1028a");
                return;
            }
            this.c = new e.a().a(com.sankuai.shangou.stone.util.h.a(context, 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(context, R.color.wm_sg_color_FFE14D), ContextCompat.getColor(context, R.color.wm_sg_color_FFC34D)}).a();
            this.d = new e.a().a(com.sankuai.shangou.stone.util.h.a(context, 4.0f)).c(ContextCompat.getColor(context, R.color.wm_sg_color_FAFAFA)).a();
            this.b = new ItemBlock(context, jVar, this.c, this.d);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d1cdc3c3ee694b5d7dfa63b1d9a9a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d1cdc3c3ee694b5d7dfa63b1d9a9a8");
            } else {
                this.b.initView(view);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
        public static ChangeQuickRedirect a;
        private ItemBlock b;
        private Drawable c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_new_user_land_detonate_item;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, int i) {
            com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec46e668d1275de43c75e8ceffae335e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec46e668d1275de43c75e8ceffae335e");
                return;
            }
            this.b.setContract((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o);
            this.b.setData(bVar2);
            if (bVar2.k) {
                bVar2.k = false;
                this.b.showPriceAnimation();
            }
        }

        public b(Context context, j jVar) {
            Object[] objArr = {context, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9123c6babd8a36dd3dcfa19c0454000b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9123c6babd8a36dd3dcfa19c0454000b");
                return;
            }
            this.c = new e.a().a(com.sankuai.shangou.stone.util.h.a(context, 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(context, R.color.wm_sg_color_FFE14D), ContextCompat.getColor(context, R.color.wm_sg_color_FFC34D)}).a();
            this.b = new ItemBlock(context, jVar, this.c, null);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8779f5530b8b165cf8ae00d78b5159", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8779f5530b8b165cf8ae00d78b5159");
            } else {
                this.b.initView(view);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class f extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b, com.sankuai.waimai.store.goods.list.viewblocks.newuser.e> {
        public static ChangeQuickRedirect a;
        int b;
        j c;
        public LinearLayout d;
        public TextView e;
        public LinearLayout f;
        public Drawable g;
        public ImageView h;
        public com.sankuai.waimai.store.expose.v2.entity.b i;
        public View j;
        private Context k;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_new_user_land_more;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, final int i) {
            com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc5178162254cfc96cb8ae46f2c5dc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc5178162254cfc96cb8ae46f2c5dc7");
                return;
            }
            u.c(this.j);
            this.d.setOnClickListener(new com.sankuai.waimai.store.widgets.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81d3fb6e4809218585079f44e47f806f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81d3fb6e4809218585079f44e47f806f");
                        return;
                    }
                    if (f.this.c != null && ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) f.this.o).n()) {
                        f.this.c.a(f.this.b, i);
                    } else {
                        am.a(view, "数据加载中，请稍后重试");
                    }
                    if (((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) f.this.o).r() != null) {
                        com.sankuai.waimai.store.manager.judas.b.a(((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) f.this.o).r().b(), com.sankuai.waimai.store.manager.judas.b.a((Object) ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) f.this.o).r()), "b_waimai_checkmore_mc").a("source_id", ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) f.this.o).s()).a(ShowLogJsHandler.PARAM_NAME_MODULE, Integer.valueOf(f.this.b)).a();
                    }
                }
            }));
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            HashMap<String, Object> p = ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o).p();
            if (p == null) {
                u.c(this.d);
            } else {
                if (this.b == h.m) {
                    u.a((View) this.d, SGNewUserLandAdapter.a(p, "major_ids") ? 8 : 0);
                    layoutParams.height = this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                    if (bVar2.o) {
                        this.d.setBackground(this.g);
                        u.a(this.j);
                    } else {
                        this.d.setBackgroundColor(this.k.getResources().getColor(R.color.wm_st_common_white));
                    }
                } else if (this.b == h.n) {
                    u.a((View) this.d, SGNewUserLandAdapter.a(p, "detonate_ids") ? 8 : 0);
                    layoutParams.height = this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                    this.d.setBackground(this.g);
                    u.a(this.j);
                } else if (this.b == h.o) {
                    u.a((View) this.d, SGNewUserLandAdapter.a(p, "triple_ids") ? 8 : 0);
                    layoutParams.height = this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50);
                    this.d.setBackgroundColor(this.k.getResources().getColor(R.color.wm_st_common_white));
                } else if (this.b == h.q) {
                    u.a((View) this.d, ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o).q() ? 0 : 8);
                    layoutParams.height = this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                    u.a(this.j);
                    this.d.setBackground(this.g);
                } else if (this.b == h.p) {
                    u.a((View) this.d, SGNewUserLandAdapter.a(p, "other_triple_ids") ? 8 : 0);
                    layoutParams.height = this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50);
                    this.d.setBackgroundColor(this.k.getResources().getColor(R.color.wm_st_common_white));
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("source_id", ((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o).s());
            hashMap.put(ShowLogJsHandler.PARAM_NAME_MODULE, Integer.valueOf(this.b));
            this.i.b(hashMap);
            com.sankuai.waimai.store.expose.v2.b.a().a(((com.sankuai.waimai.store.goods.list.viewblocks.newuser.e) this.o).r(), this.i);
            this.d.setLayoutParams(layoutParams);
        }

        public f(int i, j jVar, Context context) {
            Object[] objArr = {Integer.valueOf(i), jVar, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d4864f6f6b11fee6a9b6f0e1f4cd97", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d4864f6f6b11fee6a9b6f0e1f4cd97");
                return;
            }
            this.b = i;
            this.c = jVar;
            this.k = context;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b94e68ef35598c8b658feb35612b7c47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b94e68ef35598c8b658feb35612b7c47");
                return;
            }
            this.j = view.findViewById(R.id.view_empty);
            this.d = (LinearLayout) view.findViewById(R.id.ll_more);
            this.e = (TextView) view.findViewById(R.id.tv_more);
            this.h = (ImageView) view.findViewById(R.id.iv_down_arrow);
            this.f = (LinearLayout) view.findViewById(R.id.ll_more_container);
            this.g = new e.a().a(0.0f, 0.0f, com.sankuai.shangou.stone.util.h.a(this.k, 12.0f), com.sankuai.shangou.stone.util.h.a(this.k, 12.0f)).a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(this.k, R.color.wm_st_common_white), ContextCompat.getColor(this.k, R.color.wm_st_common_white)}).a();
            this.h.setImageDrawable(com.sankuai.waimai.store.view.a.a(view.getContext(), R.dimen.wm_sc_common_dimen_8, R.dimen.wm_sc_common_dimen_4, R.color.wm_sc_color_222426, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.DOWN));
            this.i = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_checkmore_mv", this.e);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static class ItemBlock extends com.sankuai.waimai.store.base.b {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Drawable deliveryBg;
        private LinearLayout deliveryBgView;
        private int interval;
        private View itemBg;
        private ImageView ivNewUserPicture;
        private UniversalImageView ivPicture;
        private RoundedCornerImageView ivPoiPicture;
        private FrameLayout llContainer;
        private com.sankuai.waimai.store.goods.list.viewblocks.newuser.e mContract;
        private double originPrice;
        private int padding4;
        private int padding5;
        private int padding8;
        private double price;
        private View rootView;
        private SCSingleLineFlowLayout singleLineFlowLayout;
        private Drawable submitBg;
        private TextView tvName;
        private TextView tvOriginPrice;
        private TextView tvPoiName;
        private TextView tvPrice;
        private TextView tvPriceSmall;
        private TextView tvSubmit;
        private TextView tvTime;
        private j userViewHolderListener;

        public ItemBlock(@NonNull Context context, j jVar, Drawable drawable, Drawable drawable2) {
            super(context);
            Object[] objArr = {context, jVar, drawable, drawable2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "977e104665b3f7824d4545b5d03d3b86", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "977e104665b3f7824d4545b5d03d3b86");
                return;
            }
            this.userViewHolderListener = jVar;
            this.submitBg = drawable;
            this.deliveryBg = drawable2;
            this.padding8 = com.sankuai.shangou.stone.util.h.a(getContext(), 8.0f);
            this.padding4 = com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f);
            this.padding5 = com.sankuai.shangou.stone.util.h.a(getContext(), 5.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContract(com.sankuai.waimai.store.goods.list.viewblocks.newuser.e eVar) {
            this.mContract = eVar;
        }

        public void initView(@NotNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21134b5df6c9eb6e92e30da8437ddee9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21134b5df6c9eb6e92e30da8437ddee9");
                return;
            }
            this.rootView = view;
            this.ivPicture = (UniversalImageView) view.findViewById(R.id.iv_sg_new_user_picture);
            this.tvName = (TextView) view.findViewById(R.id.tv_sg_new_user_name);
            this.tvSubmit = (TextView) view.findViewById(R.id.tv_sg_new_user_submit);
            this.tvPoiName = (TextView) view.findViewById(R.id.tv_sg_new_user_poi_name);
            this.ivPoiPicture = (RoundedCornerImageView) view.findViewById(R.id.iv_sg_new_user_poi_icon);
            this.tvTime = (TextView) view.findViewById(R.id.tv_sg_new_user_poi_time);
            this.tvPrice = (TextView) view.findViewById(R.id.tv_price);
            this.tvOriginPrice = (TextView) view.findViewById(R.id.tv_origin_price);
            this.tvPriceSmall = (TextView) view.findViewById(R.id.tv_price_small);
            this.llContainer = (FrameLayout) view.findViewById(R.id.ll_container);
            this.singleLineFlowLayout = (SCSingleLineFlowLayout) view.findViewById(R.id.label_flow_layout);
            this.deliveryBgView = (LinearLayout) view.findViewById(R.id.delivery_view_bg);
            this.itemBg = view.findViewById(R.id.item_bg);
        }

        private Map<String, Object> getExposeParams(com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar, GoodsSpu goodsSpu, GoodsSku goodsSku, SGNewUserLandResponse.SGNewUserItemData sGNewUserItemData) {
            String str;
            Object[] objArr = {bVar, goodsSpu, goodsSku, sGNewUserItemData};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88a469c3db8d52f5e073c521a90d1ebd", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88a469c3db8d52f5e073c521a90d1ebd");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", t.a(sGNewUserItemData.poiID) ? "-999" : sGNewUserItemData.poiID);
            hashMap.put("index", Integer.valueOf(bVar.c));
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put("sku_id", Long.valueOf(goodsSku.id));
            hashMap.put("current_price", Double.valueOf(goodsSku.price));
            hashMap.put(ShowLogJsHandler.PARAM_NAME_MODULE, Integer.valueOf(bVar.f));
            hashMap.put("type", Integer.valueOf(goodsSpu.skuType));
            hashMap.put("st_id", bVar.d);
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, sGNewUserItemData.poiIdStr);
            hashMap.put("source_id", bVar.e);
            try {
                str = String.valueOf(new BigDecimal(goodsSpu.recall).longValue());
            } catch (Throwable unused) {
                str = "-999";
            }
            hashMap.put("recall", str);
            hashMap.put("undertake", this.mContract.t());
            return hashMap;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0186 -> B:96:0x0187). Please submit an issue!!! */
        public void setData(final com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2360a3a35d8406e352ac6aea70ca13fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2360a3a35d8406e352ac6aea70ca13fd");
            } else if (bVar == null || bVar.t == null) {
            } else {
                com.sankuai.waimai.store.goods.list.utils.e.a(this.itemBg, this.mContext, bVar.l);
                this.interval = 0;
                if (this.llContainer != null && (bVar.q == 5 || bVar.q == 15)) {
                    if (bVar.c >= 0 && bVar.c % 2 == 0) {
                        this.llContainer.setPadding(this.padding8, this.padding5, this.padding4, this.padding5);
                    } else {
                        this.llContainer.setPadding(this.padding4, this.padding5, this.padding8, this.padding5);
                    }
                }
                final SGNewUserLandResponse.SGNewUserItemData sGNewUserItemData = (SGNewUserLandResponse.SGNewUserItemData) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(bVar.t.jsonData), SGNewUserLandResponse.SGNewUserItemData.class);
                if (sGNewUserItemData == null || com.sankuai.shangou.stone.util.a.b(sGNewUserItemData.spus)) {
                    return;
                }
                if (!t.a(sGNewUserItemData.poiID)) {
                    try {
                        sGNewUserItemData.poiID = String.valueOf(new BigDecimal(sGNewUserItemData.poiID).longValue());
                    } catch (Throwable unused) {
                    }
                }
                GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) sGNewUserItemData.spus, 0);
                if (goodsSpu == null) {
                    return;
                }
                if (bVar.f == h.m) {
                    com.sankuai.waimai.store.view.standard.a.a(this.tvName, t.a(goodsSpu.name) ? "" : goodsSpu.name, goodsSpu.getGoodsLabelUrl(), 0, com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f));
                } else {
                    u.a(this.tvName, goodsSpu.name);
                }
                u.a(this.tvPoiName, sGNewUserItemData.name);
                u.a(this.tvTime, sGNewUserItemData.deliveryTimeTip);
                GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
                if (goodsSku != null) {
                    if (this.tvOriginPrice != null) {
                        this.originPrice = goodsSku.originPrice;
                        this.tvOriginPrice.setText(this.mContext.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(goodsSku.originPrice)));
                        this.tvOriginPrice.getPaint().setFlags(17);
                    }
                    try {
                        this.price = goodsSku.price;
                        if (this.tvPriceSmall != null) {
                            String[] split = String.valueOf(goodsSku.price).split("\\.");
                            if (split.length > 1) {
                                TextView textView = this.tvPrice;
                                u.a(textView, split[0] + CommonConstant.Symbol.DOT);
                                TextView textView2 = this.tvPrice;
                                u.a(textView2, split[0] + CommonConstant.Symbol.DOT);
                                u.a(this.tvPriceSmall, split[1]);
                            } else {
                                u.a(this.tvPrice, String.valueOf(com.sankuai.shangou.stone.util.i.a(goodsSku.price)));
                            }
                        } else {
                            u.a(this.tvPrice, String.valueOf(com.sankuai.shangou.stone.util.i.a(goodsSku.price)));
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (this.ivPicture != null) {
                    b.C0608b b = m.b(goodsSpu.getPicture(), ImageQualityUtil.b());
                    b.j = R.drawable.wm_sc_common_poi_error;
                    b.i = R.drawable.wm_sc_common_loading_large;
                    b.a((ImageView) this.ivPicture);
                }
                if (this.ivPoiPicture != null) {
                    b.C0608b b2 = m.b(sGNewUserItemData.picUrl, ImageQualityUtil.b());
                    b2.j = R.drawable.wm_sc_common_poi_error;
                    b2.i = R.drawable.wm_sc_common_loading_large;
                    b2.a((ImageView) this.ivPoiPicture);
                }
                if (this.tvSubmit != null && this.submitBg != null) {
                    this.tvSubmit.setBackground(this.submitBg);
                }
                if (this.deliveryBgView != null && this.deliveryBg != null) {
                    this.deliveryBgView.setBackground(this.deliveryBg);
                }
                final Map<String, Object> exposeParams = getExposeParams(bVar, goodsSpu, goodsSku, sGNewUserItemData);
                com.sankuai.waimai.store.expose.v2.entity.b bVar2 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_baopin_mv", this.llContainer);
                bVar2.b(exposeParams);
                bVar2.e = sGNewUserItemData.poiID + CommonConstant.Symbol.UNDERLINE + sGNewUserItemData.poiIdStr + CommonConstant.Symbol.UNDERLINE + bVar.b;
                com.sankuai.waimai.store.expose.v2.b.a().a(this.mContract.r(), bVar2);
                if (this.llContainer != null && this.userViewHolderListener != null) {
                    this.llContainer.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.ItemBlock.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "abee9b62ca36da0809e1f3d18428248d", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "abee9b62ca36da0809e1f3d18428248d");
                                return;
                            }
                            com.sankuai.waimai.store.manager.judas.b.a(ItemBlock.this.mContract.r().b(), com.sankuai.waimai.store.manager.judas.b.a((Object) ItemBlock.this.mContract.r()), "b_waimai_baopin_mc").b(exposeParams).a();
                            ItemBlock.this.userViewHolderListener.a(sGNewUserItemData, bVar.j);
                        }
                    });
                }
                if (this.singleLineFlowLayout != null) {
                    this.singleLineFlowLayout.removeAllViews();
                    if (!t.a(goodsSpu.promotionInfo)) {
                        this.singleLineFlowLayout.addView(getTextViewLabel(this.mContext, goodsSpu.promotionInfo));
                    }
                    if (com.sankuai.shangou.stone.util.a.b(goodsSpu.labelInfoList)) {
                        return;
                    }
                    Iterator<PoiLabelInfoListItem> it = goodsSpu.labelInfoList.iterator();
                    while (it.hasNext()) {
                        PoiLabelInfoListItem next = it.next();
                        if (next != null && !t.a(next.content)) {
                            this.singleLineFlowLayout.addView(getTextViewLabel(this.mContext, next.content));
                        }
                    }
                }
            }
        }

        private TextView getTextViewLabel(Context context, @NotNull String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91eb93ce2b7d9714786afba7977f8a3a", RobustBitConfig.DEFAULT_VALUE)) {
                return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91eb93ce2b7d9714786afba7977f8a3a");
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2);
            TextView textView = new TextView(context);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_11));
            textView.setIncludeFontPadding(false);
            textView.setGravity(17);
            int i = dimensionPixelSize * 2;
            textView.setPadding(i, 1, i, 1);
            textView.setText(str);
            textView.setTextColor(context.getResources().getColor(R.color.wm_sg_color_FB4E44));
            textView.setBackground(new e.a().a(context.getResources().getColor(R.color.wm_sg_color_FB4E44)).b(1).a(context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).a());
            return textView;
        }

        public void showPriceAnimation() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "855b94843f2ecf49b52db6dc50726a51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "855b94843f2ecf49b52db6dc50726a51");
            } else if (this.price <= 0.0d || this.originPrice <= 0.0d) {
            } else {
                final float a = r.a(com.sankuai.shangou.stone.util.i.a(this.price), -1.0f);
                float a2 = r.a(com.sankuai.shangou.stone.util.i.a(this.originPrice), -1.0f);
                if (a <= 0.0f || a2 <= 0.0f) {
                    return;
                }
                u.c(this.tvOriginPrice);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "price", a2, a);
                ofFloat.setDuration(1500L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter.ItemBlock.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a9bc467f9274214abeeeab9772a8f954", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a9bc467f9274214abeeeab9772a8f954");
                            return;
                        }
                        ItemBlock.this.setPrice(a);
                        if (ItemBlock.this.tvOriginPrice != null) {
                            u.a(ItemBlock.this.tvOriginPrice);
                            ItemBlock.this.tvOriginPrice.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L).start();
                        }
                    }
                });
                ofFloat.start();
            }
        }

        public void setPrice(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c539dc5872a0792b4fda0e38f763c97", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c539dc5872a0792b4fda0e38f763c97");
                return;
            }
            this.interval++;
            double d = f;
            if ((d <= this.price || this.interval % 3 == 0) && f > 0.0f) {
                try {
                    if (this.tvPriceSmall != null) {
                        String[] split = com.sankuai.shangou.stone.util.i.a(d).split("\\.");
                        if (split.length > 1) {
                            u.a(this.tvPrice, split[0] + CommonConstant.Symbol.DOT);
                            u.a(this.tvPrice, split[0] + CommonConstant.Symbol.DOT);
                            u.a(this.tvPriceSmall, split[1]);
                            return;
                        }
                        u.a(this.tvPrice, String.valueOf(com.sankuai.shangou.stone.util.i.a(d)));
                        return;
                    }
                    u.a(this.tvPrice, String.valueOf(com.sankuai.shangou.stone.util.i.a(d)));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final int b(int i) {
        com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1642d723d4a6f19ce40d9241e3d98ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1642d723d4a6f19ce40d9241e3d98ce")).intValue();
        }
        if (i == -1 || this.j == null || (bVar = (com.sankuai.waimai.store.goods.list.viewblocks.newuser.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, i)) == null) {
            return -1;
        }
        return this.d.b(bVar.q, this.f);
    }

    public final int c(int i) {
        com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1471693763285fb2116f2f270ecd00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1471693763285fb2116f2f270ecd00")).intValue();
        }
        if (i == -1 || this.j == null || (bVar = (com.sankuai.waimai.store.goods.list.viewblocks.newuser.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, i)) == null) {
            return -1;
        }
        return this.d.a(bVar.q, (List<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b>) this.f);
    }

    public final int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a7a82b8480b48af4266534e7762470", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a7a82b8480b48af4266534e7762470")).intValue();
        }
        if (i < 0 || this.d == null) {
            return -1;
        }
        return this.d.a(i);
    }

    public final int f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bca0b84d315a1d27bfe12a91f5778a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bca0b84d315a1d27bfe12a91f5778a4")).intValue();
        }
        if (i < 0 || this.d == null) {
            return -1;
        }
        SGNewUserAnchorUtils sGNewUserAnchorUtils = this.d;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = SGNewUserAnchorUtils.a;
        if (PatchProxy.isSupport(objArr2, sGNewUserAnchorUtils, changeQuickRedirect2, false, "5519c86793c46293f72f86c24067e0b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, sGNewUserAnchorUtils, changeQuickRedirect2, false, "5519c86793c46293f72f86c24067e0b2")).intValue();
        }
        if (sGNewUserAnchorUtils.b.size() > 0) {
            SGNewUserAnchorUtils.SecondStickyModel secondStickyModel = sGNewUserAnchorUtils.b.get(Integer.valueOf(i));
            if (secondStickyModel.nextStickViewTypes != null && secondStickyModel.nextStickViewTypes.length > 0) {
                return secondStickyModel.nextStickViewTypes[0];
            }
        }
        return -1;
    }

    public static boolean a(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa05688aaa30ca8b5c8105911965e3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa05688aaa30ca8b5c8105911965e3c")).booleanValue();
        }
        if (hashMap == null || hashMap.size() <= 0) {
            return true;
        }
        try {
            if (hashMap.get(str) instanceof List) {
                if (!com.sankuai.shangou.stone.util.a.b((List) hashMap.get(str))) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void a(List<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d267e48b8e9327195fbc82d2a94949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d267e48b8e9327195fbc82d2a94949");
            return;
        }
        List<T> list2 = this.f;
        list2.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            list2.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final void b(List<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06a2f53a847ae802fca43e3110b5010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06a2f53a847ae802fca43e3110b5010");
            return;
        }
        List<T> list2 = this.f;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            list2.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final int d(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5bc6f51b1f136e7bce925c73903abc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5bc6f51b1f136e7bce925c73903abc")).intValue();
        }
        if (i <= 0 || com.sankuai.shangou.stone.util.a.b(this.f)) {
            return -1;
        }
        while (i2 < com.sankuai.shangou.stone.util.a.c(this.f)) {
            com.sankuai.waimai.store.goods.list.viewblocks.newuser.b bVar = (com.sankuai.waimai.store.goods.list.viewblocks.newuser.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, i2);
            if ((bVar.q == 4 && i2 == 0 && i == 1) || bVar.q == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
