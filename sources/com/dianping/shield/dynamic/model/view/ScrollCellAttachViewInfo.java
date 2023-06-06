package com.dianping.shield.dynamic.model.view;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "()V", "onAttachStatusChanged", "", "getOnAttachStatusChanged", "()Ljava/lang/String;", "setOnAttachStatusChanged", "(Ljava/lang/String;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollCellAttachViewInfo extends ViewInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String onAttachStatusChanged;

    @Nullable
    public final String getOnAttachStatusChanged() {
        return this.onAttachStatusChanged;
    }

    public final void setOnAttachStatusChanged(@Nullable String str) {
        this.onAttachStatusChanged = str;
    }
}
