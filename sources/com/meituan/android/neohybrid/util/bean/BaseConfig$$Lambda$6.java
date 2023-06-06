package com.meituan.android.neohybrid.util.bean;

import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class BaseConfig$$Lambda$6 implements g.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map arg$1;

    public BaseConfig$$Lambda$6(Map map) {
        this.arg$1 = map;
    }

    public static g.a lambdaFactory$(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e25453de4fb3197cb03fb4b6b6bf69e9", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e25453de4fb3197cb03fb4b6b6bf69e9") : new BaseConfig$$Lambda$6(map);
    }

    @Override // com.meituan.android.neohybrid.util.g.a
    public final Field onSearch(Object obj, Field field) {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae6755cbbe6f0451b0812bc33556ad62", RobustBitConfig.DEFAULT_VALUE) ? (Field) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae6755cbbe6f0451b0812bc33556ad62") : BaseConfig.lambda$saveMap$3(this.arg$1, obj, field);
    }
}
