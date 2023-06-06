package com.dianping.shield.component.extensions.gridsection;

import android.util.SparseArray;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridSectionItem;", "Lcom/dianping/shield/node/useritem/SectionItem;", "()V", "backgroundColor", "", DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "", DMKeys.KEY_COLCOUNT, "", "gridRecycledViewPool", "Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "itemHeights", "Landroid/util/SparseArray;", "leftMargin", "recommendItemHeight", "rightMargin", DMKeys.KEY_MARGIN_TOP_MARGIN, "viewItems", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lkotlin/collections/ArrayList;", "getViewItems", "()Ljava/util/ArrayList;", DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, "addViewItem", "", "viewItem", KNBConfig.CONFIG_CLEAR_CACHE, "getGirdSectionRowItem", "Lcom/dianping/shield/component/extensions/gridsection/GridSectionRowItem;", "row", "setMaxRecycledViews", DMKeys.KEY_VIEW_TYPE, "max", "Companion", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class GridSectionItem extends SectionItem {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public String backgroundColor;
    @JvmField
    public float bottomMargin;
    @JvmField
    public int colCount;
    @JvmField
    @NotNull
    public GridRecycledViewPool gridRecycledViewPool;
    @JvmField
    @NotNull
    public SparseArray<Float> itemHeights;
    @JvmField
    public float leftMargin;
    @JvmField
    public float recommendItemHeight;
    @JvmField
    public float rightMargin;
    @JvmField
    public float topMargin;
    @NotNull
    private final ArrayList<ViewItem> viewItems;
    @JvmField
    public float xGap;
    @JvmField
    public float yGap;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridSectionItem$Companion;", "", "()V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public GridSectionItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d982acea1ab6659527524958698121", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d982acea1ab6659527524958698121");
            return;
        }
        this.itemHeights = new SparseArray<>();
        this.colCount = 2;
        this.viewItems = new ArrayList<>();
        this.gridRecycledViewPool = new GridRecycledViewPool();
    }

    static {
        ExtensionsRegistry.INSTANCE.registerSectionExtension(GridSectionItem.class, new GridSectionExtension());
    }

    @NotNull
    public final ArrayList<ViewItem> getViewItems() {
        return this.viewItems;
    }

    public final void addViewItem(@NotNull ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "640e8cccb8945aa7480123bcd3e4d18f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "640e8cccb8945aa7480123bcd3e4d18f");
            return;
        }
        h.b(viewItem, "viewItem");
        viewItem.viewIndex = Integer.valueOf(this.viewItems.size());
        this.viewItems.add(viewItem);
    }

    public final void setMaxRecycledViews(@NotNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9087ec6fe099ddf43ee3e8466ab57f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9087ec6fe099ddf43ee3e8466ab57f78");
            return;
        }
        h.b(str, DMKeys.KEY_VIEW_TYPE);
        this.gridRecycledViewPool.setMaxRecycledViews(str, i);
    }

    @NotNull
    public final GridSectionRowItem getGirdSectionRowItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a73261c648b3856d8b10045ae942f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (GridSectionRowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a73261c648b3856d8b10045ae942f7");
        }
        ArrayList<RowItem> arrayList = this.rowItems;
        if (arrayList != null && i < arrayList.size()) {
            if (arrayList.get(i) instanceof GridSectionRowItem) {
                RowItem rowItem = arrayList.get(i);
                if (rowItem != null) {
                    return (GridSectionRowItem) rowItem;
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.gridsection.GridSectionRowItem");
            }
            GridSectionRowItem gridSectionRowItem = new GridSectionRowItem();
            arrayList.set(i, gridSectionRowItem);
            return gridSectionRowItem;
        }
        return new GridSectionRowItem();
    }

    @Override // com.dianping.shield.node.useritem.SectionItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f915fcb19348344011d262ab8c32e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f915fcb19348344011d262ab8c32e5d");
            return;
        }
        super.clear();
        this.recommendItemHeight = 0.0f;
        this.itemHeights.clear();
        this.backgroundColor = null;
        this.colCount = 2;
        this.xGap = 0.0f;
        this.yGap = 0.0f;
        this.leftMargin = 0.0f;
        this.rightMargin = 0.0f;
        this.topMargin = 0.0f;
        this.bottomMargin = 0.0f;
        this.viewItems.clear();
    }
}
