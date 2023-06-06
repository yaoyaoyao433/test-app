package com.meituan.android.neohybrid.util.bean;

import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class BaseConfig$$Lambda$5 implements g.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map arg$1;
    private final Object arg$2;

    public BaseConfig$$Lambda$5(Map map, Object obj) {
        this.arg$1 = map;
        this.arg$2 = obj;
    }

    public static g.a lambdaFactory$(Map map, Object obj) {
        Object[] objArr = {map, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2a6331d430f49160442f738a5c4e41f", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2a6331d430f49160442f738a5c4e41f") : new BaseConfig$$Lambda$5(map, obj);
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1395418356cae47d6e2478367ed90c1c", RobustBitConfig.DEFAULT_VALUE) ? (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1395418356cae47d6e2478367ed90c1c") : BaseConfig.lambda$bindMap$2(this.arg$1, this.arg$2, obj, field);
    }
}
