package com.meituan.android.neohybrid.util;

import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.ui.NavigateBarHost;
import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g.a {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static g.a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object accessDispatch;
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ddbef52e0dc37b3affc82ae933b7bc5", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ddbef52e0dc37b3affc82ae933b7bc5");
        } else {
            Object[] objArr2 = {obj, field};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "899e70697e592fcb42a242ead9beb62c", RobustBitConfig.DEFAULT_VALUE)) {
                Class<?> type = field.getType();
                if (NavigateBarHost.class.isAssignableFrom(type) && KNBJsHost.class.isAssignableFrom(type)) {
                    return field;
                }
                return null;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "899e70697e592fcb42a242ead9beb62c");
        }
        return (Field) accessDispatch;
    }
}
