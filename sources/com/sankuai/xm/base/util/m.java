package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    public static ChangeQuickRedirect a;

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "745036c2d3e070ebaaadb613793178da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "745036c2d3e070ebaaadb613793178da");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception e) {
                com.sankuai.xm.log.a.a(e);
            }
        }
    }
}
