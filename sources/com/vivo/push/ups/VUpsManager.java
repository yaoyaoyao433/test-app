package com.vivo.push.ups;

import android.content.Context;
import android.os.Bundle;
import com.vivo.push.PushClient;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VUpsManager {
    public void onCommandResult(Context context, Bundle bundle) {
    }

    public static VUpsManager getInstance() {
        return a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a {
        private static VUpsManager a = new VUpsManager();
    }

    public void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOnPush(new com.vivo.push.ups.a(this, uPSRegisterCallback, context));
    }

    public void unRegisterToken(Context context, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOffPush(new b(this, uPSRegisterCallback));
    }

    public void turnOnPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOnPush(new c(this, uPSTurnCallback));
    }

    public void turnOffPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOffPush(new d(this, uPSTurnCallback));
    }
}
