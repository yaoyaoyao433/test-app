package com.sankuai.waimai.pouch.unionanim;

import android.support.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface UnionAnimReporter {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FailReason {
    }

    void a(int i, @Nullable Map<String, Object> map);
}
