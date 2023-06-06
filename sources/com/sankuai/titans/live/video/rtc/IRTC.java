package com.sankuai.titans.live.video.rtc;

import com.sankuai.titans.live.video.rtc.entity.RTCParams;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IRTC {
    void enterRoom(RTCParams rTCParams);

    void exitRoom();

    void muteAllRemoteAudio(boolean z);

    void muteLocalAudio(boolean z);

    void setLocalViewFillMode(int i);

    void setSubRect(JSONObject jSONObject);

    void switchCamera();

    void switchPicInPic();
}
