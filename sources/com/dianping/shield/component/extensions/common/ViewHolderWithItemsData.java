package com.dianping.shield.component.extensions.common;

import android.view.View;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/component/extensions/common/ViewHolderWithItemsData;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", Constants.EventType.VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "commonRowData", "Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;", "getCommonRowData", "()Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;", "setCommonRowData", "(Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;)V", "getView", "()Landroid/view/View;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ViewHolderWithItemsData extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private CommonContainerNodeData commonRowData;
    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolderWithItemsData(@NotNull View view) {
        super(view);
        h.b(view, Constants.EventType.VIEW);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20216ee6ab92963570126fdf3d9131c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20216ee6ab92963570126fdf3d9131c7");
        } else {
            this.view = view;
        }
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Nullable
    public final CommonContainerNodeData getCommonRowData() {
        return this.commonRowData;
    }

    public final void setCommonRowData(@Nullable CommonContainerNodeData commonContainerNodeData) {
        this.commonRowData = commonContainerNodeData;
    }
}
