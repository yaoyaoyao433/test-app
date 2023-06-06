package com.dianping.shield.dynamic.diff.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.dianping.agentsdk.framework.ab;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.diff.DynamicBaseDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.preload.DynamicPreloadMananger;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.LoadItemListener;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.feature.PositionInfoInterface;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.midas.ad.feedback.b;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.reflect.i;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 ^*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u0005:\u0001^B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u00105J\r\u00106\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00107J\u000e\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0002JI\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u00012\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?2\b\u0010@\u001a\u0004\u0018\u00010\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010BJA\u0010C\u001a\u0002032\u0006\u0010;\u001a\u00020\u00022\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?2\b\u0010@\u001a\u0004\u0018\u00010\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020HH\u0016J*\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00022\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J$\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\b\u0010V\u001a\u000203H\u0016J\b\u0010W\u001a\u000203H\u0002J\u0017\u0010X\u001a\u0002032\b\u0010A\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010YJ\u0017\u0010Z\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010YJ\u0015\u0010[\u001a\u0002032\u0006\u0010\\\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010]R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020(X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b/\u00100¨\u0006_"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "V", "Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "computingViewItemData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "getComputingViewItemData", "()Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "setComputingViewItemData", "(Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;)V", "diffOption", "", "getDiffOption", "()I", "setDiffOption", "(I)V", "dynamicPaitingInterface", "getDynamicPaitingInterface", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "setDynamicPaitingInterface", "(Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;)V", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "loadItemListener", "Lcom/dianping/shield/dynamic/protocols/LoadItemListener;", "getLoadItemListener", "()Lcom/dianping/shield/dynamic/protocols/LoadItemListener;", "loadItemListener$delegate", "Lkotlin/Lazy;", "viewClickCallbackWithData", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "getViewClickCallbackWithData", "()Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "viewClickCallbackWithData$delegate", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "viewPaintingCallback", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "getViewPaintingCallback", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "viewPaintingCallback$delegate", "bindItems", "", "computingItem", "(Ljava/lang/Object;)V", "createComputingItem", "()Ljava/lang/Object;", "createViewItemData", DMKeys.KEY_VIEW_INFO, "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffThis", "(Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "handleClick", "hostContainer", "extraData", "Lorg/json/JSONObject;", "location", "", "onPaintingInputComplete", "viewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "resetProps", "resetViewItemProps", "setComputingSuggestHeight", "(Ljava/lang/Integer;)V", "setComputingSuggestWidth", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;)V", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class BaseViewInfoDiff<T extends BaseViewInfo, V> extends DynamicBaseDiff<T, V> implements DynamicPaitingInterface {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(BaseViewInfoDiff.class), "viewPaintingCallback", "getViewPaintingCallback()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;")), u.a(new s(u.a(BaseViewInfoDiff.class), "viewClickCallbackWithData", "getViewClickCallbackWithData()Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;")), u.a(new s(u.a(BaseViewInfoDiff.class), "loadItemListener", "getLoadItemListener()Lcom/dianping/shield/dynamic/protocols/LoadItemListener;"))};
    public static final Companion Companion = new Companion(null);
    public static final int DIFF_OPTION_HEIGHT = 2;
    public static final int DIFF_OPTION_NONE = 0;
    public static final int DIFF_OPTION_WIDTH = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private DynamicModuleViewItemData computingViewItemData;
    private int diffOption;
    @Nullable
    private DynamicPaitingInterface dynamicPaitingInterface;
    @NotNull
    private final DynamicChassisInterface hostChassis;
    @NotNull
    private final d loadItemListener$delegate;
    @NotNull
    private final d viewClickCallbackWithData$delegate;
    @NotNull
    public ViewItem viewItem;
    @NotNull
    private final d viewPaintingCallback$delegate;

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void bindItems(@Nullable V v) {
    }

    @NotNull
    public final LoadItemListener getLoadItemListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LoadItemListener) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f1427421908547f1f788fb973c7d24e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f1427421908547f1f788fb973c7d24e") : this.loadItemListener$delegate.a());
    }

    @NotNull
    public final ViewClickCallbackWithData getViewClickCallbackWithData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ViewClickCallbackWithData) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "130fcfaafa5dd50f9383e26d66652243", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "130fcfaafa5dd50f9383e26d66652243") : this.viewClickCallbackWithData$delegate.a());
    }

    @NotNull
    public DynamicViewPaintingCallback getViewPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (DynamicViewPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "437d52a894ade95d23c9fad83b1ad3d3", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "437d52a894ade95d23c9fad83b1ad3d3") : this.viewPaintingCallback$delegate.a());
    }

    public BaseViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32e5eae3b67ead768551fa7a1e6f6d54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32e5eae3b67ead768551fa7a1e6f6d54");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.diffOption = 3;
        this.viewPaintingCallback$delegate = e.a(kotlin.i.NONE, new BaseViewInfoDiff$viewPaintingCallback$2(this));
        this.viewClickCallbackWithData$delegate = e.a(kotlin.i.NONE, new BaseViewInfoDiff$viewClickCallbackWithData$2(this));
        this.loadItemListener$delegate = e.a(kotlin.i.NONE, new BaseViewInfoDiff$loadItemListener$2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseViewInfoDiff<T, V>) ((BaseViewInfo) diffableInfo), (BaseViewInfo) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseViewInfoDiff<T, V>) ((BaseViewInfo) diffableInfo));
    }

    @Override // com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface
    public void onPaintingInputComplete(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147a935bff12efee0d035993ee195975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147a935bff12efee0d035993ee195975");
            return;
        }
        h.b(shieldViewHolder, "viewHolder");
        DynamicPaitingInterface dynamicPaitingInterface = this.dynamicPaitingInterface;
        if (dynamicPaitingInterface != null) {
            dynamicPaitingInterface.onPaintingInputComplete(shieldViewHolder, obj, nodePath);
        }
    }

    @NotNull
    public final ViewItem getViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b7760654039c08e4000f44caaf8fa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b7760654039c08e4000f44caaf8fa6");
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        return viewItem;
    }

    public final void setViewItem(@NotNull ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011b97193502b4404fa948911ff1dd66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011b97193502b4404fa948911ff1dd66");
            return;
        }
        h.b(viewItem, "<set-?>");
        this.viewItem = viewItem;
    }

    @Nullable
    public final DynamicModuleViewItemData getComputingViewItemData() {
        return this.computingViewItemData;
    }

    public final void setComputingViewItemData(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        this.computingViewItemData = dynamicModuleViewItemData;
    }

    public final int getDiffOption() {
        return this.diffOption;
    }

    public final void setDiffOption(int i) {
        this.diffOption = i;
    }

    @Nullable
    public final DynamicPaitingInterface getDynamicPaitingInterface() {
        return this.dynamicPaitingInterface;
    }

    public final void setDynamicPaitingInterface(@Nullable DynamicPaitingInterface dynamicPaitingInterface) {
        this.dynamicPaitingInterface = dynamicPaitingInterface;
    }

    public void diffChildren(@NotNull T t, V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2e4b8d419d949439657bfecb89ff84c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2e4b8d419d949439657bfecb89ff84c");
            return;
        }
        h.b(t, "newInfo");
        h.b(arrayList, "diffResult");
        diffThis(t, arrayList, num, num2);
    }

    private final void diffThis(BaseViewInfo baseViewInfo, ArrayList<ComputeUnit> arrayList, Integer num, Integer num2) {
        boolean z;
        boolean z2;
        DynamicModuleViewItemData dynamicModuleViewItemData;
        Object[] objArr = {baseViewInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d505585471a9640f17402ee92fa214a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d505585471a9640f17402ee92fa214a6");
            return;
        }
        String identifier = baseViewInfo.getIdentifier();
        if (identifier == null || g.a((CharSequence) identifier)) {
            DynamicModuleViewItemData createViewItemData = createViewItemData(baseViewInfo);
            createViewItemData.width = num != null ? num.intValue() : 0;
            createViewItemData.height = num2 != null ? num2.intValue() : 0;
            if (baseViewInfo.getMidasInfo() != null) {
                createViewItemData.loadItemListener = getLoadItemListener();
            }
            ViewItem viewItem = this.viewItem;
            if (viewItem == null) {
                h.a("viewItem");
            }
            arrayList.add(new ComputeUnit(viewItem, createViewItemData));
            this.computingViewItemData = createViewItemData;
            return;
        }
        String data = baseViewInfo.getData();
        if ((this.diffOption & 1) == 1) {
            ViewItem viewItem2 = this.viewItem;
            if (viewItem2 == null) {
                h.a("viewItem");
            }
            Object obj = viewItem2.data;
            if (!(obj instanceof DynamicModuleViewItemData)) {
                obj = null;
            }
            DynamicModuleViewItemData dynamicModuleViewItemData2 = (DynamicModuleViewItemData) obj;
            z = !h.a(dynamicModuleViewItemData2 != null ? Integer.valueOf(dynamicModuleViewItemData2.width) : null, num == null ? 0 : num);
        } else {
            z = false;
        }
        if ((this.diffOption & 2) == 2) {
            ViewItem viewItem3 = this.viewItem;
            if (viewItem3 == null) {
                h.a("viewItem");
            }
            Object obj2 = viewItem3.data;
            if (!(obj2 instanceof DynamicModuleViewItemData)) {
                obj2 = null;
            }
            DynamicModuleViewItemData dynamicModuleViewItemData3 = (DynamicModuleViewItemData) obj2;
            z2 = !h.a(dynamicModuleViewItemData3 != null ? Integer.valueOf(dynamicModuleViewItemData3.height) : null, num2 == null ? 0 : num2);
        } else {
            z2 = false;
        }
        ViewItem viewItem4 = this.viewItem;
        if (viewItem4 == null) {
            h.a("viewItem");
        }
        Object obj3 = viewItem4.data;
        if (!(obj3 instanceof DynamicModuleViewItemData)) {
            obj3 = null;
        }
        if ((!h.a((Object) data, (Object) (((DynamicModuleViewItemData) obj3) != null ? dynamicModuleViewItemData.jsonData : null))) || z || z2) {
            DynamicModuleViewItemData createViewItemData2 = createViewItemData(baseViewInfo);
            createViewItemData2.width = num != null ? num.intValue() : 0;
            createViewItemData2.height = num2 != null ? num2.intValue() : 0;
            if (baseViewInfo.getMidasInfo() != null) {
                createViewItemData2.loadItemListener = getLoadItemListener();
            }
            ViewItem viewItem5 = this.viewItem;
            if (viewItem5 == null) {
                h.a("viewItem");
            }
            arrayList.add(new ComputeUnit(viewItem5, createViewItemData2));
            this.computingViewItemData = createViewItemData2;
            return;
        }
        this.computingViewItemData = null;
    }

    private final void resetViewItemProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1255668a62c70a92c9f07ed1846d112d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1255668a62c70a92c9f07ed1846d112d");
            return;
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        viewItem.clickCallback = null;
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public V createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ab3bdf5a8ddc8e69191305d669f12d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ab3bdf5a8ddc8e69191305d669f12d9");
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        return (V) viewItem;
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "018f72818c14ee3fe73b1e4b16b3c757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "018f72818c14ee3fe73b1e4b16b3c757");
        } else {
            resetViewItemProps();
        }
    }

    public void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc36fc2da17f9e0494403bfd87be6a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc36fc2da17f9e0494403bfd87be6a6b");
            return;
        }
        h.b(t, "info");
        DynamicModuleViewItemData dynamicModuleViewItemData = this.computingViewItemData;
        if (dynamicModuleViewItemData != null) {
            ViewItem viewItem = this.viewItem;
            if (viewItem == null) {
                h.a("viewItem");
            }
            viewItem.data = dynamicModuleViewItemData;
            ViewItem viewItem2 = this.viewItem;
            if (viewItem2 == null) {
                h.a("viewItem");
            }
            viewItem2.viewPaintingCallback = getViewPaintingCallback();
            this.computingViewItemData = null;
        } else {
            ViewItem viewItem3 = this.viewItem;
            if (viewItem3 == null) {
                h.a("viewItem");
            }
            Object obj = viewItem3.data;
            if (!(obj instanceof DynamicModuleViewItemData)) {
                obj = null;
            }
            DynamicModuleViewItemData dynamicModuleViewItemData2 = (DynamicModuleViewItemData) obj;
            if (dynamicModuleViewItemData2 != null) {
                dynamicModuleViewItemData2.resetViewInfo(t);
            }
        }
        ViewItem viewItem4 = this.viewItem;
        if (viewItem4 == null) {
            h.a("viewItem");
        }
        if (!(viewItem4 instanceof IDynamicModuleViewItem)) {
            viewItem4 = null;
        }
        IDynamicModuleViewItem iDynamicModuleViewItem = (IDynamicModuleViewItem) viewItem4;
        if (iDynamicModuleViewItem != null) {
            this.hostChassis.refreshHostViewItem(iDynamicModuleViewItem);
        }
        String jumpUrl = t.getJumpUrl();
        if (jumpUrl != null) {
            String name = this.hostChassis.getHostFragment().getClass().getName();
            if (this.hostChassis.getHostFragment() instanceof ShieldGAInterface) {
                Fragment hostFragment = this.hostChassis.getHostFragment();
                if (hostFragment == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.monitor.ShieldGAInterface");
                }
                name = ((ShieldGAInterface) hostFragment).getShieldGAInfo().getBusiness();
            }
            DynamicPreloadMananger dynamicPreloadMananger = DynamicPreloadMananger.INSTANCE;
            Uri parse = Uri.parse(jumpUrl);
            h.a((Object) parse, "Uri.parse(it)");
            dynamicPreloadMananger.preload(parse, name);
        }
        ViewItem viewItem5 = this.viewItem;
        if (viewItem5 == null) {
            h.a("viewItem");
        }
        viewItem5.clickCallback = getViewClickCallbackWithData();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a14ca4a9e7e960160d11aca3751181", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a14ca4a9e7e960160d11aca3751181");
        }
        h.b(str, "identifier");
        if (h.a((Object) str, (Object) getId())) {
            ViewItem viewItem = this.viewItem;
            if (viewItem == null) {
                h.a("viewItem");
            }
            if (!(viewItem instanceof IDynamicModuleViewItem)) {
                viewItem = null;
            }
            return (IDynamicModuleViewItem) viewItem;
        }
        return null;
    }

    @NotNull
    public final DynamicModuleViewItemData createViewItemData(@NotNull BaseViewInfo baseViewInfo) {
        Object[] objArr = {baseViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bef20a5cefcc114f7ccd6c8e31be32", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleViewItemData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bef20a5cefcc114f7ccd6c8e31be32");
        }
        h.b(baseViewInfo, DMKeys.KEY_VIEW_INFO);
        DynamicModuleViewItemData dynamicModuleViewItemData = new DynamicModuleViewItemData();
        dynamicModuleViewItemData.updateViewInfo(baseViewInfo);
        return dynamicModuleViewItemData;
    }

    public void handleClick(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull BaseViewInfo baseViewInfo, @NotNull JSONObject jSONObject, @Nullable int[] iArr) {
        String[] clickURLs;
        String[] viewURLs;
        String didSelectCallback;
        int i = 0;
        Object[] objArr = {dynamicChassisInterface, baseViewInfo, jSONObject, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a4ff826200abcb96a3808b19d8e477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a4ff826200abcb96a3808b19d8e477");
            return;
        }
        h.b(dynamicChassisInterface, "hostContainer");
        h.b(baseViewInfo, DMKeys.KEY_VIEW_INFO);
        h.b(jSONObject, "extraData");
        FragmentActivity activity = dynamicChassisInterface.getHostFragment().getActivity();
        MGEInfo clickMgeInfo = baseViewInfo.getClickMgeInfo();
        if (clickMgeInfo != null) {
            Statistics.getChannel(clickMgeInfo.getCategory()).writeModelClick(AppUtil.generatePageInfoKey(activity), clickMgeInfo.getBid(), clickMgeInfo.getLabs(), clickMgeInfo.getCid());
        }
        String didSelectCallback2 = baseViewInfo.getDidSelectCallback();
        if (!(didSelectCallback2 == null || didSelectCallback2.length() == 0) && (dynamicChassisInterface instanceof ICommonHost) && (didSelectCallback = baseViewInfo.getDidSelectCallback()) != null) {
            String str = didSelectCallback;
            if (str == null || g.a((CharSequence) str)) {
                str = null;
            }
            if (str != null) {
                ((ICommonHost) dynamicChassisInterface).callMethod(str.toString(), jSONObject);
            }
        }
        String jumpUrl = baseViewInfo.getJumpUrl();
        if (!(jumpUrl == null || jumpUrl.length() == 0)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(baseViewInfo.getJumpUrl()));
            intent.addFlags(y.a);
            Context hostContext = DMUtils.getHostContext(dynamicChassisInterface);
            if (hostContext == null) {
                h.a();
            }
            intent.setPackage(hostContext.getPackageName());
            dynamicChassisInterface.getHostFragment().startActivity(intent);
        }
        ab<?> pageContainer = dynamicChassisInterface.getPageContainer();
        int scrollY = (pageContainer instanceof PositionInfoInterface ? ((PositionInfoInterface) pageContainer).getScrollY() : 0) + (iArr != null ? iArr[1] : 0);
        MidasInfo midasInfo = baseViewInfo.getMidasInfo();
        if (midasInfo != null) {
            Context hostContext2 = DMUtils.getHostContext(dynamicChassisInterface);
            String moduleName = DMUtils.getModuleName(dynamicChassisInterface);
            h.a((Object) moduleName, "DMUtils.getModuleName(hostContainer)");
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
            if (hostContext2 != null) {
                new b(hostContext2).a(midasInfo.getFeedback(), 2, arrayList, midasInfo.getExtra());
            }
        }
    }

    public void setComputingSuggestHeight(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31e6456b233e4376c509063c274031ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31e6456b233e4376c509063c274031ef");
        } else if (num != null) {
            int intValue = num.intValue();
            DynamicModuleViewItemData dynamicModuleViewItemData = this.computingViewItemData;
            if (dynamicModuleViewItemData != null) {
                dynamicModuleViewItemData.height = intValue;
            }
        }
    }

    public void setComputingSuggestWidth(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49d30a71112549968a7c70acb384be7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49d30a71112549968a7c70acb384be7f");
        } else if (num != null) {
            int intValue = num.intValue();
            DynamicModuleViewItemData dynamicModuleViewItemData = this.computingViewItemData;
            if (dynamicModuleViewItemData != null) {
                dynamicModuleViewItemData.width = intValue;
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff$Companion;", "", "()V", "DIFF_OPTION_HEIGHT", "", "DIFF_OPTION_NONE", "DIFF_OPTION_WIDTH", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }
}
