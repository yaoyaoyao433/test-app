package com.sankuai.waimai.store.convenient.landing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.SGBaseCubeFragment;
import com.sankuai.waimai.store.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGConvenientLandingFragment extends SGBaseCubeFragment {
    public static ChangeQuickRedirect c;
    com.sankuai.waimai.store.param.a d;
    private k e;

    @Override // com.sankuai.waimai.store.base.SCBaseFragment
    public final String b() {
        return "";
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment
    public final k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4fbc8d00c21b361565a8c0031b3704b", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4fbc8d00c21b361565a8c0031b3704b");
        }
        this.e = new SGConvenientLandingBlockContainer(this, this.d);
        return this.e;
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment, com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accf40b4447bce664a33c6fd1f6e1b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accf40b4447bce664a33c6fd1f6e1b98");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694d469f94954ca8e282454288d69fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694d469f94954ca8e282454288d69fac");
            return;
        }
        super.a(z);
        if (this.e != null) {
            this.e.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77bd366d43f69879455c5427fb29d481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77bd366d43f69879455c5427fb29d481");
        } else {
            super.onDestroy();
        }
    }
}
