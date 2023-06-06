package com.dianping.shield.node.processor;

import android.content.Context;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/dianping/shield/node/processor/ShieldProcessor;", "Lcom/dianping/shield/node/processor/Processor;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "globalScreenVisibleExposeProxy", "Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "getGlobalScreenVisibleExposeProxy", "()Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "setGlobalScreenVisibleExposeProxy", "(Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;)V", "processingUnit", "Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "getProcessingUnit", "()Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "setProcessingUnit", "(Lcom/dianping/shield/node/processor/ShieldProcessingUnit;)V", "getLoadingAndLoadingMoreCreator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "processShieldNode", "", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "processShieldRow", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "processShieldSection", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ShieldProcessor extends Processor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public Context context;
    @Nullable
    private IScreenVisibleExposeEdge globalScreenVisibleExposeProxy;
    @NotNull
    public ShieldProcessingUnit processingUnit;

    @NotNull
    public final ShieldProcessingUnit getProcessingUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67b9f7ec4950fba08720ddb19c91d71c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessingUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67b9f7ec4950fba08720ddb19c91d71c");
        }
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        return shieldProcessingUnit;
    }

    public final void setProcessingUnit(@NotNull ShieldProcessingUnit shieldProcessingUnit) {
        Object[] objArr = {shieldProcessingUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a27e97fa08a51174aa93cf3a894fd8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a27e97fa08a51174aa93cf3a894fd8c0");
            return;
        }
        h.b(shieldProcessingUnit, "<set-?>");
        this.processingUnit = shieldProcessingUnit;
    }

    @NotNull
    public final Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11fd9b626d9a52efbb1354050ba0df0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11fd9b626d9a52efbb1354050ba0df0d");
        }
        Context context = this.context;
        if (context == null) {
            h.a("context");
        }
        return context;
    }

    public final void setContext(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85055266f6e11193f9dc06aef71a4b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85055266f6e11193f9dc06aef71a4b57");
            return;
        }
        h.b(context, "<set-?>");
        this.context = context;
    }

    @Nullable
    public final IScreenVisibleExposeEdge getGlobalScreenVisibleExposeProxy() {
        return this.globalScreenVisibleExposeProxy;
    }

    public final void setGlobalScreenVisibleExposeProxy(@Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        this.globalScreenVisibleExposeProxy = iScreenVisibleExposeEdge;
    }

    public final void processShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a0b193b1248302b8d14cc55af8166da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a0b193b1248302b8d14cc55af8166da");
            return;
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        shieldProcessingUnit.processShieldSection(sectionItem, shieldSection);
    }

    public final void processShieldRow(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b7119205eeaadf9529da8600ab715d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b7119205eeaadf9529da8600ab715d");
            return;
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        shieldProcessingUnit.processShieldRow(rowItem, shieldRow);
    }

    public final void processShieldNode(@NotNull ViewItem viewItem, @NotNull ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {viewItem, shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02db56b49c28f6aa83df31d079ab31cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02db56b49c28f6aa83df31d079ab31cb");
            return;
        }
        h.b(viewItem, "viewItem");
        h.b(shieldDisplayNode, "dNode");
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        shieldProcessingUnit.processShieldNode(viewItem, shieldDisplayNode);
    }

    @Nullable
    public final LoadingAndLoadingMoreCreator getLoadingAndLoadingMoreCreator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7d32036196219bf8b185e460ebb777c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadingAndLoadingMoreCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7d32036196219bf8b185e460ebb777c");
        }
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        return shieldProcessingUnit.getLoadingAndLoadingMoreCreator();
    }
}
