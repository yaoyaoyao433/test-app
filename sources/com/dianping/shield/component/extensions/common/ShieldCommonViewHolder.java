package com.dianping.shield.component.extensions.common;

import android.view.View;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R6\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/component/extensions/common/ShieldCommonViewHolder;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "childViewHolderHashMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lkotlin/collections/HashMap;", "getChildViewHolderHashMap", "()Ljava/util/HashMap;", "setChildViewHolderHashMap", "(Ljava/util/HashMap;)V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldCommonViewHolder extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private HashMap<ViewItem, ShieldViewHolder> childViewHolderHashMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShieldCommonViewHolder(@NotNull View view) {
        super(view);
        h.b(view, "itemView");
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b31577ad129764be17e3e105bea11ce9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b31577ad129764be17e3e105bea11ce9");
        } else {
            this.childViewHolderHashMap = new HashMap<>();
        }
    }

    @NotNull
    public final HashMap<ViewItem, ShieldViewHolder> getChildViewHolderHashMap() {
        return this.childViewHolderHashMap;
    }

    public final void setChildViewHolderHashMap(@NotNull HashMap<ViewItem, ShieldViewHolder> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a67d8737c62813e2fa43e760155bab0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a67d8737c62813e2fa43e760155bab0b");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.childViewHolderHashMap = hashMap;
    }
}
