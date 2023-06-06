package com.meituan.msi.util.cipStorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements SharedPreferences, SharedPreferences.Editor {
    public static ChangeQuickRedirect a;
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, ah> b;
    private final q c;

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

    public b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166dd73ee994aa8e0862996870703247", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166dd73ee994aa8e0862996870703247");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = q.a(context, str, 2);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6496a1e43843fe7222d77e9c69064e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6496a1e43843fe7222d77e9c69064e") : this.c.b();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e14b6c074c7b717890cbd99b18ad787", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e14b6c074c7b717890cbd99b18ad787") : this.c.b(str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adce4346e700cc64f6ea04b141865335", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adce4346e700cc64f6ea04b141865335") : this.c.b(str, set);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c322a5bc7bdd16162bb06fe1b6e4b8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c322a5bc7bdd16162bb06fe1b6e4b8")).intValue() : this.c.b(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b60b67a3f662d740909982c296f229c", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b60b67a3f662d740909982c296f229c")).longValue() : this.c.b(str, j);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb5a997d982630cdebd5490d7ef8507", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb5a997d982630cdebd5490d7ef8507")).floatValue() : this.c.b(str, f);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b25f1d160f533fd00911f1ea04965d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b25f1d160f533fd00911f1ea04965d3")).booleanValue() : this.c.b(str, z);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea4bdd1b0c1c50f9dc8391aab1e07ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea4bdd1b0c1c50f9dc8391aab1e07ca")).booleanValue() : this.c.a(str);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc24bca40f9c9666ba7caf52fa9aead6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc24bca40f9c9666ba7caf52fa9aead6");
            return;
        }
        ah ahVar = new ah() { // from class: com.meituan.msi.util.cipStorage.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ah
            public final void a(String str, u uVar, String str2) {
                Object[] objArr2 = {str, uVar, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ef78b181c44acae5946c193f50b7308", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ef78b181c44acae5946c193f50b7308");
                } else {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(b.this, str2);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13ae1efc7ee8461c7d1032d819394ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13ae1efc7ee8461c7d1032d819394ed");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9d308b9e4e0c5751bd6dc9863e70a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9d308b9e4e0c5751bd6dc9863e70a0");
        }
        this.c.a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0ca7b84501b3e82af14e8c44f53d69", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0ca7b84501b3e82af14e8c44f53d69");
        }
        this.c.a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da629e54cc4cd9001e58061e0fa23d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da629e54cc4cd9001e58061e0fa23d1c");
        }
        this.c.a(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c7e70b0af00748f05aa04c8bca25ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c7e70b0af00748f05aa04c8bca25ed");
        }
        this.c.a(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b05ef3ae7a959f1af628e040b1917fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b05ef3ae7a959f1af628e040b1917fe");
        }
        this.c.a(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b02e492b2636ae9664215322dcbe35", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b02e492b2636ae9664215322dcbe35");
        }
        this.c.a(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7086951e4728e2f44c89e1c8bf2e782", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7086951e4728e2f44c89e1c8bf2e782");
        }
        this.c.b(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b9e9128d655110389d43ec71d6612a", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b9e9128d655110389d43ec71d6612a");
        }
        this.c.d();
        this.c.e();
        this.c.f();
        this.c.g();
        this.c.h();
        return this;
    }
}
