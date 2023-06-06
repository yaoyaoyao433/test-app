package com.dianping.base.push.pushservice;

import android.content.Context;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class h {
    public static ChangeQuickRedirect a;

    public abstract boolean a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public final boolean a(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa57f5096a2b7f2d4c800930490f4f66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa57f5096a2b7f2d4c800930490f4f66")).booleanValue();
        }
        if (a()) {
            try {
                str = e.a(context).a("pushEnv", PTFloatInfo.TYPE_PRODUCT);
            } catch (Exception e) {
                c.d("PushEnvironment", e.toString());
                str = null;
            }
            return "beta".equals(str);
        }
        return false;
    }
}
