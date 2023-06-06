package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.drug.goods.list.adapter.DrugComposeShopPageAdapter;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.view.standard.FlashTab;
import com.sankuai.waimai.store.view.standard.FlashTabLayout;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugComposeShopPageBlock extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect c;
    private LinearLayout a;
    private ViewPager b;
    protected final com.sankuai.waimai.store.drug.goods.list.delegate.d d;
    protected FlashTab e;
    protected RestMenuResponse f;
    private DrugComposeShopPageAdapter g;
    private Map<View, com.sankuai.waimai.store.expose.v2.entity.b> h;
    private boolean i;
    private a j;
    private j k;

    public static /* synthetic */ boolean a(DrugComposeShopPageBlock drugComposeShopPageBlock, boolean z) {
        drugComposeShopPageBlock.i = false;
        return false;
    }

    public DrugComposeShopPageBlock(com.sankuai.waimai.store.drug.goods.list.delegate.d dVar) {
        super(dVar.k());
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67e9fae9cf7475a6f03606b717e1a28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67e9fae9cf7475a6f03606b717e1a28");
            return;
        }
        this.d = dVar;
        this.h = new HashMap();
        this.i = true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269da18635842ff951af07645e0900d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269da18635842ff951af07645e0900d8");
            return;
        }
        super.onViewCreated();
        this.a = (LinearLayout) findView(R.id.ll_drug_shop_native_tab_container);
        if (this.a != null && this.d.k() != null) {
            this.k = new j(this.a, this.d.k());
        }
        this.e = (FlashTab) findView(R.id.wm_sc_standard_shop_content_tab);
        this.b = (ViewPager) findView(R.id.wm_sc_standard_shop_content_pager);
        this.j = new a(this.mContext);
        this.j.createView((LinearLayout) findView(R.id.poi_member_container));
        this.e.setOnTabSelectedListener(new FlashTabLayout.b() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void b(FlashTabLayout.e eVar) {
            }

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void c(FlashTabLayout.e eVar) {
            }

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void a(FlashTabLayout.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "193c09fb996fe309bac787f033689097", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "193c09fb996fe309bac787f033689097");
                } else if (DrugComposeShopPageBlock.this.f == null || eVar == null) {
                } else {
                    RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) DrugComposeShopPageBlock.this.f.navigationBars, eVar.h);
                    if (bVar != null) {
                        if (!DrugComposeShopPageBlock.this.i) {
                            DrugComposeShopPageBlock.this.a(bVar, eVar.h);
                        }
                        DrugComposeShopPageBlock.a(DrugComposeShopPageBlock.this, false);
                    }
                    DrugComposeShopPageBlock.this.b.setCurrentItem(eVar.h);
                }
            }
        });
        this.e.setRelationMove(true);
        this.b.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc02dbf417dacbdbad5aa8b812c84e02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc02dbf417dacbdbad5aa8b812c84e02");
                } else {
                    DrugComposeShopPageBlock.this.e.a(i, f);
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a253d86d9f4043fdd06aed9556aa5858", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a253d86d9f4043fdd06aed9556aa5858");
                    return;
                }
                DrugComposeShopPageBlock.this.d.e().setNestedScrollEnabled(true);
                DrugComposeShopPageBlock.this.e.setSelectIndex(i);
            }
        });
        this.g = a(this.mContext, this.d, this.mContext instanceof FragmentActivity ? ((FragmentActivity) this.mContext).getSupportFragmentManager() : null);
        this.b.setAdapter(this.g);
        com.meituan.android.bus.a.a().a(this);
    }

    public void a(RestMenuResponse.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4123a491fc12a6a4ceef3bf52107b70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4123a491fc12a6a4ceef3bf52107b70d");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.d.k(), "b_waimai_sg_qib1vrgi_mc").a("poi_id", this.d.d().d()).a("title", bVar.b).a("index", Integer.valueOf(i)).a();
        }
    }

    public DrugComposeShopPageAdapter a(Context context, com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, FragmentManager fragmentManager) {
        Object[] objArr = {context, dVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f88c14fdd06a620326ce838b67f02ec", RobustBitConfig.DEFAULT_VALUE) ? (DrugComposeShopPageAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f88c14fdd06a620326ce838b67f02ec") : new DrugComposeShopPageAdapter(context, dVar, fragmentManager);
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58a0de58006ce08b181c71df2c0f57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58a0de58006ce08b181c71df2c0f57b");
            return;
        }
        a aVar = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5e390fe7fe6aaf9c1444414a23c5b8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5e390fe7fe6aaf9c1444414a23c5b8da");
        } else if (aVar.b) {
            u.a(aVar.mView);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8dd72e8e9ccab7474b635a148012968", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8dd72e8e9ccab7474b635a148012968") : layoutInflater.inflate(R.layout.wm_drug_shop_content_drug_compose_page_block, viewGroup, false);
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51293592c4f4288dcb1f4735ad56440c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51293592c4f4288dcb1f4735ad56440c");
        } else if (restMenuResponse != null) {
            this.f = restMenuResponse;
            Object[] objArr2 = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "799e3a354e1ce1fdd9b07ba5c96809aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "799e3a354e1ce1fdd9b07ba5c96809aa");
            } else {
                int a = com.sankuai.shangou.stone.util.a.a((List) restMenuResponse.navigationBars);
                CharSequence[] charSequenceArr = new CharSequence[a];
                int i = 0;
                for (int i2 = 0; i2 < a; i2++) {
                    RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) restMenuResponse.navigationBars, i2);
                    if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
                        if (bVar.c == 6 && bVar.f != null && !TextUtils.isEmpty(bVar.f.commentCount)) {
                            SpannableString spannableString = new SpannableString(bVar.b + bVar.f.commentCount);
                            spannableString.setSpan(new AbsoluteSizeSpan(this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_11)), bVar.b.length(), bVar.b.length() + bVar.f.commentCount.length(), 34);
                            charSequenceArr[i2] = spannableString;
                        } else {
                            charSequenceArr[i2] = bVar.b;
                            if (bVar.d) {
                                i = i2;
                            }
                        }
                    }
                }
                final List<RestMenuResponse.b> list = restMenuResponse.navigationBars;
                this.e.setTabCreateListener(new FlashTabLayout.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.a
                    public final void a(View view, int i3) {
                        RestMenuResponse.b bVar2;
                        Object[] objArr3 = {view, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb481003603a754ddeed3dfdb53a2a96", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb481003603a754ddeed3dfdb53a2a96");
                        } else if (DrugComposeShopPageBlock.this.d.k() == null || (bVar2 = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i3)) == null) {
                        } else {
                            com.sankuai.waimai.store.expose.v2.entity.b bVar3 = (com.sankuai.waimai.store.expose.v2.entity.b) DrugComposeShopPageBlock.this.h.get(view);
                            if (bVar3 == null) {
                                bVar3 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_qib1vrgi_mv", view);
                                DrugComposeShopPageBlock.this.h.put(view, bVar3);
                                com.sankuai.waimai.store.expose.v2.b.a().a(DrugComposeShopPageBlock.this.d.k(), bVar3);
                            }
                            bVar3.e = i3 + CommonConstant.Symbol.UNDERLINE + bVar2.hashCode();
                            bVar3.a("poi_id", DrugComposeShopPageBlock.this.d.d().d()).a("title", bVar2.b).a("index", Integer.valueOf(i3));
                        }
                    }
                });
                this.e.setTabWidthMeasureCompleteListener(new FlashTabLayout.c() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.c
                    public final void a(int i3) {
                        Object[] objArr3 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b911f62ea111697bf020fd5710600fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b911f62ea111697bf020fd5710600fa");
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = DrugComposeShopPageBlock.this.e.getLayoutParams();
                        layoutParams.width = i3;
                        DrugComposeShopPageBlock.this.e.setLayoutParams(layoutParams);
                    }
                });
                this.e.setScrollModeWithItemMargin(10);
                this.e.setTabs(charSequenceArr);
                DrugComposeShopPageAdapter drugComposeShopPageAdapter = this.g;
                Object[] objArr3 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect3 = DrugComposeShopPageAdapter.a;
                if (PatchProxy.isSupport(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "634895ef49c94f483623bac5dad1103b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "634895ef49c94f483623bac5dad1103b");
                } else {
                    drugComposeShopPageAdapter.b = restMenuResponse;
                    drugComposeShopPageAdapter.c.clear();
                    if (restMenuResponse != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) restMenuResponse.navigationBars)) {
                        drugComposeShopPageAdapter.c.addAll(restMenuResponse.navigationBars);
                    }
                    drugComposeShopPageAdapter.notifyDataSetChanged();
                }
                this.b.setOffscreenPageLimit(charSequenceArr.length - 1);
                this.e.setSelectIndex(i);
                this.b.setCurrentItem(i);
            }
            if (restMenuResponse.getPoi() != null) {
                this.j.a(restMenuResponse.getPoi());
            }
        }
    }

    @Subscribe
    public void clickNavigateItem(com.sankuai.waimai.store.mrn.event.a aVar) {
        RestMenuResponse.NavigateItem navigateItem;
        int i;
        int i2 = 0;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcacbcf703d0c7a8af31d57db6f79e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcacbcf703d0c7a8af31d57db6f79e5d");
        } else if (aVar != null && com.sankuai.waimai.store.platform.domain.manager.poi.a.a(aVar.c, this.d.d().h(), r.a(aVar.b, -1L), this.d.d().g()) && this.d.k().x() && (navigateItem = aVar.a) != null) {
            Object[] objArr2 = {navigateItem};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49c312bdd5c039ad763a98397bed298b", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49c312bdd5c039ad763a98397bed298b")).booleanValue();
            } else if (RestMenuResponse.NavigateItem.isAnchoredNewStrategy(navigateItem.anchoredInfo)) {
                RestMenuResponse.NavigateItem.AnchoredInfo anchoredInfo = navigateItem.anchoredInfo;
                Object[] objArr3 = {anchoredInfo};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0bb52e0dcccee43526ae6a88c5bbb960", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0bb52e0dcccee43526ae6a88c5bbb960")).booleanValue();
                    return;
                }
                DrugComposeShopPageAdapter drugComposeShopPageAdapter = this.g;
                int i3 = anchoredInfo.barIndex;
                Object[] objArr4 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect4 = DrugComposeShopPageAdapter.a;
                if (!PatchProxy.isSupport(objArr4, drugComposeShopPageAdapter, changeQuickRedirect4, false, "ca398895e417725910442ca6b44b740f", RobustBitConfig.DEFAULT_VALUE)) {
                    int a = com.sankuai.shangou.stone.util.a.a((List) drugComposeShopPageAdapter.c);
                    while (true) {
                        if (i2 < a) {
                            RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) drugComposeShopPageAdapter.c, i2);
                            if (bVar != null && bVar.e == i3) {
                                i = i2;
                                break;
                            }
                            i2++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                } else {
                    i = ((Integer) PatchProxy.accessDispatch(objArr4, drugComposeShopPageAdapter, changeQuickRedirect4, false, "ca398895e417725910442ca6b44b740f")).intValue();
                }
                if (i == -1) {
                    return;
                }
                long a2 = r.a(anchoredInfo.id, 0L);
                this.g.b(a2);
                this.b.setCurrentItem(i);
                this.g.a(a2);
            } else if (!RestMenuResponse.NavigateItem.isMoreTag(navigateItem.id)) {
                com.sankuai.waimai.store.router.d.a(this.d.k(), navigateItem.scheme);
            } else {
                int a3 = this.g.a();
                if (a3 == -1) {
                    return;
                }
                this.g.b(navigateItem.id);
                this.b.setCurrentItem(a3);
                this.g.a(navigateItem.id);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ae7728bc4a49d42fb3f18ad9143306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ae7728bc4a49d42fb3f18ad9143306");
            return;
        }
        if (this.b != null) {
            this.b.setAdapter(null);
        }
        com.meituan.android.bus.a.a().b(this);
        if (this.g != null) {
            DrugComposeShopPageAdapter drugComposeShopPageAdapter = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugComposeShopPageAdapter.a;
            if (PatchProxy.isSupport(objArr2, drugComposeShopPageAdapter, changeQuickRedirect2, false, "f2b4fee7b1c9e6cd481601a0d1954fdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugComposeShopPageAdapter, changeQuickRedirect2, false, "f2b4fee7b1c9e6cd481601a0d1954fdf");
            } else if (drugComposeShopPageAdapter.d != null && drugComposeShopPageAdapter.d.size() > 0) {
                for (int i = 0; i < drugComposeShopPageAdapter.d.size(); i++) {
                    com.sankuai.waimai.store.base.b bVar = drugComposeShopPageAdapter.d.get(i);
                    if (bVar != null) {
                        bVar.onDestroy();
                    }
                }
            }
        }
        if (this.k != null) {
            j jVar = this.k;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "4d9b97c893d54a241637128784d23292", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "4d9b97c893d54a241637128784d23292");
            } else {
                jVar.b();
            }
        }
    }

    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb603ad87e53d61850b85c5f436310a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb603ad87e53d61850b85c5f436310a");
        } else if (this.g != null) {
            this.g.a(kVar);
        }
    }
}
