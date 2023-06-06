package com.meituan.android.pay.desk.payment.verify;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Collection b = Collections.unmodifiableList(Arrays.asList("0", "1", "4", "2", "21", "8"));

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41aa03003e8339bae09dec80cd7fc2c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41aa03003e8339bae09dec80cd7fc2c1")).booleanValue() : b.contains(str);
    }
}
