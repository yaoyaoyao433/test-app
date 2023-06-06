package com.meituan.mmp.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z implements SharedPreferences, SharedPreferences.Editor {
    public static ChangeQuickRedirect a;
    private static final ag<String> d = new ag<String>() { // from class: com.meituan.mmp.main.z.2
        @Override // com.meituan.android.cipstorage.ag
        public final /* bridge */ /* synthetic */ String deserializeFromString(String str) {
            return str;
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* bridge */ /* synthetic */ String serializeAsString(String str) {
            return str;
        }
    };
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, ah> b;
    private final com.meituan.android.cipstorage.q c;

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return true;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public z(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3f35fce48efcdf7ea4503b182af9779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3f35fce48efcdf7ea4503b182af9779");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = com.meituan.android.cipstorage.q.a(context, str, 2);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54d0d19943d41f8edecaeb94c35fd82", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54d0d19943d41f8edecaeb94c35fd82") : this.c.b();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3f9fc171f01e58bfc5ec280c3b6c43", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3f9fc171f01e58bfc5ec280c3b6c43") : this.c.b(str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac81003542643839ae1c16b0027e854", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac81003542643839ae1c16b0027e854") : this.c.b(str, set);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dca4e934fa20fe24dc4a42a94542d7e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dca4e934fa20fe24dc4a42a94542d7e")).intValue() : this.c.b(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa1908184b16111022ff8cd5ff820a2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa1908184b16111022ff8cd5ff820a2")).longValue() : this.c.b(str, j);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b0cfe881212a7a153e82145a0edd7c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b0cfe881212a7a153e82145a0edd7c")).floatValue() : this.c.b(str, f);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8b64e940706df7b42c225a962d7a4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8b64e940706df7b42c225a962d7a4f")).booleanValue() : this.c.b(str, z);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a119ad61edc35c82e996ec1824fcff0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a119ad61edc35c82e996ec1824fcff0d")).booleanValue() : this.c.a(str);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5b49a48a68b8856cd7119005d0e39f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5b49a48a68b8856cd7119005d0e39f");
            return;
        }
        ah ahVar = new ah() { // from class: com.meituan.mmp.main.z.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ah
            public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
                Object[] objArr2 = {str, uVar, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1aa1fc7a38a7655b5fe83e530d62ee03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1aa1fc7a38a7655b5fe83e530d62ee03");
                } else {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(z.this, str2);
                }
            }
        };
        this.b.put(onSharedPreferenceChangeListener, ahVar);
        this.c.a(ahVar);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf45cf6f6f20e5b05ee6a2d96ab6917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf45cf6f6f20e5b05ee6a2d96ab6917");
            return;
        }
        ah remove = this.b.remove(onSharedPreferenceChangeListener);
        if (remove != null) {
            this.c.b(remove);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "011a573f6e391ade185126de17e30ac1", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "011a573f6e391ade185126de17e30ac1");
        }
        this.c.a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b91fc74cffd192eb4e7ac8b2423b36", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b91fc74cffd192eb4e7ac8b2423b36");
        }
        this.c.a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba75379c651cec6a3e2de5bd140e1d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba75379c651cec6a3e2de5bd140e1d9");
        }
        this.c.a(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d9d02afe5ca3156bb0935e24679c0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d9d02afe5ca3156bb0935e24679c0d");
        }
        this.c.a(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c38ef73609f3c2f7859587af1e481d", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c38ef73609f3c2f7859587af1e481d");
        }
        this.c.a(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4043995e2c67130561d2bc13999265a", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4043995e2c67130561d2bc13999265a");
        }
        this.c.a(str, z);
        return this;
    }

    public final SharedPreferences.Editor a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519514bdd64b85c74213d5c1728016ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519514bdd64b85c74213d5c1728016ec");
        }
        this.c.a(str, str2, d);
        return this;
    }

    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40affceb69b9e06ddcee3530dc5181e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40affceb69b9e06ddcee3530dc5181e");
        }
        String str3 = (String) this.c.a(str, d);
        return str3 == null ? str2 : str3;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49be028b93584cfc8cbb700232f3cf56", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49be028b93584cfc8cbb700232f3cf56");
        }
        this.c.b(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb26ad9ee77f7656722bb6de391a2645", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb26ad9ee77f7656722bb6de391a2645");
        }
        this.c.d();
        this.c.e();
        this.c.f();
        this.c.g();
        this.c.h();
        return this;
    }

    public static long a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffb2e5c33f03a70f0f10590169ea2376", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffb2e5c33f03a70f0f10590169ea2376")).longValue() : com.meituan.android.cipstorage.q.b(context, str).g;
    }
}
