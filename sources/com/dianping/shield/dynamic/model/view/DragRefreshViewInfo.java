package com.dianping.shield.dynamic.model.view;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfoProps;", "()V", "onDragRefreshStatusChanged", "", "getOnDragRefreshStatusChanged", "()Ljava/lang/String;", "setOnDragRefreshStatusChanged", "(Ljava/lang/String;)V", "onPull", "", "getOnPull", "()Ljava/lang/Boolean;", "setOnPull", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "onRefreshSuccess", "getOnRefreshSuccess", "setOnRefreshSuccess", Constants.LAG_THRESHOLD, "", "getThreshold", "()Ljava/lang/Integer;", "setThreshold", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DragRefreshViewInfo extends ViewInfo implements DragRefreshViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String onDragRefreshStatusChanged;
    @Nullable
    private Boolean onPull;
    @Nullable
    private String onRefreshSuccess;
    @Nullable
    private Integer threshold;

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    @Nullable
    public final Integer getThreshold() {
        return this.threshold;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    public final void setThreshold(@Nullable Integer num) {
        this.threshold = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    @Nullable
    public final Boolean getOnPull() {
        return this.onPull;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    public final void setOnPull(@Nullable Boolean bool) {
        this.onPull = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    @Nullable
    public final String getOnDragRefreshStatusChanged() {
        return this.onDragRefreshStatusChanged;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    public final void setOnDragRefreshStatusChanged(@Nullable String str) {
        this.onDragRefreshStatusChanged = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    @Nullable
    public final String getOnRefreshSuccess() {
        return this.onRefreshSuccess;
    }

    @Override // com.dianping.shield.dynamic.model.view.DragRefreshViewInfoProps
    public final void setOnRefreshSuccess(@Nullable String str) {
        this.onRefreshSuccess = str;
    }
}
