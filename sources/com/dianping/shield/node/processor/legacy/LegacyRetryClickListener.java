package com.dianping.shield.node.processor.legacy;

import android.view.View;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/LegacyRetryClickListener;", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "sciClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View$OnClickListener;)V", "onViewClicked", "", Constants.EventType.VIEW, "Landroid/view/View;", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyRetryClickListener implements ViewClickCallbackWithData {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final View.OnClickListener sciClickListener;

    public LegacyRetryClickListener(@NotNull View.OnClickListener onClickListener) {
        h.b(onClickListener, "sciClickListener");
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7603699aca7712362105fac7dad5171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7603699aca7712362105fac7dad5171");
        } else {
            this.sciClickListener = onClickListener;
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
    public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {view, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "126942d6c3f2573b4b496822be5b4d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "126942d6c3f2573b4b496822be5b4d96");
            return;
        }
        h.b(view, Constants.EventType.VIEW);
        this.sciClickListener.onClick(view);
    }
}
