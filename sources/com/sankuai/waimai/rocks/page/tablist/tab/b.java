package com.sankuai.waimai.rocks.page.tablist.tab;

import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
/* compiled from: ProGuard */
@DynamicBinder(modelType = RocksServerModel.class, nativeId = {"more_tab_list"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes5.dex */
public class b extends com.sankuai.waimai.rocks.view.block.b<RocksServerModel> {
    public static ChangeQuickRedirect r;
    private ViewPager w;
    private TabViewPagerLayout x;
    private com.meituan.android.cube.pga.block.a y;
    private RocksServerModel z;

    /* JADX WARN: Type inference failed for: r0v20, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.sankuai.waimai.rocks.view.block.b
    public final /* synthetic */ void d(RocksServerModel rocksServerModel) {
        final RocksServerModel rocksServerModel2 = rocksServerModel;
        Object[] objArr = {rocksServerModel2};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58679e0dd5b4f8287573dc2fc64d97ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58679e0dd5b4f8287573dc2fc64d97ed");
            return;
        }
        super.d((b) rocksServerModel2);
        if (this.z != rocksServerModel2) {
            this.z = rocksServerModel2;
            Object[] objArr2 = {rocksServerModel2};
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "493bed21bb224c4a5bf28dd80b6714d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "493bed21bb224c4a5bf28dd80b6714d9");
                return;
            }
            ((com.sankuai.waimai.rocks.page.a) F()).bx.b = new d<RocksServerModel>() { // from class: com.sankuai.waimai.rocks.page.tablist.tab.b.1
                @Override // com.meituan.android.cube.pga.action.d
                public final /* bridge */ /* synthetic */ RocksServerModel a() {
                    return rocksServerModel2;
                }
            };
            Integer num = ((com.sankuai.waimai.rocks.page.a) F()).bt.a().b;
            if (num != null) {
                this.u.setLayoutParams(new ViewGroup.LayoutParams(-1, num.intValue()));
            }
            if (rocksServerModel2.module_tab != null) {
                rocksServerModel2.module_tabs = rocksServerModel2.module_tab;
            }
            if (rocksServerModel2.module_tabs == null || TextUtils.isEmpty(rocksServerModel2.module_tabs.templateId)) {
                return;
            }
            if (this.y != null) {
                a((b) this.y);
            }
            this.y = com.sankuai.waimai.rocks.utils.a.a((com.meituan.android.cube.pga.type.a) F(), rocksServerModel2.module_tabs.templateId);
            this.y.a((com.sankuai.waimai.rocks.page.a) F(), 1);
            if (this.y != null) {
                b((b) this.y);
                this.y.c(rocksServerModel2);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = r;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4411ba383abdcc281317279f97aa4b44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4411ba383abdcc281317279f97aa4b44");
                    return;
                }
                this.w.setOffscreenPageLimit(1);
                a aVar = ((com.sankuai.waimai.rocks.page.a) F()).bu.a().b;
                Integer num2 = ((com.sankuai.waimai.rocks.page.a) F()).bw.a().b;
                if (aVar != null) {
                    final RocksPagerAdapter rocksPagerAdapter = new RocksPagerAdapter((com.sankuai.waimai.rocks.page.a) F(), aVar.getTabCount(), true);
                    TabViewPagerLayout tabViewPagerLayout = this.x;
                    int intValue = num2 == null ? 0 : num2.intValue();
                    Object[] objArr4 = {aVar, rocksPagerAdapter, Integer.valueOf(intValue)};
                    ChangeQuickRedirect changeQuickRedirect4 = TabViewPagerLayout.a;
                    if (PatchProxy.isSupport(objArr4, tabViewPagerLayout, changeQuickRedirect4, false, "b697d7c21024b346789ba49bf4e9b7cf", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr4, tabViewPagerLayout, changeQuickRedirect4, false, "b697d7c21024b346789ba49bf4e9b7cf")).booleanValue();
                    } else if (tabViewPagerLayout.d != null && aVar != null && aVar.getTabLayout() != null) {
                        if (tabViewPagerLayout.e != null && (tabViewPagerLayout.e instanceof RocksPagerAdapter)) {
                            ((RocksPagerAdapter) tabViewPagerLayout.e).a();
                        }
                        tabViewPagerLayout.e = rocksPagerAdapter;
                        tabViewPagerLayout.c = aVar;
                        View tabLayout = tabViewPagerLayout.c.getTabLayout();
                        tabViewPagerLayout.b.removeAllViews();
                        if (tabLayout.getParent() != null) {
                            ((ViewGroup) tabLayout.getParent()).removeView(tabLayout);
                        }
                        tabViewPagerLayout.b.addView(tabLayout);
                        if (tabViewPagerLayout.c.getViewPagerChangeListener() != null) {
                            tabViewPagerLayout.d.clearOnPageChangeListeners();
                            tabViewPagerLayout.d.addOnPageChangeListener(tabViewPagerLayout.c.getViewPagerChangeListener());
                        }
                        tabViewPagerLayout.d.setAdapter(tabViewPagerLayout.e);
                        tabViewPagerLayout.d.setCurrentItem(intValue);
                    }
                    this.x.getViewPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.rocks.page.tablist.tab.RocksTabContainerBlock$2
                        public static ChangeQuickRedirect a;

                        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                        public void onPageScrollStateChanged(int i) {
                        }

                        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                        public void onPageScrolled(int i, float f, int i2) {
                        }

                        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                        public void onPageSelected(int i) {
                            Object[] objArr5 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "312032f985b2cbd2f0c1800f8b993f38", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "312032f985b2cbd2f0c1800f8b993f38");
                            } else if (!(rocksPagerAdapter instanceof RocksPagerAdapter) || ((RocksPagerAdapter) rocksPagerAdapter).a(i) == null) {
                            } else {
                                ((com.sankuai.waimai.rocks.page.a) b.this.F()).bD.a((com.meituan.android.cube.pga.common.b<RecyclerView>) ((RocksPagerAdapter) rocksPagerAdapter).a(i).N());
                            }
                        }
                    });
                    ((com.sankuai.waimai.rocks.page.a) F()).bv.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.rocks.page.tablist.tab.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.cube.pga.action.b
                        public final /* synthetic */ void a(Integer num3) {
                            Integer num4 = num3;
                            Object[] objArr5 = {num4};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9dbd87e16c9ad04de410c5a57d4c9c40", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9dbd87e16c9ad04de410c5a57d4c9c40");
                            } else {
                                b.this.w.setCurrentItem(num4.intValue());
                            }
                        }
                    });
                }
                ((com.sankuai.waimai.rocks.page.a) F()).bE.b = new d() { // from class: com.sankuai.waimai.rocks.page.tablist.tab.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.d
                    public final Object a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bfae047691d0402461a352de718859f8", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bfae047691d0402461a352de718859f8") : b.this.w.getAdapter();
                    }
                };
                ((com.sankuai.waimai.rocks.page.a) F()).bF.b = new d() { // from class: com.sankuai.waimai.rocks.page.tablist.tab.b.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.d
                    public final Object a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e7b717d3248c96df7e73a94ef2aa7695", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e7b717d3248c96df7e73a94ef2aa7695") : b.this.w;
                    }
                };
            }
        }
    }

    public b(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0842154e96b5f3e8fe41b0a2cdf10a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0842154e96b5f3e8fe41b0a2cdf10a6");
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9814d51f67ce9819e08c040fb46e874", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9814d51f67ce9819e08c040fb46e874");
        }
        this.u = LayoutInflater.from(this.t).inflate(R.layout.rocks_tab_container, viewGroup, false);
        this.x = (TabViewPagerLayout) this.u;
        this.w = this.x.getViewPager();
        return this.u;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b9ee32e8e8444d3e473f5eb554b283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b9ee32e8e8444d3e473f5eb554b283");
            return;
        }
        super.y();
        if (this.y != null) {
            this.y.y();
        }
    }
}
