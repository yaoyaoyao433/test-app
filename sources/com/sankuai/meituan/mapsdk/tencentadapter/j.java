package com.sankuai.meituan.mapsdk.tencentadapter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.ab;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.tencent.tencentmap.mapsdk.maps.MapRenderLayer;
import com.tencent.tencentmap.mapsdk.maps.MapView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements com.sankuai.meituan.mapsdk.maps.interfaces.m {
    public static ChangeQuickRedirect a;
    private MapView b;
    private int c;
    private int d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b77da4c135883ca1b2f894fe619ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b77da4c135883ca1b2f894fe619ab2");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onLowMemory() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    @Deprecated
    public final void setMapCustomEnable(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final void setOnDrawFrameCostListener(ab abVar) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final void setZoomMode(ac acVar) {
    }

    public j(MapView mapView, MapViewOptions mapViewOptions) {
        Object[] objArr = {mapView, mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523f373ce6f625684ac4b337cd43496b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523f373ce6f625684ac4b337cd43496b");
            return;
        }
        this.b = mapView;
        if (mapViewOptions != null) {
            this.c = mapViewOptions.getSurfaceWidth();
            this.d = mapViewOptions.getSurfaceHeight();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b023262f2c35453739e4b290dbe9e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b023262f2c35453739e4b290dbe9e5b");
        } else if (this.b != null) {
            this.b.onResume();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8144919c38d2f413db55847b800bebb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8144919c38d2f413db55847b800bebb5");
        } else if (this.b != null) {
            this.b.onPause();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303ff5f244f990340269ea30d8920304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303ff5f244f990340269ea30d8920304");
        } else if (this.b != null) {
            this.b.onStart();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6219e4efcedc49fd1c24492fe452f7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6219e4efcedc49fd1c24492fe452f7a");
        } else if (this.b != null) {
            this.b.onStop();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822b154a6af9bef3b02fe535a329622a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822b154a6af9bef3b02fe535a329622a");
        } else if (this.b != null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f("tencent onDestroy");
            try {
                this.b.onDestroy();
            } catch (Exception e) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("tencent onDestroy with exception:" + e.getMessage());
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7962c8f4d21c38c4ac3d77e353014d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7962c8f4d21c38c4ac3d77e353014d");
            return;
        }
        if (this.b != null) {
            this.b.onSizeChanged(i, i2, i3, i4);
        }
        this.c = i;
        this.d = i2;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813db019bd2883578e8e8eced9ba7a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813db019bd2883578e8e8eced9ba7a48");
        } else {
            this.b.setVisibility(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final void onSurfaceChanged(Object obj, int i, int i2) {
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd2d7d9dc6891812595f3b1138b3969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd2d7d9dc6891812595f3b1138b3969");
        } else if (this.b == null) {
        } else {
            this.b.onSurfaceChanged(obj, i, i2);
            this.c = i;
            this.d = i2;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d272533c08aa8a3eec2937093b7cf4d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d272533c08aa8a3eec2937093b7cf4d5")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.dispatchTouchEvent(motionEvent);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final int getWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8424c6682b23a66321b70f68b3de1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8424c6682b23a66321b70f68b3de1e")).intValue();
        }
        if (this.b instanceof MapRenderLayer) {
            return this.c;
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.getWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final int getHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c81fe641196f7841f3fec1a1d25c522", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c81fe641196f7841f3fec1a1d25c522")).intValue();
        }
        if (this.b instanceof MapRenderLayer) {
            return this.d;
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.getHeight();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19dfb0ec9440732e85dd682324e7d5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19dfb0ec9440732e85dd682324e7d5c");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getContext();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final ViewParent getParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f57c963ee53fb22e44bee4beec1492c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewParent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f57c963ee53fb22e44bee4beec1492c");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getParent();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final void setCustomMapStylePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23f840b88311502806e6f3c81ca3c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23f840b88311502806e6f3c81ca3c86");
        } else if (this.b == null || this.b.getMap() == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                this.b.getMap().setMapStyle(1000);
                return;
            }
            try {
                if (Integer.parseInt(str) == 2) {
                    this.b.getMap().setMapStyle(2);
                } else if (Integer.parseInt(str) == 1) {
                    this.b.getMap().setMapStyle(1000);
                } else {
                    this.b.getMap().setMapStyle(Integer.parseInt(str));
                }
            } catch (NumberFormatException unused) {
                this.b.getMap().setMapStyle(1000);
            }
        }
    }
}
