package com.dianping.shield.node.cellnode.callback;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/LoadingPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "getCreator", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "setCreator", "bindViewHolder", "", Constants.EventType.VIEW, "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoadingPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private LoadingAndLoadingMoreCreator creator;

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b55b1ac8a3eb9731a88537727eb17d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b55b1ac8a3eb9731a88537727eb17d22");
        } else {
            h.b(shieldViewHolder, Constants.EventType.VIEW);
        }
    }

    public LoadingPaintingCallback(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        Object[] objArr = {loadingAndLoadingMoreCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "546beaaf27240d89ab6713d57420d7eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "546beaaf27240d89ab6713d57420d7eb");
        } else {
            this.creator = loadingAndLoadingMoreCreator;
        }
    }

    @Nullable
    public final LoadingAndLoadingMoreCreator getCreator() {
        return this.creator;
    }

    public final void setCreator(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.creator = loadingAndLoadingMoreCreator;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        View createDefaultView;
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d2a8ca70f847d9a2943fa40f02f8c0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d2a8ca70f847d9a2943fa40f02f8c0c");
        }
        h.b(context, "context");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1732469099) {
                if (hashCode != -158898524) {
                    if (hashCode == -93653404 && str.equals(NodeCreator.FAILED_TYPE)) {
                        LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator = this.creator;
                        if (loadingAndLoadingMoreCreator == null || (createDefaultView = loadingAndLoadingMoreCreator.loadingFailedView()) == null) {
                            createDefaultView = NodeCreator.Companion.createDefaultView(context, "未设置默认FailedView");
                        }
                    }
                } else if (str.equals(NodeCreator.EMPTY_TYPE)) {
                    LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator2 = this.creator;
                    if (loadingAndLoadingMoreCreator2 == null || (createDefaultView = loadingAndLoadingMoreCreator2.emptyView()) == null) {
                        createDefaultView = NodeCreator.Companion.createDefaultView(context, "未设置默认EmptyView");
                    }
                }
            } else if (str.equals(NodeCreator.LOADING_TYPE)) {
                LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator3 = this.creator;
                if (loadingAndLoadingMoreCreator3 == null || (createDefaultView = loadingAndLoadingMoreCreator3.loadingView()) == null) {
                    createDefaultView = NodeCreator.Companion.createDefaultView(context, "未设置默认LoadingView");
                }
            }
            return new ShieldViewHolder(createDefaultView);
        }
        createDefaultView = NodeCreator.Companion.createDefaultView(context, "错误的LoadingView");
        return new ShieldViewHolder(createDefaultView);
    }
}
