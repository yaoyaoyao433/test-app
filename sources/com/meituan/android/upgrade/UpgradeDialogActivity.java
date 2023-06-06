package com.meituan.android.upgrade;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.android.upgrade.c;
import com.meituan.android.upgrade.ui.UpgradeBaseDialog;
import com.meituan.android.upgrade.ui.UpgradeDownloadedDialog;
import com.meituan.android.upgrade.ui.UpgradeDownloadingDialog;
import com.meituan.android.upgrade.ui.UpgradeRemindDialog;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UpgradeDialogActivity extends Activity implements c {
    public static ChangeQuickRedirect a;
    private VersionInfo b;
    private com.meituan.android.upgrade.ui.a c;
    private int d;
    private UpgradeBaseDialog e;
    private UpgradeRemindDialog f;
    private UpgradeDownloadingDialog g;
    private UpgradeDownloadedDialog h;
    private UpgradeDownloadedDialog i;
    private e j;
    private UpgradeBaseDialog.a k;

    @Override // com.meituan.android.upgrade.c
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2361a49b96b54b6a163585dc62986b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2361a49b96b54b6a163585dc62986b62");
        }
    }

    public UpgradeDialogActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae06845aed120b67df629a28f55bdc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae06845aed120b67df629a28f55bdc5");
            return;
        }
        this.j = e.a();
        this.k = new UpgradeBaseDialog.a() { // from class: com.meituan.android.upgrade.UpgradeDialogActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
            public final void a(UpgradeBaseDialog upgradeBaseDialog) {
                Object[] objArr2 = {upgradeBaseDialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b771d03ff012ccafdba892ca13e21459", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b771d03ff012ccafdba892ca13e21459");
                } else {
                    UpgradeDialogActivity.this.j.a(upgradeBaseDialog);
                }
            }

            @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
            public final void b(UpgradeBaseDialog upgradeBaseDialog) {
                Object[] objArr2 = {upgradeBaseDialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6b65a84d43cec225acf149345bead20", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6b65a84d43cec225acf149345bead20");
                } else {
                    UpgradeDialogActivity.this.j.b(upgradeBaseDialog);
                }
            }

            @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
            public final void c(UpgradeBaseDialog upgradeBaseDialog) {
                Object[] objArr2 = {upgradeBaseDialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b83d0d52716d7eb0f62aef9387bfc666", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b83d0d52716d7eb0f62aef9387bfc666");
                    return;
                }
                UpgradeDialogActivity.this.j.c(upgradeBaseDialog);
                com.meituan.android.upgrade.ui.a a2 = upgradeBaseDialog.a();
                switch (AnonymousClass2.a[a2.ordinal()]) {
                    case 1:
                    case 2:
                        UpgradeDialogActivity.this.a((Dialog) UpgradeDialogActivity.this.e);
                        UpgradeDialogActivity.this.j.b();
                        UpgradeDialogActivity.this.finish();
                        return;
                    case 3:
                        UpgradeDialogActivity.this.a((Dialog) UpgradeDialogActivity.this.e);
                        e.a().b(UpgradeDialogActivity.this, UpgradeDialogActivity.this.b);
                        UpgradeDialogActivity.this.finish();
                        return;
                    case 4:
                    case 5:
                        UpgradeDialogActivity.this.j.a(UpgradeDialogActivity.this.b, false, (c) UpgradeDialogActivity.this);
                        StringBuilder sb = new StringBuilder("UpgradeBaseDialog.EventListener.onOKClicked(）: ");
                        sb.append(a2 == com.meituan.android.upgrade.ui.a.REMIND_UPGRADE ? "REMIND_UPGRADE" : "DOWNLOAD_FAIL");
                        com.meituan.android.uptodate.util.e.a(sb.toString());
                        if (UpgradeDialogActivity.this.b.forceupdate != 1) {
                            e unused = UpgradeDialogActivity.this.j;
                            UpgradeDialogActivity.this.a((Dialog) UpgradeDialogActivity.this.e);
                            g.a("正在后台为您下载最新版");
                            UpgradeDialogActivity.this.finish();
                            return;
                        }
                        UpgradeDialogActivity.this.a(com.meituan.android.upgrade.ui.a.DOWNLOADING);
                        return;
                    case 6:
                        UpgradeDialogActivity.this.a((Dialog) UpgradeDialogActivity.this.g);
                        g.a("已切换到后台下载");
                        UpgradeDialogActivity.this.finish();
                        return;
                    default:
                        return;
                }
            }

            @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
            public final void d(UpgradeBaseDialog upgradeBaseDialog) {
                Object[] objArr2 = {upgradeBaseDialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ac8aef3e76e2d5d58fa6dd9484e25bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ac8aef3e76e2d5d58fa6dd9484e25bc");
                    return;
                }
                UpgradeDialogActivity.this.j.d(upgradeBaseDialog);
                int i = AnonymousClass2.a[upgradeBaseDialog.a().ordinal()];
                if (i != 1) {
                    if (i != 6) {
                        switch (i) {
                        }
                    } else {
                        e.a().c();
                    }
                }
                UpgradeDialogActivity.this.finish();
            }
        };
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.upgrade.UpgradeDialogActivity$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[com.meituan.android.upgrade.ui.a.valuesCustom().length];

        static {
            try {
                a[com.meituan.android.upgrade.ui.a.REMIND_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.meituan.android.upgrade.ui.a.DOWNLOAD_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.meituan.android.upgrade.ui.a.REMIND_MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.meituan.android.upgrade.ui.a.REMIND_UPGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.meituan.android.upgrade.ui.a.DOWNLOAD_FAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.meituan.android.upgrade.ui.a.DOWNLOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Intent a(Context context, VersionInfo versionInfo, com.meituan.android.upgrade.ui.a aVar) {
        Object[] objArr = {context, versionInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f00165a59655b5fbd42307c3cc9ca306", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f00165a59655b5fbd42307c3cc9ca306") : a(context, versionInfo, aVar, 0);
    }

    public static Intent a(Context context, VersionInfo versionInfo, com.meituan.android.upgrade.ui.a aVar, int i) {
        Object[] objArr = {context, versionInfo, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51c2573d0fea32653dd6116b8a224663", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51c2573d0fea32653dd6116b8a224663");
        }
        Intent intent = new Intent(context, UpgradeDialogActivity.class);
        intent.setFlags(y.a);
        intent.setPackage(context.getPackageName());
        intent.putExtra("extra_dialog_type", aVar);
        intent.putExtra("extra_progress_percent", i);
        intent.putExtra("extra_version_info", versionInfo);
        return intent;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576244941528bc24b91e2c691e7dd332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576244941528bc24b91e2c691e7dd332");
            return;
        }
        super.onCreate(bundle);
        b(getIntent());
        if (bundle != null) {
            com.meituan.android.upgrade.ui.a aVar = (com.meituan.android.upgrade.ui.a) com.sankuai.waimai.platform.utils.f.a(bundle, "extra_dialog_type");
            if (aVar != null) {
                this.c = aVar;
            }
            this.d = bundle.getInt("extra_progress_percent", 0);
        }
        a(this.c);
    }

    @Override // android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ef3fd583114e69ef09c14613bb4538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ef3fd583114e69ef09c14613bb4538");
            return;
        }
        super.onStart();
        e.a().a(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5701d672554066de4bf005ac2b93df0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5701d672554066de4bf005ac2b93df0c");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_dialog_type", this.c);
        bundle.putInt("extra_progress_percent", this.d);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b508901950547ed0d15785055bfac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b508901950547ed0d15785055bfac2");
        } else {
            super.onRestoreInstanceState(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3df00c20fcd8dea4296b3042713480b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3df00c20fcd8dea4296b3042713480b");
            return;
        }
        super.onStop();
        e a2 = e.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0d6ea15fc9eeaecf32d17869d6cf74c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0d6ea15fc9eeaecf32d17869d6cf74c5");
        } else {
            a2.h.remove(this);
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e20331c98bf750351661c345e1fa9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e20331c98bf750351661c345e1fa9a");
            return;
        }
        super.onNewIntent(intent);
        b(intent);
        a(this.c);
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48ac9ecf4e31f71705a0d683282d6a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48ac9ecf4e31f71705a0d683282d6a0");
            return;
        }
        super.finish();
        a((Dialog) this.e);
        overridePendingTransition(0, 0);
    }

    private VersionInfo a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90af459acc0ec3d18e51dfd0b3d83cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (VersionInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90af459acc0ec3d18e51dfd0b3d83cfe");
        }
        if (intent == null || intent.getData() == null) {
            return null;
        }
        try {
            Uri data = intent.getData();
            com.meituan.android.uptodate.util.e.a(data.toString());
            VersionInfo versionInfo = new VersionInfo();
            versionInfo.publishType = Integer.valueOf(data.getQueryParameter("publishType")).intValue();
            versionInfo.forceupdate = Integer.valueOf(data.getQueryParameter("upgradeMode")).intValue();
            versionInfo.updateTitle = data.getQueryParameter("updateTitle");
            versionInfo.changeLog = data.getQueryParameter("updateTips");
            return versionInfo;
        } catch (Exception e) {
            g.a("发布单信息解析异常:" + e.toString());
            return null;
        }
    }

    private void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61406e491fd19327487060c111f8419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61406e491fd19327487060c111f8419");
            return;
        }
        this.b = (VersionInfo) com.sankuai.waimai.platform.utils.f.c(intent, "extra_version_info");
        if (this.b == null) {
            this.b = a(intent);
        }
        if (this.b == null) {
            finish();
        }
        this.c = (com.meituan.android.upgrade.ui.a) com.sankuai.waimai.platform.utils.f.c(intent, "extra_dialog_type");
        if (this.c == null) {
            this.c = com.meituan.android.upgrade.ui.a.REMIND_UPGRADE;
        }
        this.d = com.sankuai.waimai.platform.utils.f.a(intent, "extra_progress_percent", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.meituan.android.upgrade.ui.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b3da253524ee8915baec4b67f3a2d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b3da253524ee8915baec4b67f3a2d4");
            return;
        }
        com.meituan.android.uptodate.util.e.a("UpgradeDialogActivity.showDialog(）");
        if (this.j.c == null || this.j.b == null) {
            com.meituan.android.uptodate.util.e.a("UpgradeDialogActivity.showDialog(）:NPE捕获");
            HashMap hashMap = new HashMap();
            hashMap.put("noInit", 1);
            com.meituan.android.upgrade.report.a.a().a("DDUpdateDialogShowException", 1L, hashMap);
            finish();
            return;
        }
        a(b(aVar));
    }

    private void a(UpgradeBaseDialog upgradeBaseDialog) {
        Object[] objArr = {upgradeBaseDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266194ba1901b347e48dda9fa81d42b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266194ba1901b347e48dda9fa81d42b2");
            return;
        }
        if (this.e != upgradeBaseDialog) {
            a((Dialog) this.e);
            this.e = upgradeBaseDialog;
            this.c = this.e.a();
        }
        this.e.a(this.b);
        if (this.e == this.g) {
            this.g.a(this.d);
        }
    }

    private UpgradeBaseDialog b(com.meituan.android.upgrade.ui.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ea239fbd5b99f3bebd7ac24bcc8481", RobustBitConfig.DEFAULT_VALUE)) {
            return (UpgradeBaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ea239fbd5b99f3bebd7ac24bcc8481");
        }
        int i = AnonymousClass2.a[aVar.ordinal()];
        if (i == 2) {
            if (this.h == null) {
                this.h = new UpgradeDownloadedDialog(this, true, this.b, e.a().c.f());
                this.h.f = this.k;
            }
            return this.h;
        }
        switch (i) {
            case 5:
                if (this.i == null) {
                    this.i = new UpgradeDownloadedDialog(this, false, this.b, e.a().c.f());
                    this.i.f = this.k;
                }
                return this.i;
            case 6:
                if (this.g == null) {
                    this.g = new UpgradeDownloadingDialog(this, this.b, e.a().c.f());
                    this.g.f = this.k;
                }
                this.g.a(this.d);
                return this.g;
            default:
                if (this.f == null) {
                    this.f = new UpgradeRemindDialog(this, this.b, e.a().c.f());
                    this.f.f = this.k;
                }
                return this.f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d0ccba576a127ef6ea55e38ff18afd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d0ccba576a127ef6ea55e38ff18afd6");
        } else if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.meituan.android.upgrade.c
    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2befa5a87971b7b50af270ed582b10aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2befa5a87971b7b50af270ed582b10aa");
            return;
        }
        if (j < 0) {
            j = 0;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        if (j > j2) {
            j = j2;
        }
        if (j2 > 0) {
            this.d = (int) ((j * 100) / j2);
        }
        if (this.g != null) {
            this.g.a(this.d);
        }
    }

    @Override // com.meituan.android.upgrade.c
    public final void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8888034c3c54c3f007a32296375b0a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8888034c3c54c3f007a32296375b0a11");
        } else {
            a(com.meituan.android.upgrade.ui.a.DOWNLOAD_SUCCESS);
        }
    }

    @Override // com.meituan.android.upgrade.c
    public final void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c537db47d5e9c68118858bbb232caf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c537db47d5e9c68118858bbb232caf4");
        } else {
            a(com.meituan.android.upgrade.ui.a.DOWNLOAD_FAIL);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89919c384e2c43b28df09b42bee91481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89919c384e2c43b28df09b42bee91481");
            return;
        }
        if (this.e != null && this.e.isShowing()) {
            this.e.dismiss();
        }
        super.onDestroy();
    }
}
