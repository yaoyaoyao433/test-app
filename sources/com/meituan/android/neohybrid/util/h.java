package com.meituan.android.neohybrid.util;

import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements g.a {
    public static ChangeQuickRedirect a;
    private final String b;

    public h(String str) {
        this.b = str;
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e2ac2c52d35c2cad79536a3ff0b23f", RobustBitConfig.DEFAULT_VALUE) ? (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e2ac2c52d35c2cad79536a3ff0b23f") : g.a(this.b, obj, field);
    }
}
