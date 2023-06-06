package com.dianping.huaweipush;

import android.content.Context;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements f.a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.base.push.pushservice.f.a
    public final int a() {
        return 4;
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ab15e57d658aeb2a9ebb05620a03ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ab15e57d658aeb2a9ebb05620a03ce");
        } else if (f.b(context)) {
            n.a(context, 4);
        }
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051f34cc284141ef34f89b3cbbec12f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051f34cc284141ef34f89b3cbbec12f8")).booleanValue() : c(context);
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1e06ae27dfbafd2ce4488bfa80e9009", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1e06ae27dfbafd2ce4488bfa80e9009")).booleanValue();
        }
        if (e.c()) {
            if (d(context) == 0) {
                a("AppId wrong");
                return false;
            }
            return true;
        }
        return false;
    }

    static int d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "964d24826527e995bc78a22323e97656", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "964d24826527e995bc78a22323e97656")).intValue();
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.huawei.hms.client.appid");
        } catch (Exception e) {
            a("getAppId", e);
            return 0;
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e4d2021fc2bb48b85ba76c0ba2b158e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e4d2021fc2bb48b85ba76c0ba2b158e");
        } else {
            b(str);
        }
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60b6fd85480381f2dba6bcdf72d611c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60b6fd85480381f2dba6bcdf72d611c3");
        } else {
            c.b("HuaweiPush", str);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df5fed842a715b22d693dd5448f13d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df5fed842a715b22d693dd5448f13d89");
        } else {
            c.a("HuaweiPush", str, th);
        }
    }
}
