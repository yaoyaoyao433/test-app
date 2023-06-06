package com.tencent.smtt.utils;

import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class p {
    private b a = null;
    private b b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a {
        private String b;
        private long c;
        private long d;

        a(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        long a() {
            return this.c;
        }

        long b() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b {
        private Map<String, a> b = new HashMap();

        b(File file) {
            this.b.clear();
            a(file);
        }

        private void a(File file) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    a(file.getName(), file.length(), file.lastModified());
                    return;
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null || Build.VERSION.SDK_INT < 26) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            }
        }

        private void a(String str, long j, long j2) {
            if (str == null || str.length() <= 0 || j <= 0 || j2 <= 0) {
                return;
            }
            a aVar = new a(str, j, j2);
            if (this.b.containsKey(str)) {
                return;
            }
            this.b.put(str, aVar);
        }

        Map<String, a> a() {
            return this.b;
        }
    }

    private boolean a(b bVar, b bVar2) {
        if (bVar == null || bVar.a() == null || bVar2 == null || bVar2.a() == null) {
            return false;
        }
        Map<String, a> a2 = bVar.a();
        Map<String, a> a3 = bVar2.a();
        for (Map.Entry<String, a> entry : a2.entrySet()) {
            String key = entry.getKey();
            a value = entry.getValue();
            if (a3.containsKey(key)) {
                a aVar = a3.get(key);
                if (value.a() == aVar.a()) {
                    if (value.b() != aVar.b()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void a(File file) {
        this.a = new b(file);
    }

    public boolean a() {
        return this.b != null && this.a != null && this.b.a().size() == this.a.a().size() && a(this.a, this.b);
    }

    public void b(File file) {
        this.b = new b(file);
    }
}
