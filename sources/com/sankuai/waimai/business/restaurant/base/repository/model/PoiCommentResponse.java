package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.comment.BasePoiCommentResponse;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiCommentResponse extends BasePoiCommentResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_label_tips")
    public List<c> commentLabelTipList;
    @SerializedName("comments")
    @Expose(deserialize = false, serialize = false)
    public ArrayList<Comment> commentList;
    @SerializedName("last_page_comment_tip")
    public String lastPageCommentTip;
    @SerializedName("last_page_comment_title")
    public String lastPageCommentTitle;
    @SerializedName("last_page_comment_url")
    public String lastPageCommentUrl;
    @SerializedName("show_user_comment_entrance")
    public int showUserCommentEntrance;

    public boolean hasTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3e1e2a14915ec0451c2684d3dbced4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3e1e2a14915ec0451c2684d3dbced4")).booleanValue() : com.sankuai.waimai.foundation.utils.b.a(this.scoreTypeInfos);
    }

    public ArrayList<Comment> getCommentList() {
        return this.commentList;
    }

    public void setCommentList(ArrayList<Comment> arrayList) {
        this.commentList = arrayList;
    }

    public boolean isShowUserCommentEntrance() {
        return this.showUserCommentEntrance == 1;
    }
}
