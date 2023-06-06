package com.dianping.shield.dynamic.model.module;

import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/dianping/shield/dynamic/model/module/ModuleInfo;", "Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "()V", DMKeys.KEY_ENABLE_ON_SCREEN_NOTICE, "", "getEnableOnScreenNotice", "()Ljava/lang/Boolean;", "setEnableOnScreenNotice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "getOnMomentumScrollBegin", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", DMKeys.KEY_THROTTLE, "", "getScrollEventThrottle", "()Ljava/lang/Integer;", "setScrollEventThrottle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ModuleInfo extends BaseModuleInfo implements ScrollEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean enableOnScreenNotice;
    @Nullable
    private String identifier;
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

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    public final void setIdentifier(@Nullable String str) {
        this.identifier = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final Integer getScrollEventThrottle() {
        return this.scrollEventThrottle;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setScrollEventThrottle(@Nullable Integer num) {
        this.scrollEventThrottle = num;
    }

    @Nullable
    public final Boolean getEnableOnScreenNotice() {
        return this.enableOnScreenNotice;
    }

    public final void setEnableOnScreenNotice(@Nullable Boolean bool) {
        this.enableOnScreenNotice = bool;
    }
}
