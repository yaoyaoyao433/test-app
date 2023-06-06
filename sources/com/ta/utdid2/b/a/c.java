package com.ta.utdid2.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.ta.utdid2.a.a.g;
import com.ta.utdid2.b.a.b;
import java.io.File;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with other field name */
    public SharedPreferences f11a;

    /* renamed from: a  reason: collision with other field name */
    public b f13a;

    /* renamed from: a  reason: collision with other field name */
    public d f14a;
    public String b;
    public String c;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Context mContext;
    public SharedPreferences.Editor a = null;

    /* renamed from: a  reason: collision with other field name */
    public b.a f12a = null;

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c A[Catch: Exception -> 0x018a, TRY_LEAVE, TryCatch #0 {Exception -> 0x018a, blocks: (B:79:0x0178, B:81:0x017c), top: B:87:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.c.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private d a(String str) {
        File m30a = m30a(str);
        if (m30a != null) {
            d dVar = new d(m30a.getAbsolutePath());
            this.f14a = dVar;
            return dVar;
        }
        return null;
    }

    private void b() {
        b bVar;
        SharedPreferences sharedPreferences;
        if (this.a == null && (sharedPreferences = this.f11a) != null) {
            this.a = sharedPreferences.edit();
        }
        if (this.h && this.f12a == null && (bVar = this.f13a) != null) {
            this.f12a = bVar.a();
        }
        c();
    }

    private boolean c() {
        b bVar = this.f13a;
        if (bVar != null) {
            boolean b = bVar.b();
            if (!b) {
                commit();
            }
            return b;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(4:3|(1:7)|8|(10:10|11|(1:15)|16|17|18|19|20|(4:22|(2:24|(2:26|(3:28|(1:30)(1:32)|31))(3:33|34|(1:36)))|41|(3:47|48|(1:50)))|53))|58|11|(2:13|15)|16|17|18|19|20|(0)|53|(1:(7:38|41|(2:43|45)|47|48|(0)|53))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
        if (r5.f12a.commit() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a5, blocks: (B:47:0x0097, B:49:0x009b), top: B:55:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean commit() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r5.a
            r3 = 0
            if (r2 == 0) goto L20
            boolean r4 = r5.i
            if (r4 != 0) goto L16
            android.content.SharedPreferences r4 = r5.f11a
            if (r4 == 0) goto L16
            java.lang.String r4 = "t"
            r2.putLong(r4, r0)
        L16:
            android.content.SharedPreferences$Editor r0 = r5.a
            boolean r0 = r0.commit()
            if (r0 != 0) goto L20
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            android.content.SharedPreferences r1 = r5.f11a
            if (r1 == 0) goto L31
            android.content.Context r1 = r5.mContext
            if (r1 == 0) goto L31
            java.lang.String r2 = r5.b
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r5.f11a = r1
        L31:
            r1 = 0
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L38
            r1 = r2
            goto L3c
        L38:
            r2 = move-exception
            r2.printStackTrace()
        L3c:
            boolean r2 = com.ta.utdid2.a.a.g.m29a(r1)
            if (r2 != 0) goto La5
            java.lang.String r2 = "mounted"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L83
            com.ta.utdid2.b.a.b r2 = r5.f13a
            if (r2 != 0) goto L76
            java.lang.String r2 = r5.c
            com.ta.utdid2.b.a.d r2 = r5.a(r2)
            if (r2 == 0) goto L83
            java.lang.String r4 = r5.b
            com.ta.utdid2.b.a.b r2 = r2.a(r4, r3)
            r5.f13a = r2
            boolean r4 = r5.i
            if (r4 != 0) goto L68
            android.content.SharedPreferences r4 = r5.f11a
            r5.a(r4, r2)
            goto L6d
        L68:
            android.content.SharedPreferences r4 = r5.f11a
            r5.a(r2, r4)
        L6d:
            com.ta.utdid2.b.a.b r2 = r5.f13a
            com.ta.utdid2.b.a.b$a r2 = r2.a()
            r5.f12a = r2
            goto L83
        L76:
            com.ta.utdid2.b.a.b$a r2 = r5.f12a     // Catch: java.lang.Exception -> L82
            if (r2 == 0) goto L83
            com.ta.utdid2.b.a.b$a r2 = r5.f12a     // Catch: java.lang.Exception -> L82
            boolean r2 = r2.commit()     // Catch: java.lang.Exception -> L82
            if (r2 != 0) goto L83
        L82:
            r0 = 0
        L83:
            java.lang.String r2 = "mounted"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L97
            java.lang.String r2 = "mounted_ro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La5
            com.ta.utdid2.b.a.b r1 = r5.f13a
            if (r1 == 0) goto La5
        L97:
            com.ta.utdid2.b.a.d r1 = r5.f14a     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto La5
            com.ta.utdid2.b.a.d r1 = r5.f14a     // Catch: java.lang.Exception -> La5
            java.lang.String r2 = r5.b     // Catch: java.lang.Exception -> La5
            com.ta.utdid2.b.a.b r1 = r1.a(r2, r3)     // Catch: java.lang.Exception -> La5
            r5.f13a = r1     // Catch: java.lang.Exception -> La5
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.c.commit():boolean");
    }

    public String getString(String str) {
        c();
        SharedPreferences sharedPreferences = this.f11a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!g.m29a(string)) {
                return string;
            }
        }
        b bVar = this.f13a;
        return bVar != null ? bVar.getString(str, "") : "";
    }

    public void putString(String str, String str2) {
        if (g.m29a(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.a;
        if (editor != null) {
            editor.putString(str, str2);
        }
        b.a aVar = this.f12a;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    public void remove(String str) {
        if (g.m29a(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.a;
        if (editor != null) {
            editor.remove(str);
        }
        b.a aVar = this.f12a;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private File m30a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    private void a(SharedPreferences sharedPreferences, b bVar) {
        b.a a;
        if (sharedPreferences == null || bVar == null || (a = bVar.a()) == null) {
            return;
        }
        a.b();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                a.a(key, (String) value);
            } else if (value instanceof Integer) {
                a.a(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                a.a(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                a.a(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                a.a(key, ((Boolean) value).booleanValue());
            }
        }
        try {
            a.commit();
        } catch (Exception unused) {
        }
    }

    private void a(b bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit;
        if (bVar == null || sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.clear();
        for (Map.Entry<String, ?> entry : bVar.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(key, (String) value);
            } else if (value instanceof Integer) {
                edit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        edit.commit();
    }
}
