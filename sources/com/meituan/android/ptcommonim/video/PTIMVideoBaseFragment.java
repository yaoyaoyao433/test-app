package com.meituan.android.ptcommonim.video;

import android.os.Bundle;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.spawn.base.BaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMVideoBaseFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    public PTIMCommonBean b;

    public boolean a() {
        return false;
    }

    @Override // com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794ee7d229d87edc9a10e879c1c70b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794ee7d229d87edc9a10e879c1c70b2a");
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            com.meituan.android.ptcommonim.video.utils.a.b(getActivity());
        } else {
            this.b = (PTIMCommonBean) arguments.getParcelable("commonBean");
        }
    }
}
