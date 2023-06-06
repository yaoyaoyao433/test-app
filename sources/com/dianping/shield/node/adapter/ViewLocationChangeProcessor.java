package com.dianping.shield.node.adapter;

import android.graphics.Rect;
import android.util.SparseArray;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ViewLocationChangeProcessor<T> implements ViewLocationRectInterface, ShieldPreloadInterface, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected FirstLastPositionInfo firstLastPositionInfo;
    protected HashMap<T, Integer> positionHashMap;
    protected HashMap<T, AttachStatus> statusHashMap;
    protected ViewLocationRectInterface viewLocationRectInterface;

    public abstract void onViewLocationChanged(ScrollDirection scrollDirection);

    public void shieldPreload() {
    }

    public ViewLocationChangeProcessor(ViewLocationRectInterface viewLocationRectInterface) {
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ed3e15ec6de578928ce41182b5a733f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ed3e15ec6de578928ce41182b5a733f");
            return;
        }
        this.firstLastPositionInfo = new FirstLastPositionInfo(1);
        this.statusHashMap = new HashMap<>();
        this.positionHashMap = new HashMap<>();
        this.viewLocationRectInterface = viewLocationRectInterface;
    }

    @Override // com.dianping.shield.node.adapter.status.ViewLocationRectInterface
    @NotNull
    public Rect getActualRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9b6e092b1af9120556a8c0cb446d7e0", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9b6e092b1af9120556a8c0cb446d7e0") : this.viewLocationRectInterface.getActualRect();
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2420096181461f21d14570f590679b73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2420096181461f21d14570f590679b73");
        } else {
            this.statusHashMap.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class FirstLastPositionInfo implements Cloneable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ArrayList<ViewExtraInfo> completelyVisibleItemPositions;
        public ArrayList<ViewExtraInfo> firstVisibleItemPositions;
        public ArrayList<ViewExtraInfo> lastVisibleItemPositions;
        public SparseArray<HotZoneLocation> locationSparseArray;
        public int spanCount;

        public FirstLastPositionInfo(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42cae04ab9268fabe8bb42cfc2709e30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42cae04ab9268fabe8bb42cfc2709e30");
                return;
            }
            this.spanCount = i;
            this.firstVisibleItemPositions = new ArrayList<>();
            this.completelyVisibleItemPositions = new ArrayList<>();
            this.lastVisibleItemPositions = new ArrayList<>();
            this.locationSparseArray = new SparseArray<>();
            clear();
        }

        public void clear() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c14ac54fd042146681a4dc616f19870", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c14ac54fd042146681a4dc616f19870");
                return;
            }
            this.completelyVisibleItemPositions.clear();
            this.firstVisibleItemPositions.clear();
            this.lastVisibleItemPositions.clear();
            this.locationSparseArray.clear();
            for (int i = 0; i < this.spanCount; i++) {
                this.firstVisibleItemPositions.add(new ViewExtraInfo());
                this.lastVisibleItemPositions.add(new ViewExtraInfo());
            }
        }

        public boolean isEmpty() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aa805c2605407924711257fd8da02fd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aa805c2605407924711257fd8da02fd")).booleanValue();
            }
            if (this.firstVisibleItemPositions != null && this.firstVisibleItemPositions.size() > 0) {
                for (int i = 0; i < this.firstVisibleItemPositions.size(); i++) {
                    ViewExtraInfo viewExtraInfo = this.firstVisibleItemPositions.get(i);
                    if (viewExtraInfo != null && viewExtraInfo.offsetPos >= 0) {
                        return false;
                    }
                }
            }
            if (this.lastVisibleItemPositions != null && this.lastVisibleItemPositions.size() > 0) {
                for (int i2 = 0; i2 < this.lastVisibleItemPositions.size(); i2++) {
                    ViewExtraInfo viewExtraInfo2 = this.lastVisibleItemPositions.get(i2);
                    if (viewExtraInfo2 != null && viewExtraInfo2.offsetPos >= 0) {
                        return false;
                    }
                }
            }
            if (this.completelyVisibleItemPositions != null && this.completelyVisibleItemPositions.size() > 0) {
                for (int i3 = 0; i3 < this.completelyVisibleItemPositions.size(); i3++) {
                    ViewExtraInfo viewExtraInfo3 = this.completelyVisibleItemPositions.get(i3);
                    if (viewExtraInfo3 != null && viewExtraInfo3.offsetPos >= 0) {
                        return false;
                    }
                }
            }
            if (this.locationSparseArray == null || this.locationSparseArray.size() < 0) {
                return true;
            }
            for (int i4 = 0; i4 < this.locationSparseArray.size(); i4++) {
                if (this.locationSparseArray.keyAt(i4) >= 0) {
                    return false;
                }
            }
            return true;
        }

        public void updateFistVisibleItemPosition(int i, ViewExtraInfo viewExtraInfo) {
            Object[] objArr = {Integer.valueOf(i), viewExtraInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb26d8db3d3087ce9b618a472b515050", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb26d8db3d3087ce9b618a472b515050");
            } else if (this.firstVisibleItemPositions.get(i).offsetPos < 0 || this.firstVisibleItemPositions.get(i).offsetPos > viewExtraInfo.offsetPos) {
                this.firstVisibleItemPositions.set(i, viewExtraInfo);
            }
        }

        public void addCompletelyVisibleItemPosition(ViewExtraInfo viewExtraInfo) {
            Object[] objArr = {viewExtraInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ceb71696fc955375f2869858a3bd9ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ceb71696fc955375f2869858a3bd9ef");
            } else if (this.completelyVisibleItemPositions.contains(viewExtraInfo)) {
            } else {
                this.completelyVisibleItemPositions.add(viewExtraInfo);
            }
        }

        public void updateLastVisibleItemPosition(int i, ViewExtraInfo viewExtraInfo) {
            Object[] objArr = {Integer.valueOf(i), viewExtraInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6776ee789d33bac9ee4c3a9595b18bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6776ee789d33bac9ee4c3a9595b18bf");
            } else if (this.lastVisibleItemPositions.get(i).offsetPos < 0 || this.lastVisibleItemPositions.get(i).offsetPos < viewExtraInfo.offsetPos) {
                this.lastVisibleItemPositions.set(i, viewExtraInfo);
            }
        }

        public Object clone() throws CloneNotSupportedException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9998b7c33f4e373f48e217d1accb70a", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9998b7c33f4e373f48e217d1accb70a");
            }
            FirstLastPositionInfo firstLastPositionInfo = (FirstLastPositionInfo) super.clone();
            firstLastPositionInfo.firstVisibleItemPositions = new ArrayList<>(this.firstVisibleItemPositions.size());
            firstLastPositionInfo.firstVisibleItemPositions.addAll(this.firstVisibleItemPositions);
            firstLastPositionInfo.lastVisibleItemPositions = new ArrayList<>(this.lastVisibleItemPositions.size());
            firstLastPositionInfo.lastVisibleItemPositions.addAll(this.lastVisibleItemPositions);
            firstLastPositionInfo.completelyVisibleItemPositions = new ArrayList<>(this.completelyVisibleItemPositions.size());
            firstLastPositionInfo.completelyVisibleItemPositions.addAll(this.completelyVisibleItemPositions);
            firstLastPositionInfo.spanCount = this.spanCount;
            firstLastPositionInfo.locationSparseArray = new SparseArray<>(this.locationSparseArray.size());
            for (int i = 0; i < this.locationSparseArray.size(); i++) {
                firstLastPositionInfo.locationSparseArray.put(this.locationSparseArray.keyAt(i), this.locationSparseArray.valueAt(i));
            }
            return firstLastPositionInfo;
        }
    }

    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3eff403066a38d4873b10821556830d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3eff403066a38d4873b10821556830d");
            return;
        }
        if (this.statusHashMap != null) {
            this.statusHashMap.clear();
        } else {
            this.statusHashMap = new HashMap<>();
        }
        if (this.positionHashMap != null) {
            this.positionHashMap.clear();
        } else {
            this.positionHashMap = new HashMap<>();
        }
        if (this.firstLastPositionInfo != null) {
            this.firstLastPositionInfo.completelyVisibleItemPositions.clear();
            this.firstLastPositionInfo.firstVisibleItemPositions.clear();
            this.firstLastPositionInfo.lastVisibleItemPositions.clear();
            this.firstLastPositionInfo.locationSparseArray.clear();
            this.firstLastPositionInfo.spanCount = 1;
            return;
        }
        this.firstLastPositionInfo = new FirstLastPositionInfo(1);
    }
}
