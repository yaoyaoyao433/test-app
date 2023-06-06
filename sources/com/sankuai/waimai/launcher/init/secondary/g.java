package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CheckSignatureInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b594ed9220faf35999ebf6891adea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b594ed9220faf35999ebf6891adea0");
        } else if (a(application)) {
        } else {
            com.sankuai.meituan.takeoutnew.util.aop.k.a(0);
        }
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17f4b0e077e8bca46c2ef4a5445fe28f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17f4b0e077e8bca46c2ef4a5445fe28f")).booleanValue();
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String hexString = Integer.toHexString(signature.toCharsString().hashCode());
                    if ("5b9911f".equalsIgnoreCase(hexString) || "b05f7b38".equalsIgnoreCase(hexString)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
