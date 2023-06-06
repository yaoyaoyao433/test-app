package org.apache.flink.cep.pattern.conditions;

import org.apache.flink.cep.pattern.conditions.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> extends d<T> {
    private static final long serialVersionUID = 1;

    public c(b<T> bVar, b<T> bVar2) {
        super(bVar, bVar2);
    }

    @Override // org.apache.flink.cep.pattern.conditions.b
    public final boolean filter(T t, b.a<T> aVar) throws Exception {
        return this.a[0].filter(t, aVar) && this.a[1].filter(t, aVar);
    }
}
