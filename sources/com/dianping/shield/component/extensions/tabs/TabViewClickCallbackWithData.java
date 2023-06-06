package com.dianping.shield.component.extensions.tabs;

import android.view.View;
import com.dianping.picassomodule.widget.tab.g;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "onViewClicked", "", Constants.EventType.VIEW, "Landroid/view/View;", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface TabViewClickCallbackWithData extends ViewClickCallbackWithData {
    @Override // com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
    void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath);

    void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void onViewClicked(TabViewClickCallbackWithData tabViewClickCallbackWithData, @NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
            Object[] objArr = {tabViewClickCallbackWithData, view, obj, nodePath};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "904de84a1c5e6ce323f2fcc24a06639f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "904de84a1c5e6ce323f2fcc24a06639f");
                return;
            }
            h.b(view, Constants.EventType.VIEW);
            tabViewClickCallbackWithData.onViewClicked(view, obj, nodePath, g.USER_CLICK);
        }
    }
}
