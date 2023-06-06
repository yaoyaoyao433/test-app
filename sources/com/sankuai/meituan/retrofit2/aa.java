package com.sankuai.meituan.retrofit2;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class aa {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean c = false;
    private static volatile boolean d = false;
    private static volatile boolean e = false;
    private static volatile b f;
    private static volatile ArrayList<String> g = new ArrayList<String>() { // from class: com.sankuai.meituan.retrofit2.aa.1
        {
            add("report.meituan.com");
            add("frep.meituan.net");
            add("appmock.sankuai.com");
        }
    };
    public static String b = "";
    private static ExecutorService h = Executors.newSingleThreadExecutor();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);
    }

    public static boolean a(String str) {
        ArrayList<String> arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7d1eb6f4a3528ccc7c48020f06225fb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7d1eb6f4a3528ccc7c48020f06225fb")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (arrayList = g) != null && arrayList.size() > 0) {
            Iterator<String> it = g.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList<String> a() {
        return g;
    }

    public static void a(boolean z) {
        d = true;
        c = true;
    }

    public static void a(b bVar) {
        d = true;
        f = bVar;
    }

    public static boolean b() {
        return d;
    }

    public static void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "891ff1a49e4136bf867da35f859b7cb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "891ff1a49e4136bf867da35f859b7cb9");
            return;
        }
        try {
            if (e) {
                h.submit(new Runnable() { // from class: com.sankuai.meituan.retrofit2.aa.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "713d02e6477142f1aa5a55b3dbd280e3", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "713d02e6477142f1aa5a55b3dbd280e3");
                            return;
                        }
                        Thread.currentThread().getId();
                        ah ahVar = null;
                        try {
                            if (!TextUtils.isEmpty(aa.b)) {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = ah.a;
                                ahVar = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0a0ac01994fe7b2f89533236c9abb049", 6917529027641081856L) ? (ah) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0a0ac01994fe7b2f89533236c9abb049") : new ah();
                            }
                            a.a(a.a(), str);
                            if (ahVar != null) {
                                try {
                                    ahVar.a();
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                th2.printStackTrace();
                                if (ahVar != null) {
                                    try {
                                        ahVar.a();
                                    } catch (Throwable th3) {
                                        th3.printStackTrace();
                                    }
                                }
                            } catch (Throwable th4) {
                                if (ahVar != null) {
                                    try {
                                        ahVar.a();
                                    } catch (Throwable th5) {
                                        th5.printStackTrace();
                                    }
                                }
                                throw th4;
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (f != null) {
            f.a(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        public static ChangeQuickRedirect a;
        private static volatile a b;
        private OutputStream c;
        private File d;

        public static /* synthetic */ void a(a aVar, String str) {
            File[] listFiles;
            int i;
            char c = 1;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e0b463ac83923397a411794667f4888d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e0b463ac83923397a411794667f4888d");
                return;
            }
            try {
                aVar.d();
                if (aVar.c != null || aVar.b()) {
                    if (aVar.c != null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3b59262befe9727d2b0fe29fbea741ae", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3b59262befe9727d2b0fe29fbea741ae");
                        } else {
                            String c2 = aVar.c();
                            if (!TextUtils.isEmpty(c2)) {
                                File file = new File(c2);
                                if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 7) {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
                                    int length = listFiles.length;
                                    int i2 = 0;
                                    while (i2 < length) {
                                        File file2 = listFiles[i2];
                                        if (file2.getName().length() == 13) {
                                            String substring = file2.getName().substring(0, 10);
                                            Date parse = simpleDateFormat.parse(aVar.a("yyyy-MM-dd"));
                                            Date parse2 = simpleDateFormat.parse(substring);
                                            Object[] objArr3 = new Object[2];
                                            objArr3[0] = parse;
                                            objArr3[c] = parse2;
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "16435f0247f6ef1b2ae2cbf61db8eb2c", 6917529027641081856L)) {
                                                i = ((Integer) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "16435f0247f6ef1b2ae2cbf61db8eb2c")).intValue();
                                            } else {
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.setTime(parse);
                                                int i3 = calendar.get(6);
                                                calendar.setTime(parse2);
                                                i = i3 - calendar.get(6);
                                            }
                                            if (i > 7) {
                                                file2.delete();
                                            }
                                        }
                                        i2++;
                                        c = 1;
                                    }
                                }
                            }
                        }
                        aVar.c.write((str + StringUtil.CRLF_STRING).getBytes("UTF-8"));
                        aVar.c.flush();
                    }
                    aVar.d();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26950fc370004120b8a9e3224b68a60d", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26950fc370004120b8a9e3224b68a60d");
            }
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        b = new a();
                    }
                }
            }
            return b;
        }

        private boolean b() {
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbf3269f233d652fcb5e8f1deed9029", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbf3269f233d652fcb5e8f1deed9029")).booleanValue();
            }
            try {
                String c = c();
                if (TextUtils.isEmpty(c)) {
                    return false;
                }
                File file = new File(c);
                if (!file.exists() && !file.mkdirs()) {
                    file.mkdirs();
                } else if (!file.isDirectory() && file.delete() && !file.mkdirs()) {
                    file.mkdirs();
                }
                Object[] objArr2 = {c};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e9bad28e433c956d8f2cbe62c11e9ea", 6917529027641081856L)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e9bad28e433c956d8f2cbe62c11e9ea");
                } else {
                    str = c + File.separator + a("yyyy-MM-dd") + ".nl";
                }
                this.d = new File(str);
                if (!this.d.exists()) {
                    this.d.createNewFile();
                    this.c = new FileOutputStream(this.d);
                } else {
                    this.c = new FileOutputStream(this.d, true);
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        private String c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2c712774b967d269327ed6046cd772", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2c712774b967d269327ed6046cd772");
            }
            if (TextUtils.isEmpty(aa.b)) {
                return null;
            }
            return aa.b + File.separator + "retrofit_log";
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70be875057b73d0ee5280ed879b0fd6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70be875057b73d0ee5280ed879b0fd6d");
                return;
            }
            try {
                if (this.c != null) {
                    this.c.close();
                    this.c = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7f02e3ee003c208ff8a5541d094d55", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7f02e3ee003c208ff8a5541d094d55") : new SimpleDateFormat(str, Locale.CHINA).format(Calendar.getInstance().getTime());
        }
    }
}
