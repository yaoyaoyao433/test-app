package com.meituan.msc.mmpviews.perflist;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.ViewGroup;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface a<T extends RecyclerView.s> {
    int a(int i);

    T a(ViewGroup viewGroup, int i);

    void a(int i, JSONObject jSONObject);

    void a(T t, int i);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, String str);

    JSONObject b();

    void b(int i);

    int getItemCount();
}
