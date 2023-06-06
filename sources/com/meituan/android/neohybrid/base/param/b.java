package com.meituan.android.neohybrid.base.param;

import android.text.TextUtils;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b extends a {
    public static ChangeQuickRedirect c;
    public final Map<String, Object> d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab7cf2a4c3de56c83076cc119d46c8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab7cf2a4c3de56c83076cc119d46c8c");
        } else {
            this.d = new HashMap();
        }
    }

    public final synchronized Map<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72cd8b394adc88838a8815a4afd2a408", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72cd8b394adc88838a8815a4afd2a408");
        }
        return new HashMap(this.d);
    }

    public final synchronized Object e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "653a089ffb060ef1eecbab82ca32b7e2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "653a089ffb060ef1eecbab82ca32b7e2");
        }
        return this.d.get(str);
    }

    public final synchronized void a(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a96fb883b0b71ea22e1a15642e5b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a96fb883b0b71ea22e1a15642e5b5c");
        } else if (i.a(map)) {
        } else {
            this.d.putAll(map);
        }
    }

    public final synchronized void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d15eca68fff3f79308e83b7225809e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d15eca68fff3f79308e83b7225809e0");
            return;
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.d.putAll(com.meituan.android.neohybrid.neo.report.a.c(str, obj).b);
        }
    }
}
