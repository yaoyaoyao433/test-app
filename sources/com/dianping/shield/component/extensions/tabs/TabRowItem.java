package com.dianping.shield.component.extensions.tabs;

import com.dianping.picassomodule.widget.tab.b;
import com.dianping.picassomodule.widget.tab.d;
import com.dianping.picassomodule.widget.tab.e;
import com.dianping.picassomodule.widget.tab.h;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
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
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "Lcom/dianping/shield/component/extensions/common/BaseScrollableRowItem;", "()V", "data", "", "displayIndexList", "", "", DMKeys.KEY_TAB_INITIAL_SELECTED_INDEX, "lastSelectedIndex", MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, "onLayoutListener", "Lcom/dianping/picassomodule/widget/tab/OnLayoutListener;", "onUpdateTabItemSelectedListener", "Lcom/dianping/picassomodule/widget/tab/OnUpdateTabItemSelectedListener;", "pageScrollEventDispatcherProvider", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", DMKeys.KEY_TAB_SELECT_INDEX, "slideBarTheme", "Lcom/dianping/picassomodule/widget/tab/SlideBarStyle;", "slideBarViewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", DMKeys.KEY_TAB_HEIGHT, "tabTitleInfo", "Lcom/dianping/picassomodule/widget/tab/TabTitleInfo;", DMKeys.KEY_TAB_WIDTH, "verticalScrollEventDispatcherProvider", "viewClickCallBack", "Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;", DMKeys.KEY_XGAP, KNBConfig.CONFIG_CLEAR_CACHE, "", "Companion", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class TabRowItem extends BaseScrollableRowItem {
    public static final Companion Companion = new Companion(null);
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
    public ComponentScrollEventHelper.IEventDispatcherProvider pageScrollEventDispatcherProvider;
    @JvmField
    public int selectIndex;
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
    public int tabWidth;
    @JvmField
    @Nullable
    public ComponentScrollEventHelper.IEventDispatcherProvider verticalScrollEventDispatcherProvider;
    @JvmField
    @Nullable
    public TabViewClickCallbackWithData viewClickCallBack;
    @JvmField
    public int xGap;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/TabRowItem$Companion;", "", "()V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public TabRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356917e577e73f1feac1f13dc7c74881", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356917e577e73f1feac1f13dc7c74881");
            return;
        }
        this.tabHeight = 45;
        this.initialSelectedIndex = -1;
        this.selectIndex = -1;
        this.lastSelectedIndex = -1;
    }

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(TabRowItem.class, new TabRowExtension());
    }

    @Override // com.dianping.shield.component.extensions.common.BaseScrollableRowItem, com.dianping.shield.component.extensions.common.CommonContainerRowItem, com.dianping.shield.node.useritem.RowItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e494e35bb11821967563f4dc91d5b89f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e494e35bb11821967563f4dc91d5b89f");
            return;
        }
        super.clear();
        this.xGap = 0;
        this.marginLeft = 0;
        this.marginRight = 0;
        this.marginTop = 0;
        this.marginBottom = 0;
        this.tabHeight = 45;
        this.slideBarTheme = null;
        this.slideBarViewItem = null;
        this.tabTitleInfo = null;
        this.onLayoutListener = null;
        this.onUpdateTabItemSelectedListener = null;
        this.data = null;
    }
}
