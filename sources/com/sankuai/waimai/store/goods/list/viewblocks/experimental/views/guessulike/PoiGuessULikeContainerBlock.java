package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.SCViewPagerCompat;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiGuessULikeContainerBlock extends com.sankuai.waimai.store.base.b implements a.InterfaceC1266a {
    public static ChangeQuickRedirect a;
    public SCViewPagerCompat b;
    public PoiGuessULikePagerAdapter c;
    public int d;
    public NetInfoLoadView e;
    private com.sankuai.waimai.store.goods.list.delegate.e f;
    private FrameLayout g;
    private h h;
    private final com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a i;
    private View j;
    private TextView k;

    @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
    public final void a(boolean z) {
    }

    @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
    public final void b(boolean z) {
    }

    public PoiGuessULikeContainerBlock(Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar) {
        super(context);
        Object[] objArr = {context, eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c05849799e8456e450f1f93d95957f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c05849799e8456e450f1f93d95957f");
            return;
        }
        this.f = eVar;
        this.i = aVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafda85e9731e43c81ef6a90eb62feca", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafda85e9731e43c81ef6a90eb62feca") : layoutInflater.inflate(R.layout.wm_sc_poi_guess_u_like_container, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1021b9b611702cb13ea9b4075912b768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1021b9b611702cb13ea9b4075912b768");
            return;
        }
        super.onViewCreated();
        com.meituan.android.bus.a.a().a(this);
        this.g = (FrameLayout) this.mView.findViewById(R.id.fl_poi_category_container);
        this.e = (NetInfoLoadView) this.mView.findViewById(R.id.net_info_load_view);
        this.e.b();
        this.e.setBackgroundResource(R.color.wm_sg_color_F5F5F6);
        this.b = (SCViewPagerCompat) this.mView.findViewById(R.id.viewpager_content);
        this.c = new PoiGuessULikePagerAdapter(this.mContext, this.f, this.i, this);
        this.b.setAdapter(this.c);
        this.b.setViewTouchMode(true);
        this.b.setCurrentItem(this.d);
        this.b.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.PoiGuessULikeContainerBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71110dfee1f58ae6520e6fc9524b1511", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71110dfee1f58ae6520e6fc9524b1511");
                } else if (PoiGuessULikeContainerBlock.this.h != null) {
                    PoiGuessULikeContainerBlock.this.h.a(i);
                }
            }
        });
        this.j = findView(R.id.floor_title_container);
        this.k = (TextView) findView(R.id.wm_sc_tv_floor_title);
    }

    private boolean a(List<PoiGuessULikeSpuTag> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93b270d671d4c7dc47d3bca0d519510", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93b270d671d4c7dc47d3bca0d519510")).booleanValue() : com.sankuai.shangou.stone.util.a.a((List) list) > 1;
    }

    public void a(MarketGuessResponse marketGuessResponse, List<PoiGuessULikeSpuTag> list) {
        Object[] objArr = {marketGuessResponse, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff43f9cd8c6958da6fe0e611b09307a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff43f9cd8c6958da6fe0e611b09307a");
        } else if (marketGuessResponse != null) {
            if (a(list)) {
                if (this.h == null) {
                    this.h = new h(this.mContext);
                    this.h.createAndReplaceView(this.g);
                }
                this.h.a(list, this.d);
                u.a(this.g);
                u.c(this.j);
                return;
            }
            u.a(this.j);
            u.c(this.g);
            u.a(this.k, !t.a(marketGuessResponse.b) ? marketGuessResponse.b : getContext().getString(R.string.wm_sc_shop_guess_like));
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945a60a94bab4a8ee5ebdc514c5460e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945a60a94bab4a8ee5ebdc514c5460e1");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            PoiGuessULikePagerAdapter poiGuessULikePagerAdapter = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PoiGuessULikePagerAdapter.a;
            if (PatchProxy.isSupport(objArr2, poiGuessULikePagerAdapter, changeQuickRedirect2, false, "d15c7bdc71f542f6f018f3a44ef197e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiGuessULikePagerAdapter, changeQuickRedirect2, false, "d15c7bdc71f542f6f018f3a44ef197e5");
            } else {
                for (e eVar : poiGuessULikePagerAdapter.c) {
                    if (eVar != null) {
                        eVar.onDestroy();
                    }
                }
            }
        }
        com.meituan.android.bus.a.a().b(this);
    }

    @Subscribe
    public void onTabChanged(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "192afa59b1524f6416f2cf2422890944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "192afa59b1524f6416f2cf2422890944");
        } else if (bVar != null) {
            this.b.setCurrentItem(bVar.b);
        }
    }

    @Subscribe
    public void onScrollToTop(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a70846a06f5a399e7338f2612f45817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a70846a06f5a399e7338f2612f45817");
        } else if (aVar != null && this.c != null) {
            PoiGuessULikePagerAdapter poiGuessULikePagerAdapter = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PoiGuessULikePagerAdapter.a;
            if (PatchProxy.isSupport(objArr2, poiGuessULikePagerAdapter, changeQuickRedirect2, false, "7f8a483e420dbec0268363e339e30ae2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiGuessULikePagerAdapter, changeQuickRedirect2, false, "7f8a483e420dbec0268363e339e30ae2");
            } else if (!com.sankuai.shangou.stone.util.a.b(poiGuessULikePagerAdapter.c)) {
                for (e eVar : poiGuessULikePagerAdapter.c) {
                    if (eVar != null) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = e.a;
                        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "85aedaf0d5c4f9a28241acfaafc5569c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "85aedaf0d5c4f9a28241acfaafc5569c");
                        } else if (eVar.b != null) {
                            eVar.b.a();
                        }
                    }
                }
            }
        }
    }
}
