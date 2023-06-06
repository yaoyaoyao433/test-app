package com.meituan.msc.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af implements SharedPreferences, SharedPreferences.Editor {
    public static ChangeQuickRedirect a;
    private static final com.meituan.android.cipstorage.ag<String> d = new com.meituan.android.cipstorage.ag<String>() { // from class: com.meituan.msc.common.utils.af.2
        @Override // com.meituan.android.cipstorage.ag
        public final /* bridge */ /* synthetic */ String deserializeFromString(String str) {
            return str;
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* bridge */ /* synthetic */ String serializeAsString(String str) {
            return str;
        }
    };
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, com.meituan.android.cipstorage.ah> b;
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

    public af(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6e0be7d36921596228ef8879176187", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6e0be7d36921596228ef8879176187");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = com.meituan.android.cipstorage.q.a(context, str, 2);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1d0607fe78bd5318869f25d2355d5cf", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1d0607fe78bd5318869f25d2355d5cf") : this.c.b();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc853e360182da917d9db3865e7c96b3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc853e360182da917d9db3865e7c96b3") : this.c.b(str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5939c3a1b2bbb6e6473ea4d43df0a4e", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5939c3a1b2bbb6e6473ea4d43df0a4e") : this.c.b(str, set);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd096c8ef7850bdfb77c62c880023e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd096c8ef7850bdfb77c62c880023e0")).intValue() : this.c.b(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42326007c7eaa0c0c520de804184b27", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42326007c7eaa0c0c520de804184b27")).longValue() : this.c.b(str, j);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa75b37e320765eff102b0bbb89c3af", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa75b37e320765eff102b0bbb89c3af")).floatValue() : this.c.b(str, f);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8eff039252b3e5e48d2696f98a2da3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8eff039252b3e5e48d2696f98a2da3")).booleanValue() : this.c.b(str, z);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94acac18e4a9402ea8a3dec454b67bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94acac18e4a9402ea8a3dec454b67bf")).booleanValue() : this.c.a(str);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567053eac13fec94030ede08fde7dc45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567053eac13fec94030ede08fde7dc45");
            return;
        }
        com.meituan.android.cipstorage.ah ahVar = new com.meituan.android.cipstorage.ah() { // from class: com.meituan.msc.common.utils.af.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ah
            public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
                Object[] objArr2 = {str, uVar, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8af798c1e405f6ab42d6995c36b6fbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8af798c1e405f6ab42d6995c36b6fbe");
                } else {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(af.this, str2);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be1e77d34403959b206d7342a078989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be1e77d34403959b206d7342a078989");
            return;
        }
        com.meituan.android.cipstorage.ah remove = this.b.remove(onSharedPreferenceChangeListener);
        if (remove != null) {
            this.c.b(remove);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6444483d0666c019e1bccb31cd1c0211", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6444483d0666c019e1bccb31cd1c0211");
        }
        this.c.a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3ecde3fce1b429de4aa53c992e5a22", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3ecde3fce1b429de4aa53c992e5a22");
        }
        this.c.a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291e3e915f134db9ee225f6ad7a39490", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291e3e915f134db9ee225f6ad7a39490");
        }
        this.c.a(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e689ecdd5cb236b771f0da4c4f4aea1", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e689ecdd5cb236b771f0da4c4f4aea1");
        }
        this.c.a(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68eb23c0385095398b17b7bae6fc536", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68eb23c0385095398b17b7bae6fc536");
        }
        this.c.a(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e448cd0e7aff5d204bf6e245060c00d", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e448cd0e7aff5d204bf6e245060c00d");
        }
        this.c.a(str, z);
        return this;
    }

    public final SharedPreferences.Editor a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d82f42006e5de22decd25ceec672f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d82f42006e5de22decd25ceec672f4");
        }
        this.c.a(str, str2, d);
        return this;
    }

    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa358a6659a466c799a4b29ad95a697", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa358a6659a466c799a4b29ad95a697");
        }
        String str3 = (String) this.c.a(str, d);
        return str3 == null ? str2 : str3;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72f2ff8d067eace1971949b34e67e13", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72f2ff8d067eace1971949b34e67e13");
        }
        this.c.b(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa081334455a9eaf5617c24f46b6703", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa081334455a9eaf5617c24f46b6703");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e741f6c258c3c52da6f9d48ad564d1fc", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e741f6c258c3c52da6f9d48ad564d1fc")).longValue() : com.meituan.android.cipstorage.q.b(context, str).g;
    }
}
