package com.sankuai.waimai.store.msi.apis;

import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc6e3f191d0c70d3452038c81a412bce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc6e3f191d0c70d3452038c81a412bce")).booleanValue() : msiCustomContext == null || msiCustomContext.getActivity() == null || msiCustomContext.getActivity().isFinishing() || msiCustomContext.getActivity().isDestroyed();
    }
}
