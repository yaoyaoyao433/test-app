package retrofit;

import retrofit.client.Response;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Callback<T> {
    void failure(RetrofitError retrofitError);

    void success(T t, Response response);
}
