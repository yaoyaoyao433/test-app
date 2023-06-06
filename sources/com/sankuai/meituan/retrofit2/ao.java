package com.sankuai.meituan.retrofit2;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ao {
    public static ChangeQuickRedirect a;
    public static final Charset b = Charset.forName("UTF-8");

    public static ak a(@Nullable ad adVar, String str) {
        Object[] objArr = {adVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "209b47b14befc3f8afebb1088524b5e4", 6917529027641081856L)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "209b47b14befc3f8afebb1088524b5e4");
        }
        Charset charset = b;
        if (adVar != null && (charset = adVar.a()) == null) {
            charset = b;
        }
        return al.a(adVar, str.getBytes(charset));
    }
}
