package com.sankuai.waimai.store.manager.sequence.strategy;

import android.support.annotation.Nullable;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T> implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    protected T mRuleData;

    public b(String str) {
        this.mRuleData = (T) i.a(str, new TypeToken<T>() { // from class: com.sankuai.waimai.store.manager.sequence.strategy.b.1
        }.getType());
    }
}
