package com.dianping.shield.component.extensions.grid;

import com.dianping.picassomodule.widget.cssgrid.d;
import com.dianping.picassomodule.widget.cssgrid.g;
import com.dianping.shield.component.extensions.common.CommonContainerRowItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/GridRowItem;", "Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;", "()V", DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "", DMKeys.KEY_COLCOUNT, "", DMKeys.KEY_GRID_AREAS, "", "", "[[Ljava/lang/String;", DMKeys.KEY_GRID_COLUMN_WIDTHS, "Ljava/util/ArrayList;", "gridDrawInfo", "Lcom/dianping/picassomodule/widget/cssgrid/GridDrawInfo;", "gridRowHeight", "leftMargin", "recommendItemHeight", "rightMargin", DMKeys.KEY_ROWCOUNT, "rowHeight", "rowWidth", "separatorLineColor", DMKeys.KEY_SEPARATOR_LINE_STYLE, "Lcom/dianping/picassomodule/widget/cssgrid/GridSeperationLineDescription$GridSeperationLineStyle;", DMKeys.KEY_MARGIN_TOP_MARGIN, DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, KNBConfig.CONFIG_CLEAR_CACHE, "", "Companion", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class GridRowItem extends CommonContainerRowItem {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public float bottomMargin;
    @JvmField
    public int colCount;
    @JvmField
    @Nullable
    public String[][] gridAreas;
    @JvmField
    @Nullable
    public ArrayList<String> gridColWidths;
    @JvmField
    @Nullable
    public d gridDrawInfo;
    @JvmField
    @Nullable
    public ArrayList<String> gridRowHeight;
    @JvmField
    public float leftMargin;
    @JvmField
    public float recommendItemHeight;
    @JvmField
    public float rightMargin;
    @JvmField
    public int rowCount;
    @JvmField
    public float rowHeight;
    @JvmField
    public int rowWidth;
    @JvmField
    @NotNull
    public String separatorLineColor;
    @JvmField
    @NotNull
    public g.a separatorLineStyle;
    @JvmField
    public float topMargin;
    @JvmField
    public float xGap;
    @JvmField
    public float yGap;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/GridRowItem$Companion;", "", "()V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public GridRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5bc5b75080915230a45e61bc7195cad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5bc5b75080915230a45e61bc7195cad");
            return;
        }
        this.rowWidth = -1;
        this.colCount = 2;
        this.rowCount = -1;
        this.separatorLineStyle = g.a.GRID_SERPERATIONLINE_STYLE_NONE;
        this.separatorLineColor = "#FFD7D7D7";
    }

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(GridRowItem.class, new GridRowExtension());
    }

    @Override // com.dianping.shield.component.extensions.common.CommonContainerRowItem, com.dianping.shield.node.useritem.RowItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53cba7c7349d7eea7288838af0ca9ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53cba7c7349d7eea7288838af0ca9ad6");
            return;
        }
        super.clear();
        this.recommendItemHeight = 0.0f;
        this.rowHeight = 0.0f;
        this.rowWidth = -1;
        this.colCount = 2;
        this.rowCount = -1;
        this.xGap = 0.0f;
        this.yGap = 0.0f;
        this.leftMargin = 0.0f;
        this.rightMargin = 0.0f;
        this.topMargin = 0.0f;
        this.bottomMargin = 0.0f;
        this.separatorLineStyle = g.a.GRID_SERPERATIONLINE_STYLE_NONE;
        this.separatorLineColor = "#FFD7D7D7";
        this.gridRowHeight = null;
        this.gridColWidths = null;
        this.gridAreas = null;
        this.gridDrawInfo = null;
    }
}
