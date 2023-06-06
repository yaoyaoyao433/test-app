package com.dianping.shield.prefetch;

import android.util.SparseArray;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.ElementList;
import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\b\u0010\u0015\u001a\u00020\u0013H\u0016J¦\u0001\u0010\u0016\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a`\u001b2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0019j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t`\u001b2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\"\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!`\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0#H\u0002J\u0016\u0010%\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0002J\u0017\u0010'\u001a\u0004\u0018\u00018\u00002\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0002\u0010)J \u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00172\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010,H\u0002J9\u0010-\u001a\u00020\u001a2\"\u0010.\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J0\u00102\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\r2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u0002040\u000bj\b\u0012\u0004\u0012\u000204`\rH\u0002J\u0014\u00105\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u001d\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00028\u00002\u0006\u00108\u001a\u00020\u001aH\u0002¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\tJ\b\u0010<\u001a\u00020\u0013H\u0016JH\u0010=\u001a\u00020\u00132\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\n\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006B"}, d2 = {"Lcom/dianping/shield/prefetch/AttachStatusWithPrefetchManager;", "T", "Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor;", "viewLocationRectInterface", "Lcom/dianping/shield/node/adapter/status/ViewLocationRectInterface;", "(Lcom/dianping/shield/node/adapter/status/ViewLocationRectInterface;)V", "elementList", "Lcom/dianping/shield/node/adapter/status/ElementList;", "prefetchCount", "", "targetDispatchers", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", "Lkotlin/collections/ArrayList;", "getTargetDispatchers", "()Ljava/util/ArrayList;", "targetDispatchers$delegate", "Lkotlin/Lazy;", "addTargetDispatcher", "", "listener", KNBConfig.CONFIG_CLEAR_CACHE, "diffAndUpdateStatus", "Landroid/util/SparseArray;", "oldStatusMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "Lkotlin/collections/HashMap;", "oldPositionMap", "newStatus", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "changedElement", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "checkFun", "Lkotlin/Function1;", "", "dispatchElementAppearanceEvent", "dispatchData", "getDisplayElement", "position", "(I)Ljava/lang/Object;", "getDisplayElementList", "positionList", "", "getStatus", "map", "element", "(Ljava/util/HashMap;Ljava/lang/Object;)Lcom/dianping/shield/node/cellnode/AttachStatus;", "onViewLocationChanged", "parsePositionInfo", "infoList", "Lcom/dianping/shield/entity/ViewExtraInfo;", "setElementList", "setElementStatus", "displayElement", "status", "(Ljava/lang/Object;Lcom/dianping/shield/node/cellnode/AttachStatus;)V", "setExtraPrefetchCount", "count", "shieldRecycle", "updateCurrentInScreenElement", "completeInScreenElementList", "firstElementList", "lastElementList", "prefetchElementList", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AttachStatusWithPrefetchManager<T> extends ViewLocationChangeProcessor<T> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(AttachStatusWithPrefetchManager.class), "targetDispatchers", "getTargetDispatchers()Ljava/util/ArrayList;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private ElementList<T> elementList;
    private int prefetchCount;
    private final d targetDispatchers$delegate;

    private final ArrayList<ElementStatusEventListener<T>> getTargetDispatchers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ArrayList) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa7d639aee3896e708479f77b387b390", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa7d639aee3896e708479f77b387b390") : this.targetDispatchers$delegate.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachStatusWithPrefetchManager(@NotNull ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        h.b(viewLocationRectInterface, "viewLocationRectInterface");
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e36ddf314ce01e8d89cd848dd9443f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e36ddf314ce01e8d89cd848dd9443f");
        } else {
            this.targetDispatchers$delegate = e.a(kotlin.i.NONE, AttachStatusWithPrefetchManager$targetDispatchers$2.INSTANCE);
        }
    }

    public final void setElementList(@NotNull ElementList<T> elementList) {
        Object[] objArr = {elementList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e36d603c544b51a5e3474d1eaddeb1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e36d603c544b51a5e3474d1eaddeb1f");
            return;
        }
        h.b(elementList, "elementList");
        this.elementList = elementList;
    }

    public final void addTargetDispatcher(@NotNull ElementStatusEventListener<T> elementStatusEventListener) {
        Object[] objArr = {elementStatusEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b90082a5ccb94c16ac015c858a78552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b90082a5ccb94c16ac015c858a78552");
            return;
        }
        h.b(elementStatusEventListener, "listener");
        getTargetDispatchers().add(elementStatusEventListener);
    }

    public final void setExtraPrefetchCount(int i) {
        this.prefetchCount = i;
    }

    private final ArrayList<Integer> parsePositionInfo(ArrayList<ViewExtraInfo> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d021ff56f7c6d6f9b703f91fac19bb50", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d021ff56f7c6d6f9b703f91fac19bb50");
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (ViewExtraInfo viewExtraInfo : arrayList) {
            if (viewExtraInfo.offsetPos >= 0) {
                arrayList2.add(Integer.valueOf(viewExtraInfo.offsetPos));
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
        if (r0 == null) goto L45;
     */
    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewLocationChanged(@org.jetbrains.annotations.NotNull com.dianping.shield.entity.ScrollDirection r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.prefetch.AttachStatusWithPrefetchManager.onViewLocationChanged(com.dianping.shield.entity.ScrollDirection):void");
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4d88e3ebff0dd2b40f22421d356989a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4d88e3ebff0dd2b40f22421d356989a");
            return;
        }
        this.statusHashMap.clear();
        this.positionHashMap.clear();
    }

    private final AttachStatus getStatus(HashMap<T, AttachStatus> hashMap, T t) {
        Object[] objArr = {hashMap, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59eacd402675953d910334e0a1c3cd53", RobustBitConfig.DEFAULT_VALUE)) {
            return (AttachStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59eacd402675953d910334e0a1c3cd53");
        }
        AttachStatus attachStatus = hashMap.get(t);
        return attachStatus == null ? AttachStatus.DETACHED : attachStatus;
    }

    private final T getDisplayElement(int i) {
        ElementList<T> elementList;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "515149f6c20d3d0dfda103be2e086ef9", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "515149f6c20d3d0dfda103be2e086ef9");
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

    private final SparseArray<T> getDisplayElementList(List<Integer> list) {
        T displayElement;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce69e971ba63a4ec2ed1c1a7e7795b16", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce69e971ba63a4ec2ed1c1a7e7795b16");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int intValue = list.get(i).intValue();
            if (intValue >= 0 && (displayElement = getDisplayElement(intValue)) != null) {
                sparseArray.put(intValue, displayElement);
            }
        }
        return sparseArray;
    }

    private final void updateCurrentInScreenElement(SparseArray<T> sparseArray, SparseArray<T> sparseArray2, SparseArray<T> sparseArray3, SparseArray<T> sparseArray4, ScrollDirection scrollDirection) {
        Object[] objArr = {sparseArray, sparseArray2, sparseArray3, sparseArray4, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40205fdda03b7abc6edcb2e9e381c8b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40205fdda03b7abc6edcb2e9e381c8b8");
            return;
        }
        HashMap<T, AttachStatus> hashMap = this.statusHashMap;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        HashMap<T, AttachStatus> hashMap2 = hashMap;
        HashMap<T, Integer> hashMap3 = this.positionHashMap;
        if (hashMap3 == null) {
            hashMap3 = new HashMap<>();
        }
        HashMap<T, Integer> hashMap4 = hashMap3;
        this.statusHashMap = new HashMap<>();
        this.positionHashMap = new HashMap<>();
        ArrayList<AppearanceDispatchData<T>> arrayList = new ArrayList<>();
        diffAndUpdateStatus(sparseArray2, hashMap2, hashMap4, AttachStatus.PARTLY_ATTACHED, scrollDirection, arrayList, new AttachStatusWithPrefetchManager$updateCurrentInScreenElement$1<>(sparseArray));
        diffAndUpdateStatus(sparseArray, hashMap2, hashMap4, AttachStatus.FULLY_ATTACHED, scrollDirection, arrayList, AttachStatusWithPrefetchManager$updateCurrentInScreenElement$2.INSTANCE);
        diffAndUpdateStatus(sparseArray3, hashMap2, hashMap4, AttachStatus.PARTLY_ATTACHED, scrollDirection, arrayList, new AttachStatusWithPrefetchManager$updateCurrentInScreenElement$3<>(sparseArray));
        diffAndUpdateStatus(sparseArray4, hashMap2, hashMap4, AttachStatus.PREFETCH, scrollDirection, arrayList, AttachStatusWithPrefetchManager$updateCurrentInScreenElement$4.INSTANCE);
        HashMap<T, AttachStatus> hashMap5 = hashMap2;
        if (!hashMap5.isEmpty()) {
            for (Map.Entry<T, AttachStatus> entry : hashMap5.entrySet()) {
                T key = entry.getKey();
                AttachStatus value = entry.getValue();
                if (key != null) {
                    setElementStatus(key, AttachStatus.DETACHED);
                    Integer num = hashMap4.get(key);
                    if (num == null) {
                        num = -1;
                    }
                    dispatchElementAppearanceEvent(new AppearanceDispatchData<>(num.intValue(), key, value, AttachStatus.DETACHED, scrollDirection, null));
                }
            }
        }
        for (AppearanceDispatchData<T> appearanceDispatchData : arrayList) {
            dispatchElementAppearanceEvent(appearanceDispatchData);
        }
    }

    private final void diffAndUpdateStatus(SparseArray<T> sparseArray, HashMap<T, AttachStatus> hashMap, HashMap<T, Integer> hashMap2, AttachStatus attachStatus, ScrollDirection scrollDirection, ArrayList<AppearanceDispatchData<T>> arrayList, b<? super T, Boolean> bVar) {
        Object[] objArr = {sparseArray, hashMap, hashMap2, attachStatus, scrollDirection, arrayList, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3424b23f472e4d0aaa6abecc122d5763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3424b23f472e4d0aaa6abecc122d5763");
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            T valueAt = sparseArray.valueAt(i);
            if (bVar.invoke(valueAt).booleanValue()) {
                int keyAt = sparseArray.keyAt(i);
                AttachStatus status = getStatus(hashMap, valueAt);
                hashMap2.remove(valueAt);
                hashMap.remove(valueAt);
                HashMap<T, Integer> hashMap3 = this.positionHashMap;
                h.a((Object) hashMap3, "positionHashMap");
                hashMap3.put(valueAt, Integer.valueOf(keyAt));
                setElementStatus(valueAt, attachStatus);
                if (status != attachStatus) {
                    arrayList.add(new AppearanceDispatchData<>(keyAt, valueAt, status, attachStatus, scrollDirection, null));
                }
            }
        }
    }

    private final void setElementStatus(T t, AttachStatus attachStatus) {
        Object[] objArr = {t, attachStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e1c632e0534bcebf91c12aaf6201847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e1c632e0534bcebf91c12aaf6201847");
        } else if (attachStatus == AttachStatus.DETACHED) {
            this.statusHashMap.remove(t);
        } else {
            HashMap<T, AttachStatus> hashMap = this.statusHashMap;
            h.a((Object) hashMap, "statusHashMap");
            hashMap.put(t, attachStatus);
        }
    }

    private final void dispatchElementAppearanceEvent(AppearanceDispatchData<T> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee8ca299ef8d42d03ff624dc6e958107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee8ca299ef8d42d03ff624dc6e958107");
        } else if (appearanceDispatchData.oldStatus == appearanceDispatchData.newStatus) {
        } else {
            Iterator<T> it = getTargetDispatchers().iterator();
            while (it.hasNext()) {
                ((ElementStatusEventListener) it.next()).onElementStatusChanged(appearanceDispatchData);
            }
        }
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor, com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4b2b59bfd71aabb72018fe2c729ab1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4b2b59bfd71aabb72018fe2c729ab1d");
            return;
        }
        super.shieldRecycle();
        this.elementList = null;
    }
}
