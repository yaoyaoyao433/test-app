package com.sankuai.xm.base.sp;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements SharedPreferences.Editor {
    public static ChangeQuickRedirect a;
    private q b;

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return true;
    }

    public a(@NonNull q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9407388852fad005433b555a7a647017", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9407388852fad005433b555a7a647017");
        } else {
            this.b = qVar;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c80e7b950bdf9759d5dc9a1dbc4b4a0", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c80e7b950bdf9759d5dc9a1dbc4b4a0");
        }
        this.b.a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510a454ca0da269bc39d262847abfe95", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510a454ca0da269bc39d262847abfe95");
        }
        this.b.a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1a4a17059d79e6de444469319d8888", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1a4a17059d79e6de444469319d8888");
        }
        this.b.a(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e54a7e74ed1e64c56063940046bd12", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e54a7e74ed1e64c56063940046bd12");
        }
        this.b.a(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c017dcdebbe112811bc5ea8d5fdd1256", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c017dcdebbe112811bc5ea8d5fdd1256");
        }
        this.b.a(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23eac1ff4136540a1aac7ed71baec6e", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23eac1ff4136540a1aac7ed71baec6e");
        }
        this.b.a(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99dfc3668fafae5e8c43aca7d977193e", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99dfc3668fafae5e8c43aca7d977193e");
        }
        this.b.b(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ae584eb404566c634b712227eb60da", 6917529027641081856L)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ae584eb404566c634b712227eb60da");
        }
        this.b.d();
        return this;
    }
}
