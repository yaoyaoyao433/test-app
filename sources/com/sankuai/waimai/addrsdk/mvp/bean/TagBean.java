package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TagBean implements Serializable {
    public static final int CABINET_TAG = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("color")
    private String color;
    @SerializedName("opacity")
    private double opacity;
    @SerializedName("tag_icon_url")
    private String tagIconUrl;
    @SerializedName("tag_id")
    private int tagId;
    @SerializedName("tag_name")
    private String tagName;

    public int getTagId() {
        return this.tagId;
    }

    public void setTagId(int i) {
        this.tagId = i;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }

    public String getTagIconUrl() {
        return this.tagIconUrl;
    }

    public void setTagIconUrl(String str) {
        this.tagIconUrl = str;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public double getOpacity() {
        return this.opacity;
    }

    public void setOpacity(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a2100abccea66c6e8a944a42f967065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a2100abccea66c6e8a944a42f967065");
        } else {
            this.opacity = d;
        }
    }

    public boolean isCabinetTag() {
        return this.tagId == 4;
    }
}
