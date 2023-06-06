package com.sankuai.xm.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e implements SharedPreferences, com.sankuai.xm.base.service.f {
    public static ChangeQuickRedirect a;
    private SharedPreferences b;
    private volatile boolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static final e a = new e();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "251c338746aa90b7e7247d107f146059", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "251c338746aa90b7e7247d107f146059");
        }
        e eVar = a.a;
        if (!eVar.c) {
            eVar.b(f.m().g());
        }
        return eVar;
    }

    public static e a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63cfb1bfa8b4e3a3b9e585f726f6a3f5", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63cfb1bfa8b4e3a3b9e585f726f6a3f5");
        }
        e eVar = a.a;
        if (!eVar.c) {
            eVar.b(context);
        }
        return eVar;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0efa64b532e1dd724959e259dd257cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0efa64b532e1dd724959e259dd257cb");
        } else {
            this.c = false;
        }
    }

    @Override // com.sankuai.xm.base.service.f
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683a725adb74cae4e9b095088e9cf412", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683a725adb74cae4e9b095088e9cf412");
        } else {
            edit().putString(str, str2).apply();
        }
    }

    private void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb426460c673e2b2e04c03419053d5ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb426460c673e2b2e04c03419053d5ae");
        } else if (context == null) {
            com.sankuai.xm.log.c.d("ElephantSharedPreference", "init:: cannot init as context is null.", new Object[0]);
        } else {
            synchronized (e.class) {
                if (this.c) {
                    return;
                }
                if (this.b == null) {
                    this.b = new com.sankuai.xm.base.sp.c(context, "DX_LOGIN_SDK", 0);
                }
                this.c = true;
            }
        }
    }

    @Override // com.sankuai.xm.base.service.f
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def460a4cae5a0b4c9654cd66358812d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def460a4cae5a0b4c9654cd66358812d");
        } else {
            edit().putInt(str, i).apply();
        }
    }

    @Override // com.sankuai.xm.base.service.f
    public final void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2145085e5c50bdf3c6d8efb624c839", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2145085e5c50bdf3c6d8efb624c839");
        } else {
            edit().putLong(str, j).apply();
        }
    }

    @Override // com.sankuai.xm.base.service.f
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519cf54c0fc824ab3325eb7b75423e09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519cf54c0fc824ab3325eb7b75423e09");
        } else {
            edit().remove(str).apply();
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        Object[] objArr = {editor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9b196eec0d5d79477cb59a9aa0e67a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9b196eec0d5d79477cb59a9aa0e67a6");
        } else if (editor == null) {
        } else {
            editor.apply();
        }
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c596483e1e66e802a8448f6dda46af4b", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c596483e1e66e802a8448f6dda46af4b");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getAll();
    }

    @Override // android.content.SharedPreferences, com.sankuai.xm.base.service.f
    public String getString(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e78d2ab2da41772f88795f504c7e4e1", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e78d2ab2da41772f88795f504c7e4e1") : this.b == null ? str2 : this.b.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd2c71acc41b8dda7d194592263f658", 6917529027641081856L) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd2c71acc41b8dda7d194592263f658") : this.b == null ? set : this.b.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences, com.sankuai.xm.base.service.f
    public int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee757b1fa6347ea90b36c29978e936b8", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee757b1fa6347ea90b36c29978e936b8")).intValue() : this.b == null ? i : this.b.getInt(str, i);
    }

    @Override // android.content.SharedPreferences, com.sankuai.xm.base.service.f
    public long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1cd9e7a617da07c178853fabf2b1785", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1cd9e7a617da07c178853fabf2b1785")).longValue() : this.b == null ? j : this.b.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00bab4ece880eda4c11ee54b0e11e61", 6917529027641081856L) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00bab4ece880eda4c11ee54b0e11e61")).floatValue() : this.b == null ? f : this.b.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences, com.sankuai.xm.base.service.f
    public boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b2b2aa7e20dd8240263ea5f3b1daf0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b2b2aa7e20dd8240263ea5f3b1daf0")).booleanValue() : this.b == null ? z : this.b.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ebbc0ee12627d91f73027c0ed84f145", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ebbc0ee12627d91f73027c0ed84f145")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.contains(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8e2a2dfcd7519cbcd3adb85507db3d", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8e2a2dfcd7519cbcd3adb85507db3d");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.edit();
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e986ab50f23a2afc301b36d678ac5602", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e986ab50f23a2afc301b36d678ac5602");
        } else if (this.b == null) {
        } else {
            this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166c0d815699c0cce1d9b9a50d8b3b10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166c0d815699c0cce1d9b9a50d8b3b10");
        } else if (this.b == null) {
        } else {
            this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }
}
