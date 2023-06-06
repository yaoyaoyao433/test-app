package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ScrollEventInfo;", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "()V", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "", "getOnMomentumScrollBegin", "()Ljava/lang/String;", "setOnMomentumScrollBegin", "(Ljava/lang/String;)V", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", DMKeys.KEY_THROTTLE, "", "getScrollEventThrottle", "()Ljava/lang/Integer;", "setScrollEventThrottle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollEventInfo implements ScrollEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String onMomentumScrollBegin;
    @Nullable
    private String onMomentumScrollEnd;
    @Nullable
    private String onScroll;
    @Nullable
    private String onScrollBeginDrag;
    @Nullable
    private String onScrollEndDrag;
    @Nullable
    private Integer scrollEventThrottle;

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final Integer getScrollEventThrottle() {
        return this.scrollEventThrottle;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setScrollEventThrottle(@Nullable Integer num) {
        this.scrollEventThrottle = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnScroll() {
        return this.onScroll;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnScroll(@Nullable String str) {
        this.onScroll = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnMomentumScrollBegin() {
        return this.onMomentumScrollBegin;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnMomentumScrollBegin(@Nullable String str) {
        this.onMomentumScrollBegin = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnMomentumScrollEnd() {
        return this.onMomentumScrollEnd;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnMomentumScrollEnd(@Nullable String str) {
        this.onMomentumScrollEnd = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnScrollBeginDrag() {
        return this.onScrollBeginDrag;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnScrollBeginDrag(@Nullable String str) {
        this.onScrollBeginDrag = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnScrollEndDrag() {
        return this.onScrollEndDrag;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnScrollEndDrag(@Nullable String str) {
        this.onScrollEndDrag = str;
    }
}
