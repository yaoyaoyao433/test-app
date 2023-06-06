package com.dianping.shield.node.processor.legacy.row;

import android.view.View;
import com.dianping.agentsdk.framework.ae;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.w;
import com.dianping.agentsdk.framework.y;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.callback.legacy.LegacyViewPaintingCallback;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewLongClickCallbackWithData;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.t;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/NormalRowInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalRowInterfaceProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Type inference failed for: r1v23, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Object] */
    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull final af afVar, @NotNull RowItem rowItem, final int i, final int i2) {
        String geneLegacyViewId;
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c026e9c23fb5d9233637a471c0aceb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c026e9c23fb5d9233637a471c0aceb3")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (rowItem.viewItems == null) {
            rowItem.viewItems = new ArrayList<>();
            r rVar = r.a;
        }
        final t.b bVar = new t.b();
        bVar.a = null;
        boolean z = afVar instanceof ae;
        if (z) {
            bVar.a = ((ae) afVar).a(i, i2);
        }
        ArrayList<ViewItem> arrayList = rowItem.viewItems;
        if (arrayList != null) {
            Object obj = bVar.a;
            if (obj == null || (geneLegacyViewId = NodeCreator.Companion.geneLegacyViewIdWithData(afVar, i, i2, obj)) == null) {
                geneLegacyViewId = NodeCreator.Companion.geneLegacyViewId(afVar, i, i2);
            }
            ViewItem viewItem = new ViewItem(geneLegacyViewId);
            viewItem.viewType = String.valueOf(afVar.getViewType(i, i2));
            if (z) {
                bVar.a = ((ae) afVar).a(i, i2);
            }
            viewItem.viewPaintingCallback = new LegacyViewPaintingCallback(afVar);
            if ((afVar instanceof w) && ((w) afVar).getOnItemClickListener() != null) {
                viewItem.clickCallback = new ViewClickCallbackWithData() { // from class: com.dianping.shield.node.processor.legacy.row.NormalRowInterfaceProcessor$handleRowItem$$inlined$apply$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
                    public final void onViewClicked(@NotNull View view, @Nullable Object obj2, @Nullable NodePath nodePath) {
                        Object[] objArr2 = {view, obj2, nodePath};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ab300483323c1a587c9169d79f83a93", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ab300483323c1a587c9169d79f83a93");
                            return;
                        }
                        h.b(view, Constants.EventType.VIEW);
                        ((w) af.this).getOnItemClickListener();
                    }
                };
            }
            if ((afVar instanceof y) && ((y) afVar).getOnItemLongClickListener() != null) {
                viewItem.longClickCallback = new ViewLongClickCallbackWithData() { // from class: com.dianping.shield.node.processor.legacy.row.NormalRowInterfaceProcessor$handleRowItem$$inlined$apply$lambda$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ViewLongClickCallbackWithData
                    public final boolean onViewLongClicked(@NotNull View view, @Nullable Object obj2, @Nullable NodePath nodePath) {
                        Object[] objArr2 = {view, obj2, nodePath};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af96ca7cbc375891818c6b8c206646f6", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af96ca7cbc375891818c6b8c206646f6")).booleanValue();
                        }
                        h.b(view, Constants.EventType.VIEW);
                        ((y) af.this).getOnItemLongClickListener();
                        return false;
                    }
                };
            }
            arrayList.add(viewItem);
        }
        return false;
    }
}
