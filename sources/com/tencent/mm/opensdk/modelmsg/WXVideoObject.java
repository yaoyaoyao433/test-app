package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WXVideoObject implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXVideoObject";
    public String videoLowBandUrl;
    public String videoUrl;

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2;
        String str3;
        String str4 = this.videoUrl;
        if ((str4 == null || str4.length() == 0) && ((str = this.videoLowBandUrl) == null || str.length() == 0)) {
            str2 = TAG;
            str3 = "both arguments are null";
        } else {
            String str5 = this.videoUrl;
            if (str5 == null || str5.length() <= 10240) {
                String str6 = this.videoLowBandUrl;
                if (str6 == null || str6.length() <= 10240) {
                    return true;
                }
                str2 = TAG;
                str3 = "checkArgs fail, videoLowBandUrl is too long";
            } else {
                str2 = TAG;
                str3 = "checkArgs fail, videoUrl is too long";
            }
        }
        Log.e(str2, str3);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxvideoobject_videoUrl", this.videoUrl);
        bundle.putString("_wxvideoobject_videoLowBandUrl", this.videoLowBandUrl);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 4;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.videoUrl = bundle.getString("_wxvideoobject_videoUrl");
        this.videoLowBandUrl = bundle.getString("_wxvideoobject_videoLowBandUrl");
    }
}
