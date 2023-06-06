package com.dianping.shield.dynamic.model.vc;

import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/ModulesVCInfo;", "Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "()V", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "getOnMomentumScrollBegin", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", DMKeys.KEY_THROTTLE, "", "getScrollEventThrottle", "()Ljava/lang/Integer;", "setScrollEventThrottle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ModulesVCInfo extends BaseModulesVCInfo implements ScrollEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
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

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    @Nullable
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    public void setIdentifier(@Nullable String str) {
        this.identifier = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public String getOnScroll() {
        return this.onScroll;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setOnScroll(@Nullable String str) {
        this.onScroll = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public String getOnMomentumScrollBegin() {
        return this.onMomentumScrollBegin;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setOnMomentumScrollBegin(@Nullable String str) {
        this.onMomentumScrollBegin = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public String getOnMomentumScrollEnd() {
        return this.onMomentumScrollEnd;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setOnMomentumScrollEnd(@Nullable String str) {
        this.onMomentumScrollEnd = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public String getOnScrollBeginDrag() {
        return this.onScrollBeginDrag;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setOnScrollBeginDrag(@Nullable String str) {
        this.onScrollBeginDrag = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public String getOnScrollEndDrag() {
        return this.onScrollEndDrag;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setOnScrollEndDrag(@Nullable String str) {
        this.onScrollEndDrag = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public Integer getScrollEventThrottle() {
        return this.scrollEventThrottle;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setScrollEventThrottle(@Nullable Integer num) {
        this.scrollEventThrottle = num;
    }
}
