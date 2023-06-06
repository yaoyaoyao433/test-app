package com.sankuai.meituan.mapfoundation.starship;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a<T> {
        void a(int i, Map<String, Object> map, T t);

        void a(Exception exc);
    }

    <T> void a(String str, Map<String, Object> map, Map<String, Object> map2, a<T> aVar);

    void cancel(a aVar);
}
