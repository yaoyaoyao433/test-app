package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LevelInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    public String desc;
    @SerializedName("level")
    public int level;

    public int getLevel() {
        return this.level;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }
}
