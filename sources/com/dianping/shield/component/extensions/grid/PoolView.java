package com.dianping.shield.component.extensions.grid;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/PoolView;", "", DMKeys.KEY_VIEW_TYPE, "", "recycledViewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "(Ljava/lang/String;Lcom/dianping/shield/node/adapter/ShieldViewHolder;)V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PoolView {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @NotNull
    public ShieldViewHolder recycledViewHolder;
    @JvmField
    @NotNull
    public String viewType;

    public PoolView(@NotNull String str, @NotNull ShieldViewHolder shieldViewHolder) {
        h.b(str, DMKeys.KEY_VIEW_TYPE);
        h.b(shieldViewHolder, "recycledViewHolder");
        this.viewType = str;
        this.recycledViewHolder = shieldViewHolder;
    }
}
