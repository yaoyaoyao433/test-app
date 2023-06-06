package com.sankuai.waimai.business.page.home.actionbar;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ElderHomeActionBarViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c94227d74ff199c19ee201b6c17d6d7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c94227d74ff199c19ee201b6c17d6d7")).intValue() : Math.max(0, Math.min(-i, b()));
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42016bcceeae624db8c3031825fec7ce", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42016bcceeae624db8c3031825fec7ce")).intValue() : com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.wm_page_home_location_container_height_elder);
    }
}
