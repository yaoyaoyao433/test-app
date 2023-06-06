package com.dianping.shield.dynamic.items.sectionitems.normal;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff;
import com.dianping.shield.dynamic.model.section.NormalSectionInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J\t\u0010\u0019\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/dynamic/items/sectionitems/normal/DynamicSectionItem;", "Lcom/dianping/shield/node/useritem/SectionItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/section/NormalSectionInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "normalSectionInfoDiff", "Lcom/dianping/shield/dynamic/diff/section/NormalSectionInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/section/NormalSectionInfoDiff;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/NormalSectionInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicSectionItem extends SectionItem implements DynamicDiff<NormalSectionInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final NormalSectionInfoDiff normalSectionInfoDiff;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull NormalSectionInfo normalSectionInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {normalSectionInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "672d51f958559f09bd0d4ff884461f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "672d51f958559f09bd0d4ff884461f4c");
            return;
        }
        h.b(normalSectionInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.normalSectionInfoDiff.diff(normalSectionInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6908bf19eff0696738f677aad55bc09", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6908bf19eff0696738f677aad55bc09");
        }
        h.b(str, "identifier");
        return this.normalSectionInfoDiff.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67608b3ddf0db0a84239a96f836f093e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67608b3ddf0db0a84239a96f836f093e") : this.normalSectionInfoDiff.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df06aa03d4573ac7c60ea992e5bbe00e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df06aa03d4573ac7c60ea992e5bbe00e");
        } else {
            this.normalSectionInfoDiff.onComputingComplete();
        }
    }

    public /* synthetic */ DynamicSectionItem(DynamicChassisInterface dynamicChassisInterface, NormalSectionInfoDiff normalSectionInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new NormalSectionInfoDiff(dynamicChassisInterface) : normalSectionInfoDiff);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(NormalSectionInfo normalSectionInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(normalSectionInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    public DynamicSectionItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull NormalSectionInfoDiff normalSectionInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(normalSectionInfoDiff, "normalSectionInfoDiff");
        Object[] objArr = {dynamicChassisInterface, normalSectionInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53b172786df69049c4f8047aea23a89c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53b172786df69049c4f8047aea23a89c");
            return;
        }
        this.normalSectionInfoDiff = normalSectionInfoDiff;
        this.normalSectionInfoDiff.setSectionItem(this);
    }
}
