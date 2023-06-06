package com.meituan.mmp.lib.pip;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.mmp.lib.t;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.au;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.bc;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.permission.g;
import com.meituan.mmp.lib.utils.permission.h;
import com.meituan.mmp.lib.utils.permission.i;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static c b = null;
    private static f c = null;
    private static a d = null;
    private static d e = null;
    private static boolean f = false;

    public static /* synthetic */ Intent a(Context context, Intent intent, String str, String str2, boolean z) {
        Intent intent2;
        Object[] objArr = {context, intent, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb3baf087e532ce74d23c5f9fda5e7f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb3baf087e532ce74d23c5f9fda5e7f0");
        }
        if (intent == null) {
            com.meituan.mmp.lib.trace.b.b("getPipStartIntent intent null", str + StringUtil.SPACE + str2);
            if (context instanceof Activity) {
                intent2 = ((Activity) context).getIntent();
            } else {
                com.meituan.mmp.lib.trace.b.b("getPipStartIntent context not Activity", str + StringUtil.SPACE + str2);
                return null;
            }
        } else {
            intent2 = intent;
        }
        com.meituan.mmp.lib.trace.b.b("getPipStartIntent ", str + StringUtil.SPACE + str2);
        intent2.addCategory("android.intent.category.DEFAULT").removeCategory("android.intent.category.LAUNCHER");
        intent2.setAction("android.intent.action.VIEW");
        intent2.putExtra("reload", false);
        intent2.putExtra("appId", str);
        intent2.putExtra("targetPath", str2);
        intent2.putExtra("isLivePIPStarted", true);
        intent2.setPackage(MMPEnvHelper.getContext().getPackageName());
        if (z || TextUtils.equals(t.b(), str)) {
            intent2.setFlags(603979776);
        }
        return intent2;
    }

    public static void a() {
        f = true;
    }

    public static void b() {
        f = false;
    }

    public static boolean a(final Activity activity, final d dVar) {
        boolean b2;
        int[] iArr;
        Object[] objArr = {activity, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5786398662115d9ba4741045a62b79c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5786398662115d9ba4741045a62b79c")).booleanValue();
        }
        if (f || dVar == null) {
            return false;
        }
        final Context context = dVar.f.getContext();
        com.meituan.mmp.lib.utils.permission.g a2 = com.meituan.mmp.lib.utils.permission.g.a();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.utils.permission.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "964c2596bac22e18a13ad9bc4b07917e", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "964c2596bac22e18a13ad9bc4b07917e")).booleanValue();
        } else {
            if (Build.VERSION.SDK_INT < 23) {
                if (!a2.c()) {
                    if (a2.d()) {
                        b2 = a2.a(context);
                    } else if (!a2.b()) {
                        if (!a2.e()) {
                            if (!a2.f()) {
                                if (!a2.g()) {
                                    if (a2.h()) {
                                        Object[] objArr3 = {context};
                                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.utils.permission.g.a;
                                        b2 = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "c5ef0db99d5af43a9e3b99d2e1a480d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "c5ef0db99d5af43a9e3b99d2e1a480d2")).booleanValue() : h.a(context);
                                    }
                                } else {
                                    Object[] objArr4 = {context};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.utils.permission.g.a;
                                    b2 = PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "1953c913df9a003839c1eaad0c4a1aa3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "1953c913df9a003839c1eaad0c4a1aa3")).booleanValue() : i.a(context);
                                }
                            } else {
                                Object[] objArr5 = {context};
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.utils.permission.g.a;
                                b2 = PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "98aa6b1d343fda9bcbc9c32cf28bcb6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "98aa6b1d343fda9bcbc9c32cf28bcb6d")).booleanValue() : com.meituan.mmp.lib.utils.permission.e.a(context);
                            }
                        } else {
                            Object[] objArr6 = {context};
                            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.mmp.lib.utils.permission.g.a;
                            b2 = PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "5628cfb423172f9ff12eccc3b8b34007", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "5628cfb423172f9ff12eccc3b8b34007")).booleanValue() : com.meituan.mmp.lib.utils.permission.f.a(context);
                        }
                    } else {
                        Object[] objArr7 = {context};
                        ChangeQuickRedirect changeQuickRedirect7 = com.meituan.mmp.lib.utils.permission.g.a;
                        b2 = PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "6b766db6ab6109442a77a9201f6b30d5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "6b766db6ab6109442a77a9201f6b30d5")).booleanValue() : com.meituan.mmp.lib.utils.permission.b.a(context);
                    }
                } else {
                    Object[] objArr8 = {context};
                    ChangeQuickRedirect changeQuickRedirect8 = com.meituan.mmp.lib.utils.permission.g.a;
                    b2 = PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "7ee40de235f6211d246697a07b98bede", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "7ee40de235f6211d246697a07b98bede")).booleanValue() : com.meituan.mmp.lib.utils.permission.d.a(context);
                }
            }
            b2 = a2.b(context);
        }
        if (b2) {
            Object[] objArr9 = {context, dVar};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "bd78b37c62515b6e0f3b636d647f4cc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "bd78b37c62515b6e0f3b636d647f4cc8");
            } else {
                com.meituan.mmp.lib.trace.b.b("enterPipMode", dVar.e);
                final Context applicationContext = context.getApplicationContext();
                if (b == null) {
                    b = new c(applicationContext);
                }
                if (c == null) {
                    c = new f(applicationContext);
                }
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "8851b5dafd25a58b693ce0d8bd18fa37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "8851b5dafd25a58b693ce0d8bd18fa37");
                } else if (d == null) {
                    d = new a();
                    MMPEnvHelper.getContext().registerReceiver(d, new IntentFilter("mmp-float-view-dismiss-action"));
                }
                final f fVar = c;
                View view = dVar.f;
                Object[] objArr11 = {view};
                ChangeQuickRedirect changeQuickRedirect11 = f.a;
                if (PatchProxy.isSupport(objArr11, fVar, changeQuickRedirect11, false, "f66ddae1611380e8eb0a569fd90cdaa9", RobustBitConfig.DEFAULT_VALUE)) {
                    fVar = (f) PatchProxy.accessDispatch(objArr11, fVar, changeQuickRedirect11, false, "f66ddae1611380e8eb0a569fd90cdaa9");
                } else {
                    if (fVar.b != view) {
                        fVar.removeAllViews();
                    }
                    fVar.b = bc.a(view);
                    fVar.addView(fVar.b, 0, new RelativeLayout.LayoutParams(Math.max(au.a(110.0f), view.getWidth() / 3), Math.max(view.getHeight() / 3, au.a(160.0f))));
                    Object[] objArr12 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect12 = f.a;
                    if (PatchProxy.isSupport(objArr12, fVar, changeQuickRedirect12, false, "6a21cab1790e90b5d16895d35b4dbfd4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, fVar, changeQuickRedirect12, false, "6a21cab1790e90b5d16895d35b4dbfd4");
                    } else {
                        if (fVar.c == null) {
                            fVar.c = new ImageView(fVar.getContext());
                            fVar.c.setImageDrawable(fVar.getResources().getDrawable(R.drawable.mmp_close));
                            fVar.c.setBackgroundResource(R.drawable.mmp_camera_focus_marker_fill);
                            fVar.c.setPadding(5, 5, 5, 5);
                            fVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.pip.f.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr13 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect13 = a;
                                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "c321986a356255295333299b23a06750", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "c321986a356255295333299b23a06750");
                                        return;
                                    }
                                    bb.b("close", new Object[0]);
                                    if (fVar.d != null) {
                                        fVar.d.onClick(view2);
                                    }
                                }
                            });
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(p.d(20), p.d(20));
                        layoutParams.addRule(11);
                        layoutParams.setMargins(10, 10, 10, 10);
                        fVar.addView(bc.a(fVar.c), layoutParams);
                    }
                }
                fVar.d = new View.OnClickListener() { // from class: com.meituan.mmp.lib.pip.e.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr13 = {view2};
                        ChangeQuickRedirect changeQuickRedirect13 = a;
                        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "f5408c07add3ef38168bf0463296279c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "f5408c07add3ef38168bf0463296279c");
                        } else {
                            e.a(b.PIP_CLOSE_BUTTON_CLICKED);
                        }
                    }
                };
                c cVar = b;
                cVar.g = new View.OnClickListener() { // from class: com.meituan.mmp.lib.pip.e.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr13 = {view2};
                        ChangeQuickRedirect changeQuickRedirect13 = a;
                        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "46befd33c652c1c38c8dc01e4509260a", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "46befd33c652c1c38c8dc01e4509260a");
                            return;
                        }
                        com.meituan.mmp.lib.utils.b.a(applicationContext, e.a(context, dVar.c, dVar.a, dVar.e, dVar.h));
                        view2.post(new Runnable() { // from class: com.meituan.mmp.lib.pip.e.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr14 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect14 = a;
                                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "10cf443193697ecfb653644928abf990", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "10cf443193697ecfb653644928abf990");
                                } else {
                                    e.a(b.PIP_OPEN_PAGE_RE_ENTER);
                                }
                            }
                        });
                    }
                };
                f fVar2 = c;
                Object[] objArr13 = {fVar2};
                ChangeQuickRedirect changeQuickRedirect13 = c.a;
                if (PatchProxy.isSupport(objArr13, cVar, changeQuickRedirect13, false, "a1960a94da15b04d8a9647cc547e751c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr13, cVar, changeQuickRedirect13, false, "a1960a94da15b04d8a9647cc547e751c");
                } else if (cVar.b != null && fVar2 != null && cVar.d != null && !cVar.e) {
                    cVar.c = fVar2;
                    Object[] objArr14 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect14 = au.a;
                    if (PatchProxy.isSupport(objArr14, null, changeQuickRedirect14, true, "de7c2134eb94346575d4a9c8698c7bec", RobustBitConfig.DEFAULT_VALUE)) {
                        iArr = (int[]) PatchProxy.accessDispatch(objArr14, null, changeQuickRedirect14, true, "de7c2134eb94346575d4a9c8698c7bec");
                    } else {
                        Display defaultDisplay = ((WindowManager) au.a().getSystemService("window")).getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getSize(point);
                        iArr = new int[]{point.x, point.y};
                    }
                    int width = fVar2.getWidth() != 0 ? fVar2.getWidth() : au.a(110.0f);
                    int height = fVar2.getHeight() != 0 ? fVar2.getHeight() : au.a(160.0f);
                    cVar.d.x = iArr[0] - width;
                    cVar.d.y = (iArr[1] - au.a(83.0f)) - height;
                    cVar.d.width = width;
                    cVar.d.height = height;
                    cVar.d.format = 1;
                    cVar.f = width;
                    fVar2.setOnTouchListener(cVar);
                    cVar.b.addView(bc.a(fVar2), cVar.d);
                    cVar.e = true;
                }
            }
            e = dVar;
            a(true);
            return true;
        }
        final com.meituan.mmp.lib.utils.permission.g a3 = com.meituan.mmp.lib.utils.permission.g.a();
        String str = dVar.a;
        Object[] objArr15 = {activity, "", str};
        ChangeQuickRedirect changeQuickRedirect15 = com.meituan.mmp.lib.utils.permission.g.a;
        if (PatchProxy.isSupport(objArr15, a3, changeQuickRedirect15, false, "3d7db40a0a422762d197046345eb3d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr15, a3, changeQuickRedirect15, false, "3d7db40a0a422762d197046345eb3d28");
        } else if (com.meituan.mmp.lib.api.p.a(str)) {
            if (Build.VERSION.SDK_INT < 23) {
                if (a3.c()) {
                    Object[] objArr16 = {activity};
                    ChangeQuickRedirect changeQuickRedirect16 = com.meituan.mmp.lib.utils.permission.g.a;
                    if (PatchProxy.isSupport(objArr16, a3, changeQuickRedirect16, false, "06f2036df7dbd97656e133891a1a7631", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, a3, changeQuickRedirect16, false, "06f2036df7dbd97656e133891a1a7631");
                    } else {
                        a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.7
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.permission.g.a
                            public final void a(boolean z) {
                                Object[] objArr17 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect17 = a;
                                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "bf0eed15a4b607335848c2641163fe25", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "bf0eed15a4b607335848c2641163fe25");
                                } else if (z) {
                                    Context context2 = activity;
                                    Object[] objArr18 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect18 = d.b;
                                    if (PatchProxy.isSupport(objArr18, null, changeQuickRedirect18, true, "8f680ecc9f798682158f279cfb95d8af", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr18, null, changeQuickRedirect18, true, "8f680ecc9f798682158f279cfb95d8af");
                                        return;
                                    }
                                    int a4 = d.a();
                                    if (a4 == 5) {
                                        String packageName = context2.getPackageName();
                                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        intent.setData(Uri.fromParts("package", packageName, null));
                                        intent.setFlags(y.a);
                                        if (d.a(intent, context2)) {
                                            context2.startActivity(intent);
                                        } else if (context2 instanceof Activity) {
                                            new com.sankuai.meituan.android.ui.widget.a((Activity) context2, context2.getString(R.string.mmp_live_enter_setting_fail), -1).a();
                                        }
                                    } else if (a4 == 6) {
                                        Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                                        intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                                        intent2.putExtra("extra_pkgname", context2.getPackageName());
                                        intent2.setFlags(y.a);
                                        if (d.a(intent2, context2)) {
                                            context2.startActivity(intent2);
                                        } else if (context2 instanceof Activity) {
                                            new com.sankuai.meituan.android.ui.widget.a((Activity) context2, context2.getString(R.string.mmp_live_enter_setting_fail), -1).a();
                                        }
                                    } else if (a4 == 7) {
                                        Intent intent3 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                                        intent3.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                                        intent3.putExtra("extra_pkgname", context2.getPackageName());
                                        intent3.setFlags(y.a);
                                        if (d.a(intent3, context2)) {
                                            context2.startActivity(intent3);
                                        } else if (context2 instanceof Activity) {
                                            new com.sankuai.meituan.android.ui.widget.a((Activity) context2, context2.getString(R.string.mmp_live_enter_setting_fail), -1).a();
                                        }
                                    } else if (a4 == 8) {
                                        Intent intent4 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                                        intent4.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                                        intent4.putExtra("extra_pkgname", context2.getPackageName());
                                        intent4.setFlags(y.a);
                                        if (d.a(intent4, context2)) {
                                            context2.startActivity(intent4);
                                            return;
                                        }
                                        Intent intent5 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                                        intent5.setPackage("com.miui.securitycenter");
                                        intent5.putExtra("extra_pkgname", context2.getPackageName());
                                        intent5.setFlags(y.a);
                                        if (d.a(intent5, context2)) {
                                            context2.startActivity(intent5);
                                        } else if (context2 instanceof Activity) {
                                            new com.sankuai.meituan.android.ui.widget.a((Activity) context2, context2.getString(R.string.mmp_live_enter_setting_fail), -1).a();
                                        }
                                    }
                                }
                            }
                        });
                    }
                } else if (a3.d()) {
                    a3.a(activity, "");
                } else if (a3.b()) {
                    Object[] objArr17 = {activity};
                    ChangeQuickRedirect changeQuickRedirect17 = com.meituan.mmp.lib.utils.permission.g.a;
                    if (PatchProxy.isSupport(objArr17, a3, changeQuickRedirect17, false, "93f932d6f31d7c860177f794a86ccacd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr17, a3, changeQuickRedirect17, false, "93f932d6f31d7c860177f794a86ccacd");
                    } else {
                        a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.5
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.permission.g.a
                            public final void a(boolean z) {
                                Object[] objArr18 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect18 = a;
                                if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "ed63a5b38d2a5ab15c7a10871a1ad920", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "ed63a5b38d2a5ab15c7a10871a1ad920");
                                } else if (z) {
                                    Context context2 = activity;
                                    Object[] objArr19 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect19 = b.b;
                                    if (PatchProxy.isSupport(objArr19, null, changeQuickRedirect19, true, "5dc001b0f03636bbdd5554ed78dc068e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr19, null, changeQuickRedirect19, true, "5dc001b0f03636bbdd5554ed78dc068e");
                                        return;
                                    }
                                    try {
                                        Intent intent = new Intent();
                                        intent.setFlags(y.a);
                                        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
                                        if (b.a() == 3.1d) {
                                            context2.startActivity(intent);
                                            return;
                                        }
                                        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                                        context2.startActivity(intent);
                                    } catch (ActivityNotFoundException unused) {
                                        Intent intent2 = new Intent();
                                        intent2.setFlags(y.a);
                                        intent2.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
                                        try {
                                            context2.startActivity(intent2);
                                        } catch (Exception unused2) {
                                        }
                                    } catch (SecurityException unused3) {
                                        Intent intent3 = new Intent();
                                        intent3.setFlags(y.a);
                                        intent3.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                                        try {
                                            context2.startActivity(intent3);
                                        } catch (Exception unused4) {
                                        }
                                    } catch (Exception unused5) {
                                        if (context2 instanceof Activity) {
                                            new com.sankuai.meituan.android.ui.widget.a((Activity) context2, context2.getString(R.string.mmp_live_enter_setting_fail), -1).a();
                                        }
                                    }
                                }
                            }
                        });
                    }
                } else if (a3.e()) {
                    Object[] objArr18 = {activity};
                    ChangeQuickRedirect changeQuickRedirect18 = com.meituan.mmp.lib.utils.permission.g.a;
                    if (PatchProxy.isSupport(objArr18, a3, changeQuickRedirect18, false, "bace609da7ad139b1fc0110aca0c0b2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr18, a3, changeQuickRedirect18, false, "bace609da7ad139b1fc0110aca0c0b2c");
                    } else {
                        a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.4
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.permission.g.a
                            public final void a(boolean z) {
                                boolean z2 = true;
                                Object[] objArr19 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect19 = a;
                                if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "1bab72735daf8f47a5495c15bfdfd271", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "1bab72735daf8f47a5495c15bfdfd271");
                                } else if (z) {
                                    Context context2 = activity;
                                    Object[] objArr20 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect20 = f.b;
                                    if (PatchProxy.isSupport(objArr20, null, changeQuickRedirect20, true, "c3b28ecedaa58669bf54ecd29220eec0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr20, null, changeQuickRedirect20, true, "c3b28ecedaa58669bf54ecd29220eec0");
                                        return;
                                    }
                                    Intent intent = new Intent();
                                    intent.setClassName("com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
                                    intent.setFlags(y.a);
                                    Object[] objArr21 = {intent, context2};
                                    ChangeQuickRedirect changeQuickRedirect21 = f.b;
                                    if (PatchProxy.isSupport(objArr21, null, changeQuickRedirect21, true, "5d353825a56b03bb043683d612ab29f7", RobustBitConfig.DEFAULT_VALUE)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr21, null, changeQuickRedirect21, true, "5d353825a56b03bb043683d612ab29f7")).booleanValue();
                                    } else if (context2.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        context2.startActivity(intent);
                                    } else if (context2 instanceof Activity) {
                                        new com.sankuai.meituan.android.ui.widget.a((Activity) context2, context2.getString(R.string.mmp_live_enter_setting_fail), -1).a();
                                    }
                                }
                            }
                        });
                    }
                } else if (a3.f()) {
                    Object[] objArr19 = {activity};
                    ChangeQuickRedirect changeQuickRedirect19 = com.meituan.mmp.lib.utils.permission.g.a;
                    if (PatchProxy.isSupport(objArr19, a3, changeQuickRedirect19, false, "3f5cb07587e539ed664db6f2ab48d726", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr19, a3, changeQuickRedirect19, false, "3f5cb07587e539ed664db6f2ab48d726");
                    } else {
                        a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.8
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.permission.g.a
                            public final void a(boolean z) {
                                Object[] objArr20 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect20 = a;
                                if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "470783a7ff7ce15933335b1b3378c4da", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "470783a7ff7ce15933335b1b3378c4da");
                                } else if (z) {
                                    Context context2 = activity;
                                    Object[] objArr21 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect21 = e.b;
                                    if (PatchProxy.isSupport(objArr21, null, changeQuickRedirect21, true, "72a851e25df3be12125ec4ae3c37dab5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr21, null, changeQuickRedirect21, true, "72a851e25df3be12125ec4ae3c37dab5");
                                        return;
                                    }
                                    Intent intent = new Intent();
                                    intent.putExtra("packageName", context2.getPackageName());
                                    intent.setAction("com.oppo.safe");
                                    intent.setClassName("com.oppo.safe", "com.oppo.safe.permission.floatwindow.FloatWindowListActivity");
                                    if (e.a(context2, intent)) {
                                        return;
                                    }
                                    intent.setAction("com.color.safecenter");
                                    intent.setClassName("com.color.safecenter", "com.color.safecenter.permission.floatwindow.FloatWindowListActivity");
                                    if (e.a(context2, intent)) {
                                        return;
                                    }
                                    intent.setAction("com.coloros.safecenter");
                                    intent.setClassName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity");
                                    e.a(context2, intent);
                                }
                            }
                        });
                    }
                } else if (a3.g()) {
                    Object[] objArr20 = {activity};
                    ChangeQuickRedirect changeQuickRedirect20 = com.meituan.mmp.lib.utils.permission.g.a;
                    if (PatchProxy.isSupport(objArr20, a3, changeQuickRedirect20, false, "d49d2e97f4f174238e8a568d464678a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr20, a3, changeQuickRedirect20, false, "d49d2e97f4f174238e8a568d464678a2");
                    } else {
                        a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.9
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.permission.g.a
                            public final void a(boolean z) {
                                Object[] objArr21 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect21 = a;
                                if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "583151e78a3ca20ed5a0fb60c02de517", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "583151e78a3ca20ed5a0fb60c02de517");
                                } else if (z) {
                                    Context context2 = activity;
                                    Object[] objArr22 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect22 = i.b;
                                    if (PatchProxy.isSupport(objArr22, null, changeQuickRedirect22, true, "e1cf4a1196dc22719b7d350c1e23d2e1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr22, null, changeQuickRedirect22, true, "e1cf4a1196dc22719b7d350c1e23d2e1");
                                        return;
                                    }
                                    Intent intent = new Intent("com.iqoo.secure");
                                    intent.setClassName("com.iqoo.secure", "com.iqoo.secure.MainActivity");
                                    i.a(context2, intent);
                                }
                            }
                        });
                    }
                } else if (a3.h()) {
                    Object[] objArr21 = {activity};
                    ChangeQuickRedirect changeQuickRedirect21 = com.meituan.mmp.lib.utils.permission.g.a;
                    if (PatchProxy.isSupport(objArr21, a3, changeQuickRedirect21, false, "1b7e40ab9086410f9b53a564a0a77355", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr21, a3, changeQuickRedirect21, false, "1b7e40ab9086410f9b53a564a0a77355");
                    } else {
                        a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.10
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.permission.g.a
                            public final void a(boolean z) {
                                Object[] objArr22 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect22 = a;
                                if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "697e5f9326a0d9c76429936aabfe4615", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "697e5f9326a0d9c76429936aabfe4615");
                                } else if (z) {
                                    Context context2 = activity;
                                    Object[] objArr23 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect23 = h.b;
                                    if (PatchProxy.isSupport(objArr23, null, changeQuickRedirect23, true, "e17a8bb1966d2a72a32bf62a6666b6ae", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr23, null, changeQuickRedirect23, true, "e17a8bb1966d2a72a32bf62a6666b6ae");
                                    } else if (Build.VERSION.SDK_INT >= 21) {
                                        Intent intent = new Intent("com.smartisanos.security.action.SWITCHED_PERMISSIONS_NEW");
                                        intent.setClassName("com.smartisanos.security", "com.smartisanos.security.SwitchedPermissions");
                                        intent.putExtra("index", 17);
                                        h.a(context2, intent);
                                    } else {
                                        Intent intent2 = new Intent("com.smartisanos.security.action.SWITCHED_PERMISSIONS");
                                        intent2.setClassName("com.smartisanos.security", "com.smartisanos.security.SwitchedPermissions");
                                        intent2.putExtra("permission", new String[]{"android.permission.SYSTEM_ALERT_WINDOW"});
                                        h.a(context2, intent2);
                                    }
                                }
                            }
                        });
                    }
                }
            }
            Object[] objArr22 = {activity, ""};
            ChangeQuickRedirect changeQuickRedirect22 = com.meituan.mmp.lib.utils.permission.g.a;
            if (PatchProxy.isSupport(objArr22, a3, changeQuickRedirect22, false, "bdd8628ca243b267b9e36dfe016a6c08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr22, a3, changeQuickRedirect22, false, "bdd8628ca243b267b9e36dfe016a6c08");
            } else if (a3.d() && Build.VERSION.SDK_INT == 23) {
                a3.a(activity, "");
            } else if (Build.VERSION.SDK_INT >= 23) {
                a3.a(activity, new g.a() { // from class: com.meituan.mmp.lib.utils.permission.g.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.utils.permission.g.a
                    public final void a(boolean z) {
                        Object[] objArr23 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect23 = a;
                        if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "95971cddc7e8d38c0b3c440b6db671fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "95971cddc7e8d38c0b3c440b6db671fb");
                        } else if (z) {
                            g.b(activity, r3);
                        }
                    }
                });
            }
        }
        return false;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "791321bf7a86738a2aa90c73706cd481", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "791321bf7a86738a2aa90c73706cd481")).booleanValue();
        }
        if (e == null || !TextUtils.equals(str, e.a)) {
            return false;
        }
        com.meituan.mmp.lib.executor.a.b(new com.meituan.mmp.lib.executor.b() { // from class: com.meituan.mmp.lib.pip.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5768dfdaba0991c16a22ce92895f8c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5768dfdaba0991c16a22ce92895f8c0");
                } else {
                    e.a(b.EXIT_MP_CLOSE_BUTTON_CLICKED);
                }
            }
        });
        return true;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b93d06509255d43337d23a1ad9ead915", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b93d06509255d43337d23a1ad9ead915")).booleanValue();
        }
        if (e == null || !TextUtils.equals(e.d, str)) {
            return false;
        }
        return a(b.EXIT_PIP_CALLED);
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe05ae719ad1a7629234c1004af8675d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe05ae719ad1a7629234c1004af8675d")).booleanValue();
        }
        a(b.OTHER_VIDEO_PLAY);
        return true;
    }

    public static boolean a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "523d4dbf7d214a64bd151652d094816b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "523d4dbf7d214a64bd151652d094816b")).booleanValue();
        }
        if (e != null) {
            b.a.a("exitPipMode", bVar.toString());
            d();
            if (e != null && e.g != null) {
                e.g.a(bVar);
            }
            e = null;
            a(false);
            return true;
        }
        return false;
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e13300c6b00e0956cdc84f4dc276d009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e13300c6b00e0956cdc84f4dc276d009");
        } else if (e == null || !TextUtils.equals(e.a, str)) {
        } else {
            a(b.OTHERS);
        }
    }

    private static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57ba7fe8a2b2adc1568fdbd082ecfd14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57ba7fe8a2b2adc1568fdbd082ecfd14");
            return;
        }
        if (b != null) {
            b.a();
            b = null;
        }
        if (c != null) {
            c = null;
        }
        e();
    }

    private static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aeafdc84b68feef7e7e78b098aac533e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aeafdc84b68feef7e7e78b098aac533e");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPFloat", "dispatchFloatStatus " + z);
        Intent intent = new Intent("mmp-float-view-status-action");
        intent.putExtra("floatViewStatus", z);
        intent.putExtra("processName", com.meituan.mmp.lib.mp.a.d());
        intent.setPackage(MMPEnvHelper.getContext().getPackageName());
        com.sankuai.meituan.takeoutnew.util.aop.b.a(MMPEnvHelper.getContext(), intent);
    }

    private static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1636246f80cd8f3409dea321c47aaa67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1636246f80cd8f3409dea321c47aaa67");
        } else if (d != null) {
            MMPEnvHelper.getContext().unregisterReceiver(d);
            d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a32be6151518f0d81916dcfe5be27f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a32be6151518f0d81916dcfe5be27f");
            } else {
                e.a(b.EXIT_CLOSE_BY_BIZ_OPERATION);
            }
        }
    }
}
