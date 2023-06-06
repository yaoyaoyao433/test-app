package com.dianping.shield.component.extensions.normal;

import com.dianping.shield.component.extensions.common.ContainerRowBgMaskProcessor;
import com.dianping.shield.extensions.RowExtension;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.ShieldProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J2\u0010\t\u001a,\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u000b0\u00060\nj\u0015\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u000b0\u0006`\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalRowExtension;", "Lcom/dianping/shield/extensions/RowExtension;", "()V", "createExtensionProcessor", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "processorClass", "Ljava/lang/Class;", "createRowNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "extensionProcessorChain", "Ljava/util/ArrayList;", "Lkotlin/jvm/JvmWildcard;", "Lkotlin/collections/ArrayList;", "getRowNodeCount", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalRowExtension extends RowExtension {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.extensions.RowExtension
    public final int getRowNodeCount(@NotNull RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec2b5b7a959111e2b0d42e96523fa804", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec2b5b7a959111e2b0d42e96523fa804")).intValue();
        }
        h.b(rowItem, "rowItem");
        return 1;
    }

    @Override // com.dianping.shield.extensions.RowExtension
    @NotNull
    public final ShieldRow createRowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c31e9cae6edb7aa63309e326f2f4cf2f", RobustBitConfig.DEFAULT_VALUE) ? (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c31e9cae6edb7aa63309e326f2f4cf2f") : new NormalShieldRow();
    }

    @Override // com.dianping.shield.extensions.RowExtension, com.dianping.shield.extensions.ExtensionProcessorBuilder
    @NotNull
    public final ArrayList<Class<? extends ShieldProcessor>> extensionProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e5022a952b30462c066f12dcd824009", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e5022a952b30462c066f12dcd824009");
        }
        ArrayList<Class<? extends ShieldProcessor>> arrayList = new ArrayList<>();
        arrayList.add(NormalRowNodeProcessor.class);
        arrayList.add(ContainerRowBgMaskProcessor.class);
        return arrayList;
    }

    @Override // com.dianping.shield.extensions.RowExtension, com.dianping.shield.extensions.ExtensionProcessorBuilder
    @Nullable
    public final ShieldProcessor createExtensionProcessor(@NotNull Class<? extends ShieldProcessor> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45e71b3cc194ead5659575550ad42526", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45e71b3cc194ead5659575550ad42526");
        }
        h.b(cls, "processorClass");
        if (h.a(cls, NormalRowNodeProcessor.class)) {
            return new NormalRowNodeProcessor();
        }
        if (h.a(cls, ContainerRowBgMaskProcessor.class)) {
            return new ContainerRowBgMaskProcessor();
        }
        return null;
    }
}
