package com.sankuai.meituan.mapsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.api.MapInitializer;
import com.sankuai.meituan.mapsdk.core.gesture.AndroidGesturesManager;
import com.sankuai.meituan.mapsdk.core.render.egl.d;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ab;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.m;
import com.sankuai.meituan.mapsdk.maps.model.EngineMode;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e extends FrameLayout implements m {
    public static ChangeQuickRedirect a;
    protected MapViewOptions b;
    private TextView c;
    private String d;
    private String e;
    private int f;
    private View g;
    private d h;
    private int i;
    private int j;
    private volatile boolean k;
    private volatile boolean l;
    private String m;
    private Platform n;
    private String o;
    private Object p;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onLowMemory() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onSaveInstanceState(Bundle bundle) {
    }

    static {
        MapInitializer.load();
    }

    public e(@NonNull Context context, String str, Platform platform, String str2, int i, @Nullable MapViewOptions mapViewOptions) {
        super(context);
        Object[] objArr = {context, str, platform, str2, Integer.valueOf(i), mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d84f69ab14af721ce76b182daafb67d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d84f69ab14af721ce76b182daafb67d");
            return;
        }
        this.f = 0;
        this.k = false;
        this.l = false;
        this.m = str;
        this.n = platform;
        this.o = str2;
        this.f = i;
        Object[] objArr2 = {context, mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f8f6c83c6a2a8a3f141c1284b4bfde6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f8f6c83c6a2a8a3f141c1284b4bfde6");
            return;
        }
        this.b = mapViewOptions == null ? new MapViewOptions() : mapViewOptions;
        setClipChildren(false);
        setBackgroundColor(-329224);
        MapInitializer.initMapSDK(context);
        if (this.b.getExtSurface() != null) {
            setBackgroundColor(0);
        }
        this.h = d.a(this, this.m, this.n, this.o);
        com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_init", (Map<String, Object>) null);
        com.sankuai.meituan.mapsdk.mapcore.report.f.a(this.m);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setCustomMapStylePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "074f8df065ada5e308fcacaf3e0fb9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "074f8df065ada5e308fcacaf3e0fb9de");
        } else if (TextUtils.isEmpty(str) || this.h == null) {
        } else {
            this.d = this.h.n;
            this.e = com.sankuai.meituan.mapsdk.mapcore.utils.g.a(str.getBytes());
            if (TextUtils.isEmpty(this.e)) {
                return;
            }
            this.h.a(this.e, str);
            this.h.changeStyle(this.e, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setMapCustomEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f725373c1b166944a5c2092c7fa498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f725373c1b166944a5c2092c7fa498");
        } else if (this.h != null) {
            this.h.changeStyle(z ? this.e : this.d, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setZoomMode(ac acVar) {
        Object[] objArr = {acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b222614d60b73daca136116a6c76a01d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b222614d60b73daca136116a6c76a01d");
        } else if (acVar == null || this.h == null) {
        } else {
            this.h.setZoomMode(acVar);
        }
    }

    public UiSettings getUiSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541c2e5567c6a39a1321b15867bac904", RobustBitConfig.DEFAULT_VALUE) ? (UiSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541c2e5567c6a39a1321b15867bac904") : this.h.getUiSettings();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89678ecb205086334d0acc3a73865ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89678ecb205086334d0acc3a73865ef6");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.c(this + " onCreate");
        LayoutInflater.from(getContext()).inflate(R.layout.mtmapsdk_mapview_internal, this);
        if (bundle != null) {
            this.h.p = bundle.getBoolean("ENABLE_CUSTOM_TILE_CACHE", true);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66de0de4178d83fba627b050a5f40936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66de0de4178d83fba627b050a5f40936");
        } else {
            switch (this.f) {
                case 1:
                    TextureView textureView = new TextureView(getContext());
                    this.p = textureView;
                    addView(textureView, 0);
                    textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.sankuai.meituan.mapsdk.core.e.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                            Object[] objArr3 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "70c95ff2c8441624ca9b4a14dfc09621", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "70c95ff2c8441624ca9b4a14dfc09621");
                            } else if (e.this.a()) {
                                e.this.h.a(surfaceTexture);
                                e.this.h.a(surfaceTexture, i, i2);
                            }
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                            Object[] objArr3 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "259c83cf4a1dc62bba2cb7f0563faf92", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "259c83cf4a1dc62bba2cb7f0563faf92");
                            } else if (e.this.a()) {
                                e.this.h.a(surfaceTexture, i, i2);
                            }
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                            Object[] objArr3 = {surfaceTexture};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "803b1d3ac3d936283e8dc351c8254a11", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "803b1d3ac3d936283e8dc351c8254a11")).booleanValue();
                            }
                            e.this.h.b(surfaceTexture);
                            return true;
                        }
                    });
                    break;
                case 2:
                    measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    this.p = this.b.getExtSurface();
                    this.h.a(this.b.getExtSurface());
                    this.h.a(this.b.getSurfaceWidth(), this.b.getSurfaceHeight(), 0, 0);
                    break;
                default:
                    SurfaceView surfaceView = new SurfaceView(getContext());
                    this.p = surfaceView;
                    addView(surfaceView, 0);
                    surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.sankuai.meituan.mapsdk.core.e.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.SurfaceHolder.Callback
                        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                            Object[] objArr3 = {surfaceHolder};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "65e72f16036c9bf2dde2977ef82b298a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "65e72f16036c9bf2dde2977ef82b298a");
                            } else if (e.this.a()) {
                                e.this.h.a(surfaceHolder);
                            }
                        }

                        @Override // android.view.SurfaceHolder.Callback
                        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                            Object[] objArr3 = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2123eb090062301bd5c46dcb8f17a9ed", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2123eb090062301bd5c46dcb8f17a9ed");
                            } else if (e.this.a()) {
                                e.this.h.a(surfaceHolder, i2, i3);
                            }
                        }

                        @Override // android.view.SurfaceHolder.Callback
                        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                            Object[] objArr3 = {surfaceHolder};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "828fb76618cac719cc8b44753c85265e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "828fb76618cac719cc8b44753c85265e");
                            } else {
                                e.this.h.b(surfaceHolder);
                            }
                        }
                    });
                    break;
            }
            if (this.h.j.c != null && !this.h.j.c.isRenderReady()) {
                this.g = new View(getContext());
                addView(this.g, 0);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "118596e2b315eb6379d3654c29a39d5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "118596e2b315eb6379d3654c29a39d5d");
        } else {
            setClickable(true);
            setLongClickable(true);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestDisallowInterceptTouchEvent(true);
            setWillNotDraw(false);
        }
        this.h.a(this.b, this);
        if (MapsInitializer.isDebug()) {
            this.c = new TextView(getContext());
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, GravityCompat.START);
            this.c.setTextColor(SupportMenu.CATEGORY_MASK);
            this.c.setTextSize(20.0f);
            addView(this.c, layoutParams);
            this.h.j.c.d = new d.a() { // from class: com.sankuai.meituan.mapsdk.core.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.core.render.egl.d.a
                public final void a(final int i) {
                    Object[] objArr4 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e1d12b5c710e26172b07a3baf2174930", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e1d12b5c710e26172b07a3baf2174930");
                    } else {
                        e.this.c.post(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.e.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            @SuppressLint({"SetTextI18n"})
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "425b1d2698fcf707332d0ec0f0639e30", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "425b1d2698fcf707332d0ec0f0639e30");
                                    return;
                                }
                                TextView textView = e.this.c;
                                textView.setText("FPS：" + i);
                                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("FPS：" + i);
                            }
                        });
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842c4d905f857f179d6cc0a92fa9e54a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842c4d905f857f179d6cc0a92fa9e54a")).booleanValue();
        }
        if (this.h.r == 1) {
            return true;
        }
        return this.l && this == this.h.c;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d8a51ad65b9e6446b1ba33580b44a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d8a51ad65b9e6446b1ba33580b44a5");
        } else {
            super.onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View, com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc94c34a7f412855c83e5a6fbfa5771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc94c34a7f412855c83e5a6fbfa5771");
        } else if (i < 0 || i2 < 0) {
        } else {
            if (i == this.i && i2 == this.j) {
                return;
            }
            this.i = i;
            this.j = i2;
            if (this.h != null) {
                this.h.a(i, i2, i3, i4);
                if (a() && this.f == 2) {
                    this.h.a(this.p, i, i2);
                }
                com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.h.j;
                if (cVar.c != null && !cVar.c.isRenderReady() && this.g != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    this.g.setLayoutParams(layoutParams);
                }
            }
            if (MapsInitializer.isDebug()) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                layoutParams2.topMargin = (i2 / 5) * 2;
                this.c.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586119ee73f68e0515e6473f10ed7cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586119ee73f68e0515e6473f10ed7cda");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.c(this + " onStart");
        if (this.h != null) {
            this.h.a();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cef0b2e5a26bfebafef6fc4b68cd0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cef0b2e5a26bfebafef6fc4b68cd0e1");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.c(this + " onResume");
        this.l = true;
        if (this.h != null) {
            if (this.p instanceof TextureView) {
                SurfaceTexture surfaceTexture = ((TextureView) this.p).getSurfaceTexture();
                if (surfaceTexture != null) {
                    this.h.a(surfaceTexture);
                    this.h.a(surfaceTexture, this.i, this.j);
                }
            } else if (this.p instanceof SurfaceView) {
                SurfaceHolder holder = ((SurfaceView) this.p).getHolder();
                if (holder.getSurface().isValid()) {
                    this.h.a(holder);
                }
            } else if (this.f == 2) {
                this.h.a(this.p);
            }
            this.h.c = this;
            this.h.b();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deed37f9742fe973d47dfec5e20d6fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deed37f9742fe973d47dfec5e20d6fc1");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.c(this + " onPause");
        if (this.b.getEngineMode() != EngineMode.REUSE || this.h == null || this == this.h.c) {
            this.l = false;
            if (this.h != null) {
                this.h.c();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabfde9c39c4974127b83f0ebf405768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabfde9c39c4974127b83f0ebf405768");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.c(this + " onStop");
        if (this.b.getEngineMode() != EngineMode.REUSE || this.h == null || this == this.h.c) {
            this.l = false;
            if (this.h != null) {
                this.h.d();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void onSurfaceChanged(Object obj, int i, int i2) {
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c50414ee8a5285eaf5ff606c083f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c50414ee8a5285eaf5ff606c083f8e");
        } else if (this.h == null) {
        } else {
            d dVar = this.h;
            Object[] objArr2 = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "ad52aec668a19ca6ec80c77e607a759f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "ad52aec668a19ca6ec80c77e607a759f");
            } else if (!dVar.i) {
                dVar.a(i, i2, dVar.d.b(), dVar.d.c());
            }
            this.i = i;
            this.j = i2;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d59910c48df234b709cf1956e49e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d59910c48df234b709cf1956e49e11");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.c(this + " onDestroy");
        if (this.k) {
            return;
        }
        this.k = true;
        this.l = false;
        if (this.h != null) {
            this.h.e();
        }
    }

    @Override // android.view.View, com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c71a7544362efdad1e686f6f94e7c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c71a7544362efdad1e686f6f94e7c3");
            return;
        }
        super.setVisibility(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof SurfaceView) {
                childAt.setVisibility(i);
            }
        }
    }

    public d getMap() {
        return this.h;
    }

    public int getRenderType() {
        return this.f;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean a2;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451a0d764744e1c6a3028029b02de868", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451a0d764744e1c6a3028029b02de868")).booleanValue();
        }
        try {
            if (this.k) {
                return false;
            }
            h hVar = this.h.e;
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "82d2bdbc23836f4e8ddec0f5ce4dc7b8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "82d2bdbc23836f4e8ddec0f5ce4dc7b8")).booleanValue();
            }
            com.sankuai.meituan.mapsdk.core.gesture.d dVar = hVar.b;
            Object[] objArr3 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.gesture.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "f488d11a6dd1631ce09ce68c2c893430", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "f488d11a6dd1631ce09ce68c2c893430")).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : dVar.c) {
                if (cVar != null && cVar.b(MotionEvent.obtain(motionEvent))) {
                    return true;
                }
            }
            AndroidGesturesManager androidGesturesManager = dVar.b;
            Object[] objArr4 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect4 = AndroidGesturesManager.a;
            if (PatchProxy.isSupport(objArr4, androidGesturesManager, changeQuickRedirect4, false, "ce71db5b8d63ec9fbc5cf610cb5a371e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr4, androidGesturesManager, changeQuickRedirect4, false, "ce71db5b8d63ec9fbc5cf610cb5a371e")).booleanValue();
            }
            boolean z = false;
            for (com.sankuai.meituan.mapsdk.core.gesture.a aVar : androidGesturesManager.c) {
                if (motionEvent.getAction() == 5) {
                    androidGesturesManager.k = true;
                }
                if (!androidGesturesManager.k || !(aVar instanceof com.sankuai.meituan.mapsdk.core.gesture.f)) {
                    Object[] objArr5 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.mapsdk.core.gesture.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "400c847b436e6f599e2c58f9c483c344", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "400c847b436e6f599e2c58f9c483c344")).booleanValue();
                    } else {
                        Object[] objArr6 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.mapsdk.core.gesture.a.a;
                        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "b224a655caa9fc668a1b2fd0b4888d4b", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = ((Boolean) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "b224a655caa9fc668a1b2fd0b4888d4b")).booleanValue();
                        } else if (motionEvent == null) {
                            a2 = false;
                        } else {
                            if (aVar.e != null) {
                                aVar.e.recycle();
                                aVar.e = null;
                            }
                            if (aVar.d != null) {
                                aVar.e = MotionEvent.obtain(aVar.d);
                                aVar.d.recycle();
                                aVar.d = null;
                            }
                            aVar.d = MotionEvent.obtain(motionEvent);
                            aVar.f = aVar.d.getEventTime() - aVar.d.getDownTime();
                            a2 = aVar.a(motionEvent);
                        }
                    }
                    if (a2) {
                        z = true;
                    }
                }
            }
            if (motionEvent.getAction() == 1) {
                androidGesturesManager.k = false;
            }
            return z;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setOnDrawFrameCostListener(ab abVar) {
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69633d74cf2fec6a2e69bbd344a3dc77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69633d74cf2fec6a2e69bbd344a3dc77");
            return;
        }
        d dVar = this.h;
        Object[] objArr2 = {abVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "684e6d2896183d38a7f3aea81b534024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "684e6d2896183d38a7f3aea81b534024");
        } else {
            dVar.j.c.h = abVar;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd81c24ea2426f75a57fc9d9d8245897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd81c24ea2426f75a57fc9d9d8245897");
            return;
        }
        super.requestLayout();
        post(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.e.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0796645dc52811ae41118d37f44d5150", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0796645dc52811ae41118d37f44d5150");
                    return;
                }
                e.this.measure(View.MeasureSpec.makeMeasureSpec(e.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e.this.getHeight(), 1073741824));
                e.this.layout(e.this.getLeft(), e.this.getTop(), e.this.getRight(), e.this.getBottom());
            }
        });
    }
}
