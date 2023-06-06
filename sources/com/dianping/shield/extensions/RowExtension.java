package com.dianping.shield.extensions;

import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.ShieldProcessor;
import com.dianping.shield.node.processor.impl.row.BaseRowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J2\u0010\n\u001a,\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u00070\u00060\u000bj\u0015\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u00070\u0006`\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/extensions/RowExtension;", "Lcom/dianping/shield/extensions/ExtensionProcessorBuilder;", "()V", "createExtensionProcessor", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "processorClass", "Ljava/lang/Class;", "Lkotlin/jvm/JvmWildcard;", "createRowNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "extensionProcessorChain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getRowNodeCount", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class RowExtension implements ExtensionProcessorBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public ShieldRow createRowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "746dae9d5a0d6c32d76859c42ef40c8a", RobustBitConfig.DEFAULT_VALUE) ? (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "746dae9d5a0d6c32d76859c42ef40c8a") : new ShieldRow();
    }

    public int getRowNodeCount(@NotNull RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c5c2f75d417bf752872611b49f24cae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c5c2f75d417bf752872611b49f24cae")).intValue();
        }
        h.b(rowItem, "rowItem");
        if (rowItem.isLazyLoad) {
            return rowItem.viewCount;
        }
        ArrayList<ViewItem> arrayList = rowItem.viewItems;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.dianping.shield.extensions.ExtensionProcessorBuilder
    @NotNull
    public ArrayList<Class<? extends ShieldProcessor>> extensionProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b03651e165dcc7cd14f474554aa533d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b03651e165dcc7cd14f474554aa533d5");
        }
        ArrayList<Class<? extends ShieldProcessor>> arrayList = new ArrayList<>();
        arrayList.add(BaseRowNodeProcessor.class);
        return arrayList;
    }

    @Override // com.dianping.shield.extensions.ExtensionProcessorBuilder
    @Nullable
    public ShieldProcessor createExtensionProcessor(@NotNull Class<? extends ShieldProcessor> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75b4c55f316ac64f7ba5531581c95d5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75b4c55f316ac64f7ba5531581c95d5f");
        }
        h.b(cls, "processorClass");
        if (h.a(cls, BaseRowNodeProcessor.class)) {
            return new BaseRowNodeProcessor();
        }
        return null;
    }
}
