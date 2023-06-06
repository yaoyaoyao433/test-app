package com.dianping.shield.component.extensions.normal;

import android.view.View;
import com.dianping.picassomodule.widget.normal.a;
import com.dianping.shield.component.extensions.common.CommonContainerRowItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R&\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalRowItem;", "Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;", "()V", "actionInfoList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo;", "Lkotlin/collections/ArrayList;", DMKeys.KEY_ARROW_OFFSET, "", DMKeys.KEY_ARROW_POSITION_TYPE, DMKeys.KEY_ARROW_TINT_COLOR, "clipChildren", "", "imageArrowResId", MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, "normalView", "Lcom/dianping/picassomodule/widget/normal/NormalView;", "getNormalView", "()Lcom/dianping/picassomodule/widget/normal/NormalView;", "setNormalView", "(Lcom/dianping/picassomodule/widget/normal/NormalView;)V", "onActionViewShowListener", "Landroid/view/View$OnClickListener;", DMKeys.KEY_SHOW_ARROW, KNBConfig.CONFIG_CLEAR_CACHE, "", "Companion", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class NormalRowItem extends CommonContainerRowItem {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ArrayList<NormalCellActionInfo> actionInfoList;
    @JvmField
    public int arrowOffset;
    @JvmField
    public int arrowPositionType;
    @JvmField
    public int arrowTintColor;
    @JvmField
    public boolean clipChildren;
    @JvmField
    public int imageArrowResId;
    @JvmField
    public int marginBottom;
    @JvmField
    public int marginLeft;
    @JvmField
    public int marginRight;
    @JvmField
    public int marginTop;
    @Nullable
    private a normalView;
    @JvmField
    @Nullable
    public View.OnClickListener onActionViewShowListener;
    @JvmField
    public boolean showArrow;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalRowItem$Companion;", "", "()V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public NormalRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dbd5652fc0d2d1de75e9d97f5f799c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dbd5652fc0d2d1de75e9d97f5f799c8");
        } else {
            this.clipChildren = true;
        }
    }

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(NormalRowItem.class, new NormalRowExtension());
    }

    @Nullable
    public final a getNormalView() {
        return this.normalView;
    }

    public final void setNormalView(@Nullable a aVar) {
        this.normalView = aVar;
    }

    @Override // com.dianping.shield.component.extensions.common.CommonContainerRowItem, com.dianping.shield.node.useritem.RowItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7ddb6f7fbb03fa89578dec4b6f4806c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7ddb6f7fbb03fa89578dec4b6f4806c");
            return;
        }
        super.clear();
        this.showArrow = false;
        this.clipChildren = true;
        this.arrowTintColor = 0;
        this.arrowPositionType = 0;
        this.arrowOffset = 0;
        this.imageArrowResId = 0;
        this.marginLeft = 0;
        this.marginRight = 0;
        this.marginTop = 0;
        this.marginBottom = 0;
        this.actionInfoList = null;
        this.onActionViewShowListener = null;
        this.normalView = null;
    }
}
