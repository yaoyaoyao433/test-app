package com.sankuai.titans.live.video.rtc;

import android.view.View;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IRTCView {
    void clear();

    void onChannelAdded(String str, View view);

    void onChannelRemove(String str);

    void setSubRect(JSONObject jSONObject);

    void switchPicInPic();
}
