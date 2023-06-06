package com.huawei.agconnect.core.a;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    private Map<Class<?>, com.huawei.agconnect.core.a> a = new HashMap();
    private Map<Class<?>, Object> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<com.huawei.agconnect.core.a> list) {
        if (list == null) {
            return;
        }
        for (com.huawei.agconnect.core.a aVar : list) {
            this.a.put(aVar.a, aVar);
        }
    }
}
