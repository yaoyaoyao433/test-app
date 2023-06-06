package com.meituan.android.paybase.fingerprint.manager;

import android.content.Context;
import android.os.Build;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9458b18cf9c1f27483966f214ff9fc4e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9458b18cf9c1f27483966f214ff9fc4e") : a(null, i, "");
    }

    public static a a(b bVar, int i, String str) {
        Object[] objArr = {bVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        e eVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fc2915060f90dfa0fbbcbaf04268ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fc2915060f90dfa0fbbcbaf04268ea5");
        }
        Context b = com.meituan.android.paybase.fingerprint.soter.b.a().b();
        if (b == null) {
            return null;
        }
        try {
            switch (i) {
                case 1:
                    if (Build.VERSION.SDK_INT >= 23 && f.a(b, "android.permission.USE_FINGERPRINT") == 0) {
                        e eVar2 = new e(b, bVar);
                        try {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_rh2ox7k7_mv", new a.c().a("message", "have google fingerprint permission").b);
                            return eVar2;
                        } catch (Exception e) {
                            e = e;
                            eVar = eVar2;
                            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PayFingerprintFactory_getInstance").a("message", e.getMessage()).b);
                            return eVar;
                        }
                    }
                    bVar.e();
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_rh2ox7k7_mv", new a.c().a("message", "don't have google fingerprint permission").b);
                    break;
                case 2:
                    if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a()) {
                        return new d(b, bVar, str);
                    }
                    break;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return eVar;
    }
}
