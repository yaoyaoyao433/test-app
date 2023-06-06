package com.sankuai.waimai.store.search.ui;

import android.os.Bundle;
import com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchBaseActivity extends SCBaseActivity implements IFFPPageMRN {
    public static ChangeQuickRedirect e;
    private boolean a;
    protected int f;
    protected boolean g;

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    public String mrnBiz() {
        return "supermarket";
    }

    public SGSearchBaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3e2b398039ec0e8e7f8eb49def690d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3e2b398039ec0e8e7f8eb49def690d");
            return;
        }
        this.f = 0;
        this.g = false;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bacc241f1ece1cd5f76050de035fef9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bacc241f1ece1cd5f76050de035fef9c");
            return;
        }
        super.onCreate(bundle);
        this.a = i.h().a("store_search_fsp/use_ffp_mrn", true);
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    public boolean isMRNPage() {
        if (this.a) {
            return this.f == 1 || this.f == 2;
        }
        return false;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    public String mrnEntry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9aaf4a9870d1c34785c91f347569738", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9aaf4a9870d1c34785c91f347569738");
        }
        if (this.f == 1) {
            return this.g ? "flashbuy-drug-search-guide" : "flashbuy-search-guide";
        } else if (this.f == 2) {
            return this.g ? "medicine-search-suggest" : "flashbuy-search-suggest";
        } else {
            return null;
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    public String mrnComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4651a068089597b531eaa01e82c3a9c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4651a068089597b531eaa01e82c3a9c0");
        }
        if (this.f == 1) {
            return this.g ? "flashbuy-drug-search-guide" : "flashbuy-search-guide";
        } else if (this.f == 2) {
            return this.g ? "medicine-search-suggest" : "flashbuy-search-suggest";
        } else {
            return null;
        }
    }
}
