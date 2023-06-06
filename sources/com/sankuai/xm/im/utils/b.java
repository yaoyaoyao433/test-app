package com.sankuai.xm.im.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements SharedPreferences {
    public static ChangeQuickRedirect a;
    public SharedPreferences b;
    private String c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static final b a = new b();
    }

    public static b a() {
        return a.a;
    }

    public static void a(SharedPreferences.Editor editor) {
        Object[] objArr = {editor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e44d69e139e2ca25731f63341b465bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e44d69e139e2ca25731f63341b465bf");
        } else if (editor == null) {
        } else {
            editor.apply();
        }
    }

    public final synchronized void a(Context context, long j, short s) {
        Object[] objArr = {context, new Long(j), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e3c2bbf1eb9acc7e92c9734da4d39c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e3c2bbf1eb9acc7e92c9734da4d39c");
            return;
        }
        String str = j + CommonConstant.Symbol.UNDERLINE + ((int) s);
        if (ac.a(str, this.c)) {
            com.sankuai.xm.log.c.b("IMSharedPreference", "IMSharedPreference::init sp %s is already init.", str);
            return;
        }
        this.c = str;
        if (s != 0) {
            this.b = new com.sankuai.xm.base.sp.c(context, str, 0);
            return;
        }
        throw new RuntimeException("IMSharedPreference instance init failed!");
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f7d80bbcaf60411eae4a2ef728e7cef", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f7d80bbcaf60411eae4a2ef728e7cef");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getAll();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1242e9d7e0f9e1027dd77f7455d5563d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1242e9d7e0f9e1027dd77f7455d5563d");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    @TargetApi(11)
    public final Set<String> getStringSet(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87f4e712cdd6108f0c82e6ab94ce783", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87f4e712cdd6108f0c82e6ab94ce783");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8906755c0513b9eb611a8af38f58858", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8906755c0513b9eb611a8af38f58858")).intValue();
        }
        if (this.b == null) {
            return -1;
        }
        return this.b.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a870f2c6729ffdd340ee2ad98943da", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a870f2c6729ffdd340ee2ad98943da")).longValue();
        }
        if (this.b == null) {
            return -1L;
        }
        return this.b.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0872f39b0cbc77b0d7a28607cf2fd427", 6917529027641081856L)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0872f39b0cbc77b0d7a28607cf2fd427")).floatValue();
        }
        if (this.b == null) {
            return -1.0f;
        }
        return this.b.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86523496526bb23f55c8baf15bcb179", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86523496526bb23f55c8baf15bcb179")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8d551aba236d773833ca7e543768e7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8d551aba236d773833ca7e543768e7")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1997102e4189871f8b37ad65c5d0cff3", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1997102e4189871f8b37ad65c5d0cff3");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.edit();
    }

    public final SharedPreferences.Editor a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd0675af741099a2b2850265dd50f78", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd0675af741099a2b2850265dd50f78");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.edit().putString(str, str2);
    }

    public final SharedPreferences.Editor a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8209985463e986d5949ce9cfcd236326", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8209985463e986d5949ce9cfcd236326");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.edit().putLong(str, j);
    }

    public final SharedPreferences.Editor a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3927ef1825f3f71118030652a2cb794", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3927ef1825f3f71118030652a2cb794");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.edit().remove(str);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57056e771ab7b8435be7ea24d803e79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57056e771ab7b8435be7ea24d803e79");
        } else if (this.b == null) {
        } else {
            this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c365c791cb5dd5a408723718020970e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c365c791cb5dd5a408723718020970e");
        } else if (this.b == null) {
        } else {
            this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }
}
