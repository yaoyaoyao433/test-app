package com.meituan.msc.views.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Nullable
    public static <T> T a(@Nullable Context context, Class<? extends T> cls) {
        Object baseContext;
        Object[] objArr = {context, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = context;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b95b9044e2c106c4040fee144cb74e31", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b95b9044e2c106c4040fee144cb74e31");
        }
        while (!cls.isInstance(obj)) {
            if (!(obj instanceof ContextWrapper) || obj == (baseContext = obj.getBaseContext())) {
                return null;
            }
            obj = (T) baseContext;
        }
        return (T) obj;
    }
}
