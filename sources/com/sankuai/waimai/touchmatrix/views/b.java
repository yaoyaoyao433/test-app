package com.sankuai.waimai.touchmatrix.views;

import android.app.Dialog;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.rebuild.utils.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private final Map<WeakReference<DialogInterface>, a> c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public WeakReference<DialogInterface> a;
        public int b;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a46a3095dc3f173034648af07a3c935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a46a3095dc3f173034648af07a3c935");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49b4bdeb7c8e071b10fb7777e02239e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49b4bdeb7c8e071b10fb7777e02239e2");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce53821155aaac299c8c96fc8302e75a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce53821155aaac299c8c96fc8302e75a");
        } else if (dialogInterface == null) {
        } else {
            WeakReference<DialogInterface> weakReference = null;
            Iterator<WeakReference<DialogInterface>> it = this.c.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<DialogInterface> next = it.next();
                if (next != null && dialogInterface == next.get()) {
                    weakReference = next;
                    break;
                }
            }
            if (weakReference == null) {
                weakReference = new WeakReference<>(dialogInterface);
            }
            if (this.c.containsKey(weakReference)) {
                return;
            }
            a aVar = new a();
            aVar.a = weakReference;
            aVar.b = 10;
            this.c.put(weakReference, aVar);
            c.e("TouchMatrixNativeDialogManager  设置Native弹窗在展示： " + dialogInterface.getClass().getName(), new Object[0]);
        }
    }

    public final void b(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070b7d33e54470e5633950b1c5f65b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070b7d33e54470e5633950b1c5f65b48");
        } else if (dialogInterface == null) {
        } else {
            WeakReference<DialogInterface> weakReference = null;
            Iterator<WeakReference<DialogInterface>> it = this.c.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<DialogInterface> next = it.next();
                if (next != null && dialogInterface == next.get()) {
                    weakReference = next;
                    break;
                }
            }
            if (weakReference == null || !this.c.containsKey(weakReference)) {
                return;
            }
            a remove = this.c.remove(weakReference);
            if (remove != null) {
                remove.b = 11;
            }
            c.e("TouchMatrixNativeDialogManager  删除Native弹窗屏蔽： " + dialogInterface.getClass().getName(), new Object[0]);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a96472802f45f73afbc338ac515879", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a96472802f45f73afbc338ac515879")).booleanValue();
        }
        for (WeakReference<DialogInterface> weakReference : this.c.keySet()) {
            DialogInterface dialogInterface = weakReference.get();
            if (weakReference.get() == null) {
                this.c.remove(weakReference);
                c.e("TouchMatrixNativeDialogManager  弱引用Dialog已被回收 remove： ", new Object[0]);
            } else if ((dialogInterface instanceof Dialog) && !((Dialog) dialogInterface).isShowing()) {
                this.c.remove(weakReference);
                c.e("TouchMatrixNativeDialogManager  Dialog不在showing, remove： " + dialogInterface.getClass().getName(), new Object[0]);
            } else {
                a aVar = this.c.get(weakReference);
                if (aVar == null) {
                    continue;
                } else if (aVar.b == 11) {
                    this.c.remove(weakReference);
                    c.e("TouchMatrixNativeDialogManager  DialogWrapper状态为Close, remove： ", new Object[0]);
                } else if (aVar.b == 10) {
                    return true;
                }
            }
        }
        return false;
    }
}
