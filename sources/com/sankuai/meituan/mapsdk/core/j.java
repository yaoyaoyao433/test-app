package com.sankuai.meituan.mapsdk.core;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener;
import com.sankuai.meituan.mapsdk.core.widgets.IndoorControlView;
import com.sankuai.meituan.mapsdk.core.widgets.ZoomControlView;
import com.sankuai.meituan.mapsdk.core.widgets.d;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.interfaces.v;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements View.OnClickListener, OnMapChangedListener, IndoorControlView.a, ZoomControlView.a, d.a, v {
    public static ChangeQuickRedirect a;
    private ImageView A;
    private ZoomControlView B;
    private boolean C;
    private int D;
    private boolean E;
    private int[] F;
    private volatile boolean G;
    private Bitmap H;
    private boolean I;
    private int J;
    private int[] K;
    private boolean L;
    private boolean M;
    final a e;
    LinearLayout f;
    boolean g;
    boolean h;
    int i;
    int[] j;
    protected IndoorControlView k;
    boolean l;
    int m;
    int[] n;
    com.sankuai.meituan.mapsdk.core.widgets.e o;
    int p;
    int[] q;
    com.sankuai.meituan.mapsdk.core.widgets.a r;
    com.sankuai.meituan.mapsdk.core.widgets.e s;
    private int t;
    private int u;
    private boolean y;
    private final d z;
    private static final int[] v = {com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f)};
    private static final int[] w = {com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), 0, 0, com.sankuai.meituan.mapsdk.core.utils.d.b(58.0f)};
    public static final int[] b = {com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), 0, com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f)};
    public static final int[] c = {com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f)};
    public static final int[] d = {com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), 0, com.sankuai.meituan.mapsdk.core.utils.d.b(9.0f), com.sankuai.meituan.mapsdk.core.utils.d.b(35.0f)};
    private static final int x = com.sankuai.meituan.mapsdk.core.utils.d.b(40.0f);

    public static /* synthetic */ void a(j jVar, CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "6fbd4c4c81132e863759990fce174512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "6fbd4c4c81132e863759990fce174512");
        } else if (jVar.s != null) {
            jVar.s.b(cameraPosition.bearing);
            jVar.s.b();
        }
    }

    public j(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f24cc806fa799f8ce8de3ea0c6042361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f24cc806fa799f8ce8de3ea0c6042361");
            return;
        }
        this.t = 2;
        this.u = 2;
        this.y = false;
        this.g = false;
        this.h = true;
        this.l = false;
        this.E = true;
        this.G = true;
        this.I = false;
        this.L = true;
        this.M = false;
        this.z = dVar;
        this.e = new a();
        this.i = 8388693;
        this.j = (int[]) v.clone();
        this.m = 8388691;
        this.n = (int[]) w.clone();
        this.p = 8388691;
        this.q = (int[]) b.clone();
        this.D = 8388691;
        this.F = (int[]) d.clone();
        this.J = 8388659;
        this.K = (int[]) c.clone();
        this.h = true;
        this.l = false;
        this.C = true;
        this.I = false;
        this.E = true;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6930203cb907b95f187a124a3db76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6930203cb907b95f187a124a3db76c");
            return;
        }
        e eVar = this.z.c;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f8f856d9253d499ca7b5589613c1085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f8f856d9253d499ca7b5589613c1085");
        } else {
            this.f = (LinearLayout) eVar.findViewById(R.id.map_zoom_container);
            this.A = (ImageView) eVar.findViewById(R.id.location_iv);
            this.B = (ZoomControlView) eVar.findViewById(R.id.map_zoom);
            this.k = (IndoorControlView) eVar.findViewById(R.id.indoor_control_view);
        }
        this.o = new com.sankuai.meituan.mapsdk.core.widgets.e(this.z.h);
        this.o.a(3);
        this.o.a(this.q, this.p);
        this.o.a(com.sankuai.waimai.launcher.util.image.a.a(this.z.c.getContext().getResources(), (int) R.drawable.mtmapsdk_map_logo));
        this.A.setOnClickListener(this);
        this.B.setOnZoomListener(this);
        this.k.setOnIndoorControlListener(this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2edaeefeb334d925e7ed69d5eae71faf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2edaeefeb334d925e7ed69d5eae71faf");
            return;
        }
        boolean z = this.g;
        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4d6c2503df491a9a71e0cab0193bfc5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4d6c2503df491a9a71e0cab0193bfc5e");
        } else {
            this.g = z;
            if (this.A != null) {
                this.A.setVisibility(this.g ? 0 : 8);
            }
        }
        setZoomControlsEnabled(this.h);
        a(this.f, this.j, this.i);
        setIndoorControlsEnabled(this.l);
        a(this.k, this.n, this.m);
        setLogoEnabled(this.C);
        this.o.a(this.q, this.p);
        setScaleControlsEnabled(this.E);
        setCompassEnabled(this.I);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isLogoEnabled() {
        return this.C;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setLogoEnabled(boolean z) {
        this.C = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setLogoPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ecc8f232312ec5fd3e17868f4a24aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ecc8f232312ec5fd3e17868f4a24aa");
            return;
        }
        setLogoPosition(i);
        Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65a1547614841cb1d03fc730a221204e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65a1547614841cb1d03fc730a221204e");
            return;
        }
        this.q[0] = i4;
        this.q[1] = i2;
        this.q[2] = i5;
        this.q[3] = i3;
        if (this.o != null) {
            this.o.a(this.q, this.p);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setLogoPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e994eace1716db1504b33dd0d81c0aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e994eace1716db1504b33dd0d81c0aba");
            return;
        }
        int i2 = 8388693;
        switch (i) {
            case 0:
                i2 = 8388691;
                break;
            case 1:
                i2 = 81;
                break;
            case 3:
                i2 = 8388659;
                break;
            case 4:
                i2 = 49;
                break;
            case 5:
                i2 = 8388661;
                break;
        }
        this.u = i;
        this.p = i2;
        if (this.o != null) {
            this.o.a(this.q, this.p);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf56c788b5f54c3b899cbbd428ccd0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf56c788b5f54c3b899cbbd428ccd0d4");
            return;
        }
        int i2 = 8388693;
        switch (i) {
            case 1:
                i2 = 8388629;
                break;
        }
        this.t = i2;
        int i3 = this.t;
        Object[] objArr2 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d0bed7fcb86ab5167fcd4406f0433b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d0bed7fcb86ab5167fcd4406f0433b6");
            return;
        }
        this.i = i3;
        if (this.f != null) {
            a(this.f, this.j, this.i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final int getZoomPosition() {
        return this.t;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isZoomControlsEnabled() {
        return this.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7f0295186edc59e8b79033408982e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7f0295186edc59e8b79033408982e6");
            return;
        }
        this.h = z;
        if (this.B != null) {
            this.B.setEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomControlsMargins(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee7ebb57a99525aababb21a3bac4551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee7ebb57a99525aababb21a3bac4551");
            return;
        }
        this.j[0] = i;
        this.j[1] = i2;
        this.j[2] = i3;
        this.j[3] = i4;
        if (this.f != null) {
            a(this.f, this.j, this.i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isIndoorControlsEnabled() {
        return this.l;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setIndoorControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509059afaa2bc2248f33edb89638b458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509059afaa2bc2248f33edb89638b458");
            return;
        }
        this.l = z;
        if (this.k != null) {
            this.k.setEnable(this.l);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setIndoorControlsPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5d8deeaadce3538df35f7abd551dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5d8deeaadce3538df35f7abd551dad");
            return;
        }
        this.m = i;
        if (this.k != null) {
            a(this.k, this.n, this.m);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setIndoorControlsMargins(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30636f317b61fbc916c1fe83d0606b14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30636f317b61fbc916c1fe83d0606b14");
            return;
        }
        this.n[0] = i;
        this.n[1] = i2;
        this.n[2] = i3;
        this.n[3] = i4;
        if (this.k != null) {
            a(this.k, this.n, this.m);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isCompassEnabled() {
        return this.I;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setCompassEnabled(boolean z) {
        Bitmap a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ae7f0f6aacb536c85d9b95ee99eccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ae7f0f6aacb536c85d9b95ee99eccb");
            return;
        }
        this.I = z;
        if (this.I && this.s == null) {
            this.s = new com.sankuai.meituan.mapsdk.core.widgets.e(this.z.h);
            this.s.a(0.5f, 0.5f);
            CameraPosition cameraPosition = this.z.getCameraPosition();
            if (cameraPosition != null) {
                this.s.b(cameraPosition.bearing);
            }
            this.s.a(1);
            this.s.a(this.K, this.J);
            com.sankuai.meituan.mapsdk.core.widgets.e eVar = this.s;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0da429b2396e052328a155144d38ab0", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0da429b2396e052328a155144d38ab0");
            } else if (this.H != null) {
                a2 = this.H;
            } else {
                a2 = com.sankuai.waimai.launcher.util.image.a.a(com.sankuai.meituan.mapsdk.mapcore.a.a().getResources(), (int) R.drawable.mtmapsdk_compass_icon);
                this.H = a2;
            }
            eVar.a(a2);
            this.s.e = this;
        } else if (this.I || this.s == null) {
        } else {
            this.s.a();
            this.s = null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setCompassPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1975934c21da37bd2d355250f1cc3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1975934c21da37bd2d355250f1cc3b");
            return;
        }
        this.J = i;
        if (this.s != null) {
            this.s.a(this.K, this.J);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setCompassMargins(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd055e9c06d6918e973a1b55f23907dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd055e9c06d6918e973a1b55f23907dd");
            return;
        }
        this.K[0] = i;
        this.K[1] = i2;
        this.K[2] = i3;
        this.K[3] = i4;
        if (this.s != null) {
            this.s.a(this.K, this.J);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isScaleControlsEnabled() {
        return this.E;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScaleControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b029318a8f0cb8e3e1c27acf23951c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b029318a8f0cb8e3e1c27acf23951c83");
            return;
        }
        this.E = z;
        if (this.E && this.r == null) {
            this.r = new com.sankuai.meituan.mapsdk.core.widgets.a(this.z.h);
            this.r.a(2);
            b();
        } else if (this.E || this.r == null) {
        } else {
            this.r.a();
            this.r = null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final int getLogoPosition() {
        return this.u;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isScaleByMapCenter() {
        return this.G;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setGestureScaleByMapCenter(boolean z) {
        this.G = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScaleViewPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecbd4f5a770758e68388e36416edddb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecbd4f5a770758e68388e36416edddb8");
            return;
        }
        int i2 = 8388691;
        switch (i) {
            case 1:
                i2 = 81;
                break;
            case 2:
                i2 = 8388693;
                break;
        }
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85c7fe760e078ac22385fe22f565ccbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85c7fe760e078ac22385fe22f565ccbd");
            return;
        }
        this.D = i2;
        b();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5a2580f624cbafac65c535e01b693a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5a2580f624cbafac65c535e01b693a");
            return;
        }
        setScaleViewPosition(i);
        Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3fa006930a30a0d4f56a98bacc2699e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3fa006930a30a0d4f56a98bacc2699e");
        } else {
            this.F[0] = i4;
            this.F[1] = i2;
            this.F[2] = i5;
            this.F[3] = i3;
            b();
        }
        this.M = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d512d6f50c388807da856c074af69faf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d512d6f50c388807da856c074af69faf");
        } else if (this.r != null) {
            this.r.a(this.F, this.D);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isRotateGesturesEnabled() {
        return this.e.f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setRotateGesturesEnabled(boolean z) {
        this.e.f = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isScrollGesturesEnabled() {
        return this.e.c;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScrollGesturesEnabled(boolean z) {
        this.e.c = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isTiltGesturesEnabled() {
        return this.e.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setTiltGesturesEnabled(boolean z) {
        this.e.d = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isZoomGesturesEnabled() {
        return this.e.b;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f33f1fcea39ad5b46f7d32a85f6b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f33f1fcea39ad5b46f7d32a85f6b3e");
            return;
        }
        this.e.b = z;
        this.e.e = z;
        this.e.g = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setInertiaScaleEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ad2ebe7ff36389aac8957837633d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ad2ebe7ff36389aac8957837633d13");
            return;
        }
        this.e.h = z;
        this.z.e.b.d = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isInertiaScaleEnabled() {
        return this.e.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isAllGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad350095be1adbbce36e80875dbe15e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad350095be1adbbce36e80875dbe15e")).booleanValue();
        }
        a aVar = this.e;
        return aVar.b && aVar.c && aVar.d && aVar.e && aVar.f && aVar.g && aVar.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setAllGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9548521418ba1de3902d680cc444ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9548521418ba1de3902d680cc444ecb");
            return;
        }
        a aVar = this.e;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6e266338f1592a447e874de2b9031a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6e266338f1592a447e874de2b9031a14");
            return;
        }
        aVar.b = z;
        aVar.c = z;
        aVar.d = z;
        aVar.f = z;
        aVar.e = z;
        aVar.g = z;
        j.this.setInertiaScaleEnabled(z);
    }

    @Override // com.sankuai.meituan.mapsdk.core.widgets.ZoomControlView.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f2082bae7833c8f3841752c905780fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f2082bae7833c8f3841752c905780fa");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.z.d;
        if (this.z.i || aVar == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ zoomIn failed with destroyed map");
            return;
        }
        float b2 = aVar.b() / 2.0f;
        float c2 = aVar.c() / 2.0f;
        if (aVar.a() != null) {
            b2 = aVar.a().x;
            c2 = aVar.a().y;
        }
        this.z.e.e(b2, c2);
    }

    @Override // com.sankuai.meituan.mapsdk.core.widgets.ZoomControlView.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10428f5b282cbaa13e63ef04febb8759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10428f5b282cbaa13e63ef04febb8759");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.z.d;
        if (this.z.i || aVar == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ zoomOut failed with destroyed map");
            return;
        }
        float b2 = aVar.b() / 2.0f;
        float c2 = aVar.c() / 2.0f;
        if (aVar.a() != null) {
            b2 = aVar.a().x;
            c2 = aVar.a().y;
        }
        this.z.e.f(b2, c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int[] iArr, int i) {
        Object[] objArr = {view, iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6a7f3c9ef198674014a9bfdcb32bf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6a7f3c9ef198674014a9bfdcb32bf9");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        layoutParams.leftMargin = iArr[0];
        layoutParams.topMargin = iArr[1];
        layoutParams.rightMargin = iArr[2];
        layoutParams.bottomMargin = iArr[3];
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, byte] */
    @Override // com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener
    public final void a(int i, final CameraPosition cameraPosition) {
        Object[] objArr = {Integer.valueOf(i), cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd09a50c0c0b2b89eacda5de453bf7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd09a50c0c0b2b89eacda5de453bf7fd");
            return;
        }
        if (i == 12 || i == 13) {
            ?? r0 = i == 12 ? 1 : 0;
            Object[] objArr2 = {Byte.valueOf((byte) r0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2397c74ce2ffb5063948f72ba49aa796", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2397c74ce2ffb5063948f72ba49aa796");
            } else if (this.L != r0) {
                this.L = r0;
                if (r0 != 0) {
                    this.o.a(com.sankuai.waimai.launcher.util.image.a.a(this.z.c.getContext().getResources(), (int) R.drawable.mtmapsdk_map_logo));
                    if (!this.M) {
                        this.F[3] = d[3];
                        b();
                    }
                } else {
                    this.o.a(com.sankuai.waimai.launcher.util.image.a.a(this.z.c.getResources(), (int) R.drawable.here_map_logo));
                    if (!this.M) {
                        this.F[3] = x;
                        b();
                    }
                }
            }
        }
        if (i == 5 || i == 4) {
            com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.j.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15a3afd07d0621fe8b6d1f1261844818", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15a3afd07d0621fe8b6d1f1261844818");
                        return;
                    }
                    if (j.this.r != null) {
                        j.this.r.a(cameraPosition.zoom);
                    }
                    j.a(j.this, cameraPosition);
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d2697fca7393f8c824ef511e6fd5f6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d2697fca7393f8c824ef511e6fd5f6");
        } else if (view == this.A) {
            d dVar = this.z;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "4b20e3ab9e44f9781656e387c71c851c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "4b20e3ab9e44f9781656e387c71c851c");
            } else if (dVar.i) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ animateToMyLocation failed with destroyed map");
            } else {
                dVar.g.c();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.widgets.IndoorControlView.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25253077622dc463f91dfbfe82ab822a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25253077622dc463f91dfbfe82ab822a");
        } else {
            this.z.setIndoorFloor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.widgets.d.a
    public final boolean a(com.sankuai.meituan.mapsdk.core.widgets.b bVar) {
        CameraPosition cameraPosition;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0aefa0ed4b3444aaeade3386bb24aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0aefa0ed4b3444aaeade3386bb24aa6")).booleanValue();
        }
        if (bVar != this.s || (cameraPosition = this.z.getCameraPosition()) == null) {
            return false;
        }
        this.z.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(cameraPosition).bearing(0.0f).tilt(0.0f).build()), 300L, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;

        private a() {
            Object[] objArr = {j.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a34931dbb9be336c80747f343bdebbea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a34931dbb9be336c80747f343bdebbea");
                return;
            }
            this.b = true;
            this.c = true;
            this.d = true;
            this.e = true;
            this.f = true;
            this.g = true;
            this.h = true;
        }
    }
}
