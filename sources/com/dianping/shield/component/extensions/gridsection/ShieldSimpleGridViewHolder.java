package com.dianping.shield.component.extensions.gridsection;

import com.dianping.shield.component.extensions.grid.PoolView;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/ShieldSimpleGridViewHolder;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "simpleGridView", "Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView;", "(Lcom/dianping/shield/component/extensions/gridsection/SimpleGridView;)V", "childViewHolders", "Ljava/util/ArrayList;", "Lcom/dianping/shield/component/extensions/grid/PoolView;", "Lkotlin/collections/ArrayList;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldSimpleGridViewHolder extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @NotNull
    public ArrayList<PoolView> childViewHolders;
    @JvmField
    @NotNull
    public final SimpleGridView simpleGridView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShieldSimpleGridViewHolder(@NotNull SimpleGridView simpleGridView) {
        super(simpleGridView);
        h.b(simpleGridView, "simpleGridView");
        this.simpleGridView = simpleGridView;
        this.childViewHolders = new ArrayList<>();
    }
}
