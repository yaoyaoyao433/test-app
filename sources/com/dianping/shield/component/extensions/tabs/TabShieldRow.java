package com.dianping.shield.component.extensions.tabs;

import com.dianping.picassomodule.widget.tab.b;
import com.dianping.picassomodule.widget.tab.d;
import com.dianping.picassomodule.widget.tab.e;
import com.dianping.picassomodule.widget.tab.h;
import com.dianping.shield.component.extensions.common.BaseScrollableRow;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/TabShieldRow;", "Lcom/dianping/shield/component/extensions/common/BaseScrollableRow;", "()V", "data", "", "displayIndexList", "", "", DMKeys.KEY_TAB_INITIAL_SELECTED_INDEX, "lastSelectedIndex", MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, "onLayoutListener", "Lcom/dianping/picassomodule/widget/tab/OnLayoutListener;", "onUpdateTabItemSelectedListener", "Lcom/dianping/picassomodule/widget/tab/OnUpdateTabItemSelectedListener;", "slideBarTheme", "Lcom/dianping/picassomodule/widget/tab/SlideBarStyle;", "slideBarViewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", DMKeys.KEY_TAB_HEIGHT, "tabTitleInfo", "Lcom/dianping/picassomodule/widget/tab/TabTitleInfo;", "tabTotalHeight", "viewClickCallBack", "Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;", DMKeys.KEY_XGAP, KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabShieldRow extends BaseScrollableRow {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public Object data;
    @JvmField
    @Nullable
    public List<Integer> displayIndexList;
    @JvmField
    public int initialSelectedIndex;
    @JvmField
    public int lastSelectedIndex;
    @JvmField
    public int marginBottom;
    @JvmField
    public int marginLeft;
    @JvmField
    public int marginRight;
    @JvmField
    public int marginTop;
    @JvmField
    @Nullable
    public b onLayoutListener;
    @JvmField
    @Nullable
    public d onUpdateTabItemSelectedListener;
    @JvmField
    @Nullable
    public e slideBarTheme;
    @JvmField
    @Nullable
    public ViewItem slideBarViewItem;
    @JvmField
    public int tabHeight;
    @JvmField
    @Nullable
    public h tabTitleInfo;
    @JvmField
    public int tabTotalHeight;
    @JvmField
    @Nullable
    public TabViewClickCallbackWithData viewClickCallBack;
    @JvmField
    public int xGap;

    public TabShieldRow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1eb2d7a705846b87d361a4755e644a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1eb2d7a705846b87d361a4755e644a6");
            return;
        }
        this.tabHeight = 45;
        this.initialSelectedIndex = -1;
        this.lastSelectedIndex = -1;
        this.tabTotalHeight = 45;
    }

    @Override // com.dianping.shield.component.extensions.common.BaseScrollableRow, com.dianping.shield.component.extensions.common.CommonContainerRow, com.dianping.shield.node.cellnode.ShieldRow
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73eb951ea4fac6daf44126b1ea81dcd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73eb951ea4fac6daf44126b1ea81dcd9");
            return;
        }
        super.clear();
        this.xGap = 0;
        this.marginLeft = 0;
        this.marginRight = 0;
        this.marginTop = 0;
        this.marginBottom = 0;
        this.tabHeight = 45;
        this.tabTotalHeight = 45;
        this.slideBarTheme = null;
        this.slideBarViewItem = null;
        this.onLayoutListener = null;
        this.onUpdateTabItemSelectedListener = null;
    }
}
