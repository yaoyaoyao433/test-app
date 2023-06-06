package com.dianping.picassomodule.widget.tab;

import android.content.Context;
import android.view.View;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.component.extensions.common.ContainerDataSource;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/dianping/picassomodule/widget/tab/ViewItemTabAdapter;", "Lcom/dianping/picassomodule/widget/tab/BaseTabAdapter;", "Lcom/dianping/shield/node/useritem/ViewItem;", "data", "", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "currentSelectIndex", "", "getCurrentSelectIndex", "()I", "setCurrentSelectIndex", "(I)V", "currentSelectViewItem", "getCurrentSelectViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setCurrentSelectViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "dataSource", "Lcom/dianping/shield/component/extensions/common/ContainerDataSource;", "getDataSource", "()Lcom/dianping/shield/component/extensions/common/ContainerDataSource;", "setDataSource", "(Lcom/dianping/shield/component/extensions/common/ContainerDataSource;)V", "getCount", "getItem", "position", "getView", "Landroid/view/View;", "index", "setSelectedIndex", "", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class j extends a<ViewItem> {
    public static ChangeQuickRedirect c;
    @Nullable
    ContainerDataSource d;
    private int e;
    @Nullable
    private ViewItem f;
    @NotNull
    private final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@Nullable List<? extends ViewItem> list, @NotNull Context context) {
        super(null);
        kotlin.jvm.internal.h.b(context, "context");
        Object[] objArr = {null, context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003ec9c01add7375cb2522638e64c7f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003ec9c01add7375cb2522638e64c7f6");
            return;
        }
        this.g = context;
        this.e = -1;
    }

    @Override // com.dianping.picassomodule.widget.tab.f
    @NotNull
    public final View a(int i) {
        View view;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92cb7fa7968d24827dd88d4d08ce207e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92cb7fa7968d24827dd88d4d08ce207e");
        }
        ContainerDataSource containerDataSource = this.d;
        return (containerDataSource == null || (view = containerDataSource.getView(i)) == null) ? new View(this.g) : view;
    }

    @Override // com.dianping.picassomodule.widget.tab.f
    public final void a(int i, @NotNull g gVar) {
        ViewItem viewItem;
        HashMap<ViewItem, ShieldViewHolder> childViewHolderHashMap;
        ViewItem viewItem2;
        HashMap<ViewItem, ShieldViewHolder> childViewHolderHashMap2;
        CommonContainerRow shieldRow;
        CommonContainerRow shieldRow2;
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95386b29089a1fbefb8d3ae459f2ce54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95386b29089a1fbefb8d3ae459f2ce54");
            return;
        }
        kotlin.jvm.internal.h.b(gVar, "reason");
        int a = a();
        if (i >= 0 && a > i) {
            ContainerDataSource containerDataSource = this.d;
            if (((containerDataSource == null || (shieldRow2 = containerDataSource.getShieldRow()) == null) ? null : shieldRow2.getRowItem()) instanceof TabRowItem) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c440a88ea017b2d21f66f0c8d4d9a5a7", RobustBitConfig.DEFAULT_VALUE)) {
                    viewItem = (ViewItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c440a88ea017b2d21f66f0c8d4d9a5a7");
                } else {
                    ContainerDataSource containerDataSource2 = this.d;
                    if (containerDataSource2 == null || (viewItem = containerDataSource2.getViewItem(i)) == null) {
                        viewItem = new ViewItem();
                    }
                }
                if (this.e != i || (!kotlin.jvm.internal.h.a(this.f, viewItem))) {
                    ContainerDataSource containerDataSource3 = this.d;
                    RowItem rowItem = (containerDataSource3 == null || (shieldRow = containerDataSource3.getShieldRow()) == null) ? null : shieldRow.getRowItem();
                    if (rowItem == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.tabs.TabRowItem");
                    }
                    TabRowItem tabRowItem = (TabRowItem) rowItem;
                    d dVar = tabRowItem.onUpdateTabItemSelectedListener;
                    if (dVar != null) {
                        dVar.updateTabItemSelected(viewItem.data, true);
                    } else {
                        ContainerDataSource containerDataSource4 = this.d;
                        ShieldViewHolder shieldViewHolder = (containerDataSource4 == null || (childViewHolderHashMap = containerDataSource4.getChildViewHolderHashMap()) == null) ? null : childViewHolderHashMap.get(viewItem);
                        if (shieldViewHolder != null) {
                            shieldViewHolder.itemView.setSelected(true);
                            ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
                            Object obj = viewItem.data;
                            ContainerDataSource containerDataSource5 = this.d;
                            viewPaintingCallback.bindViewHolder(shieldViewHolder, obj, viewItem.getNodePath(containerDataSource5 != null ? containerDataSource5.getShieldRow() : null));
                        }
                    }
                    if ((!kotlin.jvm.internal.h.a(this.f, viewItem)) && (viewItem2 = this.f) != null) {
                        d dVar2 = tabRowItem.onUpdateTabItemSelectedListener;
                        if (dVar2 != null) {
                            dVar2.updateTabItemSelected(viewItem2.data, false);
                        } else {
                            ContainerDataSource containerDataSource6 = this.d;
                            ShieldViewHolder shieldViewHolder2 = (containerDataSource6 == null || (childViewHolderHashMap2 = containerDataSource6.getChildViewHolderHashMap()) == null) ? null : childViewHolderHashMap2.get(viewItem2);
                            if (shieldViewHolder2 != null) {
                                shieldViewHolder2.itemView.setSelected(false);
                                ViewPaintingCallback viewPaintingCallback2 = viewItem2.viewPaintingCallback;
                                Object obj2 = viewItem2.data;
                                ContainerDataSource containerDataSource7 = this.d;
                                viewPaintingCallback2.bindViewHolder(shieldViewHolder2, obj2, viewItem2.getNodePath(containerDataSource7 != null ? containerDataSource7.getShieldRow() : null));
                            }
                        }
                    }
                    tabRowItem.lastSelectedIndex = i;
                    this.e = i;
                    this.f = viewItem;
                }
            }
        }
    }

    @Override // com.dianping.picassomodule.widget.tab.a, com.dianping.picassomodule.widget.tab.f
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463378ae5a47c9a3e2c2bc7af4779d92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463378ae5a47c9a3e2c2bc7af4779d92")).intValue();
        }
        ContainerDataSource containerDataSource = this.d;
        if (containerDataSource != null) {
            return containerDataSource.getSize();
        }
        return 0;
    }
}
