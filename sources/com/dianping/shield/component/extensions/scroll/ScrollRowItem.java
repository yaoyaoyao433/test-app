package com.dianping.shield.component.extensions.scroll;

import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.picassomodule.widget.scroll.e;
import com.dianping.picassomodule.widget.scroll.pager.b;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/ScrollRowItem;", "Lcom/dianping/shield/component/extensions/common/BaseScrollableRowItem;", "()V", DMKeys.KEY_SCROLL_ATTACH_TRIGGER_DISTANCE, "", "attachedStatusChangedListener", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$OnAttachedStatusChangedListener;", "autoHeight", "", DMKeys.KEY_AUTO_LOOP_INTERVAL, DMKeys.KEY_COLCOUNT, DMKeys.KEY_SCROLL_GALLERY_GAP, "", "heightList", "", "isGallery", "isLoop", "isVertical", MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, "normalAttachView", "Lcom/dianping/shield/node/useritem/ViewItem;", "onFooterActionListener", "Lcom/dianping/picassomodule/widget/scroll/ScrollView$OnFooterActionListener;", "onPageSelectedListener", "Lcom/dianping/picassomodule/widget/scroll/pager/OnPageSelectedListener;", DMKeys.KEY_PAGE_INDEX, DMKeys.KEY_ROWCOUNT, "scrollEnabled", "scrollMode", "Lcom/dianping/picassomodule/widget/scroll/ScrollStyleHelper$ScrollStyle;", "triggeredAttachView", DMKeys.KEY_XGAP, DMKeys.KEY_YGAP, KNBConfig.CONFIG_CLEAR_CACHE, "", "Companion", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ScrollRowItem extends BaseScrollableRowItem {
    public static final Companion Companion = new Companion(null);
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
    public float galleryGap;
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
    public float marginBottom;
    @JvmField
    public float marginLeft;
    @JvmField
    public float marginRight;
    @JvmField
    public float marginTop;
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
    public float xGap;
    @JvmField
    public float yGap;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/ScrollRowItem$Companion;", "", "()V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ScrollRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a817be10ddbc14695d64b61d045574e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a817be10ddbc14695d64b61d045574e");
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

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(ScrollRowItem.class, new ScrollRowExtension());
    }

    @Override // com.dianping.shield.component.extensions.common.BaseScrollableRowItem, com.dianping.shield.component.extensions.common.CommonContainerRowItem, com.dianping.shield.node.useritem.RowItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b36d3ec664690d5cfa849a009f11cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b36d3ec664690d5cfa849a009f11cc6");
            return;
        }
        super.clear();
        this.marginTop = 0.0f;
        this.marginRight = 0.0f;
        this.marginBottom = 0.0f;
        this.marginLeft = 0.0f;
        this.xGap = 0.0f;
        this.attachTriggerDistance = -1;
        this.normalAttachView = null;
        this.triggeredAttachView = null;
        this.onFooterActionListener = null;
        this.attachedStatusChangedListener = null;
        this.yGap = 0.0f;
        this.scrollEnabled = true;
        this.pageIndex = -1;
        this.isLoop = false;
        this.isVertical = false;
        this.isGallery = false;
        this.galleryGap = 0.0f;
        this.rowCount = 1;
        this.colCount = 1;
        this.autoLoopInterval = 0;
        this.onPageSelectedListener = null;
        this.autoHeight = false;
        this.heightList.clear();
    }
}
