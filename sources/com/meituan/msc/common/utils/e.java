package com.meituan.msc.common.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static com.meituan.android.cipstorage.q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9364c57085549fbffd605fab0a1c7cf3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9364c57085549fbffd605fab0a1c7cf3") : com.meituan.android.cipstorage.q.a(context, "mtplatform_msc");
    }

    public static File a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab9c873a609da640d43375fb4fe679ea", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab9c873a609da640d43375fb4fe679ea") : a(context, str, "mtplatform_msc");
    }

    public static File a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8e403939af22d9606f96ee58c6ac609", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8e403939af22d9606f96ee58c6ac609") : r.d(com.meituan.android.cipstorage.q.a(context, str2, str, com.meituan.android.cipstorage.u.e));
    }

    public static File b(Context context, String str) {
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99ccf364c72e9c2c2901b3b6ea14570f", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99ccf364c72e9c2c2901b3b6ea14570f") : r.d(com.meituan.android.cipstorage.q.a(context, "mtplatform_msc", (String) null, com.meituan.android.cipstorage.u.b));
    }

    public static File c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da998d5b7674fa98c6d2942b2f60b3cb", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da998d5b7674fa98c6d2942b2f60b3cb") : r.d(com.meituan.android.cipstorage.q.b(context, str, "mtplatform_msc"));
    }
}
