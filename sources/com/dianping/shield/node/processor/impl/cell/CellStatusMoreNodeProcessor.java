package com.dianping.shield.node.processor.impl.cell;

import com.dianping.agentsdk.framework.l;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.cellnode.callback.LoadingMorePaintingCallback;
import com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u000fJ0\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018H\u0014¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/CellStatusMoreNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "()V", "createDefaultLoadingMoreItem", "Lcom/dianping/shield/node/useritem/ViewItem;", DMKeys.KEY_VIEW_TYPE, "", "data", "", "clickCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "loadingMoreViewPaintingListener", "Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "hideBackGroud", "", "(Ljava/lang/String;Ljava/lang/Object;Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;Ljava/lang/Boolean;)Lcom/dianping/shield/node/useritem/ViewItem;", "handleShieldViewCell", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellStatusMoreNodeProcessor extends CellNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[l.a.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[l.a.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[l.a.FAILED.ordinal()] = 2;
            int[] iArr2 = new int[l.a.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[l.a.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[l.a.FAILED.ordinal()] = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    @Override // com.dianping.shield.node.processor.impl.cell.CellNodeProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleShieldViewCell(@org.jetbrains.annotations.NotNull com.dianping.shield.node.useritem.ShieldSectionCellItem r16, @org.jetbrains.annotations.NotNull com.dianping.shield.node.cellnode.ShieldViewCell r17, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldSection> r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.processor.impl.cell.CellStatusMoreNodeProcessor.handleShieldViewCell(com.dianping.shield.node.useritem.ShieldSectionCellItem, com.dianping.shield.node.cellnode.ShieldViewCell, java.util.ArrayList):boolean");
    }

    private final ViewItem createDefaultLoadingMoreItem(String str, Object obj, ViewClickCallbackWithData viewClickCallbackWithData, LoadingMoreViewPaintingListener loadingMoreViewPaintingListener, Boolean bool) {
        Object[] objArr = {str, obj, viewClickCallbackWithData, loadingMoreViewPaintingListener, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12f2a4b71bc946173774df58dc5b4645", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12f2a4b71bc946173774df58dc5b4645");
        }
        ViewItem viewItem = new ViewItem();
        viewItem.viewType = str;
        viewItem.data = viewItem.viewType;
        viewItem.viewPaintingCallback = new LoadingMorePaintingCallback(getLoadingAndLoadingMoreCreator(), loadingMoreViewPaintingListener, bool);
        if (viewClickCallbackWithData != null) {
            viewItem.data = obj;
            viewItem.clickCallback = viewClickCallbackWithData;
        }
        return viewItem;
    }
}
