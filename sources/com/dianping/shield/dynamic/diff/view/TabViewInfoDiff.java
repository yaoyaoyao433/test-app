package com.dianping.shield.dynamic.diff.view;

import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.items.itemdata.DynamicTabData;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.mapping.DynamicViewDataMapping;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u00015B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ=\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010%J?\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0002\u0010(J\"\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/J\u001a\u00100\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u00102\u0006\u00101\u001a\u00020\u0012H\u0002J\u0015\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00104R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u00066"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/ViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "anchorIndexPathClickCallback", "Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff$AnchorIndexPathClickCallback;", "getAnchorIndexPathClickCallback", "()Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff$AnchorIndexPathClickCallback;", "setAnchorIndexPathClickCallback", "(Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff$AnchorIndexPathClickCallback;)V", "computingSelectViewItemData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "isSingleButton", "", "()Z", "setSingleButton", "(Z)V", "viewClickCallbackWithTabData", "Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;", "getViewClickCallbackWithTabData", "()Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;", "viewClickCallbackWithTabData$delegate", "Lkotlin/Lazy;", "createDiffData", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/TabViewInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "diffChildren", "computingItem", "(Lcom/dianping/shield/dynamic/model/view/TabViewInfo;Lcom/dianping/shield/node/useritem/ViewItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "generateCallbackJson", "Lorg/json/JSONObject;", "data", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "setSelectData", "isSelected", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/view/TabViewInfo;)V", "AnchorIndexPathClickCallback", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabViewInfoDiff<T extends TabViewInfo, V extends ViewItem> extends ViewInfoDiff<T, V> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(TabViewInfoDiff.class), "viewClickCallbackWithTabData", "getViewClickCallbackWithTabData()Lcom/dianping/shield/component/extensions/tabs/TabViewClickCallbackWithData;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private AnchorIndexPathClickCallback anchorIndexPathClickCallback;
    private DynamicModuleViewItemData computingSelectViewItemData;
    private boolean isSingleButton;
    private final d viewClickCallbackWithTabData$delegate;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff$AnchorIndexPathClickCallback;", "", "anchorIndexPathClick", "", DMKeys.KEY_TAB_ANCHOR_INDEX_PATH, "Lcom/dianping/shield/entity/IndexPath;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface AnchorIndexPathClickCallback {
        void anchorIndexPathClick(@NotNull IndexPath indexPath);
    }

    private final TabViewClickCallbackWithData getViewClickCallbackWithTabData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (TabViewClickCallbackWithData) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5cf3ada166660f676e0c655f0c24d84", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5cf3ada166660f676e0c655f0c24d84") : this.viewClickCallbackWithTabData$delegate.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4806ed8e834dc77c846eec9d73ccafd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4806ed8e834dc77c846eec9d73ccafd7");
        } else {
            this.viewClickCallbackWithTabData$delegate = e.a(kotlin.i.NONE, new TabViewInfoDiff$viewClickCallbackWithTabData$2(this, dynamicChassisInterface));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((TabViewInfoDiff<T, V>) ((TabViewInfo) diffableInfo), (TabViewInfo) ((ViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(BaseViewInfo baseViewInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((TabViewInfoDiff<T, V>) ((TabViewInfo) baseViewInfo), (TabViewInfo) ((ViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((TabViewInfoDiff<T, V>) ((TabViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((TabViewInfoDiff<T, V>) ((TabViewInfo) baseViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(ViewInfo viewInfo) {
        updateProps((TabViewInfoDiff<T, V>) ((TabViewInfo) viewInfo));
    }

    public final boolean isSingleButton() {
        return this.isSingleButton;
    }

    public final void setSingleButton(boolean z) {
        this.isSingleButton = z;
    }

    @Nullable
    public final AnchorIndexPathClickCallback getAnchorIndexPathClickCallback() {
        return this.anchorIndexPathClickCallback;
    }

    public final void setAnchorIndexPathClickCallback(@Nullable AnchorIndexPathClickCallback anchorIndexPathClickCallback) {
        this.anchorIndexPathClickCallback = anchorIndexPathClickCallback;
    }

    @NotNull
    public final JSONObject generateCallbackJson(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData, @Nullable NodePath nodePath, @NotNull g gVar) {
        Object[] objArr = {dynamicModuleViewItemData, nodePath, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d54db06d4b3bb859b21285c0e43e9384", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d54db06d4b3bb859b21285c0e43e9384");
        }
        h.b(gVar, "reason");
        JSONObject generateCallbackJson = DMUtils.generateCallbackJson(dynamicModuleViewItemData, nodePath);
        generateCallbackJson.put("reason", gVar.ordinal());
        h.a((Object) generateCallbackJson, "jsonObject");
        return generateCallbackJson;
    }

    public final void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        DynamicTabData dynamicTabData;
        DynamicModuleViewItemData dynamicModuleViewItemData;
        DynamicModuleViewItemData dynamicModuleViewItemData2;
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "052d6a14756cf08b76d2a9565d5b543c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "052d6a14756cf08b76d2a9565d5b543c");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        Integer viewType = t.getViewType();
        if (viewType != null) {
            DynamicMappingInterface.ViewDataCreator viewDataCreator = DynamicViewDataMapping.INSTANCE.getViewDataMapping().get(DMConstant.DynamicModuleViewType.valuesCustom()[viewType.intValue()]);
            this.isSingleButton = viewDataCreator != null ? viewDataCreator.isSingleButton() : false;
        }
        String identifier = t.getIdentifier();
        if (identifier == null || kotlin.text.g.a((CharSequence) identifier)) {
            createDiffData(t, arrayList, num, num2, this.isSingleButton);
            return;
        }
        String data = t.getData();
        Object obj = getViewItem().data;
        if (!(obj instanceof DynamicTabData)) {
            obj = null;
        }
        if (!(!h.a((Object) data, (Object) (((DynamicTabData) obj) != null ? dynamicTabData.data : null)))) {
            Object obj2 = getViewItem().data;
            if (!(obj2 instanceof DynamicTabData)) {
                obj2 = null;
            }
            DynamicTabData dynamicTabData2 = (DynamicTabData) obj2;
            if (!(!h.a((dynamicTabData2 == null || (dynamicModuleViewItemData2 = dynamicTabData2.normalData) == null) ? null : Integer.valueOf(dynamicModuleViewItemData2.width), num == null ? 0 : num))) {
                Object obj3 = getViewItem().data;
                if (!(obj3 instanceof DynamicTabData)) {
                    obj3 = null;
                }
                DynamicTabData dynamicTabData3 = (DynamicTabData) obj3;
                if (!(!h.a((dynamicTabData3 == null || (dynamicModuleViewItemData = dynamicTabData3.normalData) == null) ? null : Integer.valueOf(dynamicModuleViewItemData.height), num2 == null ? 0 : num2))) {
                    setComputingViewItemData(null);
                    this.computingSelectViewItemData = null;
                    return;
                }
            }
        }
        createDiffData(t, arrayList, num, num2, this.isSingleButton);
    }

    public final void createDiffData(@NotNull T t, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2, boolean z) {
        Object[] objArr = {t, arrayList, num, num2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c64e89910d5018e79c7b747c88baf929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c64e89910d5018e79c7b747c88baf929");
            return;
        }
        h.b(t, "newInfo");
        h.b(arrayList, "diffResult");
        T t2 = t;
        DynamicModuleViewItemData createViewItemData = createViewItemData(t2);
        createViewItemData.width = num != null ? num.intValue() : 0;
        createViewItemData.height = num2 != null ? num2.intValue() : 0;
        if (t.getMidasInfo() != null) {
            createViewItemData.loadItemListener = createViewItemData.loadItemListener;
        }
        setSelectData(createViewItemData, false);
        arrayList.add(new ComputeUnit(getViewItem(), createViewItemData));
        setComputingViewItemData(createViewItemData);
        if (z) {
            return;
        }
        DynamicModuleViewItemData createViewItemData2 = createViewItemData(t2);
        createViewItemData2.width = num != null ? num.intValue() : 0;
        createViewItemData2.height = num2 != null ? num2.intValue() : 0;
        setSelectData(createViewItemData2, true);
        arrayList.add(new ComputeUnit(getViewItem(), createViewItemData2));
        this.computingSelectViewItemData = createViewItemData2;
    }

    public final void updateProps(@NotNull T t) {
        DynamicModuleViewItemData dynamicModuleViewItemData;
        DynamicModuleViewItemData dynamicModuleViewItemData2;
        DynamicTabData dynamicTabData;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26f155abf9f59e055d5503510626d16f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26f155abf9f59e055d5503510626d16f");
            return;
        }
        h.b(t, "info");
        DynamicModuleViewItemData computingViewItemData = getComputingViewItemData();
        if (computingViewItemData != null) {
            ViewItem viewItem = getViewItem();
            if (this.isSingleButton) {
                dynamicTabData = new DynamicTabData(computingViewItemData, computingViewItemData, t.getData());
            } else {
                DynamicModuleViewItemData dynamicModuleViewItemData3 = this.computingSelectViewItemData;
                dynamicTabData = dynamicModuleViewItemData3 != null ? new DynamicTabData(computingViewItemData, dynamicModuleViewItemData3, t.getData()) : null;
            }
            viewItem.data = dynamicTabData;
            this.computingSelectViewItemData = null;
            setComputingViewItemData(null);
        } else {
            Object obj = getViewItem().data;
            if (!(obj instanceof DynamicTabData)) {
                obj = null;
            }
            DynamicTabData dynamicTabData2 = (DynamicTabData) obj;
            if (dynamicTabData2 != null && (dynamicModuleViewItemData2 = dynamicTabData2.normalData) != null) {
                dynamicModuleViewItemData2.resetViewInfo(t);
            }
            Object obj2 = getViewItem().data;
            if (!(obj2 instanceof DynamicTabData)) {
                obj2 = null;
            }
            DynamicTabData dynamicTabData3 = (DynamicTabData) obj2;
            if (dynamicTabData3 != null && (dynamicModuleViewItemData = dynamicTabData3.selectData) != null) {
                dynamicModuleViewItemData.resetViewInfo(t);
            }
        }
        ViewItem viewItem2 = getViewItem();
        if (!(viewItem2 instanceof IDynamicModuleViewItem)) {
            viewItem2 = null;
        }
        IDynamicModuleViewItem iDynamicModuleViewItem = (IDynamicModuleViewItem) viewItem2;
        if (iDynamicModuleViewItem != null) {
            getHostChassis().refreshHostViewItem(iDynamicModuleViewItem);
        }
        getViewItem().viewPaintingCallback = new DynamicViewPaintingCallback(getHostChassis(), null, false);
        getViewItem().clickCallback = getViewClickCallbackWithTabData();
        Object obj3 = getViewItem().data;
        if (!(obj3 instanceof DynamicTabData)) {
            obj3 = null;
        }
        DynamicTabData dynamicTabData4 = (DynamicTabData) obj3;
        DynamicModuleViewItemData dynamicModuleViewItemData4 = dynamicTabData4 != null ? dynamicTabData4.normalData : null;
        T t2 = t;
        getViewItem().exposeInfo = processExposeInfo(t2, t.getMidasInfo(), t.getViewMgeInfo(), dynamicModuleViewItemData4);
        getViewItem().moveStatusInfo = processMoveStatusInfo(t2, dynamicModuleViewItemData4);
    }

    private final void setSelectData(DynamicModuleViewItemData dynamicModuleViewItemData, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object[] objArr = {dynamicModuleViewItemData, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e3ab9673774e0573a064296da26fb5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e3ab9673774e0573a064296da26fb5c");
            return;
        }
        if (dynamicModuleViewItemData != null) {
            try {
                jSONObject = dynamicModuleViewItemData.jsContextInject;
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = new JSONObject(jSONObject.toString());
        }
        jSONObject2.put(DMKeys.KEY_SELECTED, z);
        if (dynamicModuleViewItemData != null) {
            dynamicModuleViewItemData.jsContextInject = jSONObject2;
        }
    }
}
