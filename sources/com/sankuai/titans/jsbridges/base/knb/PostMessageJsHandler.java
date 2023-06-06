package com.sankuai.titans.jsbridges.base.knb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.StrictJsBridge;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PostMessageJsHandler extends StrictJsBridge<PostMessageParam, Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PostMessageParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("data")
        @Expose
        public JSONObject data;
        @SerializedName("type")
        @Expose
        public String type;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(PostMessageParam postMessageParam) {
        Object[] objArr = {postMessageParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db17de2c4707dda6ef90f3798623c35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db17de2c4707dda6ef90f3798623c35e");
        } else {
            jsHost().getMsgCenter().publish(postMessageParam.type, postMessageParam.data);
        }
    }
}
