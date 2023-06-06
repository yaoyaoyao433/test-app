package com.sankuai.meituan.retrofit2;

import android.support.annotation.Nullable;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ac {
    public static ChangeQuickRedirect a;
    public static final Charset b = StandardCharsets.UTF_8;

    public static ak a(@Nullable ad adVar, String str, String str2) {
        byte[] bytes;
        Object[] objArr = {adVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7298eb2e5a2e9252a55a71e94bc79d14", 6917529027641081856L)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7298eb2e5a2e9252a55a71e94bc79d14");
        }
        Charset charset = b;
        if (adVar != null && (charset = adVar.a()) == null) {
            charset = b;
        }
        if ("base64".equals(str2)) {
            bytes = Base64.decode(str, 0);
        } else {
            bytes = str.getBytes(charset);
        }
        return al.a(adVar, bytes);
    }
}
