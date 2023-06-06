package com.sankuai.titans.live.video.rtc;

import android.os.Bundle;
import com.sankuai.meituan.mtlive.mtrtc.library.c;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IRTCJSBack {
    void onEnterRoom(long j);

    void onError(int i, String str, Bundle bundle);

    void onNetworkQuality(c.C0611c c0611c, ArrayList<c.C0611c> arrayList);

    void onRemoteUserEnterRoom(String str);

    void onRemoteUserLeaveRoom(String str, int i);

    void onUserVoiceVolume(ArrayList<c.f> arrayList, int i);
}
