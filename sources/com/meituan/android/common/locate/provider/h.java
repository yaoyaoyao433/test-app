package com.meituan.android.common.locate.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.telephony.NeighboringCellInfo;
import android.text.TextUtils;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class h {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile h e;
    private Context a;
    private volatile List<String> b;
    private volatile List<String> c;
    private a.C0219a d;

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String[] a;
        private final String[] b;
        private String c;
        private String d;
        private SharedPreferences e;
        private int f;
        private int g;
        private ArrayList<String> h;
        private ArrayList<String> i;
        private MtTelephonyManager j;
        private C0219a k;
        private Context l;

        /* renamed from: com.meituan.android.common.locate.provider.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0219a {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
            public String f;
        }

        public a(Context context) {
            Context context2 = context;
            Object[] objArr = {context2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7619c5b50072bd0b6f54d23dd8c3e7a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7619c5b50072bd0b6f54d23dd8c3e7a");
                return;
            }
            this.a = new String[]{"com.mediatek.telephonyManager.TelephonyManagerEx", "android.telephony.TelephonyManager", "android.telephonyManager.MSimTelephonyManager", "com.android.internal.telephonyManager.Phone", "com.android.internal.telephonyManager.PhoneFactory", "com.lge.telephonyManager.msim.LGMSimTelephonyManager", "com.asus.telephonyManager.AsusTelephonyManager", "com.htc.telephonyManager.HtcTelephonyManager"};
            this.b = new String[]{"getDeviceIdGemini", "getDeviceId", "getDeviceIdDs", "getDeviceIdExt"};
            this.c = "";
            this.d = "";
            this.f = 0;
            this.g = 1;
            this.h = new ArrayList<>();
            this.i = new ArrayList<>();
            this.k = null;
            this.l = context2;
            try {
                this.j = Privacy.createTelephonyManager(context2, "pt-c140c5921e4d3392");
                this.e = PreferenceManager.getDefaultSharedPreferences(context);
                this.d = this.e.getString("dualSIMTeleManagerClass", "");
                this.c = this.e.getString("methodTailVariant", "");
                if (Build.VERSION.SDK_INT < 21) {
                    if (context2 == null) {
                        context2 = g.a();
                    }
                    if (context2 != null ? s.a(context2).a() : true) {
                        c();
                    }
                }
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
            }
        }

        private void a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c67a7b3758818e7530bb26dc8b37e9dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c67a7b3758818e7530bb26dc8b37e9dd");
                return;
            }
            this.h.add(str);
            this.i.add(str2);
        }

        private boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfdbe3ca82983c0da0e10879c5c50090", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfdbe3ca82983c0da0e10879c5c50090")).booleanValue();
            }
            try {
                Class.forName(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        private boolean a(String str, String str2, String str3) {
            Class<?> cls;
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f415938f92b54a816916994941b3ae60", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f415938f92b54a816916994941b3ae60")).booleanValue();
            }
            Class<?>[] clsArr = {Integer.TYPE, Long.TYPE};
            for (int i = 0; i < 2; i++) {
                Class<?> cls2 = clsArr[i];
                try {
                    cls = Class.forName(str);
                } catch (Throwable unused) {
                }
                if (cls.getDeclaredMethod(str2 + str3, cls2).getReturnType().equals(String.class)) {
                    return true;
                }
            }
            return false;
        }

        private boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b32a5217ee33db5cf4cdfaf91db7be5d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b32a5217ee33db5cf4cdfaf91db7be5d")).booleanValue() : !this.d.equalsIgnoreCase("") && a(this.d, "getDeviceId", this.c);
        }

        private boolean b(String str, String str2) {
            String substring;
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e91d5823e93b203f401075fa743ea09", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e91d5823e93b203f401075fa743ea09")).booleanValue();
            }
            try {
                Class<?> cls = Class.forName(str);
                new Class[1][0] = Integer.TYPE;
                Method[] declaredMethods = cls.getDeclaredMethods();
                for (int length = declaredMethods.length - 1; length >= 0; length--) {
                    if (declaredMethods[length].getReturnType().equals(String.class)) {
                        String name = declaredMethods[length].getName();
                        if (name.contains(str2)) {
                            Class<?>[] parameterTypes = declaredMethods[length].getParameterTypes();
                            try {
                                if (parameterTypes.length <= 0) {
                                    substring = name.substring(str2.length(), name.length());
                                    this.h.add(str);
                                } else if (parameterTypes[0].equals(Integer.TYPE)) {
                                    substring = name.substring(str2.length(), name.length());
                                    this.h.add(str);
                                } else {
                                    continue;
                                }
                                this.i.add(substring);
                                return true;
                            } catch (Throwable unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            return false;
        }

        private void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d8d251a75ebd2196332221ff7f76094", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d8d251a75ebd2196332221ff7f76094");
            } else if (this.j == null) {
            } else {
                try {
                    if (b()) {
                        a(this.d, this.c);
                    } else {
                        d();
                    }
                } catch (Throwable th) {
                    LogUtils.a(getClass(), th);
                }
            }
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff5742bd744192f134249ee93cda7534", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff5742bd744192f134249ee93cda7534");
                return;
            }
            this.d = "android.telephonyManager.TelephonyManager";
            for (int i = 0; i < this.a.length; i++) {
                try {
                    if (a(this.a[i])) {
                        for (String str : this.b) {
                            b(this.a[i], str);
                        }
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        }

        public C0219a a() {
            return this.k;
        }
    }

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28b887e7a5408bb5ff9e0a3c3b6cdfe1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28b887e7a5408bb5ff9e0a3c3b6cdfe1");
            return;
        }
        this.a = context;
        com.meituan.android.common.locate.util.g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.provider.h.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9030fad39b818f0cb0fea7ed63a2c909", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9030fad39b818f0cb0fea7ed63a2c909");
                    return;
                }
                LogUtils.a("DualTelephonyInfoProvider async init begin");
                h.this.b();
                LogUtils.a("DualTelephonyInfoProvider async init end");
            }
        });
    }

    public static h a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5e9c106b8ebd287dffcd5bbc6eeb240", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5e9c106b8ebd287dffcd5bbc6eeb240");
        }
        if (e == null) {
            synchronized (h.class) {
                if (e == null) {
                    e = new h(context);
                }
            }
        }
        return e;
    }

    private static Object a(String str, int i, String str2, String str3, Class cls) {
        Object obj;
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "504f3910d992a271f1ee221afaff8133", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "504f3910d992a271f1ee221afaff8133");
        }
        try {
            obj = com.meituan.android.common.locate.util.l.a(str, new Object[0]);
        } catch (Exception unused) {
            obj = null;
        }
        try {
            new Class[1][0] = cls;
            return com.meituan.android.common.locate.util.l.a(obj, str2 + str3, Integer.valueOf(i));
        } catch (Throwable unused2) {
            return null;
        }
    }

    private List<NeighboringCellInfo> a(String str, int i) {
        MtTelephonyManager createTelephonyManager;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb8167e3a7054b30bc136e7012b9be92", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb8167e3a7054b30bc136e7012b9be92");
        }
        try {
            createTelephonyManager = Privacy.createTelephonyManager(this.a, "pt-c140c5921e4d3392");
        } catch (Throwable unused) {
        }
        if (createTelephonyManager == null) {
            return null;
        }
        if (this.d != null && this.d.f != null && this.d.e != null) {
            if (a(this.d.e, i, str, this.d.f, Integer.TYPE) == null && i == 0) {
                return createTelephonyManager.getNeighboringCellInfo();
            }
            return null;
        }
        return createTelephonyManager.getNeighboringCellInfo();
    }

    private void a(a.C0219a c0219a) {
        Object[] objArr = {c0219a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12816f26b1f1bfef1a69a05bb56efd3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12816f26b1f1bfef1a69a05bb56efd3b");
        } else if (c0219a == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            a(arrayList, c0219a.a);
            a(arrayList, c0219a.c);
            this.b = arrayList;
            ArrayList arrayList2 = new ArrayList();
            a(arrayList2, c0219a.b);
            a(arrayList2, c0219a.d);
            this.c = arrayList2;
        }
    }

    private void a(List list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99b48017b8c8eb8eadca20b1754aa723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99b48017b8c8eb8eadca20b1754aa723");
        } else if (list == null || TextUtils.isEmpty(str) || list.contains(str)) {
        } else {
            list.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db9ba64cb8fd8b594159122ab24efdc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db9ba64cb8fd8b594159122ab24efdc3");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                this.d = new a(this.a).a();
                this.c = null;
                this.b = null;
                LogUtils.a("Android Q can't get imei and meid");
            } else if (Build.VERSION.SDK_INT >= 21) {
                b(this.a);
            } else {
                a(this.d);
            }
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
    }

    @SuppressLint({"MissingPermission"})
    private void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dff27e404175ae83bdef09cdf35fde57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dff27e404175ae83bdef09cdf35fde57");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LogUtils.a("unique imei or meid number：" + arrayList.size());
            try {
                a(arrayList2, AppUtil.getIMSI(context, 0));
                a(arrayList2, AppUtil.getIMSI(context, 1));
            } catch (Throwable th) {
                LogUtils.a(th);
            }
            this.c = arrayList2;
            LogUtils.a("imsi number：" + arrayList2.size());
        }
    }

    public List<NeighboringCellInfo> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5125b5b76d7cfbe465b30c0a8dc77271", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5125b5b76d7cfbe465b30c0a8dc77271");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            LogUtils.a("DualTelephonyInfoProvider can't get getNeighboringCellInfo, due to SDK version higher than 28.");
            return null;
        }
        com.meituan.android.common.locate.api.a.a("getNeighboringCellInfo_sdk", 1);
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "type_cell_info_get_neighboring"));
        return a("getNeighboringCellInfo", i);
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24382c66bcb14de624aec954e32c661b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24382c66bcb14de624aec954e32c661b")).booleanValue() : this.b != null && this.b.size() > 1;
    }

    public String b(int i) {
        Object obj;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c4dea40f9a3359ea4a55b1924e6b7c0", RobustBitConfig.DEFAULT_VALUE)) {
            obj = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c4dea40f9a3359ea4a55b1924e6b7c0");
        } else if (this.c == null || i >= this.c.size()) {
            return "";
        } else {
            obj = this.c.get(i);
        }
        return (String) obj;
    }
}
