package com.dianping.shield.node.adapter;

import android.graphics.Rect;
import com.dianping.shield.node.adapter.status.ElementContainerCommonInterface;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/adapter/FullScreenLocationRect;", "Lcom/dianping/shield/node/adapter/status/ViewLocationRectInterface;", "container", "Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;", "(Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;)V", "getContainer", "()Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;", "getActualRect", "Landroid/graphics/Rect;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class FullScreenLocationRect implements ViewLocationRectInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ElementContainerCommonInterface container;

    public FullScreenLocationRect(@NotNull ElementContainerCommonInterface elementContainerCommonInterface) {
        h.b(elementContainerCommonInterface, "container");
        Object[] objArr = {elementContainerCommonInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a479892d699f01ba46bcf0930477b79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a479892d699f01ba46bcf0930477b79");
        } else {
            this.container = elementContainerCommonInterface;
        }
    }

    @NotNull
    public final ElementContainerCommonInterface getContainer() {
        return this.container;
    }

    @Override // com.dianping.shield.node.adapter.status.ViewLocationRectInterface
    @NotNull
    public final Rect getActualRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1123445004966a4b03ea1fa4fe6e4252", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1123445004966a4b03ea1fa4fe6e4252") : this.container.getContainerEdgeRect();
    }
}
