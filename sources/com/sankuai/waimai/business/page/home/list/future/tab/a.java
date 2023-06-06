package com.sankuai.waimai.business.page.home.list.future.tab;

import android.arch.lifecycle.q;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout;
import com.sankuai.waimai.business.page.home.list.future.FutureViewModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a<Object> {
    public static ChangeQuickRedirect v;
    private ViewGroup w;
    private CustomTabLayout x;
    private ViewPager y;
    private FutureViewModel z;

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void d(Object obj) {
    }

    public a(PageFragment pageFragment, ViewPager viewPager) {
        super(pageFragment);
        Object[] objArr = {pageFragment, viewPager};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc19be43ca1eb911f0a3e3224b67c47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc19be43ca1eb911f0a3e3224b67c47");
        } else {
            this.y = viewPager;
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9673979979426b5c0b7d50ab8c0ad0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9673979979426b5c0b7d50ab8c0ad0");
        }
        this.w = (ViewGroup) viewGroup.findViewById(R.id.future_tab_container);
        this.x = (CustomTabLayout) viewGroup.findViewById(R.id.future_tab);
        this.x.setTabTitleResId(R.id.tab_tv);
        this.x.setupWithViewPager(this.y);
        this.x.a(new CustomTabLayout.b() { // from class: com.sankuai.waimai.business.page.home.list.future.tab.a.1
            @Override // com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.b
            public final void a(CustomTabLayout.e eVar, boolean z, int i) {
            }
        });
        a(this.s);
        return this.w;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9399815a4aab85742acbbeccb58f3a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9399815a4aab85742acbbeccb58f3a1");
            return;
        }
        this.z = (FutureViewModel) q.a(pageFragment).a(FutureViewModel.class);
        this.w.setVisibility(8);
    }
}
