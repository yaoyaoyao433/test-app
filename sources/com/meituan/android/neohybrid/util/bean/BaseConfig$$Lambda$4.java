package com.meituan.android.neohybrid.util.bean;

import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class BaseConfig$$Lambda$4 implements g.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map arg$1;

    public BaseConfig$$Lambda$4(Map map) {
        this.arg$1 = map;
    }

    public static g.a lambdaFactory$(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b24ca3efbe0c63f9d39535b9e813c9e5", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b24ca3efbe0c63f9d39535b9e813c9e5") : new BaseConfig$$Lambda$4(map);
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2891215e7145d272d494aa19f58ec2", RobustBitConfig.DEFAULT_VALUE) ? (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2891215e7145d272d494aa19f58ec2") : BaseConfig.lambda$save$1(this.arg$1, obj, field);
    }
}
