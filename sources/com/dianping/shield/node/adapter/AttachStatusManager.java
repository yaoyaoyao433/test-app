package com.dianping.shield.node.adapter;

import android.graphics.Rect;
import android.util.Pair;
import android.util.SparseArray;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.ElementList;
import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.b;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003mnoB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u00102\u001a\u000203H\u0016J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203Jâ\u0001\u00106\u001a\u0002032\u001a\u00107\u001a\u0016\u0012\u0004\u0012\u000208\u0018\u00010\rj\n\u0012\u0004\u0012\u000208\u0018\u0001`\u00112\u0006\u00109\u001a\u0002082\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\"\u0010:\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<0;j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<`=2\"\u0010>\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020?0;j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020?`=2\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\"\u0010C\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0\rj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D`\u00112\u001e\u0010E\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\u00100\u000eH\u0002J\u0016\u0010F\u001a\u0002032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000DH\u0002J\u0006\u0010H\u001a\u00020\u0015J\u0017\u0010I\u001a\u0004\u0018\u00018\u00002\u0006\u0010J\u001a\u00020?H\u0002¢\u0006\u0002\u0010KJ,\u0010L\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010NH\u0004J9\u0010O\u001a\u00020<2\"\u0010P\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<0;j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<`=2\u0006\u0010Q\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010RJ\u0006\u0010S\u001a\u000203J\u0010\u0010T\u001a\u0002032\u0006\u0010A\u001a\u00020BH\u0016J\u000e\u0010U\u001a\u0002032\u0006\u0010V\u001a\u00020WJ\u0014\u0010X\u001a\u0002032\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u001d\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u00028\u00002\u0006\u0010\\\u001a\u00020<H\u0002¢\u0006\u0002\u0010]J\u000e\u0010^\u001a\u0002032\u0006\u0010)\u001a\u00020\u0010J\b\u0010_\u001a\u000203H\u0016JY\u0010`\u001a\u00020\u00102\u001a\u00107\u001a\u0016\u0012\u0004\u0012\u000208\u0018\u00010\rj\n\u0012\u0004\u0012\u000208\u0018\u0001`\u00112\u0006\u00109\u001a\u0002082\u0006\u0010A\u001a\u00020B2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010a\u001a\u00020<2\u0006\u0010@\u001a\u00020<2\u0006\u0010b\u001a\u00020\u001fH\u0002¢\u0006\u0002\u0010cJ\u0006\u0010d\u001a\u000203Jv\u0010e\u001a\u0002032\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0018\u0010g\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0018\u0010h\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0006\u0010A\u001a\u00020BJA\u0010i\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u001d2\u0006\u0010Q\u001a\u0002H\u00012\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00100jH\u0000¢\u0006\u0004\bk\u0010lR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bRE\u0010\f\u001a6\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rj\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00020\u00100\u000e`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u001c\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R2\u00100\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0018\u00010\rj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0018\u0001`\u00118\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/dianping/shield/node/adapter/AttachStatusManager;", "T", "Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor;", "viewLocationRectInterface", "Lcom/dianping/shield/node/adapter/status/ViewLocationRectInterface;", "(Lcom/dianping/shield/node/adapter/status/ViewLocationRectInterface;)V", "adapterPositionInfo", "Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor$FirstLastPositionInfo;", "getAdapterPositionInfo$shieldCore_release", "()Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor$FirstLastPositionInfo;", "setAdapterPositionInfo$shieldCore_release", "(Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor$FirstLastPositionInfo;)V", "appearanceComputeInterceptorRules", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "Lcom/dianping/shield/node/adapter/AttachStatusManager$AppearanceComputeInterceptorRulesBean;", "", "Lkotlin/collections/ArrayList;", "getAppearanceComputeInterceptorRules", "()Ljava/util/ArrayList;", "currentState", "Lcom/dianping/shield/node/adapter/AttachStatusManager$State;", "getCurrentState$shieldCore_release", "()Lcom/dianping/shield/node/adapter/AttachStatusManager$State;", "setCurrentState$shieldCore_release", "(Lcom/dianping/shield/node/adapter/AttachStatusManager$State;)V", "elementList", "Lcom/dianping/shield/node/adapter/status/ElementList;", "extraVisibleElementList", "Landroid/util/SparseArray;", "Landroid/util/Pair;", "Lcom/dianping/shield/entity/ViewExtraInfo;", "getExtraVisibleElementList", "()Landroid/util/SparseArray;", "setExtraVisibleElementList", "(Landroid/util/SparseArray;)V", "needLoadStore", "getNeedLoadStore", "()Z", "setNeedLoadStore", "(Z)V", "needUpdateStatus", "screenVisibleExposeEdge", "Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "getScreenVisibleExposeEdge", "()Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "setScreenVisibleExposeEdge", "(Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;)V", "targetDispatchers", "Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", KNBConfig.CONFIG_CLEAR_CACHE, "", "clearCurrentInfo", "clearStoredPositionInfo", "diffAndUpdateStatus", "screenInvisibleEdge", "Landroid/graphics/Rect;", "screenVisibleEdge", "oldStatusMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "Lkotlin/collections/HashMap;", "oldPositionMap", "", "newStatus", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "changedElement", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "checkFun", "dispatchElementAppearanceEvent", "dispatchData", "getCurrentState", "getDisplayElement", "position", "(I)Ljava/lang/Object;", "getDisplayElementList", "positionList", "", "getStatus", "map", "element", "(Ljava/util/HashMap;Ljava/lang/Object;)Lcom/dianping/shield/node/cellnode/AttachStatus;", "loadCurrentInfo", "onViewLocationChanged", "setAction", "action", "Lcom/dianping/shield/node/adapter/AttachStatusManager$Action;", "setElementList", "elementListList", "setElementStatus", "displayElement", "status", "(Ljava/lang/Object;Lcom/dianping/shield/node/cellnode/AttachStatus;)V", "setNeedUpdateStatus", "shieldRecycle", "shouldInterceptAppearance", "oldStatus", "viewExtraInfo", "(Ljava/util/ArrayList;Landroid/graphics/Rect;Lcom/dianping/shield/entity/ScrollDirection;Ljava/lang/Object;Lcom/dianping/shield/node/cellnode/AttachStatus;Lcom/dianping/shield/node/cellnode/AttachStatus;Lcom/dianping/shield/entity/ViewExtraInfo;)Z", "storeCurrentInfo", "updateCurrentInScreenElement", "completeElementList", "firstElementList", "lastElementList", "containElement", "Lkotlin/Function2;", "containElement$shieldCore_release", "(Landroid/util/SparseArray;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "Action", "AppearanceComputeInterceptorRulesBean", "State", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class AttachStatusManager<T> extends ViewLocationChangeProcessor<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ViewLocationChangeProcessor.FirstLastPositionInfo adapterPositionInfo;
    @NotNull
    private final ArrayList<b<AppearanceComputeInterceptorRulesBean<T>, Boolean>> appearanceComputeInterceptorRules;
    @NotNull
    private State currentState;
    private ElementList<T> elementList;
    @Nullable
    private SparseArray<Pair<T, ViewExtraInfo>> extraVisibleElementList;
    private boolean needLoadStore;
    private boolean needUpdateStatus;
    @Nullable
    private IScreenVisibleExposeEdge screenVisibleExposeEdge;
    @JvmField
    @Nullable
    protected ArrayList<ElementStatusEventListener<T>> targetDispatchers;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[Action.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Action.ACT_STARTING.ordinal()] = 1;
            $EnumSwitchMapping$0[Action.ACT_START.ordinal()] = 2;
            $EnumSwitchMapping$0[Action.ACT_STOP.ordinal()] = 3;
            $EnumSwitchMapping$0[Action.ACT_PAUSE.ordinal()] = 4;
            $EnumSwitchMapping$0[Action.ACT_RESUME.ordinal()] = 5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachStatusManager(@NotNull ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        h.b(viewLocationRectInterface, "viewLocationRectInterface");
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b7875ffe434929936e9f56abfbe3a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b7875ffe434929936e9f56abfbe3a3");
            return;
        }
        this.needLoadStore = true;
        this.currentState = State.CLOSE;
        this.needUpdateStatus = true;
        this.appearanceComputeInterceptorRules = new ArrayList<>();
        this.appearanceComputeInterceptorRules.add(new b<AppearanceComputeInterceptorRulesBean<T>, Boolean>() { // from class: com.dianping.shield.node.adapter.AttachStatusManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // kotlin.jvm.functions.b
            public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AppearanceComputeInterceptorRulesBean) ((AppearanceComputeInterceptorRulesBean) obj));
            }

            @NotNull
            public final Boolean invoke(@NotNull AppearanceComputeInterceptorRulesBean<T> appearanceComputeInterceptorRulesBean) {
                ArrayList<Rect> screenInvisibleEdge;
                boolean z = true;
                Object[] objArr2 = {appearanceComputeInterceptorRulesBean};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ec5665bcb26724b2941f84ac963ced62", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ec5665bcb26724b2941f84ac963ced62");
                }
                h.b(appearanceComputeInterceptorRulesBean, "appearanceComputeInterceptorRulesBean");
                if (appearanceComputeInterceptorRulesBean.getViewExtraInfo().viewRect == null || AttachStatusManager.this.getScreenVisibleExposeEdge() == null || (screenInvisibleEdge = appearanceComputeInterceptorRulesBean.getScreenInvisibleEdge()) == null) {
                    return false;
                }
                Rect rect = appearanceComputeInterceptorRulesBean.getViewExtraInfo().viewRect;
                for (Rect rect2 : screenInvisibleEdge) {
                    rect.intersect(rect2);
                }
                h.a((Object) rect, "viewRect");
                if (!rect.isEmpty() && Rect.intersects(appearanceComputeInterceptorRulesBean.getViewExtraInfo().viewRect, appearanceComputeInterceptorRulesBean.getScreenVisibleEdge())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean getNeedLoadStore() {
        return this.needLoadStore;
    }

    public final void setNeedLoadStore(boolean z) {
        this.needLoadStore = z;
    }

    @NotNull
    public final State getCurrentState$shieldCore_release() {
        return this.currentState;
    }

    public final void setCurrentState$shieldCore_release(@NotNull State state) {
        h.b(state, "<set-?>");
        this.currentState = state;
    }

    @Nullable
    public final ViewLocationChangeProcessor.FirstLastPositionInfo getAdapterPositionInfo$shieldCore_release() {
        return this.adapterPositionInfo;
    }

    public final void setAdapterPositionInfo$shieldCore_release(@Nullable ViewLocationChangeProcessor.FirstLastPositionInfo firstLastPositionInfo) {
        this.adapterPositionInfo = firstLastPositionInfo;
    }

    @Nullable
    public final SparseArray<Pair<T, ViewExtraInfo>> getExtraVisibleElementList() {
        return this.extraVisibleElementList;
    }

    public final void setExtraVisibleElementList(@Nullable SparseArray<Pair<T, ViewExtraInfo>> sparseArray) {
        this.extraVisibleElementList = sparseArray;
    }

    @Nullable
    public final IScreenVisibleExposeEdge getScreenVisibleExposeEdge() {
        return this.screenVisibleExposeEdge;
    }

    public final void setScreenVisibleExposeEdge(@Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        this.screenVisibleExposeEdge = iScreenVisibleExposeEdge;
    }

    @NotNull
    public final ArrayList<b<AppearanceComputeInterceptorRulesBean<T>, Boolean>> getAppearanceComputeInterceptorRules() {
        return this.appearanceComputeInterceptorRules;
    }

    public final void setNeedUpdateStatus(boolean z) {
        this.needUpdateStatus = z;
    }

    public final void storeCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60e49fa7561786247ca55cf7429009bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60e49fa7561786247ca55cf7429009bf");
            return;
        }
        try {
            Object clone = this.firstLastPositionInfo.clone();
            if (clone == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.node.adapter.ViewLocationChangeProcessor.FirstLastPositionInfo");
            }
            this.adapterPositionInfo = (ViewLocationChangeProcessor.FirstLastPositionInfo) clone;
        } catch (Exception e) {
            this.adapterPositionInfo = new ViewLocationChangeProcessor.FirstLastPositionInfo(1);
            e.printStackTrace();
        }
    }

    public final void loadCurrentInfo() {
        this.firstLastPositionInfo = this.adapterPositionInfo;
    }

    public final void clearStoredPositionInfo() {
        this.adapterPositionInfo = null;
    }

    public final void setElementList(@NotNull ElementList<T> elementList) {
        Object[] objArr = {elementList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c0589712a1ff1d884a786e5812d403f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c0589712a1ff1d884a786e5812d403f");
            return;
        }
        h.b(elementList, "elementListList");
        this.elementList = elementList;
        this.targetDispatchers = elementList.getEventDispatcherList();
    }

    @NotNull
    public final State getCurrentState() {
        return this.currentState;
    }

    public final void setAction(@NotNull Action action) {
        Object[] objArr = {action};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b35e5f6179c78c6cd316651a7488535a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b35e5f6179c78c6cd316651a7488535a");
            return;
        }
        h.b(action, "action");
        switch (WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                if (this.currentState != State.OPEN) {
                    this.currentState = State.OPENING;
                    return;
                }
                return;
            case 2:
                this.currentState = State.OPEN;
                return;
            case 3:
                this.currentState = State.CLOSE;
                return;
            case 4:
                if (this.currentState == State.OPEN || this.currentState == State.OPENING) {
                    this.currentState = State.PAUSE;
                    return;
                }
                return;
            case 5:
                if (this.currentState == State.PAUSE) {
                    this.currentState = State.OPEN;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void clearCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c206df278be4bb9824ec6e5222ea383a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c206df278be4bb9824ec6e5222ea383a");
        } else {
            this.firstLastPositionInfo.clear();
        }
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2190de454ab6163edbc74c604a881f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2190de454ab6163edbc74c604a881f1");
            return;
        }
        this.statusHashMap.clear();
        this.positionHashMap.clear();
    }

    @NotNull
    public final AttachStatus getStatus(@NotNull HashMap<T, AttachStatus> hashMap, T t) {
        Object[] objArr = {hashMap, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85d1a3d73ab415b59a89af7a3a1861e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (AttachStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85d1a3d73ab415b59a89af7a3a1861e5");
        }
        h.b(hashMap, "map");
        AttachStatus attachStatus = hashMap.get(t);
        return attachStatus == null ? AttachStatus.DETACHED : attachStatus;
    }

    private final T getDisplayElement(int i) {
        ElementList<T> elementList;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7efaadee1e936ec4f3e40f0cdefac92c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7efaadee1e936ec4f3e40f0cdefac92c");
        }
        if (i >= 0) {
            ElementList<T> elementList2 = this.elementList;
            if (i >= (elementList2 != null ? elementList2.size() : 0) || (elementList = this.elementList) == null) {
                return null;
            }
            return elementList.getDisplayElement(i);
        }
        return null;
    }

    @Nullable
    public final SparseArray<Pair<T, ViewExtraInfo>> getDisplayElementList(@Nullable List<? extends ViewExtraInfo> list) {
        T displayElement;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf524b94971e562c285c1b4044581275", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf524b94971e562c285c1b4044581275");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        SparseArray<Pair<T, ViewExtraInfo>> sparseArray = new SparseArray<>(list.size());
        for (ViewExtraInfo viewExtraInfo : list) {
            int i = viewExtraInfo.offsetPos;
            if (i >= 0 && (displayElement = getDisplayElement(i)) != null) {
                sparseArray.put(i, Pair.create(displayElement, viewExtraInfo));
            }
        }
        return sparseArray;
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    public void onViewLocationChanged(@NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab8a97f6fbe3a98c1d968d6ff74a14c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab8a97f6fbe3a98c1d968d6ff74a14c4");
            return;
        }
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        if (this.currentState == State.OPEN && this.needUpdateStatus) {
            if (this.needLoadStore && this.adapterPositionInfo != null) {
                ViewLocationChangeProcessor.FirstLastPositionInfo firstLastPositionInfo = this.firstLastPositionInfo;
                h.a((Object) firstLastPositionInfo, "firstLastPositionInfo");
                if (firstLastPositionInfo.isEmpty()) {
                    this.firstLastPositionInfo = this.adapterPositionInfo;
                }
            }
            SparseArray<Pair<T, ViewExtraInfo>> displayElementList = getDisplayElementList(this.firstLastPositionInfo.completelyVisibleItemPositions);
            if (displayElementList == null) {
                displayElementList = new SparseArray<>();
            }
            SparseArray<Pair<T, ViewExtraInfo>> sparseArray = displayElementList;
            SparseArray<Pair<T, ViewExtraInfo>> displayElementList2 = getDisplayElementList(this.firstLastPositionInfo.firstVisibleItemPositions);
            if (displayElementList2 == null) {
                displayElementList2 = new SparseArray<>();
            }
            SparseArray<Pair<T, ViewExtraInfo>> sparseArray2 = displayElementList2;
            SparseArray<Pair<T, ViewExtraInfo>> displayElementList3 = getDisplayElementList(this.firstLastPositionInfo.lastVisibleItemPositions);
            if (displayElementList3 == null) {
                displayElementList3 = new SparseArray<>();
            }
            SparseArray<Pair<T, ViewExtraInfo>> sparseArray3 = displayElementList3;
            SparseArray<Pair<T, ViewExtraInfo>> sparseArray4 = this.extraVisibleElementList;
            if (sparseArray4 == null) {
                sparseArray4 = new SparseArray<>();
            }
            updateCurrentInScreenElement(sparseArray, sparseArray2, sparseArray3, sparseArray4, scrollDirection);
        }
    }

    public final void updateCurrentInScreenElement(@NotNull SparseArray<Pair<T, ViewExtraInfo>> sparseArray, @NotNull SparseArray<Pair<T, ViewExtraInfo>> sparseArray2, @NotNull SparseArray<Pair<T, ViewExtraInfo>> sparseArray3, @NotNull SparseArray<Pair<T, ViewExtraInfo>> sparseArray4, @NotNull ScrollDirection scrollDirection) {
        Rect rect;
        HashMap<T, Integer> hashMap;
        Object[] objArr = {sparseArray, sparseArray2, sparseArray3, sparseArray4, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8871715b7768349519464e91e86972a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8871715b7768349519464e91e86972a");
            return;
        }
        h.b(sparseArray, "completeElementList");
        h.b(sparseArray2, "firstElementList");
        h.b(sparseArray3, "lastElementList");
        h.b(sparseArray4, "extraVisibleElementList");
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        HashMap<T, AttachStatus> hashMap2 = this.statusHashMap;
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        HashMap<T, AttachStatus> hashMap3 = hashMap2;
        HashMap<T, Integer> hashMap4 = this.positionHashMap;
        if (hashMap4 == null) {
            hashMap4 = new HashMap<>();
        }
        HashMap<T, Integer> hashMap5 = hashMap4;
        this.statusHashMap = new HashMap<>();
        this.positionHashMap = new HashMap<>();
        ArrayList<AppearanceDispatchData<T>> arrayList = new ArrayList<>();
        IScreenVisibleExposeEdge iScreenVisibleExposeEdge = this.screenVisibleExposeEdge;
        ArrayList<Rect> screenInvisibleEdge = iScreenVisibleExposeEdge != null ? iScreenVisibleExposeEdge.getScreenInvisibleEdge() : null;
        IScreenVisibleExposeEdge iScreenVisibleExposeEdge2 = this.screenVisibleExposeEdge;
        if (iScreenVisibleExposeEdge2 == null || (rect = iScreenVisibleExposeEdge2.getScreenVisibleEdge()) == null) {
            rect = new Rect();
        }
        Rect rect2 = rect;
        HashMap<T, Integer> hashMap6 = hashMap5;
        diffAndUpdateStatus(screenInvisibleEdge, rect2, sparseArray4, hashMap3, hashMap5, AttachStatus.FULLY_ATTACHED, scrollDirection, arrayList, AttachStatusManager$updateCurrentInScreenElement$1.INSTANCE);
        diffAndUpdateStatus(screenInvisibleEdge, rect2, sparseArray2, hashMap3, hashMap6, AttachStatus.PARTLY_ATTACHED, scrollDirection, arrayList, new AttachStatusManager$updateCurrentInScreenElement$2<>(this, sparseArray4, sparseArray));
        diffAndUpdateStatus(screenInvisibleEdge, rect2, sparseArray, hashMap3, hashMap6, AttachStatus.FULLY_ATTACHED, scrollDirection, arrayList, new AttachStatusManager$updateCurrentInScreenElement$3<>(this, sparseArray4));
        diffAndUpdateStatus(screenInvisibleEdge, rect2, sparseArray3, hashMap3, hashMap6, AttachStatus.PARTLY_ATTACHED, scrollDirection, arrayList, new AttachStatusManager$updateCurrentInScreenElement$4<>(this, sparseArray4, sparseArray, sparseArray2));
        for (AppearanceDispatchData<T> appearanceDispatchData : arrayList) {
            dispatchElementAppearanceEvent(appearanceDispatchData);
        }
        HashMap<T, AttachStatus> hashMap7 = hashMap3;
        if (!hashMap7.isEmpty()) {
            for (Map.Entry<T, AttachStatus> entry : hashMap7.entrySet()) {
                T key = entry.getKey();
                AttachStatus value = entry.getValue();
                if (key != null) {
                    setElementStatus(key, AttachStatus.DETACHED);
                    hashMap = hashMap6;
                    Integer num = hashMap.get(key);
                    if (num == null) {
                        num = -1;
                    }
                    dispatchElementAppearanceEvent(new AppearanceDispatchData<>(num.intValue(), key, value, AttachStatus.DETACHED, scrollDirection, null));
                } else {
                    hashMap = hashMap6;
                }
                hashMap6 = hashMap;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void diffAndUpdateStatus(ArrayList<Rect> arrayList, Rect rect, SparseArray<Pair<T, ViewExtraInfo>> sparseArray, HashMap<T, AttachStatus> hashMap, HashMap<T, Integer> hashMap2, AttachStatus attachStatus, ScrollDirection scrollDirection, ArrayList<AppearanceDispatchData<T>> arrayList2, b<? super Pair<T, ViewExtraInfo>, Boolean> bVar) {
        int i;
        SparseArray<Pair<T, ViewExtraInfo>> sparseArray2 = sparseArray;
        Object[] objArr = {arrayList, rect, sparseArray2, hashMap, hashMap2, attachStatus, scrollDirection, arrayList2, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "792cb5c78c6c946b2e300724f734c035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "792cb5c78c6c946b2e300724f734c035");
            return;
        }
        int size = sparseArray.size();
        int i2 = 0;
        while (i2 < size) {
            Pair<T, ViewExtraInfo> valueAt = sparseArray2.valueAt(i2);
            h.a((Object) valueAt, "element");
            if (bVar.invoke(valueAt).booleanValue()) {
                int keyAt = sparseArray2.keyAt(i2);
                AttachStatus status = getStatus(hashMap, valueAt.first);
                Object obj = valueAt.first;
                Object obj2 = valueAt.second;
                h.a(obj2, "element.second");
                i = size;
                if (!shouldInterceptAppearance(arrayList, rect, scrollDirection, obj, status, attachStatus, (ViewExtraInfo) obj2)) {
                    hashMap2.remove(valueAt.first);
                    hashMap.remove(valueAt.first);
                    AbstractMap abstractMap = this.positionHashMap;
                    h.a((Object) abstractMap, "positionHashMap");
                    ((HashMap<T, Integer>) abstractMap).put(valueAt.first, Integer.valueOf(keyAt));
                    setElementStatus(valueAt.first, attachStatus);
                    if (status != attachStatus) {
                        arrayList2.add(new AppearanceDispatchData<>(keyAt, valueAt.first, status, attachStatus, scrollDirection, (ViewExtraInfo) valueAt.second));
                        i2++;
                        size = i;
                        sparseArray2 = sparseArray;
                    }
                }
            } else {
                i = size;
            }
            i2++;
            size = i;
            sparseArray2 = sparseArray;
        }
    }

    private final void setElementStatus(T t, AttachStatus attachStatus) {
        Object[] objArr = {t, attachStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ae2f1383d0264e149185fb0ea9b5a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ae2f1383d0264e149185fb0ea9b5a1c");
        } else if (attachStatus == AttachStatus.DETACHED) {
            this.statusHashMap.remove(t);
        } else {
            HashMap<T, AttachStatus> hashMap = this.statusHashMap;
            h.a((Object) hashMap, "statusHashMap");
            hashMap.put(t, attachStatus);
        }
    }

    private final void dispatchElementAppearanceEvent(AppearanceDispatchData<T> appearanceDispatchData) {
        ArrayList<ElementStatusEventListener<T>> arrayList;
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6d8ca019d7434edb658aec7a030a75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6d8ca019d7434edb658aec7a030a75c");
        } else if (appearanceDispatchData.oldStatus == appearanceDispatchData.newStatus || (arrayList = this.targetDispatchers) == null) {
        } else {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((ElementStatusEventListener) it.next()).onElementStatusChanged(appearanceDispatchData);
            }
        }
    }

    private final boolean shouldInterceptAppearance(ArrayList<Rect> arrayList, Rect rect, ScrollDirection scrollDirection, T t, AttachStatus attachStatus, AttachStatus attachStatus2, ViewExtraInfo viewExtraInfo) {
        boolean z;
        Object[] objArr = {arrayList, rect, scrollDirection, t, attachStatus, attachStatus2, viewExtraInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa2aed9072da1c52a2e0766b2a5c52aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa2aed9072da1c52a2e0766b2a5c52aa")).booleanValue();
        }
        Iterator<T> it = this.appearanceComputeInterceptorRules.iterator();
        while (true) {
            while (it.hasNext()) {
                z = z || ((Boolean) ((b) it.next()).invoke(new AppearanceComputeInterceptorRulesBean(arrayList, rect, scrollDirection, t, attachStatus, attachStatus2, viewExtraInfo))).booleanValue();
            }
            return z;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dianping/shield/node/adapter/AttachStatusManager$Action;", "", "(Ljava/lang/String;I)V", "ACT_STARTING", "ACT_START", "ACT_PAUSE", "ACT_RESUME", "ACT_STOP", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum Action {
        ACT_STARTING,
        ACT_START,
        ACT_PAUSE,
        ACT_RESUME,
        ACT_STOP;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static Action valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (Action) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "397af7f250d51bbc59f7c2b2e7655858", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "397af7f250d51bbc59f7c2b2e7655858") : Enum.valueOf(Action.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Action[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (Action[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86e4789d08505bf5089cf9ea42f9d5e4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86e4789d08505bf5089cf9ea42f9d5e4") : values().clone());
        }

        Action() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb2f11bb017074c319b4579dbad1bb0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb2f11bb017074c319b4579dbad1bb0c");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/adapter/AttachStatusManager$State;", "", "(Ljava/lang/String;I)V", "OPENING", "OPEN", "PAUSE", "CLOSE", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum State {
        OPENING,
        OPEN,
        PAUSE,
        CLOSE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static State valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (State) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "026de85d3660000133798d5230f01f1a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "026de85d3660000133798d5230f01f1a") : Enum.valueOf(State.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static State[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (State[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13dd1f328dfe2377e4b5a188ac50c832", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13dd1f328dfe2377e4b5a188ac50c832") : values().clone());
        }

        State() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2df275ab7e0627a46c537844a4dc58e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2df275ab7e0627a46c537844a4dc58e");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BQ\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00028\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u001c\u0010\n\u001a\u00028\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/dianping/shield/node/adapter/AttachStatusManager$AppearanceComputeInterceptorRulesBean;", "T", "", "screenInvisibleEdge", "Ljava/util/ArrayList;", "Landroid/graphics/Rect;", "Lkotlin/collections/ArrayList;", "screenVisibleEdge", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "element", "oldStatus", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "newStatus", "viewExtraInfo", "Lcom/dianping/shield/entity/ViewExtraInfo;", "(Ljava/util/ArrayList;Landroid/graphics/Rect;Lcom/dianping/shield/entity/ScrollDirection;Ljava/lang/Object;Lcom/dianping/shield/node/cellnode/AttachStatus;Lcom/dianping/shield/node/cellnode/AttachStatus;Lcom/dianping/shield/entity/ViewExtraInfo;)V", "getElement", "()Ljava/lang/Object;", "setElement", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getNewStatus", "()Lcom/dianping/shield/node/cellnode/AttachStatus;", "setNewStatus", "(Lcom/dianping/shield/node/cellnode/AttachStatus;)V", "getOldStatus", "setOldStatus", "getScreenInvisibleEdge", "()Ljava/util/ArrayList;", "setScreenInvisibleEdge", "(Ljava/util/ArrayList;)V", "getScreenVisibleEdge", "()Landroid/graphics/Rect;", "setScreenVisibleEdge", "(Landroid/graphics/Rect;)V", "getScrollDirection", "()Lcom/dianping/shield/entity/ScrollDirection;", "setScrollDirection", "(Lcom/dianping/shield/entity/ScrollDirection;)V", "getViewExtraInfo", "()Lcom/dianping/shield/entity/ViewExtraInfo;", "setViewExtraInfo", "(Lcom/dianping/shield/entity/ViewExtraInfo;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class AppearanceComputeInterceptorRulesBean<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private T element;
        @NotNull
        private AttachStatus newStatus;
        @NotNull
        private AttachStatus oldStatus;
        @Nullable
        private ArrayList<Rect> screenInvisibleEdge;
        @NotNull
        private Rect screenVisibleEdge;
        @NotNull
        private ScrollDirection scrollDirection;
        @NotNull
        private ViewExtraInfo viewExtraInfo;

        public AppearanceComputeInterceptorRulesBean(@Nullable ArrayList<Rect> arrayList, @NotNull Rect rect, @NotNull ScrollDirection scrollDirection, T t, @NotNull AttachStatus attachStatus, @NotNull AttachStatus attachStatus2, @NotNull ViewExtraInfo viewExtraInfo) {
            h.b(rect, "screenVisibleEdge");
            h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
            h.b(attachStatus, "oldStatus");
            h.b(attachStatus2, "newStatus");
            h.b(viewExtraInfo, "viewExtraInfo");
            Object[] objArr = {arrayList, rect, scrollDirection, t, attachStatus, attachStatus2, viewExtraInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "704f578bb58c4f92f63c228dfb202c48", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "704f578bb58c4f92f63c228dfb202c48");
                return;
            }
            this.screenInvisibleEdge = arrayList;
            this.screenVisibleEdge = rect;
            this.scrollDirection = scrollDirection;
            this.element = t;
            this.oldStatus = attachStatus;
            this.newStatus = attachStatus2;
            this.viewExtraInfo = viewExtraInfo;
        }

        @Nullable
        public final ArrayList<Rect> getScreenInvisibleEdge() {
            return this.screenInvisibleEdge;
        }

        @NotNull
        public final Rect getScreenVisibleEdge() {
            return this.screenVisibleEdge;
        }

        public final void setScreenInvisibleEdge(@Nullable ArrayList<Rect> arrayList) {
            this.screenInvisibleEdge = arrayList;
        }

        public final void setScreenVisibleEdge(@NotNull Rect rect) {
            Object[] objArr = {rect};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fdef4cd5958645f052b8122cfd99ee1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fdef4cd5958645f052b8122cfd99ee1");
                return;
            }
            h.b(rect, "<set-?>");
            this.screenVisibleEdge = rect;
        }

        public final T getElement() {
            return this.element;
        }

        @NotNull
        public final AttachStatus getOldStatus() {
            return this.oldStatus;
        }

        @NotNull
        public final ScrollDirection getScrollDirection() {
            return this.scrollDirection;
        }

        public final void setElement(T t) {
            this.element = t;
        }

        public final void setOldStatus(@NotNull AttachStatus attachStatus) {
            Object[] objArr = {attachStatus};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "579a5639657d82a5324cc77cc5576717", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "579a5639657d82a5324cc77cc5576717");
                return;
            }
            h.b(attachStatus, "<set-?>");
            this.oldStatus = attachStatus;
        }

        public final void setScrollDirection(@NotNull ScrollDirection scrollDirection) {
            Object[] objArr = {scrollDirection};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d85ca9608b155ec66e33647fdf38535", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d85ca9608b155ec66e33647fdf38535");
                return;
            }
            h.b(scrollDirection, "<set-?>");
            this.scrollDirection = scrollDirection;
        }

        @NotNull
        public final AttachStatus getNewStatus() {
            return this.newStatus;
        }

        @NotNull
        public final ViewExtraInfo getViewExtraInfo() {
            return this.viewExtraInfo;
        }

        public final void setNewStatus(@NotNull AttachStatus attachStatus) {
            Object[] objArr = {attachStatus};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef85e882a2daa7c0ba1ab1412217b929", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef85e882a2daa7c0ba1ab1412217b929");
                return;
            }
            h.b(attachStatus, "<set-?>");
            this.newStatus = attachStatus;
        }

        public final void setViewExtraInfo(@NotNull ViewExtraInfo viewExtraInfo) {
            Object[] objArr = {viewExtraInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "924f1a27cb85d0101b80d11f8c2d3e9f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "924f1a27cb85d0101b80d11f8c2d3e9f");
                return;
            }
            h.b(viewExtraInfo, "<set-?>");
            this.viewExtraInfo = viewExtraInfo;
        }
    }

    public final <T> boolean containElement$shieldCore_release(@NotNull SparseArray<T> sparseArray, T t, @NotNull c<? super T, ? super T, Boolean> cVar) {
        h.b(sparseArray, "receiver$0");
        h.b(cVar, "checkFun");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (cVar.invoke(t, sparseArray.valueAt(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82703ad2e4954b36e5bf70945261839c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82703ad2e4954b36e5bf70945261839c");
            return;
        }
        super.shieldRecycle();
        this.adapterPositionInfo = null;
        this.elementList = null;
        this.currentState = State.CLOSE;
        this.needLoadStore = true;
        this.needUpdateStatus = true;
        ArrayList<ElementStatusEventListener<T>> arrayList = this.targetDispatchers;
        if (arrayList != null) {
            arrayList.clear();
        }
        SparseArray<Pair<T, ViewExtraInfo>> sparseArray = this.extraVisibleElementList;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }
}
