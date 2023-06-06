package com.dianping.shield.component.extensions.grid;

import com.dianping.picassomodule.widget.cssgrid.SuperGridView;
import com.dianping.shield.component.extensions.gridsection.GridRecycledViewPool;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/ShieldGridViewHolder;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "gridView", "Lcom/dianping/picassomodule/widget/cssgrid/SuperGridView;", "(Lcom/dianping/picassomodule/widget/cssgrid/SuperGridView;)V", "childViewHolders", "Ljava/util/ArrayList;", "Lcom/dianping/shield/component/extensions/grid/PoolView;", "Lkotlin/collections/ArrayList;", "gridRecycledViewPool", "Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "getGridRecycledViewPool", "()Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldGridViewHolder extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @NotNull
    public ArrayList<PoolView> childViewHolders;
    @NotNull
    private final GridRecycledViewPool gridRecycledViewPool;
    @JvmField
    @NotNull
    public final SuperGridView<?> gridView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShieldGridViewHolder(@NotNull SuperGridView<?> superGridView) {
        super(superGridView);
        h.b(superGridView, "gridView");
        Object[] objArr = {superGridView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f45e51d72413533675037f433783c88c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f45e51d72413533675037f433783c88c");
            return;
        }
        this.gridView = superGridView;
        this.childViewHolders = new ArrayList<>();
        this.gridRecycledViewPool = new GridRecycledViewPool();
    }

    @NotNull
    public final GridRecycledViewPool getGridRecycledViewPool() {
        return this.gridRecycledViewPool;
    }
}
