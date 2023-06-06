package com.sankuai.waimai.business.search.adapterdelegates;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c<T> {
    @NonNull
    public abstract RecyclerView.s a(@NonNull ViewGroup viewGroup);

    public void a(@NonNull RecyclerView.s sVar) {
    }

    public abstract void a(@NonNull T t, int i, @NonNull RecyclerView.s sVar, @NonNull List<Object> list);

    public abstract boolean a(@NonNull T t, int i);

    public void b(@NonNull RecyclerView.s sVar) {
    }
}
