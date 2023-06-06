package com.sankuai.waimai.business.search.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.actionbar.b;
import com.sankuai.waimai.foundation.core.base.fragment.BaseFragment;
import com.sankuai.waimai.foundation.utils.aa;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseSearchFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    public GlobalSearchActivity b;
    public SearchShareData c;

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f5e1e37f8051ca19d0fe3a04baeccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f5e1e37f8051ca19d0fe3a04baeccf");
            return;
        }
        super.onAttach(activity);
        if (this.F instanceof GlobalSearchActivity) {
            this.b = (GlobalSearchActivity) this.F;
            return;
        }
        throw new IllegalArgumentException("BaseSearchFragment can only be added to GlobalSearchActivity!");
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f9e04ff8c04a13fe3ed5f5a40ce0fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f9e04ff8c04a13fe3ed5f5a40ce0fe");
            return;
        }
        super.onCreate(bundle);
        this.c = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(this, SearchShareData.class);
    }

    public final void a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ddc2617c6526e807d6c04382b9058fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ddc2617c6526e807d6c04382b9058fe");
        } else if (this.b == null || TextUtils.isEmpty(str)) {
        } else {
            this.b.a(str, j, str2, false, null);
        }
    }

    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb75ffc160d05fe7c2fb6f5c255cbbf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb75ffc160d05fe7c2fb6f5c255cbbf6");
        } else if (this.b != null) {
            this.b.a(str, i, i2, false);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0f606ecb2cb22def5b633b81de73ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0f606ecb2cb22def5b633b81de73ec");
        } else if (this.b != null) {
            GlobalSearchActivity globalSearchActivity = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = GlobalSearchActivity.a;
            if (PatchProxy.isSupport(objArr2, globalSearchActivity, changeQuickRedirect2, false, "b4129f29a0cc2bb1799ac5b8c8840364", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, globalSearchActivity, changeQuickRedirect2, false, "b4129f29a0cc2bb1799ac5b8c8840364");
            } else {
                globalSearchActivity.h.d = aa.a(str, globalSearchActivity.g);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1edb38a4a8aa9fada3812fcddcc67ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1edb38a4a8aa9fada3812fcddcc67ab");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    public final b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c56cd95fa2d6b6534d2e88fc1fe0c84", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c56cd95fa2d6b6534d2e88fc1fe0c84");
        }
        if (this.b != null) {
            return this.b.k;
        }
        return null;
    }
}
