package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.label.RooLabel;
import com.sankuai.waimai.platform.domain.core.comment.CommentLabel;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTypeInfo;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public class PoiCommentLabelView extends RooLabel {
    public static ChangeQuickRedirect b;
    private CommentLabel c;
    private PoiCommentTypeInfo d;

    public PoiCommentLabelView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02e9c84afd3055f2897ca40c47c2171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02e9c84afd3055f2897ca40c47c2171");
        }
    }

    public PoiCommentLabelView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73e4ff0c0b35965220632762d0d5c0ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73e4ff0c0b35965220632762d0d5c0ab");
        }
    }

    public PoiCommentLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5373f03c5f1b65bdce7634611122c3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5373f03c5f1b65bdce7634611122c3d");
        }
    }

    @Deprecated
    public void setCommentLabel(CommentLabel commentLabel) {
        Object[] objArr = {commentLabel};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fd745fb2ff60e5685d85e41e288f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fd745fb2ff60e5685d85e41e288f5f");
            return;
        }
        this.c = commentLabel;
        this.d = null;
        if (commentLabel != null) {
            setText(commentLabel.content + StringUtil.SPACE + commentLabel.labelCount);
        }
    }

    @Deprecated
    public CommentLabel getCommentLabel() {
        return this.c;
    }

    @Deprecated
    public void setCommentTypeInfo(PoiCommentTypeInfo poiCommentTypeInfo) {
        Object[] objArr = {poiCommentTypeInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12082c5463f98235190ea3ae154ecf31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12082c5463f98235190ea3ae154ecf31");
            return;
        }
        this.d = poiCommentTypeInfo;
        this.c = null;
        if (poiCommentTypeInfo != null) {
            setText(poiCommentTypeInfo.commentScoreTitle + StringUtil.SPACE + poiCommentTypeInfo.totalCount);
        }
    }

    @Deprecated
    public PoiCommentTypeInfo getCommentTypeInfo() {
        return this.d;
    }
}
