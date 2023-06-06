package com.sankuai.waimai.store.search.ui.mrn;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseSearchMrnFragment extends SGCommonRNFragment {
    public static ChangeQuickRedirect a;
    protected GlobalSearchActivity b;
    protected SearchShareData k;

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38cbf3e9542b25798b2228916276bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38cbf3e9542b25798b2228916276bad");
            return;
        }
        super.onAttach(activity);
        if (((SGCommonRNFragment) this).g instanceof GlobalSearchActivity) {
            this.b = (GlobalSearchActivity) ((SGCommonRNFragment) this).g;
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302a9b503f595a822557511e5bd9e42a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302a9b503f595a822557511e5bd9e42a");
            return;
        }
        super.onCreate(bundle);
        this.k = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(this, SearchShareData.class);
    }

    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5c62a0a92e21edfe455eea9f931e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5c62a0a92e21edfe455eea9f931e57");
        } else if (this.b != null) {
            this.b.a(str, i, i2, false);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b73aea21e9075627b5b0e1992e086c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b73aea21e9075627b5b0e1992e086c");
        } else if (this.b != null) {
            this.b.c(str);
        }
    }

    public final void a(long j, String str, String str2, int i, int i2) {
        Object[] objArr = {new Long(j), str, str2, 2, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fec24057ffd2d47c32cdc6366de7197", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fec24057ffd2d47c32cdc6366de7197");
        } else if (this.b != null) {
            this.b.a(j, str, str2, 2, 1, false);
        }
    }

    public final void a(SearchShareData searchShareData) {
        if (this.k != null || searchShareData == null) {
            return;
        }
        this.k = searchShareData;
    }
}
