package com.dianping.shield.component.entity;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lcom/dianping/shield/component/entity/ScrollEventBean;", "", "()V", "contentHeight", "", "getContentHeight", "()I", "setContentHeight", "(I)V", "contentWidth", "getContentWidth", "setContentWidth", "offsetToAnchor", "getOffsetToAnchor", "()Ljava/lang/Integer;", "setOffsetToAnchor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "scrollViewHeight", "getScrollViewHeight", "setScrollViewHeight", "scrollViewWidth", "getScrollViewWidth", "setScrollViewWidth", "scrollX", "getScrollX", "setScrollX", "scrollY", "getScrollY", "setScrollY", "xVelocity", "", "getXVelocity", "()F", "setXVelocity", "(F)V", "yVelocity", "getYVelocity", "setYVelocity", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollEventBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int contentHeight;
    private int contentWidth;
    @Nullable
    private Integer offsetToAnchor;
    private int scrollViewHeight;
    private int scrollViewWidth;
    private int scrollX;
    private int scrollY;
    private float xVelocity;
    private float yVelocity;

    public final int getScrollX() {
        return this.scrollX;
    }

    public final void setScrollX(int i) {
        this.scrollX = i;
    }

    public final int getScrollY() {
        return this.scrollY;
    }

    public final void setScrollY(int i) {
        this.scrollY = i;
    }

    public final float getXVelocity() {
        return this.xVelocity;
    }

    public final void setXVelocity(float f) {
        this.xVelocity = f;
    }

    public final float getYVelocity() {
        return this.yVelocity;
    }

    public final void setYVelocity(float f) {
        this.yVelocity = f;
    }

    public final int getContentWidth() {
        return this.contentWidth;
    }

    public final void setContentWidth(int i) {
        this.contentWidth = i;
    }

    public final int getContentHeight() {
        return this.contentHeight;
    }

    public final void setContentHeight(int i) {
        this.contentHeight = i;
    }

    public final int getScrollViewWidth() {
        return this.scrollViewWidth;
    }

    public final void setScrollViewWidth(int i) {
        this.scrollViewWidth = i;
    }

    public final int getScrollViewHeight() {
        return this.scrollViewHeight;
    }

    public final void setScrollViewHeight(int i) {
        this.scrollViewHeight = i;
    }

    @Nullable
    public final Integer getOffsetToAnchor() {
        return this.offsetToAnchor;
    }

    public final void setOffsetToAnchor(@Nullable Integer num) {
        this.offsetToAnchor = num;
    }
}
