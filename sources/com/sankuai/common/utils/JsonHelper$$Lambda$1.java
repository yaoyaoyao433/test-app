package com.sankuai.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class JsonHelper$$Lambda$1 implements JsonHelper.MapProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final JsonHelper$$Lambda$1 instance = new JsonHelper$$Lambda$1();

    @Override // com.sankuai.common.utils.JsonHelper.MapProvider
    public final Map createMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Map) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b9c53ae3fab34b4a2b7b4efe6f07c8d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b9c53ae3fab34b4a2b7b4efe6f07c8d") : new LinkedHashMap());
    }
}
