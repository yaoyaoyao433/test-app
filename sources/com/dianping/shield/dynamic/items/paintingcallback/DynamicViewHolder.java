package com.dianping.shield.dynamic.items.paintingcallback;

import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewHolder;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "parentView", "Landroid/view/ViewGroup;", "getParentView", "()Landroid/view/ViewGroup;", "setParentView", "(Landroid/view/ViewGroup;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicViewHolder extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ViewGroup parentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicViewHolder(@NotNull View view) {
        super(view);
        h.b(view, "itemView");
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e225a528d3aaca6f27573dbecd722037", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e225a528d3aaca6f27573dbecd722037");
        }
    }

    @Nullable
    public final ViewGroup getParentView() {
        return this.parentView;
    }

    public final void setParentView(@Nullable ViewGroup viewGroup) {
        this.parentView = viewGroup;
    }
}
