package com.meituan.android.cipstorage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class as implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static ChangeQuickRedirect a;
    private volatile SharedPreferences b;
    private String c;
    private final Map<u, List<ah>> d;

    public as(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2e993f726a056c7459848b730803ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2e993f726a056c7459848b730803ad");
            return;
        }
        this.d = new HashMap();
        this.c = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = v.c.getSharedPreferences(str, 0);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        a a2;
        ArrayList arrayList;
        Object[] objArr = {sharedPreferences, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41d98fe3629bb1ffc61080d4c2814da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41d98fe3629bb1ffc61080d4c2814da");
        } else if (!v.d && (a2 = a(str)) != null && a2.b != null && a2.a != null) {
            synchronized (this.d) {
                List<ah> list = this.d.get(a2.b);
                arrayList = (list == null || list.size() <= 0) ? null : new ArrayList(list);
            }
            if (arrayList == null) {
                return;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            Object obj = all != null ? all.get(str) : null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ah ahVar = (ah) arrayList.get(i);
                if (obj != null) {
                    ahVar.a(this.c, a2.b, a2.a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public u b;
        public boolean c;

        public a(String str, u uVar, boolean z) {
            this.c = false;
            this.a = str;
            this.b = uVar;
            this.c = z;
        }
    }

    private a a(String str) {
        boolean z = false;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c747da474b40fc1f949544d16f1750", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c747da474b40fc1f949544d16f1750");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        u uVar = u.f;
        if (str.endsWith("::00::")) {
            uVar = u.e;
            str = str.substring(0, str.length() - 6);
        } else {
            if (str.endsWith("::00::0")) {
                uVar = u.e;
                str = str.substring(0, str.length() - 7);
            } else if (str.endsWith("::01::")) {
                uVar = u.b;
                str = str.substring(0, str.length() - 6);
            } else if (str.endsWith("::01::0")) {
                uVar = u.b;
                str = str.substring(0, str.length() - 7);
            } else if (str.endsWith("::10::")) {
                uVar = u.c;
                str = str.substring(0, str.length() - 6);
            } else if (str.endsWith("::10::0")) {
                uVar = u.c;
                str = str.substring(0, str.length() - 7);
            } else if (str.endsWith("::11::")) {
                uVar = u.d;
                str = str.substring(0, str.length() - 6);
            } else if (str.endsWith("::11::0")) {
                uVar = u.d;
                str = str.substring(0, str.length() - 7);
            }
            z = true;
        }
        return new a(str, uVar, z);
    }

    private String a(String str, u uVar, boolean z) {
        String str2;
        Object[] objArr = {str, uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6955e5d917ffa6ddc30ede6a544049", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6955e5d917ffa6ddc30ede6a544049");
        }
        if (uVar == u.e) {
            str2 = str + "::00::";
        } else if (uVar == u.b) {
            str2 = str + "::01::";
        } else if (uVar == u.c) {
            str2 = str + "::10::";
        } else if (uVar == u.d) {
            str2 = str + "::11::";
        } else {
            str2 = str + "::00::";
        }
        if (z) {
            return str2 + "0";
        }
        return str2;
    }

    public final boolean a(String str, boolean z, u uVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdd890d7b4d37c549499d5b21c1c9bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdd890d7b4d37c549499d5b21c1c9bf")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putBoolean(a(str, uVar, false), z).apply();
        return true;
    }

    public final boolean b(String str, boolean z, u uVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c6bc1bf3d92682120313b36e5276d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c6bc1bf3d92682120313b36e5276d9")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.getBoolean(a(str, uVar, false), z);
    }

    public final boolean a(String str, int i, u uVar) {
        Object[] objArr = {str, Integer.valueOf(i), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f27108264680a06da85a434f9286b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f27108264680a06da85a434f9286b4")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putInt(a(str, uVar, false), i).apply();
        return true;
    }

    public final int b(String str, int i, u uVar) {
        Object[] objArr = {str, Integer.valueOf(i), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9c66bac839878cb6531f832fceed4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9c66bac839878cb6531f832fceed4b")).intValue();
        }
        if (this.b == null) {
            return -1;
        }
        return this.b.getInt(a(str, uVar, false), i);
    }

    public final boolean a(String str, long j, u uVar) {
        Object[] objArr = {str, new Long(j), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cce17926c119645db6ca72cf10e13bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cce17926c119645db6ca72cf10e13bf")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putLong(a(str, uVar, false), j).apply();
        return true;
    }

    public final long b(String str, long j, u uVar) {
        Object[] objArr = {str, new Long(j), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f92e5b00f0f598ed853705d42d5941", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f92e5b00f0f598ed853705d42d5941")).longValue();
        }
        if (this.b == null) {
            return -1L;
        }
        return this.b.getLong(a(str, uVar, false), j);
    }

    public final boolean a(String str, float f, u uVar) {
        Object[] objArr = {str, Float.valueOf(f), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d10118b85304e52dc8260f72e311fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d10118b85304e52dc8260f72e311fa3")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putFloat(a(str, uVar, false), f).apply();
        return true;
    }

    public final float b(String str, float f, u uVar) {
        Object[] objArr = {str, Float.valueOf(f), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228c20791924d9b03ee2d2e396c0bb2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228c20791924d9b03ee2d2e396c0bb2c")).floatValue();
        }
        if (this.b == null) {
            return -1.0f;
        }
        return this.b.getFloat(a(str, uVar, false), f);
    }

    public final boolean a(String str, double d, u uVar) {
        Object[] objArr = {str, Double.valueOf(d), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "959341b3874dc4c1c9523e9f39c7d682", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "959341b3874dc4c1c9523e9f39c7d682")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putFloat(a(str, uVar, true), (float) d).apply();
        return true;
    }

    public final boolean a(String str, String str2, u uVar) {
        Object[] objArr = {str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1700d0544c692b5305824f530d66800", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1700d0544c692b5305824f530d66800")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putString(a(str, uVar, false), str2).apply();
        return true;
    }

    public final String b(String str, String str2, u uVar) {
        Object[] objArr = {str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86794b2ba35aca9eb6baf30797492c3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86794b2ba35aca9eb6baf30797492c3b");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getString(a(str, uVar, false), str2);
    }

    public final boolean a(String str, Set<String> set, u uVar) {
        Object[] objArr = {str, set, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5496ed1f6172806eb7db4a10172eb29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5496ed1f6172806eb7db4a10172eb29")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.edit().putStringSet(a(str, uVar, false), set).apply();
        return true;
    }

    public final Set<String> b(String str, Set<String> set, u uVar) {
        Object[] objArr = {str, set, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f035c7bc0ee0bc161436193df75ea5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f035c7bc0ee0bc161436193df75ea5a");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getStringSet(a(str, uVar, false), set);
    }

    public final boolean a(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f7011949a7c5be9db4c51369d9cb49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f7011949a7c5be9db4c51369d9cb49")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.contains(a(str, uVar, false)) || this.b.contains(a(str, uVar, true));
    }

    public final void a(ah ahVar, u uVar) {
        Object[] objArr = {ahVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2975ea895dca8a282d0110fe1c0cea76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2975ea895dca8a282d0110fe1c0cea76");
        } else if (this.b == null || ahVar == null || uVar == null) {
        } else {
            synchronized (this.d) {
                List<ah> list = this.d.get(uVar);
                if (list == null) {
                    list = new ArrayList<>();
                    this.d.put(uVar, list);
                }
                list.add(ahVar);
            }
            this.b.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public final void b(ah ahVar, u uVar) {
        Object[] objArr = {ahVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efae769251933c4fc34e3c167ee84618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efae769251933c4fc34e3c167ee84618");
        } else if (this.b == null || ahVar == null || uVar == null) {
        } else {
            synchronized (this.d) {
                List<ah> list = this.d.get(uVar);
                if (list == null) {
                    return;
                }
                list.remove(ahVar);
            }
        }
    }

    public final boolean b(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b54247bdf1440f71f6d1c84367af785", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b54247bdf1440f71f6d1c84367af785")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        String a2 = a(str, uVar, false);
        String a3 = a(str, uVar, true);
        this.b.edit().remove(a2).apply();
        this.b.edit().remove(a3).apply();
        return true;
    }

    public final void a(List<u> list) {
        Map<String, ?> all;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7beb4b0a0ed4d2fca3e79767e3b0de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7beb4b0a0ed4d2fca3e79767e3b0de");
        } else if (this.b != null && list != null && list.size() != 0 && (all = this.b.getAll()) != null && all.size() != 0) {
            SharedPreferences.Editor edit = this.b.edit();
            for (String str : all.keySet()) {
                a a2 = a(str);
                if (a2 != null) {
                    for (u uVar : list) {
                        if (a2.b == uVar) {
                            edit.remove(str);
                        }
                    }
                }
            }
            edit.apply();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9bab576620d545cb59f5f81b209c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9bab576620d545cb59f5f81b209c68");
        } else {
            a(u.e());
        }
    }
}
