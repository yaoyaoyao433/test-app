package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.m;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class bm {
    private static volatile bm e;
    Context a;
    bl b;
    final HashMap<String, bk> c = new HashMap<>();
    ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final ArrayList<a> f = new ArrayList<>();

    /* loaded from: classes6.dex */
    public static abstract class b<T> extends a {
        private List<String> a;
        private String f;
        private String[] g;
        private String h;
        private String i;
        private String j;
        private int k;
        private List<T> l;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.l = new ArrayList();
            this.a = list;
            this.f = str2;
            this.g = strArr;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = i;
        }

        public abstract T a(Context context, Cursor cursor);

        @Override // com.xiaomi.push.bm.a
        public final void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.l.clear();
            if (this.a == null || this.a.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.a.size()];
                this.a.toArray(strArr2);
                strArr = strArr2;
            }
            Cursor query = sQLiteDatabase.query(this.b, strArr, this.f, this.g, this.h, this.i, this.j, this.k > 0 ? String.valueOf(this.k) : null);
            if (query != null && query.moveToFirst()) {
                do {
                    T a = a(context, query);
                    if (a != null) {
                        this.l.add(a);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, (List) this.l);
        }

        public abstract void a(Context context, List<T> list);

        @Override // com.xiaomi.push.bm.a
        public final SQLiteDatabase c() {
            return this.c.getReadableDatabase();
        }
    }

    /* loaded from: classes6.dex */
    public static class c extends a {
        private ArrayList<a> a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            this.a = new ArrayList<>();
            this.a.addAll(arrayList);
        }

        @Override // com.xiaomi.push.bm.a
        public final void a(Context context) {
            super.a(context);
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }

        @Override // com.xiaomi.push.bm.a
        public final void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class d extends a {
        private String a;
        protected String[] f;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.a = str2;
            this.f = strArr;
        }

        @Override // com.xiaomi.push.bm.a
        public final void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.b, this.a, this.f);
        }
    }

    /* loaded from: classes6.dex */
    public static class e extends a {
        private ContentValues a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.a = contentValues;
        }

        @Override // com.xiaomi.push.bm.a
        public final void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.b, null, this.a);
        }
    }

    private bm(Context context) {
        this.a = context;
    }

    public static bm a(Context context) {
        if (e == null) {
            synchronized (bm.class) {
                if (e == null) {
                    e = new bm(context);
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk a(String str) {
        bk bkVar = this.c.get(str);
        if (bkVar == null) {
            synchronized (this.c) {
                if (bkVar == null) {
                    try {
                        bkVar = this.b.a(this.a, str);
                        this.c.put(str, bkVar);
                    } finally {
                    }
                }
            }
        }
        return bkVar;
    }

    public final void a(Runnable runnable) {
        if (this.d.isShutdown()) {
            return;
        }
        this.d.execute(runnable);
    }

    /* loaded from: classes6.dex */
    public static abstract class a implements Runnable {
        private WeakReference<Context> a;
        protected String b;
        String d;
        a e;
        protected bk c = null;
        private Random f = new Random();
        private int g = 0;

        public a(String str) {
            this.d = str;
        }

        public Object a() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(Context context) {
            if (this.e != null) {
                this.e.a(context, a());
            }
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        public void a(Context context, Object obj) {
            bm.a(context).a(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(bk bkVar, Context context) {
            this.c = bkVar;
            this.b = this.c.a();
            this.a = new WeakReference<>(context);
        }

        public final boolean b() {
            return this.c == null || TextUtils.isEmpty(this.b) || this.a == null;
        }

        public SQLiteDatabase c() {
            return this.c.getWritableDatabase();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            if (this.a == null || (context = this.a.get()) == null || context.getFilesDir() == null || this.c == null || TextUtils.isEmpty(this.d)) {
                return;
            }
            File file = new File(this.d);
            new jv(context, new File(file.getParentFile(), aq.b(file.getAbsolutePath())), new bo(this, context)).run();
        }
    }

    private void a() {
        m.a(this.a).a((m.a) new bn(this), com.xiaomi.push.service.z.a(this.a).a(hg.StatDataProcessFrequency.by, 5));
    }

    public final void a(a aVar) {
        bk bkVar;
        if (aVar == null) {
            return;
        }
        if (this.b == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String str = aVar.d;
        synchronized (this.c) {
            bkVar = this.c.get(str);
            if (bkVar == null) {
                bkVar = this.b.a(this.a, str);
                this.c.put(str, bkVar);
            }
        }
        if (this.d.isShutdown()) {
            return;
        }
        aVar.a(bkVar, this.a);
        synchronized (this.f) {
            this.f.add(aVar);
            a();
        }
    }

    public final void a(ArrayList<a> arrayList) {
        if (this.b == null) {
            throw new IllegalStateException("should exec setDbHelperFactory method first!");
        }
        HashMap hashMap = new HashMap();
        if (this.d.isShutdown()) {
            return;
        }
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b()) {
                next.a(a(next.d), this.a);
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get(next.d);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(next.d, arrayList2);
            }
            arrayList2.add(next);
        }
        for (String str : hashMap.keySet()) {
            ArrayList arrayList3 = (ArrayList) hashMap.get(str);
            if (arrayList3 != null && arrayList3.size() > 0) {
                c cVar = new c(str, arrayList3);
                cVar.a(((a) arrayList3.get(0)).c, this.a);
                this.d.execute(cVar);
            }
        }
    }
}
