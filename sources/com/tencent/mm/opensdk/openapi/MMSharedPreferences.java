package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";
    private final ContentResolver cr;
    private final String[] columns = {"_id", "key", "type", "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class REditor implements SharedPreferences.Editor {
        private ContentResolver cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x003f A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean commit() {
            /*
                r8 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r8.clear
                r2 = 0
                if (r1 == 0) goto L14
                android.content.ContentResolver r1 = r8.cr
                android.net.Uri r3 = com.tencent.mm.opensdk.utils.a.a
                r4 = 0
                r1.delete(r3, r4, r4)
                r8.clear = r2
            L14:
                java.util.Set<java.lang.String> r1 = r8.remove
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r3 = r1.hasNext()
                r4 = 1
                if (r3 == 0) goto L35
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r5 = r8.cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.a
                java.lang.String[] r4 = new java.lang.String[r4]
                r4[r2] = r3
                java.lang.String r3 = "key = ?"
                r5.delete(r6, r3, r4)
                goto L1a
            L35:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L3f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto Lc8
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r5 = r3.getValue()
                if (r5 != 0) goto L5a
                java.lang.String r6 = "MicroMsg.SDK.PluginProvider.Resolver"
                java.lang.String r7 = "unresolve failed, null value"
                com.tencent.mm.opensdk.utils.Log.e(r6, r7)
            L58:
                r6 = 0
                goto L9a
            L5a:
                boolean r6 = r5 instanceof java.lang.Integer
                if (r6 == 0) goto L60
                r6 = 1
                goto L9a
            L60:
                boolean r6 = r5 instanceof java.lang.Long
                if (r6 == 0) goto L66
                r6 = 2
                goto L9a
            L66:
                boolean r6 = r5 instanceof java.lang.String
                if (r6 == 0) goto L6c
                r6 = 3
                goto L9a
            L6c:
                boolean r6 = r5 instanceof java.lang.Boolean
                if (r6 == 0) goto L72
                r6 = 4
                goto L9a
            L72:
                boolean r6 = r5 instanceof java.lang.Float
                if (r6 == 0) goto L78
                r6 = 5
                goto L9a
            L78:
                boolean r6 = r5 instanceof java.lang.Double
                if (r6 == 0) goto L7e
                r6 = 6
                goto L9a
            L7e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "unresolve failed, unknown type="
                r6.<init>(r7)
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.toString()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                com.tencent.mm.opensdk.utils.Log.e(r7, r6)
                goto L58
            L9a:
                if (r6 != 0) goto L9e
                r5 = 0
                goto Lb1
            L9e:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.String r7 = "type"
                r0.put(r7, r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "value"
                r0.put(r6, r5)
                r5 = 1
            Lb1:
                if (r5 == 0) goto L3f
                android.content.ContentResolver r5 = r8.cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.a
                java.lang.String[] r7 = new java.lang.String[r4]
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r7[r2] = r3
                java.lang.String r3 = "key = ?"
                r5.update(r6, r0, r3, r7)
                goto L3f
            Lc8:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor query = this.cr.query(a.a, this.columns, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            Object a = query.moveToFirst() ? com.tencent.mm.opensdk.channel.a.a.a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a;
        } catch (Exception e) {
            Log.e(TAG, "getValue exception:" + e.getMessage());
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor query = this.cr.query(a.a, this.columns, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), com.tencent.mm.opensdk.channel.a.a.a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (Exception e) {
            Log.e(TAG, "getAll exception:" + e.getMessage());
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
