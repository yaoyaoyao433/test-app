package com.meituan.mmp.lib.load;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.engine.n;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.i;
import com.meituan.mmp.lib.update.k;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.widget.LoadingDialog;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements c {
    public static ChangeQuickRedirect a;
    final m b;
    final WeakReference<com.meituan.mmp.lib.a> c;
    volatile boolean d;
    private final com.meituan.mmp.lib.config.a e;

    public static /* synthetic */ void a(e eVar, final com.meituan.mmp.lib.a aVar, final a aVar2, final LoadingDialog loadingDialog, final String str) {
        Object[] objArr = {aVar, aVar2, loadingDialog, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "4432ad1a51ff39b0d11be6da58d99eba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "4432ad1a51ff39b0d11be6da58d99eba");
        } else {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.load.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    ab y;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62128d97d79f4c31959ff941924bad31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62128d97d79f4c31959ff941924bad31");
                    } else if (aVar == null || aVar.h()) {
                    } else {
                        if (loadingDialog != null) {
                            loadingDialog.dismiss();
                        }
                        if (!aVar.u() && ((y = aVar.y()) == null || y.c() == 0)) {
                            com.meituan.mmp.lib.a aVar3 = aVar;
                            aVar3.d("PageManager:" + str);
                        }
                        bb.a("加载模块失败, 请重试", new Object[0]);
                    }
                }
            });
        }
    }

    public e(com.meituan.mmp.lib.config.a aVar, m mVar, com.meituan.mmp.lib.a aVar2) {
        Object[] objArr = {aVar, mVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff96f8a593e4845ce29a808fbe43e85d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff96f8a593e4845ce29a808fbe43e85d");
            return;
        }
        this.d = true;
        this.e = aVar;
        this.b = mVar;
        this.c = new WeakReference<>(aVar2);
    }

    @Override // com.meituan.mmp.lib.load.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5c91707257856f8997b1e3a263a9f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5c91707257856f8997b1e3a263a9f6")).booleanValue();
        }
        com.meituan.mmp.lib.a aVar = this.c.get();
        if (aVar == null || aVar.h() || this.e == null || this.e.l == null) {
            return false;
        }
        MMPPackageInfo subPackageByPath = this.e.l.getSubPackageByPath(MMPEnvHelper.getContext(), str);
        if (subPackageByPath == null) {
            return true;
        }
        com.meituan.mmp.lib.engine.e eVar = this.b.h;
        Object[] objArr2 = {subPackageByPath};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.engine.e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "7e848d4edbca10e6f95d09b67d29770c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "7e848d4edbca10e6f95d09b67d29770c")).booleanValue() : eVar.e.contains(subPackageByPath.f);
    }

    @Override // com.meituan.mmp.lib.load.c
    public final void a(String str, boolean z, final a aVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34ec4d6b04bd10cfb9186527f791750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34ec4d6b04bd10cfb9186527f791750");
            return;
        }
        com.meituan.mmp.lib.a aVar2 = this.c.get();
        if (aVar2 == null || aVar2.h()) {
            return;
        }
        Activity activity = aVar2.f;
        LoadingDialog loadingDialog = z ? new LoadingDialog(activity) : null;
        if (z) {
            loadingDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.mmp.lib.load.e.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa22915eb0f858a22e085ece64e9b538", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa22915eb0f858a22e085ece64e9b538");
                    }
                }
            });
            String string = activity.getString(R.string.mmp_load_package);
            Object[] objArr2 = {string};
            ChangeQuickRedirect changeQuickRedirect2 = LoadingDialog.a;
            if (PatchProxy.isSupport(objArr2, loadingDialog, changeQuickRedirect2, false, "7d92356ab2ceb84bf475fc57d48f1ba3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, loadingDialog, changeQuickRedirect2, false, "7d92356ab2ceb84bf475fc57d48f1ba3");
            } else {
                loadingDialog.show();
                if (loadingDialog.b != null) {
                    if (TextUtils.isEmpty(string)) {
                        loadingDialog.b.setText("");
                        loadingDialog.b.setVisibility(8);
                    } else {
                        loadingDialog.b.setText(string);
                        loadingDialog.b.setVisibility(0);
                    }
                } else {
                    com.meituan.mmp.lib.trace.b.d("LoadingDialog", "mTextView is null");
                }
            }
        }
        this.d = true;
        this.d = k.a().a(this.e.l, str, new AnonymousClass2(aVar, loadingDialog), new com.meituan.mmp.lib.update.a(new h(activity, this.e.c())));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.load.e$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements i {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ a b;
        public final /* synthetic */ LoadingDialog c;

        @Override // com.meituan.mmp.lib.update.i
        public final void a(MMPAppProp mMPAppProp) {
        }

        @Override // com.meituan.mmp.lib.update.i
        public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        }

        public AnonymousClass2(a aVar, LoadingDialog loadingDialog) {
            this.b = aVar;
            this.c = loadingDialog;
        }

        @Override // com.meituan.mmp.lib.update.i
        public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
            boolean z = true;
            Object[] objArr = {mMPAppProp, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6da077e7a4f0f23973a3f44676694b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6da077e7a4f0f23973a3f44676694b9");
                return;
            }
            final com.meituan.mmp.lib.a aVar = e.this.c.get();
            if (aVar == null || aVar.h()) {
                return;
            }
            if (!com.meituan.mmp.lib.utils.h.a((List) list) && list.get(0) != null) {
                z = false;
            }
            if (!z) {
                e.this.b.h.a(list.get(0), new n() { // from class: com.meituan.mmp.lib.load.e.2.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.engine.n
                    public final void a(final MMPPackageInfo mMPPackageInfo, final boolean z2) {
                        Object[] objArr2 = {mMPPackageInfo, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab33e5e07f5caa332bcb46d876f5802c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab33e5e07f5caa332bcb46d876f5802c");
                        } else {
                            com.meituan.mmp.lib.executor.a.a((Runnable) new com.meituan.mmp.lib.executor.b() { // from class: com.meituan.mmp.lib.load.e.2.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c01606f36072cda27ebac30ec2b1797d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c01606f36072cda27ebac30ec2b1797d");
                                        return;
                                    }
                                    com.meituan.mmp.lib.a aVar2 = e.this.c.get();
                                    if (aVar2 == null || aVar2.h()) {
                                        return;
                                    }
                                    if (AnonymousClass2.this.b != null) {
                                        AnonymousClass2.this.b.a(e.this.d, z2, mMPPackageInfo);
                                    }
                                    if (AnonymousClass2.this.c != null) {
                                        AnonymousClass2.this.c.dismiss();
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.meituan.mmp.lib.engine.n
                    public final void a(MMPPackageInfo mMPPackageInfo, Exception exc) {
                        Object[] objArr2 = {mMPPackageInfo, exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c003ab8f9285f8b62a854f1c9e020ff7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c003ab8f9285f8b62a854f1c9e020ff7");
                            return;
                        }
                        e eVar = e.this;
                        com.meituan.mmp.lib.a aVar2 = aVar;
                        a aVar3 = AnonymousClass2.this.b;
                        LoadingDialog loadingDialog = AnonymousClass2.this.c;
                        e.a(eVar, aVar2, aVar3, loadingDialog, "LoadSubPackageFail, " + mMPPackageInfo);
                    }
                });
                return;
            }
            e eVar = e.this;
            a aVar2 = this.b;
            LoadingDialog loadingDialog = this.c;
            e.a(eVar, aVar, aVar2, loadingDialog, "PrepareSubPackagesFail, " + mMPAppProp);
        }

        @Override // com.meituan.mmp.lib.update.i
        public final void a(MMPAppProp mMPAppProp, String str, Exception exc) {
            Object[] objArr = {mMPAppProp, str, exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39e31872fdc032de3ac69e2c9e6a9b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39e31872fdc032de3ac69e2c9e6a9b8");
                return;
            }
            e eVar = e.this;
            a aVar = this.b;
            LoadingDialog loadingDialog = this.c;
            e.a(eVar, e.this.c.get(), aVar, loadingDialog, "UpdateSubPackagesFail, " + str);
        }
    }
}
