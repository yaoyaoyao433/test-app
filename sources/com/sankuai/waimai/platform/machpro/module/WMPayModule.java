package com.sankuai.waimai.platform.machpro.module;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.machpro.container.MPPayBaseFragment;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMPayModule extends MPModule {
    public static final int START_PAY_ACTIVITY_REQUEST_CODE = 1001;
    public static ChangeQuickRedirect changeQuickRedirect;

    public WMPayModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29eb9d6120a1601c63f7b2797079d30c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29eb9d6120a1601c63f7b2797079d30c");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
        if ((r1 instanceof android.app.Activity) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
        com.sankuai.waimai.platform.capacity.pay.a.a((android.app.Activity) r1, 1001, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    @com.sankuai.waimai.machpro.base.JSMethod(methodName = com.meituan.android.common.statistics.Constants.EventType.PAY)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pay(com.sankuai.waimai.machpro.base.MachMap r22, com.sankuai.waimai.machpro.bridge.MPJSCallBack r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.module.WMPayModule.pay(com.sankuai.waimai.machpro.base.MachMap, com.sankuai.waimai.machpro.bridge.MPJSCallBack):void");
    }

    private MPPayBaseFragment getFragment(List<Fragment> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb9d8e2b0feb83a3006547c87269e44b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPPayBaseFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb9d8e2b0feb83a3006547c87269e44b");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Fragment fragment : list) {
            if (fragment instanceof MPPayBaseFragment) {
                MPPayBaseFragment mPPayBaseFragment = (MPPayBaseFragment) fragment;
                if (getMachContext().getBundle() == mPPayBaseFragment.h) {
                    return mPPayBaseFragment;
                }
            }
            MPPayBaseFragment fragment2 = getFragment(fragment.getChildFragmentManager().getFragments());
            if (fragment2 != null) {
                return fragment2;
            }
        }
        return null;
    }
}
