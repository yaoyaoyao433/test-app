package com.dianping.shield.dynamic.model.vc;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "", "()V", "hasDragRefresh", "", "getHasDragRefresh", "()Ljava/lang/Boolean;", "setHasDragRefresh", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "offset", "", "getOffset", "()Ljava/lang/Integer;", "setOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class DragRefreshInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean hasDragRefresh;
    @Nullable
    private Integer offset;

    @Nullable
    public final Boolean getHasDragRefresh() {
        return this.hasDragRefresh;
    }

    public final void setHasDragRefresh(@Nullable Boolean bool) {
        this.hasDragRefresh = bool;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    public final void setOffset(@Nullable Integer num) {
        this.offset = num;
    }
}
