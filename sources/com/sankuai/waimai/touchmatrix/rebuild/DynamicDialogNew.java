package com.sankuai.waimai.touchmatrix.rebuild;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.dialog.SafeTouchDialog;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.rebuild.factory.TypeViewFactory;
import com.sankuai.waimai.touchmatrix.utils.g;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DynamicDialogNew implements com.sankuai.waimai.touchmatrix.dialog.b {
    public static final int BACK_PRESSED_BEHAVIOR_DISMISS = 0;
    public static final int BACK_PRESSED_BEHAVIOR_IGNORE = 1;
    public static final int BACK_PRESSED_BEHAVIOR_PASS_THROUGH = 2;
    private static final int TIME_OUT = 3000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private a builder;
    private Dialog dialog;
    private e dialogContextImpl;
    public boolean isDialogReadyForShowing;
    private WeakReference<View> mContentViewRef;
    private com.sankuai.waimai.touchmatrix.rebuild.factory.c mControler;
    private Runnable mDelayCheck;
    private boolean mViewReady;
    private int refreshCount;
    private com.sankuai.waimai.touchmatrix.dialog.c refreshListener;
    public boolean shouldReportWhenShowing;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public static final e c = new e();

        public void a() {
        }

        public void b() {
        }

        public Activity c() {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface f {
        boolean a();
    }

    public static /* synthetic */ int access$1508(DynamicDialogNew dynamicDialogNew) {
        int i = dynamicDialogNew.refreshCount;
        dynamicDialogNew.refreshCount = i + 1;
        return i;
    }

    public DynamicDialogNew(@Nonnull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad212afcf62e511a280f9c914f9b3648", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad212afcf62e511a280f9c914f9b3648");
            return;
        }
        this.refreshCount = 0;
        this.mViewReady = false;
        this.refreshListener = new com.sankuai.waimai.touchmatrix.dialog.c() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.touchmatrix.dialog.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7914b7c59af45085f7dc8ba6111b3948", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7914b7c59af45085f7dc8ba6111b3948");
                } else {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.c(" RefreshListener  Mach 渲染完成 ", new Object[0]);
                }
            }
        };
        this.mDelayCheck = new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d34c51bb9f14f5555664c35d2be0c53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d34c51bb9f14f5555664c35d2be0c53");
                } else if (!DynamicDialogNew.this.mViewReady) {
                    DynamicDialogNew.this.onShowFailed();
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("业务方超过3s未返回 View,展示失败", new Object[0]);
                } else {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.a("业务方已返回 View", new Object[0]);
                    DynamicDialogNew.this.mViewReady = false;
                }
            }
        };
        this.dialogContextImpl = new e() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a66c57646cb5a0be1247057568124071", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a66c57646cb5a0be1247057568124071");
                } else if (DynamicDialogNew.this.builder.i != null) {
                    DynamicDialogNew.this.builder.i.a(false);
                } else {
                    DynamicDialogNew.this.dismiss();
                }
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.e
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b76ab7eac7474901631942013643342", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b76ab7eac7474901631942013643342");
                    return;
                }
                DynamicDialogNew.this.isDialogReadyForShowing = true;
                DynamicDialogNew.this.shouldReportWhenShowing = true;
                DynamicDialogNew.this.showDialogIfShould();
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.e
            public final Activity c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e64cca2767d82014e9db9e8736f4da3d", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e64cca2767d82014e9db9e8736f4da3d") : DynamicDialogNew.this.builder.b();
            }
        };
        this.mControler = new com.sankuai.waimai.touchmatrix.rebuild.factory.c() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.c
            public final Activity a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92df5293b1894afadbfda445ecf362cb", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92df5293b1894afadbfda445ecf362cb") : DynamicDialogNew.this.dialogContextImpl.c();
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa35ec95db8bc840c899f1e1e388d049", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa35ec95db8bc840c899f1e1e388d049");
                } else {
                    DynamicDialogNew.this.dialogContextImpl.b();
                }
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.c
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1681cdd939a7e84449982717f43b624d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1681cdd939a7e84449982717f43b624d");
                } else {
                    DynamicDialogNew.this.dialog.dismiss();
                }
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.c
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f360ac7037c446c9f8cf3c194dd20dae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f360ac7037c446c9f8cf3c194dd20dae");
                } else {
                    DynamicDialogNew.this.dialogContextImpl.a();
                }
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.c
            public final b e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ce3b0eb2d6204cdd4a4ead3d893d50b3", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ce3b0eb2d6204cdd4a4ead3d893d50b3") : DynamicDialogNew.this.builder.k;
            }

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.c
            public final Window f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3ad667e21342e6791e659e83c8fbbc1a", RobustBitConfig.DEFAULT_VALUE) ? (Window) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3ad667e21342e6791e659e83c8fbbc1a") : DynamicDialogNew.this.dialog.getWindow();
            }
        };
        this.builder = aVar;
    }

    private Dialog createDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a9595558016244fc3e596aa9294e47", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a9595558016244fc3e596aa9294e47");
        }
        Activity b2 = this.builder.b();
        if (b2 == null) {
            return null;
        }
        SafeTouchDialog safeTouchDialog = new SafeTouchDialog(b2, R.style.TMatrixMachDialogTheme) { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.3
            public static ChangeQuickRedirect b;

            @Override // android.app.Dialog
            public void onBackPressed() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e3f24ff2947f05d566479532d63904f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e3f24ff2947f05d566479532d63904f7");
                } else if (DynamicDialogNew.this.builder.j == 0) {
                    super.onBackPressed();
                }
            }
        };
        if (safeTouchDialog.getWindow() != null) {
            if (this.builder.j == 2) {
                safeTouchDialog.getWindow().addFlags(8);
            }
            int a2 = this.builder.c.a();
            safeTouchDialog.getWindow().requestFeature(1);
            safeTouchDialog.getWindow().getDecorView();
            safeTouchDialog.getWindow().setLayout(-1, -2);
            if (a2 == 4) {
                safeTouchDialog.getWindow().setGravity(17);
                safeTouchDialog.getWindow().setWindowAnimations(2131558832);
                safeTouchDialog.getWindow().setDimAmount(0.8f);
            } else {
                safeTouchDialog.getWindow().setWindowAnimations(2131558833);
                safeTouchDialog.getWindow().setGravity(48);
                safeTouchDialog.getWindow().addFlags(512);
                safeTouchDialog.getWindow().addFlags(8);
                safeTouchDialog.getWindow().addFlags(32);
                safeTouchDialog.getWindow().setDimAmount(0.0f);
            }
        }
        safeTouchDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2f14d7c1c88e3184e2577e208f85baf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2f14d7c1c88e3184e2577e208f85baf");
                    return;
                }
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("开始展示触达View展示中 ...", new Object[0]);
                if (DynamicDialogNew.this.builder.e) {
                    j a3 = j.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = j.a;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "7bcf8a2fad1a29aad1f9dc298365a5df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "7bcf8a2fad1a29aad1f9dc298365a5df");
                    } else {
                        a3.b.a(13000, "tmatrix/status/dialog", 0);
                        a3.b(13000);
                    }
                }
                if (DynamicDialogNew.this.builder.g != null) {
                    DynamicDialogNew.this.builder.g.onShow(dialogInterface);
                }
            }
        });
        if (this.builder.h != null) {
            safeTouchDialog.setOnDismissListener(this.builder.h);
        }
        if (this.builder.d != null) {
            this.builder.d.a(safeTouchDialog, this.builder.c);
        }
        return safeTouchDialog;
    }

    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc06ce2aea1c5b6091fad27c9e8a3efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc06ce2aea1c5b6091fad27c9e8a3efa");
            return;
        }
        if (this.dialog == null) {
            this.dialog = createDialog();
            if (this.dialog == null) {
                onShowFailed();
                return;
            } else {
                this.dialog.show();
                this.dialog.hide();
            }
        }
        try {
            attachContentView();
        } catch (Exception unused) {
            onShowFailed();
        }
    }

    public void showDialogIfShould() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b787c866a2a8ee283578d87b5d5e5266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b787c866a2a8ee283578d87b5d5e5266");
            return;
        }
        Activity b2 = this.builder.b();
        if (b2 != null && !b2.isFinishing() && this.builder.b.a()) {
            this.dialog.show();
            if (this.shouldReportWhenShowing) {
                if (this.refreshCount > 1) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.touchmatrix.monitor.b.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "cf480dbe547aa733ad50074b1b4e3f1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "cf480dbe547aa733ad50074b1b4e3f1f");
                    } else {
                        com.sankuai.waimai.touchmatrix.monitor.b.a(18901);
                    }
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.touchmatrix.monitor.b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "2419d085de05c98c71e9f0549a3c8de7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "2419d085de05c98c71e9f0549a3c8de7");
                    } else {
                        com.sankuai.waimai.touchmatrix.monitor.b.a(18900);
                    }
                }
                this.shouldReportWhenShowing = false;
            }
            if (this.builder.f != null) {
                this.builder.f.a();
            }
            if (this.builder.e) {
                j.a().a(true, this.builder.c.k.bizId, b2.getClass().getSimpleName());
                return;
            }
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("DynamicDialogNew  showDialogIfShould(), 展示条件校验失败, 展示失败", new Object[0]);
    }

    private void attachContentView() {
        List a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a766f847b2d5c10a93c0872d75a81ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a766f847b2d5c10a93c0872d75a81ee9");
            return;
        }
        final a.C1348a b2 = com.sankuai.waimai.touchmatrix.a.a().b(this.builder.c.k.bizId);
        if (b2 == null) {
            onShowFailed();
            return;
        }
        TypeViewFactory typeViewFactory = b2.g;
        if (typeViewFactory == null) {
            typeViewFactory = new com.sankuai.waimai.touchmatrix.rebuild.mach.f();
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("typeViewFactory == null ,使用 默认 MachTypeViewFactory", new Object[0]);
        }
        if (!aa.a(this.builder.c.k.businessContainer) && (a2 = com.sankuai.meituan.serviceloader.b.a(TypeViewFactory.class, this.builder.c.k.businessContainer)) != null && a2.size() > 0) {
            typeViewFactory = (TypeViewFactory) a2.get(0);
        }
        if (typeViewFactory instanceof com.sankuai.waimai.touchmatrix.rebuild.mach.f) {
            ((com.sankuai.waimai.touchmatrix.rebuild.mach.f) typeViewFactory).b = this.dialogContextImpl;
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("请求要展示的触达View", new Object[0]);
        typeViewFactory.a(this.builder.c, this.mControler, new com.sankuai.waimai.touchmatrix.rebuild.factory.e() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.touchmatrix.rebuild.factory.e
            public final void a(View view, boolean z) {
                Object[] objArr2 = {view, (byte) 0};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c1f7adcd047f4c681d52c6963ef589f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c1f7adcd047f4c681d52c6963ef589f");
                    return;
                }
                DynamicDialogNew.this.mViewReady = true;
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.a("清除  DelayCheck", new Object[0]);
                ad.b(DynamicDialogNew.this.mDelayCheck);
                Activity b3 = DynamicDialogNew.this.builder.b();
                if (b3 != null) {
                    DynamicDialogNew.this.mContentViewRef = new WeakReference(view);
                    com.sankuai.waimai.touchmatrix.rebuild.mach.a aVar = view instanceof com.sankuai.waimai.touchmatrix.rebuild.mach.a ? (com.sankuai.waimai.touchmatrix.rebuild.mach.a) view : null;
                    com.sankuai.waimai.touchmatrix.dialog.gesture.d dVar = new com.sankuai.waimai.touchmatrix.dialog.gesture.d(b3);
                    dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    if (DynamicDialogNew.this.builder.c.k.touchMode == 8) {
                        com.sankuai.waimai.touchmatrix.dialog.gesture.b bVar = new com.sankuai.waimai.touchmatrix.dialog.gesture.b(dVar, DynamicDialogNew.this, true);
                        bVar.e = b2.k;
                        bVar.d = new com.sankuai.waimai.touchmatrix.dialog.gesture.c() { // from class: com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.5.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.touchmatrix.dialog.gesture.c
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bc65f48edca6a3c82c6b2bae75a3bb94", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bc65f48edca6a3c82c6b2bae75a3bb94");
                                    return;
                                }
                                if (DynamicDialogNew.this.builder.e) {
                                    JudasManualManager.b("b_waimai_fz6jyh81_mc").a(com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(DynamicDialogNew.this.builder.b())).b(DynamicDialogNew.this.builder.c.e()).a("biz", g.a(DynamicDialogNew.this.builder.c)).a("template_id", DynamicDialogNew.this.builder.c.f()).a();
                                }
                                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("手势上滑关闭 上报灵犀  bid: b_waimai_fz6jyh81_mc", new Object[0]);
                                Activity c2 = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(DynamicDialogNew.this.builder.c);
                                if (DynamicDialogNew.this.builder.e) {
                                    j.a().a(1, DynamicDialogNew.this.builder.c.k.bizId, c2 != null ? c2.getClass().getSimpleName() : "");
                                }
                                if (DynamicDialogNew.this.builder.i != null) {
                                    DynamicDialogNew.this.builder.i.a(true);
                                }
                            }
                        };
                        dVar.setGestureDelegate(bVar);
                    }
                    dVar.addView(view);
                    DynamicDialogNew.this.dialog.setContentView(dVar);
                    DynamicDialogNew.access$1508(DynamicDialogNew.this);
                    if (aVar != null) {
                        aVar.a(DynamicDialogNew.this.builder.c.k.businessData, DynamicDialogNew.this.refreshListener);
                        return;
                    }
                    return;
                }
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("请求展示触达View失败 ，view " + view + " activity: " + b3, new Object[0]);
                DynamicDialogNew.this.onShowFailed();
            }
        });
        if (this.mViewReady) {
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.a("添加延时Delay 3s 等待业务方View返回", new Object[0]);
        ad.a(this.mDelayCheck, PayTask.j);
    }

    public View getContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3751afa234b0a84cc2b0a4dd566886de", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3751afa234b0a84cc2b0a4dd566886de");
        }
        if (this.mContentViewRef != null) {
            return this.mContentViewRef.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onShowFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3a7007a0283b376a60fb20093c56012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3a7007a0283b376a60fb20093c56012");
        } else if (this.builder.e) {
            com.sankuai.waimai.touchmatrix.rebuild.message.b.a().b();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.dialog.b
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "775e91794f70059ae7a2c70de329f5e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "775e91794f70059ae7a2c70de329f5e6");
        } else if (this.dialog == null || !this.dialog.isShowing()) {
        } else {
            try {
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("触达View消失 ", new Object[0]);
                this.dialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d7eecb0954742c11196a1194410c2dc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d7eecb0954742c11196a1194410c2dc")).booleanValue() : this.dialog != null && this.dialog.isShowing();
    }

    public Dialog getDialog() {
        return this.dialog;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @NonNull
        f b;
        public com.sankuai.waimai.touchmatrix.data.a c;
        public com.sankuai.waimai.touchmatrix.show.d d;
        public boolean e;
        public d f;
        @Nullable
        public DialogInterface.OnShowListener g;
        @Nullable
        public DialogInterface.OnDismissListener h;
        public c i;
        public int j;
        public b k;
        private WeakReference<Activity> l;

        public a(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7938c6cd2d0c1c2aa0fe57d193673573", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7938c6cd2d0c1c2aa0fe57d193673573");
                return;
            }
            this.e = true;
            this.j = 0;
            this.l = new WeakReference<>(activity);
        }

        public final a a(f fVar) {
            if (fVar != null) {
                this.b = fVar;
            }
            return this;
        }

        public final DynamicDialogNew a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c56ea55e8d976a2c358d057149bf28a", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDialogNew) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c56ea55e8d976a2c358d057149bf28a") : new DynamicDialogNew(this);
        }

        public final Activity b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebaa20c82767792f57ce3a85caa9b69", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebaa20c82767792f57ce3a85caa9b69");
            }
            if (this.l == null || this.l.get() == null) {
                return null;
            }
            return this.l.get();
        }
    }
}
