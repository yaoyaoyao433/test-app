package com.dianping.shield.dynamic.diff.view;

import android.content.Context;
import android.content.DialogInterface;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.FixedMarginViewInfo;
import com.dianping.shield.dynamic.model.view.PopViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.dynamic.widget.DMDialog;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJI\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u001cH\u0002J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/PopViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/PopViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/FixedMarginViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "exposedIdentifier", "", "diffChildren", "", "newInfo", "computingItem", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/PopViewInfo;Lcom/dianping/shield/node/useritem/ViewItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "mappingViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "", "processDialog", "info", "(Lcom/dianping/shield/dynamic/model/view/PopViewInfo;)V", "updateProps", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PopViewInfoDiff<T extends PopViewInfo, V extends ViewItem> extends FixedMarginViewInfoDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String exposedIdentifier;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.FixedMarginViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((PopViewInfoDiff<T, V>) ((PopViewInfo) diffableInfo), (PopViewInfo) ((ViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.FixedMarginViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(BaseViewInfo baseViewInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((PopViewInfoDiff<T, V>) ((PopViewInfo) baseViewInfo), (PopViewInfo) ((ViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.FixedMarginViewInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(FixedMarginViewInfo fixedMarginViewInfo, ViewItem viewItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((PopViewInfoDiff<T, V>) ((PopViewInfo) fixedMarginViewInfo), (PopViewInfo) viewItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((PopViewInfoDiff<T, V>) ((PopViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((PopViewInfoDiff<T, V>) ((PopViewInfo) baseViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(ViewInfo viewInfo) {
        updateProps((PopViewInfoDiff<T, V>) ((PopViewInfo) viewInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c78e2caadd2e5044579538324fed2c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c78e2caadd2e5044579538324fed2c9");
        }
    }

    public final void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b887ccb6f3b3c91928528506267b4609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b887ccb6f3b3c91928528506267b4609");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((PopViewInfoDiff<T, V>) t, (T) v, arrayList, Integer.valueOf(j.b(getHostChassis().getHostContext(), j.a(getHostChassis().getHostContext()))), Integer.valueOf(j.b(getHostChassis().getHostContext(), DMViewUtils.getWindowDisplayHeight(getHostChassis().getHostContext()))));
    }

    public final void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34bcd4c4fcb1a38b4ad94e0e4374121a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34bcd4c4fcb1a38b4ad94e0e4374121a");
            return;
        }
        h.b(t, "info");
        super.updateProps((PopViewInfoDiff<T, V>) t);
        processDialog(t);
    }

    private final void processDialog(final T t) {
        ExposeCallback exposeCallback;
        boolean z = false;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "722d6a3f51900a039342234b35d7ecb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "722d6a3f51900a039342234b35d7ecb9");
            return;
        }
        DynamicChassisInterface hostChassis = getHostChassis();
        if (!(hostChassis instanceof DynamicAgent)) {
            hostChassis = null;
        }
        if (((DynamicAgent) hostChassis) != null) {
            if (((DynamicAgent) getHostChassis()).dmDialog == null) {
                DynamicAgent dynamicAgent = (DynamicAgent) getHostChassis();
                Context hostContext = getHostChassis().getHostContext();
                if (hostContext == null) {
                    h.a();
                }
                dynamicAgent.dmDialog = new DMDialog(hostContext);
            }
            DMDialog dMDialog = ((DynamicAgent) getHostChassis()).dmDialog;
            if (dMDialog != null) {
                dMDialog.setTapMaskListener(new DMDialog.TapMaskListener() { // from class: com.dianping.shield.dynamic.diff.view.PopViewInfoDiff$processDialog$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.dynamic.widget.DMDialog.TapMaskListener
                    public final void onClick() {
                        JSONObject jSONObject;
                        String str;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83cea5b157035e611b900f913bbf33e2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83cea5b157035e611b900f913bbf33e2");
                            return;
                        }
                        String onTapMask = t.getOnTapMask();
                        if (onTapMask == null || !(!g.a((CharSequence) onTapMask))) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            Object obj = PopViewInfoDiff.this.getViewItem().data;
                            if (!(obj instanceof DynamicModuleViewItemData)) {
                                obj = null;
                            }
                            DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                            jSONObject2.put("data", (dynamicModuleViewItemData == null || (str = dynamicModuleViewItemData.jsonData) == null) ? new JSONObject() : new JSONObject(str));
                            Object obj2 = PopViewInfoDiff.this.getViewItem().data;
                            if (!(obj2 instanceof DynamicModuleViewItemData)) {
                                obj2 = null;
                            }
                            DynamicModuleViewItemData dynamicModuleViewItemData2 = (DynamicModuleViewItemData) obj2;
                            if (dynamicModuleViewItemData2 == null || (jSONObject = dynamicModuleViewItemData2.jsContextInject) == null) {
                                jSONObject = new JSONObject();
                            }
                            jSONObject2.put("context", jSONObject);
                        } catch (JSONException unused) {
                        }
                        ((DynamicAgent) PopViewInfoDiff.this.getHostChassis()).callMethod(onTapMask, jSONObject2);
                    }
                });
                DMConstant.PopAnimationType[] valuesCustom = DMConstant.PopAnimationType.valuesCustom();
                Integer showAnimationType = t.getShowAnimationType();
                dMDialog.setPopInAnimationType(valuesCustom[showAnimationType != null ? showAnimationType.intValue() : 0]);
                DMConstant.PopAnimationType[] valuesCustom2 = DMConstant.PopAnimationType.valuesCustom();
                Integer dismissAnimationType = t.getDismissAnimationType();
                dMDialog.setPopOutAnimationType(valuesCustom2[dismissAnimationType != null ? dismissAnimationType.intValue() : 0]);
                if (!dMDialog.isShowing()) {
                    dMDialog.show();
                    dMDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.dianping.shield.dynamic.diff.view.PopViewInfoDiff$processDialog$$inlined$let$lambda$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            JSONObject jSONObject;
                            String str;
                            Object[] objArr2 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af1a4397ee576fde0593fb59006b6567", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af1a4397ee576fde0593fb59006b6567");
                                return;
                            }
                            String onDismiss = t.getOnDismiss();
                            String str2 = onDismiss;
                            if (str2 == null || g.a((CharSequence) str2)) {
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                Object obj = PopViewInfoDiff.this.getViewItem().data;
                                if (!(obj instanceof DynamicModuleViewItemData)) {
                                    obj = null;
                                }
                                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                                jSONObject2.put("data", (dynamicModuleViewItemData == null || (str = dynamicModuleViewItemData.jsonData) == null) ? new JSONObject() : new JSONObject(str));
                                Object obj2 = PopViewInfoDiff.this.getViewItem().data;
                                if (!(obj2 instanceof DynamicModuleViewItemData)) {
                                    obj2 = null;
                                }
                                DynamicModuleViewItemData dynamicModuleViewItemData2 = (DynamicModuleViewItemData) obj2;
                                if (dynamicModuleViewItemData2 == null || (jSONObject = dynamicModuleViewItemData2.jsContextInject) == null) {
                                    jSONObject = new JSONObject();
                                }
                                jSONObject2.put("context", jSONObject);
                            } catch (JSONException unused) {
                            }
                            ((DynamicAgent) PopViewInfoDiff.this.getHostChassis()).callMethod(onDismiss, jSONObject2);
                        }
                    });
                    String id = getId();
                    if (((id == null || g.a((CharSequence) id)) ? true : true) || (!h.a((Object) this.exposedIdentifier, (Object) getId()))) {
                        ExposeInfo exposeInfo = getViewItem().exposeInfo;
                        if (exposeInfo != null && (exposeCallback = exposeInfo.agentExposeCallback) != null) {
                            ViewItem viewItem = getViewItem();
                            exposeCallback.onExpose(viewItem != null ? viewItem.data : null, 1, null, null);
                        }
                        this.exposedIdentifier = getId();
                    }
                }
                dMDialog.setMarginByMarginInfo(t.getFixedMarginInfo());
                DynamicAgent dynamicAgent2 = (DynamicAgent) getHostChassis();
                Object obj = getViewItem().data;
                if (!(obj instanceof DynamicModuleViewItemData)) {
                    obj = null;
                }
                dMDialog.paintPicassoViewInput(dynamicAgent2, (DynamicModuleViewItemData) obj);
                Object obj2 = getViewItem().data;
                if (!(obj2 instanceof DynamicModuleViewItemData)) {
                    obj2 = null;
                }
                dMDialog.setPicassoViewClickCallback((DynamicModuleViewItemData) obj2, getViewItem());
                Object obj3 = getViewItem().data;
                if (!(obj3 instanceof DynamicModuleViewItemData)) {
                    obj3 = null;
                }
                dMDialog.setViewItemData((DynamicModuleViewItemData) obj3);
            }
        }
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39ddc00585809fba9be0f69870fc441e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39ddc00585809fba9be0f69870fc441e");
        }
        h.b(str, "identifier");
        return mappingViewItem(str);
    }

    private final DynamicViewItem<?> mappingViewItem(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eb2e9af23db4db53c444ef5e548ffb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eb2e9af23db4db53c444ef5e548ffb8");
        }
        if (h.a((Object) charSequence, (Object) getId())) {
            ViewItem viewItem = getViewItem();
            if (!(viewItem instanceof DynamicViewItem)) {
                viewItem = null;
            }
            return (DynamicViewItem) viewItem;
        }
        return null;
    }
}
