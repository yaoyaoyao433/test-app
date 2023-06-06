package com.sankuai.waimai.platform.domain.manager.crawler;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a d;
    public b b;
    public c c;
    private List<WeakReference<AbstractC1046a>> e;
    private Handler f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.domain.manager.crawler.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1046a {
        public abstract void a();

        public void b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b {
        public abstract String a();

        public String b() {
            return "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(Context context, String str);

        void a(Context context, String str, String str2);
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3e732f64ccced1e154e5d9424d714b64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3e732f64ccced1e154e5d9424d714b64");
        } else if (aVar.e != null) {
            Iterator<WeakReference<AbstractC1046a>> it = aVar.e.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC1046a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    AbstractC1046a abstractC1046a = next.get();
                    if (abstractC1046a == null) {
                        it.remove();
                    } else {
                        abstractC1046a.a();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, AbstractC1046a abstractC1046a) {
        boolean z = true;
        Object[] objArr = {abstractC1046a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "da3c5e6de8c8e539ca92c5fd6b113617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "da3c5e6de8c8e539ca92c5fd6b113617");
        } else if (abstractC1046a != null) {
            if (aVar.e == null) {
                aVar.e = new LinkedList();
            }
            Iterator<WeakReference<AbstractC1046a>> it = aVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                WeakReference<AbstractC1046a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    AbstractC1046a abstractC1046a2 = next.get();
                    if (abstractC1046a2 == null) {
                        it.remove();
                    } else if (abstractC1046a2 == abstractC1046a) {
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
            aVar.e.add(new WeakReference<>(abstractC1046a));
        }
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2ad0781240f799e7b95976d4a8428571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2ad0781240f799e7b95976d4a8428571");
        } else if (aVar.e != null) {
            Iterator<WeakReference<AbstractC1046a>> it = aVar.e.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC1046a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    AbstractC1046a abstractC1046a = next.get();
                    if (abstractC1046a == null) {
                        it.remove();
                    } else {
                        abstractC1046a.b();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void b(a aVar, AbstractC1046a abstractC1046a) {
        Object[] objArr = {abstractC1046a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f59e42fcde6da07e3186351522da69e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f59e42fcde6da07e3186351522da69e6");
        } else if (aVar.e != null) {
            Iterator<WeakReference<AbstractC1046a>> it = aVar.e.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC1046a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    AbstractC1046a abstractC1046a2 = next.get();
                    if (abstractC1046a2 == null || abstractC1046a2 == abstractC1046a) {
                        it.remove();
                    }
                }
            }
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d857558159533f6b99bf95ca2b099f80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d857558159533f6b99bf95ca2b099f80");
            return;
        }
        this.b = null;
        this.c = null;
        this.e = new LinkedList();
        this.f = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.platform.domain.manager.crawler.a.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0948e0d02ef8cd87578179c587ac6f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0948e0d02ef8cd87578179c587ac6f2");
                    return;
                }
                switch (message.what) {
                    case 1:
                        if (message.obj instanceof AbstractC1046a) {
                            a.a(a.this, (AbstractC1046a) message.obj);
                            return;
                        }
                        return;
                    case 2:
                        if (message.obj instanceof AbstractC1046a) {
                            a.b(a.this, (AbstractC1046a) message.obj);
                            return;
                        }
                        return;
                    case 3:
                        a.a(a.this);
                        return;
                    case 4:
                        a.b(a.this);
                        return;
                    default:
                        return;
                }
            }
        };
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ed35efdbe93600f63a8b689ed5137eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ed35efdbe93600f63a8b689ed5137eb");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public final synchronized void a(AbstractC1046a abstractC1046a) {
        Object[] objArr = {abstractC1046a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79224d0fe4a7d3bc695390d22cc7336f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79224d0fe4a7d3bc695390d22cc7336f");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = abstractC1046a;
        this.f.sendMessage(obtain);
    }

    public final synchronized void b(AbstractC1046a abstractC1046a) {
        Object[] objArr = {abstractC1046a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e802ab9ebac0837defaedb306d37d93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e802ab9ebac0837defaedb306d37d93");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = abstractC1046a;
        this.f.sendMessage(obtain);
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cd1038e496f265560bea7e112fc7dc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cd1038e496f265560bea7e112fc7dc6");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.f.sendMessage(obtain);
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c05084b20228b71bea7c05dca1aa373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c05084b20228b71bea7c05dca1aa373");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        this.f.sendMessage(obtain);
    }
}
