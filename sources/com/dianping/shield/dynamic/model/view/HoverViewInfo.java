package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfo;", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfoProps;", "()V", DMKeys.KEY_POP_VIEW_INFO_DISMISS_ANIMATION_TYPE, "", "getDismissAnimationType", "()Ljava/lang/Integer;", "setDismissAnimationType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_FLOAT_VIEW_INFO_NEED_FOLLOW_SCROLL, "", "getNeedFollowScroll", "()Ljava/lang/Boolean;", "setNeedFollowScroll", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_POP_VIEW_INFO_SHOW_ANIMATION_TYPE, "getShowAnimationType", "setShowAnimationType", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverViewInfo extends FixedMarginViewInfo implements HoverViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer dismissAnimationType;
    @Nullable
    private Boolean needFollowScroll;
    @Nullable
    private Integer showAnimationType;

    @Override // com.dianping.shield.dynamic.model.view.HoverViewInfoProps
    @Nullable
    public final Integer getShowAnimationType() {
        return this.showAnimationType;
    }

    @Override // com.dianping.shield.dynamic.model.view.HoverViewInfoProps
    public final void setShowAnimationType(@Nullable Integer num) {
        this.showAnimationType = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.HoverViewInfoProps
    @Nullable
    public final Integer getDismissAnimationType() {
        return this.dismissAnimationType;
    }

    @Override // com.dianping.shield.dynamic.model.view.HoverViewInfoProps
    public final void setDismissAnimationType(@Nullable Integer num) {
        this.dismissAnimationType = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.HoverViewInfoProps
    @Nullable
    public final Boolean getNeedFollowScroll() {
        return this.needFollowScroll;
    }

    @Override // com.dianping.shield.dynamic.model.view.HoverViewInfoProps
    public final void setNeedFollowScroll(@Nullable Boolean bool) {
        this.needFollowScroll = bool;
    }
}
