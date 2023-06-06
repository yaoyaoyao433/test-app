package com.sankuai.waimai.store.platform.domain.core.tip;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SCShareTip extends ShareTip {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("share_label_img")
    public String shareLabelImg;
    @SerializedName("share_scheme")
    public String shareScheme;

    @Override // com.sankuai.waimai.platform.domain.core.Share.ShareTip
    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9568af763efa9b4f5641b8e68df4d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9568af763efa9b4f5641b8e68df4d64");
            return;
        }
        super.parseJson(jSONObject);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("share_info");
            if (optJSONObject != null) {
                SCShareInfo sCShareInfo = new SCShareInfo();
                sCShareInfo.parseJson(optJSONObject);
                setIcon(sCShareInfo.icon);
                setTitle(sCShareInfo.title);
                setContent(sCShareInfo.content);
                setUrl(sCShareInfo.url);
                setWeixinUrl(sCShareInfo.weixinUrl);
                this.shareLabelImg = sCShareInfo.shareLabelImg;
                this.shareScheme = sCShareInfo.shareScheme;
                this.shareInfo = sCShareInfo;
            }
        } catch (Exception unused) {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class SCShareInfo extends ShareTip.ShareInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("share_label_img")
        public String shareLabelImg;
        @SerializedName("share_scheme")
        public String shareScheme;

        public SCShareInfo() {
            super();
            Object[] objArr = {SCShareTip.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b01f6b3a1d51788b757b055f8fe09d8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b01f6b3a1d51788b757b055f8fe09d8e");
            }
        }

        @Override // com.sankuai.waimai.platform.domain.core.Share.ShareTip.ShareInfo
        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9898babcb7b77755f0de7f60783b3257", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9898babcb7b77755f0de7f60783b3257");
                return;
            }
            super.parseJson(jSONObject);
            try {
                this.shareLabelImg = jSONObject.optString("share_label_img");
                this.shareScheme = jSONObject.optString("share_scheme");
            } catch (Exception e) {
                a.a(e);
            }
        }
    }
}
