package com.sankuai.waimai.store.search.common.view;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.ui.SearchShareData;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public View b;
    public Activity c;
    public SearchShareData d;

    public b(Activity activity, SearchShareData searchShareData) {
        Object[] objArr = {activity, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d280f3bfe98d97587dc92372edd01861", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d280f3bfe98d97587dc92372edd01861");
            return;
        }
        this.c = activity;
        this.d = searchShareData;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c025821c04cebae0c77f0f83b6fdaff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c025821c04cebae0c77f0f83b6fdaff");
            return;
        }
        this.b.setVisibility(0);
        com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_xh6hk3h5_mv").a("search_log_id", this.d.q).a("template_type", Integer.valueOf(this.d.D)).a("stid", this.d.e).a("cat_id", Integer.valueOf(this.d.z)).a("search_source", Integer.valueOf(this.d.aw)).a();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82474a1867738dedd36ebeccf0a1ff5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82474a1867738dedd36ebeccf0a1ff5f");
        } else {
            u.c(this.b);
        }
    }
}
