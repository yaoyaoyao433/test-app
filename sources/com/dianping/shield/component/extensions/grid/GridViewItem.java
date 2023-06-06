package com.dianping.shield.component.extensions.grid;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/GridViewItem;", "Lcom/dianping/shield/node/useritem/ViewItem;", "()V", DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "", DMKeys.KEY_GRID_COLUMN_SPAN, "", DMKeys.KEY_GRID_COLUMN_START, DMKeys.KEY_GRID_AREA_TAG, "", "leftMargin", "rightMargin", DMKeys.KEY_GRID_ROW_SPAN, DMKeys.KEY_GRID_ROW_START, DMKeys.KEY_MARGIN_TOP_MARGIN, "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class GridViewItem extends ViewItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public float bottomMargin;
    @JvmField
    @Nullable
    public String gridAreaTag;
    @JvmField
    public float leftMargin;
    @JvmField
    public float rightMargin;
    @JvmField
    public float topMargin;
    @JvmField
    public int rowStart = -1;
    @JvmField
    public int colStart = -1;
    @JvmField
    public int rowSpan = 1;
    @JvmField
    public int colSpan = 1;
}
