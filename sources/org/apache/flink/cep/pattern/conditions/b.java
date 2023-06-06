package org.apache.flink.cep.pattern.conditions;

import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class b<T> implements Serializable, org.apache.flink.cep.common.function.a {
    private static final long serialVersionUID = 7067817235759351255L;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a<T> {
        List<T> a(String str) throws Exception;
    }

    public abstract boolean filter(T t, a<T> aVar) throws Exception;
}
