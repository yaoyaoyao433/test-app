package com.dianping.shield.node.cellnode.callback.legacy;

import com.dianping.agentsdk.framework.n;
import com.dianping.agentsdk.framework.q;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "sci", "Lcom/dianping/agentsdk/framework/CellStatusInterface;", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "(Lcom/dianping/agentsdk/framework/CellStatusInterface;Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "equals", "", "other", "hashCode", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyLoadingPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoadingAndLoadingMoreCreator creator;
    private final n sci;

    public LegacyLoadingPaintingCallback(@NotNull n nVar, @Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        h.b(nVar, "sci");
        Object[] objArr = {nVar, loadingAndLoadingMoreCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c391ab78e4ce38f84210e043a62addea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c391ab78e4ce38f84210e043a62addea");
            return;
        }
        this.sci = nVar;
        this.creator = loadingAndLoadingMoreCreator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r2 == null) goto L43;
     */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.shield.node.adapter.ShieldViewHolder createViewHolder(@org.jetbrains.annotations.NotNull android.content.Context r11, @org.jetbrains.annotations.Nullable android.view.ViewGroup r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
        /*
            r10 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            r1 = 1
            r0[r1] = r12
            r12 = 2
            r0[r12] = r13
            com.meituan.robust.ChangeQuickRedirect r12 = com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingPaintingCallback.changeQuickRedirect
            java.lang.String r9 = "be107f0d57133385465a76960c0159f7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r10
            r3 = r12
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r12, r8, r9)
            com.dianping.shield.node.adapter.ShieldViewHolder r11 = (com.dianping.shield.node.adapter.ShieldViewHolder) r11
            return r11
        L24:
            java.lang.String r12 = "context"
            kotlin.jvm.internal.h.b(r11, r12)
            com.dianping.shield.node.adapter.ShieldViewHolder r12 = new com.dianping.shield.node.adapter.ShieldViewHolder
            if (r13 != 0) goto L2f
            goto L9a
        L2f:
            int r0 = r13.hashCode()
            r1 = -1272643373(0xffffffffb42500d3, float:-1.5367122E-7)
            r2 = 0
            if (r0 == r1) goto L7e
            r1 = -928382908(0xffffffffc8aa0044, float:-348162.12)
            if (r0 == r1) goto L61
            r1 = 515653907(0x1ebc4113, float:1.9932188E-20)
            if (r0 == r1) goto L44
            goto L9a
        L44:
            java.lang.String r0 = "(emptycustom)"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L9a
            com.dianping.agentsdk.framework.n r13 = r10.sci
            android.view.View r13 = r13.emptyView()
            if (r13 != 0) goto L5d
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r13 = r10.creator
            if (r13 == 0) goto L5e
            android.view.View r2 = r13.emptyView()
            goto L5e
        L5d:
            r2 = r13
        L5e:
            if (r2 != 0) goto La3
            goto L9a
        L61:
            java.lang.String r0 = "(loadingcustom)"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L9a
            com.dianping.agentsdk.framework.n r13 = r10.sci
            android.view.View r13 = r13.loadingView()
            if (r13 != 0) goto L7a
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r13 = r10.creator
            if (r13 == 0) goto L7b
            android.view.View r2 = r13.loadingView()
            goto L7b
        L7a:
            r2 = r13
        L7b:
            if (r2 != 0) goto La3
            goto L9a
        L7e:
            java.lang.String r0 = "(failedcustom)"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L9a
            com.dianping.agentsdk.framework.n r13 = r10.sci
            android.view.View r13 = r13.loadingFailedView()
            if (r13 != 0) goto L97
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r13 = r10.creator
            if (r13 == 0) goto L98
            android.view.View r2 = r13.loadingFailedView()
            goto L98
        L97:
            r2 = r13
        L98:
            if (r2 != 0) goto La3
        L9a:
            com.dianping.shield.node.processor.NodeCreator$Companion r13 = com.dianping.shield.node.processor.NodeCreator.Companion
            java.lang.String r0 = "错误的LoadingView"
            android.view.View r2 = r13.createDefaultView(r11, r0)
        La3:
            r12.<init>(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingPaintingCallback.createViewHolder(android.content.Context, android.view.ViewGroup, java.lang.String):com.dianping.shield.node.adapter.ShieldViewHolder");
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        String revertViewType;
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "126cac86a62969da647ac0078fefb19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "126cac86a62969da647ac0078fefb19b");
            return;
        }
        h.b(shieldViewHolder, "viewHolder");
        if ((obj instanceof String) && (this.sci instanceof q) && (revertViewType = NodeCreator.Companion.revertViewType((String) obj)) != null) {
            int hashCode = revertViewType.hashCode();
            if (hashCode == -1272643373) {
                if (revertViewType.equals(NodeCreator.FAILED_TYPE_CUSTOM)) {
                    ((q) this.sci).updateLoadingFailedView(shieldViewHolder.itemView);
                }
            } else if (hashCode == -928382908) {
                if (revertViewType.equals(NodeCreator.LOADING_TYPE_CUSTOM)) {
                    ((q) this.sci).updateLoadingView(shieldViewHolder.itemView);
                }
            } else if (hashCode == 515653907 && revertViewType.equals(NodeCreator.EMPTY_TYPE_CUSTOM)) {
                ((q) this.sci).updateLoadingEmptyView(shieldViewHolder.itemView);
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03cbd0d65d56d8c902d11ca8031194ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03cbd0d65d56d8c902d11ca8031194ea")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(h.a(this.sci, ((LegacyLoadingPaintingCallback) obj).sci) ^ true);
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingPaintingCallback");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7991e8346e01e573a54cf3c1b7c7ec3b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7991e8346e01e573a54cf3c1b7c7ec3b")).intValue() : this.sci.hashCode();
    }
}
