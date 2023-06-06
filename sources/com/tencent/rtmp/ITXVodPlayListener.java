package com.tencent.rtmp;

import android.os.Bundle;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ITXVodPlayListener {
    void onNetStatus(TXVodPlayer tXVodPlayer, Bundle bundle);

    void onPlayEvent(TXVodPlayer tXVodPlayer, int i, Bundle bundle);
}
