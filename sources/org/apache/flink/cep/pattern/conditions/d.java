package org.apache.flink.cep.pattern.conditions;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class d<T> extends e<T> {
    private static final long serialVersionUID = 1;
    final b<T>[] a;

    @SafeVarargs
    public d(b<T>... bVarArr) {
        for (b<T> bVar : bVarArr) {
            if (bVar == null) {
                throw new NullPointerException(String.valueOf("The condition cannot be null."));
            }
        }
        this.a = bVarArr;
    }
}
