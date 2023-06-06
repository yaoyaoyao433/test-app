package com.sankuai.waimai.business.page.home.head.recommendwords;

import android.arch.lifecycle.q;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.foundation.utils.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<HomeNewHeadResponse> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final /* synthetic */ Object f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d38fea6c98318b75359846d9b6360e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecommendSearchWord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d38fea6c98318b75359846d9b6360e");
        }
        if (e() == null || e().searchGuideKeywords == null) {
            return null;
        }
        List arrayList = new ArrayList();
        if (!d.a(e().searchGuideKeywords.searchGuideKeywords)) {
            arrayList = e().searchGuideKeywords.searchGuideKeywords;
        }
        return new RecommendSearchWord(arrayList, e().searchGuideKeywords.rcmdLogId, e().searchGuideKeywords.tgtStids, this.b);
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09dab686b4905eced08ac9e9b5e80197", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09dab686b4905eced08ac9e9b5e80197");
        }
        if (e() != null && e().searchGuideKeywords != null && !d.a(e().searchGuideKeywords.searchGuideKeywords)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e26ef790b074580df3d1be8725496c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e26ef790b074580df3d1be8725496c");
        } else if (this.e == null || !(this.e.h() instanceof HomePageFragment)) {
        } else {
            HomePageFragment homePageFragment = (HomePageFragment) this.e.h();
            if (e() != null) {
                Object[] objArr2 = {homePageFragment};
                ChangeQuickRedirect changeQuickRedirect2 = o;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "555327b63caec8ef232092308aaa5adc", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "555327b63caec8ef232092308aaa5adc")).booleanValue();
                } else if (homePageFragment != null && homePageFragment.F != null && homePageFragment.isAdded() && !homePageFragment.isDetached()) {
                    z = true;
                }
                if (z) {
                    ((HomeActionBarViewModel) q.a(homePageFragment).a(HomeActionBarViewModel.class)).a(new Pair<>(e().rollSearchKeyword, Boolean.valueOf(this.b)));
                }
            }
        }
    }
}
