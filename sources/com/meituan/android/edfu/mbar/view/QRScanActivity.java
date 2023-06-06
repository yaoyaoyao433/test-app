package com.meituan.android.edfu.mbar.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.edfu.camerainterface.cameraDevice.c;
import com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView;
import com.meituan.android.edfu.mbar.camera.decode.a;
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
public class QRScanActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a = null;
    private static int p = 2130969160;
    private float A;
    private float B;
    private e.a C;
    private e.b D;
    private EdfuCameraView.a E;
    private a F;
    EdfuCameraView b;
    private d c;
    private c d;
    private com.meituan.android.edfu.mbar.camera.a e;
    private e f;
    private h g;
    private boolean h;
    private ScanAnimView i;
    private ImageView j;
    private ImageView k;
    private TextView l;
    private float m;
    private boolean n;
    private Rect o;
    private boolean q;
    private boolean r;
    private boolean s;
    private i t;
    private long u;
    private boolean v;
    private boolean w;
    private l x;
    private boolean y;
    private boolean z;

    public QRScanActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1f37d8b7fa7a316f940f89ebadb0be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1f37d8b7fa7a316f940f89ebadb0be");
            return;
        }
        this.m = 0.5f;
        this.n = true;
        this.s = true;
        this.v = true;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = new e.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.util.e.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c13ebb8e9b3d72d84ebbeb52eb81cfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c13ebb8e9b3d72d84ebbeb52eb81cfc");
                } else if (z && !QRScanActivity.this.h && QRScanActivity.this.s && QRScanActivity.this.b()) {
                    QRScanActivity.this.f.c = null;
                }
            }
        };
        this.D = new e.b() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.util.e.b
            public final void a(float f) {
                Object[] objArr2 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3de6b4c86158a3db034448d9e2475581", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3de6b4c86158a3db034448d9e2475581");
                } else {
                    QRScanActivity.this.A = f;
                }
            }
        };
        this.E = new EdfuCameraView.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16c607def7d49cf0a47daed2875adddb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16c607def7d49cf0a47daed2875adddb");
                } else if (i == 1 && !QRScanActivity.this.z) {
                    m.a().a(System.currentTimeMillis());
                    QRScanActivity.a(QRScanActivity.this, true);
                }
            }
        };
        this.F = new a() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a(@NonNull com.meituan.android.edfu.mbar.camera.decode.impl.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e08ff4927c9d9b6d69a5e60d766b92ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e08ff4927c9d9b6d69a5e60d766b92ca");
                    return;
                }
                l lVar = new l(aVar.c, com.meituan.android.edfu.mbar.util.a.QR_CODE);
                lVar.d = aVar.a;
                lVar.e = aVar.b;
                lVar.c = aVar.f;
                lVar.b = aVar.e;
                lVar.g = aVar.d;
                QRScanActivity.this.x = lVar;
                QRScanActivity.this.a(lVar);
                QRScanActivity.e(QRScanActivity.this);
                System.currentTimeMillis();
                long unused = QRScanActivity.this.u;
                QRScanActivity.b(QRScanActivity.this, true);
                if (!QRScanActivity.this.y) {
                    QRScanActivity.c(QRScanActivity.this, true);
                    QRScanActivity.this.c();
                }
                QRScanActivity.this.e.b();
            }

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73622e450593f69acb4122f717432538", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73622e450593f69acb4122f717432538");
                } else if (m.t) {
                } else {
                    QRScanActivity.this.d.h();
                }
            }

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a(float f) {
                Object[] objArr2 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29fc2059a76ba8290223791ea88c7869", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29fc2059a76ba8290223791ea88c7869");
                } else if (QRScanActivity.this.n) {
                } else {
                    QRScanActivity.this.d.a(f);
                }
            }

            @Override // com.meituan.android.edfu.mbar.camera.decode.a
            public final void a(com.meituan.android.edfu.mbar.camera.decode.impl.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da5e8247d8e10a4486acf0096d16c058", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da5e8247d8e10a4486acf0096d16c058");
                } else if (QRScanActivity.this.g == null || QRScanActivity.this.d == null) {
                } else {
                    QRScanActivity.this.B = cVar.b;
                }
            }
        };
    }

    public static /* synthetic */ boolean a(QRScanActivity qRScanActivity, boolean z) {
        qRScanActivity.z = true;
        return true;
    }

    public static /* synthetic */ boolean b(QRScanActivity qRScanActivity, boolean z) {
        qRScanActivity.w = true;
        return true;
    }

    public static /* synthetic */ boolean c(QRScanActivity qRScanActivity, boolean z) {
        qRScanActivity.y = true;
        return true;
    }

    public static /* synthetic */ void e(QRScanActivity qRScanActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, qRScanActivity, changeQuickRedirect, false, "9870845906c6eceb6d597626c1c119fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, qRScanActivity, changeQuickRedirect, false, "9870845906c6eceb6d597626c1c119fd");
            return;
        }
        m.a().a("mbar_process_alltime_QR", (float) (System.currentTimeMillis() - qRScanActivity.u));
        if (qRScanActivity.t == null || qRScanActivity.t.d) {
            try {
                ((Vibrator) qRScanActivity.getSystemService("vibrator")).vibrate(10L);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ boolean e(QRScanActivity qRScanActivity, boolean z) {
        qRScanActivity.v = false;
        return false;
    }

    public static /* synthetic */ boolean f(QRScanActivity qRScanActivity, boolean z) {
        qRScanActivity.q = false;
        return false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        View inflate;
        Rect rect;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed716f19ccfc2f51af353e89c589dbd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed716f19ccfc2f51af353e89c589dbd0");
            return;
        }
        super.onCreate(bundle);
        this.u = System.currentTimeMillis();
        getWindow().addFlags(128);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c08d7e1c2c485f7ef3537a11309d2e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c08d7e1c2c485f7ef3537a11309d2e5b");
        } else {
            setContentView(R.layout.activity_q_r_scan);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.preview_parent_view);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec9bba14f898fd9c3dc651af7bd9c086", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec9bba14f898fd9c3dc651af7bd9c086");
            } else {
                this.b = (EdfuCameraView) findViewById(R.id.cameraView);
                if (this.t != null && !TextUtils.isEmpty(this.t.k)) {
                    this.b.setPrivacyToken(this.t.k);
                }
                this.b.setFacing(EdfuCameraView.c);
                this.d = this.b.getCameraController();
                this.d.m = false;
                this.b.setCameraDataCallback(new c.a() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.edfu.camerainterface.cameraDevice.c.a
                    public final void a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
                        Object[] objArr4 = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9e56901001deb5db22fa5989ca97f2e3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9e56901001deb5db22fa5989ca97f2e3");
                            return;
                        }
                        com.meituan.android.edfu.edfucamera.argorithm.e eVar = new com.meituan.android.edfu.edfucamera.argorithm.e();
                        eVar.b = i;
                        eVar.c = i2;
                        eVar.f = bArr;
                        eVar.d = i3;
                        eVar.i = 1;
                        eVar.e = i5;
                        QRScanActivity.this.e.a(bArr, i, i2, false, null, eVar, !QRScanActivity.this.y);
                        if (QRScanActivity.this.v) {
                            m.a().b(System.currentTimeMillis());
                            QRScanActivity.e(QRScanActivity.this, false);
                        }
                        if (m.t) {
                            QRScanActivity.this.d.h();
                        }
                    }
                });
                this.b.a(this.E);
            }
            int i = p;
            if (-1 != i && (inflate = View.inflate(this, i, viewGroup)) != null) {
                Object[] objArr4 = {inflate};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "906eba3e2aa222fc3a7b8bdc6e55d59c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "906eba3e2aa222fc3a7b8bdc6e55d59c");
                } else {
                    int i2 = p;
                    if (i2 == i2) {
                        Context applicationContext = getApplicationContext();
                        Object[] objArr5 = {applicationContext};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "055ce30ff841e3f2dc017bfff5e30a45", RobustBitConfig.DEFAULT_VALUE)) {
                            rect = (Rect) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "055ce30ff841e3f2dc017bfff5e30a45");
                        } else {
                            Display defaultDisplay = ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            point2.x = point.y;
                            point2.y = point.x;
                            int min = Math.min(a(point2.y, 240, 1200), a(point2.x, 240, 675));
                            int i3 = min - 35;
                            if (i3 <= 0) {
                                i3 = min;
                            }
                            int i4 = (point2.y - min) / 2;
                            int i5 = ((point2.x - i3) / 2) - 45;
                            if (i5 <= 0) {
                                i5 = (point2.x - i3) / 2;
                            }
                            rect = new Rect(i4, i5, min + i4, i3 + i5);
                        }
                        this.o = rect;
                        this.i = (ScanAnimView) findViewById(R.id.mbar_anim_view);
                        this.i.setRect(this.o);
                        ScanAnimView scanAnimView = this.i;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = ScanAnimView.a;
                        if (PatchProxy.isSupport(objArr6, scanAnimView, changeQuickRedirect6, false, "05a15d42c6663b366f04c10b58d0eb4a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, scanAnimView, changeQuickRedirect6, false, "05a15d42c6663b366f04c10b58d0eb4a");
                        } else {
                            scanAnimView.invalidate();
                        }
                        this.k = (ImageView) findViewById(R.id.mbar_flashlight);
                        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.8
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr7 = {view};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5d929b955dc3e8b0a56e79a62cce4232", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5d929b955dc3e8b0a56e79a62cce4232");
                                } else {
                                    QRScanActivity.this.b();
                                }
                            }
                        });
                        this.l = (TextView) findViewById(R.id.mbar_tip);
                        Rect rect2 = this.o;
                        Object[] objArr7 = {rect2};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d5fecb02c140d017823116dc7acacd20", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d5fecb02c140d017823116dc7acacd20");
                        } else {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
                            int i6 = rect2.bottom;
                            Object[] objArr8 = {22};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            layoutParams.topMargin = i6 + (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "6c7e89e985f3498cc3c3b53600a97a72", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "6c7e89e985f3498cc3c3b53600a97a72")).intValue() : (int) (getResources().getDisplayMetrics().density * 22.0f));
                            this.l.setLayoutParams(layoutParams);
                            this.l.setVisibility(0);
                        }
                        this.j = (ImageView) findViewById(R.id.mbar_icon_back);
                        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.9
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr9 = {view};
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "aecaebe8cc9774c9638bc000f3634ada", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "aecaebe8cc9774c9638bc000f3634ada");
                                    return;
                                }
                                QRScanActivity qRScanActivity = QRScanActivity.this;
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = QRScanActivity.a;
                                if (PatchProxy.isSupport(objArr10, qRScanActivity, changeQuickRedirect10, false, "942ce83117691b263dff8645fd27fa7b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, qRScanActivity, changeQuickRedirect10, false, "942ce83117691b263dff8645fd27fa7b");
                                    return;
                                }
                                if (qRScanActivity.b != null) {
                                    qRScanActivity.b.c();
                                }
                                qRScanActivity.finish();
                            }
                        });
                    }
                }
            }
        }
        this.c = new d(getApplicationContext());
        this.e = new com.meituan.android.edfu.mbar.camera.a(getApplicationContext(), this.F);
        this.f = new e(getApplicationContext(), 5.0f);
        this.f.c = this.C;
        this.f.d = this.D;
        this.g = new h();
        g.a(getApplicationContext());
        this.c.b = new com.meituan.android.edfu.mbar.camera.decode.e() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mbar.camera.decode.e
            public final void a(float f, float f2, float f3) {
                Object[] objArr9 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "779f955277dffa88d5727cea2e56a542", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "779f955277dffa88d5727cea2e56a542");
                } else if (Math.abs(f) <= QRScanActivity.this.m || Math.abs(f2) <= QRScanActivity.this.m || Math.abs(f3) <= QRScanActivity.this.m) {
                    QRScanActivity.this.n = false;
                } else {
                    QRScanActivity.this.n = true;
                }
            }
        };
        m.a().w = true;
        m.a().m.a(this.u);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a7bf8ba7bfca243c99e30b771c9360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a7bf8ba7bfca243c99e30b771c9360");
            return;
        }
        super.onResume();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85108bc669722c4e09eb5fcaf4470bf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85108bc669722c4e09eb5fcaf4470bf2");
        } else if (isDestroyed()) {
        } else {
            this.e.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9d52a385c375dfa8ff84ee34337bff4c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9d52a385c375dfa8ff84ee34337bff4c")).booleanValue();
            } else if (!this.q) {
                String str = "cv-test";
                if (this.t != null && !TextUtils.isEmpty(this.t.k)) {
                    str = this.t.k;
                }
                int a2 = Privacy.createPermissionGuard().a(this, PermissionGuard.PERMISSION_CAMERA, str);
                if (a2 > 0) {
                    z = true;
                } else {
                    this.q = true;
                    this.r = a2 != -4;
                    Privacy.createPermissionGuard().a((Activity) this, PermissionGuard.PERMISSION_CAMERA, str, (com.meituan.android.privacy.interfaces.d) new com.meituan.android.privacy.interfaces.g() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.7
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.privacy.interfaces.d
                        public final void onResult(String str2, int i) {
                            Object[] objArr4 = {str2, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "89d98b5d9c32d81bae2d1315843ac2a6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "89d98b5d9c32d81bae2d1315843ac2a6");
                            } else if (i <= 0) {
                                String str3 = "cv-test";
                                if (QRScanActivity.this.t != null && !TextUtils.isEmpty(QRScanActivity.this.t.k)) {
                                    str3 = QRScanActivity.this.t.k;
                                }
                                boolean z2 = Privacy.createPermissionGuard().a(QRScanActivity.this, PermissionGuard.PERMISSION_CAMERA, str3) != -4;
                                if (QRScanActivity.this.r || QRScanActivity.this.r != z2) {
                                    QRScanActivity.this.a();
                                } else if (z2) {
                                } else {
                                    new AlertDialog.Builder(QRScanActivity.this).setMessage(R.string.mbar_camera_permission_desc).setPositiveButton(R.string.mbar_camera_permission_ok, new DialogInterface.OnClickListener() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.7.3
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            Object[] objArr5 = {dialogInterface, Integer.valueOf(i2)};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ab01aa6e9fc15e9615d11116bee82f26", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ab01aa6e9fc15e9615d11116bee82f26");
                                                return;
                                            }
                                            QRScanActivity.f(QRScanActivity.this, false);
                                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                            intent.setData(Uri.parse("package:" + QRScanActivity.this.getPackageName()));
                                            QRScanActivity.this.startActivity(intent);
                                        }
                                    }).setNegativeButton(R.string.mbar_camera_permission_cancel, new DialogInterface.OnClickListener() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.7.2
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            Object[] objArr5 = {dialogInterface, Integer.valueOf(i2)};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3ef337849202490211c94c7865981fe3", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3ef337849202490211c94c7865981fe3");
                                            } else {
                                                QRScanActivity.this.a();
                                            }
                                        }
                                    }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.android.edfu.mbar.view.QRScanActivity.7.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnCancelListener
                                        public final void onCancel(DialogInterface dialogInterface) {
                                            Object[] objArr5 = {dialogInterface};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a22fe813fc088cb54cdfb6948d0a1ca1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a22fe813fc088cb54cdfb6948d0a1ca1");
                                            } else {
                                                QRScanActivity.this.a();
                                            }
                                        }
                                    }).show();
                                }
                            } else {
                                m.a().m.a(System.currentTimeMillis());
                                QRScanActivity.f(QRScanActivity.this, false);
                                QRScanActivity.this.b.a();
                                m.a().a("mbar_camera_permission", (float) (System.currentTimeMillis() - QRScanActivity.this.u));
                            }
                        }
                    });
                }
            }
            if (z) {
                this.b.a();
            }
            this.f.a();
            if (this.c != null) {
                this.c.a();
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95848afaa960abc473b85422653160bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95848afaa960abc473b85422653160bb");
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb54328d72194fd63516bb912ecb654f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb54328d72194fd63516bb912ecb654f");
            return;
        }
        super.onPause();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b01385079a51b4b0d09dddccbcdebe48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b01385079a51b4b0d09dddccbcdebe48");
            return;
        }
        if (this.e.c()) {
            this.e.b();
        }
        if (this.b != null) {
            this.b.b();
            this.f.b();
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbb1c172ae4227311eb56c745dd13d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbb1c172ae4227311eb56c745dd13d1");
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb903445472a1638abd3dd705ced269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb903445472a1638abd3dd705ced269");
            return;
        }
        super.onDestroy();
        long currentTimeMillis = System.currentTimeMillis() - this.u;
        m.a().b();
        m.a().a("mbar_page_alltime", (float) currentTimeMillis);
        m.a().c();
        if (this.b != null) {
            this.b.b(this.E);
        }
        if (this.b != null) {
            this.b.c();
        }
        if (this.i != null) {
            ScanAnimView scanAnimView = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = ScanAnimView.a;
            if (PatchProxy.isSupport(objArr2, scanAnimView, changeQuickRedirect2, false, "4c354791335b79d10baa21a22261f593", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, scanAnimView, changeQuickRedirect2, false, "4c354791335b79d10baa21a22261f593");
            } else if (scanAnimView.b != null) {
                scanAnimView.b.cancel();
                scanAnimView.b.end();
                scanAnimView.b = null;
                scanAnimView.c = false;
            }
        }
        if (!this.y) {
            this.y = true;
            c();
        }
        g.e = false;
        this.g = null;
        g.b();
        com.meituan.android.edfu.mbar.camera.a aVar = this.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.mbar.camera.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "dd7d93eebde5cc95372a2de53ccc7829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "dd7d93eebde5cc95372a2de53ccc7829");
        }
        this.f.d = null;
        m.a().w = false;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f2e25babbd9082c65820d3c6cca5d396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f2e25babbd9082c65820d3c6cca5d396");
            return;
        }
        b.i = 0;
        b.g = 0;
        this.s = true;
        f.j = null;
        b.e = false;
        b.f = false;
        b.h = 1;
        b.j = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7075bfec66181b0f314990b883c8ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7075bfec66181b0f314990b883c8ed8");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.u;
        CvLogRecord cvLogRecord = new CvLogRecord();
        if (this.w && this.x != null) {
            z = true;
        }
        cvLogRecord.setMBarScanSuccess(z);
        cvLogRecord.setScanDuration(currentTimeMillis);
        cvLogRecord.setDetectSuccess(com.meituan.android.edfu.mbar.camera.decode.impl.e.e);
        if (this.x != null) {
            cvLogRecord.setScanResult(this.x.f);
        }
        m.a().a(cvLogRecord);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0ce705f0d34e5a873c75eb9e778a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0ce705f0d34e5a873c75eb9e778a9f");
        } else {
            finish();
        }
    }

    private int a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), 240, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6738a851ecaf17b199a8c708bc3c0d52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6738a851ecaf17b199a8c708bc3c0d52")).intValue();
        }
        int i4 = (i * 5) / 8;
        if (i4 < 240) {
            return 240;
        }
        return i4 > i3 ? i3 : i4;
    }

    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79622205ed68edbf46f20b10ec759cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79622205ed68edbf46f20b10ec759cda");
        } else if (iVar == null) {
        } else {
            this.t = iVar;
            b.i = iVar.c;
            b.g = iVar.b;
            this.s = iVar.e;
            f.j = iVar.j;
            b.e = iVar.f;
            b.f = iVar.h;
            b.h = iVar.i;
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71165cc3ec79ab74d9a93951dfa5b6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71165cc3ec79ab74d9a93951dfa5b6e")).booleanValue();
        }
        if (this.b != null && this.b.getPreviewStart() && this.b.getCameraController().i()) {
            if (!this.h) {
                this.b.setFlash(2);
                if (com.meituan.android.edfu.mbar.util.c.c()) {
                    this.d.a(Math.max(this.d.g(), -4));
                }
                this.h = true;
                h.b = true;
            } else {
                this.b.setFlash(0);
                this.h = false;
                h.b = false;
            }
        }
        if (this.k != null) {
            this.k.setImageResource(this.h ? R.drawable.mbar_flashlight_on : R.drawable.mbar_flashlight_off);
        }
        return this.h;
    }

    public void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4883592ed202a0aff890ae0e16f3c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4883592ed202a0aff890ae0e16f3c0b");
        } else {
            finish();
        }
    }
}
