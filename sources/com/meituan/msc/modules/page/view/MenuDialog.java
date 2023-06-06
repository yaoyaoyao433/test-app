package com.meituan.msc.modules.page.view;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
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
import com.meituan.msc.common.utils.at;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.widget.BottomDialog;
import com.meituan.msc.modules.page.widget.ModalDialog;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.shortcut.ShortcutInfoCompat;
import com.sankuai.common.utils.shortcut.ShortcutResult;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MenuDialog extends BottomDialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final h c;
    private b d;
    private Context e;
    private TextView f;
    private com.meituan.msc.modules.devtools.d g;

    public MenuDialog(Context context, h hVar, b bVar) {
        super(context);
        Object[] objArr = {context, hVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8d964b166b8a9eb5eee6c6722b177c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8d964b166b8a9eb5eee6c6722b177c2");
            return;
        }
        this.e = context;
        this.c = hVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.g = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ca12feb4b3d43ed7545052f3b8d1f0c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.devtools.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ca12feb4b3d43ed7545052f3b8d1f0c") : (com.meituan.msc.modules.devtools.d) this.c.d(com.meituan.msc.modules.devtools.d.class);
        this.d = bVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edadbc3a955d656bf20c358124c67999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edadbc3a955d656bf20c358124c67999");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.msc_dialog_menu);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.MSCDialogShowAnimation);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbf7ae77edca316d8b96ae2f19984d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbf7ae77edca316d8b96ae2f19984d09");
            return;
        }
        findViewById(R.id.space).setOnClickListener(this);
        findViewById(R.id.cancel).setOnClickListener(this);
        this.f = (TextView) findViewById(R.id.about);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("关于" + this.c.r.k());
        if (a() || DebugHelper.a()) {
            Object[] objArr3 = {spannableStringBuilder};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e60b238ab5d1a892704316b21c51d9cd", RobustBitConfig.DEFAULT_VALUE)) {
                spannableStringBuilder = (SpannableStringBuilder) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e60b238ab5d1a892704316b21c51d9cd");
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
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(n.b(12)), spannableStringBuilder.length() - "  开发版 ".length(), spannableStringBuilder.length(), 34);
                }
            }
        }
        this.f.setText(spannableStringBuilder);
        this.f.setOnClickListener(this);
        if (Build.VERSION.SDK_INT < 26 || TextUtils.isEmpty(this.c.r.l())) {
            return;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "22f30d3799cd302a484dd0ea608332b7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "22f30d3799cd302a484dd0ea608332b7")).booleanValue();
        } else {
            f fVar = this.c.r;
            if (fVar != null) {
                Object r = fVar.r("shortCutSupported");
                if (r instanceof Boolean) {
                    z = ((Boolean) r).booleanValue();
                }
            }
            z = false;
        }
        if (z) {
            View findViewById = findViewById(R.id.shortcut);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Activity activity;
        Intent intent;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04ae61733902c2cfe17dde23febb68a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04ae61733902c2cfe17dde23febb68a");
            return;
        }
        int id = view.getId();
        if (id != R.id.space && id != R.id.cancel) {
            if (id == R.id.about) {
                this.d.onUserClickAboutIcon();
            } else if (id == R.id.shortcut) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c155196c0b475d3538dee2f86bb91e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c155196c0b475d3538dee2f86bb91e3");
                } else {
                    final Activity activity2 = this.e instanceof Activity ? (Activity) this.e : null;
                    if (activity2 != null && !activity2.isFinishing()) {
                        final Intent action = new Intent().setPackage(activity2.getPackageName()).setAction("android.intent.action.VIEW");
                        action.setComponent(new ComponentName(activity2, MSCActivity.class)).putExtra("appId", this.c.r.j()).putExtra(KnbConstants.PARAMS_SCENE, 1023);
                        String l = this.c.r.l();
                        final String j = this.c.r.j();
                        final String k = this.c.r.k();
                        Object[] objArr3 = {activity2, l, j, k, action};
                        ChangeQuickRedirect changeQuickRedirect3 = at.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1bd039f5e58cef3bf54ba813610c8e9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1bd039f5e58cef3bf54ba813610c8e9e");
                        } else {
                            final MSCReporter mSCReporter = new MSCReporter();
                            mSCReporter.a("shortcutId", j);
                            mSCReporter.a("shortcutName", k);
                            mSCReporter.a("msc.util.shortcut.add").b();
                            Picasso.g(activity2).d(l).a(new Target() { // from class: com.meituan.msc.common.utils.at.1
                                public static ChangeQuickRedirect a;

                                @Override // com.squareup.picasso.Target
                                public final void onPrepareLoad(Drawable drawable) {
                                }

                                @Override // com.squareup.picasso.Target
                                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                                    Object[] objArr4 = {bitmap, loadedFrom};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4873e9f4f6363de36a325a83f784ea5e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4873e9f4f6363de36a325a83f784ea5e");
                                    } else if (Build.VERSION.SDK_INT < 26 || activity2 == null || activity2.isFinishing()) {
                                    } else {
                                        if (!ShortcutManagerCompat.isRequestPinShortcutSupported(activity2)) {
                                            aw.a("2131362930", new Object[0]);
                                            at.a(mSCReporter, "system not supported");
                                            return;
                                        }
                                        final ShortcutInfoCompat build = new ShortcutInfoCompat.Builder().setShortcutId(j).setShortcutName(k).setShortLabel(k).setIcon(Icon.createWithBitmap(bitmap)).setLaunchIntent(action).setIntents(new Intent[]{action}).build();
                                        final ShortcutResult addShortcut = ShortcutUtils.addShortcut(activity2, build, 2);
                                        com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.common.utils.at.1.1
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String charSequence;
                                                final Intent intent2;
                                                Object[] objArr5 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "46ce0b8d7f960a17c04753a361f5f869", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "46ce0b8d7f960a17c04753a361f5f869");
                                                } else if (activity2 == null || activity2.isFinishing()) {
                                                } else {
                                                    if (addShortcut.isSucceed() && ShortcutUtils.isShortcutExist(activity2, build, 2)) {
                                                        aw.a("2131362928", new Object[0]);
                                                        mSCReporter.a("msc.util.shortcut.add.success").b();
                                                        return;
                                                    }
                                                    final Activity activity3 = activity2;
                                                    Object[] objArr6 = {activity3};
                                                    ChangeQuickRedirect changeQuickRedirect6 = at.a;
                                                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "05b0db64a2d566e53717ef58a390f2c4", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "05b0db64a2d566e53717ef58a390f2c4");
                                                    } else {
                                                        final ModalDialog modalDialog = new ModalDialog(activity3);
                                                        modalDialog.setTitle(R.string.msc_shortcut_permission_title);
                                                        SpannableString spannableString = new SpannableString(activity3.getString(R.string.msc_shortcut_permission_confirm_know_more));
                                                        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 18);
                                                        spannableString.setSpan(new ForegroundColorSpan(-12303292), 0, spannableString.length(), 18);
                                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                        String string = activity3.getString(R.string.msc_shortcut_permission_content);
                                                        Object[] objArr7 = new Object[1];
                                                        Object[] objArr8 = {activity3};
                                                        ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect7, true, "377ca1e45c2dd50e2e4c859f35336660", RobustBitConfig.DEFAULT_VALUE)) {
                                                            charSequence = (String) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect7, true, "377ca1e45c2dd50e2e4c859f35336660");
                                                        } else {
                                                            ApplicationInfo applicationInfo = activity3.getApplicationInfo();
                                                            int i = applicationInfo.labelRes;
                                                            charSequence = i == 0 ? applicationInfo.nonLocalizedLabel.toString() : activity3.getString(i);
                                                        }
                                                        objArr7[0] = charSequence;
                                                        modalDialog.a(spannableStringBuilder.append((CharSequence) String.format(string, objArr7)).append((CharSequence) "\n").append((CharSequence) spannableString));
                                                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.meituan.msc.common.utils.at.2
                                                            public static ChangeQuickRedirect a;

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                Object[] objArr9 = {view2};
                                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect8, false, "8b04f657a88ec79203853348ab2ad004", 4611686018427387906L)) {
                                                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect8, false, "8b04f657a88ec79203853348ab2ad004");
                                                                } else {
                                                                    at.a(activity3);
                                                                }
                                                            }
                                                        };
                                                        Object[] objArr9 = {onClickListener};
                                                        ChangeQuickRedirect changeQuickRedirect8 = ModalDialog.a;
                                                        if (PatchProxy.isSupport(objArr9, modalDialog, changeQuickRedirect8, false, "cfa5b2b0b983b4cd83da8a523b979c21", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr9, modalDialog, changeQuickRedirect8, false, "cfa5b2b0b983b4cd83da8a523b979c21");
                                                        } else {
                                                            modalDialog.b.setOnClickListener(onClickListener);
                                                        }
                                                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.meituan.msc.common.utils.at.3
                                                            public static ChangeQuickRedirect a;

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                Object[] objArr10 = {view2};
                                                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect9, false, "71ad7cea90937c9ea4f448a79595ec02", 4611686018427387906L)) {
                                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect9, false, "71ad7cea90937c9ea4f448a79595ec02");
                                                                } else {
                                                                    modalDialog.dismiss();
                                                                }
                                                            }
                                                        };
                                                        Object[] objArr10 = {Integer.valueOf((int) R.string.msc_shortcut_dialog_ok), onClickListener2};
                                                        ChangeQuickRedirect changeQuickRedirect9 = ModalDialog.a;
                                                        if (PatchProxy.isSupport(objArr10, modalDialog, changeQuickRedirect9, false, "1447e3ebb3ea31ea191ba4a57645cd16", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr10, modalDialog, changeQuickRedirect9, false, "1447e3ebb3ea31ea191ba4a57645cd16");
                                                        } else {
                                                            modalDialog.a(modalDialog.getContext().getString(R.string.msc_shortcut_dialog_ok), onClickListener2);
                                                        }
                                                        Object[] objArr11 = {activity3};
                                                        ChangeQuickRedirect changeQuickRedirect10 = at.a;
                                                        if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect10, true, "f0990c98c8c002af9292b1520ab747ff", RobustBitConfig.DEFAULT_VALUE)) {
                                                            intent2 = (Intent) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect10, true, "f0990c98c8c002af9292b1520ab747ff");
                                                        } else if (activity3 == null) {
                                                            intent2 = null;
                                                        } else {
                                                            Intent intent3 = new Intent();
                                                            if (ap.b()) {
                                                                intent3.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                                                                intent3.putExtra("extra_pkgname", activity3.getPackageName());
                                                            } else if (ap.d()) {
                                                                intent3.setComponent(new ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
                                                                intent3.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
                                                            } else if (ap.c()) {
                                                                intent3.setComponent(new ComponentName("com.bbk.launcher2", "com.bbk.launcher2.installshortcut.PurviewActivity"));
                                                            } else if (ap.e()) {
                                                                intent3 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                                                                intent3.addCategory("android.intent.category.DEFAULT");
                                                                intent3.putExtra("packageName", activity3.getPackageName());
                                                            } else {
                                                                intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                                intent3.setData(Uri.fromParts("package", activity3.getPackageName(), null));
                                                            }
                                                            intent2 = intent3;
                                                        }
                                                        int i2 = intent2 != null ? R.string.msc_shortcut_permission_confirm_settings : R.string.msc_shortcut_permission_confirm_know_more;
                                                        View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: com.meituan.msc.common.utils.at.4
                                                            public static ChangeQuickRedirect a;

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                Object[] objArr12 = {view2};
                                                                ChangeQuickRedirect changeQuickRedirect11 = a;
                                                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect11, false, "ba7d561f8e580cf64347813c94c02dd7", 4611686018427387906L)) {
                                                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect11, false, "ba7d561f8e580cf64347813c94c02dd7");
                                                                } else if (intent2 != null) {
                                                                    activity3.startActivity(intent2);
                                                                } else {
                                                                    at.a(activity3);
                                                                }
                                                            }
                                                        };
                                                        Object[] objArr12 = {Integer.valueOf(i2), onClickListener3};
                                                        ChangeQuickRedirect changeQuickRedirect11 = ModalDialog.a;
                                                        if (PatchProxy.isSupport(objArr12, modalDialog, changeQuickRedirect11, false, "838d6ddabf69c842389c4edae55486a1", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr12, modalDialog, changeQuickRedirect11, false, "838d6ddabf69c842389c4edae55486a1");
                                                        } else {
                                                            modalDialog.b(modalDialog.getContext().getString(i2), onClickListener3);
                                                        }
                                                        modalDialog.show();
                                                    }
                                                    at.a(mSCReporter, "permission denied or other reason");
                                                }
                                            }
                                        }, 500L);
                                    }
                                }

                                @Override // com.squareup.picasso.Target
                                public final void onBitmapFailed(Drawable drawable) {
                                    Object[] objArr4 = {drawable};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "47bed36b787527f39bda0993305f3ae4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "47bed36b787527f39bda0993305f3ae4");
                                        return;
                                    }
                                    aw.a("2131362927", new Object[0]);
                                    at.a(mSCReporter, "onBitmapFailed");
                                }
                            });
                        }
                    }
                }
            } else if (id == R.id.traceView) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fe73b4df2434c6512d2eb6a168ed90cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fe73b4df2434c6512d2eb6a168ed90cf");
                } else if (this.g != null) {
                    if (this.g.a()) {
                        this.c.r.j();
                    } else {
                        this.c.r.j();
                        aw.a("部分数据需要小程序重启后显示", new Object[0]);
                    }
                }
            } else if (id == R.id.reloadView) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e94a06c4d60f116a9808378346ff6b89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e94a06c4d60f116a9808378346ff6b89");
                } else if ((this.e instanceof Activity) && (intent = (activity = (Activity) this.e).getIntent()) != null) {
                    intent.putExtra("disableReuseAny", true);
                    activity.finish();
                    activity.startActivity(intent);
                }
            } else if (id == R.id.scanCodeView) {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0d65b1960579e0f08fd6f9db1050593b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0d65b1960579e0f08fd6f9db1050593b");
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setPackage(getContext().getPackageName());
                    if (this.e instanceof Activity) {
                        Activity activity3 = (Activity) this.e;
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
        }
        dismiss();
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a367d11e4b67403342955f5f9d201b23", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a367d11e4b67403342955f5f9d201b23")).booleanValue() : this.c.r != null && this.c.r.x();
    }
}
