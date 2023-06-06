package com.dianping.shield.dynamic.items.sectionitems;

import android.content.Context;
import android.view.View;
import com.dianping.agentsdk.framework.g;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicWrapperView;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JA\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/dianping/shield/dynamic/items/sectionitems/DynamicSectionBGViewDiff;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/node/useritem/SectionItem;)V", "computingViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "dynamicWrapperView", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicWrapperView;", "identifier", "", "viewItem", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "getId", "onComputingComplete", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicSectionBGViewDiff implements DynamicDiff<SectionInfo.BaseSectionInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DynamicViewItem<ExtraViewInfo> computingViewItem;
    private DynamicWrapperView dynamicWrapperView;
    private DynamicChassisInterface hostChassis;
    private String identifier;
    private SectionItem sectionItem;
    private DynamicViewItem<ExtraViewInfo> viewItem;

    public DynamicSectionBGViewDiff(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull SectionItem sectionItem) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(sectionItem, "sectionItem");
        Object[] objArr = {dynamicChassisInterface, sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca4a5142d9fa5d8e3b192f3dec90b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca4a5142d9fa5d8e3b192f3dec90b74");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.sectionItem = sectionItem;
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(SectionInfo.BaseSectionInfo baseSectionInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(baseSectionInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        return this.identifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r0 == null) goto L29;
     */
    /* renamed from: diff  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void diff2(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.section.SectionInfo.BaseSectionInfo r11, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r12, @org.jetbrains.annotations.Nullable java.lang.Integer r13, @org.jetbrains.annotations.Nullable java.lang.Integer r14) {
        /*
            r10 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            r1 = 1
            r0[r1] = r12
            r9 = 2
            r0[r9] = r13
            r13 = 3
            r0[r13] = r14
            com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.items.sectionitems.DynamicSectionBGViewDiff.changeQuickRedirect
            java.lang.String r14 = "c7bec3157b1fb191208d80583c0f31f8"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r10
            r3 = r13
            r5 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r13, r8, r14)
            return
        L24:
            java.lang.String r13 = "newInfo"
            kotlin.jvm.internal.h.b(r11, r13)
            java.lang.String r13 = "diffResult"
            kotlin.jvm.internal.h.b(r12, r13)
            r13 = 0
            r10.computingViewItem = r13
            com.dianping.shield.dynamic.model.view.ExtraViewInfo r11 = r11.getBackgroundViewInfo()
            if (r11 == 0) goto Lb3
            com.dianping.shield.dynamic.model.DiffableInfo r11 = (com.dianping.shield.dynamic.model.DiffableInfo) r11
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r14 = r10.hostChassis
            android.content.Context r14 = r14.getHostContext()
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r0 = r10.hostChassis
            int r0 = com.dianping.shield.dynamic.utils.DMViewUtils.getRecyclerWidth(r0)
            float r0 = (float) r0
            int r14 = com.dianping.util.j.b(r14, r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r0 = r11.getIdentifier()
            if (r0 == 0) goto L81
            java.lang.String r1 = r10.identifier
            boolean r0 = kotlin.jvm.internal.h.a(r0, r1)
            if (r0 == 0) goto L5f
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.ExtraViewInfo> r0 = r10.viewItem
            goto L60
        L5f:
            r0 = r13
        L60:
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r0
            if (r0 != 0) goto L7f
            if (r11 == 0) goto L77
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r0 = new com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff r1 = new com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r2 = r10.hostChassis
            r1.<init>(r2, r13, r9, r13)
            com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff r1 = (com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff) r1
            r0.<init>(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r0
            goto L7f
        L77:
            kotlin.o r11 = new kotlin.o
            java.lang.String r12 = "null cannot be cast to non-null type T"
            r11.<init>(r12)
            throw r11
        L7f:
            if (r0 != 0) goto L93
        L81:
            if (r11 == 0) goto Lab
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r0 = new com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff r1 = new com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r2 = r10.hostChassis
            r1.<init>(r2, r13, r9, r13)
            com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff r1 = (com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff) r1
            r0.<init>(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r0
        L93:
            if (r11 == 0) goto La3
            r0.diff(r11, r12, r14, r13)
            boolean r11 = r0 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r11 != 0) goto L9d
            goto L9e
        L9d:
            r13 = r0
        L9e:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r13 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r13
            r10.computingViewItem = r13
            return
        La3:
            kotlin.o r11 = new kotlin.o
            java.lang.String r12 = "null cannot be cast to non-null type T"
            r11.<init>(r12)
            throw r11
        Lab:
            kotlin.o r11 = new kotlin.o
            java.lang.String r12 = "null cannot be cast to non-null type T"
            r11.<init>(r12)
            throw r11
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.items.sectionitems.DynamicSectionBGViewDiff.diff2(com.dianping.shield.dynamic.model.section.SectionInfo$BaseSectionInfo, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        DynamicModuleViewData dynamicModuleViewData;
        ShieldViewHolder directPaintView;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e064779452ae4617b45f4bd7d1765aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e064779452ae4617b45f4bd7d1765aa");
            return;
        }
        this.sectionItem.backgroundViewInfo = null;
        this.dynamicWrapperView = null;
        DynamicViewItem<ExtraViewInfo> dynamicViewItem = this.computingViewItem;
        if (dynamicViewItem != null) {
            dynamicViewItem.onComputingComplete();
            this.viewItem = this.computingViewItem;
            DynamicViewItem<ExtraViewInfo> dynamicViewItem2 = this.viewItem;
            View view = (dynamicViewItem2 == null || (directPaintView = dynamicViewItem2.directPaintView(this.hostChassis.getHostContext())) == null) ? null : directPaintView.itemView;
            if (!(view instanceof DynamicWrapperView)) {
                view = null;
            }
            this.dynamicWrapperView = (DynamicWrapperView) view;
            SectionItem sectionItem = this.sectionItem;
            DynamicWrapperView dynamicWrapperView = this.dynamicWrapperView;
            Context hostContext = this.hostChassis.getHostContext();
            Object obj = dynamicViewItem.data;
            if (!(obj instanceof DynamicModuleViewItemData)) {
                obj = null;
            }
            DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
            if (dynamicModuleViewItemData != null && (dynamicModuleViewData = dynamicModuleViewItemData.viewData) != null) {
                i = dynamicModuleViewData.getInputHeight();
            }
            sectionItem.backgroundViewInfo = new g(dynamicWrapperView, j.a(hostContext, i));
            this.computingViewItem = null;
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f64aee78ee8a84f13d5ae210af0627", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f64aee78ee8a84f13d5ae210af0627");
        }
        h.b(str, "identifier");
        if (h.a((Object) str, (Object) getId())) {
            return this.viewItem;
        }
        return null;
    }
}
