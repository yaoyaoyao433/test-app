package com.sankuai.waimai.store.manager.sequence.strategy;

import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    boolean isValid(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar);

    void rollback(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar);

    void updateValidStatus(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar);
}
