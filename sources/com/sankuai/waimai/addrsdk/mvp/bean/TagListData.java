package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TagListData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("tag_list")
    protected List<TagBean> tagList;

    public List<TagBean> getTagList() {
        return this.tagList;
    }

    public void setTagList(List<TagBean> list) {
        this.tagList = list;
    }
}
