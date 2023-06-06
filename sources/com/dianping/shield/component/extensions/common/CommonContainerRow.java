package com.dianping.shield.component.extensions.common;

import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u00102\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "()V", "dNodeData", "Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;", "getDNodeData", "()Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;", "setDNodeData", "(Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;)V", "rowPaintingCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "viewItems", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lkotlin/collections/ArrayList;", KNBConfig.CONFIG_CLEAR_CACHE, "", "setViewItems", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class CommonContainerRow extends ShieldRow {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private CommonContainerNodeData dNodeData;
    @JvmField
    @Nullable
    public ViewPaintingCallback<?> rowPaintingCallback;
    @JvmField
    @NotNull
    public final ArrayList<ViewItem> viewItems;

    public CommonContainerRow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da37a6c0af35e7012e37d1cb71868b35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da37a6c0af35e7012e37d1cb71868b35");
        } else {
            this.viewItems = new ArrayList<>();
        }
    }

    @Nullable
    public final CommonContainerNodeData getDNodeData() {
        return this.dNodeData;
    }

    public final void setDNodeData(@Nullable CommonContainerNodeData commonContainerNodeData) {
        this.dNodeData = commonContainerNodeData;
    }

    public final void setViewItems(@Nullable ArrayList<ViewItem> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56760bef24b0c6276f8788d165ab0d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56760bef24b0c6276f8788d165ab0d28");
        } else if (arrayList != null) {
            this.viewItems.clear();
            for (ViewItem viewItem : arrayList) {
                this.viewItems.add(viewItem);
            }
        }
    }

    @Override // com.dianping.shield.node.cellnode.ShieldRow
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a351f5e69a4236cb7c1c30462cb1bab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a351f5e69a4236cb7c1c30462cb1bab");
            return;
        }
        super.clear();
        this.viewItems.clear();
        this.dNodeData = null;
    }
}
