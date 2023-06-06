package com.sankuai.meituan.android.knb;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Titans {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mConfigSynced;
    private boolean mInitBridgeEnv;

    public Titans() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b79bf2dad3e578c5feb4811d9c13a5f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b79bf2dad3e578c5feb4811d9c13a5f9");
            return;
        }
        this.mConfigSynced = false;
        this.mInitBridgeEnv = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static Titans instance = new Titans();
    }

    public static Titans getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d5d6f6621f20fdf9a2c36d584a46312", RobustBitConfig.DEFAULT_VALUE) ? (Titans) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d5d6f6621f20fdf9a2c36d584a46312") : Holder.instance;
    }

    public final void onAppFirstPageRenderEnd(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99033c1888068a1953d304658d6f6ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99033c1888068a1953d304658d6f6ce");
        } else {
            initBridgeEnv(context);
        }
    }

    private void initBridgeEnv(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cb9faed14363887edb9a36e7237540a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cb9faed14363887edb9a36e7237540a");
        } else if (this.mInitBridgeEnv) {
        } else {
            KNBInitCallback initCallback = KNBWebManager.getInitCallback();
            if (initCallback != null) {
                initCallback.init(context);
                KNBWebManager.setInitCallback(null);
            }
            this.mInitBridgeEnv = true;
        }
    }
}
