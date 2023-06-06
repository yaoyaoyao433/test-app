package com.meituan.android.neohybrid.util.gson.checker;

import java.lang.annotation.Annotation;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements a<Annotation> {
    @Override // com.meituan.android.neohybrid.util.gson.checker.a
    public final <V> String a(Annotation annotation, V v) {
        if (v != null) {
            return null;
        }
        return "RequiredChecker: value is required";
    }
}
