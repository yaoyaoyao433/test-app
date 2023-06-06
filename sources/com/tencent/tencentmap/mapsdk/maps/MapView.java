package com.tencent.tencentmap.mapsdk.maps;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.ViewParent;
import com.tencent.map.tools.Callback;
import com.tencent.mapsdk.internal.sd;
import com.tencent.mapsdk.internal.t;
import com.tencent.mapsdk.internal.u;
import com.tencent.tencentmap.mapsdk.maps.BaseMapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MapView extends BaseMapView {
    private TencentMap mMap;
    protected BaseMapView.MapViewProxy mMapDelegate;
    private TencentMapOptions mMapOptions;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    static {
        System.loadLibrary(sd.a);
    }

    public MapView(@NonNull Context context) {
        this(context, new TencentMapOptions());
    }

    public MapView(@NonNull Context context, TencentMapOptions tencentMapOptions) {
        super(context);
        this.mMap = getMap(tencentMapOptions);
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, new TencentMapOptions());
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet, TencentMapOptions tencentMapOptions) {
        this(context, attributeSet, 0, tencentMapOptions);
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new TencentMapOptions());
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, TencentMapOptions tencentMapOptions) {
        super(context, attributeSet, i);
        this.mMap = getMap(tencentMapOptions);
    }

    private void initMap(TencentMapOptions tencentMapOptions) {
        if (this.mMap == null || !(this.mMapOptions == tencentMapOptions || this.mMapOptions.equals(tencentMapOptions))) {
            if (tencentMapOptions == null) {
                tencentMapOptions = new TencentMapOptions();
            }
            if (tencentMapOptions.getMapViewType() == null) {
                tencentMapOptions.setMapViewType(getViewType());
            }
            if (tencentMapOptions.getMapKernel() == null) {
                tencentMapOptions.setMapKernel(getMapKernel());
            }
            setClickable(true);
            if (this.mMap != null && this.mMapDelegate != null) {
                this.mMapDelegate.onPause();
                this.mMapDelegate.onStop();
                this.mMapDelegate.onDestroy();
                this.mMapDelegate = null;
                this.mMap = null;
            }
            final Callback<TencentMap> mapAsyncCallback = tencentMapOptions.getMapAsyncCallback();
            if (this.mMapDelegate == null) {
                t tVar = new t(getContext().getApplicationContext());
                if (mapAsyncCallback != null) {
                    Callback<BaseMapView.MapViewProxy> callback = new Callback<BaseMapView.MapViewProxy>() { // from class: com.tencent.tencentmap.mapsdk.maps.MapView.1
                        @Override // com.tencent.map.tools.Callback
                        public final /* synthetic */ void callback(BaseMapView.MapViewProxy mapViewProxy) {
                            BaseMapView.MapViewProxy mapViewProxy2 = mapViewProxy;
                            MapView.this.mMapDelegate = mapViewProxy2;
                            if (mapViewProxy2 != null) {
                                MapView.this.mMapDelegate.onResume();
                                mapAsyncCallback.callback(mapViewProxy2.getMap());
                            }
                        }

                        private void a(BaseMapView.MapViewProxy mapViewProxy) {
                            MapView.this.mMapDelegate = mapViewProxy;
                            if (mapViewProxy != null) {
                                MapView.this.mMapDelegate.onResume();
                                mapAsyncCallback.callback(mapViewProxy.getMap());
                            }
                        }
                    };
                    new Thread(new u.AnonymousClass4(tVar.a, tVar.a(tencentMapOptions), new Handler(Looper.getMainLooper()), new t.AnonymousClass1(this, tencentMapOptions, callback)), "tms-plugin").start();
                } else {
                    this.mMapDelegate = tVar.a(this, tencentMapOptions);
                }
            }
            this.mMapOptions = tencentMapOptions;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public TencentMap getMap() {
        if (this.mMap != null) {
            return this.mMap;
        }
        return getMap(this.mMapOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public TencentMap getMap(TencentMapOptions tencentMapOptions) {
        initMap(tencentMapOptions);
        if (this.mMapDelegate != null) {
            return this.mMapDelegate.getMap();
        }
        return null;
    }

    private <T extends TencentMap> void getMapSync(TencentMapOptions tencentMapOptions, final Callback<T> callback) {
        tencentMapOptions.setGetMapAsync(new Callback<TencentMap>() { // from class: com.tencent.tencentmap.mapsdk.maps.MapView.2
            @Override // com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(TencentMap tencentMap) {
                TencentMap tencentMap2 = tencentMap;
                tencentMap2.addOnMapLoadedCallback(new AnonymousClass1(tencentMap2));
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.tencentmap.mapsdk.maps.MapView$2$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public final class AnonymousClass1 implements TencentMap.OnMapLoadedCallback {
                final /* synthetic */ TencentMap a;

                AnonymousClass1(TencentMap tencentMap) {
                    this.a = tencentMap;
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback
                public final void onMapLoaded() {
                    if (callback != null) {
                        callback.callback(this.a);
                    }
                    this.a.removeOnMapLoadedCallback(this);
                }
            }

            private void a(TencentMap tencentMap) {
                tencentMap.addOnMapLoadedCallback(new AnonymousClass1(tencentMap));
            }
        });
        initMap(tencentMapOptions);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || this.mMapDelegate == null || !this.mMapDelegate.isTouchable()) {
            return dispatchTouchEvent;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.mMapOptions.isDisallowInterceptTouchEvent());
        }
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onStart() {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onStart();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onResume() {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onResume();
        }
        u.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onPause() {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onPause();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onRestart() {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onRestart();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onStop() {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onStop();
        }
        u.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public void onDestroy() {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onDestroy();
            this.mMapDelegate = null;
        }
        this.mMapOptions = null;
        this.mMap = null;
    }

    public void setOnTop(boolean z) {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.setOnTop(z);
        }
    }

    public void setMapPadding(int i, int i2, int i3, int i4) {
        setPadding(i, i2, i3, i4);
    }

    public int[] getMapPadding() {
        return new int[]{getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()};
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mMapDelegate != null) {
            this.mMapDelegate.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        if (((obj instanceof Surface) || (obj instanceof SurfaceTexture) || (obj instanceof SurfaceHolder)) && this.mMapDelegate != null) {
            this.mMapDelegate.onSurfaceChanged(obj, i, i2);
        }
    }
}
