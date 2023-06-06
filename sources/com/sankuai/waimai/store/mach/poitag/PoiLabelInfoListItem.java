package com.sankuai.waimai.store.mach.poitag;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiLabelInfoListItem implements Serializable {
    public static final int LABEL_TYPE_ACTIVITY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("content")
    public String content;
    @SerializedName("content_color")
    public String contentColor;
    @SerializedName("label_background_color")
    public String labelBackgroundColor;
    @SerializedName("label_frame_color")
    public String labelFrameColor;
    private Integer mBackgroundColorInt;
    private boolean mColorParsed;
    private Integer mContentColorInt;
    private Integer mFrameColorInt;
    private Integer mPreBackgroundColorInt;
    private Integer mPreContentColorInt;
    @SerializedName("poi_service_type")
    public int poiServiceType;
    @SerializedName("pre_content")
    public String preContent;
    @SerializedName("pre_content_color")
    public String preContentColor;
    @SerializedName("pre_label_background_color")
    public String preLabelBackgroundColor;
    @SerializedName("priority")
    public int priority;
    private String tagBgStyle;
    private String tagPreBgStyle;
    public int tagType;
    @SerializedName("type")
    public int type;

    public PoiLabelInfoListItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de2b926f0fee2e68fdfb896ce777d7a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de2b926f0fee2e68fdfb896ce777d7a0");
            return;
        }
        this.mColorParsed = false;
        this.tagBgStyle = "";
        this.tagPreBgStyle = "";
    }

    public void parseColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ae94ac2e3bc1d704434fae0b0c73bfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ae94ac2e3bc1d704434fae0b0c73bfc");
        } else if (this.mColorParsed) {
        } else {
            this.mContentColorInt = d.a(this.contentColor);
            this.mBackgroundColorInt = d.a(this.labelBackgroundColor);
            this.mFrameColorInt = d.a(this.labelFrameColor);
            this.mPreContentColorInt = d.a(this.preContentColor);
            this.mPreBackgroundColorInt = d.a(this.preLabelBackgroundColor);
            this.tagBgStyle = TextUtils.join(CommonConstant.Symbol.UNDERLINE, new Object[]{this.mBackgroundColorInt, this.mFrameColorInt});
            this.tagPreBgStyle = String.valueOf(this.preLabelBackgroundColor);
            this.mColorParsed = true;
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60d819f8f69a7ca5880c2e2a4dbc2c3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60d819f8f69a7ca5880c2e2a4dbc2c3c");
        } else if (jSONObject == null) {
        } else {
            this.content = jSONObject.optString("content");
            this.contentColor = jSONObject.optString("content_color");
            this.labelBackgroundColor = jSONObject.optString("label_background_color");
            this.labelFrameColor = jSONObject.optString("label_frame_color");
            this.type = jSONObject.optInt("type");
            this.activityType = jSONObject.optInt("activity_type");
            this.priority = jSONObject.optInt("priority");
            this.poiServiceType = jSONObject.optInt("poi_service_type");
        }
    }

    public int getPreContentColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcf81109b7092b5d11ec52038bc8b481", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcf81109b7092b5d11ec52038bc8b481")).intValue();
        }
        parseColor();
        return this.mPreContentColorInt == null ? i : this.mPreContentColorInt.intValue();
    }

    public int getContentColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bbf3fe34fcbc0c6ac7ffddce562f55c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bbf3fe34fcbc0c6ac7ffddce562f55c")).intValue();
        }
        parseColor();
        return this.mContentColorInt == null ? i : this.mContentColorInt.intValue();
    }

    public int getBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c03eecb61c5cbd2f84de2357acc6d229", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c03eecb61c5cbd2f84de2357acc6d229")).intValue();
        }
        parseColor();
        return this.mBackgroundColorInt == null ? i : this.mBackgroundColorInt.intValue();
    }

    public int getFrameColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6a64bd0663a57d4d0e52f83a659427b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6a64bd0663a57d4d0e52f83a659427b")).intValue();
        }
        parseColor();
        return this.mFrameColorInt == null ? i : this.mFrameColorInt.intValue();
    }

    public int getPreBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2c8a618d8031a1ed7c9887895a2ab27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2c8a618d8031a1ed7c9887895a2ab27")).intValue();
        }
        parseColor();
        return this.mPreBackgroundColorInt == null ? i : this.mPreBackgroundColorInt.intValue();
    }
}
