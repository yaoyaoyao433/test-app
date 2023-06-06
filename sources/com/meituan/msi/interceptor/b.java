package com.meituan.msi.interceptor;

import android.support.annotation.NonNull;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.MsiContext;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        ApiRequest<?> a();

        ApiResponse<?> a(ApiRequest<?> apiRequest) throws ApiException;

        @NonNull
        MsiContext b();
    }

    int a();

    ApiResponse<?> a(a aVar) throws ApiException;
}
