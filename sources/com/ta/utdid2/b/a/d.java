package com.ta.utdid2.b.a;

import com.ta.utdid2.b.a.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static final Object b = new Object();
    public File a;

    /* renamed from: a  reason: collision with other field name */
    public final Object f15a = new Object();

    /* renamed from: a  reason: collision with other field name */
    public HashMap<File, a> f16a = new HashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements b {
        public static final Object c = new Object();
        public Map a;

        /* renamed from: a  reason: collision with other field name */
        public WeakHashMap<b.InterfaceC1431b, Object> f17a;
        public final File b;

        /* renamed from: c  reason: collision with other field name */
        public final int f18c;

        /* renamed from: c  reason: collision with other field name */
        public final File f19c;
        public boolean j = false;

        public a(File file, int i, Map map) {
            this.b = file;
            this.f19c = d.a(file);
            this.f18c = i;
            this.a = map == null ? new HashMap() : map;
            this.f17a = new WeakHashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            if (this.b.exists()) {
                if (!this.f19c.exists()) {
                    if (!this.b.renameTo(this.f19c)) {
                        return false;
                    }
                } else {
                    this.b.delete();
                }
            }
            try {
                FileOutputStream a = a(this.b);
                if (a == null) {
                    return false;
                }
                e.a(this.a, a);
                a.close();
                this.f19c.delete();
                return true;
            } catch (Exception unused) {
                if (this.b.exists()) {
                    this.b.delete();
                }
                return false;
            }
        }

        @Override // com.ta.utdid2.b.a.b
        public final boolean b() {
            return this.b != null && new File(this.b.getAbsolutePath()).exists();
        }

        public final boolean d() {
            boolean z;
            synchronized (this) {
                z = this.j;
            }
            return z;
        }

        @Override // com.ta.utdid2.b.a.b
        public final Map<String, ?> getAll() {
            HashMap hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            return hashMap;
        }

        @Override // com.ta.utdid2.b.a.b
        public final long getLong(String str, long j) {
            synchronized (this) {
                Long l = (Long) this.a.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            }
            return j;
        }

        @Override // com.ta.utdid2.b.a.b
        public final String getString(String str, String str2) {
            String str3;
            synchronized (this) {
                str3 = (String) this.a.get(str);
                if (str3 == null) {
                    str3 = str2;
                }
            }
            return str3;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.ta.utdid2.b.a.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public final class C1432a implements b.a {
            public final Map<String, Object> b = new HashMap();
            public boolean k = false;

            public C1432a() {
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a a(String str, String str2) {
                synchronized (this) {
                    this.b.put(str, str2);
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a b() {
                synchronized (this) {
                    this.k = true;
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<b.InterfaceC1431b> hashSet;
                boolean e;
                synchronized (d.b) {
                    z = a.this.f17a.size() > 0;
                    arrayList = null;
                    if (z) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet(a.this.f17a.keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.k) {
                            a.this.a.clear();
                            this.k = false;
                        }
                        for (Map.Entry<String, Object> entry : this.b.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == this) {
                                a.this.a.remove(key);
                            } else {
                                a.this.a.put(key, value);
                            }
                            if (z) {
                                arrayList.add(key);
                            }
                        }
                        this.b.clear();
                    }
                    e = a.this.e();
                    if (e) {
                        a.this.a(true);
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        for (b.InterfaceC1431b interfaceC1431b : hashSet) {
                            if (interfaceC1431b != null) {
                                interfaceC1431b.a(a.this, str);
                            }
                        }
                    }
                }
                return e;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a a(String str, int i) {
                synchronized (this) {
                    this.b.put(str, Integer.valueOf(i));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a a(String str, long j) {
                synchronized (this) {
                    this.b.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a a(String str, float f) {
                synchronized (this) {
                    this.b.put(str, Float.valueOf(f));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a a(String str, boolean z) {
                synchronized (this) {
                    this.b.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public final b.a a(String str) {
                synchronized (this) {
                    this.b.put(str, this);
                }
                return this;
            }
        }

        public final void a(boolean z) {
            synchronized (this) {
                this.j = z;
            }
        }

        public final void a(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.a = map;
                }
            }
        }

        @Override // com.ta.utdid2.b.a.b
        public final b.a a() {
            return new C1432a();
        }

        private FileOutputStream a(File file) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (file.getParentFile().mkdir()) {
                    try {
                        return new FileOutputStream(file);
                    } catch (FileNotFoundException unused2) {
                        return null;
                    }
                }
                return null;
            }
        }
    }

    public d(String str) {
        if (str != null && str.length() > 0) {
            this.a = new File(str);
            return;
        }
        throw new RuntimeException("Directory can not be empty");
    }

    private File a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    private File b(String str) {
        File a2 = a();
        return a(a2, str + ".xml");
    }

    private File a() {
        File file;
        synchronized (this.f15a) {
            file = this.a;
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x0058, blocks: (B:31:0x0054, B:55:0x0088), top: B:85:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ta.utdid2.b.a.b a(java.lang.String r5, int r6) {
        /*
            r4 = this;
            java.io.File r5 = r4.b(r5)
            java.lang.Object r0 = com.ta.utdid2.b.a.d.b
            monitor-enter(r0)
            java.util.HashMap<java.io.File, com.ta.utdid2.b.a.d$a> r1 = r4.f16a     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> Laf
            com.ta.utdid2.b.a.d$a r1 = (com.ta.utdid2.b.a.d.a) r1     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L19
            boolean r2 = r1.d()     // Catch: java.lang.Throwable -> Laf
            if (r2 != 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            java.io.File r0 = a(r5)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L2a
            r5.delete()
            r0.renameTo(r5)
        L2a:
            boolean r0 = r5.exists()
            r2 = 0
            if (r0 == 0) goto L8b
            boolean r0 = r5.canRead()
            if (r0 == 0) goto L8b
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51 org.xmlpull.v1.XmlPullParserException -> L5a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51 org.xmlpull.v1.XmlPullParserException -> L5a
            java.util.HashMap r3 = com.ta.utdid2.b.a.e.a(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L52 org.xmlpull.v1.XmlPullParserException -> L5b
            r0.close()     // Catch: java.lang.Exception -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L4c
            r0.close()     // Catch: java.lang.Throwable -> L46
        L46:
            r2 = r3
            goto L8b
        L48:
            r2 = r3
            goto L52
        L4a:
            r2 = r3
            goto L5b
        L4c:
            r5 = move-exception
            goto L78
        L4e:
            r5 = move-exception
            r0 = r2
            goto L78
        L51:
            r0 = r2
        L52:
            if (r0 == 0) goto L8b
            r0.close()     // Catch: java.lang.Throwable -> L58
            goto L8b
        L58:
            goto L8b
        L5a:
            r0 = r2
        L5b:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7e
            int r0 = r3.available()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L7f
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L7f
            r3.read(r0)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L7f
            r3.close()     // Catch: java.lang.Throwable -> L85
            goto L86
        L6d:
            r5 = move-exception
            r2 = r3
            goto L72
        L70:
            r5 = move-exception
            r2 = r0
        L72:
            if (r2 == 0) goto L77
            r2.close()     // Catch: java.lang.Throwable -> L77
        L77:
            throw r5     // Catch: java.lang.Throwable -> L4e
        L78:
            if (r0 == 0) goto L7d
            r0.close()     // Catch: java.lang.Throwable -> L7d
        L7d:
            throw r5
        L7e:
            r3 = r0
        L7f:
            if (r3 == 0) goto L86
            r3.close()     // Catch: java.lang.Throwable -> L85
            goto L86
        L85:
        L86:
            if (r3 == 0) goto L8b
            r3.close()     // Catch: java.lang.Throwable -> L58
        L8b:
            java.lang.Object r3 = com.ta.utdid2.b.a.d.b
            monitor-enter(r3)
            if (r1 == 0) goto L96
            r1.a(r2)     // Catch: java.lang.Throwable -> L94
            goto Lab
        L94:
            r5 = move-exception
            goto Lad
        L96:
            java.util.HashMap<java.io.File, com.ta.utdid2.b.a.d$a> r0 = r4.f16a     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L94
            r1 = r0
            com.ta.utdid2.b.a.d$a r1 = (com.ta.utdid2.b.a.d.a) r1     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto Lab
            com.ta.utdid2.b.a.d$a r1 = new com.ta.utdid2.b.a.d$a     // Catch: java.lang.Throwable -> L94
            r1.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L94
            java.util.HashMap<java.io.File, com.ta.utdid2.b.a.d$a> r6 = r4.f16a     // Catch: java.lang.Throwable -> L94
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L94
        Lab:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L94
            return r1
        Lad:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L94
            throw r5
        Laf:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.d.a(java.lang.String, int):com.ta.utdid2.b.a.b");
    }

    public static File a(File file) {
        return new File(file.getPath() + ".bak");
    }
}
