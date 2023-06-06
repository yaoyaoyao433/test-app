package retrofit.android;

import android.net.http.AndroidHttpClient;
import retrofit.client.ApacheClient;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class AndroidApacheClient extends ApacheClient {
    public AndroidApacheClient() {
        super(AndroidHttpClient.newInstance("Retrofit"));
    }
}
