package com.dianping.shield.node.cellnode.callback.legacy;

import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.o;
import com.dianping.agentsdk.framework.p;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingMorePaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "sci", "Lcom/dianping/agentsdk/framework/CellStatusMoreInterface;", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "(Lcom/dianping/agentsdk/framework/CellStatusMoreInterface;Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "bindViewHolder", "", Constants.EventType.VIEW, "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "equals", "", "other", "hashCode", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyLoadingMorePaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoadingAndLoadingMoreCreator creator;
    private final o sci;

    public LegacyLoadingMorePaintingCallback(@NotNull o oVar, @Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        h.b(oVar, "sci");
        Object[] objArr = {oVar, loadingAndLoadingMoreCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ee5d72841287b17f15b321d2241a657", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ee5d72841287b17f15b321d2241a657");
            return;
        }
        this.sci = oVar;
        this.creator = loadingAndLoadingMoreCreator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r2 == null) goto L32;
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
            com.meituan.robust.ChangeQuickRedirect r12 = com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingMorePaintingCallback.changeQuickRedirect
            java.lang.String r9 = "ee9fa400be36f14f6cc6d731e1e71ef0"
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
            if (r13 != 0) goto L2e
            goto L77
        L2e:
            int r0 = r13.hashCode()
            r1 = 800087346(0x2fb05d32, float:3.2080433E-10)
            r2 = 0
            if (r0 == r1) goto L5b
            r1 = 1800254799(0x6b4db54f, float:2.48686E26)
            if (r0 == r1) goto L3e
            goto L77
        L3e:
            java.lang.String r0 = "(loadingmorecustom)"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L77
            com.dianping.agentsdk.framework.o r13 = r10.sci
            android.view.View r13 = r13.loadingMoreView()
            if (r13 != 0) goto L57
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r13 = r10.creator
            if (r13 == 0) goto L58
            android.view.View r2 = r13.loadingMoreView()
            goto L58
        L57:
            r2 = r13
        L58:
            if (r2 != 0) goto L80
            goto L77
        L5b:
            java.lang.String r0 = "(loadingmorefailedcustom)"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L77
            com.dianping.agentsdk.framework.o r13 = r10.sci
            android.view.View r13 = r13.loadingMoreFailedView()
            if (r13 != 0) goto L74
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r13 = r10.creator
            if (r13 == 0) goto L75
            android.view.View r2 = r13.loadingMoreFailedView()
            goto L75
        L74:
            r2 = r13
        L75:
            if (r2 != 0) goto L80
        L77:
            com.dianping.shield.node.processor.NodeCreator$Companion r13 = com.dianping.shield.node.processor.NodeCreator.Companion
            java.lang.String r0 = "错误的LoadingMoreView"
            android.view.View r2 = r13.createDefaultView(r11, r0)
        L80:
            r12.<init>(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingMorePaintingCallback.createViewHolder(android.content.Context, android.view.ViewGroup, java.lang.String):com.dianping.shield.node.adapter.ShieldViewHolder");
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        String revertViewType;
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5e59b25023bc5074dc1d62de7d9b603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5e59b25023bc5074dc1d62de7d9b603");
            return;
        }
        h.b(shieldViewHolder, Constants.EventType.VIEW);
        if (!(obj instanceof String) || (revertViewType = NodeCreator.Companion.revertViewType((String) obj)) == null) {
            return;
        }
        int hashCode = revertViewType.hashCode();
        if (hashCode == 800087346) {
            if (revertViewType.equals(NodeCreator.LOADING_MORE_FAILED_TYPE_CUSTOM)) {
                this.sci.onBindView(l.a.FAILED);
                if (this.sci instanceof p) {
                    ((p) this.sci).updateLoadingMoreFailedView(shieldViewHolder.itemView);
                }
            }
        } else if (hashCode == 1800254799 && revertViewType.equals(NodeCreator.LOADING_MORE_TYPE_CUSTOM)) {
            this.sci.onBindView(l.a.LOADING);
            if (this.sci instanceof p) {
                ((p) this.sci).updateLoadingMoreView(shieldViewHolder.itemView);
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdf63955e753884349d6f0435e5a8d8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdf63955e753884349d6f0435e5a8d8e")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(h.a(this.sci, ((LegacyLoadingMorePaintingCallback) obj).sci) ^ true);
        }
        throw new kotlin.o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingMorePaintingCallback");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26ba8577583fc03adbf5ee4b81b3103b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26ba8577583fc03adbf5ee4b81b3103b")).intValue() : this.sci.hashCode();
    }
}
