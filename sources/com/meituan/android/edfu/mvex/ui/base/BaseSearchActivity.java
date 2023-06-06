package com.meituan.android.edfu.mvex.ui.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView;
import com.meituan.android.edfu.mvex.ui.widget.AlbumButtonView;
import com.meituan.android.edfu.mvex.ui.widget.ImageLoadingView;
import com.meituan.android.edfu.mvex.ui.widget.LightButton;
import com.meituan.android.edfu.mvex.ui.widget.TitleView;
import com.meituan.android.edfu.mvex.utils.d;
import com.meituan.android.edfu.mvex.utils.e;
import com.meituan.android.edfu.mvex.utils.sensor.a;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseSearchActivity extends AppCompatActivity implements TitleView.a {
    private static final String a = "BaseSearchActivity";
    public static ChangeQuickRedirect b;
    protected TextView c;
    protected TextView d;
    protected ViewGroup e;
    public Handler f;
    private EdfuCameraView g;
    private AlbumButtonView h;
    private LightButton i;
    private TitleView j;
    private ViewGroup k;
    private ImageLoadingView l;
    private boolean m;
    private a n;
    private d o;
    private d.a p;
    private boolean q;
    private boolean r;
    private AlbumButtonView.a s;
    private Runnable t;
    private Runnable u;
    private long v;

    public void a() {
    }

    public void a(byte[] bArr) {
    }

    public void b() {
    }

    public BaseSearchActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848049a911127ada7befb35efcf4e9cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848049a911127ada7befb35efcf4e9cb");
            return;
        }
        this.p = new d.a() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mvex.utils.d.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "446aa56ca8edf32e8275e0d6d38560f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "446aa56ca8edf32e8275e0d6d38560f4");
                } else if (z) {
                    BaseSearchActivity.this.i.setVisibility(0);
                } else if (BaseSearchActivity.this.m) {
                } else {
                    BaseSearchActivity.this.i.setVisibility(8);
                }
            }
        };
        this.s = new AnonymousClass4();
        this.t = new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9fdf7e0c0599289a974e6ab9e9764ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9fdf7e0c0599289a974e6ab9e9764ad");
                } else if (NetWorkUtils.isNetworkConnected(BaseSearchActivity.this.getApplicationContext())) {
                    BaseSearchActivity.this.d.setVisibility(8);
                    if (BaseSearchActivity.this.c != null) {
                        BaseSearchActivity.this.c.setVisibility(0);
                        BaseSearchActivity.this.f.removeCallbacks(BaseSearchActivity.this.t);
                        BaseSearchActivity.this.f.postDelayed(BaseSearchActivity.this.t, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                    }
                }
            }
        };
        this.u = new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f3f0ad07309e039fe0890990f737055", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f3f0ad07309e039fe0890990f737055");
                } else if (BaseSearchActivity.this.c != null) {
                    BaseSearchActivity.this.c.setVisibility(8);
                    BaseSearchActivity.this.f.removeCallbacks(BaseSearchActivity.this.u);
                    BaseSearchActivity.this.f.postDelayed(BaseSearchActivity.this.u, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
            }
        };
        this.v = 0L;
    }

    public static /* synthetic */ void a(BaseSearchActivity baseSearchActivity, byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseSearchActivity, changeQuickRedirect, false, "c44757c5d6a3d338ccbc37463f336c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseSearchActivity, changeQuickRedirect, false, "c44757c5d6a3d338ccbc37463f336c90");
        } else if (!NetWorkUtils.isNetworkConnected(baseSearchActivity.getApplicationContext())) {
            baseSearchActivity.d.setVisibility(0);
            baseSearchActivity.c.setVisibility(8);
        } else {
            baseSearchActivity.d.setVisibility(8);
            baseSearchActivity.a(bArr);
        }
    }

    public static /* synthetic */ boolean b(BaseSearchActivity baseSearchActivity, boolean z) {
        baseSearchActivity.q = false;
        return false;
    }

    public static /* synthetic */ boolean c(BaseSearchActivity baseSearchActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseSearchActivity, changeQuickRedirect, false, "328e3031634739d41a4b847b473c926c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, baseSearchActivity, changeQuickRedirect, false, "328e3031634739d41a4b847b473c926c")).booleanValue();
        }
        if (!NetWorkUtils.isNetworkConnected(baseSearchActivity.getApplicationContext())) {
            baseSearchActivity.d.setVisibility(0);
            baseSearchActivity.c.setVisibility(8);
            return false;
        }
        baseSearchActivity.d.setVisibility(8);
        return true;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements AlbumButtonView.a {
        public static ChangeQuickRedirect a;

        public AnonymousClass4() {
        }

        @Override // com.meituan.android.edfu.mvex.ui.widget.AlbumButtonView.a
        public final void a(final String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def0d0d4347035feba0c8f5437bea8e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def0d0d4347035feba0c8f5437bea8e8");
            } else {
                b.a(c.a(), new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.4.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4578426790e7e455174bc0ac6e12cda", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4578426790e7e455174bc0ac6e12cda");
                            return;
                        }
                        try {
                            final Bitmap a2 = com.meituan.android.edfu.mvex.utils.c.a(str);
                            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            a2.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                            BaseSearchActivity.this.runOnUiThread(new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.4.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f39904a459345ea7288b06166782cd9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f39904a459345ea7288b06166782cd9");
                                    } else if (BaseSearchActivity.c(BaseSearchActivity.this)) {
                                        BaseSearchActivity.this.a(a2);
                                        BaseSearchActivity.a(BaseSearchActivity.this, byteArrayOutputStream.toByteArray());
                                        Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(BaseSearchActivity.this), "b_group_8vd1l9me_mc", (Map<String, Object>) null, "c_group_rtj4cvhh");
                                    }
                                }
                            });
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc38f6de640d259e039e0c71a480458a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc38f6de640d259e039e0c71a480458a");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_base_search);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f39b8b2ddc71e0788bc258a27767ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f39b8b2ddc71e0788bc258a27767ec0");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7e60a7eb6578632847a486030dcf82c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7e60a7eb6578632847a486030dcf82c");
            } else {
                this.k = (ViewGroup) findViewById(R.id.container_loading);
                this.l = (ImageLoadingView) findViewById(R.id.loadingview);
                this.l.setListener(new ImageLoadingView.a() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.edfu.mvex.ui.widget.ImageLoadingView.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bccbe801e0e31229aa1576f78e2ba281", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bccbe801e0e31229aa1576f78e2ba281");
                            return;
                        }
                        BaseSearchActivity.this.b();
                        Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(BaseSearchActivity.this), "b_group_c8d2imxy_mc", (Map<String, Object>) null, "c_group_rtj4cvhh");
                    }
                });
                this.e = (ViewGroup) findViewById(R.id.container_state);
                this.j = (TitleView) findViewById(R.id.titleview);
                this.j.setTitleBarListener(this);
                this.c = (TextView) findViewById(R.id.text_tips);
                this.d = (TextView) findViewById(R.id.text_networktips);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ffa8a8a6f7b5636988826f31830c8548", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ffa8a8a6f7b5636988826f31830c8548");
            } else {
                this.h = (AlbumButtonView) findViewById(R.id.search_album);
                this.h.setResultListener(this.s);
                this.i = (LightButton) findViewById(R.id.btn_light);
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "39b5a4a7e9c0d12411e7a8f2affb2177", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "39b5a4a7e9c0d12411e7a8f2affb2177");
            } else {
                this.g = (EdfuCameraView) findViewById(R.id.cameraView);
                this.g.setPrivacyToken(com.meituan.android.edfu.mvex.constants.a.a());
                this.g.setFacing(EdfuCameraView.c);
                this.g.a(true, true);
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = b;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2bfdd0b1528c11fb9f157c83c98a86fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2bfdd0b1528c11fb9f157c83c98a86fe");
        } else {
            this.o = new d(getApplicationContext(), 10.0f);
            this.n = new a(getApplicationContext());
            this.n.d = new com.meituan.android.edfu.mvex.utils.sensor.c() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.edfu.mvex.utils.sensor.c
                public final void a(int i) {
                    Object[] objArr7 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "eb68beccd3af868e3897fa7b302e6294", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "eb68beccd3af868e3897fa7b302e6294");
                    } else {
                        BaseSearchActivity.this.a(i);
                    }
                }
            };
            this.f = new Handler(getMainLooper());
            this.f.removeCallbacks(this.t);
            this.f.postDelayed(this.t, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
        e.a().d = getApplicationContext();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e716ad992df03553867e43ad810de702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e716ad992df03553867e43ad810de702");
            return;
        }
        super.onResume();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03c2c3f12288999d0759e199e4adcc48", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03c2c3f12288999d0759e199e4adcc48")).booleanValue();
        } else {
            if (!this.q) {
                int a2 = Privacy.createPermissionGuard().a(this, PermissionGuard.PERMISSION_CAMERA, com.meituan.android.edfu.mvex.constants.a.a());
                com.meituan.android.edfu.utils.c a3 = com.meituan.android.edfu.utils.c.a();
                a3.a("MVEX", " permission result: " + a2);
                if (a2 > 0) {
                    z = true;
                } else {
                    this.q = true;
                    this.r = a2 != -4;
                    Privacy.createPermissionGuard().a((Activity) this, PermissionGuard.PERMISSION_CAMERA, com.meituan.android.edfu.mvex.constants.a.a(), (com.meituan.android.privacy.interfaces.d) new g() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.3
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.privacy.interfaces.d
                        public final void onResult(String str, int i) {
                            Object[] objArr3 = {str, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6e3e7e317114167164ba0397b192aed", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6e3e7e317114167164ba0397b192aed");
                            } else if (i > 0) {
                                BaseSearchActivity.b(BaseSearchActivity.this, false);
                                BaseSearchActivity.this.g.a();
                                BaseSearchActivity.this.o.d = BaseSearchActivity.this.p;
                            } else {
                                boolean z2 = Privacy.createPermissionGuard().a(BaseSearchActivity.this, PermissionGuard.PERMISSION_CAMERA, com.meituan.android.edfu.mvex.constants.a.a()) != -4;
                                if (BaseSearchActivity.this.r || BaseSearchActivity.this.r != z2) {
                                    BaseSearchActivity.this.finish();
                                } else if (z2) {
                                } else {
                                    BaseSearchActivity baseSearchActivity = BaseSearchActivity.this;
                                    AlertDialog.Builder onCancelListener = new AlertDialog.Builder(baseSearchActivity).setMessage(R.string.mvex_camera_permission_desc).setPositiveButton(R.string.mvex_camera_permission_ok, new DialogInterface.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.3.3
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a98081628e5a2342d8b9343475589fdd", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a98081628e5a2342d8b9343475589fdd");
                                                return;
                                            }
                                            BaseSearchActivity.b(BaseSearchActivity.this, false);
                                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                            intent.setData(Uri.parse("package:" + BaseSearchActivity.this.getPackageName()));
                                            BaseSearchActivity.this.startActivity(intent);
                                        }
                                    }).setNegativeButton(R.string.mvex_camera_permission_cancel, new DialogInterface.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.3.2
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0e372719fdb065e212a3879322b3d605", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0e372719fdb065e212a3879322b3d605");
                                            } else {
                                                BaseSearchActivity.this.finish();
                                            }
                                        }
                                    }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.3.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.content.DialogInterface.OnCancelListener
                                        public final void onCancel(DialogInterface dialogInterface) {
                                            Object[] objArr4 = {dialogInterface};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2ca08b5a4100a5e7165b2fe4e1f6c467", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2ca08b5a4100a5e7165b2fe4e1f6c467");
                                            } else {
                                                BaseSearchActivity.this.finish();
                                            }
                                        }
                                    });
                                    if (baseSearchActivity == null || baseSearchActivity.isFinishing()) {
                                        return;
                                    }
                                    onCancelListener.show();
                                }
                            }
                        }
                    });
                }
            }
            z = false;
        }
        if (z) {
            this.g.a();
            this.o.d = this.p;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "775fe1139baf816ffe9dff8bf0c013c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "775fe1139baf816ffe9dff8bf0c013c3");
            return;
        }
        d dVar = this.o;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = d.a;
        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "830c1196803cafe0549094112c2b0e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "830c1196803cafe0549094112c2b0e31");
        } else if (dVar.c != null) {
            dVar.b = dVar.c.getDefaultSensor(5);
            if (dVar.b != null) {
                dVar.c.registerListener(dVar, dVar.b, 2);
            }
        }
        a aVar = this.n;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "9f09cbb44d6b409603d777eb18db3759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "9f09cbb44d6b409603d777eb18db3759");
        } else if (aVar.e != null) {
            aVar.g.registerListener(aVar, aVar.e, 3);
        } else if (aVar.f != null) {
            aVar.g.registerListener(aVar, aVar.f, 3);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8233e21162a18c9eed60cc2a4e22e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8233e21162a18c9eed60cc2a4e22e9");
            return;
        }
        super.onPause();
        this.g.b();
        a(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b55f393973c84c84a5c7dc54d2f3c260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b55f393973c84c84a5c7dc54d2f3c260");
            return;
        }
        d dVar = this.o;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "25aede8c18eb53858f0f5f3864e7b36d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "25aede8c18eb53858f0f5f3864e7b36d");
        } else {
            if (dVar.b != null) {
                dVar.c.unregisterListener(dVar);
                dVar.b = null;
            }
            if (dVar.e != null) {
                dVar.e.removeCallbacksAndMessages(null);
            }
        }
        a aVar = this.n;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "bbed4fdddc6ab0da8bfe4aeff244fcb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "bbed4fdddc6ab0da8bfe4aeff244fcb8");
        } else {
            aVar.g.unregisterListener(aVar);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af4049bc7230fd4eb43b878658ee437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af4049bc7230fd4eb43b878658ee437");
            return;
        }
        super.onDestroy();
        if (this.g != null) {
            this.g.c();
        }
        if (this.f != null) {
            this.f.removeCallbacks(this.t);
            this.f.removeCallbacks(this.u);
        }
        if (this.o != null) {
            d dVar = this.o;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "19e4a26878cf0a6dd778a6d8ef3acc4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "19e4a26878cf0a6dd778a6d8ef3acc4b");
            } else {
                dVar.e.removeCallbacksAndMessages(null);
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676593582b176f5eb8045f6d46ac7ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676593582b176f5eb8045f6d46ac7ef9");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.h != null) {
            AlbumButtonView albumButtonView = this.h;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = AlbumButtonView.a;
            if (PatchProxy.isSupport(objArr2, albumButtonView, changeQuickRedirect2, false, "488af78a4400fa1244ad432724b20a06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, albumButtonView, changeQuickRedirect2, false, "488af78a4400fa1244ad432724b20a06");
            } else if (i2 != -1) {
                albumButtonView.a();
            } else if (i == 1) {
                if (intent != null) {
                    if (albumButtonView.b != null) {
                        Context context = albumButtonView.getContext();
                        Uri data = intent.getData();
                        Object[] objArr3 = {context, data};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.mvex.utils.c.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "dc5728552f8a4f63e4509d76b9250ba1", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "dc5728552f8a4f63e4509d76b9250ba1");
                        } else {
                            a2 = Build.VERSION.SDK_INT >= 19 ? com.meituan.android.edfu.mvex.utils.c.a(context, data) : "";
                        }
                        albumButtonView.b.a(a2);
                    }
                } else {
                    albumButtonView.a();
                }
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    public void onShutterClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd68a92a31814250a1331b0af0e1f23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd68a92a31814250a1331b0af0e1f23e");
            return;
        }
        if (this.v != 0) {
            if (System.currentTimeMillis() - this.v < 500) {
                return;
            }
            this.v = System.currentTimeMillis();
        } else {
            this.v = System.currentTimeMillis();
        }
        Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(this), "b_group_2q01u6zz_mc", (Map<String, Object>) null, "c_group_rtj4cvhh");
        rx.d.a(new j<Bitmap>() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.9
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5034d98a037261a884a3bf0154c178c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5034d98a037261a884a3bf0154c178c");
                } else if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                        if (BaseSearchActivity.c(BaseSearchActivity.this)) {
                            BaseSearchActivity.this.a(bitmap);
                            BaseSearchActivity.a(BaseSearchActivity.this, byteArrayOutputStream.toByteArray());
                            BaseSearchActivity.this.a(false);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }, rx.d.a((d.a) new d.a<Bitmap>() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.10
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "736c254e1b5d75a3d20cb58c987dc0b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "736c254e1b5d75a3d20cb58c987dc0b0");
                    return;
                }
                if (BaseSearchActivity.this.g != null) {
                    EdfuCameraView edfuCameraView = BaseSearchActivity.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = EdfuCameraView.b;
                    jVar.onNext(PatchProxy.isSupport(objArr3, edfuCameraView, changeQuickRedirect3, false, "43903799b027bb00673d9d62335657e9", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr3, edfuCameraView, changeQuickRedirect3, false, "43903799b027bb00673d9d62335657e9") : edfuCameraView.e.getBitmap());
                }
                jVar.onCompleted();
            }
        }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    public void onLightClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e55183b54c651e17a54c0b90897898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e55183b54c651e17a54c0b90897898");
        } else if (this.g != null && this.g.getPreviewStart() && this.g.getCameraController().i()) {
            if (!this.m) {
                this.i.setLightState(true);
                a(true);
                return;
            }
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a6c169750b3e21e0fd5d1e83600827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a6c169750b3e21e0fd5d1e83600827");
            return;
        }
        this.g.setFlash(z ? 2 : 0);
        this.m = z;
        this.i.setLightState(z);
    }

    @Override // com.meituan.android.edfu.mvex.ui.widget.TitleView.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f94a9f492b1f556323198e30c68c73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f94a9f492b1f556323198e30c68c73");
        } else {
            finish();
        }
    }

    public final void a(final Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8898745e6f1569a390a0940083eab731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8898745e6f1569a390a0940083eab731");
        } else {
            runOnUiThread(new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5eef7f4f3f64184bc2889cd463ce3235", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5eef7f4f3f64184bc2889cd463ce3235");
                    } else if (BaseSearchActivity.this.l != null) {
                        ImageLoadingView imageLoadingView = BaseSearchActivity.this.l;
                        Bitmap bitmap2 = bitmap;
                        Object[] objArr3 = {bitmap2};
                        ChangeQuickRedirect changeQuickRedirect3 = ImageLoadingView.a;
                        if (PatchProxy.isSupport(objArr3, imageLoadingView, changeQuickRedirect3, false, "7db0e635d8fd44f77e35394f61e25fb8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, imageLoadingView, changeQuickRedirect3, false, "7db0e635d8fd44f77e35394f61e25fb8");
                        } else if (bitmap2 == null) {
                        } else {
                            if (imageLoadingView.getVisibility() != 0) {
                                imageLoadingView.setVisibility(0);
                            }
                            imageLoadingView.b.setImageBitmap(bitmap2);
                        }
                    }
                }
            });
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e25b71907b6f7399826729439c3341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e25b71907b6f7399826729439c3341");
        } else {
            runOnUiThread(new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecf11be22b03b27104d9418b61cc1ae9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecf11be22b03b27104d9418b61cc1ae9");
                    } else if (BaseSearchActivity.this.l != null) {
                        ImageLoadingView imageLoadingView = BaseSearchActivity.this.l;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = ImageLoadingView.a;
                        if (PatchProxy.isSupport(objArr3, imageLoadingView, changeQuickRedirect3, false, "5893cfc0d94cf47b03f03e4f55ccef77", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, imageLoadingView, changeQuickRedirect3, false, "5893cfc0d94cf47b03f03e4f55ccef77");
                        } else {
                            imageLoadingView.setVisibility(8);
                        }
                    }
                }
            });
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6f4e0db62a766ca99dc6b3490ce1a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6f4e0db62a766ca99dc6b3490ce1a0");
            return;
        }
        switch (i) {
            case 100:
                this.f.removeCallbacks(this.t);
                this.f.postDelayed(this.t, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                return;
            case 101:
                this.f.removeCallbacks(this.u);
                this.f.postDelayed(this.u, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                return;
            default:
                return;
        }
    }
}
