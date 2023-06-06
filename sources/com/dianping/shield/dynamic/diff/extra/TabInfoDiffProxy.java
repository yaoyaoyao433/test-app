package com.dianping.shield.dynamic.diff.extra;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.picassomodule.widget.tab.d;
import com.dianping.picassomodule.widget.tab.e;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.picassomodule.widget.tab.h;
import com.dianping.shield.component.extensions.common.CommonContainerRowItem;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy;
import com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.TabViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.ViewInfoDiff;
import com.dianping.shield.dynamic.items.itemdata.DynamicTabData;
import com.dianping.shield.dynamic.items.viewitems.DynamicTabViewItem;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.TabInfo;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.feature.PositionInfoInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J1\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0017\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010\u0017\u001a\u00020 H\u0016J0\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016Ji\u0010)\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00152\b\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010\b\u001a\u00020\t2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00190.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u00101Jw\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u0002042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00190.2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00190.2\b\u0010/\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u00106Jw\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u0002042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00190.2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00190.2\b\u0010/\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u00106J\u001a\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>H\u0016J\u001a\u0010?\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020\fH\u0016J*\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020:2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J.\u0010L\u001a\u00020\u00072\b\u0010G\u001a\u0004\u0018\u00010\u00012\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010M\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J)\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\t2\b\u0010P\u001a\u0004\u0018\u00010\u00122\b\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010RJ\u0018\u0010S\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\tH\u0016J\"\u0010U\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010X\u001a\u00020\u0012H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006Y"}, d2 = {"Lcom/dianping/shield/dynamic/diff/extra/TabInfoDiffProxy;", "", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "bindSlideBarViewItem", "", "computingItem", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "currentRowItem", "calculateRecommendWidth", "", "newInfo", "Lcom/dianping/shield/dynamic/model/view/TabInfo;", "showCount", "horizontalMargin", "isEqualized", "", "(Lcom/dianping/shield/dynamic/model/view/TabInfo;Ljava/lang/Integer;IZ)Ljava/lang/Integer;", "createBgMaskItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", DMKeys.KEY_VIEW_INFO, "createChildItem", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "createClickCallBack", "Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;", "tabClickCallback", "Lcom/dianping/shield/dynamic/diff/extra/OnTabClickCallback;", "createViewItem", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "createViewItemsWithTitle", "Lcom/dianping/picassomodule/widget/tab/TabTitleInfo;", "info", DMKeys.KEY_TAB_BUTTON_TITLES, "Ljava/util/ArrayList;", "", "paddingLeft", "paddingRight", "diffSlideBarViewInfo", "SlideBarView", "diffResult", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "mappingFunc", "Lkotlin/Function1;", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;Lcom/dianping/shield/component/extensions/tabs/TabRowItem;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "diffTabBgViewItem", "backgroudView", "Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;", "createFunc", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffTabMaskViewItem", "maskView", "generateCallBackJson", "Lorg/json/JSONObject;", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "getHoverTabOffset", "tabView", "Lcom/dianping/picassomodule/widget/tab/TabView;", DMKeys.KEY_HOVER_OFFSET, "", "getScreenWidth", "handleClick", "hostContainer", "data", "Lcom/dianping/shield/dynamic/diff/extra/TabCellClickData;", "extraData", "location", "", "tabSelectCallback", "updateDataIndex", "updateTabDivider", "tabRowItem", DMKeys.KEY_HOVER_SHOW_TOP_LINE, DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "(Lcom/dianping/shield/component/extensions/tabs/TabRowItem;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "updateTabInfo", "dynamicRowItem", "updateTabItemSelected", "viewItemData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "isSelected", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface TabInfoDiffProxy {
    void bindSlideBarViewItem(@Nullable TabRowItem tabRowItem, @NotNull TabRowItem tabRowItem2);

    @Nullable
    Integer calculateRecommendWidth(@NotNull TabInfo tabInfo, @Nullable Integer num, int i, boolean z);

    @NotNull
    DynamicViewItem<ExtraViewInfo> createBgMaskItem(@NotNull ExtraViewInfo extraViewInfo);

    @NotNull
    DynamicDiff<TabViewInfo> createChildItem(@NotNull TabViewInfo tabViewInfo);

    @NotNull
    TabViewClickCallbackWithData createClickCallBack(@Nullable OnTabClickCallback onTabClickCallback);

    @NotNull
    DynamicDiff<ViewInfo> createViewItem(@NotNull ViewInfo viewInfo);

    @NotNull
    h createViewItemsWithTitle(@NotNull TabInfo tabInfo, @Nullable ArrayList<String> arrayList, int i, int i2);

    @Nullable
    DynamicViewItem<ViewInfo> diffSlideBarViewInfo(@Nullable ViewInfo viewInfo, @NotNull TabRowItem tabRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ViewInfo>> bVar, @Nullable Integer num, @Nullable Integer num2);

    void diffTabBgViewItem(@Nullable ExtraViewInfo extraViewInfo, @NotNull CommonContainerRowItem commonContainerRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ExtraViewInfo>> bVar, @NotNull b<? super ExtraViewInfo, ? extends DynamicDiff<ExtraViewInfo>> bVar2, @Nullable Integer num, @Nullable Integer num2);

    void diffTabMaskViewItem(@Nullable ExtraViewInfo extraViewInfo, @NotNull CommonContainerRowItem commonContainerRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ExtraViewInfo>> bVar, @NotNull b<? super ExtraViewInfo, ? extends DynamicDiff<ExtraViewInfo>> bVar2, @Nullable Integer num, @Nullable Integer num2);

    @NotNull
    JSONObject generateCallBackJson(@Nullable NodePath nodePath, @NotNull g gVar);

    @NotNull
    DynamicChassisInterface getHostChassis();

    int getHoverTabOffset(@Nullable TabView tabView, float f);

    int getScreenWidth();

    void handleClick(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull TabCellClickData tabCellClickData, @NotNull JSONObject jSONObject, @Nullable int[] iArr);

    void tabSelectCallback(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr);

    void updateDataIndex(@Nullable TabRowItem tabRowItem);

    void updateTabDivider(@NotNull TabRowItem tabRowItem, @Nullable Boolean bool, @Nullable Boolean bool2);

    void updateTabInfo(@NotNull TabInfo tabInfo, @NotNull TabRowItem tabRowItem);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Nullable
        public static /* synthetic */ DynamicViewItem diffSlideBarViewInfo$default(TabInfoDiffProxy tabInfoDiffProxy, ViewInfo viewInfo, TabRowItem tabRowItem, ArrayList arrayList, b bVar, Integer num, Integer num2, int i, Object obj) {
            if (obj == null) {
                return tabInfoDiffProxy.diffSlideBarViewInfo(viewInfo, tabRowItem, arrayList, bVar, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? 0 : num2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: diffSlideBarViewInfo");
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.ViewInfo> diffSlideBarViewInfo(com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy r18, @org.jetbrains.annotations.Nullable com.dianping.shield.dynamic.model.view.ViewInfo r19, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.tabs.TabRowItem r20, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super java.lang.String, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ViewInfo>> r22, @org.jetbrains.annotations.Nullable java.lang.Integer r23, @org.jetbrains.annotations.Nullable java.lang.Integer r24) {
            /*
                r0 = r18
                r2 = r20
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r24
                r7 = 7
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r8 = 0
                r7[r8] = r0
                r15 = 1
                r7[r15] = r19
                r8 = 2
                r7[r8] = r2
                r8 = 3
                r7[r8] = r3
                r8 = 4
                r7[r8] = r4
                r8 = 5
                r7[r8] = r5
                r8 = 6
                r7[r8] = r6
                com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy.DefaultImpls.changeQuickRedirect
                java.lang.String r14 = "3e7524729a4545d080bbe720cb9d9b0e"
                r9 = 0
                r11 = 1
                r16 = 4611686018427387904(0x4000000000000000, double:2.0)
                r8 = r7
                r10 = r13
                r12 = r14
                r15 = r13
                r5 = r14
                r13 = r16
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13)
                if (r8 == 0) goto L41
                r8 = 1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r9, r15, r8, r5)
                com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r0 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r0
                return r0
            L41:
                java.lang.String r5 = "computingItem"
                kotlin.jvm.internal.h.b(r2, r5)
                java.lang.String r5 = "diffResult"
                kotlin.jvm.internal.h.b(r3, r5)
                java.lang.String r5 = "mappingFunc"
                kotlin.jvm.internal.h.b(r4, r5)
                if (r19 == 0) goto L9c
                r1 = r19
                com.dianping.shield.dynamic.model.DiffableInfo r1 = (com.dianping.shield.dynamic.model.DiffableInfo) r1
                java.lang.String r5 = r1.getIdentifier()
                if (r5 == 0) goto L7b
                java.lang.Object r4 = r4.invoke(r5)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r4 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r4
                if (r4 != 0) goto L76
                if (r1 == 0) goto L6e
                r4 = r1
                com.dianping.shield.dynamic.model.view.ViewInfo r4 = (com.dianping.shield.dynamic.model.view.ViewInfo) r4
                com.dianping.shield.dynamic.agent.node.DynamicDiff r4 = r0.createViewItem(r4)
                goto L76
            L6e:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L76:
                if (r4 != 0) goto L79
                goto L7b
            L79:
                r0 = r4
                goto L84
            L7b:
                if (r1 == 0) goto L94
                r4 = r1
                com.dianping.shield.dynamic.model.view.ViewInfo r4 = (com.dianping.shield.dynamic.model.view.ViewInfo) r4
                com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = r0.createViewItem(r4)
            L84:
                if (r1 == 0) goto L8c
                r4 = r23
                r0.diff(r1, r3, r4, r6)
                goto L9d
            L8c:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L94:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L9c:
                r0 = r9
            L9d:
                boolean r1 = r0 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
                if (r1 != 0) goto La2
                goto La3
            La2:
                r9 = r0
            La3:
                com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r9 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r9
                r0 = r9
                com.dianping.shield.node.useritem.ViewItem r0 = (com.dianping.shield.node.useritem.ViewItem) r0
                r2.slideBarViewItem = r0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy.DefaultImpls.diffSlideBarViewInfo(com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy, com.dianping.shield.dynamic.model.view.ViewInfo, com.dianping.shield.component.extensions.tabs.TabRowItem, java.util.ArrayList, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):com.dianping.shield.dynamic.items.viewitems.DynamicViewItem");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
            if (r3 == null) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void diffTabBgViewItem(com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy r18, @org.jetbrains.annotations.Nullable com.dianping.shield.dynamic.model.view.ExtraViewInfo r19, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.common.CommonContainerRowItem r20, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super java.lang.String, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ExtraViewInfo>> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super com.dianping.shield.dynamic.model.view.ExtraViewInfo, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ExtraViewInfo>> r23, @org.jetbrains.annotations.Nullable java.lang.Integer r24, @org.jetbrains.annotations.Nullable java.lang.Integer r25) {
            /*
                r1 = r20
                r2 = r21
                r3 = r22
                r4 = r23
                r5 = r24
                r6 = r25
                r7 = 8
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r8 = 0
                r7[r8] = r18
                r15 = 1
                r7[r15] = r19
                r8 = 2
                r7[r8] = r1
                r8 = 3
                r7[r8] = r2
                r8 = 4
                r7[r8] = r3
                r8 = 5
                r7[r8] = r4
                r8 = 6
                r7[r8] = r5
                r8 = 7
                r7[r8] = r6
                com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy.DefaultImpls.changeQuickRedirect
                java.lang.String r14 = "f18141fd279f40a21b2ce235cd3ac379"
                r9 = 0
                r11 = 1
                r16 = 4611686018427387904(0x4000000000000000, double:2.0)
                r8 = r7
                r10 = r13
                r12 = r14
                r15 = r13
                r5 = r14
                r13 = r16
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13)
                if (r8 == 0) goto L42
                r8 = 1
                com.meituan.robust.PatchProxy.accessDispatch(r7, r9, r15, r8, r5)
                return
            L42:
                java.lang.String r5 = "computingItem"
                kotlin.jvm.internal.h.b(r1, r5)
                java.lang.String r5 = "diffResult"
                kotlin.jvm.internal.h.b(r2, r5)
                java.lang.String r5 = "mappingFunc"
                kotlin.jvm.internal.h.b(r3, r5)
                java.lang.String r5 = "createFunc"
                kotlin.jvm.internal.h.b(r4, r5)
                if (r19 == 0) goto L9d
                r0 = r19
                com.dianping.shield.dynamic.model.DiffableInfo r0 = (com.dianping.shield.dynamic.model.DiffableInfo) r0
                java.lang.String r5 = r0.getIdentifier()
                if (r5 == 0) goto L7d
                java.lang.Object r3 = r3.invoke(r5)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
                if (r3 != 0) goto L7b
                if (r0 == 0) goto L73
                java.lang.Object r3 = r4.invoke(r0)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
                goto L7b
            L73:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L7b:
                if (r3 != 0) goto L85
            L7d:
                if (r0 == 0) goto L95
                java.lang.Object r3 = r4.invoke(r0)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
            L85:
                if (r0 == 0) goto L8d
                r4 = r24
                r3.diff(r0, r2, r4, r6)
                goto L9e
            L8d:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L95:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L9d:
                r3 = r9
            L9e:
                boolean r0 = r3 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
                if (r0 != 0) goto La3
                goto La4
            La3:
                r9 = r3
            La4:
                com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r9 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r9
                if (r9 == 0) goto Lb3
                com.dianping.shield.dynamic.utils.DMConstant$VCViewComputeStep r0 = com.dianping.shield.dynamic.utils.DMConstant.VCViewComputeStep.Second
                r9.setComputingStep(r0)
                com.dianping.shield.node.useritem.ViewItem r9 = (com.dianping.shield.node.useritem.ViewItem) r9
                r1.setBackgroundViewItem(r9)
                return
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy.DefaultImpls.diffTabBgViewItem(com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy, com.dianping.shield.dynamic.model.view.ExtraViewInfo, com.dianping.shield.component.extensions.common.CommonContainerRowItem, java.util.ArrayList, kotlin.jvm.functions.b, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
            if (r3 == null) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void diffTabMaskViewItem(com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy r18, @org.jetbrains.annotations.Nullable com.dianping.shield.dynamic.model.view.ExtraViewInfo r19, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.common.CommonContainerRowItem r20, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super java.lang.String, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ExtraViewInfo>> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super com.dianping.shield.dynamic.model.view.ExtraViewInfo, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ExtraViewInfo>> r23, @org.jetbrains.annotations.Nullable java.lang.Integer r24, @org.jetbrains.annotations.Nullable java.lang.Integer r25) {
            /*
                r1 = r20
                r2 = r21
                r3 = r22
                r4 = r23
                r5 = r24
                r6 = r25
                r7 = 8
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r8 = 0
                r7[r8] = r18
                r15 = 1
                r7[r15] = r19
                r8 = 2
                r7[r8] = r1
                r8 = 3
                r7[r8] = r2
                r8 = 4
                r7[r8] = r3
                r8 = 5
                r7[r8] = r4
                r8 = 6
                r7[r8] = r5
                r8 = 7
                r7[r8] = r6
                com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy.DefaultImpls.changeQuickRedirect
                java.lang.String r14 = "1bfcd69598d2466fed41e424cc37acde"
                r9 = 0
                r11 = 1
                r16 = 4611686018427387904(0x4000000000000000, double:2.0)
                r8 = r7
                r10 = r13
                r12 = r14
                r15 = r13
                r5 = r14
                r13 = r16
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13)
                if (r8 == 0) goto L42
                r8 = 1
                com.meituan.robust.PatchProxy.accessDispatch(r7, r9, r15, r8, r5)
                return
            L42:
                java.lang.String r5 = "computingItem"
                kotlin.jvm.internal.h.b(r1, r5)
                java.lang.String r5 = "diffResult"
                kotlin.jvm.internal.h.b(r2, r5)
                java.lang.String r5 = "mappingFunc"
                kotlin.jvm.internal.h.b(r3, r5)
                java.lang.String r5 = "createFunc"
                kotlin.jvm.internal.h.b(r4, r5)
                if (r19 == 0) goto L9d
                r0 = r19
                com.dianping.shield.dynamic.model.DiffableInfo r0 = (com.dianping.shield.dynamic.model.DiffableInfo) r0
                java.lang.String r5 = r0.getIdentifier()
                if (r5 == 0) goto L7d
                java.lang.Object r3 = r3.invoke(r5)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
                if (r3 != 0) goto L7b
                if (r0 == 0) goto L73
                java.lang.Object r3 = r4.invoke(r0)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
                goto L7b
            L73:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L7b:
                if (r3 != 0) goto L85
            L7d:
                if (r0 == 0) goto L95
                java.lang.Object r3 = r4.invoke(r0)
                com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
            L85:
                if (r0 == 0) goto L8d
                r4 = r24
                r3.diff(r0, r2, r4, r6)
                goto L9e
            L8d:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L95:
                kotlin.o r0 = new kotlin.o
                java.lang.String r1 = "null cannot be cast to non-null type T"
                r0.<init>(r1)
                throw r0
            L9d:
                r3 = r9
            L9e:
                boolean r0 = r3 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
                if (r0 != 0) goto La3
                goto La4
            La3:
                r9 = r3
            La4:
                com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r9 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r9
                if (r9 == 0) goto Lb3
                com.dianping.shield.dynamic.utils.DMConstant$VCViewComputeStep r0 = com.dianping.shield.dynamic.utils.DMConstant.VCViewComputeStep.Second
                r9.setComputingStep(r0)
                com.dianping.shield.node.useritem.ViewItem r9 = (com.dianping.shield.node.useritem.ViewItem) r9
                r1.setMaskViewItem(r9)
                return
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy.DefaultImpls.diffTabMaskViewItem(com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy, com.dianping.shield.dynamic.model.view.ExtraViewInfo, com.dianping.shield.component.extensions.common.CommonContainerRowItem, java.util.ArrayList, kotlin.jvm.functions.b, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):void");
        }

        @NotNull
        public static DynamicDiff<ViewInfo> createViewItem(TabInfoDiffProxy tabInfoDiffProxy, @NotNull ViewInfo viewInfo) {
            Object[] objArr = {tabInfoDiffProxy, viewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "538ebf1149074e1d6cd504b634032550", RobustBitConfig.DEFAULT_VALUE)) {
                return (DynamicDiff) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "538ebf1149074e1d6cd504b634032550");
            }
            kotlin.jvm.internal.h.b(viewInfo, DMKeys.KEY_VIEW_INFO);
            return new DynamicViewItem(new ViewInfoDiff(tabInfoDiffProxy.getHostChassis()));
        }

        @NotNull
        public static DynamicViewItem<ExtraViewInfo> createBgMaskItem(TabInfoDiffProxy tabInfoDiffProxy, @NotNull ExtraViewInfo extraViewInfo) {
            Object[] objArr = {tabInfoDiffProxy, extraViewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55ff0c5ccb4589360cd039efc08a990b", RobustBitConfig.DEFAULT_VALUE)) {
                return (DynamicViewItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55ff0c5ccb4589360cd039efc08a990b");
            }
            kotlin.jvm.internal.h.b(extraViewInfo, DMKeys.KEY_VIEW_INFO);
            return new DynamicViewItem<>(new ExtraViewInfoDiff(tabInfoDiffProxy.getHostChassis(), null, 2, null));
        }

        @NotNull
        public static DynamicDiff<TabViewInfo> createChildItem(TabInfoDiffProxy tabInfoDiffProxy, @NotNull TabViewInfo tabViewInfo) {
            Object[] objArr = {tabInfoDiffProxy, tabViewInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cee2fe9b833b4827841fca70aad1c9a1", RobustBitConfig.DEFAULT_VALUE)) {
                return (DynamicDiff) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cee2fe9b833b4827841fca70aad1c9a1");
            }
            kotlin.jvm.internal.h.b(tabViewInfo, DMKeys.KEY_VIEW_INFO);
            return new DynamicTabViewItem(new TabViewInfoDiff(tabInfoDiffProxy.getHostChassis()));
        }

        public static void bindSlideBarViewItem(TabInfoDiffProxy tabInfoDiffProxy, @Nullable TabRowItem tabRowItem, @NotNull TabRowItem tabRowItem2) {
            Object[] objArr = {tabInfoDiffProxy, tabRowItem, tabRowItem2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb3d3aa6fd8429358acd8c67e9023224", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb3d3aa6fd8429358acd8c67e9023224");
                return;
            }
            kotlin.jvm.internal.h.b(tabRowItem2, "currentRowItem");
            if (tabRowItem != null) {
                ViewItem viewItem = tabRowItem.slideBarViewItem;
                if (!(viewItem instanceof DynamicViewItem)) {
                    viewItem = null;
                }
                DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem;
                if (dynamicViewItem != null) {
                    dynamicViewItem.onComputingComplete();
                    tabRowItem2.slideBarViewItem = dynamicViewItem;
                }
            }
        }

        public static void updateTabInfo(final TabInfoDiffProxy tabInfoDiffProxy, @NotNull TabInfo tabInfo, @NotNull TabRowItem tabRowItem) {
            GradientDrawable gradientDrawable;
            Object[] objArr = {tabInfoDiffProxy, tabInfo, tabRowItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5db26cdaa9ecc53a690a1145e390031", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5db26cdaa9ecc53a690a1145e390031");
                return;
            }
            kotlin.jvm.internal.h.b(tabInfo, "info");
            kotlin.jvm.internal.h.b(tabRowItem, "dynamicRowItem");
            ArrayList<ViewItem> arrayList = tabRowItem.viewItems;
            if ((arrayList != null ? arrayList.size() : 0) > 0) {
                ArrayList<ViewItem> arrayList2 = tabRowItem.viewItems;
                ViewItem viewItem = arrayList2 != null ? arrayList2.get(0) : null;
                if (!(viewItem instanceof DynamicTabViewItem)) {
                    viewItem = null;
                }
                DynamicTabViewItem dynamicTabViewItem = (DynamicTabViewItem) viewItem;
                if (dynamicTabViewItem != null && dynamicTabViewItem.isSingleButton()) {
                    tabRowItem.onUpdateTabItemSelectedListener = new d() { // from class: com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy$updateTabInfo$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.picassomodule.widget.tab.d
                        public final void updateTabItemSelected(Object obj, boolean z) {
                            Object[] objArr2 = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a0e25f958827fb79b5db71e19aed9b9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a0e25f958827fb79b5db71e19aed9b9");
                                return;
                            }
                            if (!(obj instanceof DynamicTabData)) {
                                obj = null;
                            }
                            DynamicTabData dynamicTabData = (DynamicTabData) obj;
                            if (dynamicTabData != null) {
                                TabInfoDiffProxy.DefaultImpls.updateTabItemSelected(TabInfoDiffProxy.this, TabInfoDiffProxy.this.getHostChassis(), dynamicTabData.normalData, z);
                            }
                        }
                    };
                }
            }
            Integer xGap = tabInfo.getXGap();
            tabRowItem.xGap = xGap != null ? xGap.intValue() : 0;
            Integer tabHeight = tabInfo.getTabHeight();
            tabRowItem.tabHeight = tabHeight != null ? tabHeight.intValue() : 45;
            e eVar = new e();
            Boolean slideBarIsAbove = tabInfo.getSlideBarIsAbove();
            eVar.g = slideBarIsAbove != null ? slideBarIsAbove.booleanValue() : true;
            Boolean slideBarWrapTitle = tabInfo.getSlideBarWrapTitle();
            eVar.f = slideBarWrapTitle != null ? slideBarWrapTitle.booleanValue() : false;
            eVar.a = tabInfo.getSlideBarColor();
            String str = eVar.a;
            if ((str == null || str.length() == 0) && DMUtils.isMT()) {
                eVar.a = "#FF06C1AE";
            }
            Integer slideBarHeight = tabInfo.getSlideBarHeight();
            eVar.c = slideBarHeight != null ? slideBarHeight.intValue() : -1;
            ColorUnionType.GradientColorInfo slideBarGradientColor = tabInfo.getSlideBarGradientColor();
            if (slideBarGradientColor != null) {
                int parseColor = ColorUnionTypeKt.parseColor(slideBarGradientColor.getStartColor());
                int parseColor2 = ColorUnionTypeKt.parseColor(slideBarGradientColor.getEndColor());
                Integer orientation = slideBarGradientColor.getOrientation();
                int intValue = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
                if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.values()[intValue], new int[]{parseColor, parseColor2});
                } else {
                    gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(0);
                }
            } else {
                gradientDrawable = null;
            }
            eVar.d = gradientDrawable;
            Boolean slideBarIsRounded = tabInfo.getSlideBarIsRounded();
            eVar.e = slideBarIsRounded != null ? slideBarIsRounded.booleanValue() : false;
            Integer slideBarWidth = tabInfo.getSlideBarWidth();
            eVar.b = slideBarWidth != null ? slideBarWidth.intValue() : -1;
            Integer slideBarOffset = tabInfo.getSlideBarOffset();
            eVar.h = slideBarOffset != null ? slideBarOffset.intValue() : 0;
            tabRowItem.slideBarTheme = eVar;
            ab<?> pageContainer = tabInfoDiffProxy.getHostChassis().getPageContainer();
            if (!(pageContainer instanceof CommonPageContainer)) {
                pageContainer = null;
            }
            CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
            tabRowItem.onDidInterceptTouchListener = commonPageContainer != null ? commonPageContainer.getDidInterceptListener() : null;
        }

        @NotNull
        public static h createViewItemsWithTitle(TabInfoDiffProxy tabInfoDiffProxy, @NotNull TabInfo tabInfo, @Nullable ArrayList<String> arrayList, int i, int i2) {
            Object[] objArr = {tabInfoDiffProxy, tabInfo, arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c5b43e021ac33e0102d3452e5793252", RobustBitConfig.DEFAULT_VALUE)) {
                return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c5b43e021ac33e0102d3452e5793252");
            }
            kotlin.jvm.internal.h.b(tabInfo, "info");
            Integer textSize = tabInfo.getTextSize();
            int intValue = textSize != null ? textSize.intValue() : 0;
            Integer selectedTextSize = tabInfo.getSelectedTextSize();
            int intValue2 = selectedTextSize != null ? selectedTextSize.intValue() : 0;
            DMConstant.FontStyle[] valuesCustom = DMConstant.FontStyle.valuesCustom();
            Integer titleFont = tabInfo.getTitleFont();
            DMConstant.FontStyle fontStyle = valuesCustom[titleFont != null ? titleFont.intValue() : 0];
            DMConstant.FontStyle[] valuesCustom2 = DMConstant.FontStyle.valuesCustom();
            Integer selectedTitleFont = tabInfo.getSelectedTitleFont();
            DMConstant.FontStyle fontStyle2 = valuesCustom2[selectedTitleFont != null ? selectedTitleFont.intValue() : 0];
            String titleColor = tabInfo.getTitleColor();
            String selectedTitleColor = tabInfo.getSelectedTitleColor();
            Boolean slideBarWrapTitle = tabInfo.getSlideBarWrapTitle();
            Double ratioForSlideBarWidth = tabInfo.getRatioForSlideBarWidth();
            h hVar = new h();
            Integer xGap = tabInfo.getXGap();
            hVar.a(xGap != null ? xGap.intValue() : 0);
            hVar.b(arrayList);
            hVar.a(intValue, intValue2);
            hVar.b(fontStyle.ordinal(), fontStyle2.ordinal());
            Integer tabHeight = tabInfo.getTabHeight();
            hVar.d(tabHeight != null ? tabHeight.intValue() : 45);
            Integer tabWidth = tabInfo.getTabWidth();
            hVar.e(tabWidth != null ? tabWidth.intValue() : 0);
            hVar.a(slideBarWrapTitle != null ? slideBarWrapTitle.booleanValue() : false);
            hVar.a(Double.valueOf(ratioForSlideBarWidth != null ? ratioForSlideBarWidth.doubleValue() : -1.0d));
            hVar.a(titleColor, selectedTitleColor);
            hVar.b(i);
            hVar.c(i2);
            return hVar;
        }

        public static void updateTabDivider(TabInfoDiffProxy tabInfoDiffProxy, @NotNull TabRowItem tabRowItem, @Nullable Boolean bool, @Nullable Boolean bool2) {
            Object[] objArr = {tabInfoDiffProxy, tabRowItem, bool, bool2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "434514ca55031db5657e548170061e98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "434514ca55031db5657e548170061e98");
                return;
            }
            kotlin.jvm.internal.h.b(tabRowItem, "tabRowItem");
            tabRowItem.showCellTopDivider = bool != null ? bool.booleanValue() : false;
            if (tabRowItem.showCellTopDivider) {
                if (tabRowItem.dividerStyle == null) {
                    tabRowItem.dividerStyle = new DividerStyle();
                    r rVar = r.a;
                }
                tabRowItem.dividerStyle.styleType = DividerStyle.StyleType.NONE;
                tabRowItem.dividerStyle.cellTopLineOffset = new Rect(0, 0, 0, 0);
                tabRowItem.dividerStyle.cellTopLineDrawable = ContextCompat.getDrawable(tabInfoDiffProxy.getHostChassis().getHostContext(), R.color.pm_line_gray);
            }
            tabRowItem.showCellBottomDivider = bool2 != null ? bool2.booleanValue() : false;
            if (tabRowItem.showCellBottomDivider) {
                if (tabRowItem.dividerStyle == null) {
                    tabRowItem.dividerStyle = new DividerStyle();
                    r rVar2 = r.a;
                }
                tabRowItem.dividerStyle.styleType = DividerStyle.StyleType.BOTTOM;
                tabRowItem.dividerStyle.cellBottomLineOffset = new Rect(0, 0, 0, 0);
                tabRowItem.dividerStyle.cellBottomLineDrawable = ContextCompat.getDrawable(tabInfoDiffProxy.getHostChassis().getHostContext(), R.color.pm_line_gray);
            }
        }

        public static void updateDataIndex(TabInfoDiffProxy tabInfoDiffProxy, @Nullable TabRowItem tabRowItem) {
            ArrayList<ViewItem> arrayList;
            int i = 0;
            Object[] objArr = {tabInfoDiffProxy, tabRowItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84dc486b33c8524dd8558f0f23ced232", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84dc486b33c8524dd8558f0f23ced232");
            } else if (tabRowItem != null && (arrayList = tabRowItem.viewItems) != null) {
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    Object obj2 = ((ViewItem) obj).data;
                    if (!(obj2 instanceof DynamicTabData)) {
                        obj2 = null;
                    }
                    DynamicTabData dynamicTabData = (DynamicTabData) obj2;
                    if (dynamicTabData != null) {
                        dynamicTabData.normalData.index = i;
                    }
                    i = i2;
                }
            }
        }

        @NotNull
        public static TabViewClickCallbackWithData createClickCallBack(TabInfoDiffProxy tabInfoDiffProxy, @Nullable final OnTabClickCallback onTabClickCallback) {
            Object[] objArr = {tabInfoDiffProxy, onTabClickCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "424879829f9d32ca7a393db3917dafb3", RobustBitConfig.DEFAULT_VALUE) ? (TabViewClickCallbackWithData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "424879829f9d32ca7a393db3917dafb3") : new TabViewClickCallbackWithData() { // from class: com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy$createClickCallBack$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData, com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
                public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
                    Object[] objArr2 = {view, obj, nodePath};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19109e4e1a69b5e5ccd6e59ef38c25e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19109e4e1a69b5e5ccd6e59ef38c25e1");
                        return;
                    }
                    kotlin.jvm.internal.h.b(view, Constants.EventType.VIEW);
                    TabViewClickCallbackWithData.DefaultImpls.onViewClicked(this, view, obj, nodePath);
                }

                @Override // com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData
                public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar) {
                    Object[] objArr2 = {view, obj, nodePath, gVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e5b9973304b2491aec80a2984b496018", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e5b9973304b2491aec80a2984b496018");
                        return;
                    }
                    kotlin.jvm.internal.h.b(view, Constants.EventType.VIEW);
                    kotlin.jvm.internal.h.b(gVar, "reason");
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    OnTabClickCallback onTabClickCallback2 = OnTabClickCallback.this;
                    if (onTabClickCallback2 != null) {
                        onTabClickCallback2.tabClick(obj, nodePath, gVar, iArr);
                    }
                }
            };
        }

        @NotNull
        public static JSONObject generateCallBackJson(TabInfoDiffProxy tabInfoDiffProxy, @Nullable NodePath nodePath, @NotNull g gVar) {
            IndexPath indexPath;
            IndexPath indexPath2;
            IndexPath indexPath3;
            Object[] objArr = {tabInfoDiffProxy, nodePath, gVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Integer num = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a16264085463f011d723c7d36b28414", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a16264085463f011d723c7d36b28414");
            }
            kotlin.jvm.internal.h.b(gVar, "reason");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("reason", gVar.ordinal());
                jSONObject.put("index", (nodePath == null || (indexPath3 = nodePath.indexPath) == null) ? null : Integer.valueOf(indexPath3.index));
                jSONObject.put("row", (nodePath == null || (indexPath2 = nodePath.indexPath) == null) ? null : Integer.valueOf(indexPath2.row));
                if (nodePath != null && (indexPath = nodePath.indexPath) != null) {
                    num = Integer.valueOf(indexPath.section);
                }
                jSONObject.put("section", num);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public static void handleClick(TabInfoDiffProxy tabInfoDiffProxy, @NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull TabCellClickData tabCellClickData, @NotNull JSONObject jSONObject, @Nullable int[] iArr) {
            String[] clickURLs;
            String[] viewURLs;
            String didSelectCallback;
            int i = 0;
            Object[] objArr = {tabInfoDiffProxy, dynamicChassisInterface, tabCellClickData, jSONObject, iArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b38a1045ebd34ddd1a3f67acb9f92c0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b38a1045ebd34ddd1a3f67acb9f92c0c");
                return;
            }
            kotlin.jvm.internal.h.b(dynamicChassisInterface, "hostContainer");
            kotlin.jvm.internal.h.b(tabCellClickData, "data");
            kotlin.jvm.internal.h.b(jSONObject, "extraData");
            FragmentActivity activity = dynamicChassisInterface.getHostFragment().getActivity();
            MGEInfo clickMgeInfo = tabCellClickData.getClickMgeInfo();
            if (clickMgeInfo != null) {
                Statistics.getChannel(clickMgeInfo.getCategory()).writeModelClick(AppUtil.generatePageInfoKey(activity), clickMgeInfo.getBid(), clickMgeInfo.getLabs(), clickMgeInfo.getCid());
            }
            if ((dynamicChassisInterface instanceof ICommonHost) && (didSelectCallback = tabCellClickData.getDidSelectCallback()) != null) {
                String str = didSelectCallback;
                if (str == null || kotlin.text.g.a((CharSequence) str)) {
                    str = null;
                }
                if (str != null) {
                    ((ICommonHost) dynamicChassisInterface).callMethod(str.toString(), jSONObject);
                }
            }
            ab<?> pageContainer = dynamicChassisInterface.getPageContainer();
            int scrollY = (pageContainer instanceof PositionInfoInterface ? ((PositionInfoInterface) pageContainer).getScrollY() : 0) + (iArr != null ? iArr[1] : 0);
            MidasInfo midasInfo = tabCellClickData.getMidasInfo();
            if (midasInfo != null) {
                Context hostContext = DMUtils.getHostContext(dynamicChassisInterface);
                String moduleName = DMUtils.getModuleName(dynamicChassisInterface);
                kotlin.jvm.internal.h.a((Object) moduleName, "DMUtils.getModuleName(hostContainer)");
                if (midasInfo == null || TextUtils.isEmpty(midasInfo.getFeedback())) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int hashCode = "clickURLs".hashCode();
                if (hashCode != -1965055348) {
                    if (hashCode == 1195852073 && "clickURLs".equals("viewURLs") && (viewURLs = midasInfo.getViewURLs()) != null) {
                        int length = viewURLs.length;
                        while (i < length) {
                            arrayList.add(viewURLs[i]);
                            i++;
                        }
                    }
                } else if ("clickURLs".equals("clickURLs") && (clickURLs = midasInfo.getClickURLs()) != null) {
                    int length2 = clickURLs.length;
                    while (i < length2) {
                        arrayList.add(clickURLs[i]);
                        i++;
                    }
                }
                HashMap<String, String> extra = midasInfo.getExtra();
                if (extra == null) {
                    extra = new HashMap<>();
                }
                HashMap<String, String> hashMap = extra;
                hashMap.put("adsdktype", "4");
                hashMap.put("modulename", moduleName);
                hashMap.put("modulePosi", String.valueOf(scrollY));
                if (hostContext != null) {
                    new com.midas.ad.feedback.b(hostContext).a(midasInfo.getFeedback(), 2, arrayList, midasInfo.getExtra());
                }
            }
        }

        public static int getHoverTabOffset(TabInfoDiffProxy tabInfoDiffProxy, @Nullable TabView tabView, float f) {
            Object[] objArr = {tabInfoDiffProxy, tabView, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8e0b95b308f95c04330b987a722b16b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8e0b95b308f95c04330b987a722b16b")).intValue();
            }
            return (tabView != null ? tabView.getHeight() : 0) + aq.a(tabInfoDiffProxy.getHostChassis().getHostContext(), f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void updateTabItemSelected(TabInfoDiffProxy tabInfoDiffProxy, DynamicChassisInterface dynamicChassisInterface, DynamicModuleViewItemData dynamicModuleViewItemData, boolean z) {
            String onTabSelectedStatusChanged;
            Object[] objArr = {tabInfoDiffProxy, dynamicChassisInterface, dynamicModuleViewItemData, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df85c9e3a3293a19d28aa213a3c27c8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df85c9e3a3293a19d28aa213a3c27c8a");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(DMKeys.KEY_SELECTED, z);
            } catch (JSONException unused) {
            }
            BaseViewInfo baseViewInfo = dynamicModuleViewItemData != null ? dynamicModuleViewItemData.newViewInfo : null;
            if (!(baseViewInfo instanceof TabViewInfo)) {
                baseViewInfo = null;
            }
            TabViewInfo tabViewInfo = (TabViewInfo) baseViewInfo;
            if (tabViewInfo == null || (onTabSelectedStatusChanged = tabViewInfo.getOnTabSelectedStatusChanged()) == null) {
                return;
            }
            if (!(dynamicChassisInterface instanceof ICommonHost)) {
                dynamicChassisInterface = null;
            }
            ICommonHost iCommonHost = (ICommonHost) dynamicChassisInterface;
            if (iCommonHost != null) {
                iCommonHost.callMethod(onTabSelectedStatusChanged, jSONObject);
            }
        }

        @Nullable
        public static Integer calculateRecommendWidth(TabInfoDiffProxy tabInfoDiffProxy, @NotNull TabInfo tabInfo, @Nullable Integer num, int i, boolean z) {
            Object[] objArr = {tabInfoDiffProxy, tabInfo, num, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "338865c8fe71486131035f733ad24646", RobustBitConfig.DEFAULT_VALUE)) {
                return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "338865c8fe71486131035f733ad24646");
            }
            kotlin.jvm.internal.h.b(tabInfo, "newInfo");
            Integer xGap = tabInfo.getXGap();
            int intValue = xGap != null ? xGap.intValue() : 0;
            ArrayList<? super TabViewInfo> children = tabInfo.getChildren();
            int size = children != null ? children.size() : 0;
            if (size > 0) {
                Integer tabWidth = tabInfo.getTabWidth();
                if ((tabWidth == null || tabWidth.intValue() == 0) && z) {
                    if (num != null) {
                        size = num.intValue();
                    }
                    return size > 0 ? Integer.valueOf((tabInfoDiffProxy.getScreenWidth() - (i + ((size - 1) * intValue))) / size) : tabWidth;
                }
                return tabWidth;
            }
            return null;
        }

        public static void tabSelectCallback(TabInfoDiffProxy tabInfoDiffProxy, @Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
            IndexPath indexPath;
            HashMap<String, Object> hashMap;
            HashMap hashMap2;
            Object[] objArr = {tabInfoDiffProxy, obj, nodePath, gVar, iArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71c2496d4a4e8bc400a1068dbcee99bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71c2496d4a4e8bc400a1068dbcee99bf");
                return;
            }
            kotlin.jvm.internal.h.b(gVar, "reason");
            if (!(obj instanceof TabCellClickData)) {
                obj = null;
            }
            TabCellClickData tabCellClickData = (TabCellClickData) obj;
            if (tabCellClickData != null) {
                if (nodePath != null && (indexPath = nodePath.indexPath) != null) {
                    int i = indexPath.index;
                    MGEInfo clickMgeInfo = tabCellClickData.getClickMgeInfo();
                    if (clickMgeInfo != null) {
                        MGEInfo clickMgeInfo2 = tabCellClickData.getClickMgeInfo();
                        if (clickMgeInfo2 == null || (hashMap = clickMgeInfo2.getLabs()) == null || hashMap == null) {
                            hashMap = new HashMap<>();
                        }
                        if (hashMap.get("custom") instanceof HashMap) {
                            Object obj2 = hashMap.get("custom");
                            if (obj2 == null) {
                                throw new o("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                            }
                            hashMap2 = (HashMap) obj2;
                        } else {
                            hashMap2 = new HashMap();
                            hashMap.put("custom", hashMap2);
                        }
                        HashMap hashMap3 = hashMap2;
                        hashMap3.put("tab_index", Integer.valueOf(i));
                        ArrayList<String> buttonTitles = tabCellClickData.getButtonTitles();
                        hashMap3.put("tab_title", (buttonTitles == null || (r0 = buttonTitles.get(i)) == null) ? "" : "");
                        clickMgeInfo.setLabs(hashMap);
                    }
                }
                tabInfoDiffProxy.handleClick(tabInfoDiffProxy.getHostChassis(), tabCellClickData, tabInfoDiffProxy.generateCallBackJson(nodePath, gVar), iArr);
            }
        }

        public static int getScreenWidth(TabInfoDiffProxy tabInfoDiffProxy) {
            Object[] objArr = {tabInfoDiffProxy};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbeba240758237fe4286eb2734767adc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbeba240758237fe4286eb2734767adc")).intValue() : aq.b(tabInfoDiffProxy.getHostChassis().getHostContext(), DMViewUtils.getRecyclerWidth(tabInfoDiffProxy.getHostChassis()));
        }
    }
}
