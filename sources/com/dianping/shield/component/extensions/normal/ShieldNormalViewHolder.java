package com.dianping.shield.component.extensions.normal;

import com.dianping.picassomodule.widget.normal.a;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/ShieldNormalViewHolder;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "normalView", "Lcom/dianping/picassomodule/widget/normal/NormalView;", "(Lcom/dianping/picassomodule/widget/normal/NormalView;)V", "childViewHolder", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldNormalViewHolder extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ShieldViewHolder childViewHolder;
    @JvmField
    @NotNull
    public final a normalView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShieldNormalViewHolder(@NotNull a aVar) {
        super(aVar);
        h.b(aVar, "normalView");
        this.normalView = aVar;
    }
}
