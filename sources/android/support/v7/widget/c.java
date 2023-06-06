package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c extends DataSetObservable {
    static final String a = "c";
    private static final Object g = new Object();
    private static final Map<String, c> h = new HashMap();
    final Context d;
    final String e;
    private Intent j;
    private e p;
    final Object b = new Object();
    final List<a> c = new ArrayList();
    private final List<d> i = new ArrayList();
    private b k = new C0011c();
    private int l = 50;
    boolean f = true;
    private boolean m = false;
    private boolean n = true;
    private boolean o = false;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(Intent intent, List<a> list, List<d> list2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(c cVar, Intent intent);
    }

    public static c a(Context context, String str) {
        c cVar;
        synchronized (g) {
            cVar = h.get(str);
            if (cVar == null) {
                cVar = new c(context, str);
                h.put(str, cVar);
            }
        }
        return cVar;
    }

    private c(Context context, String str) {
        this.d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            this.e = str + ".xml";
            return;
        }
        this.e = str;
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            d();
            size = this.c.size();
        }
        return size;
    }

    public final ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            d();
            resolveInfo = this.c.get(i).a;
        }
        return resolveInfo;
    }

    public final int a(ResolveInfo resolveInfo) {
        synchronized (this.b) {
            d();
            List<a> list = this.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final Intent b(int i) {
        synchronized (this.b) {
            if (this.j == null) {
                return null;
            }
            d();
            a aVar = this.c.get(i);
            ComponentName componentName = new ComponentName(aVar.a.activityInfo.packageName, aVar.a.activityInfo.name);
            Intent intent = new Intent(this.j);
            intent.setComponent(componentName);
            if (this.p != null) {
                if (this.p.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new d(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo b() {
        synchronized (this.b) {
            d();
            if (this.c.isEmpty()) {
                return null;
            }
            return this.c.get(0).a;
        }
    }

    private void e() {
        if (!this.m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.n) {
            this.n = false;
            if (TextUtils.isEmpty(this.e)) {
                return;
            }
            new f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.i), this.e);
        }
    }

    public final int c() {
        int size;
        synchronized (this.b) {
            d();
            size = this.i.size();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        boolean g2 = g() | h();
        i();
        if (g2) {
            f();
            notifyChanged();
        }
    }

    private boolean f() {
        if (this.k == null || this.j == null || this.c.isEmpty() || this.i.isEmpty()) {
            return false;
        }
        this.k.a(this.j, this.c, Collections.unmodifiableList(this.i));
        return true;
    }

    private boolean g() {
        if (!this.o || this.j == null) {
            return false;
        }
        this.o = false;
        this.c.clear();
        List<ResolveInfo> queryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.c.add(new a(queryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean h() {
        if (this.f && this.n && !TextUtils.isEmpty(this.e)) {
            this.f = false;
            this.m = true;
            j();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(d dVar) {
        boolean add = this.i.add(dVar);
        if (add) {
            this.n = true;
            i();
            e();
            f();
            notifyChanged();
        }
        return add;
    }

    private void i() {
        int size = this.i.size() - this.l;
        if (size <= 0) {
            return;
        }
        this.n = true;
        for (int i = 0; i < size; i++) {
            this.i.remove(0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class d {
        public final ComponentName a;
        public final long b;
        public final float c;

        public d(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public d(ComponentName componentName, long j, float f) {
            this.a = componentName;
            this.b = j;
            this.c = f;
        }

        public final int hashCode() {
            return (((((this.a == null ? 0 : this.a.hashCode()) + 31) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + Float.floatToIntBits(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a == null) {
                    if (dVar.a != null) {
                        return false;
                    }
                } else if (!this.a.equals(dVar.a)) {
                    return false;
                }
                return this.b == dVar.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(dVar.c);
            }
            return false;
        }

        public final String toString() {
            return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements Comparable<a> {
        public final ResolveInfo a;
        public float b;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.b) - Float.floatToIntBits(this.b);
        }

        public a(ResolveInfo resolveInfo) {
            this.a = resolveInfo;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.b) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((a) obj).b);
        }

        public final String toString() {
            return "[resolveInfo:" + this.a.toString() + "; weight:" + new BigDecimal(this.b) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.v7.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011c implements b {
        private final Map<ComponentName, a> a = new HashMap();

        C0011c() {
        }

        @Override // android.support.v7.widget.c.b
        public final void a(Intent intent, List<a> list, List<d> list2) {
            Map<ComponentName, a> map = this.a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a aVar = list.get(i);
                aVar.b = 0.0f;
                map.put(new ComponentName(aVar.a.activityInfo.packageName, aVar.a.activityInfo.name), aVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                d dVar = list2.get(size2);
                a aVar2 = map.get(dVar.a);
                if (aVar2 != null) {
                    aVar2.b += dVar.c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    private void j() {
        try {
            FileInputStream openFileInput = this.d.openFileInput(this.e);
            try {
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                        }
                        if (!"historical-records".equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        List<d> list = this.i;
                        list.clear();
                        while (true) {
                            int next = newPullParser.next();
                            if (next == 1) {
                                if (openFileInput != null) {
                                    try {
                                        openFileInput.close();
                                        return;
                                    } catch (IOException unused) {
                                        return;
                                    }
                                }
                                return;
                            } else if (next != 3 && next != 4) {
                                if (!"historical-record".equals(newPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new d(newPullParser.getAttributeValue(null, PushConstants.INTENT_ACTIVITY_NAME), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, GearsLocator.MALL_WEIGHT))));
                            }
                        }
                    } catch (Throwable th) {
                        if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    String str = a;
                    Log.e(str, "Error reading historical recrod file: " + this.e, e2);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (XmlPullParserException e3) {
                String str2 = a;
                Log.e(str2, "Error reading historical recrod file: " + this.e, e3);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        } catch (FileNotFoundException unused5) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class f extends AsyncTask<Object, Void, Void> {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
            if (r4 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
            if (r4 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
            if (r4 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
            if (r4 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.c.f.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }
}
