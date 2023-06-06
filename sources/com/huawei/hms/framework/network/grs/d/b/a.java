package com.huawei.hms.framework.network.grs.d.b;

import android.content.Context;
import com.huawei.secure.android.common.ssl.b;
import com.huawei.secure.android.common.ssl.d;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static HostnameVerifier a() {
        return new com.huawei.secure.android.common.ssl.hostname.a();
    }

    public static SSLSocketFactory a(Context context) {
        try {
            return new b(new d(context.getAssets().open("grs_sp.bks"), ""));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
