package com.meituan.android.neohybrid.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends RuntimeException {
    public static ChangeQuickRedirect a;
    private Map<String, Object> b;

    public b(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b283b5c03cfbf8316e5b19d17bdec045", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b283b5c03cfbf8316e5b19d17bdec045");
        }
    }

    public b(Throwable th) {
        super(th);
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044c3bc8ccf31416c7676bb02b9449b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044c3bc8ccf31416c7676bb02b9449b6");
        }
    }

    public b(int i, String str, String str2) {
        super(str);
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25fff1ccf39be4107d2ff073f74e74b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25fff1ccf39be4107d2ff073f74e74b9");
            return;
        }
        this.b = new HashMap();
        this.b.put("code", Integer.valueOf(i));
        this.b.put("message", str);
        this.b.put("response", str2);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9216218d7e6bdd98d7dc87adbd43c7a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9216218d7e6bdd98d7dc87adbd43c7a") : this.b == null ? super.getMessage() : this.b.toString();
    }
}
