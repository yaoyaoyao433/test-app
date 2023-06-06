package com.meituan.msi.util.cipStorage;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.msi.util.file.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static File a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8037a6b8509efcbfc76d591a57f560a5", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8037a6b8509efcbfc76d591a57f560a5") : d.b(q.a(context, "mtplatform_msi", str, u.c));
    }

    public static File b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24a179eebe32f5df52d300b0754ebd00", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24a179eebe32f5df52d300b0754ebd00") : d.b(q.a(context, "mtplatform_msi", str, u.b));
    }

    public static File c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "176467697a18dfe62a332687953fb0b5", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "176467697a18dfe62a332687953fb0b5") : d.b(q.b(context, str, "mtplatform_msi"));
    }
}
