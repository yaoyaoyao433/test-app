package com.meituan.android.recce.shark;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    private static final List<Class> a = Arrays.asList(Integer.TYPE, Integer.class);
    private static final List<Class> b = Arrays.asList(Long.TYPE, Long.class);
    private static final List<Class> c = Arrays.asList(Float.TYPE, Float.class);
    private static final List<Class> d = Arrays.asList(Double.TYPE, Double.class);
    private static final List<Class> e = Arrays.asList(Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE);
    private static final List<Class> f = Arrays.asList(Boolean.TYPE, Boolean.class);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static final Type a = new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.recce.shark.l.a.1
        }.getType();
        public static final Type b = new TypeToken<Map<String, String>>() { // from class: com.meituan.android.recce.shark.l.a.2
        }.getType();
    }
}
