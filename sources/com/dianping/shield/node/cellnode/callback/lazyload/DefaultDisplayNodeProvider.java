package com.dianping.shield.node.cellnode.callback.lazyload;

import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadViewItemProvider;
import com.dianping.shield.node.processor.ShieldProcessingUnit;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/lazyload/DefaultDisplayNodeProvider;", "Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadDisplayNodeProvider;", "viewItemProvider", "Lcom/dianping/shield/node/itemcallbacks/lazy/LazyLoadViewItemProvider;", "processingUnit", "Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "(Lcom/dianping/shield/node/itemcallbacks/lazy/LazyLoadViewItemProvider;Lcom/dianping/shield/node/processor/ShieldProcessingUnit;)V", "getShieldDisplayNodeAtPosition", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "viewPosition", "", "rowParent", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultDisplayNodeProvider implements LazyLoadDisplayNodeProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ShieldProcessingUnit processingUnit;
    private final LazyLoadViewItemProvider viewItemProvider;

    public DefaultDisplayNodeProvider(@NotNull LazyLoadViewItemProvider lazyLoadViewItemProvider, @NotNull ShieldProcessingUnit shieldProcessingUnit) {
        h.b(lazyLoadViewItemProvider, "viewItemProvider");
        h.b(shieldProcessingUnit, "processingUnit");
        Object[] objArr = {lazyLoadViewItemProvider, shieldProcessingUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd931a4d64014b797d25ac4660cce4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd931a4d64014b797d25ac4660cce4c");
            return;
        }
        this.viewItemProvider = lazyLoadViewItemProvider;
        this.processingUnit = shieldProcessingUnit;
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadDisplayNodeProvider
    @NotNull
    public final ShieldDisplayNode getShieldDisplayNodeAtPosition(int i, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {Integer.valueOf(i), shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38db1f428c3729ce6fbdb5844bde7240", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38db1f428c3729ce6fbdb5844bde7240");
        }
        h.b(shieldRow, "rowParent");
        ViewItem viewItem = this.viewItemProvider.getViewItem(i);
        ShieldDisplayNode createDisplayNodeWithMapping = ExtensionsRegistry.INSTANCE.createDisplayNodeWithMapping(viewItem, shieldRow);
        createDisplayNodeWithMapping.rowParent = shieldRow;
        this.processingUnit.processShieldNode(viewItem, createDisplayNodeWithMapping);
        return createDisplayNodeWithMapping;
    }
}
