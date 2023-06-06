package com.sankuai.waimai.business.knb.config;

import com.meituan.android.preload.config.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.waimai.business.knb.utils.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements KNBWebManager.ISetting {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.ISetting
    public final int getWebTimeout() {
        return KNBWebManager.ISetting.DEFAULT_TIMEOUT;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.ISetting
    public final boolean isDebug() {
        g gVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4936ec8584a74d886eb19bdc0fea5d37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4936ec8584a74d886eb19bdc0fea5d37")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f6ba232506b2c6daa2c26b79ed879995", RobustBitConfig.DEFAULT_VALUE)) {
            gVar = (g) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f6ba232506b2c6daa2c26b79ed879995");
        } else if (com.meituan.android.singleton.b.a.getApplicationContext() != null) {
            com.meituan.android.singleton.b.a.getApplicationContext();
            String lowerCase = "".toLowerCase();
            if (lowerCase.contains("stage")) {
                gVar = g.STAGE;
            } else if (lowerCase.contains("test")) {
                gVar = g.TEST;
            } else {
                gVar = g.PROD;
            }
        } else {
            gVar = g.PROD;
        }
        return gVar.equals(g.TEST);
    }
}
