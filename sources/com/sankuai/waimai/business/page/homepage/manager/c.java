package com.sankuai.waimai.business.page.homepage.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.util.g;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.page.home.WMHomePageFragment;
import com.sankuai.waimai.business.page.home.e;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog;
import com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import java.io.File;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static c k;
    a b;
    public final com.meituan.android.uptodate.a c;
    final Context d;
    public boolean e;
    NotificationManager f;
    int g;
    int h;
    long i;
    boolean j;
    private NotificationCompat.Builder l;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "b59f779d67849ced8ac5efb1063e3d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "b59f779d67849ced8ac5efb1063e3d80");
        } else {
            cVar.c.a(false, com.sankuai.waimai.platform.b.A().c(), true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void a(c cVar, int i, VersionInfo versionInfo, boolean z) {
        Activity c;
        Object[] objArr = {Integer.valueOf(i), versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "adc62733323809ce13b8606b7f2d4a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "adc62733323809ce13b8606b7f2d4a0e");
            return;
        }
        switch (i) {
            case 2:
                Object[] objArr2 = {versionInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2c5dff74be3b2c85dbc7dff918bf3f75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2c5dff74be3b2c85dbc7dff918bf3f75");
                    return;
                }
                Activity c2 = cVar.c();
                if (c2 == null || cVar.a(c2)) {
                    return;
                }
                final UpdateForceInstallDialog updateForceInstallDialog = new UpdateForceInstallDialog(c2);
                updateForceInstallDialog.setTitle(R.string.wm_page_upgrade_one_click_install_new_version);
                updateForceInstallDialog.b = versionInfo.changeLog;
                updateForceInstallDialog.a(cVar.d.getString(R.string.wm_page_upgrade_one_click_install), new UpdateForceInstallDialog.b() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.9
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog.b
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6e6c2eaf408d297334c33b62b13abf5f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6e6c2eaf408d297334c33b62b13abf5f");
                            return;
                        }
                        updateForceInstallDialog.dismiss();
                        c.a(c.this, "b_8EPM9");
                        c.b(c.this);
                    }
                });
                updateForceInstallDialog.c = new UpdateForceInstallDialog.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.10
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0938c592eb7d4938294b721cea902580", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0938c592eb7d4938294b721cea902580");
                            return;
                        }
                        updateForceInstallDialog.dismiss();
                        c.a(c.this, "b_yiPgG");
                    }
                };
                cVar.a(updateForceInstallDialog);
                return;
            case 3:
                Object[] objArr3 = {versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d7689e16329545ed3dfc0d6892fbdab2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d7689e16329545ed3dfc0d6892fbdab2");
                    return;
                }
                final Activity c3 = cVar.c();
                if (c3 == null || cVar.a(c3)) {
                    return;
                }
                com.sankuai.waimai.platform.domain.manager.location.a.b(cVar.d);
                cVar.j = versionInfo.forceupdate == 1;
                if (cVar.j) {
                    final UpgradeInfoDialog upgradeInfoDialog = new UpgradeInfoDialog(c3, R.layout.wm_page_dialog_upgrade);
                    upgradeInfoDialog.setTitle(R.string.wm_page_upgrade_find_new_version);
                    upgradeInfoDialog.b = versionInfo.changeLog;
                    upgradeInfoDialog.a(cVar.d.getString(R.string.wm_page_upgrade_update), new UpgradeInfoDialog.b() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.11
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.b
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f68a005ebb90bf816d37a380fab17324", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f68a005ebb90bf816d37a380fab17324");
                            } else if (p.d(c.this.d)) {
                                c.c(c.this);
                                upgradeInfoDialog.dismiss();
                            } else {
                                final UpgradeInfoDialog upgradeInfoDialog2 = new UpgradeInfoDialog(c3, R.layout.wm_page_dialog_upgrade_wifi_status);
                                upgradeInfoDialog2.a(c.this.d.getString(R.string.wm_page_upgrade_update_immediately), new UpgradeInfoDialog.b() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.11.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.b
                                    public final void a() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bedfaae5405c6fd8f58d7d822d0b4623", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bedfaae5405c6fd8f58d7d822d0b4623");
                                        } else {
                                            c.c(c.this);
                                        }
                                    }
                                });
                                upgradeInfoDialog2.a(c.this.d.getString(R.string.wm_page_upgrade_later), new UpgradeInfoDialog.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.11.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.a
                                    public final void a() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3d2ad843809b7e5f1e917aba475af875", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3d2ad843809b7e5f1e917aba475af875");
                                            return;
                                        }
                                        upgradeInfoDialog2.dismiss();
                                        c.this.a(upgradeInfoDialog);
                                    }
                                });
                                c.this.a(upgradeInfoDialog2);
                                upgradeInfoDialog.dismiss();
                            }
                        }
                    });
                    upgradeInfoDialog.a(cVar.d.getString(R.string.wm_page_upgrade_exit), new UpgradeInfoDialog.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.12
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "faa5c4d7cb2e6eb7cb05f5c7846f0065", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "faa5c4d7cb2e6eb7cb05f5c7846f0065");
                            } else {
                                MainActivity.f();
                            }
                        }
                    });
                    upgradeInfoDialog.setCancelable(false);
                    cVar.a(upgradeInfoDialog);
                    return;
                } else if (z && p.d(cVar.d) && a(cVar.d)) {
                    cVar.a("b_waimai_qnvxbovh_mv");
                    cVar.d();
                    return;
                } else {
                    final UpdateForceInstallDialog updateForceInstallDialog2 = new UpdateForceInstallDialog(c3);
                    updateForceInstallDialog2.setTitle(R.string.wm_page_upgrade_find_new_version);
                    updateForceInstallDialog2.b = versionInfo.changeLog;
                    updateForceInstallDialog2.a(cVar.d.getString(R.string.wm_page_upgrade_update), new UpdateForceInstallDialog.b() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog.b
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9784a14b1b80fab2ffbbf67ffb011567", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9784a14b1b80fab2ffbbf67ffb011567");
                                return;
                            }
                            if (!p.d(c.this.d)) {
                                final UpgradeInfoDialog upgradeInfoDialog2 = new UpgradeInfoDialog(c3, R.layout.wm_page_dialog_upgrade_wifi_status);
                                upgradeInfoDialog2.a(c.this.d.getString(R.string.wm_page_upgrade_update_immediately), new UpgradeInfoDialog.b() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.b
                                    public final void a() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7e1fe307a038101a276145c14f0594a2", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7e1fe307a038101a276145c14f0594a2");
                                            return;
                                        }
                                        c.this.a("b_waimai_nbi9f8o8_mv");
                                        c.a(c.this);
                                        c.a(c.this, "b_XFNdo");
                                        upgradeInfoDialog2.dismiss();
                                    }
                                });
                                upgradeInfoDialog2.a(c.this.d.getString(R.string.wm_page_upgrade_later), new UpgradeInfoDialog.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.1.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.a
                                    public final void a() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dd65c78a1fa5a3a09d6c3819d5339b8e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dd65c78a1fa5a3a09d6c3819d5339b8e");
                                        } else {
                                            upgradeInfoDialog2.dismiss();
                                        }
                                    }
                                });
                                c.this.a(upgradeInfoDialog2);
                            } else {
                                c.this.a("b_waimai_nbi9f8o8_mv");
                                c.a(c.this);
                            }
                            updateForceInstallDialog2.dismiss();
                            c.a(c.this, "b_rGkFl");
                        }
                    });
                    updateForceInstallDialog2.c = new UpdateForceInstallDialog.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0da89cd2eca3311806ea445b185df537", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0da89cd2eca3311806ea445b185df537");
                                return;
                            }
                            if (c.a(c.this.d) && p.d(c.this.d)) {
                                c.this.d();
                            }
                            updateForceInstallDialog2.dismiss();
                            c.a(c.this, "b_rKpPt");
                        }
                    };
                    cVar.a(updateForceInstallDialog2);
                    return;
                }
            case 4:
                cVar.g = 2;
                if (cVar.j) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "74b08bd71fd54b676a9abac672b22fad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "74b08bd71fd54b676a9abac672b22fad");
                        return;
                    } else if (cVar.b != null || (c = cVar.c()) == null || cVar.a(c)) {
                        return;
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(c, R.style.CustomDialogTheme);
                        TextView textView = new TextView(c);
                        textView.setText(R.string.wm_page_upgrade_updating);
                        textView.setPadding(10, 70, 10, 50);
                        textView.setGravity(17);
                        textView.setTextColor(c.getResources().getColor(R.color.wm_common_text_title));
                        textView.setTextSize(16.0f);
                        builder.setCustomTitle(textView);
                        View inflate = LayoutInflater.from(c).inflate(R.layout.wm_page_main_view_progress, (ViewGroup) null);
                        cVar.b = new a();
                        cVar.b.c = (ProgressBar) inflate.findViewById(R.id.pb_update);
                        cVar.b.d = (TextView) inflate.findViewById(R.id.txt_update);
                        cVar.b.d.setText(cVar.d.getString(R.string.wm_page_upgrade_downloading_progress, 0));
                        builder.setView(inflate);
                        AlertDialog create = builder.create();
                        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.4
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                Object[] objArr5 = {dialogInterface};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f18fe181fdfe10ff50c48355fcaf6581", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f18fe181fdfe10ff50c48355fcaf6581");
                                } else {
                                    c.this.b = null;
                                }
                            }
                        });
                        cVar.b.b = create;
                        create.setCanceledOnTouchOutside(false);
                        create.setCancelable(false);
                        a(create);
                        return;
                    }
                }
                return;
            case 5:
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "87d00b998eb9bb217c2063771c8864fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "87d00b998eb9bb217c2063771c8864fc");
                    return;
                }
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "e2cb0619c7d424974ef0caac8a2b2cc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "e2cb0619c7d424974ef0caac8a2b2cc6");
                } else if (cVar.b != null) {
                    a aVar = cVar.b;
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a.a;
                    if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "4faa640e238d438ca3024ff59cffcab1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "4faa640e238d438ca3024ff59cffcab1");
                    } else {
                        com.sankuai.waimai.platform.widget.dialog.a.b(aVar.b);
                    }
                }
                String c4 = com.meituan.android.uptodate.util.d.c(cVar.d);
                if (TextUtils.isEmpty(c4)) {
                    return;
                }
                File file = new File(c4);
                if (file.exists() && file.isFile() && cVar.h != 0 && file.length() == cVar.i && !cVar.j) {
                    cVar.g = 3;
                    cVar.a(100);
                    return;
                }
                return;
            case 6:
            case 7:
            case 13:
            case 14:
            default:
                return;
            case 8:
                if (!cVar.j) {
                    cVar.g = 6;
                    cVar.a(cVar.h);
                }
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("apk_upgrade").b(String.valueOf(i)).b());
                return;
            case 9:
                if (!cVar.j) {
                    cVar.g = 4;
                    cVar.a(cVar.h);
                }
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("apk_upgrade").b(String.valueOf(i)).b());
                return;
            case 10:
                if (!cVar.j) {
                    cVar.g = 5;
                    cVar.a(cVar.h);
                    break;
                }
                break;
            case 11:
            case 12:
                break;
            case 15:
                if (cVar.j) {
                    return;
                }
                cVar.a("b_waimai_zxzyuqd8_mv");
                return;
        }
        i.d(new com.sankuai.waimai.business.page.common.log.a().a("apk_upgrade").b(String.valueOf(i)).b());
    }

    public static /* synthetic */ void a(c cVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9d7cb8f3b51032b73fa3e9f719a3e27b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9d7cb8f3b51032b73fa3e9f719a3e27b");
        } else {
            JudasManualManager.a(str).a(cVar).a("c_m84bv26").a();
        }
    }

    public static /* synthetic */ void b(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "858261ff70dc3cc8c284c4be60b86ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "858261ff70dc3cc8c284c4be60b86ac9");
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(context, 2131558627)).b(R.string.wm_page_msg_check_sign).a(R.string.wm_page_msg_check_sign_confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98aae13c77dc5c7bcfe905f7558f11c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98aae13c77dc5c7bcfe905f7558f11c8");
                        return;
                    }
                    context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + context.getPackageName())));
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://waimai.meituan.com/mobile/download/default?f=android")));
                }
            }).b(R.string.dialog_btn_cancel, (DialogInterface.OnClickListener) null).a(true).a((DialogInterface.OnDismissListener) null).b();
        }
    }

    public static /* synthetic */ void b(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "7dde6b69ca8d053dd2a5d34f75b2d20b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "7dde6b69ca8d053dd2a5d34f75b2d20b");
            return;
        }
        Context c = cVar.c();
        com.meituan.android.uptodate.a aVar = cVar.c;
        if (c == null) {
            c = com.meituan.android.singleton.b.a.getApplicationContext();
        }
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.uptodate.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c6985168cf97fc5b200df6ea5e49c0ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c6985168cf97fc5b200df6ea5e49c0ea");
        } else {
            g.a(c, com.meituan.android.uptodate.util.d.c(c.getApplicationContext()), aVar.b);
        }
        MainActivity.f();
    }

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8281d69a20a2b69fa7b34739a7528ec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8281d69a20a2b69fa7b34739a7528ec7");
        } else {
            cVar.c.a(false, com.sankuai.waimai.platform.b.A().c(), false);
        }
    }

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8589639d2c4c397081abd54ab5bcc114", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8589639d2c4c397081abd54ab5bcc114");
            return;
        }
        this.e = false;
        this.j = false;
        this.d = context;
        this.c = com.meituan.android.uptodate.a.a(context);
        this.d.registerReceiver(new BroadcastReceiver() { // from class: com.sankuai.waimai.business.page.homepage.manager.UpdateHelper$1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74fed3aabff763deb8fb486a8f5c749b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74fed3aabff763deb8fb486a8f5c749b");
                } else if (intent == null || !"com.sankuai.waimai.business.page.homepage.manager.UpdateHelper".equals(intent.getAction()) || c.this.c == null) {
                } else {
                    switch (c.this.g) {
                        case 1:
                            c.a(c.this, "b_waimai_ylctwitl_mc");
                            c.a(c.this);
                            c.this.g = 2;
                            return;
                        case 2:
                            c.a(c.this, "b_waimai_o0zrftmn_mc");
                            c.this.g = 1;
                            c.this.c.cancel();
                            c.this.a(c.this.h);
                            return;
                        case 3:
                            c.a(c.this, "b_waimai_418mmrwr_mc");
                            if (c.this.f != null) {
                                c.this.f.cancel(1011);
                            }
                            c.b(c.this);
                            return;
                        case 4:
                        case 5:
                        case 6:
                            c.this.g = 2;
                            c.a(c.this);
                            return;
                        default:
                            return;
                    }
                }
            }
        }, new IntentFilter("com.sankuai.waimai.business.page.homepage.manager.UpdateHelper"));
    }

    @MainThread
    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5d7c8e7ab399490ec5af6c12025abf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5d7c8e7ab399490ec5af6c12025abf2");
        }
        if (k == null) {
            k = new c(com.meituan.android.singleton.b.a);
        }
        return k;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0611c298c3705bc528b97a5ab543e205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0611c298c3705bc528b97a5ab543e205");
        } else {
            a().a(false);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c82815dab147a52a2e04c4b4afa996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c82815dab147a52a2e04c4b4afa996");
            return;
        }
        Activity c = c();
        if (a(c)) {
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(c, this.d.getString(R.string.wm_page_mai_dialog_checkUpdate));
        if (a2 != null) {
            com.sankuai.waimai.touchmatrix.views.b.a().a(a2);
            a2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.6
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04e81300a1b25ba2496f9901191cd4da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04e81300a1b25ba2496f9901191cd4da");
                    } else {
                        com.sankuai.waimai.touchmatrix.views.b.a().b(a2);
                    }
                }
            });
        }
        a(new com.meituan.android.uptodate.interfac.a() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.uptodate.interfac.a
            public final void a(VersionInfo versionInfo) {
                Object[] objArr2 = {versionInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5822133a1c1fbdb972791c3b2301a355", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5822133a1c1fbdb972791c3b2301a355");
                } else if (versionInfo != null) {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    if (!versionInfo.isUpdated || com.sankuai.waimai.platform.b.A().j() >= versionInfo.currentVersion || (TextUtils.isEmpty(versionInfo.appurl) && TextUtils.isEmpty(versionInfo.appHttpsUrl))) {
                        if (r3) {
                            return;
                        }
                        ae.a(c.this.d, (int) R.string.wm_page_upgrade_was_latest_version);
                        return;
                    }
                    c.this.c.b = new com.meituan.android.uptodate.interfac.c() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.7.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.uptodate.interfac.c
                        public final void a(int i, VersionInfo versionInfo2, Exception exc) {
                            Object[] objArr3 = {Integer.valueOf(i), versionInfo2, exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55723595b167e4feb1b1e3c9450494f8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55723595b167e4feb1b1e3c9450494f8");
                            } else {
                                c.a(c.this, i, versionInfo2, r3);
                            }
                        }

                        @Override // com.meituan.android.uptodate.interfac.c
                        public final boolean a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68755eec11466b6eda41b9b3a05b4f57", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68755eec11466b6eda41b9b3a05b4f57")).booleanValue();
                            }
                            if (com.sankuai.waimai.foundation.core.a.b()) {
                                return true;
                            }
                            boolean a3 = c.this.a(c.this.d, "638c81261479c2104ede3f2518e91725");
                            if (!a3) {
                                c.b(c.this.c());
                                i.d(new com.sankuai.waimai.business.page.common.log.a().a("apk_upgrade").b("sign_invalid").b());
                            }
                            return a3;
                        }

                        @Override // com.meituan.android.uptodate.interfac.c
                        public final void a(long j, long j2) {
                            Object[] objArr3 = {new Long(j), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f3469865f6a6f996eb0b2ed702e5c445", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f3469865f6a6f996eb0b2ed702e5c445");
                                return;
                            }
                            c.this.i = j2;
                            int i = (int) ((((float) j) / ((float) j2)) * 100.0f);
                            if (c.this.b != null) {
                                c.this.b.a(i);
                            }
                            if (c.this.j) {
                                return;
                            }
                            c.this.h = i;
                            c.this.a(c.this.h);
                        }
                    };
                    c.this.c.a(versionInfo, "638c81261479c2104ede3f2518e91725");
                } else {
                    if (!r3) {
                        ae.a(c.this.d, (int) R.string.wm_page_main_toast_checkUpdateFailed);
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                }
            }
        });
    }

    public void a(com.meituan.android.uptodate.interfac.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c8d43a34a49063f3bb001f94758ce4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c8d43a34a49063f3bb001f94758ce4f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("wmdtype", com.sankuai.waimai.platform.b.A().g());
        this.c.a(com.sankuai.waimai.platform.b.A().j(), com.sankuai.waimai.platform.b.A().d(), com.sankuai.waimai.platform.b.A().r(), com.sankuai.waimai.platform.domain.manager.user.a.i().d(), com.sankuai.waimai.foundation.location.g.a(), this.e, hashMap, aVar);
    }

    public Activity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0225dcec09d346f6e30e0d33c60a102e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0225dcec09d346f6e30e0d33c60a102e");
        }
        Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        if (b == null) {
            this.c.cancel();
            this.c.b();
            this.c.d = 0;
        }
        return b;
    }

    void a(final Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89968fc15cee3da17131ce9bd69a363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89968fc15cee3da17131ce9bd69a363");
            return;
        }
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = this.d.getResources().getDisplayMetrics();
        attributes.width = (int) (displayMetrics.widthPixels * 0.9d);
        attributes.height = (int) (displayMetrics.heightPixels * 0.9d);
        attributes.flags = 2;
        attributes.dimAmount = 0.5f;
        window.setAttributes(attributes);
        dialog.setCanceledOnTouchOutside(false);
        Activity c = c();
        if (a(c)) {
            return;
        }
        WMHomePageFragment h = c instanceof MainActivity ? ((MainActivity) c).h() : null;
        if (h != null) {
            try {
                h.k.f();
                e.g = true;
            } catch (Exception unused) {
                return;
            }
        }
        dialog.show();
        com.sankuai.waimai.touchmatrix.views.b.a().a(dialog);
        com.sankuai.waimai.business.page.home.actinfo.a.b = true;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.homepage.manager.c.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                WMHomePageFragment h2;
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de23a75faa0c204b4596f12214f76f1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de23a75faa0c204b4596f12214f76f1e");
                    return;
                }
                com.sankuai.waimai.business.page.home.actinfo.a.b = false;
                e.g = false;
                com.sankuai.waimai.touchmatrix.views.b.a().b(dialog);
                if (!(c.this.c() instanceof MainActivity) || (h2 = ((MainActivity) c.this.c()).h()) == null) {
                    return;
                }
                h2.k.e();
            }
        });
    }

    void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2beae02f6e7452cc8d2d0d1e70d0df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2beae02f6e7452cc8d2d0d1e70d0df");
        } else {
            this.c.a(true, com.sankuai.waimai.platform.b.A().c());
        }
    }

    static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f758cae08da410835f992149a38072e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f758cae08da410835f992149a38072e")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "auto_update_switch", true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f40214b95c3701d2826cb71cd42854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f40214b95c3701d2826cb71cd42854");
            return;
        }
        try {
            if (this.f == null) {
                this.f = (NotificationManager) this.d.getSystemService(RemoteMessageConst.NOTIFICATION);
                ae.a(this.d, this.d.getString(R.string.wm_page_upgrade_download_in_background));
                this.g = 2;
            }
            if (this.l == null) {
                this.l = new NotificationCompat.Builder(this.d, "waimaiChannelId");
                this.l.setContentTitle(this.d.getString(R.string.wm_page_upgrade_notification_title));
                this.l.setSmallIcon(R.drawable.wm_ic_launcher);
                PendingIntent broadcast = PendingIntent.getBroadcast(this.d, 0, new Intent("com.sankuai.waimai.business.page.homepage.manager.UpdateHelper"), 0);
                if (broadcast != null) {
                    this.l.setContentIntent(broadcast);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    this.l.setChannelId("waimaiChannelId");
                    NotificationChannel notificationChannel = new NotificationChannel("waimaiChannelId", "waimaiChannelUpdate", 3);
                    notificationChannel.setSound(null, null);
                    this.f.createNotificationChannel(notificationChannel);
                }
                e();
            }
            this.l.setProgress(100, i, false);
            switch (this.g) {
                case 1:
                    this.l.setContentText(this.d.getString(R.string.wm_page_upgrade_notification_paused, Integer.valueOf(i)));
                    break;
                case 2:
                    this.l.setContentText(this.d.getString(R.string.wm_page_upgrade_notification_downloading, Integer.valueOf(i)));
                    break;
                case 3:
                    a("b_waimai_xs5h5x61_mv");
                    this.l.setContentText(this.d.getString(R.string.wm_page_upgrade_notification_complete));
                    ae.a(this.d, this.d.getString(R.string.wm_page_upgrade_download_in_background_success));
                    break;
                case 4:
                    a("b_waimai_c58479r1_mv");
                    this.l.setContentText(this.d.getString(R.string.wm_page_upgrade_notification_failed_timeout));
                    ae.a(this.d, this.d.getString(R.string.wm_page_upgrade_download_in_background_failed_timeout));
                    break;
                case 5:
                    a("b_waimai_c58479r1_mv");
                    this.l.setContentText(this.d.getString(R.string.wm_page_upgrade_notification_failed_no_sdcard));
                    ae.a(this.d, this.d.getString(R.string.wm_page_upgrade_download_in_background_failed_no_sdcard));
                    break;
                case 6:
                    a("b_waimai_c58479r1_mv");
                    this.l.setContentText(this.d.getString(R.string.wm_page_upgrade_notification_failed_default));
                    ae.a(this.d, this.d.getString(R.string.wm_page_upgrade_download_in_background_failed_timeout));
                    break;
            }
            this.f.notify(1011, this.l.build());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e(getClass().getSimpleName(), e.getMessage(), new Object[0]);
        }
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079d2e5bc4cfaf913155b82805c28244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079d2e5bc4cfaf913155b82805c28244");
        } else {
            JudasManualManager.b(str).a(this).a("c_m84bv26").a();
        }
    }

    private static void a(AlertDialog alertDialog) {
        Object[] objArr = {alertDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42e685f17a42fc4c0a9e79160665c7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42e685f17a42fc4c0a9e79160665c7d5");
        } else if (alertDialog == null) {
        } else {
            try {
                alertDialog.show();
                b(alertDialog);
                c(alertDialog);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("error", "exception: " + e.getLocalizedMessage(), new Object[0]);
            }
        }
    }

    private static void b(AlertDialog alertDialog) {
        Object[] objArr = {alertDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "240345c798c38589265776bdaaecc764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "240345c798c38589265776bdaaecc764");
            return;
        }
        View findViewById = alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
        if (findViewById == null) {
            return;
        }
        findViewById.setBackgroundColor(alertDialog.getContext().getResources().getColor(R.color.wm_common_transparent));
    }

    private static void c(AlertDialog alertDialog) {
        Object[] objArr = {alertDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df6f0aa53079ea68e62889bbaa6279d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df6f0aa53079ea68e62889bbaa6279d7");
            return;
        }
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            button.setTextSize(2, 17.0f);
        }
        Button button2 = alertDialog.getButton(-2);
        if (button2 != null) {
            button2.setTextSize(2, 17.0f);
            button2.setTextColor(alertDialog.getContext().getResources().getColor(R.color.wm_common_orange_7));
        }
    }

    boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2f1b621494bfe236d25df7dc84c014", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2f1b621494bfe236d25df7dc84c014")).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return str.equalsIgnoreCase(a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures));
        } catch (Exception unused) {
            return true;
        }
    }

    private String a(@NonNull Signature[] signatureArr) {
        Object[] objArr = {signatureArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ec6a801bcb8da0b8d64e66a2c6ba91", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ec6a801bcb8da0b8d64e66a2c6ba91");
        }
        try {
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                if (byteArray != null) {
                    return b.a(byteArray);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
        return "";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        AlertDialog b;
        ProgressBar c;
        TextView d;

        public a() {
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c97079bba255649c095e3129b5fadf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c97079bba255649c095e3129b5fadf");
                return;
            }
            int max = Math.max(0, Math.min(100, i));
            this.c.setProgress(max);
            this.d.setText(this.d.getContext().getString(R.string.wm_page_upgrade_downloading_progress, Integer.valueOf(max)));
        }
    }

    public boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e31a6fbd48d0b6be4c6adc351e7919", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e31a6fbd48d0b6be4c6adc351e7919")).booleanValue() : (activity instanceof MetricsNameProvider) && "mach_pro_waimai_waimai_bargain_newuser".equals(((MetricsNameProvider) activity).getName());
    }

    private void e() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9564b82a776d12ff18c588565f54ead1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9564b82a776d12ff18c588565f54ead1");
            return;
        }
        boolean areNotificationsEnabled = NotificationManagerCompat.from(com.meituan.android.singleton.b.a).areNotificationsEnabled();
        if (this.f != null && Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = this.f.getNotificationChannel("waimaiChannelId");
            if (notificationChannel != null) {
                if (areNotificationsEnabled && notificationChannel.getImportance() != 0) {
                    z = true;
                }
                d.a(z);
                return;
            }
            d.a(areNotificationsEnabled);
            return;
        }
        d.a(areNotificationsEnabled);
    }
}
