package com.sankuai.waimai.machpro.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<MPContext> mWeakContext;

    public MPModule(MPContext mPContext) {
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffd0f07c6ed9482431c4b0b3a292eac6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffd0f07c6ed9482431c4b0b3a292eac6");
        } else {
            this.mWeakContext = new WeakReference<>(mPContext);
        }
    }

    public MPContext getMachContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bff18a71e9d99d39cc437f4582422130", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bff18a71e9d99d39cc437f4582422130");
        }
        if (this.mWeakContext != null) {
            return this.mWeakContext.get();
        }
        return null;
    }
}
