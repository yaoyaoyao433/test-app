package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends a<String, c> {
    public static ChangeQuickRedirect b;
    private Map<String, c> c;

    @Override // com.sankuai.waimai.alita.core.dataupload.a
    @NonNull
    public final Map<String, c> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548ee6c55cfd7849620a9c4b4bd72b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548ee6c55cfd7849620a9c4b4bd72b5f");
        }
        if (this.c == null) {
            this.c = new LinkedHashMap<String, c>() { // from class: com.sankuai.waimai.alita.core.dataupload.g.1
                public static ChangeQuickRedirect a;

                @Override // java.util.LinkedHashMap
                public final boolean removeEldestEntry(Map.Entry<String, c> entry) {
                    Object[] objArr2 = {entry};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7a6fc08b963a928c2f51d126cfea2a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7a6fc08b963a928c2f51d126cfea2a2")).booleanValue() : size() > 1024;
                }
            };
        }
        return this.c;
    }
}
