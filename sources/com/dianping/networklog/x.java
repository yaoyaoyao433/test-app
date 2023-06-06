package com.dianping.networklog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
/* loaded from: classes.dex */
public final class x {
    public static ChangeQuickRedirect a;
    static String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f9e2d76db65404e62354c578852cf8a", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f9e2d76db65404e62354c578852cf8a");
        }
        File a2 = t.a().d.a("networklog_v3");
        if (a2 != null) {
            a2.mkdirs();
            return new File(a2, ".logan_instance_id");
        }
        return null;
    }
}
