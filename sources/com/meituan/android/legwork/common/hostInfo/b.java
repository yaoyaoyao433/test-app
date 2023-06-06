package com.meituan.android.legwork.common.hostInfo;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends a {
    public static ChangeQuickRedirect d;
    private static final b e = new b();

    public static String h() {
        return "android";
    }

    public static String j() {
        return "538183952";
    }

    public static b e() {
        return e;
    }

    @Override // com.meituan.android.legwork.common.hostInfo.c
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb0f7124ad7416d59a5e95b97ed53e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb0f7124ad7416d59a5e95b97ed53e0") : com.sankuai.waimai.kit.uuid.b.a(com.meituan.android.legwork.a.a());
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c5cf560ac1a18929b3e6fca44fb7ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c5cf560ac1a18929b3e6fca44fb7ec9");
        }
        if (com.meituan.android.legwork.common.util.c.a().b) {
            return com.sankuai.waimai.kit.fingerPrint.a.a().b().fingerprint();
        }
        return MTGuard.deviceFingerprintData(this.c);
    }

    public final Context i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e7b9709c621be5f291e2665a1cf76e", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e7b9709c621be5f291e2665a1cf76e") : com.meituan.android.singleton.b.a();
    }

    @Override // com.meituan.android.legwork.common.hostInfo.a
    public final String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c940b5b133d7bdd8966a7b2f4d671cf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c940b5b133d7bdd8966a7b2f4d671cf3");
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return com.sankuai.meituan.switchtestenv.a.a(context, str);
    }
}
