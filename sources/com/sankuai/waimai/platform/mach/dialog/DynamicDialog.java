package com.sankuai.waimai.platform.mach.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.widget.dialog.SafeTouchDialog;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DynamicDialog implements com.sankuai.waimai.platform.mach.dialog.g {
    public static final int BACK_PRESSED_BEHAVIOR_DISMISS = 0;
    public static final int BACK_PRESSED_BEHAVIOR_IGNORE = 1;
    public static final int BACK_PRESSED_BEHAVIOR_PASS_THROUGH = 2;
    public static final int HEIGHT_MODE_FULL_SCREEN = 1;
    public static final int HEIGHT_MODE_UNSPECIFIC = 0;
    public static final int HEIGHT_MODE_WRAP_CONTENT = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private a builder;
    private int currentAlertType;
    private Dialog dialog;
    private com.sankuai.waimai.platform.mach.dialog.d dialogContentView;
    private d dialogContextImpl;
    private boolean isDialogReadyForShowing;
    private boolean isDialogRefreshing;
    private AlertInfo pendingAlertInfo;
    private int refreshCount;
    private j refreshListener;
    private boolean shouldReportWhenShowing;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, Map<String, String> map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface e {
        boolean a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface f {
        void a(String str, Map<String, Object> map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface g {
        void a(View view, @NonNull AlertInfo.HeaderInfo headerInfo);

        void b(View view, @NonNull AlertInfo.HeaderInfo headerInfo);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface h {
        com.sankuai.waimai.platform.mach.dialog.e a(Activity activity, AlertInfo.Module module);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface i {
        void a();
    }

    public DynamicDialog(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd256f83f22d91db3d067251ebe0cdab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd256f83f22d91db3d067251ebe0cdab");
            return;
        }
        this.refreshCount = 0;
        this.refreshListener = new j() { // from class: com.sankuai.waimai.platform.mach.dialog.DynamicDialog.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.dialog.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "864e4d1fe10a806927af2582761bdbaf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "864e4d1fe10a806927af2582761bdbaf");
                    return;
                }
                DynamicDialog.this.isDialogRefreshing = false;
                DynamicDialog.this.refreshWithPendingAlertInfo();
            }
        };
        this.dialogContextImpl = new d() { // from class: com.sankuai.waimai.platform.mach.dialog.DynamicDialog.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c70a6fe84cff2a8ce658c4e3d359059f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c70a6fe84cff2a8ce658c4e3d359059f");
                } else if (DynamicDialog.this.builder.d == null) {
                    DynamicDialog.this.dismiss();
                } else {
                    DynamicDialog.this.builder.d.a();
                }
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "90df08bb31d719fd1fc8662a8e639deb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "90df08bb31d719fd1fc8662a8e639deb");
                } else if (DynamicDialog.this.builder.u == null) {
                    DynamicDialog.this.dismiss();
                } else {
                    DynamicDialog.this.builder.u.a();
                }
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            @Nullable
            public final f c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1da52e4d5ed08c57d4859ba9fec8b29b", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1da52e4d5ed08c57d4859ba9fec8b29b") : DynamicDialog.this.builder.c;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            @Nullable
            public final b d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2011919e1c5d9a9e359ad0d1466c69f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2011919e1c5d9a9e359ad0d1466c69f") : DynamicDialog.this.builder.t;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b0471c314a5e667377a9a6f7250654bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b0471c314a5e667377a9a6f7250654bc");
                    return;
                }
                DynamicDialog.this.isDialogReadyForShowing = true;
                DynamicDialog.this.shouldReportWhenShowing = true;
                DynamicDialog.this.showDialogIfShould();
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final com.sankuai.waimai.mach.d f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8af517f36c3402daa1ad15084f70ffce", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8af517f36c3402daa1ad15084f70ffce") : DynamicDialog.this.builder.z;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final String g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b511c6a9f0581a60d012b59c1108aa42", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b511c6a9f0581a60d012b59c1108aa42") : DynamicDialog.this.builder.A;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final Activity h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20f4493945cf7c1f269039b69e9d850e", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20f4493945cf7c1f269039b69e9d850e") : DynamicDialog.this.builder.s;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            @NonNull
            public final Map<String, Object> i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e13de301a1ac723deff0542e249b84aa", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e13de301a1ac723deff0542e249b84aa") : new HashMap(DynamicDialog.this.builder.B);
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final h j() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "39d41d4bc3d93c8e48ec2e1c90ccbc6b", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "39d41d4bc3d93c8e48ec2e1c90ccbc6b") : DynamicDialog.this.builder.n;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final com.sankuai.waimai.platform.mach.dialog.i k() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a0729ff3bf053cd1c98b52f151a0a22b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.mach.dialog.i) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a0729ff3bf053cd1c98b52f151a0a22b") : DynamicDialog.this.builder.p;
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.d
            public final g l() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de35bab88fd333f7297d123f49860520", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de35bab88fd333f7297d123f49860520") : DynamicDialog.this.builder.D;
            }
        };
        this.builder = aVar;
        this.pendingAlertInfo = aVar.i;
    }

    private Dialog createDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfb02132c2f52be0e02ffeeec178b5be", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfb02132c2f52be0e02ffeeec178b5be");
        }
        SafeTouchDialog safeTouchDialog = new SafeTouchDialog(this.builder.s, R.style.MachDialogTheme) { // from class: com.sankuai.waimai.platform.mach.dialog.DynamicDialog.3
            public static ChangeQuickRedirect a;

            @Override // android.app.Dialog
            public void onBackPressed() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c13d8042494a87fe0728689a1c34566c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c13d8042494a87fe0728689a1c34566c");
                } else if (DynamicDialog.this.builder.m == 0) {
                    super.onBackPressed();
                }
            }
        };
        if (safeTouchDialog.getWindow() != null) {
            safeTouchDialog.getWindow().addFlags(512);
            if (this.builder.m == 2) {
                safeTouchDialog.getWindow().addFlags(8);
            } else {
                int unused = this.builder.m;
            }
            safeTouchDialog.getWindow().requestFeature(1);
            safeTouchDialog.getWindow().setWindowAnimations(this.builder.b);
            safeTouchDialog.getWindow().getDecorView();
            safeTouchDialog.getWindow().setLayout(-1, -1);
            if (this.builder.e) {
                safeTouchDialog.getWindow().setFlags(67108864, 67108864);
                safeTouchDialog.getWindow().setFlags(134217728, 134217728);
                safeTouchDialog.getWindow().setFlags(1024, 1024);
                int b2 = com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a);
                Window window = safeTouchDialog.getWindow();
                if (b2 == 0) {
                    b2 = -1;
                }
                window.setLayout(-1, b2);
            }
            safeTouchDialog.getWindow().setGravity(this.builder.f);
            if (this.builder.k) {
                safeTouchDialog.getWindow().addFlags(32);
            }
        }
        if (this.builder.g != null) {
            safeTouchDialog.setOnDismissListener(this.builder.g);
        }
        if (this.builder.h != null) {
            safeTouchDialog.setOnShowListener(this.builder.h);
        }
        return safeTouchDialog;
    }

    @Deprecated
    public void show(@Nullable AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "953fa824b43b197712bb3b770c752693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "953fa824b43b197712bb3b770c752693");
        } else {
            refresh(alertInfo);
        }
    }

    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "732e048132253b5a43d1d99a0bf6a933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "732e048132253b5a43d1d99a0bf6a933");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("DynamicDialog", "dynamic dialog-- show---", new Object[0]);
        if (this.isDialogReadyForShowing) {
            showDialogIfShould();
        } else {
            refreshWithPendingAlertInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialogIfShould() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fb24ae5a91d01d4f7a06a18e608f3a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fb24ae5a91d01d4f7a06a18e608f3a1");
        } else if (this.builder.s.isFinishing() || !this.builder.C.a()) {
        } else {
            this.dialog.show();
            if (this.builder.o != null) {
                this.builder.o.a();
            }
            if (this.shouldReportWhenShowing) {
                if (this.refreshCount > 1) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.mach.dialog.a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "5b743d5f2a625855fb589d45a7c25f51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "5b743d5f2a625855fb589d45a7c25f51");
                    } else {
                        com.sankuai.waimai.platform.mach.dialog.a.a(18901);
                    }
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.mach.dialog.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "d56e74700d169b5b41fdedbff95f6e2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "d56e74700d169b5b41fdedbff95f6e2e");
                    } else {
                        com.sankuai.waimai.platform.mach.dialog.a.a(18900);
                    }
                }
                this.shouldReportWhenShowing = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshWithPendingAlertInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "073c9c057d851b6e267aa60db675bcdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "073c9c057d851b6e267aa60db675bcdb");
        } else if (this.pendingAlertInfo != null) {
            AlertInfo alertInfo = this.pendingAlertInfo;
            this.pendingAlertInfo = null;
            refresh(alertInfo);
        }
    }

    public final void refresh(@Nullable AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad817e70742a51144775a0aca42b98b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad817e70742a51144775a0aca42b98b3");
        } else if (com.sankuai.waimai.foundation.utils.f.a(this.builder.s) || alertInfo == null || alertInfo.modules == null) {
        } else {
            if (this.dialog == null) {
                this.dialog = createDialog();
                this.dialog.show();
                this.dialog.hide();
            }
            if (this.isDialogRefreshing) {
                this.pendingAlertInfo = alertInfo;
                return;
            }
            attachContentView(alertInfo.alertType);
            this.isDialogRefreshing = true;
            this.refreshCount++;
            this.dialogContentView.refresh(alertInfo, this.refreshListener);
            final WindowManager.LayoutParams attributes = this.dialog.getWindow().getAttributes();
            if (alertInfo.alertType == 1 || attributes.height != -1) {
                return;
            }
            this.dialogContentView.post(new Runnable() { // from class: com.sankuai.waimai.platform.mach.dialog.DynamicDialog.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88b1f7dbcdf83d02f007c56401dea648", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88b1f7dbcdf83d02f007c56401dea648");
                    } else if (com.sankuai.waimai.foundation.utils.f.a(DynamicDialog.this.builder.s)) {
                    } else {
                        int height = DynamicDialog.this.dialogContentView.getHeight();
                        int d2 = com.sankuai.waimai.foundation.utils.g.d(DynamicDialog.this.builder.s);
                        com.sankuai.waimai.foundation.utils.log.a.c("dialog_test_y", "refresh---dialogHeight:" + height + ", screenRealH:" + d2, new Object[0]);
                        if (height < d2 - com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 100.0f)) {
                            int e2 = d2 + com.sankuai.waimai.foundation.utils.g.e(DynamicDialog.this.builder.s);
                            Window window = DynamicDialog.this.dialog.getWindow();
                            int i2 = attributes.width;
                            if (e2 == 0) {
                                e2 = -1;
                            }
                            window.setLayout(i2, e2);
                        }
                    }
                }
            });
        }
    }

    private void attachContentView(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c234110f6aec21bfb02cfb25f090dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c234110f6aec21bfb02cfb25f090dfc");
        } else if (this.currentAlertType != i2 || this.dialogContentView == null) {
            this.currentAlertType = i2;
            int i3 = -2;
            if (i2 == 1) {
                this.dialogContentView = new PartiallyDynamicDialogContentView(this.builder.s);
                if (this.dialog.getWindow() != null) {
                    float a2 = com.sankuai.waimai.foundation.utils.g.a((Context) this.builder.s);
                    int i4 = (int) (this.builder.v * a2);
                    if (this.builder.j == 1) {
                        i3 = -1;
                    } else {
                        int unused = this.builder.j;
                    }
                    this.dialog.getWindow().setLayout(i4, i3);
                    if (this.builder.w) {
                        ((PartiallyDynamicDialogContentView) this.dialogContentView).setViewWidth((int) (a2 * this.builder.x));
                        ((PartiallyDynamicDialogContentView) this.dialogContentView).setCanceledOnTouchBg(this.builder.y);
                    }
                }
            } else {
                this.dialogContentView = new FullyDynamicDialogContentView(this.builder.s);
                if (this.dialog.getWindow() != null && !this.builder.q) {
                    this.dialog.getWindow().setDimAmount(0.0f);
                }
                i3 = (this.builder.j == 1 || this.builder.j != 2) ? -1 : -1;
                if (this.dialog.getWindow() != null) {
                    this.dialog.getWindow().setLayout(-1, i3);
                }
            }
            this.dialogContentView.attachDialogContext(this.dialogContextImpl);
            if (this.builder.l != null) {
                this.dialogContentView.setGestureDelegate(this.builder.l.a(this.dialogContentView, this));
            }
            this.dialog.setContentView(this.dialogContentView);
        }
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.g
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13926bf8f2acb20d8d59fa13c0b9543b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13926bf8f2acb20d8d59fa13c0b9543b");
        } else if (this.dialog == null || !this.dialog.isShowing()) {
        } else {
            try {
                this.dialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "955eb5f94f8dbea48191bb76e71bbe05", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "955eb5f94f8dbea48191bb76e71bbe05")).booleanValue() : this.dialog != null && this.dialog.isShowing();
    }

    public Dialog getDialog() {
        return this.dialog;
    }

    public View getCloseView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e181ad432797e78ac1468091304e34be", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e181ad432797e78ac1468091304e34be");
        }
        if (this.dialogContentView instanceof PartiallyDynamicDialogContentView) {
            return ((PartiallyDynamicDialogContentView) this.dialogContentView).getCloseView();
        }
        return null;
    }

    public View getContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e1a9edc55a854258aa562808abe2b9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e1a9edc55a854258aa562808abe2b9d");
        }
        if (this.dialogContentView instanceof PartiallyDynamicDialogContentView) {
            return ((PartiallyDynamicDialogContentView) this.dialogContentView).getContentView();
        }
        if (this.dialogContentView instanceof FullyDynamicDialogContentView) {
            return ((FullyDynamicDialogContentView) this.dialogContentView).getContentView();
        }
        return null;
    }

    public View getBgView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72254a860adfc23f9fae6fe6c7f9bb28", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72254a860adfc23f9fae6fe6c7f9bb28");
        }
        if (this.dialogContentView instanceof FullyDynamicDialogContentView) {
            return ((FullyDynamicDialogContentView) this.dialogContentView).getBgView();
        }
        return null;
    }

    public Map<String, View> getMachTagViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0906e280391943123ac3a3c3f3bf6af7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0906e280391943123ac3a3c3f3bf6af7");
        }
        if (this.dialogContentView instanceof FullyDynamicDialogContentView) {
            return ((FullyDynamicDialogContentView) this.dialogContentView).getMachTagViews();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static final e r = new e() { // from class: com.sankuai.waimai.platform.mach.dialog.DynamicDialog.a.1
            @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.e
            public final boolean a() {
                return true;
            }
        };
        private String A;
        private Map<String, Object> B;
        @NonNull
        private e C;
        private g D;
        @StyleRes
        public int b;
        @Nullable
        public f c;
        public c d;
        public boolean e;
        public int f;
        @Nullable
        public DialogInterface.OnDismissListener g;
        @Nullable
        public DialogInterface.OnShowListener h;
        public AlertInfo i;
        public int j;
        public boolean k;
        @Nullable
        public com.sankuai.waimai.platform.mach.dialog.gesture.c l;
        public int m;
        public h n;
        public com.sankuai.waimai.platform.mach.dialog.b o;
        public com.sankuai.waimai.platform.mach.dialog.i p;
        public boolean q;
        @NonNull
        private Activity s;
        @Nullable
        private b t;
        private i u;
        private float v;
        private boolean w;
        private float x;
        private boolean y;
        private com.sankuai.waimai.mach.d z;

        public a(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa73dc5888d5444fca078ab0ab7fba3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa73dc5888d5444fca078ab0ab7fba3");
                return;
            }
            this.v = 1.0f;
            this.w = false;
            this.A = "";
            this.B = new HashMap();
            this.C = r;
            this.j = 0;
            this.m = 0;
            this.q = false;
            this.s = activity;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f570278460968b2930a165359d83f724", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f570278460968b2930a165359d83f724");
            }
            if (!TextUtils.isEmpty(str)) {
                this.A = str;
            }
            return this;
        }

        public final a a(e eVar) {
            if (eVar != null) {
                this.C = eVar;
            }
            return this;
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7feb47a954dc92dcf6ac51a0e53dea2f", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7feb47a954dc92dcf6ac51a0e53dea2f");
            }
            if (map != null) {
                this.B.putAll(map);
            }
            return this;
        }

        public final DynamicDialog a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac585dcdbf4df7eacfe54b3f0cbd484", RobustBitConfig.DEFAULT_VALUE)) {
                return (DynamicDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac585dcdbf4df7eacfe54b3f0cbd484");
            }
            if (this.v == 1.0f && this.j == 1) {
                this.w = true;
            }
            return new DynamicDialog(this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d {
        public static ChangeQuickRedirect c;
        public static final d d = new d();

        public void a() {
        }

        public void b() {
        }

        @Nullable
        public f c() {
            return null;
        }

        @Nullable
        public b d() {
            return null;
        }

        public void e() {
        }

        public com.sankuai.waimai.mach.d f() {
            return null;
        }

        public String g() {
            return "";
        }

        public Activity h() {
            return null;
        }

        public h j() {
            return null;
        }

        public com.sankuai.waimai.platform.mach.dialog.i k() {
            return null;
        }

        public g l() {
            return null;
        }

        public Map<String, Object> m() {
            return null;
        }

        public Map<String, String> n() {
            return null;
        }

        @NonNull
        public Map<String, Object> i() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2779f0ed11035f31d342045d0a094d6b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2779f0ed11035f31d342045d0a094d6b") : new HashMap();
        }
    }
}
