package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g<T extends RecyclerView.s> extends RecyclerView.a<T> {
    public d a;
    public Context b;

    public g(@NonNull Context context, @NonNull d dVar) {
        this.b = context;
        this.a = dVar;
    }
}
