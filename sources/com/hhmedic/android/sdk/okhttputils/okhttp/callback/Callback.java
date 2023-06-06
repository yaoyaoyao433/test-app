package com.hhmedic.android.sdk.okhttputils.okhttp.callback;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class Callback<T> {
    public static Callback CALLBACK_DEFAULT = new Callback() { // from class: com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback.1
        @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
        public final void onError(Call call, Exception exc, int i) {
        }

        @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
        public final void onResponse(Object obj, int i) {
        }

        @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
        public final Object parseNetworkResponse(Response response, int i) throws Exception {
            return null;
        }
    };

    public void inProgress(float f, long j, int i) {
    }

    public void onAfter(int i) {
    }

    public void onBefore(Request request, int i) {
    }

    public abstract void onError(Call call, Exception exc, int i);

    public abstract void onResponse(T t, int i);

    public abstract T parseNetworkResponse(Response response, int i) throws Exception;

    public boolean validateReponse(Response response, int i) {
        return response.isSuccessful();
    }
}
