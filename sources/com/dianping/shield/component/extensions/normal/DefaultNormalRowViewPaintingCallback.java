package com.dianping.shield.component.extensions.normal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picassomodule.widget.normal.a;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.component.extensions.normal.NormalCellActionInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/DefaultNormalRowViewPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/component/extensions/normal/ShieldNormalViewHolder;", "currentShieldRow", "Lcom/dianping/shield/component/extensions/normal/NormalShieldRow;", "(Lcom/dianping/shield/component/extensions/normal/NormalShieldRow;)V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultNormalRowViewPaintingCallback implements ViewPaintingCallback<ShieldNormalViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @NotNull
    public NormalShieldRow currentShieldRow;

    public DefaultNormalRowViewPaintingCallback(@NotNull NormalShieldRow normalShieldRow) {
        h.b(normalShieldRow, "currentShieldRow");
        Object[] objArr = {normalShieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dff7e92eeb687c157f96bcb2e81eec0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dff7e92eeb687c157f96bcb2e81eec0");
        } else {
            this.currentShieldRow = normalShieldRow;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldNormalViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88a5e0efa852ce60c694265316e50036", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldNormalViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88a5e0efa852ce60c694265316e50036");
        }
        h.b(context, "context");
        a aVar = new a(context);
        ShieldNormalViewHolder shieldNormalViewHolder = new ShieldNormalViewHolder(aVar);
        if (!this.currentShieldRow.viewItems.isEmpty()) {
            ViewPaintingCallback viewPaintingCallback = this.currentShieldRow.viewItems.get(0).viewPaintingCallback;
            shieldNormalViewHolder.childViewHolder = viewPaintingCallback != null ? viewPaintingCallback.createViewHolder(context, aVar, str) : null;
        }
        return shieldNormalViewHolder;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull final ShieldNormalViewHolder shieldNormalViewHolder, @Nullable final Object obj, @Nullable final NodePath nodePath) {
        Object[] objArr = {shieldNormalViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "723fee9d4801af6bb6f3d6e04eaa8692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "723fee9d4801af6bb6f3d6e04eaa8692");
            return;
        }
        h.b(shieldNormalViewHolder, "viewHolder");
        boolean z = obj instanceof CommonContainerNodeData;
        if (z && (shieldNormalViewHolder.itemView instanceof a)) {
            final View view = shieldNormalViewHolder.itemView;
            CommonContainerNodeData commonContainerNodeData = (CommonContainerNodeData) (!z ? null : obj);
            CommonContainerRow shieldRow = commonContainerNodeData != null ? commonContainerNodeData.getShieldRow() : null;
            if (!(shieldRow instanceof NormalShieldRow)) {
                shieldRow = null;
            }
            final NormalShieldRow normalShieldRow = (NormalShieldRow) shieldRow;
            if (normalShieldRow == null || normalShieldRow.viewItems.isEmpty()) {
                return;
            }
            a aVar = (a) view;
            ViewItem viewItem = normalShieldRow.viewItems.get(0);
            h.a((Object) viewItem, "it.viewItems[0]");
            ViewItem viewItem2 = viewItem;
            ShieldViewHolder shieldViewHolder = shieldNormalViewHolder.childViewHolder;
            if (shieldViewHolder == null) {
                shieldViewHolder = new ShieldViewHolder(new View(((CommonContainerNodeData) obj).getContext()));
            }
            ShieldViewHolder shieldViewHolder2 = shieldViewHolder;
            ViewPaintingCallback viewPaintingCallback = viewItem2.viewPaintingCallback;
            if (viewPaintingCallback != null) {
                viewPaintingCallback.bindViewHolder(shieldViewHolder2, viewItem2.data, nodePath);
            }
            NormalCellActionInfo.ActionClickListener actionClickListener = new NormalCellActionInfo.ActionClickListener() { // from class: com.dianping.shield.component.extensions.normal.DefaultNormalRowViewPaintingCallback$bindViewHolder$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.extensions.normal.NormalCellActionInfo.ActionClickListener
                public final void onActionClick(@NotNull View view2, @NotNull NormalCellActionInfo normalCellActionInfo) {
                    ArrayList<ViewItem> arrayList;
                    ViewClickCallbackWithData actionCallBack;
                    Object[] objArr2 = {view2, normalCellActionInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6cc3733eadbfae45e92ffa2b9ea4b771", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6cc3733eadbfae45e92ffa2b9ea4b771");
                        return;
                    }
                    h.b(view2, Constants.EventType.VIEW);
                    h.b(normalCellActionInfo, "normalCellActionInfo");
                    ShieldDisplayNode entry = NormalShieldRow.this.getEntry(0);
                    if (entry == null || (arrayList = NormalShieldRow.this.getRowItem().viewItems) == null || arrayList.size() <= 0 || (actionCallBack = normalCellActionInfo.getActionCallBack()) == null) {
                        return;
                    }
                    actionCallBack.onViewClicked(view2, arrayList.get(0).data, entry.getPath());
                }
            };
            view.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.component.extensions.normal.DefaultNormalRowViewPaintingCallback$bindViewHolder$$inlined$let$lambda$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ArrayList<ViewItem> arrayList;
                    ViewClickCallbackWithData viewClickCallbackWithData;
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab36c7a9b7be84625dbc3b0161268135", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab36c7a9b7be84625dbc3b0161268135");
                        return;
                    }
                    ShieldDisplayNode entry = NormalShieldRow.this.getEntry(0);
                    if (entry == null || (arrayList = NormalShieldRow.this.getRowItem().viewItems) == null || arrayList.size() <= 0 || (viewClickCallbackWithData = arrayList.get(0).clickCallback) == null) {
                        return;
                    }
                    h.a((Object) view2, Constants.EventType.VIEW);
                    viewClickCallbackWithData.onViewClicked(view2, arrayList.get(0).data, entry.getPath());
                }
            });
            a.b bVar = new a.b();
            bVar.c = shieldViewHolder2.itemView;
            bVar.b = normalShieldRow.showArrow;
            bVar.a = normalShieldRow.clipChildren;
            bVar.g = normalShieldRow.arrowOffset;
            bVar.h = normalShieldRow.arrowPositionType;
            bVar.e = normalShieldRow.arrowTintColor;
            bVar.d = normalShieldRow.imageArrowResId;
            bVar.i = normalShieldRow.marginLeft;
            bVar.j = normalShieldRow.marginRight;
            bVar.k = normalShieldRow.marginTop;
            bVar.l = normalShieldRow.marginBottom;
            bVar.f = normalShieldRow.actionInfoList;
            bVar.n = actionClickListener;
            bVar.m = normalShieldRow.onActionViewShowListener;
            aVar.setNormalViewBuilder(bVar);
            RowItem rowItem = normalShieldRow.getRowItem();
            if (!(rowItem instanceof NormalRowItem)) {
                rowItem = null;
            }
            NormalRowItem normalRowItem = (NormalRowItem) rowItem;
            if (normalRowItem != null) {
                normalRowItem.setNormalView(aVar);
            }
        }
    }
}
