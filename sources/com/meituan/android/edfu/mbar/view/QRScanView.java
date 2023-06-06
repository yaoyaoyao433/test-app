package com.meituan.android.edfu.mbar.view;

import android.content.Context;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.android.edfu.camerainterface.cameraDevice.c;
import com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView;
import com.meituan.android.edfu.mbar.camera.decode.d;
import com.meituan.android.edfu.mbar.camera.decode.f;
import com.meituan.android.edfu.mbar.util.CvLogRecord;
import com.meituan.android.edfu.mbar.util.b;
import com.meituan.android.edfu.mbar.util.e;
import com.meituan.android.edfu.mbar.util.g;
import com.meituan.android.edfu.mbar.util.h;
import com.meituan.android.edfu.mbar.util.i;
import com.meituan.android.edfu.mbar.util.l;
import com.meituan.android.edfu.mbar.util.m;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QRScanView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private com.meituan.android.edfu.mbar.camera.decode.a A;
    private d b;
    private c c;
    private EdfuCameraView d;
    private com.meituan.android.edfu.mbar.camera.a e;
    private e f;
    private h g;
    private a h;
    private boolean i;
    private float j;
    private boolean k;
    private boolean l;
    private i m;
    private long n;
    private boolean o;
    private boolean p;
    private l q;
    private boolean r;
    private boolean s;
    private com.meituan.android.edfu.mbar.camera.decode.impl.d t;
    private float u;
    private StringBuilder v;
    private float w;
    private e.a x;
    private e.b y;
    private EdfuCameraView.a z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(l lVar);
    }

    public static /* synthetic */ boolean b(QRScanView qRScanView, boolean z) {
        qRScanView.s = true;
        return true;
    }

    public static /* synthetic */ boolean c(QRScanView qRScanView, boolean z) {
        qRScanView.p = true;
        return true;
    }

    public static /* synthetic */ boolean d(QRScanView qRScanView, boolean z) {
        qRScanView.r = true;
        return true;
    }

    public static /* synthetic */ boolean e(QRScanView qRScanView, boolean z) {
        qRScanView.o = false;
        return false;
    }

    public static /* synthetic */ void h(QRScanView qRScanView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, qRScanView, changeQuickRedirect, false, "773b19fa3bbc49ba1071a7faf5592bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, qRScanView, changeQuickRedirect, false, "773b19fa3bbc49ba1071a7faf5592bc2");
        } else {
            m.a().a("mbar_process_alltime_QR", (float) (System.currentTimeMillis() - qRScanView.n));
        }
    }

    public QRScanView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67021b5acd7e7f0dd54dbc98cea41b23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67021b5acd7e7f0dd54dbc98cea41b23");
        }
    }

    public QRScanView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2686354659c631ef27133f1e0b7b6e8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2686354659c631ef27133f1e0b7b6e8c");
        }
    }

    public QRScanView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ba7524e2af100f265813e4187c23bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ba7524e2af100f265813e4187c23bd");
            return;
        }
        this.j = 0.5f;
        this.k = true;
        this.l = false;
        this.o = true;
        this.v = null;
        this.w = 0.0f;
        this.x = new e.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanView.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.util.e.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85c29ec6513cdc9ef596834378c11191", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85c29ec6513cdc9ef596834378c11191");
                } else if (z && !QRScanView.this.i && QRScanView.this.l && QRScanView.this.e()) {
                    QRScanView.this.f.c = null;
                }
            }
        };
        this.y = new e.b() { // from class: com.meituan.android.edfu.mbar.view.QRScanView.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.util.e.b
            public final void a(float f) {
                Object[] objArr2 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ba1651ebcd7d01bf397947a7a1ed416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ba1651ebcd7d01bf397947a7a1ed416");
                } else {
                    QRScanView.this.u = f;
                }
            }
        };
        this.z = new EdfuCameraView.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanView.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView.a
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b43e2ecb9a33b53c54ed85bcf3c3106e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b43e2ecb9a33b53c54ed85bcf3c3106e");
                } else if (i2 == 1 && !QRScanView.this.s) {
                    m.a().a(System.currentTimeMillis());
                    QRScanView.b(QRScanView.this, true);
                }
            }
        };
        this.A = new com.meituan.android.edfu.mbar.camera.decode.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanView.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a(@NonNull com.meituan.android.edfu.mbar.camera.decode.impl.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bb4df0b9c94bb2fa90c98e7de397d04", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bb4df0b9c94bb2fa90c98e7de397d04");
                    return;
                }
                l lVar = new l(aVar.c, com.meituan.android.edfu.mbar.util.a.QR_CODE);
                lVar.d = aVar.a;
                lVar.e = aVar.b;
                lVar.c = aVar.f;
                lVar.b = aVar.e;
                QRScanView.this.q = lVar;
                if (!QRScanView.this.p) {
                    if (QRScanView.this.h != null) {
                        QRScanView.this.h.a(lVar);
                    }
                    QRScanView.h(QRScanView.this);
                    System.currentTimeMillis();
                    long unused = QRScanView.this.n;
                    QRScanView.c(QRScanView.this, true);
                    if (!QRScanView.this.r) {
                        QRScanView.d(QRScanView.this, true);
                        QRScanView.this.f();
                    }
                }
                QRScanView.this.e.b();
            }

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f0021d943aef3404907d9167ef847fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f0021d943aef3404907d9167ef847fa");
                } else {
                    QRScanView.this.c.h();
                }
            }

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a(float f) {
                Object[] objArr2 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f6b137c68d2ce8abab33c01a61afa36", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f6b137c68d2ce8abab33c01a61afa36");
                } else if (QRScanView.this.k) {
                } else {
                    QRScanView.this.c.a(f);
                }
            }

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a(com.meituan.android.edfu.mbar.camera.decode.impl.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d53ba9a5a782b6eb7bd6ab6e49a1ed4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d53ba9a5a782b6eb7bd6ab6e49a1ed4");
                } else if (QRScanView.this.g == null || QRScanView.this.c == null) {
                } else {
                    QRScanView.this.w = cVar.b;
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70c7bdab89510f511be4c78e3ff87c67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70c7bdab89510f511be4c78e3ff87c67");
            return;
        }
        this.n = System.currentTimeMillis();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "355f2dac2a466e6f77a7057e363e1dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "355f2dac2a466e6f77a7057e363e1dbc");
        } else {
            this.d = new EdfuCameraSurface(getContext());
            if (this.m != null && !TextUtils.isEmpty(this.m.k)) {
                this.d.setPrivacyToken(this.m.k);
            }
            this.d.setFacing(EdfuCameraView.c);
            this.c = this.d.getCameraController();
            this.c.m = false;
            this.d.setCameraDataCallback(new c.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanView.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.edfu.camerainterface.cameraDevice.c.a
                public final void a(byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
                    Object[] objArr4 = {bArr, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a18fb88aa88c29143b124168c73d431c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a18fb88aa88c29143b124168c73d431c");
                        return;
                    }
                    com.meituan.android.edfu.edfucamera.argorithm.e eVar = new com.meituan.android.edfu.edfucamera.argorithm.e();
                    eVar.b = i2;
                    eVar.c = i3;
                    eVar.f = bArr;
                    eVar.d = i4;
                    eVar.i = 1;
                    eVar.e = i6;
                    QRScanView.this.e.a(bArr, i2, i3, false, null, eVar, !QRScanView.this.r);
                    if (QRScanView.this.o) {
                        m.a().b(System.currentTimeMillis());
                        QRScanView.e(QRScanView.this, false);
                    }
                }
            });
            this.d.a(this.z);
            addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        }
        this.b = new d(getContext());
        this.e = new com.meituan.android.edfu.mbar.camera.a(getContext().getApplicationContext(), this.A);
        this.f = new e(getContext(), 5.0f);
        this.f.c = this.x;
        this.f.d = this.y;
        this.g = new h();
        g.a(getContext());
        this.b.b = new com.meituan.android.edfu.mbar.camera.decode.e() { // from class: com.meituan.android.edfu.mbar.view.QRScanView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.camera.decode.e
            public final void a(float f, float f2, float f3) {
                Object[] objArr4 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b2490a1170bdb00773c578049f590fb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b2490a1170bdb00773c578049f590fb2");
                } else if (Math.abs(f) <= QRScanView.this.j || Math.abs(f2) <= QRScanView.this.j || Math.abs(f3) <= QRScanView.this.j) {
                    QRScanView.this.k = false;
                } else {
                    QRScanView.this.k = true;
                }
            }
        };
        m.a().w = true;
        m.a().m.a(this.n);
        this.t = new com.meituan.android.edfu.mbar.camera.decode.impl.d();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd35a04fd1df1b565940fe6bb9bb1387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd35a04fd1df1b565940fe6bb9bb1387");
            return;
        }
        this.e.a();
        String str = "cv-test";
        if (this.m != null && !TextUtils.isEmpty(this.m.k)) {
            str = this.m.k;
        }
        if (Privacy.createPermissionGuard().a(getContext(), PermissionGuard.PERMISSION_CAMERA, str) > 0) {
            this.d.a();
        }
        this.f.a();
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d204fc65082f90c4931a9fae1537fa26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d204fc65082f90c4931a9fae1537fa26");
            return;
        }
        if (this.e.c()) {
            this.e.b();
        }
        if (this.d != null) {
            this.d.b();
            this.f.b();
        }
        if (this.b != null) {
            this.b.b();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c67e06e9e78ca3fc360408a19cacc41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c67e06e9e78ca3fc360408a19cacc41");
            return;
        }
        this.p = false;
        this.q = null;
        this.e.a();
        this.b.a();
        this.d.getCameraController().h();
        if (this.m == null || !this.m.g) {
            return;
        }
        this.c.a(1.0f / com.meituan.android.edfu.mbar.camera.decode.impl.e.b);
        com.meituan.android.edfu.mbar.camera.decode.impl.e.b = 1.0f;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ffc402f8e48f491816f3474b3ee623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ffc402f8e48f491816f3474b3ee623");
            return;
        }
        m.a().a("mbar_page_alltime", (float) (System.currentTimeMillis() - this.n));
        m.a().b();
        if (this.d != null) {
            this.d.b(this.z);
        }
        if (this.d != null) {
            this.d.c();
        }
        if (!this.r) {
            this.r = true;
            f();
        }
        g.e = false;
        g.b();
        this.f.d = null;
        m.a().c();
        m.a().w = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "267312a52c8b1c674756015143be2ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "267312a52c8b1c674756015143be2ed2");
            return;
        }
        setScanPriority(0);
        setScanFormat(0);
        setDarkListener(true);
        setScanROI(null);
        setAutoZoomerTrigger(false);
        setMultiCodeScanTrigger(false);
        setMaxCodeNumber(1);
        setMultiFrameNumber(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7bb72943d36dd165eaf6fa24fa0a25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7bb72943d36dd165eaf6fa24fa0a25");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.n;
        CvLogRecord cvLogRecord = new CvLogRecord();
        if (this.p && this.q != null) {
            z = true;
        }
        cvLogRecord.setMBarScanSuccess(z);
        cvLogRecord.setScanDuration(currentTimeMillis);
        cvLogRecord.setDetectSuccess(com.meituan.android.edfu.mbar.camera.decode.impl.e.e);
        if (this.q != null) {
            cvLogRecord.setScanResult(this.q.f);
        }
        m.a().a(cvLogRecord);
    }

    @Deprecated
    private void setDarkListener(boolean z) {
        this.l = z;
    }

    private void setScanFormat(int i) {
        b.g = i;
    }

    @Deprecated
    private void setScanPriority(int i) {
        b.i = i;
    }

    private void setScanROI(RectF rectF) {
        f.j = rectF;
    }

    private void setAutoZoomerTrigger(boolean z) {
        b.e = z;
    }

    private void setMultiCodeScanTrigger(boolean z) {
        b.f = z;
    }

    private void setMaxCodeNumber(int i) {
        b.h = i;
    }

    private void setMultiFrameNumber(int i) {
        b.j = i;
    }

    public void setConfig(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c8a7d29bf99d793a83b846179a511d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c8a7d29bf99d793a83b846179a511d");
        } else if (iVar == null) {
        } else {
            this.m = iVar;
            setScanPriority(iVar.c);
            setScanFormat(iVar.b);
            setDarkListener(iVar.e);
            setScanROI(iVar.j);
            setAutoZoomerTrigger(iVar.f);
            setMultiCodeScanTrigger(iVar.h);
            setMultiFrameNumber(iVar.l);
            setMaxCodeNumber(iVar.i);
            if (TextUtils.isEmpty(this.m.k) || this.d == null) {
                return;
            }
            this.d.setPrivacyToken(this.m.k);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf40ba995d98bd9a47296d6b1a8ad075", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf40ba995d98bd9a47296d6b1a8ad075")).booleanValue();
        }
        if (this.d != null && this.d.getPreviewStart() && this.d.getCameraController().i()) {
            if (!this.i) {
                this.d.setFlash(2);
                if (com.meituan.android.edfu.mbar.util.c.c()) {
                    this.c.a(Math.max(this.c.g(), -4));
                }
                this.i = true;
                h.b = true;
            } else {
                this.d.setFlash(0);
                this.i = false;
                h.b = false;
            }
        }
        this.t.a = this.i;
        return this.i;
    }

    public void setOnHandleScanResult(a aVar) {
        this.h = aVar;
    }

    public String getLuxView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d396fda893d6bc00286658363cdcd79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d396fda893d6bc00286658363cdcd79");
        }
        this.v = null;
        this.v = new StringBuilder();
        this.v.append("LUX: ");
        this.v.append(this.u);
        return this.v.toString();
    }

    public String getBrightnessView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c41af8510e88aba50dfb3577b0e79232", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c41af8510e88aba50dfb3577b0e79232");
        }
        this.v = null;
        this.v = new StringBuilder();
        this.v.append("Brightness: ");
        this.v.append(this.w);
        return this.v.toString();
    }
}
