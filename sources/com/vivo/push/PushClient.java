package com.vivo.push;

import android.content.Context;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PushClient {
    public static final String DEFAULT_REQUEST_ID = "1";
    private static volatile PushClient sPushClient;

    public String getVersion() {
        return "3.4.0.0";
    }

    private PushClient(Context context) {
        e.a().a(context);
    }

    public static synchronized PushClient getInstance(Context context) {
        PushClient pushClient;
        synchronized (PushClient.class) {
            if (sPushClient == null) {
                sPushClient = new PushClient(context.getApplicationContext());
            }
            pushClient = sPushClient;
        }
        return pushClient;
    }

    public void initialize() throws VivoPushException {
        checkManifest();
        e.a().a(new com.vivo.push.b.f());
    }

    public void checkManifest() throws VivoPushException {
        e.a().b();
    }

    private void checkParam(String str) {
        if (str == null) {
            throw new IllegalArgumentException("PushManager String param should not be ".concat(String.valueOf(str)));
        }
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        e.a().a(str, iPushActionListener);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        e.a().b(str, iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        e.a().a(iPushActionListener);
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        e.a().b(iPushActionListener);
    }

    public String getAlias() {
        return e.a().j();
    }

    public String getRegId() {
        return e.a().f();
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        e.a().a(arrayList, iPushActionListener);
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        e.a().b(arrayList, iPushActionListener);
    }

    public List<String> getTopics() {
        return e.a().c();
    }

    public void setSystemModel(boolean z) {
        e.a().a(z);
    }

    public boolean isSupport() {
        return e.a().d();
    }
}
