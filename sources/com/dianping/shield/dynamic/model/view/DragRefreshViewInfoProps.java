package com.dianping.shield.dynamic.model.view;

import com.meituan.metrics.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfoProps;", "", "onDragRefreshStatusChanged", "", "getOnDragRefreshStatusChanged", "()Ljava/lang/String;", "setOnDragRefreshStatusChanged", "(Ljava/lang/String;)V", "onPull", "", "getOnPull", "()Ljava/lang/Boolean;", "setOnPull", "(Ljava/lang/Boolean;)V", "onRefreshSuccess", "getOnRefreshSuccess", "setOnRefreshSuccess", Constants.LAG_THRESHOLD, "", "getThreshold", "()Ljava/lang/Integer;", "setThreshold", "(Ljava/lang/Integer;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DragRefreshViewInfoProps {
    @Nullable
    String getOnDragRefreshStatusChanged();

    @Nullable
    Boolean getOnPull();

    @Nullable
    String getOnRefreshSuccess();

    @Nullable
    Integer getThreshold();

    void setOnDragRefreshStatusChanged(@Nullable String str);

    void setOnPull(@Nullable Boolean bool);

    void setOnRefreshSuccess(@Nullable String str);

    void setThreshold(@Nullable Integer num);
}
