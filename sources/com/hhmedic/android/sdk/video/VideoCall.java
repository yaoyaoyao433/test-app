package com.hhmedic.android.sdk.video;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.user.UserExtension;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.call.data.entity.Call;
import com.hhmedic.android.sdk.module.video.VideoBundle;
import com.hhmedic.android.sdk.video.chat.RtcVideoAct;
import com.tencent.mapsdk.internal.y;
import com.tencent.trtc.TRTCCloudDef;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VideoCall {
    public static void forLineUp(Context context, String str, long j) {
        forChatAct(context, VideoBundle.addCallInfo(VideoBundle.createBundle(str, null, 0), j, 0));
    }

    public static void forCall(Context context, Call call, long j) {
        forChatAct(context, VideoBundle.addCallInfo(VideoBundle.createBundle(call), j, 0));
    }

    private static void forChatAct(Context context, Bundle bundle) {
        try {
            Intent intent = new Intent(context, RtcVideoAct.class);
            intent.putExtra(VideoBundle.KEY_BUNDLE, bundle);
            intent.setFlags(y.a);
            context.startActivity(intent);
        } catch (Exception e) {
            Logger.e("for chatAct error:" + e.getLocalizedMessage());
        }
    }

    public static TRTCCloudDef.TRTCParams commonParams(Context context) {
        UserExtension userInfo = Caches.getUserInfo(context);
        TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
        tRTCParams.sdkAppId = 1400073238;
        tRTCParams.userId = String.valueOf(userInfo.uuid);
        tRTCParams.userSig = userInfo.tencentUserSign;
        return tRTCParams;
    }

    public static int getRoomId(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            return Integer.parseInt(str.substring(str.length() - 6));
        } catch (Exception e) {
            Logger.e(e.getMessage());
            return 0;
        }
    }
}
