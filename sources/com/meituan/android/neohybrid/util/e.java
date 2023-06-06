package com.meituan.android.neohybrid.util;

import android.webkit.WebViewClient;
import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements g.a {
    public static ChangeQuickRedirect a;
    private static final e b = new e();

    public static g.a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object accessDispatch;
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abaf35c04cb0ddb52ce812ce5ab60462", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abaf35c04cb0ddb52ce812ce5ab60462");
        } else {
            Object[] objArr2 = {obj, field};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c452563eb0ffe8f5dbcf28ed444a6021", RobustBitConfig.DEFAULT_VALUE)) {
                if (WebViewClient.class.isAssignableFrom(field.getType())) {
                    return field;
                }
                return null;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c452563eb0ffe8f5dbcf28ed444a6021");
        }
        return (Field) accessDispatch;
    }
}
