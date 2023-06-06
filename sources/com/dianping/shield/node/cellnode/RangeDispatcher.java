package com.dianping.shield.node.cellnode;

import com.dianping.shield.utils.ObservableArrayList;
import com.dianping.shield.utils.ObservableList;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002:\u000201B+\u0012$\b\u0002\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u0004j\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\tJ\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tJ\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0011H\u0016J>\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0(2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t2\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010,2\u0006\u0010.\u001a\u00020/H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0004j\b\u0012\u0004\u0012\u00020\u0011`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u00062"}, d2 = {"Lcom/dianping/shield/node/cellnode/RangeDispatcher;", "Lcom/dianping/shield/utils/ObservableArrayList;", "Lcom/dianping/shield/node/cellnode/RangeHolder;", "preCallbacks", "Ljava/util/ArrayList;", "Lcom/dianping/shield/utils/ObservableList$OnListChangedCallback;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "backupRange", "", "getBackupRange", "()I", "setBackupRange", "(I)V", "childRangeObserver", "Lcom/dianping/shield/node/cellnode/RangeDispatcher$ChildRangeObserver;", "rangeChangedObservers", "Lcom/dianping/shield/node/cellnode/RangeChangeObserver;", "startPositionList", "Lcom/dianping/shield/utils/RangeRemoveableArrayList;", "totalRange", "getTotalRange", "setTotalRange", "adjustChildRange", "", "positionStart", "getInnerPosition", "Lcom/dianping/shield/node/cellnode/RangeDispatcher$RangeInfo;", "position", "getOldRange", "getRange", "getStartPosition", "range", "index", "registerObserver", "observer", "toString", "", "unregisterObserver", "updateChildObserver", "Lkotlin/Pair;", "fromPosition", "itemCount", "oldItems", "", "", "isRemoveAction", "", "ChildRangeObserver", "RangeInfo", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RangeDispatcher extends ObservableArrayList<RangeHolder> implements RangeHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int backupRange;
    private final ChildRangeObserver childRangeObserver;
    private final ArrayList<RangeChangeObserver> rangeChangedObservers;
    private final RangeRemoveableArrayList<Integer> startPositionList;
    private int totalRange;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/dianping/shield/node/cellnode/RangeDispatcher$RangeInfo;", "", "()V", "index", "", "innerIndex", "obj", "Lcom/dianping/shield/node/cellnode/RangeHolder;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class RangeInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @JvmField
        public int index = -1;
        @JvmField
        public int innerIndex = -1;
        @JvmField
        @Nullable
        public RangeHolder obj;
    }

    public RangeDispatcher() {
        this(null, 1, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9ccfdc5e8d005f7d7d6340dae7b85bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9ccfdc5e8d005f7d7d6340dae7b85bd");
        }
    }

    public RangeDispatcher(@Nullable ArrayList<ObservableList.OnListChangedCallback<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "563c4c33795bd1f8230949216f85c792", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "563c4c33795bd1f8230949216f85c792");
            return;
        }
        this.rangeChangedObservers = new ArrayList<>();
        this.startPositionList = new RangeRemoveableArrayList<>();
        this.childRangeObserver = new ChildRangeObserver();
        this.backupRange = -1;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                addOnListChangedCallback((ObservableList.OnListChangedCallback) it.next());
            }
        }
        addOnListChangedCallback(new ObservableList.OnListChangedCallback<ObservableArrayList<RangeHolder>>() { // from class: com.dianping.shield.node.cellnode.RangeDispatcher.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
            public final void onChanged(@NotNull ObservableArrayList<RangeHolder> observableArrayList) {
                Object[] objArr2 = {observableArrayList};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7eeee3acce5f35058bef9b7900104230", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7eeee3acce5f35058bef9b7900104230");
                } else {
                    h.b(observableArrayList, "sender");
                }
            }

            @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
            public final void onItemRangeMoved(@NotNull ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, int i3) {
                Object[] objArr2 = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0aa152a8d0d8c508130ffee245dd6b3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0aa152a8d0d8c508130ffee245dd6b3e");
                } else {
                    h.b(observableArrayList, "sender");
                }
            }

            @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
            public final /* bridge */ /* synthetic */ void onItemRangeChanged(ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, List list) {
                onItemRangeChanged2(observableArrayList, i, i2, (List<Object>) list);
            }

            @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
            public final /* bridge */ /* synthetic */ void onItemRangeRemoved(ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, List list) {
                onItemRangeRemoved2(observableArrayList, i, i2, (List<Object>) list);
            }

            @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
            public final /* bridge */ /* synthetic */ void onItemRangeReplaced(ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, int i3, List list) {
                onItemRangeReplaced2(observableArrayList, i, i2, i3, (List<Object>) list);
            }

            /* renamed from: onItemRangeChanged  reason: avoid collision after fix types in other method */
            public final void onItemRangeChanged2(@NotNull ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, @Nullable List<Object> list) {
                Object[] objArr2 = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), list};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "76d97a4c914adb2ce8c02058dded1f17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "76d97a4c914adb2ce8c02058dded1f17");
                    return;
                }
                h.b(observableArrayList, "sender");
                RangeDispatcher.this.adjustChildRange(i);
                int startPosition = RangeDispatcher.this.getStartPosition(i);
                if (startPosition >= 0) {
                    k updateChildObserver = RangeDispatcher.this.updateChildObserver(i, i2, list, false);
                    for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                        rangeChangeObserver.onItemRangeChanged(RangeDispatcher.this, startPosition, ((Number) updateChildObserver.a).intValue());
                    }
                }
            }

            @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
            public final void onItemRangeInserted(@NotNull ObservableArrayList<RangeHolder> observableArrayList, int i, int i2) {
                Object[] objArr2 = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55de198ae7f61d1fa49e369f6a992e28", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55de198ae7f61d1fa49e369f6a992e28");
                    return;
                }
                h.b(observableArrayList, "sender");
                RangeDispatcher.this.adjustChildRange(i);
                int startPosition = RangeDispatcher.this.getStartPosition(i);
                if (startPosition >= 0) {
                    k updateChildObserver = RangeDispatcher.this.updateChildObserver(i, i2, null, false);
                    for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                        rangeChangeObserver.onItemRangeInserted(RangeDispatcher.this, startPosition, ((Number) updateChildObserver.a).intValue());
                    }
                }
            }

            /* renamed from: onItemRangeRemoved  reason: avoid collision after fix types in other method */
            public final void onItemRangeRemoved2(@NotNull ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, @Nullable List<Object> list) {
                Object[] objArr2 = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), list};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7b1cb05ef9836b2890379fa7f3b8823", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7b1cb05ef9836b2890379fa7f3b8823");
                    return;
                }
                h.b(observableArrayList, "sender");
                int startPosition = RangeDispatcher.this.getStartPosition(i);
                int totalRange = RangeDispatcher.this.getTotalRange();
                RangeDispatcher.this.adjustChildRange(i);
                int totalRange2 = totalRange - RangeDispatcher.this.getTotalRange();
                RangeDispatcher.this.updateChildObserver(i, i2, list, true);
                if (startPosition >= 0) {
                    for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                        rangeChangeObserver.onItemRangeRemoved(RangeDispatcher.this, startPosition, totalRange2);
                    }
                }
            }

            /* renamed from: onItemRangeReplaced  reason: avoid collision after fix types in other method */
            public final void onItemRangeReplaced2(@NotNull ObservableArrayList<RangeHolder> observableArrayList, int i, int i2, int i3, @Nullable List<Object> list) {
                int startPosition;
                Object[] objArr2 = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "488d52644081451c0a664a036df8c528", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "488d52644081451c0a664a036df8c528");
                    return;
                }
                h.b(observableArrayList, "sender");
                if (list != null && list.isEmpty()) {
                    RangeDispatcher.this.adjustChildRange(i);
                    startPosition = RangeDispatcher.this.getStartPosition(i);
                } else {
                    startPosition = RangeDispatcher.this.getStartPosition(i);
                    RangeDispatcher.this.adjustChildRange(i);
                }
                k updateChildObserver = RangeDispatcher.this.updateChildObserver(i, i2, list, false);
                if (startPosition >= 0) {
                    for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                        rangeChangeObserver.onItemRangeReplaced(RangeDispatcher.this, startPosition, ((Number) updateChildObserver.a).intValue(), ((Number) updateChildObserver.b).intValue());
                    }
                }
            }
        });
    }

    public /* synthetic */ RangeDispatcher(ArrayList arrayList, int i, f fVar) {
        this((i & 1) != 0 ? null : arrayList);
    }

    public final boolean contains(RangeHolder rangeHolder) {
        Object[] objArr = {rangeHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "904108872fc810e09ea273f6d4b7e64a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "904108872fc810e09ea273f6d4b7e64a")).booleanValue() : super.contains((Object) rangeHolder);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c94e8760c80068de0d03b2229ccb6211", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c94e8760c80068de0d03b2229ccb6211")).booleanValue();
        }
        if (obj != null ? obj instanceof RangeHolder : true) {
            return contains((RangeHolder) obj);
        }
        return false;
    }

    public final int getSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f420cb1faaab39f4ef9c9b49b58bb08e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f420cb1faaab39f4ef9c9b49b58bb08e")).intValue() : super.size();
    }

    public final int indexOf(RangeHolder rangeHolder) {
        Object[] objArr = {rangeHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e34fe3639d62d6e233f58243332698b7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e34fe3639d62d6e233f58243332698b7")).intValue() : super.indexOf((Object) rangeHolder);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1911cbd42fd60be8db8d91708457f14f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1911cbd42fd60be8db8d91708457f14f")).intValue();
        }
        if (obj != null ? obj instanceof RangeHolder : true) {
            return indexOf((RangeHolder) obj);
        }
        return -1;
    }

    public final int lastIndexOf(RangeHolder rangeHolder) {
        Object[] objArr = {rangeHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d009988fae08516a7ade0de38a3eb2d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d009988fae08516a7ade0de38a3eb2d")).intValue() : super.lastIndexOf((Object) rangeHolder);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8c034a8df441f9394c012178f15e1e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8c034a8df441f9394c012178f15e1e4")).intValue();
        }
        if (obj != null ? obj instanceof RangeHolder : true) {
            return lastIndexOf((RangeHolder) obj);
        }
        return -1;
    }

    @Override // com.dianping.shield.utils.ObservableArrayList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final RangeHolder remove(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee06104cfa0a1274eb40144eb3a6446a", RobustBitConfig.DEFAULT_VALUE) ? (RangeHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee06104cfa0a1274eb40144eb3a6446a") : removeAt(i);
    }

    public final boolean remove(RangeHolder rangeHolder) {
        Object[] objArr = {rangeHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69da2eaeffac061f07ba8959f2cc00c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69da2eaeffac061f07ba8959f2cc00c7")).booleanValue() : super.remove((Object) rangeHolder);
    }

    @Override // com.dianping.shield.utils.ObservableArrayList, java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de1a398e354041553763f7d41ff52a0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de1a398e354041553763f7d41ff52a0f")).booleanValue();
        }
        if (obj != null ? obj instanceof RangeHolder : true) {
            return remove((RangeHolder) obj);
        }
        return false;
    }

    public final RangeHolder removeAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdb540783a7553685b6b95b8757cf17c", RobustBitConfig.DEFAULT_VALUE) ? (RangeHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdb540783a7553685b6b95b8757cf17c") : (RangeHolder) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf0ac985629c664280c16561b45ce742", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf0ac985629c664280c16561b45ce742")).intValue() : getSize();
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final int getOldRange() {
        return this.backupRange;
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final int getRange() {
        return this.totalRange;
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final void registerObserver(@NotNull RangeChangeObserver rangeChangeObserver) {
        Object[] objArr = {rangeChangeObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff224a50996838ce982d81305c5ac39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff224a50996838ce982d81305c5ac39d");
            return;
        }
        h.b(rangeChangeObserver, "observer");
        this.rangeChangedObservers.add(rangeChangeObserver);
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final void unregisterObserver(@NotNull RangeChangeObserver rangeChangeObserver) {
        Object[] objArr = {rangeChangeObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdb93b2d91e609ada4bddc185b3c4faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdb93b2d91e609ada4bddc185b3c4faa");
            return;
        }
        h.b(rangeChangeObserver, "observer");
        this.rangeChangedObservers.remove(rangeChangeObserver);
    }

    public final int getTotalRange() {
        return this.totalRange;
    }

    public final void setTotalRange(int i) {
        this.totalRange = i;
    }

    public final int getBackupRange() {
        return this.backupRange;
    }

    public final void setBackupRange(int i) {
        this.backupRange = i;
    }

    @Nullable
    public final RangeInfo getInnerPosition(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb829f8a735ee7117f41e44151ced095", RobustBitConfig.DEFAULT_VALUE)) {
            return (RangeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb829f8a735ee7117f41e44151ced095");
        }
        if (i < 0 || i >= this.totalRange) {
            return null;
        }
        int a = kotlin.collections.h.a((List) this);
        while (i2 < a) {
            int i3 = i2 + 1;
            Integer num = this.startPositionList.get(i3);
            h.a((Object) num, "nextStartPosition");
            if (h.a(i, num.intValue()) < 0) {
                Integer num2 = this.startPositionList.get(i2);
                RangeInfo rangeInfo = new RangeInfo();
                rangeInfo.obj = (RangeHolder) get(i2);
                rangeInfo.index = i2;
                h.a((Object) num2, "start");
                rangeInfo.innerIndex = i - num2.intValue();
                return rangeInfo;
            }
            i2 = i3;
        }
        if (i < this.totalRange) {
            Integer num3 = this.startPositionList.get(kotlin.collections.h.a((List) this));
            RangeInfo rangeInfo2 = new RangeInfo();
            rangeInfo2.obj = (RangeHolder) get(kotlin.collections.h.a((List) this));
            rangeInfo2.index = kotlin.collections.h.a((List) this);
            h.a((Object) num3, "lastStart");
            rangeInfo2.innerIndex = i - num3.intValue();
            return rangeInfo2;
        }
        return null;
    }

    public final int getStartPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e3090c071c3320ed53c926a517c8d51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e3090c071c3320ed53c926a517c8d51")).intValue();
        }
        Integer num = (Integer) kotlin.collections.h.a((List<? extends Object>) this.startPositionList, i);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final int getStartPosition(@NotNull RangeHolder rangeHolder) {
        Object[] objArr = {rangeHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "590060704f5da58c567dcb6c3778d979", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "590060704f5da58c567dcb6c3778d979")).intValue();
        }
        h.b(rangeHolder, "range");
        return getStartPosition(indexOf((Object) rangeHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k<Integer, Integer> updateChildObserver(int i, int i2, List<Object> list, boolean z) {
        int i3;
        int i4;
        int range;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "242a014374538999d9471a519e56de33", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "242a014374538999d9471a519e56de33");
        }
        if (list != null) {
            i3 = 0;
            for (Object obj : list) {
                if (obj instanceof RangeHolder) {
                    RangeHolder rangeHolder = (RangeHolder) obj;
                    if (rangeHolder.getOldRange() >= 0 && rangeHolder.getOldRange() != rangeHolder.getRange() && contains(obj)) {
                        range = rangeHolder.getOldRange();
                    } else {
                        range = rangeHolder.getRange();
                    }
                    i3 += range;
                    rangeHolder.unregisterObserver(this.childRangeObserver);
                }
            }
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = 0;
        } else {
            int i5 = i2 + i;
            i4 = 0;
            while (i < i5) {
                RangeHolder rangeHolder2 = (RangeHolder) get(i);
                i4 += rangeHolder2 != null ? rangeHolder2.getRange() : 0;
                rangeHolder2.registerObserver(this.childRangeObserver);
                i++;
            }
        }
        return new k<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustChildRange(int i) {
        int i2;
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72fad1922a6ff015be26a1d0433704a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72fad1922a6ff015be26a1d0433704a4");
        } else if (i > kotlin.collections.h.a((List) this)) {
            RangeRemoveableArrayList<Integer> rangeRemoveableArrayList = this.startPositionList;
            rangeRemoveableArrayList.removeRange(i, rangeRemoveableArrayList.size());
            if (i > 0) {
                int i4 = i - 1;
                i3 = this.startPositionList.get(i4).intValue() + ((RangeHolder) get(i4)).getRange();
            }
            this.totalRange = i3;
        } else {
            if (i > 0) {
                int i5 = i - 1;
                i2 = this.startPositionList.get(i5).intValue() + ((RangeHolder) get(i5)).getRange();
            } else {
                i2 = 0;
            }
            int size = size();
            while (i < size) {
                RangeHolder rangeHolder = (RangeHolder) get(i);
                int range = rangeHolder != null ? rangeHolder.getRange() : 0;
                if (i < this.startPositionList.size()) {
                    this.startPositionList.set(i, Integer.valueOf(i2));
                } else {
                    this.startPositionList.add(Integer.valueOf(i2));
                }
                i2 += range;
                i++;
            }
            if (this.startPositionList.size() > size()) {
                this.startPositionList.removeRange(size(), this.startPositionList.size());
            }
            this.totalRange = i2;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/node/cellnode/RangeDispatcher$ChildRangeObserver;", "Lcom/dianping/shield/node/cellnode/RangeChangeObserver;", "(Lcom/dianping/shield/node/cellnode/RangeDispatcher;)V", "onChanged", "", "sender", "Lcom/dianping/shield/node/cellnode/RangeHolder;", "onItemRangeChanged", "positionStart", "", "itemCount", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "onItemRangeReplaced", "newItemCount", "oldItemCount", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class ChildRangeObserver implements RangeChangeObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeMoved(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b493d297835307bcfaa3839ce57edd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b493d297835307bcfaa3839ce57edd9");
            } else {
                h.b(rangeHolder, "sender");
            }
        }

        public ChildRangeObserver() {
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onChanged(@NotNull RangeHolder rangeHolder) {
            Object[] objArr = {rangeHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "075821323b52b0e1fd2a52909f6b970d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "075821323b52b0e1fd2a52909f6b970d");
                return;
            }
            h.b(rangeHolder, "sender");
            RangeDispatcher.this.adjustChildRange(RangeDispatcher.this.indexOf((Object) rangeHolder));
            for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                rangeChangeObserver.onChanged(RangeDispatcher.this);
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeChanged(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e1cc900e5898c1e4af9a91eaf2d5977", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e1cc900e5898c1e4af9a91eaf2d5977");
                return;
            }
            h.b(rangeHolder, "sender");
            int startPosition = RangeDispatcher.this.getStartPosition(rangeHolder) + i;
            RangeDispatcher.this.adjustChildRange(RangeDispatcher.this.indexOf((Object) rangeHolder));
            if (startPosition >= 0) {
                for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                    rangeChangeObserver.onItemRangeChanged(RangeDispatcher.this, startPosition, i2);
                }
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeInserted(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76485d9f73d60c3345799029c8fd9ab3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76485d9f73d60c3345799029c8fd9ab3");
                return;
            }
            h.b(rangeHolder, "sender");
            int startPosition = RangeDispatcher.this.getStartPosition(rangeHolder) + i;
            RangeDispatcher.this.adjustChildRange(RangeDispatcher.this.indexOf((Object) rangeHolder));
            if (startPosition >= 0) {
                for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                    rangeChangeObserver.onItemRangeInserted(RangeDispatcher.this, startPosition, i2);
                }
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeRemoved(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d5af59aa0dba935130dbef00971885", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d5af59aa0dba935130dbef00971885");
                return;
            }
            h.b(rangeHolder, "sender");
            int startPosition = RangeDispatcher.this.getStartPosition(rangeHolder) + i;
            int indexOf = RangeDispatcher.this.indexOf((Object) rangeHolder);
            if (rangeHolder.getRange() != 0) {
                RangeDispatcher.this.adjustChildRange(indexOf);
                if (startPosition >= 0) {
                    for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                        rangeChangeObserver.onItemRangeRemoved(RangeDispatcher.this, startPosition, i2);
                    }
                    return;
                }
                return;
            }
            RangeDispatcher.this.remove(indexOf);
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeReplaced(@NotNull RangeHolder rangeHolder, int i, int i2, int i3) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08f7430d7016f0380e73c431bea4eb2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08f7430d7016f0380e73c431bea4eb2a");
                return;
            }
            h.b(rangeHolder, "sender");
            int startPosition = RangeDispatcher.this.getStartPosition(rangeHolder) + i;
            RangeDispatcher.this.adjustChildRange(RangeDispatcher.this.indexOf((Object) rangeHolder));
            if (startPosition >= 0) {
                for (RangeChangeObserver rangeChangeObserver : RangeDispatcher.this.rangeChangedObservers) {
                    rangeChangeObserver.onItemRangeReplaced(RangeDispatcher.this, startPosition, i2, i3);
                }
            }
        }
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86e80aa6f8c23300ae92db54403e1b62", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86e80aa6f8c23300ae92db54403e1b62");
        }
        return "RangeDispatcher(totalRange=" + this.totalRange + ')';
    }
}
