package com.sankuai.waimai.irmo.render.bean.layers;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoEffectParams extends EffectParams {
    private static final String DSL_CONFIG_ASS_ID = "config_ass_id";
    private static final String DSL_CONTENT_MODE = "content_mode";
    private static final String DSL_COUNT = "count";
    private static final String DSL_ERROR_ASS_ID = "error_ass_id";
    private static final String DSL_FIRST_FRAME_ASS_ID = "first_frame_ass_id";
    private static final String DSL_KEEP_LAST_FRAME = "keep_last_frame";
    private static final String DSL_MD5_ASS_ID = "md5_ass_id";
    private static final String DSL_VIDEO_ASS_ID = "video_ass_id";
    private static final String DSL_VOLUME_CONTROL_VISIBLE = "volume_control_visible";
    private static final String TAG = "Video_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String configAssId;
    public int contentMode;
    public int count;
    public String errorAssId;
    public String firstFrameAssId;
    public boolean keepLastFrame;
    public String md5AssId;
    public String videoAssId;
    public boolean volumeControlVisible;

    public VideoEffectParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ae16bb399181eb6aa9627ed1715d0f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ae16bb399181eb6aa9627ed1715d0f3");
        } else {
            this.keepLastFrame = true;
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7213cb0a1278dd85a5ec64c2ecdf3d72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7213cb0a1278dd85a5ec64c2ecdf3d72")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            this.count = jSONObject.getInt("count");
            this.contentMode = jSONObject.getInt(DSL_CONTENT_MODE);
            this.keepLastFrame = jSONObject.getBoolean(DSL_KEEP_LAST_FRAME);
            this.volumeControlVisible = jSONObject.getBoolean(DSL_VOLUME_CONTROL_VISIBLE);
            this.errorAssId = jSONObject.getString(DSL_ERROR_ASS_ID);
            this.firstFrameAssId = jSONObject.getString(DSL_FIRST_FRAME_ASS_ID);
            this.videoAssId = jSONObject.getString(DSL_VIDEO_ASS_ID);
            this.configAssId = jSONObject.getString(DSL_CONFIG_ASS_ID);
            this.md5AssId = jSONObject.getString(DSL_MD5_ASS_ID);
            return true;
        } catch (JSONException e) {
            a.a(TAG, "VideoEffectParams parse fail", e);
            return false;
        }
    }
}
