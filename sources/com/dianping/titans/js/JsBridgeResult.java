package com.dianping.titans.js;

import android.text.TextUtils;
import com.dianping.titansmodel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JsBridgeResult extends g {
    public static final String ARG_KEY_CHOOSE_MEDIA_COUNT = "count";
    public static final String ARG_KEY_CHOOSE_MEDIA_OPTIONS = "options";
    public static final String ARG_KEY_EDIT_MEDIA_VIDEO_ID = "videoId";
    public static final String ARG_KEY_GET_MEDIA_FRAME_INDEX = "index";
    public static final String ARG_KEY_GET_MEDIA_FRAME_VIDEO_ID = "videoId";
    public static final String ARG_KEY_LOCATION_MODE = "mode";
    public static final String ARG_KEY_LOCATION_RAW = "raw";
    public static final String ARG_KEY_LOCATION_TIME_OUT = "timeout";
    public static final String ARG_KEY_LOCATION_TYPE = "type";
    public static final String ARG_KEY_PLAY_MEDIA_TYPE = "type";
    public static final String ARG_KEY_PLAY_MEDIA_VIDEO_ID = "videoId";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_CONTENT = "content";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_ID = "miniProgramId";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_IMAGE = "image";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_PATH = "path";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_TITLE = "title";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_TYPE = "type";
    public static final String ARG_KEY_SHARE_MINI_PROGRAM_URL = "url";
    public static final String ARG_KEY_UPLOAD_MEDIA_CHANNEL = "channel";
    public static final String ARG_KEY_UPLOAD_MEDIA_OPTIONS = "options";
    public static final String ARG_KEY_UPLOAD_MEDIA_VIDEO_ID = "videoId";
    public static final String LOCATION_TYPE_GCJ02 = "GCJ02";
    public static final String LOCATION_TYPE_WGS84 = "WGS84";
    public static final String PROPERTY_CHOOSE_MEDIA_EXTRA = "extra";
    public static final String PROPERTY_CHOOSE_MEDIA_FPS = "fps";
    public static final String PROPERTY_CHOOSE_MEDIA_KBPS = "kbps";
    public static final String PROPERTY_CHOOSE_MEDIA_RESOLUTION_HEIGHT = "resolutionHeight";
    public static final String PROPERTY_CHOOSE_MEDIA_RESOLUTION_WIDTH = "resolutionWidth";
    public static final String PROPERTY_CHOOSE_MEDIA_SIZE = "size";
    public static final String PROPERTY_CHOOSE_MEDIA_TYPE = "type";
    public static final String PROPERTY_CHOOSE_MEDIA_VIDEO_ID = "videoId";
    public static final String PROPERTY_CHOOSE_MEDIA_VIDEO_LIST = "videoList";
    public static final String PROPERTY_DIRECTION = "direction";
    public static final String PROPERTY_EDIT_MEDIA_EXTRA = "extra";
    public static final String PROPERTY_EDIT_MEDIA_RESULT_VIDEO_ID = "resultVideoId";
    public static final String PROPERTY_GET_MEDIA_FRAME_FRAME = "frame";
    public static final String PROPERTY_LOCATION_ACCURACY = "accuracy";
    public static final String PROPERTY_LOCATION_ALTITUDE = "altitude";
    public static final String PROPERTY_LOCATION_LAT = "lat";
    public static final String PROPERTY_LOCATION_LNG = "lng";
    public static final String PROPERTY_LOCATION_RAW = "raw";
    public static final String PROPERTY_LOCATION_VELOCITY = "velocity";
    public static final String PROPERTY_RESERVED_ERR_CODE = "errorCode";
    public static final String PROPERTY_RESERVED_ERR_MSG = "errorMsg";
    public static final String PROPERTY_RESERVED_RESULT = "result";
    public static final String PROPERTY_RESERVED_STATUS = "status";
    public static final String PROPERTY_UPLOAD_MEDIA_EXTRA = "extra";
    public static final String PROPERTY_UPLOAD_MEDIA_MEDIA_RESOURCE_ID = "mediaResourceId";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, Object> mProperties;

    @Override // com.dianping.titansmodel.g
    public void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2217529e08f8866b1991ef8131d3a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2217529e08f8866b1991ef8131d3a94");
        } else if (jSONObject != null) {
            try {
                jSONObject.put("status", this.status);
                jSONObject.put("errorCode", this.errorCode);
                jSONObject.put("errorMsg", this.errorMsg);
                jSONObject.put("result", this.result);
                if (this.mProperties != null) {
                    for (Map.Entry<String, Object> entry : this.mProperties.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dfb103d0071b1a9424139b883d46b71", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dfb103d0071b1a9424139b883d46b71");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }

    private boolean ifReservedKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98edf9d7d65107e24a3376bd0afc0e73", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98edf9d7d65107e24a3376bd0afc0e73")).booleanValue() : "status".equalsIgnoreCase(str) || "errorCode".equalsIgnoreCase(str) || "errorMsg".equalsIgnoreCase(str) || "result".equalsIgnoreCase(str);
    }

    public void putProperty(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ad8154886afa48a80b2b54d8ca04580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ad8154886afa48a80b2b54d8ca04580");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (ifReservedKey(str)) {
                throw new IllegalArgumentException("reserved key '" + str + CommonConstant.Symbol.SINGLE_QUOTES);
            }
            if (this.mProperties == null) {
                this.mProperties = new HashMap<>();
            }
            this.mProperties.put(str, obj);
        }
    }

    public <T> T getProperty(Class<T> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78b51fc53075e384460e2892daa86809", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78b51fc53075e384460e2892daa86809");
        }
        if (cls == null || TextUtils.isEmpty(str) || this.mProperties == null || this.mProperties.isEmpty()) {
            return null;
        }
        return cls.cast(this.mProperties.get(str));
    }
}
