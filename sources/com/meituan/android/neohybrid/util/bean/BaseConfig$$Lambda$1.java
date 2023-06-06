package com.meituan.android.neohybrid.util.bean;

import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class BaseConfig$$Lambda$1 implements g.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map arg$1;

    public BaseConfig$$Lambda$1(Map map) {
        this.arg$1 = map;
    }

    public static g.a lambdaFactory$(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e74274168b7d3a98025455f58c8436b5", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e74274168b7d3a98025455f58c8436b5") : new BaseConfig$$Lambda$1(map);
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c073f3f9b975f96f384304c213b00fd5", RobustBitConfig.DEFAULT_VALUE) ? (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c073f3f9b975f96f384304c213b00fd5") : BaseConfig.lambda$parse$0(this.arg$1, obj, field);
    }
}
