package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.comment.CommentGood;
import com.sankuai.waimai.store.platform.domain.core.comment.Picture;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CommentDianpingBase implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<CommentGood> commentGoodsList;
    public int commentScore;
    public long commentTime;
    public String commentTimeDis;
    public String content;
    public int highQuality;
    public ArrayList<Picture> pictures;
    public String userAvatar;
    public String userName;

    public boolean isHighQuality() {
        return this.highQuality == 1;
    }

    public String getFormattedCommentTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e27dce2e487bc6a0ed2616b44a6381", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e27dce2e487bc6a0ed2616b44a6381");
        }
        if (this.commentTime > 0) {
            long j = this.commentTime * 1000;
            return String.format(Locale.US, "%tY.%tm.%td", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j));
        }
        return "";
    }
}
