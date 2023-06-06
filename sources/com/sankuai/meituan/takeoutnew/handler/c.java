package com.sankuai.meituan.takeoutnew.handler;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c implements Handler.Callback {
    public static ChangeQuickRedirect a;
    public a b;
    private Handler.Callback c;
    private Handler d;
    private com.sankuai.meituan.takeoutnew.handler.b e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public abstract void a(Message message);

    private c(Handler handler, Handler.Callback callback, a aVar, com.sankuai.meituan.takeoutnew.handler.b bVar) {
        Object[] objArr = {handler, callback, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be37ea908e4f70db30e955070d317161", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be37ea908e4f70db30e955070d317161");
            return;
        }
        this.d = handler;
        this.c = callback;
        this.b = aVar;
        this.e = bVar;
    }

    public static void a(a aVar, com.sankuai.meituan.takeoutnew.handler.b bVar) {
        c bVar2;
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46b58ee9acdc225cab5409d34f13cecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46b58ee9acdc225cab5409d34f13cecd");
            return;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mH");
            declaredField.setAccessible(true);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            Handler handler = (Handler) declaredField.get(invoke);
            Handler.Callback callback = (Handler.Callback) declaredField2.get(handler);
            Object[] objArr2 = {handler, callback, aVar, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "260c047af9094b1e2e40f9bb5ec0d14e", RobustBitConfig.DEFAULT_VALUE)) {
                bVar2 = (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "260c047af9094b1e2e40f9bb5ec0d14e");
            } else if (Build.VERSION.SDK_INT >= 28) {
                bVar2 = new C0649c(handler, callback, aVar, bVar);
            } else {
                bVar2 = new b(handler, callback, aVar, bVar);
            }
            declaredField2.set(handler, bVar2);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d26cf0a77912261ee37713982211f08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d26cf0a77912261ee37713982211f08")).booleanValue();
        }
        a(message);
        if (this.e == null || !this.e.a(this.d, this.c, message)) {
            return this.c != null && this.c.handleMessage(message);
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b extends c {
        public static ChangeQuickRedirect c;

        public b(Handler handler, Handler.Callback callback, a aVar, com.sankuai.meituan.takeoutnew.handler.b bVar) {
            super(handler, callback, aVar, bVar);
            Object[] objArr = {handler, callback, aVar, bVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b6613142460980a78d7dcc75abc2e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b6613142460980a78d7dcc75abc2e8");
            }
        }

        @Override // com.sankuai.meituan.takeoutnew.handler.c
        public void a(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df3ec923dcb437f1ec9ed69391dc956", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df3ec923dcb437f1ec9ed69391dc956");
                return;
            }
            int i = message.what;
            if (i == 100) {
                Object obj = message.obj;
            } else if (i != 132) {
                switch (i) {
                    case 113:
                        Object obj2 = message.obj;
                        return;
                    case 114:
                        Object obj3 = message.obj;
                        return;
                    default:
                        return;
                }
            } else {
                Object obj4 = message.obj;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.takeoutnew.handler.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0649c extends b {
        public static ChangeQuickRedirect d;

        public C0649c(Handler handler, Handler.Callback callback, a aVar, com.sankuai.meituan.takeoutnew.handler.b bVar) {
            super(handler, callback, aVar, bVar);
            Object[] objArr = {handler, callback, aVar, bVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe63f6dffbddfd32467f06767974513", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe63f6dffbddfd32467f06767974513");
            }
        }

        @Override // com.sankuai.meituan.takeoutnew.handler.c.b, com.sankuai.meituan.takeoutnew.handler.c
        public final void a(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d15db626ba1eb9e833b25946978ecd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d15db626ba1eb9e833b25946978ecd");
            } else if (message.what == 159) {
                Object obj = message.obj;
            } else {
                super.a(message);
            }
        }
    }
}
