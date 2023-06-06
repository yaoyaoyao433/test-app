package com.vivo.push;

import android.content.Intent;
import com.vivo.push.d.z;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IPushClientFactory {
    z createReceiveTask(o oVar);

    o createReceiverCommand(Intent intent);

    l createTask(o oVar);
}
