package com.meituan.mmp.lib.page;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.pm.ShortcutManagerCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.RouterCenterActivity;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.devtools.g;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.page.view.f;
import com.meituan.mmp.lib.utils.aw;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.widget.BottomDialog;
import com.meituan.mmp.lib.widget.ModalDialog;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.shortcut.ShortcutInfoCompat;
import com.sankuai.common.utils.shortcut.ShortcutResult;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MenuDialog extends BottomDialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private m b;
    private f c;
    private Context d;
    private TextView f;
    private g g;
    private com.meituan.mmp.lib.config.a h;

    public MenuDialog(Context context, m mVar, f fVar) {
        super(context);
        g z;
        Object[] objArr = {context, mVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c769318428056c25d90cf060d7318f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c769318428056c25d90cf060d7318f");
            return;
        }
        this.d = context;
        this.b = mVar;
        this.h = mVar.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3034ae380dfd6ee52f12f6032fdeac86", RobustBitConfig.DEFAULT_VALUE)) {
            z = (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3034ae380dfd6ee52f12f6032fdeac86");
        } else {
            com.meituan.mmp.lib.a aVar = this.b.r;
            z = aVar != null ? aVar.z() : null;
        }
        this.g = z;
        this.c = fVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d32d00a42db6f149478644cce345ec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d32d00a42db6f149478644cce345ec3");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.hera_dialog_menu);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.MMPDialogShowAnimation);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f585a58b416f45e8fe21e307d17cb17b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f585a58b416f45e8fe21e307d17cb17b");
            return;
        }
        findViewById(R.id.space).setOnClickListener(this);
        findViewById(R.id.cancel).setOnClickListener(this);
        this.f = (TextView) findViewById(R.id.about);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("关于" + this.b.d.d());
        if (a() || DebugHelper.b()) {
            Object[] objArr3 = {spannableStringBuilder};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4cc590359e259e24d76cf04fb4f68b55", RobustBitConfig.DEFAULT_VALUE)) {
                spannableStringBuilder = (SpannableStringBuilder) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4cc590359e259e24d76cf04fb4f68b55");
            } else {
                TextView textView = (TextView) findViewById(R.id.traceView);
                textView.setVisibility(0);
                textView.setOnClickListener(this);
                TextView textView2 = (TextView) findViewById(R.id.reloadView);
                textView2.setVisibility(0);
                textView2.setOnClickListener(this);
                TextView textView3 = (TextView) findViewById(R.id.scanCodeView);
                textView3.setVisibility(0);
                textView3.setOnClickListener(this);
                if (this.g != null && this.g.a()) {
                    textView.setText("关闭性能数据");
                }
                if (a()) {
                    spannableStringBuilder.append((CharSequence) "  开发版 ");
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(Color.parseColor("#FFD1D1D1")), (spannableStringBuilder.length() - "  开发版 ".length()) + 1, spannableStringBuilder.length(), 34);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(p.d(12)), spannableStringBuilder.length() - "  开发版 ".length(), spannableStringBuilder.length(), 34);
                }
            }
        }
        this.f.setText(spannableStringBuilder);
        this.f.setOnClickListener(this);
        if (Build.VERSION.SDK_INT < 26 || this.h == null || TextUtils.isEmpty(this.h.f()) || this.h.l == null || this.h.l.externalConfig == null || !this.h.l.externalConfig.shortCutSupported) {
            return;
        }
        View findViewById = findViewById(R.id.shortcut);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Activity activity;
        Intent intent;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f344a159b953fc414ff157a0157aeefd", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f344a159b953fc414ff157a0157aeefd");
            return;
        }
        int id = view.getId();
        if (id == R.id.space || id == R.id.cancel) {
            MMPEnvHelper.getLogger().mgeClick(this.b.b, "c_group_fv80awch", "b_group_j2u4fz2u_mc", new Logger.a().a("title", this.b.d.d()).a("button_name", IPaymentManager.NO_ACTION).b);
        } else if (id == R.id.about) {
            this.c.onUserClickAboutIcon();
            Logger logger = MMPEnvHelper.getLogger();
            String c = this.b.d.c();
            Logger.a a2 = new Logger.a().a("title", this.b.d.d());
            logger.mgeClick(c, "c_group_fv80awch", "b_group_j2u4fz2u_mc", a2.a("button_name", "关于" + this.b.d.d()).b);
        } else if (id == R.id.shortcut) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faa3ab1830b3b0482bcf0fc59e074793", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faa3ab1830b3b0482bcf0fc59e074793");
            } else {
                final Activity activity2 = this.d instanceof Activity ? (Activity) this.d : null;
                if (activity2 != null && !activity2.isFinishing()) {
                    final Intent action = new Intent().setPackage(activity2.getPackageName()).setAction("android.intent.action.VIEW");
                    action.setComponent(new ComponentName(activity2, RouterCenterActivity.class)).putExtra("appId", this.b.b).putExtra(KnbConstants.PARAMS_SCENE, 1023);
                    String f = this.b.d.f();
                    final String str = this.b.b;
                    final String d = this.h.d();
                    Object[] objArr3 = {activity2, f, str, d, action};
                    ChangeQuickRedirect changeQuickRedirect3 = aw.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cbd577861a6365bd96660f4a55de477f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cbd577861a6365bd96660f4a55de477f");
                    } else {
                        final HashMap hashMap = new HashMap();
                        hashMap.put("shortcutId", str);
                        hashMap.put("shortcutName", d);
                        MMPEnvHelper.getLogger().log("mmp.util.shortcut.add", null, hashMap);
                        Picasso.g(activity2).d(f).a(new Target() { // from class: com.meituan.mmp.lib.utils.aw.1
                            public static ChangeQuickRedirect a;

                            @Override // com.squareup.picasso.Target
                            public final void onPrepareLoad(Drawable drawable) {
                            }

                            @Override // com.squareup.picasso.Target
                            public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                                Object[] objArr4 = {bitmap, loadedFrom};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92f4810a619db7de54780693fd81e057", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92f4810a619db7de54780693fd81e057");
                                } else if (Build.VERSION.SDK_INT < 26 || activity2 == null || activity2.isFinishing()) {
                                } else {
                                    if (!ShortcutManagerCompat.isRequestPinShortcutSupported(activity2)) {
                                        bb.a("2131362682", new Object[0]);
                                        aw.a(hashMap, "system not supported");
                                        return;
                                    }
                                    final ShortcutInfoCompat build = new ShortcutInfoCompat.Builder().setShortcutId(str).setShortcutName(d).setShortLabel(d).setIcon(Icon.createWithBitmap(bitmap)).setLaunchIntent(action).setIntents(new Intent[]{action}).build();
                                    final ShortcutResult addShortcut = ShortcutUtils.addShortcut(activity2, build, 2);
                                    com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.utils.aw.1.1
                                        public static ChangeQuickRedirect a;

                                        {
                                            AnonymousClass1.this = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c26ba8cc51020dfbb8d5844db127a516", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c26ba8cc51020dfbb8d5844db127a516");
                                            } else if (activity2 == null || activity2.isFinishing()) {
                                            } else {
                                                if (addShortcut.isSucceed() && ShortcutUtils.isShortcutExist(activity2, build, 2)) {
                                                    bb.a("2131362680", new Object[0]);
                                                    MetricsModule.a("mmp.util.shortcut.add.success", hashMap);
                                                    return;
                                                }
                                                final Activity activity3 = activity2;
                                                Object[] objArr6 = {activity3};
                                                ChangeQuickRedirect changeQuickRedirect6 = aw.a;
                                                final Intent intent2 = null;
                                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "55dfcaa5be6708fc6ec1e49e9a815e34", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "55dfcaa5be6708fc6ec1e49e9a815e34");
                                                } else {
                                                    final ModalDialog modalDialog = new ModalDialog(activity3);
                                                    modalDialog.setTitle(R.string.mmp_shortcut_permission_title);
                                                    SpannableString spannableString = new SpannableString(activity3.getString(R.string.mmp_shortcut_permission_confirm_know_more));
                                                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 18);
                                                    spannableString.setSpan(new ForegroundColorSpan(-12303292), 0, spannableString.length(), 18);
                                                    modalDialog.a(new SpannableStringBuilder().append((CharSequence) String.format(activity3.getString(R.string.mmp_shortcut_permission_content), c.a(activity3))).append((CharSequence) "\n").append((CharSequence) spannableString));
                                                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.meituan.mmp.lib.utils.aw.2
                                                        public static ChangeQuickRedirect a;

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            Object[] objArr7 = {view2};
                                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "24d03c74462038363088d5baf6080acd", 4611686018427387906L)) {
                                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "24d03c74462038363088d5baf6080acd");
                                                            } else {
                                                                aw.a(activity3);
                                                            }
                                                        }
                                                    };
                                                    Object[] objArr7 = {onClickListener};
                                                    ChangeQuickRedirect changeQuickRedirect7 = ModalDialog.a;
                                                    if (PatchProxy.isSupport(objArr7, modalDialog, changeQuickRedirect7, false, "a5de48e009c5b47952df14b17d691781", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr7, modalDialog, changeQuickRedirect7, false, "a5de48e009c5b47952df14b17d691781");
                                                    } else {
                                                        modalDialog.b.setOnClickListener(onClickListener);
                                                    }
                                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.meituan.mmp.lib.utils.aw.3
                                                        public static ChangeQuickRedirect a;

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            Object[] objArr8 = {view2};
                                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8c16a0250b8f327502478b3d09d1b15a", 4611686018427387906L)) {
                                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8c16a0250b8f327502478b3d09d1b15a");
                                                            } else {
                                                                modalDialog.dismiss();
                                                            }
                                                        }
                                                    };
                                                    Object[] objArr8 = {Integer.valueOf((int) R.string.mmp_shortcut_dialog_ok), onClickListener2};
                                                    ChangeQuickRedirect changeQuickRedirect8 = ModalDialog.a;
                                                    if (PatchProxy.isSupport(objArr8, modalDialog, changeQuickRedirect8, false, "96fc8b1d14648db240233ae11ecba60c", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, modalDialog, changeQuickRedirect8, false, "96fc8b1d14648db240233ae11ecba60c");
                                                    } else {
                                                        modalDialog.a(modalDialog.getContext().getString(R.string.mmp_shortcut_dialog_ok), onClickListener2);
                                                    }
                                                    Object[] objArr9 = {activity3};
                                                    ChangeQuickRedirect changeQuickRedirect9 = aw.a;
                                                    if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "32709de097d99452d5557667c82856a3", RobustBitConfig.DEFAULT_VALUE)) {
                                                        intent2 = (Intent) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "32709de097d99452d5557667c82856a3");
                                                    } else if (activity3 != null) {
                                                        Intent intent3 = new Intent();
                                                        if (as.b()) {
                                                            intent3.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                                                            intent3.putExtra("extra_pkgname", activity3.getPackageName());
                                                        } else if (as.d()) {
                                                            intent3.setComponent(new ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
                                                            intent3.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
                                                        } else if (as.c()) {
                                                            intent3.setComponent(new ComponentName("com.bbk.launcher2", "com.bbk.launcher2.installshortcut.PurviewActivity"));
                                                        } else if (as.e()) {
                                                            intent3 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                                                            intent3.addCategory("android.intent.category.DEFAULT");
                                                            intent3.putExtra("packageName", activity3.getPackageName());
                                                        } else {
                                                            intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                            intent3.setData(Uri.fromParts("package", activity3.getPackageName(), null));
                                                        }
                                                        intent2 = intent3;
                                                    }
                                                    int i = intent2 != null ? R.string.mmp_shortcut_permission_confirm_settings : R.string.mmp_shortcut_permission_confirm_know_more;
                                                    View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: com.meituan.mmp.lib.utils.aw.4
                                                        public static ChangeQuickRedirect a;

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            Object[] objArr10 = {view2};
                                                            ChangeQuickRedirect changeQuickRedirect10 = a;
                                                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "9890f0da50c28e386a420856d5d9d92d", 4611686018427387906L)) {
                                                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "9890f0da50c28e386a420856d5d9d92d");
                                                            } else if (intent2 != null) {
                                                                activity3.startActivity(intent2);
                                                            } else {
                                                                aw.a(activity3);
                                                            }
                                                        }
                                                    };
                                                    Object[] objArr10 = {Integer.valueOf(i), onClickListener3};
                                                    ChangeQuickRedirect changeQuickRedirect10 = ModalDialog.a;
                                                    if (PatchProxy.isSupport(objArr10, modalDialog, changeQuickRedirect10, false, "ff2b588bc9150278183ef5894ebda0df", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr10, modalDialog, changeQuickRedirect10, false, "ff2b588bc9150278183ef5894ebda0df");
                                                    } else {
                                                        modalDialog.b(modalDialog.getContext().getString(i), onClickListener3);
                                                    }
                                                    modalDialog.show();
                                                }
                                                aw.a(hashMap, "permission denied or other reason");
                                            }
                                        }
                                    }, 500L);
                                }
                            }

                            @Override // com.squareup.picasso.Target
                            public final void onBitmapFailed(Drawable drawable) {
                                Object[] objArr4 = {drawable};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "38fa452117c1aac807c2832876016a4b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "38fa452117c1aac807c2832876016a4b");
                                    return;
                                }
                                bb.a("2131362679", new Object[0]);
                                aw.a(hashMap, "onBitmapFailed");
                            }
                        });
                    }
                }
            }
        } else if (id == R.id.traceView) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e616d6660fe9e37f9a0eda490beeaf1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e616d6660fe9e37f9a0eda490beeaf1");
            } else if (this.g != null && !this.g.a()) {
                bb.a("部分数据需要小程序重启后显示", new Object[0]);
            }
        } else if (id == R.id.reloadView) {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dcd21764175c1efb4e2a27f159540af3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dcd21764175c1efb4e2a27f159540af3");
            } else if ((this.d instanceof Activity) && (intent = (activity = (Activity) this.d).getIntent()) != null) {
                intent.putExtra("disableReuseAny", true);
                intent.removeExtra("reuseEngineId");
                activity.finish();
                activity.startActivity(intent);
            }
        } else if (id == R.id.scanCodeView) {
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1314680f2c9f29227358675520e66783", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1314680f2c9f29227358675520e66783");
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(getContext().getPackageName());
                intent2.setData(Uri.parse(String.format(Locale.ENGLISH, "imeituan://www.meituan.com/scanQRCodeForResult?openAR=0&albumScanEnable=%d&needResult=1", 1)));
                if (this.d instanceof Activity) {
                    Activity activity3 = (Activity) this.d;
                    PackageManager packageManager = getContext().getPackageManager();
                    if (packageManager != null) {
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent2, 65536);
                        if (resolveActivity == null || resolveActivity.activityInfo == null) {
                            intent2 = new Intent();
                            intent2.setClassName(getContext(), "com.meituan.mmp.lib.scancode.ui.activity.ScanCaptureUI");
                        }
                        try {
                            activity3.startActivityForResult(intent2, 99);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        dismiss();
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48557510fc96bbf5e283e0ec0440f6cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48557510fc96bbf5e283e0ec0440f6cf")).booleanValue() : this.b.d.l != null && this.b.d.l.isDebug();
    }
}
