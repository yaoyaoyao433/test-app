package com.dianping.shield.component.extensions.scroll;

import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.picassomodule.widget.scroll.e;
import com.dianping.picassomodule.widget.scroll.pager.b;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/ScrollRow;", "Lcom/dianping/shield/component/extensions/common/BaseScrollableRow;", "()V", DMKeys.KEY_SCROLL_ATTACH_TRIGGER_DISTANCE, "", "attachedStatusChangedListener", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$OnAttachedStatusChangedListener;", "autoHeight", "", DMKeys.KEY_AUTO_LOOP_INTERVAL, DMKeys.KEY_COLCOUNT, DMKeys.KEY_SCROLL_GALLERY_GAP, "heightList", "", "isGallery", "isLoop", "isVertical", MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, "normalAttachView", "Lcom/dianping/shield/node/useritem/ViewItem;", "onFooterActionListener", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$OnFooterActionListener;", "onPageSelectedListener", "Lcom/dianping/picassomodule/widget/scroll/pager/OnPageSelectedListener;", DMKeys.KEY_PAGE_INDEX, DMKeys.KEY_ROWCOUNT, "scrollEnabled", "scrollMode", "Lcom/dianping/picassomodule/widget/scroll/ScrollStyleHelper$ScrollStyle;", "triggeredAttachView", DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollRow extends BaseScrollableRow {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int attachTriggerDistance;
    @JvmField
    @Nullable
    public ScrollView.c attachedStatusChangedListener;
    @JvmField
    public boolean autoHeight;
    @JvmField
    public int autoLoopInterval;
    @JvmField
    public int colCount;
    @JvmField
    public int galleryGap;
    @JvmField
    @NotNull
    public List<Integer> heightList;
    @JvmField
    public boolean isGallery;
    @JvmField
    public boolean isLoop;
    @JvmField
    public boolean isVertical;
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
    public ViewItem normalAttachView;
    @JvmField
    @Nullable
    public ScrollView.d onFooterActionListener;
    @JvmField
    @Nullable
    public b onPageSelectedListener;
    @JvmField
    public int pageIndex;
    @JvmField
    public int rowCount;
    @JvmField
    public boolean scrollEnabled;
    @JvmField
    @NotNull
    public e.a scrollMode;
    @JvmField
    @Nullable
    public ViewItem triggeredAttachView;
    @JvmField
    public int xGap;
    @JvmField
    public int yGap;

    public ScrollRow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e7aee5ceb9bea5552666e561475aa6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e7aee5ceb9bea5552666e561475aa6c");
            return;
        }
        this.scrollMode = e.a.NORMAL;
        this.scrollEnabled = true;
        this.attachTriggerDistance = -1;
        this.pageIndex = -1;
        this.rowCount = 1;
        this.colCount = 1;
        this.heightList = new ArrayList();
    }

    @Override // com.dianping.shield.component.extensions.common.BaseScrollableRow, com.dianping.shield.component.extensions.common.CommonContainerRow, com.dianping.shield.node.cellnode.ShieldRow
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ece1251fae520ded0a3b9f7e38239ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ece1251fae520ded0a3b9f7e38239ee9");
            return;
        }
        super.clear();
        this.marginTop = 0;
        this.marginRight = 0;
        this.marginBottom = 0;
        this.marginLeft = 0;
        this.xGap = 0;
        this.normalAttachView = null;
        this.triggeredAttachView = null;
        this.attachTriggerDistance = -1;
        this.attachedStatusChangedListener = null;
        this.onFooterActionListener = null;
        this.yGap = 0;
        this.scrollEnabled = true;
        this.pageIndex = -1;
        this.isLoop = false;
        this.isVertical = false;
        this.isGallery = false;
        this.galleryGap = 0;
        this.rowCount = 1;
        this.colCount = 1;
        this.autoLoopInterval = 0;
        this.onPageSelectedListener = null;
        this.autoHeight = false;
        this.heightList.clear();
    }
}
