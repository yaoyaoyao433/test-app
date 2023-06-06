package com.dianping.shield.node.cellnode.callback.legacy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.ai;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyFooterPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "sci", "Lcom/dianping/agentsdk/framework/SectionExtraCellInterface;", "(Lcom/dianping/agentsdk/framework/SectionExtraCellInterface;)V", "bindViewHolder", "", Constants.EventType.VIEW, "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "equals", "", "other", "hashCode", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyFooterPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ai sci;

    public LegacyFooterPaintingCallback(@NotNull ai aiVar) {
        h.b(aiVar, "sci");
        Object[] objArr = {aiVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db08a8c9aa9b244c06f1d856123d046c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db08a8c9aa9b244c06f1d856123d046c");
        } else {
            this.sci = aiVar;
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Integer b;
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "315cf258bf4ded22ad39ccf9381e9d3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "315cf258bf4ded22ad39ccf9381e9d3d");
        }
        h.b(context, "context");
        View onCreateFooterView = this.sci.onCreateFooterView(viewGroup, (str == null || (b = g.b(str)) == null) ? -1 : b.intValue());
        h.a((Object) onCreateFooterView, "sci.onCreateFooterView(p…ype?.toIntOrNull() ?: -1)");
        return new ShieldViewHolder(onCreateFooterView);
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4194df94532b75330387d6a4542d6f1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4194df94532b75330387d6a4542d6f1c");
            return;
        }
        h.b(shieldViewHolder, Constants.EventType.VIEW);
        if ((nodePath != null ? nodePath.cellType : null) == CellType.FOOTER) {
            this.sci.updateFooterView(shieldViewHolder.itemView, nodePath.section, null);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7b896c42d788e7b7b431a86a48ef0db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7b896c42d788e7b7b431a86a48ef0db")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(h.a(this.sci, ((LegacyFooterPaintingCallback) obj).sci) ^ true);
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.callback.legacy.LegacyFooterPaintingCallback");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74cd27c6e9e34b16118cfdc0d7c56b43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74cd27c6e9e34b16118cfdc0d7c56b43")).intValue() : this.sci.hashCode();
    }
}
