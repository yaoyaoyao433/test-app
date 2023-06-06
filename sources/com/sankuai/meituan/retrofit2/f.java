package com.sankuai.meituan.retrofit2;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface f<T> {
    void onFailure(Call<T> call, Throwable th);

    void onResponse(Call<T> call, Response<T> response);
}
