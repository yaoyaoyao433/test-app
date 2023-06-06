package org.apache.flink.cep.pattern.conditions;

import org.apache.flink.cep.pattern.conditions.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f<T> extends d<T> {
    private static final long serialVersionUID = 1;

    public f(b<T> bVar) {
        super(bVar);
    }

    @Override // org.apache.flink.cep.pattern.conditions.b
    public final boolean filter(T t, b.a<T> aVar) throws Exception {
        return !this.a[0].filter(t, aVar);
    }
}
