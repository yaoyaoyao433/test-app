package com.sankuai.xm.base.sp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements SharedPreferences {
    public static ChangeQuickRedirect a;
    private q b;
    private final String c;
    private final int d;
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, ah> e;
    private Context f;

    public c(Context context, String str, int i) {
        Object[] objArr = {context, str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e16810c32607cb3627da9c99bae697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e16810c32607cb3627da9c99bae697");
            return;
        }
        this.e = new HashMap();
        this.c = str;
        this.d = 0;
        this.f = context.getApplicationContext();
    }

    private q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4dd2304c01310ecb8a999984ef55cd1", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4dd2304c01310ecb8a999984ef55cd1");
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    int i = this.d == 4 ? 2 : 1;
                    Context context = this.f;
                    this.b = q.a(context, "xm_" + this.c, i);
                    if (!this.b.a("xm_sp__version")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        com.sankuai.xm.log.c.a("SharePreferencesProxy", "obtainStorageCenter::XMCIPS::start to migrate SP:%s", this.c);
                        b.a(this.f.getSharedPreferences(this.c, this.d), this.b);
                        com.sankuai.xm.log.c.b("SharePreferencesProxy", "obtainStorageCenter::XMCIPS::end to migrate SP:%s, time: %d", this.c, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        this.b.a("xm_sp__version", 1);
                    }
                }
            }
        }
        return this.b;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91bd4fc145d5d7336906e239decbb246", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91bd4fc145d5d7336906e239decbb246") : a().b();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151928e58358105441715f954a533097", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151928e58358105441715f954a533097") : a().b(str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a64818cf616f35acb3cd962e3be7803", 6917529027641081856L) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a64818cf616f35acb3cd962e3be7803") : a().b(str, set);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38554aaa0f9d853aa83430a91e15792", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38554aaa0f9d853aa83430a91e15792")).intValue() : a().b(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230a82067db6cc0c2d4093812a736547", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230a82067db6cc0c2d4093812a736547")).longValue() : a().b(str, j);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6438b29bcf2e95649f5ae9c9276da88", 6917529027641081856L) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6438b29bcf2e95649f5ae9c9276da88")).floatValue() : a().b(str, f);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa149c8cd12fa3dc4466ba5e856f560b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa149c8cd12fa3dc4466ba5e856f560b")).booleanValue() : a().b(str, z);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4c3812f24eee328a7af31015bcae9a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4c3812f24eee328a7af31015bcae9a")).booleanValue() : a().a(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e1136b94af65c33b8314a2624e3464", 6917529027641081856L) ? (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e1136b94af65c33b8314a2624e3464") : new a(a());
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864ad2da2a5cd0bf881e2d70a3af4001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864ad2da2a5cd0bf881e2d70a3af4001");
        } else if (onSharedPreferenceChangeListener == null) {
        } else {
            ah ahVar = new ah() { // from class: com.sankuai.xm.base.sp.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ah
                public final void a(String str, u uVar, String str2) {
                    Object[] objArr2 = {str, uVar, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8e1ff41646f05d4c130ecd3fd363c2d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8e1ff41646f05d4c130ecd3fd363c2d");
                    } else {
                        onSharedPreferenceChangeListener.onSharedPreferenceChanged(c.this, str2);
                    }
                }
            };
            synchronized (this.e) {
                this.e.put(onSharedPreferenceChangeListener, ahVar);
            }
            a().a(ahVar);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        ah ahVar;
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69beffc35c03833dc5dba2e7ef0586c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69beffc35c03833dc5dba2e7ef0586c9");
            return;
        }
        synchronized (this.e) {
            ahVar = this.e.get(onSharedPreferenceChangeListener);
            this.e.remove(onSharedPreferenceChangeListener);
        }
        if (ahVar != null) {
            a().b(ahVar);
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca3d3ccc35c6d5db39c80eb030042876", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca3d3ccc35c6d5db39c80eb030042876");
        }
        if (context == null) {
            return "";
        }
        return context.getFilesDir().getAbsolutePath() + "/cips/common";
    }
}
