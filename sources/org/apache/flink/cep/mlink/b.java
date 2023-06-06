package org.apache.flink.cep.mlink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.pattern.conditions.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b implements b.a<StreamData> {
    private Map<String, List<StreamData>> a;

    public b(Map<String, List<StreamData>> map) {
        this.a = map;
    }

    @Override // org.apache.flink.cep.pattern.conditions.b.a
    public final List<StreamData> a(String str) throws Exception {
        org.apache.flink.cep.common.c.a(str);
        if (this.a == null) {
            return new ArrayList();
        }
        return this.a.get(str);
    }
}
