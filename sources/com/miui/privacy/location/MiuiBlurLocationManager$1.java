package com.miui.privacy.location;

import android.os.Bundle;
import android.os.Message;
import com.android.internal.app.IMessenger;
import com.miui.privacy.location.a;
/* loaded from: classes3.dex */
public class MiuiBlurLocationManager$1 extends IMessenger.Stub {
    final /* synthetic */ a.InterfaceC0533a val$observer;

    MiuiBlurLocationManager$1(a.InterfaceC0533a interfaceC0533a) {
        this.val$observer = interfaceC0533a;
    }

    @Override // com.android.internal.app.IMessenger
    public void send(Message message) {
        Bundle data = message.getData();
        data.getDouble("key_latitude", -1.0d);
        data.getDouble("key_longitude", -1.0d);
        data.getInt("key_accuracy", -1);
        int i = message.arg1;
    }
}
