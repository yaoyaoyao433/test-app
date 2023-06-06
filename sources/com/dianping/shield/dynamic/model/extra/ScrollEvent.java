package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "", "getOnMomentumScrollBegin", "()Ljava/lang/String;", "setOnMomentumScrollBegin", "(Ljava/lang/String;)V", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", DMKeys.KEY_THROTTLE, "", "getScrollEventThrottle", "()Ljava/lang/Integer;", "setScrollEventThrottle", "(Ljava/lang/Integer;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ScrollEvent {
    @Nullable
    String getOnMomentumScrollBegin();

    @Nullable
    String getOnMomentumScrollEnd();

    @Nullable
    String getOnScroll();

    @Nullable
    String getOnScrollBeginDrag();

    @Nullable
    String getOnScrollEndDrag();

    @Nullable
    Integer getScrollEventThrottle();

    void setOnMomentumScrollBegin(@Nullable String str);

    void setOnMomentumScrollEnd(@Nullable String str);

    void setOnScroll(@Nullable String str);

    void setOnScrollBeginDrag(@Nullable String str);

    void setOnScrollEndDrag(@Nullable String str);

    void setScrollEventThrottle(@Nullable Integer num);
}
