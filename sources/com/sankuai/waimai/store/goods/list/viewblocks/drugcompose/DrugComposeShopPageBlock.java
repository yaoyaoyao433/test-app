package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.goods.list.adapter.DrugComposeShopPageAdapter;
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
    public static ChangeQuickRedirect b;
    private ViewPager a;
    protected final com.sankuai.waimai.store.goods.list.delegate.e c;
    protected FlashTab d;
    protected RestMenuResponse e;
    private DrugComposeShopPageAdapter f;
    private Map<View, com.sankuai.waimai.store.expose.v2.entity.b> g;
    private boolean h;
    private ImageView i;
    private a j;

    public static /* synthetic */ boolean a(DrugComposeShopPageBlock drugComposeShopPageBlock, boolean z) {
        drugComposeShopPageBlock.h = false;
        return false;
    }

    public static /* synthetic */ void c(DrugComposeShopPageBlock drugComposeShopPageBlock) {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, drugComposeShopPageBlock, changeQuickRedirect, false, "3733b64807463e0d31cf3371f9014dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, drugComposeShopPageBlock, changeQuickRedirect, false, "3733b64807463e0d31cf3371f9014dcf");
            return;
        }
        drugComposeShopPageBlock.c.e().b();
        if (drugComposeShopPageBlock.f == null || drugComposeShopPageBlock.e == null) {
            return;
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) drugComposeShopPageBlock.e.navigationBars, drugComposeShopPageBlock.a.getCurrentItem());
        DrugComposeShopPageAdapter drugComposeShopPageAdapter = drugComposeShopPageBlock.f;
        char c = 1;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = DrugComposeShopPageAdapter.a;
        if (PatchProxy.isSupport(objArr2, drugComposeShopPageAdapter, changeQuickRedirect2, false, "e1d592d699cc19bfd52f21a0478fc157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugComposeShopPageAdapter, changeQuickRedirect2, false, "e1d592d699cc19bfd52f21a0478fc157");
        } else if (com.sankuai.shangou.stone.util.a.b(drugComposeShopPageAdapter.d)) {
        } else {
            int i = bVar == null ? -1 : bVar.c;
            int i2 = 0;
            while (i2 < drugComposeShopPageAdapter.d.size()) {
                com.sankuai.waimai.store.base.b bVar2 = drugComposeShopPageAdapter.d.get(i2);
                Object[] objArr3 = new Object[3];
                objArr3[0] = bVar;
                objArr3[c] = Integer.valueOf(i);
                objArr3[2] = bVar2;
                ChangeQuickRedirect changeQuickRedirect3 = DrugComposeShopPageAdapter.a;
                if (PatchProxy.isSupport(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "3e20c415ff0503d510677c3aa05274a7", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "3e20c415ff0503d510677c3aa05274a7")).booleanValue();
                } else {
                    if (bVar2 instanceof f) {
                        f fVar = (f) bVar2;
                        if (bVar2 instanceof e) {
                            if (TextUtils.equals(((e) bVar2).e, bVar != null ? bVar.b : "")) {
                                fVar.bk_();
                                z = true;
                            }
                        } else if (fVar.bl_() == i) {
                            fVar.bk_();
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return;
                }
                i2++;
                c = 1;
            }
        }
    }

    public DrugComposeShopPageBlock(com.sankuai.waimai.store.goods.list.delegate.e eVar) {
        super(eVar.k());
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946b156426691eb3af2a5e6f3eda5d56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946b156426691eb3af2a5e6f3eda5d56");
            return;
        }
        this.c = eVar;
        this.g = new HashMap();
        this.h = true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c47c2c618976e398217e05c92ed21f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c47c2c618976e398217e05c92ed21f5");
            return;
        }
        super.onViewCreated();
        this.d = (FlashTab) findView(R.id.wm_sc_standard_shop_content_tab);
        this.a = (ViewPager) findView(R.id.wm_sc_standard_shop_content_pager);
        this.i = (ImageView) findView(R.id.wm_sc_standard_shop_content_to_top);
        this.j = new a(this.mContext);
        this.j.createView((LinearLayout) findView(R.id.poi_member_container));
        this.d.setOnTabSelectedListener(new FlashTabLayout.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.1
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d83953df99ea7d7d029d5bee2d54baa1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d83953df99ea7d7d029d5bee2d54baa1");
                } else if (DrugComposeShopPageBlock.this.e == null || eVar == null) {
                } else {
                    RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) DrugComposeShopPageBlock.this.e.navigationBars, eVar.h);
                    if (bVar != null) {
                        if (!DrugComposeShopPageBlock.this.h) {
                            DrugComposeShopPageBlock.this.a(bVar, eVar.h);
                        }
                        DrugComposeShopPageBlock.a(DrugComposeShopPageBlock.this, false);
                    }
                    DrugComposeShopPageBlock.this.a.setCurrentItem(eVar.h);
                }
            }
        });
        this.d.setRelationMove(true);
        this.a.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d393ac79eb99cc1ff9644ddb82525ecc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d393ac79eb99cc1ff9644ddb82525ecc");
                } else {
                    DrugComposeShopPageBlock.this.d.a(i, f);
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19bd0eedc7312411e6c44a448dc4eb24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19bd0eedc7312411e6c44a448dc4eb24");
                    return;
                }
                DrugComposeShopPageBlock.this.c.e().setNestedScrollEnabled(true);
                DrugComposeShopPageBlock.this.d.setSelectIndex(i);
            }
        });
        this.f = a(this.mContext, this.c, this.mContext instanceof FragmentActivity ? ((FragmentActivity) this.mContext).getSupportFragmentManager() : null);
        this.a.setAdapter(this.f);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d05dea67bd08c23335eef922f25b34d2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d05dea67bd08c23335eef922f25b34d2");
                } else {
                    DrugComposeShopPageBlock.c(DrugComposeShopPageBlock.this);
                }
            }
        });
        com.meituan.android.bus.a.a().a(this);
    }

    public void a(RestMenuResponse.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bedb1ad69c441384240a7cadc205702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bedb1ad69c441384240a7cadc205702");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c.k(), "b_waimai_sg_qib1vrgi_mc").a("poi_id", this.c.d().d()).a("title", bVar.b).a("index", Integer.valueOf(i)).a();
        }
    }

    public DrugComposeShopPageAdapter a(Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, FragmentManager fragmentManager) {
        Object[] objArr = {context, eVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1787eff1e7b80896bd39e20fb4800c", RobustBitConfig.DEFAULT_VALUE) ? (DrugComposeShopPageAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1787eff1e7b80896bd39e20fb4800c") : new DrugComposeShopPageAdapter(context, eVar, fragmentManager);
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cc758437b3e3d8770e49cda630d496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cc758437b3e3d8770e49cda630d496");
            return;
        }
        if (z) {
            a aVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e9667019e75ebc6a6d02127e743a04d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e9667019e75ebc6a6d02127e743a04d7");
            } else {
                u.b(aVar.b);
                u.b(aVar.c);
            }
        } else {
            a aVar2 = this.j;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "9e898955ab48d6dfe4a4e60b20c84328", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "9e898955ab48d6dfe4a4e60b20c84328");
            } else if (aVar2.d) {
                u.a(aVar2.c);
            }
        }
        this.i.setVisibility(z ? 0 : 8);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ff602643f97cb3fa5e8285642f0d69", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ff602643f97cb3fa5e8285642f0d69") : layoutInflater.inflate(R.layout.wm_sc_shop_content_drug_compose_page_block, viewGroup, false);
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9844455285b85270bb7b5cdba2202e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9844455285b85270bb7b5cdba2202e");
        } else if (restMenuResponse != null) {
            this.e = restMenuResponse;
            Object[] objArr2 = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5af4f4403ef73531db8e1a3857fb6e74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5af4f4403ef73531db8e1a3857fb6e74");
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
                this.d.setTabCreateListener(new FlashTabLayout.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.a
                    public final void a(View view, int i3) {
                        RestMenuResponse.b bVar2;
                        Object[] objArr3 = {view, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca40aa7e8cdbace24ae826dac7118f8f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca40aa7e8cdbace24ae826dac7118f8f");
                        } else if (DrugComposeShopPageBlock.this.c.k() == null || (bVar2 = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i3)) == null) {
                        } else {
                            com.sankuai.waimai.store.expose.v2.entity.b bVar3 = (com.sankuai.waimai.store.expose.v2.entity.b) DrugComposeShopPageBlock.this.g.get(view);
                            if (bVar3 == null) {
                                bVar3 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_qib1vrgi_mv", view);
                                DrugComposeShopPageBlock.this.g.put(view, bVar3);
                                com.sankuai.waimai.store.expose.v2.b.a().a(DrugComposeShopPageBlock.this.c.k(), bVar3);
                            }
                            bVar3.e = i3 + CommonConstant.Symbol.UNDERLINE + bVar2.hashCode();
                            bVar3.a("poi_id", DrugComposeShopPageBlock.this.c.d().d()).a("title", bVar2.b).a("index", Integer.valueOf(i3));
                        }
                    }
                });
                this.d.setTabWidthMeasureCompleteListener(new FlashTabLayout.c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.c
                    public final void a(int i3) {
                        Object[] objArr3 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "219c0ba58d0f8ec852719a31536b9cbd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "219c0ba58d0f8ec852719a31536b9cbd");
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = DrugComposeShopPageBlock.this.d.getLayoutParams();
                        layoutParams.width = i3;
                        DrugComposeShopPageBlock.this.d.setLayoutParams(layoutParams);
                    }
                });
                this.d.setScrollModeWithItemMargin(10);
                this.d.setTabs(charSequenceArr);
                DrugComposeShopPageAdapter drugComposeShopPageAdapter = this.f;
                Object[] objArr3 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect3 = DrugComposeShopPageAdapter.a;
                if (PatchProxy.isSupport(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "914039b382433a832d553df9da469ad0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "914039b382433a832d553df9da469ad0");
                } else {
                    drugComposeShopPageAdapter.b = restMenuResponse;
                    drugComposeShopPageAdapter.c.clear();
                    if (restMenuResponse != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) restMenuResponse.navigationBars)) {
                        drugComposeShopPageAdapter.c.addAll(restMenuResponse.navigationBars);
                    }
                    drugComposeShopPageAdapter.notifyDataSetChanged();
                }
                this.a.setOffscreenPageLimit(charSequenceArr.length - 1);
                this.d.setSelectIndex(i);
                this.a.setCurrentItem(i);
            }
            if (restMenuResponse.getPoi() != null) {
                this.j.a(restMenuResponse.getPoi());
            }
        }
    }

    public boolean a(RestMenuResponse.NavigateItem navigateItem) {
        int i;
        Object[] objArr = {navigateItem};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "493875bc1ee0e19b44d5a3ee2a388ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "493875bc1ee0e19b44d5a3ee2a388ce2")).booleanValue();
        }
        if (RestMenuResponse.NavigateItem.isAnchoredNewStrategy(navigateItem.anchoredInfo)) {
            RestMenuResponse.NavigateItem.AnchoredInfo anchoredInfo = navigateItem.anchoredInfo;
            Object[] objArr2 = {anchoredInfo};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3fa76ffc0dd37c53ab5a05ea3704e8f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3fa76ffc0dd37c53ab5a05ea3704e8f")).booleanValue();
            }
            DrugComposeShopPageAdapter drugComposeShopPageAdapter = this.f;
            int i2 = anchoredInfo.barIndex;
            Object[] objArr3 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = DrugComposeShopPageAdapter.a;
            if (!PatchProxy.isSupport(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "de9230d45a5370742ef08c94e5876036", RobustBitConfig.DEFAULT_VALUE)) {
                int a = com.sankuai.shangou.stone.util.a.a((List) drugComposeShopPageAdapter.c);
                int i3 = 0;
                while (true) {
                    if (i3 < a) {
                        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) drugComposeShopPageAdapter.c, i3);
                        if (bVar != null && bVar.e == i2) {
                            i = i3;
                            break;
                        }
                        i3++;
                    } else {
                        i = -1;
                        break;
                    }
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, drugComposeShopPageAdapter, changeQuickRedirect3, false, "de9230d45a5370742ef08c94e5876036")).intValue();
            }
            if (i == -1) {
                return false;
            }
            this.a.setCurrentItem(i);
            this.f.a(r.a(anchoredInfo.id, 0L));
            return true;
        } else if (!RestMenuResponse.NavigateItem.isMoreTag(navigateItem.id)) {
            com.sankuai.waimai.store.router.d.a(this.c.k(), navigateItem.scheme);
            return false;
        } else {
            int b2 = this.f.b();
            if (b2 == -1) {
                return false;
            }
            this.a.setCurrentItem(b2);
            this.f.a(navigateItem.id);
            return true;
        }
    }

    @Subscribe
    public void clickNavigateItem(com.sankuai.waimai.store.mrn.event.a aVar) {
        RestMenuResponse.NavigateItem navigateItem;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40099c811d124785ecc50abf8755ffd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40099c811d124785ecc50abf8755ffd8");
        } else if (aVar != null && TextUtils.equals(aVar.b, String.valueOf(this.c.d().f())) && this.c.k().x() && (navigateItem = aVar.a) != null) {
            a(navigateItem);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85715c55accbd65c03b3618ce702ccc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85715c55accbd65c03b3618ce702ccc9");
            return;
        }
        if (this.a != null) {
            this.a.setAdapter(null);
        }
        com.meituan.android.bus.a.a().b(this);
        if (this.f != null) {
            DrugComposeShopPageAdapter drugComposeShopPageAdapter = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugComposeShopPageAdapter.a;
            if (PatchProxy.isSupport(objArr2, drugComposeShopPageAdapter, changeQuickRedirect2, false, "db373b48e62954c45598f386f1e421c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugComposeShopPageAdapter, changeQuickRedirect2, false, "db373b48e62954c45598f386f1e421c1");
            } else if (drugComposeShopPageAdapter.d != null && drugComposeShopPageAdapter.d.size() > 0) {
                for (int i = 0; i < drugComposeShopPageAdapter.d.size(); i++) {
                    com.sankuai.waimai.store.base.b bVar = drugComposeShopPageAdapter.d.get(i);
                    if (bVar != null) {
                        bVar.onDestroy();
                    }
                }
            }
        }
    }

    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e196aa49568f32b5d3cba5015bdd232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e196aa49568f32b5d3cba5015bdd232");
        } else if (this.f != null) {
            this.f.e = kVar;
        }
    }
}
