package com.sankuai.waimai.platform.capacity.network.interceptor;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public InterfaceC1041a b;
    private HashSet<b> d;
    private Handler e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.capacity.network.interceptor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1041a {
        boolean a(Context context, aj ajVar, BaseResponse baseResponse);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b {
        public abstract void a(int i, Bundle bundle);
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3177cf54c516ed397a362656059e7a49", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3177cf54c516ed397a362656059e7a49")).booleanValue() : i >= 410 && i <= 411;
    }

    public static /* synthetic */ void a(a aVar, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1c038865d73437017fe6613944892d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1c038865d73437017fe6613944892d3d");
        } else if (aVar.d != null) {
            Iterator<b> it = aVar.d.iterator();
            while (it.hasNext()) {
                it.next().a(i, bundle);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "891b05f6339c37a06cf940181f01346a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "891b05f6339c37a06cf940181f01346a");
        } else if (bVar != null) {
            if (aVar.d == null) {
                aVar.d = new HashSet<>();
            }
            aVar.d.add(bVar);
        }
    }

    public static /* synthetic */ void b(a aVar, b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a071bbe83bf4f36451f6d4f10bc04f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a071bbe83bf4f36451f6d4f10bc04f5b");
        } else if (aVar.d == null || aVar.d.size() <= 0) {
        } else {
            aVar.d.remove(bVar);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "006a8b325cd8502888d2c0c7904aa511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "006a8b325cd8502888d2c0c7904aa511");
            return;
        }
        this.b = null;
        this.d = new HashSet<>();
        this.e = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.platform.capacity.network.interceptor.a.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e61272772eed536e9bb21a9609877f95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e61272772eed536e9bb21a9609877f95");
                    return;
                }
                switch (message.what) {
                    case 1:
                        if (message.obj instanceof b) {
                            a.a(a.this, (b) message.obj);
                            return;
                        }
                        return;
                    case 2:
                        if (message.obj instanceof b) {
                            a.b(a.this, (b) message.obj);
                            return;
                        }
                        return;
                    case 3:
                        a.a(a.this, message.what, message.getData());
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4027c3594a3dc961a5e2b4257d94b650", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4027c3594a3dc961a5e2b4257d94b650");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final synchronized void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a95c14219fd1f9c64c45ffea7893daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a95c14219fd1f9c64c45ffea7893daf");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = bVar;
        this.e.sendMessage(obtain);
    }

    public final synchronized void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b7c6fc9c5d46e780c38ea6072a7148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b7c6fc9c5d46e780c38ea6072a7148");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = bVar;
        this.e.sendMessage(obtain);
    }

    public final synchronized void a(int i, Bundle bundle) {
        Object[] objArr = {3, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16446c93f0d05f2f3792c2d0ea2c4e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16446c93f0d05f2f3792c2d0ea2c4e3");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = bundle;
        obtain.setData(bundle);
        this.e.sendMessage(obtain);
    }

    public final synchronized void a(Context context, aj ajVar, BaseResponse baseResponse) {
        boolean z = false;
        Object[] objArr = {context, ajVar, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a1588c92e28e5509f856eb9049e6416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a1588c92e28e5509f856eb9049e6416");
            return;
        }
        if (context != null && this.b != null) {
            z = this.b.a(context, ajVar, baseResponse);
        }
        if (!z) {
            Bundle bundle = new Bundle();
            bundle.putString("load_key", "donothing");
            a(3, bundle);
        }
    }
}
