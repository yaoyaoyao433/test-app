package com.dianping.shield.node.adapter;

import android.graphics.Rect;
import com.dianping.shield.feature.HotZoneStatusInterface;
import com.dianping.shield.node.adapter.status.ElementContainerCommonInterface;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/adapter/HotZoneLocationRect;", "Lcom/dianping/shield/node/adapter/status/ViewLocationRectInterface;", "hotZoneStatusInterface", "Lcom/dianping/shield/feature/HotZoneStatusInterface;", "reverseRange", "", "container", "Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;", "(Lcom/dianping/shield/feature/HotZoneStatusInterface;ZLcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;)V", "getContainer", "()Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;", "getActualRect", "Landroid/graphics/Rect;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HotZoneLocationRect implements ViewLocationRectInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ElementContainerCommonInterface container;
    private final HotZoneStatusInterface hotZoneStatusInterface;
    private final boolean reverseRange;

    public HotZoneLocationRect(@NotNull HotZoneStatusInterface hotZoneStatusInterface, boolean z, @NotNull ElementContainerCommonInterface elementContainerCommonInterface) {
        h.b(hotZoneStatusInterface, "hotZoneStatusInterface");
        h.b(elementContainerCommonInterface, "container");
        Object[] objArr = {hotZoneStatusInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0), elementContainerCommonInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb81dd30035db8ebcabb8e1a193ed550", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb81dd30035db8ebcabb8e1a193ed550");
            return;
        }
        this.hotZoneStatusInterface = hotZoneStatusInterface;
        this.reverseRange = z;
        this.container = elementContainerCommonInterface;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2b8a91440709e30bb116dae512eca2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2b8a91440709e30bb116dae512eca2f");
        }
        if (this.reverseRange) {
            Rect rect = new Rect();
            rect.top = this.hotZoneStatusInterface.defineStatusHotZone().endY + this.container.getContainerEdgeRect().top;
            rect.bottom = this.container.getContainerEdgeRect().bottom;
            rect.left = 0;
            rect.right = this.container.getContainerEdgeRect().right;
            return rect;
        }
        Rect rect2 = new Rect();
        rect2.top = this.hotZoneStatusInterface.defineStatusHotZone().startY;
        rect2.bottom = this.hotZoneStatusInterface.defineStatusHotZone().endY;
        rect2.left = 0;
        rect2.right = this.container.getContainerEdgeRect().right;
        return rect2;
    }
}
