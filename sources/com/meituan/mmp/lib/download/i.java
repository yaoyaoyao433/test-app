package com.meituan.mmp.lib.download;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.mmp.lib.utils.bg;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.Downloader;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static volatile a a = new AnonymousClass1();
    public static volatile b b = new b() { // from class: com.meituan.mmp.lib.download.i.2
        public static ChangeQuickRedirect a;
        private Map<String, ArrayList<b.a>> b = new HashMap();
        private Lock c = new ReentrantLock();

        @Override // com.meituan.mmp.lib.download.i.b
        public final boolean a(String str, String str2, String str3, b.a aVar) {
            boolean z;
            Object[] objArr = {str, str2, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7a167a20a7c6b794e1fc8fb8ee61f4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7a167a20a7c6b794e1fc8fb8ee61f4")).booleanValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                aVar.a("Invalid parameter");
                return true;
            } else if (bg.b(str2, str3)) {
                aVar.a();
                return true;
            } else {
                String str4 = str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2;
                this.c.lock();
                try {
                    if (this.b.containsKey(str4)) {
                        z = true;
                    } else {
                        this.b.put(str4, new ArrayList<>());
                        z = false;
                    }
                    this.b.get(str4).add(aVar);
                    if (z) {
                        return false;
                    }
                    boolean a2 = bg.a(str, str2, str3);
                    this.c.lock();
                    try {
                        ArrayList<b.a> arrayList = this.b.get(str4);
                        this.b.remove(str4);
                        if (arrayList == null) {
                            return true;
                        }
                        if (!a2) {
                            Iterator<b.a> it = arrayList.iterator();
                            while (it.hasNext()) {
                                it.next().a("unzip failed");
                            }
                            return false;
                        }
                        Iterator<b.a> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            it2.next().a();
                        }
                        return true;
                    } finally {
                    }
                } finally {
                }
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.mmp.lib.download.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0410a {
            void a();

            void a(String str);

            void a(String str, long j);
        }

        boolean a(String str, String str2, String str3, String str4, InterfaceC0410a interfaceC0410a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public interface a {
            void a();

            void a(String str);
        }

        boolean a(String str, String str2, String str3, a aVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.download.i$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 implements a {
        public static ChangeQuickRedirect a;
        private Map<String, ArrayList<a>> b = new HashMap();
        private Lock c = new ReentrantLock();

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, ArrayList arrayList, String str) {
            Object[] objArr = {arrayList, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, anonymousClass1, changeQuickRedirect, false, "e5a8884147a5db856f5c77433c8241f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, anonymousClass1, changeQuickRedirect, false, "e5a8884147a5db856f5c77433c8241f7");
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d.a(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.meituan.mmp.lib.download.i$1$a */
        /* loaded from: classes3.dex */
        public class a {
            public static ChangeQuickRedirect a;
            public String b;
            public String c;
            public a.InterfaceC0410a d;

            public a(String str, String str2, a.InterfaceC0410a interfaceC0410a) {
                Object[] objArr = {AnonymousClass1.this, str, str2, interfaceC0410a};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20190f724fbbf3b13def86351569954e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20190f724fbbf3b13def86351569954e");
                    return;
                }
                this.b = str;
                this.c = str2;
                this.d = interfaceC0410a;
            }

            public final String a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dcaeeac94794fad22b57af98fc55dc3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dcaeeac94794fad22b57af98fc55dc3") : new File(this.b, this.c).getAbsolutePath();
            }
        }

        ArrayList<a> a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e31bf30de22a8b30f8f0b7813233a0", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e31bf30de22a8b30f8f0b7813233a0");
            }
            this.c.lock();
            try {
                return this.b.remove(str);
            } finally {
                this.c.unlock();
            }
        }

        @Override // com.meituan.mmp.lib.download.i.a
        public final boolean a(final String str, String str2, String str3, final String str4, a.InterfaceC0410a interfaceC0410a) {
            boolean z;
            Object[] objArr = {str, str2, str3, str4, interfaceC0410a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ae7e75baca3e1a9349e1c5b544b2bf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ae7e75baca3e1a9349e1c5b544b2bf")).booleanValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                interfaceC0410a.a("Invalid parameter");
                return true;
            }
            this.c.lock();
            try {
                if (this.b.containsKey(str)) {
                    z = true;
                } else {
                    this.b.put(str, new ArrayList<>());
                    z = false;
                }
                this.b.get(str).add(new a(str2, str3, interfaceC0410a));
                if (z) {
                    return false;
                }
                MMPEnvHelper.getDownloader().download(str, str2, new Downloader.Callback() { // from class: com.meituan.mmp.lib.download.i.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onProgress(long j, long j2) {
                    }

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onSuccess(final String str5, final long j) {
                        Object[] objArr2 = {str5, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1dd63a676bef73ecb37fed0f40096ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1dd63a676bef73ecb37fed0f40096ae");
                        } else {
                            h.a().a(new Runnable() { // from class: com.meituan.mmp.lib.download.i.1.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z2 = false;
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e75f394a810abbdbae87645643e1b201", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e75f394a810abbdbae87645643e1b201");
                                        return;
                                    }
                                    ArrayList<a> a2 = AnonymousClass1.this.a(str);
                                    if (a2 == null) {
                                        return;
                                    }
                                    File file = new File(str5);
                                    if (!file.exists()) {
                                        AnonymousClass1.a(AnonymousClass1.this, a2, "DownloadFailed DestFile Not Exist");
                                    } else if (!TextUtils.isEmpty(str4) && !TextUtils.equals(s.b(new File(str5)), str4)) {
                                        AnonymousClass1.a(AnonymousClass1.this, a2, "DownloadFailed MD5 not Match");
                                    } else {
                                        if (a2.size() == 1) {
                                            a aVar = a2.get(0);
                                            if (!str5.equals(aVar.a())) {
                                                File file2 = new File(aVar.b);
                                                if (!file2.exists() && !file2.mkdirs()) {
                                                    aVar.d.a("Mkdir failed");
                                                    return;
                                                } else if (!file.renameTo(new File(aVar.a()))) {
                                                    aVar.d.a("move file failed");
                                                    return;
                                                }
                                            }
                                        } else {
                                            Iterator<a> it = a2.iterator();
                                            while (it.hasNext()) {
                                                a next = it.next();
                                                if (str5.equals(next.a())) {
                                                    z2 = true;
                                                }
                                                File file3 = new File(next.b);
                                                if (!file3.exists() && !file3.mkdirs()) {
                                                    next.d.a("Mkdir failed");
                                                    return;
                                                } else if (!s.a(str5, next.a())) {
                                                    next.d.a("Copy file failed");
                                                    return;
                                                }
                                            }
                                            if (!z2) {
                                                s.a(str5);
                                            }
                                        }
                                        Iterator<a> it2 = a2.iterator();
                                        while (it2.hasNext()) {
                                            a next2 = it2.next();
                                            next2.d.a(next2.a(), j);
                                        }
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onFail(String str5) {
                        Object[] objArr2 = {str5};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67481d9b00997071bda493a848e6b955", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67481d9b00997071bda493a848e6b955");
                            return;
                        }
                        ArrayList<a> a2 = AnonymousClass1.this.a(str);
                        if (a2 == null) {
                            return;
                        }
                        AnonymousClass1.a(AnonymousClass1.this, a2, str5);
                    }

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onTimeout() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fe48f6fa61ca517839367c0b0cff3dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fe48f6fa61ca517839367c0b0cff3dc");
                            return;
                        }
                        ArrayList<a> a2 = AnonymousClass1.this.a(str);
                        if (a2 == null) {
                            return;
                        }
                        Iterator<a> it = a2.iterator();
                        while (it.hasNext()) {
                            it.next().d.a();
                        }
                    }
                });
                return true;
            } finally {
                this.c.unlock();
            }
        }
    }
}
