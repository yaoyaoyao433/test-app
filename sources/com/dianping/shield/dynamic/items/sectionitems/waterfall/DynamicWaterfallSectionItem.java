package com.dianping.shield.dynamic.items.sectionitems.waterfall;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.section.WaterfallSectionInfoDiff;
import com.dianping.shield.dynamic.model.section.WaterfallSectionInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionExtension;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J\t\u0010\u0019\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/items/sectionitems/waterfall/DynamicWaterfallSectionItem;", "Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSectionItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/section/WaterfallSectionInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "waterfallSectionInfoDiff", "Lcom/dianping/shield/dynamic/diff/section/WaterfallSectionInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/section/WaterfallSectionInfoDiff;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/WaterfallSectionInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicWaterfallSectionItem extends StaggeredGridSectionItem implements DynamicDiff<WaterfallSectionInfo> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WaterfallSectionInfoDiff waterfallSectionInfoDiff;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull WaterfallSectionInfo waterfallSectionInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {waterfallSectionInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdda2a76b89b4f93d8eab931be0445b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdda2a76b89b4f93d8eab931be0445b3");
            return;
        }
        h.b(waterfallSectionInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.waterfallSectionInfoDiff.diff(waterfallSectionInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76aed42c81510b53aa36993b4e82fdbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76aed42c81510b53aa36993b4e82fdbb");
        }
        h.b(str, "identifier");
        return this.waterfallSectionInfoDiff.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad31e46470f0294b1467429c4a14fb8f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad31e46470f0294b1467429c4a14fb8f") : this.waterfallSectionInfoDiff.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e0eff99dddd204ca2daea6e38dc56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e0eff99dddd204ca2daea6e38dc56b");
        } else {
            this.waterfallSectionInfoDiff.onComputingComplete();
        }
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(WaterfallSectionInfo waterfallSectionInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(waterfallSectionInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    public /* synthetic */ DynamicWaterfallSectionItem(DynamicChassisInterface dynamicChassisInterface, WaterfallSectionInfoDiff waterfallSectionInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new WaterfallSectionInfoDiff(dynamicChassisInterface) : waterfallSectionInfoDiff);
    }

    public DynamicWaterfallSectionItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull WaterfallSectionInfoDiff waterfallSectionInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(waterfallSectionInfoDiff, "waterfallSectionInfoDiff");
        Object[] objArr = {dynamicChassisInterface, waterfallSectionInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b8a1c163bcc3e7d6d32b54b7cc833d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b8a1c163bcc3e7d6d32b54b7cc833d");
            return;
        }
        this.waterfallSectionInfoDiff = waterfallSectionInfoDiff;
        this.waterfallSectionInfoDiff.setSectionItem(this);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/items/sectionitems/waterfall/DynamicWaterfallSectionItem$Companion;", "", "()V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        ExtensionsRegistry.INSTANCE.registerSectionExtension(DynamicWaterfallSectionItem.class, new StaggeredGridSectionExtension());
    }
}
