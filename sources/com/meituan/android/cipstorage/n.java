package com.meituan.android.cipstorage;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n implements SharedPreferences, ah {
    public static ChangeQuickRedirect a;
    private static final SparseArray<n> b = new SparseArray<>();
    private final q c;
    private final u d;
    private List<SharedPreferences.OnSharedPreferenceChangeListener> e;

    public static n a(q qVar, u uVar) {
        n nVar;
        Object[] objArr = {qVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da1ae3130c910a39c9129862c94ea52a", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da1ae3130c910a39c9129862c94ea52a");
        }
        Object[] objArr2 = {qVar, uVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "69b094c5025aa04d5ae09a313c7cecf2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "69b094c5025aa04d5ae09a313c7cecf2")).intValue() : (qVar.hashCode() * 31) + uVar.hashCode();
        n nVar2 = b.get(intValue);
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (b) {
            nVar = b.get(intValue);
            if (nVar == null) {
                nVar = new n(qVar, uVar);
                b.put(intValue, nVar);
            }
        }
        return nVar;
    }

    private n(q qVar, u uVar) {
        Object[] objArr = {qVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "050eff1d317619a604469af4d4e5099d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "050eff1d317619a604469af4d4e5099d");
            return;
        }
        this.c = qVar;
        this.d = uVar;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cdc19982035618e21823fa66462427", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cdc19982035618e21823fa66462427") : this.c.a(this.d);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43807dca968f8e7eb6c66f43cf022aa2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43807dca968f8e7eb6c66f43cf022aa2") : this.c.b(str, str2, this.d);
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea2b0647b1f1ec77104d70324f81a54", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea2b0647b1f1ec77104d70324f81a54") : this.c.b(str, set, this.d);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9127de3cc7a7335530656a3721cbab88", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9127de3cc7a7335530656a3721cbab88")).intValue() : this.c.b(str, i, this.d);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee3ca4d9354768a07877e96f4ca5222", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee3ca4d9354768a07877e96f4ca5222")).longValue() : this.c.b(str, j, this.d);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe73c1bb3263f6b4ed5a10be6a7ae17", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe73c1bb3263f6b4ed5a10be6a7ae17")).floatValue() : this.c.b(str, f, this.d);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad1a12b5342bda16f1bce2d8e2b6cd4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad1a12b5342bda16f1bce2d8e2b6cd4")).booleanValue() : this.c.b(str, z, this.d);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "559f2c50b227fb43a1de32b13929cd09", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "559f2c50b227fb43a1de32b13929cd09")).booleanValue() : this.c.a(str, this.d);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e4822b488693274306e22fd0af48b8", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e4822b488693274306e22fd0af48b8") : new a();
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16212a936c893e989a67e2aa9404dc2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16212a936c893e989a67e2aa9404dc2e");
            return;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new ArrayList();
                this.c.a(this, this.d);
            }
            if (!this.e.contains(onSharedPreferenceChangeListener)) {
                this.e.add(onSharedPreferenceChangeListener);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Object[] objArr = {onSharedPreferenceChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf312e665c929567639153c5f2adf82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf312e665c929567639153c5f2adf82");
            return;
        }
        synchronized (this) {
            if (this.e != null) {
                this.e.remove(onSharedPreferenceChangeListener);
                if (this.e.isEmpty()) {
                    this.c.b(this, this.d);
                    this.e = null;
                }
            }
        }
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, u uVar, String str2) {
        List<SharedPreferences.OnSharedPreferenceChangeListener> emptyList;
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979f01b7bb35a9cf02f8491488944d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979f01b7bb35a9cf02f8491488944d9d");
            return;
        }
        synchronized (this) {
            emptyList = this.e == null ? Collections.emptyList() : new ArrayList(this.e);
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : emptyList) {
            onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a implements SharedPreferences.Editor {
        public static ChangeQuickRedirect a;
        private HashMap<String, Object> c;
        private boolean d;

        private a() {
            Object[] objArr = {n.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b575e661c532cdfe9d487594c2323a01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b575e661c532cdfe9d487594c2323a01");
            } else {
                this.c = new HashMap<>();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putString(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5c02a6ce4a01d30bab51ef1f2ccf59", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5c02a6ce4a01d30bab51ef1f2ccf59");
            }
            this.c.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            Object[] objArr = {str, set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc9201e9463d472363f079ac639b655f", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc9201e9463d472363f079ac639b655f");
            }
            this.c.put(str, set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putInt(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6a46ffbf76a0ba5d90fae26cd1d910", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6a46ffbf76a0ba5d90fae26cd1d910");
            }
            this.c.put(str, Integer.valueOf(i));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putLong(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a1bd9f07cce45614efd09ff8bed4f0", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a1bd9f07cce45614efd09ff8bed4f0");
            }
            this.c.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
            Object[] objArr = {str, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949da9f102a292dd2103f17c2e80608b", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949da9f102a292dd2103f17c2e80608b");
            }
            this.c.put(str, Float.valueOf(f));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1604736e4628b7cd0fb1afe0ec1788", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1604736e4628b7cd0fb1afe0ec1788");
            }
            this.c.put(str, Boolean.valueOf(z));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor remove(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a8057011a1b283e7090ed6ac35de9a", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a8057011a1b283e7090ed6ac35de9a");
            }
            this.c.put(str, this);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor clear() {
            this.d = true;
            return this;
        }

        private Runnable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61833ce6600c61a71f626cb0c017c3b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61833ce6600c61a71f626cb0c017c3b") : new Runnable() { // from class: com.meituan.android.cipstorage.n.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c07f6a6093f58bc0a6a8554af009357d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c07f6a6093f58bc0a6a8554af009357d");
                        return;
                    }
                    HashMap hashMap = null;
                    synchronized (a.this) {
                        if (a.this.d) {
                            z = true;
                        } else {
                            hashMap = new HashMap(a.this.c);
                        }
                    }
                    if (z) {
                        n.this.c.b(n.this.d);
                        return;
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value == a.this) {
                            n.this.c.b(str, n.this.d);
                        } else if (value instanceof Boolean) {
                            n.this.c.a(str, ((Boolean) value).booleanValue(), n.this.d);
                        } else if (value instanceof Integer) {
                            n.this.c.a(str, ((Integer) value).intValue(), n.this.d);
                        } else if (value instanceof Long) {
                            n.this.c.a(str, ((Long) value).longValue(), n.this.d);
                        } else if (value instanceof Float) {
                            n.this.c.a(str, ((Float) value).floatValue(), n.this.d);
                        } else if (value instanceof String) {
                            n.this.c.a(str, (String) value, n.this.d);
                        } else if (value instanceof Set) {
                            n.this.c.a(str, (Set) value, n.this.d);
                        }
                    }
                }
            };
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1989a0aa295b231637cde8463fdd90", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1989a0aa295b231637cde8463fdd90")).booleanValue();
            }
            a().run();
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f731037537fb0486d3d39a0b8615eca8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f731037537fb0486d3d39a0b8615eca8");
            } else {
                v.e.c(a());
            }
        }
    }
}
