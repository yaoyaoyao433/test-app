package com.dianping.picasso.view.nest;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface PicassoNestScrollParent {
    int getHorizontalScrollOffset();

    int getVerticalScrollOffset();

    boolean parentNestedScrollEnabled();

    boolean parentPullRefreshing();

    void setDisableIntercept(boolean z);

    void setNestScrollChildView(PicassoNestScrollChild picassoNestScrollChild);
}
