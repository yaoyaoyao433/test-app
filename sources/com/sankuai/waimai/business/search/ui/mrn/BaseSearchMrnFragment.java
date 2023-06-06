package com.sankuai.waimai.business.search.ui.mrn;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.business.search.ui.SearchShareData;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseSearchMrnFragment extends WMMrnBaseFragment {
    public static ChangeQuickRedirect a;
    protected GlobalSearchActivity b;
    protected SearchShareData c;

    @Override // com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a029f3f1d4cdeaf91ef56ee712ecaa70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a029f3f1d4cdeaf91ef56ee712ecaa70");
            return;
        }
        super.onAttach(activity);
        if (((WMMrnBaseFragment) this).l instanceof GlobalSearchActivity) {
            this.b = (GlobalSearchActivity) ((WMMrnBaseFragment) this).l;
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb034c37b3bded5fb9d670dae850a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb034c37b3bded5fb9d670dae850a93");
            return;
        }
        super.onCreate(bundle);
        this.c = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(this, SearchShareData.class);
    }

    public final void a(String str, String str2, int i, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc4ca88656e11ff48900d1a6884d1da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc4ca88656e11ff48900d1a6884d1da");
        } else if (this.b != null) {
            GlobalSearchActivity globalSearchActivity = this.b;
            Object[] objArr2 = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = GlobalSearchActivity.a;
            if (PatchProxy.isSupport(objArr2, globalSearchActivity, changeQuickRedirect2, false, "f3928280028a47c579b0591e25cee1f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, globalSearchActivity, changeQuickRedirect2, false, "f3928280028a47c579b0591e25cee1f7");
            } else {
                globalSearchActivity.a(0L, "", str, str2, "", i, i2, false);
            }
        }
    }

    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d07a0586d793075154d0097ce95fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d07a0586d793075154d0097ce95fd5");
        } else {
            a(str, "", i, i2);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f9e3e24cb86c7da26a7b778d8bfd66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f9e3e24cb86c7da26a7b778d8bfd66");
        } else if (this.b != null) {
            this.b.a(str);
        }
    }

    public final void a(long j, String str, String str2, int i, int i2) {
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i), 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3558dd400164f0f1a7b11a999d91b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3558dd400164f0f1a7b11a999d91b58");
        } else if (this.b != null) {
            this.b.a(j, str, str2, i, 1, false);
        }
    }
}
