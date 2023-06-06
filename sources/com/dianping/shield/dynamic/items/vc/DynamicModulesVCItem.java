package com.dianping.shield.dynamic.items.vc;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.vc.BaseModulesVCInfoDiff;
import com.dianping.shield.dynamic.model.vc.BaseModulesVCInfo;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006JF\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001J\t\u0010\u0017\u001a\u00020\bH\u0096\u0001R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/dianping/shield/dynamic/items/vc/DynamicModulesVCItem;", "Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;", "diffProxy", "Lcom/dianping/shield/dynamic/diff/vc/BaseModulesVCInfoDiff;", "(Lcom/dianping/shield/dynamic/diff/vc/BaseModulesVCInfoDiff;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicModulesVCItem extends ModulesVCItem implements DynamicDiff<BaseModulesVCInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final BaseModulesVCInfoDiff<BaseModulesVCInfo, ModulesVCItem> diffProxy;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull BaseModulesVCInfo baseModulesVCInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {baseModulesVCInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26420706ff68e252a2f45efe74fbb73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26420706ff68e252a2f45efe74fbb73e");
            return;
        }
        h.b(baseModulesVCInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.diffProxy.diff(baseModulesVCInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00de82531d902e56fe023a78651cb43f", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00de82531d902e56fe023a78651cb43f");
        }
        h.b(str, "identifier");
        return this.diffProxy.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3be618112a298e432f84d873617891eb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3be618112a298e432f84d873617891eb") : this.diffProxy.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c117ab36a455e7e54660273eed2a6112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c117ab36a455e7e54660273eed2a6112");
        } else {
            this.diffProxy.onComputingComplete();
        }
    }

    public DynamicModulesVCItem(@NotNull BaseModulesVCInfoDiff<BaseModulesVCInfo, ModulesVCItem> baseModulesVCInfoDiff) {
        h.b(baseModulesVCInfoDiff, "diffProxy");
        Object[] objArr = {baseModulesVCInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce040a6cb5940b906d667fb838f04c5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce040a6cb5940b906d667fb838f04c5e");
            return;
        }
        this.diffProxy = baseModulesVCInfoDiff;
        this.diffProxy.setDynamicVCItem(this);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(BaseModulesVCInfo baseModulesVCInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(baseModulesVCInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }
}
