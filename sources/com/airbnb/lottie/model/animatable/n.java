package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {
    final List<com.airbnb.lottie.value.a<V>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(V v) {
        this(Collections.singletonList(new com.airbnb.lottie.value.a(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<com.airbnb.lottie.value.a<V>> list) {
        this.a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
