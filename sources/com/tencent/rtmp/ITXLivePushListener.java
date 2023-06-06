package com.tencent.rtmp;

import android.os.Bundle;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ITXLivePushListener {
    void onNetStatus(Bundle bundle);

    void onPushEvent(int i, Bundle bundle);
}
