package com.sankuai.waimai.mmp.modules.api;

import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.singleton.c;
import com.meituan.msi.addapter.fingerprint.FingerprintResult;
import com.meituan.msi.addapter.fingerprint.IGetRiskControlFingerprint;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmRiskControlFingerprint extends IGetRiskControlFingerprint {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.fingerprint.IGetRiskControlFingerprint
    public final void a(MsiCustomContext msiCustomContext, final i<FingerprintResult> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe2588ef371c22dfa07d7be62ab031a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe2588ef371c22dfa07d7be62ab031a");
            return;
        }
        final FingerprintManager a = c.a();
        if (a == null) {
            iVar.a(500, "manager is null");
        } else {
            b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.mmp.modules.api.WmRiskControlFingerprint.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce08dbc739137576d9d820d1974066bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce08dbc739137576d9d820d1974066bc");
                        return;
                    }
                    FingerprintResult fingerprintResult = new FingerprintResult();
                    fingerprintResult.fingerprint = a.fingerprint();
                    iVar.a(fingerprintResult);
                }
            });
        }
    }
}
