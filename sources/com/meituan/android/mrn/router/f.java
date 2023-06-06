package com.meituan.android.mrn.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.mrn.utils.aa;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public e b;
    private WeakReference<Activity> c;
    private b d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        Activity getActivity();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends NullPointerException {
        public a(String str) {
            super(str);
        }
    }

    private e d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb3164eb53f49b9a5cf4aeabc6e6832", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb3164eb53f49b9a5cf4aeabc6e6832") : this.b == null ? new e() : this.b;
    }

    public f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c015e4efbfd741dae69b04f73e1bd743", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c015e4efbfd741dae69b04f73e1bd743");
            return;
        }
        this.b = null;
        this.c = new WeakReference<>(activity);
    }

    public f(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646165d46636eb9c98aa255cc65d939d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646165d46636eb9c98aa255cc65d939d");
            return;
        }
        this.b = null;
        this.d = bVar;
    }

    private Activity e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2722a211537a253e30884ffc7be9e63f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2722a211537a253e30884ffc7be9e63f");
        }
        if (this.c != null) {
            return this.c.get();
        }
        if (this.d != null) {
            return this.d.getActivity();
        }
        return null;
    }

    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e65f40e46e3727dddf9bba17d606fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e65f40e46e3727dddf9bba17d606fd");
        }
        Activity e = e();
        if (e != null) {
            return e;
        }
        throw new a("Current Activity is null!\nRef: https://km.sankuai.com/page/277810769");
    }

    public final Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e321334735f2611b8ca35954f9584e47", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e321334735f2611b8ca35954f9584e47");
        }
        Activity e = e();
        return e != null ? e : com.meituan.android.mrn.common.a.a();
    }

    public final void a(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f972cf90a4e42245cf2b349111bb13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f972cf90a4e42245cf2b349111bb13");
        } else if (!TextUtils.isEmpty(str)) {
            com.meituan.android.mrn.router.a a2 = com.meituan.android.mrn.router.b.b.a(str);
            if (a2 == null || a2.a() == null) {
                throw new Exception("The target activity is absence.");
            }
            a2.a().finish();
        } else {
            a().finish();
        }
    }

    public final List<com.meituan.android.mrn.router.a> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81086047d00842f6cb7694e93b926765", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81086047d00842f6cb7694e93b926765") : com.meituan.android.mrn.router.b.b.a(true);
    }

    public final com.meituan.android.mrn.router.a a(String str, String str2, Map<String, Object> map, e eVar) {
        com.meituan.android.mrn.router.a aVar;
        Object[] objArr = {str, str2, map, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66691bbad1a3fd5b2fe09196946d66c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.router.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66691bbad1a3fd5b2fe09196946d66c");
        }
        if (TextUtils.isEmpty(str)) {
            aVar = null;
        } else {
            com.meituan.android.mrn.router.b.b.a();
            aVar = com.meituan.android.mrn.router.b.b.a(str);
        }
        if (aVar == null && !TextUtils.isEmpty(str2)) {
            com.meituan.android.mrn.router.b.b.a();
            aVar = com.meituan.android.mrn.router.b.b.b(str2);
        }
        if (aVar != null) {
            com.meituan.android.mrn.router.b.b.a(aVar);
            Activity e = e();
            if (e != null) {
                e.overridePendingTransition(0, 0);
            }
            return aVar;
        }
        a(str2, map, eVar);
        return null;
    }

    public final void a(String str, Map<String, Object> map, int i) {
        Object[] objArr = {str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f870949d641e4c04c6a46cf2be4426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f870949d641e4c04c6a46cf2be4426");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String str2 = "imeituan://www.meituan.com";
            if (com.meituan.android.mrn.config.c.a() != null) {
                com.meituan.android.mrn.config.c.a();
                if (!TextUtils.isEmpty(null)) {
                    com.meituan.android.mrn.config.c.a();
                    str2 = null;
                }
            }
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            String authority = parse.getAuthority();
            Uri.Builder builder = new Uri.Builder();
            if (!str.startsWith(scheme)) {
                builder.scheme(scheme);
                builder.authority(authority);
                builder.appendEncodedPath(str);
            } else {
                builder = Uri.parse(str).buildUpon();
            }
            Activity a2 = a();
            a2.startActivityForResult(aa.a(a2, aa.a(builder.build().toString(), map), "android.intent.action.VIEW", "android.intent.category.DEFAULT", null, a2.getPackageName(), null, null), i, null);
        }
    }

    public final void a(String str, Map<String, Object> map, e eVar) {
        int i;
        int i2;
        Object[] objArr = {str, map, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee06708e6ffdedca8700044d0d48602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee06708e6ffdedca8700044d0d48602");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String b2 = b(str);
            e d = eVar == null ? d() : eVar;
            Uri a2 = aa.a(b2, map, d.k);
            Context b3 = b();
            String str2 = d.d;
            if (d.i) {
                str2 = b3.getPackageName();
            }
            if (d.l) {
                int[] a3 = a(b3, d, str2);
                i2 = a3[0];
                i = a3[1];
            } else {
                i = -1;
                i2 = -1;
            }
            if (d.o) {
                if (d.j == null) {
                    d.j = new HashMap();
                }
                d.j.put("isTransparent", Boolean.valueOf(d.o));
                d.j.put("hideLoading", Boolean.valueOf(d.p));
                if (d.l) {
                    d.j.put("enterAnim", Integer.valueOf(i2));
                    d.j.put("exitAnim", Integer.valueOf(i));
                }
            }
            Intent a4 = aa.a(b3, a2, d.a, d.b, d.c, str2, d.e, d.j);
            if (d.h) {
                aa.a(b3, a4, d.f, null);
            } else {
                aa.a(b3, a4);
            }
            if (b3 instanceof Activity) {
                if (d.l && (i != -1 || i2 != -1)) {
                    ((Activity) b3).overridePendingTransition(i2, i);
                } else if (d.g) {
                    ((Activity) b3).overridePendingTransition(R.anim.mrn_activity_open_present, -1);
                }
            }
        }
    }

    private int[] a(Context context, e eVar, String str) {
        int i = 0;
        Object[] objArr = {context, eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66432884d83e16b90e9d9f79bc1ab4db", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66432884d83e16b90e9d9f79bc1ab4db");
        }
        int[] iArr = {-1, -1};
        Resources resources = context.getResources();
        try {
            if (!TextUtils.isEmpty(eVar.m)) {
                iArr[0] = "mrn_anim_no".equals(eVar.m) ? 0 : resources.getIdentifier(eVar.m, "anim", str);
            }
            if (!TextUtils.isEmpty(eVar.n)) {
                if (!"mrn_anim_no".equals(eVar.n)) {
                    i = resources.getIdentifier(eVar.n, "anim", str);
                }
                iArr[1] = i;
            }
        } catch (Exception e) {
            com.meituan.android.mrn.utils.c.a("[PageRouterController@openPage]", e);
        }
        return iArr;
    }

    public static String b(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "525af98c362eb0fb333fa92ddf1f6c0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "525af98c362eb0fb333fa92ddf1f6c0f");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            String o = com.meituan.android.mrn.config.c.a().o();
            if (!TextUtils.isEmpty(o)) {
                try {
                    str2 = URLEncoder.encode(str, "UTF-8");
                } catch (Throwable th) {
                    com.meituan.android.mrn.utils.c.a("[PageRouterController@convertHttpScheme]", th);
                    str2 = "";
                }
                return o + str2;
            }
        }
        return str;
    }

    public final void b(String str, Map<String, Object> map, e eVar) {
        int intValue;
        Object[] objArr = {str, map, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b344e14e16c8b85bc9108d1ed43f37c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b344e14e16c8b85bc9108d1ed43f37c");
            return;
        }
        if (map != null && map.containsKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
            Object obj = map.get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
            if (obj instanceof String) {
                intValue = Integer.parseInt((String) obj);
            } else {
                intValue = obj instanceof Integer ? ((Integer) obj).intValue() : Integer.MIN_VALUE;
            }
            if (intValue != Integer.MIN_VALUE) {
                if (eVar == null) {
                    eVar = d();
                    eVar.f = intValue;
                } else if (eVar.f != 1) {
                    eVar.f = intValue;
                }
            }
        }
        a(str, map, eVar);
    }
}
