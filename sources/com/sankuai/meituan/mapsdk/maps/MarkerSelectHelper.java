package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MarkerSelectHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean clickToDeselectMarker;
    public n currentSelectMarker;
    public MTMap.OnMarkerSelectChangeListener listener;

    public MarkerSelectHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a47ed1bbfbe41b35ceb013df901795", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a47ed1bbfbe41b35ceb013df901795");
        } else {
            this.clickToDeselectMarker = true;
        }
    }

    public void addMarker(n nVar, boolean z) {
        Object[] objArr = {nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "527c51884652cd0840047d4364c481e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "527c51884652cd0840047d4364c481e5");
        } else if (nVar == null) {
        } else {
            nVar.setSelect(z);
        }
    }

    public void removeMarker(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2aa348800d23d6e03abe26982e0235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2aa348800d23d6e03abe26982e0235");
        } else if (nVar != null && nVar.isSelect()) {
            this.currentSelectMarker = null;
        }
    }

    public void setMarkerSelect(n nVar, boolean z) {
        Object[] objArr = {nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6256111b3e0d587f2abe48b45158dba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6256111b3e0d587f2abe48b45158dba1");
        } else if (z) {
            b(nVar);
        } else {
            a(nVar);
        }
    }

    public void onMarkerClick(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f7a01a2ef8da695a68982dd8b7117d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f7a01a2ef8da695a68982dd8b7117d2");
        } else {
            b(nVar);
        }
    }

    private void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11371cf603b47279224931f55cd00962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11371cf603b47279224931f55cd00962");
        } else if (nVar == null) {
        } else {
            nVar.setSelect(false);
            if (this.currentSelectMarker == null || !this.currentSelectMarker.equals(nVar) || this.listener == null) {
                return;
            }
            this.listener.onDeselected(new Marker(this.currentSelectMarker));
            this.currentSelectMarker = null;
        }
    }

    private void b(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59f2df7eec279d8e20f604158fee1c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59f2df7eec279d8e20f604158fee1c5");
        } else if (nVar == null) {
        } else {
            nVar.setSelect(true);
            if (this.currentSelectMarker != null) {
                if (this.currentSelectMarker.equals(nVar)) {
                    return;
                }
                if (!this.currentSelectMarker.equals(nVar)) {
                    a(this.currentSelectMarker);
                }
            }
            this.currentSelectMarker = nVar;
            if (this.listener != null) {
                this.listener.onSelected(new Marker(this.currentSelectMarker));
            }
        }
    }

    public void onMapClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3129d65da90662f235171cba7c9e2b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3129d65da90662f235171cba7c9e2b8e");
        } else if (this.clickToDeselectMarker) {
            a(this.currentSelectMarker);
        }
    }

    public void onPoiClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c7ff3a38e0cdd625615fff65b53d99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c7ff3a38e0cdd625615fff65b53d99e");
        } else if (this.clickToDeselectMarker) {
            a(this.currentSelectMarker);
        }
    }

    public void onPolylineClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc8307a47f93bafa9d0a851f146efd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc8307a47f93bafa9d0a851f146efd3");
        } else if (this.clickToDeselectMarker) {
            a(this.currentSelectMarker);
        }
    }

    public void onPolygonClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4153166bb07a1315962c805fd79d844c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4153166bb07a1315962c805fd79d844c");
        } else if (this.clickToDeselectMarker) {
            a(this.currentSelectMarker);
        }
    }

    public void onMapLongClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "144a9de8c83bf3270d7b7ee5521d2289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "144a9de8c83bf3270d7b7ee5521d2289");
        } else if (this.clickToDeselectMarker) {
            a(this.currentSelectMarker);
        }
    }

    public void setOnOnMarkerSelectChangeListener(MTMap.OnMarkerSelectChangeListener onMarkerSelectChangeListener) {
        this.listener = onMarkerSelectChangeListener;
    }

    public void clickToDeselectMarker(boolean z) {
        this.clickToDeselectMarker = z;
    }
}
