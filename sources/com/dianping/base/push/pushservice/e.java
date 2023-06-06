package com.dianping.base.push.pushservice;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private q b;

    private e(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3fe563a8d85249d6534dcaff5a89db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3fe563a8d85249d6534dcaff5a89db");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.b = q.a(applicationContext, context.getPackageName() + CommonConstant.Symbol.UNDERLINE + str, 2);
    }

    public static e a(Context context) throws Exception {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "702c6e596d5c226230fd8cd6c3d4d587", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "702c6e596d5c226230fd8cd6c3d4d587");
        }
        if (context == null) {
            throw new Exception("Application is dead");
        }
        return a(context, "multiprocessdppush");
    }

    public static e a(Context context, String str) throws Exception {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b713e8e1f88be0e9aebcfa91a6f419c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b713e8e1f88be0e9aebcfa91a6f419c7");
        }
        if (context == null) {
            throw new Exception("Application is dead");
        }
        return new e(context, str);
    }

    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2029d89fc3c5c34db40fbd452f998a6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2029d89fc3c5c34db40fbd452f998a6")).intValue() : this.b.b(str, i);
    }

    public final void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c427bf46011449087dc957be1ccc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c427bf46011449087dc957be1ccc88");
        } else {
            this.b.a(str, i);
        }
    }

    public final long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f14048725afc5feac947282ed39dcf", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f14048725afc5feac947282ed39dcf")).longValue() : this.b.b(str, j);
    }

    public final void b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537f1cefcba8687fe8cda45c7fc498b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537f1cefcba8687fe8cda45c7fc498b6");
        } else {
            this.b.a(str, j);
        }
    }

    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6069ed6a77233a3cb89e19de5594570", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6069ed6a77233a3cb89e19de5594570") : this.b.b(str, str2);
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18ed8585bed23d89dd24f47997e2f766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18ed8585bed23d89dd24f47997e2f766");
        } else {
            this.b.a(str, str2);
        }
    }
}
