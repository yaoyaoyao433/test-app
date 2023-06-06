package com.sankuai.waimai.router.components;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f implements d.a {
    public static ChangeQuickRedirect b;
    public static final f c = new f();

    @Override // com.sankuai.waimai.router.core.d.a
    public final void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "2a2615b7923b9afe5a69870d9db98409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "2a2615b7923b9afe5a69870d9db98409");
        } else if (com.sankuai.waimai.router.core.d.b()) {
            e(str, objArr);
        }
    }

    @Override // com.sankuai.waimai.router.core.d.a
    public final void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "b7029ed242ded3472505171fcaf7aaa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "b7029ed242ded3472505171fcaf7aaa4");
        } else if (com.sankuai.waimai.router.core.d.b()) {
            e(str, objArr);
        }
    }

    @Override // com.sankuai.waimai.router.core.d.a
    public final void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf98507e3aacb880ae0e5b1119bb747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf98507e3aacb880ae0e5b1119bb747");
        } else if (com.sankuai.waimai.router.core.d.b()) {
            Log.w("WMRouter", th);
        }
    }

    @Override // com.sankuai.waimai.router.core.d.a
    public final void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "9aa8321b48e7469cc6864ddfe2958640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "9aa8321b48e7469cc6864ddfe2958640");
        } else if (com.sankuai.waimai.router.core.d.b()) {
            Log.e("WMRouter", e(str, objArr));
        }
    }

    @Override // com.sankuai.waimai.router.core.d.a
    public final void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "fcd60380f51fac9274678dc57bec384d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "fcd60380f51fac9274678dc57bec384d");
            return;
        }
        if (com.sankuai.waimai.router.core.d.b()) {
            Log.e("WMRouter", e(str, objArr));
        }
        a(new RuntimeException(e(str, objArr)));
    }

    @Override // com.sankuai.waimai.router.core.d.a
    public final void c(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde6dbc6595b5f5d0cdd13afb7db0496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde6dbc6595b5f5d0cdd13afb7db0496");
            return;
        }
        if (com.sankuai.waimai.router.core.d.b()) {
            Log.e("WMRouter", "", th);
        }
        a(th);
    }

    public void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b8fc1c88ae3299ed4d0e5dd363b371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b8fc1c88ae3299ed4d0e5dd363b371");
        } else if (com.sankuai.waimai.router.core.d.a()) {
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }

    private String e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "2c6169ae2edb5d192dcbceea16fdb88c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "2c6169ae2edb5d192dcbceea16fdb88c");
        }
        if (objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "1fd0094962c1714858f1d40ae7d7cd01", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "1fd0094962c1714858f1d40ae7d7cd01");
                } else if (com.sankuai.waimai.router.core.d.b()) {
                    Log.e("WMRouter", "", th);
                }
            }
        }
        return str;
    }
}
