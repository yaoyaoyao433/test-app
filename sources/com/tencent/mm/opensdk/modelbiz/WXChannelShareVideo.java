package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WXChannelShareVideo {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Req extends BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelShareVideo.Req";
        private static final String WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_channel_share_video_jump_info_identifier";
        public String extData;
        public IWXChannelJumpInfo jumpInfo;
        public String videoPath;

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            String str2;
            if (b.b(this.videoPath)) {
                str = TAG;
                str2 = "videoPath is null";
            } else {
                IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
                if (iWXChannelJumpInfo == null || iWXChannelJumpInfo.checkArgs()) {
                    return true;
                }
                str = TAG;
                str2 = "checkArgs fail, jumpInfo is invalid";
            }
            Log.e(str, str2);
            return false;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.videoPath = bundle.getString("_wxapi_finder_share_video_path");
            this.extData = bundle.getString("_wxapi_finder_share_video_extData");
            String string = bundle.getString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER);
            if (string != null) {
                try {
                    IWXChannelJumpInfo iWXChannelJumpInfo = (IWXChannelJumpInfo) Class.forName(string).newInstance();
                    this.jumpInfo = iWXChannelJumpInfo;
                    iWXChannelJumpInfo.unserialize(bundle);
                } catch (Exception e) {
                    Log.e(TAG, "get WXChannelJumpInfo from bundle failed: unknown ident " + string + ", ex = " + e.getMessage());
                }
            }
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 33;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_share_video_path", this.videoPath);
            bundle.putString("_wxapi_finder_share_video_extData", this.extData);
            IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
            if (iWXChannelJumpInfo != null) {
                bundle.putString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER, iWXChannelJumpInfo.getClass().getName());
                this.jumpInfo.serialize(bundle);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Resp extends BaseResp {
        public String extMsg;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 33;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }
    }
}
