package com.meituan.mtwebkit.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.meituan.android.cipstorage.u;
import com.meituan.mtwebkit.internal.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q implements SharedPreferences {
    public static ChangeQuickRedirect a;
    private static final SparseArray<q> b = new SparseArray<>();
    private static final Object c = new Object();
    private final com.meituan.android.cipstorage.q d;
    private final Map<String, Object> e;
    private boolean f;
    private final Object g;

    public static /* synthetic */ boolean a(q qVar, boolean z) {
        qVar.f = true;
        return true;
    }

    public static q a(Context context, String str) {
        q qVar;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4975724f6dc390f9a70115d023d80b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4975724f6dc390f9a70115d023d80b5");
        }
        com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(context, "sp_" + str, 1);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "885477f6e6d30e0163d5ab21d770f2ad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "885477f6e6d30e0163d5ab21d770f2ad")).intValue() : (a2.hashCode() * 31) + u.f.hashCode();
        q qVar2 = b.get(intValue);
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (b) {
            qVar = b.get(intValue);
            if (qVar == null) {
                qVar = new q(a2);
                b.put(intValue, qVar);
            }
        }
        return qVar;
    }

    private q(com.meituan.android.cipstorage.q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995007723ae3d70dec55676c684fde38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995007723ae3d70dec55676c684fde38");
            return;
        }
        this.e = new HashMap();
        this.g = new Object();
        this.d = qVar;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7511afaa2770eaa7fbb11f9031f3f85d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7511afaa2770eaa7fbb11f9031f3f85d");
        }
        synchronized (this.g) {
            hashMap = new HashMap();
            if (!this.f) {
                hashMap.putAll(this.d.b());
            }
            for (Map.Entry<String, Object> entry : this.e.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == c) {
                    hashMap.remove(key);
                } else {
                    hashMap.put(key, value);
                }
            }
        }
        return hashMap;
    }

    private <T> T a(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2283e0766b820d7bd9fecf9d74a2d55c", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2283e0766b820d7bd9fecf9d74a2d55c") : this.e.get(str) == c ? t : (T) this.e.get(str);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ab4ea1455cea4e8f6277885e8f21b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ab4ea1455cea4e8f6277885e8f21b7");
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                return (Set) a(str, (String) set);
            } else if (this.f) {
                return set;
            } else {
                return this.d.b(str, set);
            }
        }
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a143ac929f9ac9ad0d01f13c44ca8558", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a143ac929f9ac9ad0d01f13c44ca8558");
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                return (String) a(str, str2);
            } else if (this.f) {
                return str2;
            } else {
                return this.d.b(str, str2);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884aa1c98de2b99e9031daa11cfc7c44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884aa1c98de2b99e9031daa11cfc7c44")).intValue();
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                return ((Integer) a(str, (String) Integer.valueOf(i))).intValue();
            } else if (this.f) {
                return i;
            } else {
                return this.d.b(str, i);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e2923835916eabe385ebe866e4ac89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e2923835916eabe385ebe866e4ac89")).longValue();
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                return ((Long) a(str, (String) Long.valueOf(j))).longValue();
            } else if (this.f) {
                return j;
            } else {
                return this.d.b(str, j);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a078f09b461f8622c62976ef624329", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a078f09b461f8622c62976ef624329")).floatValue();
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                return ((Float) a(str, (String) Float.valueOf(f))).floatValue();
            } else if (this.f) {
                return f;
            } else {
                return this.d.b(str, f);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d7f191fb47641b18058d4c2611a78b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d7f191fb47641b18058d4c2611a78b")).booleanValue();
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                return ((Boolean) a(str, (String) Boolean.valueOf(z))).booleanValue();
            } else if (this.f) {
                return z;
            } else {
                return this.d.b(str, z);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b165d270d880ab7970ec327bd44b01", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b165d270d880ab7970ec327bd44b01")).booleanValue();
        }
        synchronized (this.g) {
            if (this.e.containsKey(str)) {
                if (this.e.get(str) != c) {
                }
                z = false;
            } else {
                if (!this.f && this.d.a(str)) {
                }
                z = false;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6723fe9dbc39312b88409d9d5e22b52", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6723fe9dbc39312b88409d9d5e22b52") : new a();
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69541342c1db96c2249ae9e2e605b991", RobustBitConfig.DEFAULT_VALUE)) {
            throw new IllegalArgumentException("registerOnSharedPreferenceChangeListener is not allowed here");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69541342c1db96c2249ae9e2e605b991");
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e0f2c28ae6d4cd1e7b7662241fbb6e", RobustBitConfig.DEFAULT_VALUE)) {
            throw new IllegalArgumentException("unregisterOnSharedPreferenceChangeListener is not allowed here");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e0f2c28ae6d4cd1e7b7662241fbb6e");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public final boolean a;
        public final Map<String, Object> b;

        private b(boolean z, Map<String, Object> map) {
            this.a = z;
            this.b = map;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class a implements SharedPreferences.Editor {
        public static ChangeQuickRedirect a;
        private final Object c;
        @GuardedBy("mEditorLock")
        private final Map<String, Object> d;
        @GuardedBy("mEditorLock")
        private boolean e;

        private a() {
            Object[] objArr = {q.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67848710312d9332a40cee916a6bf80d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67848710312d9332a40cee916a6bf80d");
                return;
            }
            this.c = new Object();
            this.d = new HashMap();
            this.e = false;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, @Nullable String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75af54e3624449130cd8884bc8f7173c", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75af54e3624449130cd8884bc8f7173c");
            }
            synchronized (this.c) {
                this.d.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
            Object[] objArr = {str, set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2215b3fa1974a1beb4aeb6feb7ecc6", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2215b3fa1974a1beb4aeb6feb7ecc6");
            }
            synchronized (this.c) {
                this.d.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f074818a348133b49661834f0858f64f", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f074818a348133b49661834f0858f64f");
            }
            synchronized (this.c) {
                this.d.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f376ae1de2540c41b8e433eb0a96d06", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f376ae1de2540c41b8e433eb0a96d06");
            }
            synchronized (this.c) {
                this.d.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            Object[] objArr = {str, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27514896e2777c161bffa869929fcdc0", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27514896e2777c161bffa869929fcdc0");
            }
            synchronized (this.c) {
                this.d.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3f50cf997c63238bfc11e0726dc357", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3f50cf997c63238bfc11e0726dc357");
            }
            synchronized (this.c) {
                this.d.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f2fb697b95c623f944676a02fa41708", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f2fb697b95c623f944676a02fa41708");
            }
            synchronized (this.c) {
                this.d.put(str, q.c);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6b01782a6ceacc2e8c28370a68e533", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6b01782a6ceacc2e8c28370a68e533");
            }
            synchronized (this.c) {
                this.e = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1950b2904df4211e96bf7eaf37af8fdb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1950b2904df4211e96bf7eaf37af8fdb")).booleanValue();
            }
            a(a()).run();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
            r11.b.e.put(r5, com.meituan.mtwebkit.internal.q.c);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.meituan.mtwebkit.internal.q.b a() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mtwebkit.internal.q.a.a
                java.lang.String r10 = "b2f4b936d2bde61beaa517a05443e911"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1b
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                com.meituan.mtwebkit.internal.q$b r0 = (com.meituan.mtwebkit.internal.q.b) r0
                return r0
            L1b:
                com.meituan.mtwebkit.internal.q r1 = com.meituan.mtwebkit.internal.q.this
                java.lang.Object r1 = com.meituan.mtwebkit.internal.q.a(r1)
                monitor-enter(r1)
                java.lang.Object r2 = r11.c     // Catch: java.lang.Throwable -> La4
                monitor-enter(r2)     // Catch: java.lang.Throwable -> La4
                boolean r3 = r11.e     // Catch: java.lang.Throwable -> La1
                r4 = 1
                if (r3 == 0) goto L3b
                com.meituan.mtwebkit.internal.q r3 = com.meituan.mtwebkit.internal.q.this     // Catch: java.lang.Throwable -> La1
                java.util.Map r3 = com.meituan.mtwebkit.internal.q.b(r3)     // Catch: java.lang.Throwable -> La1
                r3.clear()     // Catch: java.lang.Throwable -> La1
                com.meituan.mtwebkit.internal.q r3 = com.meituan.mtwebkit.internal.q.this     // Catch: java.lang.Throwable -> La1
                com.meituan.mtwebkit.internal.q.a(r3, r4)     // Catch: java.lang.Throwable -> La1
                r11.e = r0     // Catch: java.lang.Throwable -> La1
                r0 = 1
            L3b:
                java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> La1
                java.util.Map<java.lang.String, java.lang.Object> r4 = r11.d     // Catch: java.lang.Throwable -> La1
                r3.<init>(r4)     // Catch: java.lang.Throwable -> La1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
                java.util.Set r2 = r3.entrySet()     // Catch: java.lang.Throwable -> La4
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La4
            L4b:
                boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> La4
                if (r4 == 0) goto L99
                java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> La4
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> La4
                java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> La4
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> La4
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> La4
                com.meituan.mtwebkit.internal.q r6 = com.meituan.mtwebkit.internal.q.this     // Catch: java.lang.Throwable -> La4
                java.util.Map r6 = com.meituan.mtwebkit.internal.q.b(r6)     // Catch: java.lang.Throwable -> La4
                boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7f
                com.meituan.mtwebkit.internal.q r6 = com.meituan.mtwebkit.internal.q.this     // Catch: java.lang.Throwable -> La4
                java.util.Map r6 = com.meituan.mtwebkit.internal.q.b(r6)     // Catch: java.lang.Throwable -> La4
                java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7f
                boolean r6 = r6.equals(r4)     // Catch: java.lang.Throwable -> La4
                if (r6 != 0) goto L4b
            L7f:
                if (r4 != 0) goto L8f
                com.meituan.mtwebkit.internal.q r4 = com.meituan.mtwebkit.internal.q.this     // Catch: java.lang.Throwable -> La4
                java.util.Map r4 = com.meituan.mtwebkit.internal.q.b(r4)     // Catch: java.lang.Throwable -> La4
                java.lang.Object r6 = com.meituan.mtwebkit.internal.q.a()     // Catch: java.lang.Throwable -> La4
                r4.put(r5, r6)     // Catch: java.lang.Throwable -> La4
                goto L4b
            L8f:
                com.meituan.mtwebkit.internal.q r6 = com.meituan.mtwebkit.internal.q.this     // Catch: java.lang.Throwable -> La4
                java.util.Map r6 = com.meituan.mtwebkit.internal.q.b(r6)     // Catch: java.lang.Throwable -> La4
                r6.put(r5, r4)     // Catch: java.lang.Throwable -> La4
                goto L4b
            L99:
                com.meituan.mtwebkit.internal.q$b r2 = new com.meituan.mtwebkit.internal.q$b     // Catch: java.lang.Throwable -> La4
                r4 = 0
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> La4
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
                return r2
            La1:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
                throw r0     // Catch: java.lang.Throwable -> La4
            La4:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.q.a.a():com.meituan.mtwebkit.internal.q$b");
        }

        private Runnable a(final b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716d28a462402120ee05bf2ce04a1cff", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716d28a462402120ee05bf2ce04a1cff") : new Runnable() { // from class: com.meituan.mtwebkit.internal.q.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "463eb3d12609eb8fa9d613dccc7812c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "463eb3d12609eb8fa9d613dccc7812c6");
                        return;
                    }
                    if (bVar.a) {
                        q.this.d.c();
                    }
                    for (Map.Entry<String, Object> entry : bVar.b.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == q.c || value == null) {
                            q.this.d.b(key);
                        } else if (value instanceof Boolean) {
                            q.this.d.a(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            q.this.d.a(key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            q.this.d.a(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            q.this.d.a(key, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            q.this.d.a(key, (String) value);
                        } else if (value instanceof Set) {
                            q.this.d.a(key, (Set) value);
                        }
                    }
                }
            };
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987f68a49dfa7264a6a5711c1c80392d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987f68a49dfa7264a6a5711c1c80392d");
            } else {
                k.a.a.a(a(a()));
            }
        }
    }
}
