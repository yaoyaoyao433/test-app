package com.sankuai.waimai.platform.domain.core.poi.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AnimatorProductBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("animate_conf")
    public String animateConf;
    @SerializedName("pic_info")
    public String picInfo;
    @SerializedName("picture")
    public String picture;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sku_id")
    public long skuId;

    public AnimatorPicInfoBean parsePicInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ee42b83c823611cb10310daeea78dd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorPicInfoBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ee42b83c823611cb10310daeea78dd6");
        }
        try {
            return (AnimatorPicInfoBean) k.a().fromJson(this.picInfo, (Class<Object>) AnimatorPicInfoBean.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public AnimatorBean parseAnimateConf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25e61a3f5d76ca4ae13302dd8e06855a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25e61a3f5d76ca4ae13302dd8e06855a");
        }
        if (this.animateConf != null) {
            try {
                return (AnimatorBean) k.a().fromJson(this.animateConf, (Class<Object>) AnimatorBean.class);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d339f69f412f96167761a5b7fe778617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d339f69f412f96167761a5b7fe778617");
            return;
        }
        try {
            this.skuId = jSONObject.optLong("sku_id");
            this.picture = jSONObject.optString("picture");
            this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
            this.picInfo = jSONObject.optString("pic_info");
            this.animateConf = jSONObject.optString("animate_conf");
        } catch (Exception e) {
            a.a(e);
        }
    }
}
