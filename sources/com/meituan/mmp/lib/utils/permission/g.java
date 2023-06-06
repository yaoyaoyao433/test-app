package com.meituan.mmp.lib.utils.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.view.View;
import com.meituan.mmp.lib.utils.as;
import com.meituan.mmp.lib.widget.ModalDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static g c;
    ModalDialog b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z);
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ef83fcf45675b88c47f25754883c8b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ef83fcf45675b88c47f25754883c8b2");
        }
        if (c == null) {
            c = new g();
        }
        return c;
    }

    public boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7427f099b283eea53cff13a73c286312", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7427f099b283eea53cff13a73c286312")).booleanValue() : c.a(context);
    }

    public boolean b(Context context) {
        Boolean bool;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66895a4d0ecd83023c99a305f7d9dcd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66895a4d0ecd83023c99a305f7d9dcd8")).booleanValue();
        }
        if (d() && Build.VERSION.SDK_INT == 23) {
            return a(context);
        }
        Boolean bool2 = Boolean.TRUE;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                bool = (Boolean) Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            return bool.booleanValue();
        }
        bool = bool2;
        return bool.booleanValue();
    }

    public void a(Context context, final a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4490f5c5609fea91bca72037166d11e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4490f5c5609fea91bca72037166d11e");
            return;
        }
        try {
            if (this.b != null && this.b.isShowing()) {
                this.b.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (context instanceof Activity) {
            this.b = new ModalDialog(context);
            this.b.setCancelable(true);
            this.b.a((CharSequence) context.getString(R.string.mmp_live_permission_msg));
            this.b.b(context.getString(R.string.mmp_live_permission_positive), new View.OnClickListener() { // from class: com.meituan.mmp.lib.utils.permission.g.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "260092ec279a7b5e2800593dc088f286", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "260092ec279a7b5e2800593dc088f286");
                        return;
                    }
                    aVar.a(true);
                    g.this.b.dismiss();
                }
            });
            this.b.a(context.getString(R.string.mmp_live_permission_negative), new View.OnClickListener() { // from class: com.meituan.mmp.lib.utils.permission.g.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64703f1eb8daf2e5e6921bfa261d3c8a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64703f1eb8daf2e5e6921bfa261d3c8a");
                        return;
                    }
                    aVar.a(false);
                    g.this.b.dismiss();
                }
            });
            this.b.show();
        }
    }

    public void a(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c02b26cbae274ac0cb4e5385dc2a009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c02b26cbae274ac0cb4e5385dc2a009");
        } else {
            a(context, new a() { // from class: com.meituan.mmp.lib.utils.permission.g.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.utils.permission.g.a
                public final void a(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7647101e2a28b0859b0f3d4bf67ae930", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7647101e2a28b0859b0f3d4bf67ae930");
                    } else if (z) {
                        Context context2 = context;
                        String str2 = str;
                        Object[] objArr3 = {context2, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = c.b;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6ddecb7275960c2928a2ef61a64ab021", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6ddecb7275960c2928a2ef61a64ab021");
                            return;
                        }
                        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                        intent.putExtra("packageName", context2.getPackageName());
                        intent.setFlags(y.a);
                        try {
                            context2.startActivity(intent);
                        } catch (Exception unused) {
                            g.b(context2, str2);
                        }
                    }
                }
            });
        }
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f25eb3c63e568cc72b16a5687209b83", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f25eb3c63e568cc72b16a5687209b83")).booleanValue() : as.a();
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee359b2225acf31f71d6ce7f8ff744e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee359b2225acf31f71d6ce7f8ff744e")).booleanValue() : as.b();
    }

    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29cf604dedb3f9522f6ad7674ec65aff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29cf604dedb3f9522f6ad7674ec65aff")).booleanValue() : as.e();
    }

    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc2cf892e20fa02eacae1b85ddf7885", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc2cf892e20fa02eacae1b85ddf7885")).booleanValue() : Build.MANUFACTURER.contains("QiKU");
    }

    public boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269b77899e9d5a4a13a37951c3fb664c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269b77899e9d5a4a13a37951c3fb664c")).booleanValue() : Build.MANUFACTURER.contains("oppo");
    }

    public boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ce38c899ec2eb550444686dd246f85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ce38c899ec2eb550444686dd246f85")).booleanValue() : Build.MANUFACTURER.contains("vivo");
    }

    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b898121bdb7e7b74a2f3d6a26acf8357", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b898121bdb7e7b74a2f3d6a26acf8357")).booleanValue() : Build.MANUFACTURER.contains("smartisa");
    }

    @RequiresApi(api = 23)
    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "031872626d6d2aee85cccc6a3d214135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "031872626d6d2aee85cccc6a3d214135");
            return;
        }
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 7891);
            } else {
                context.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }
}
