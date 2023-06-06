package com.dianping.shield.dynamic.diff.view;

import android.view.View;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData;
import com.dianping.shield.dynamic.diff.view.TabViewInfoDiff;
import com.dianping.shield.dynamic.items.itemdata.DynamicTabData;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.node.cellnode.NodePath;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "com/dianping/shield/dynamic/diff/view/TabViewInfoDiff$viewClickCallbackWithTabData$2$1", "T", "V", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "Lcom/dianping/shield/node/useritem/ViewItem;", "invoke", "()Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff$viewClickCallbackWithTabData$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabViewInfoDiff$viewClickCallbackWithTabData$2 extends i implements a<AnonymousClass1> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DynamicChassisInterface $hostChassis;
    public final /* synthetic */ TabViewInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabViewInfoDiff$viewClickCallbackWithTabData$2(TabViewInfoDiff tabViewInfoDiff, DynamicChassisInterface dynamicChassisInterface) {
        super(0);
        this.this$0 = tabViewInfoDiff;
        this.$hostChassis = dynamicChassisInterface;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.dynamic.diff.view.TabViewInfoDiff$viewClickCallbackWithTabData$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08deb7bef74a6cc839950239a3709d46", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08deb7bef74a6cc839950239a3709d46") : new TabViewClickCallbackWithData() { // from class: com.dianping.shield.dynamic.diff.view.TabViewInfoDiff$viewClickCallbackWithTabData$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData, com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
            public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
                Object[] objArr2 = {view, obj, nodePath};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22f1d8c7cbba67f517417428de633cf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22f1d8c7cbba67f517417428de633cf2");
                    return;
                }
                h.b(view, Constants.EventType.VIEW);
                TabViewClickCallbackWithData.DefaultImpls.onViewClicked(this, view, obj, nodePath);
            }

            @Override // com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData
            public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar) {
                BaseViewInfo baseViewInfo;
                IndexPath anchorIndexPath;
                TabViewInfoDiff.AnchorIndexPathClickCallback anchorIndexPathClickCallback;
                Object obj2 = obj;
                Object[] objArr2 = {view, obj2, nodePath, gVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f3a258e2a450ba441e7456d0326afcc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f3a258e2a450ba441e7456d0326afcc1");
                    return;
                }
                h.b(view, Constants.EventType.VIEW);
                h.b(gVar, "reason");
                if (!(obj2 instanceof DynamicTabData)) {
                    obj2 = null;
                }
                DynamicTabData dynamicTabData = (DynamicTabData) obj2;
                if (dynamicTabData == null || (baseViewInfo = dynamicTabData.normalData.newViewInfo) == null) {
                    return;
                }
                if (baseViewInfo.getDidSelectCallback() != null || baseViewInfo.getJumpUrl() != null || baseViewInfo.getClickMgeInfo() != null || baseViewInfo.getMidasInfo() != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    TabViewInfoDiff$viewClickCallbackWithTabData$2.this.this$0.handleClick(TabViewInfoDiff$viewClickCallbackWithTabData$2.this.$hostChassis, baseViewInfo, TabViewInfoDiff$viewClickCallbackWithTabData$2.this.this$0.generateCallbackJson(dynamicTabData.normalData, nodePath, gVar), iArr);
                }
                if (gVar == g.USER_CLICK) {
                    if (!(baseViewInfo instanceof TabViewInfo)) {
                        baseViewInfo = null;
                    }
                    TabViewInfo tabViewInfo = (TabViewInfo) baseViewInfo;
                    if (tabViewInfo == null || (anchorIndexPath = tabViewInfo.getAnchorIndexPath()) == null || (anchorIndexPathClickCallback = TabViewInfoDiff$viewClickCallbackWithTabData$2.this.this$0.getAnchorIndexPathClickCallback()) == null) {
                        return;
                    }
                    anchorIndexPathClickCallback.anchorIndexPathClick(anchorIndexPath);
                }
            }
        };
    }
}
