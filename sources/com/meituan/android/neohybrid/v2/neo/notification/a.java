package com.meituan.android.neohybrid.v2.neo.notification;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends Handler {
    public static ChangeQuickRedirect a;
    private final WeakReference<InterfaceC0315a> b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0315a {
        void a(String str);
    }

    private a(InterfaceC0315a interfaceC0315a) {
        Object[] objArr = {interfaceC0315a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d077d75a51af38a90625f9317c390ae0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d077d75a51af38a90625f9317c390ae0");
        } else {
            this.b = new WeakReference<>(interfaceC0315a);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c6c2ee82d315344fd4629c9efac44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c6c2ee82d315344fd4629c9efac44d");
            return;
        }
        super.handleMessage(message);
        InterfaceC0315a interfaceC0315a = this.b.get();
        if (interfaceC0315a == null || !(message.obj instanceof b)) {
            return;
        }
        interfaceC0315a.a(((b) message.obj).b);
    }

    public static void a(InterfaceC0315a interfaceC0315a, b... bVarArr) {
        Object[] objArr = {interfaceC0315a, bVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d916b8d7a34611b6567af1f31190e685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d916b8d7a34611b6567af1f31190e685");
            return;
        }
        a aVar = new a(interfaceC0315a);
        for (int i = 0; i <= 0; i++) {
            b bVar = bVarArr[0];
            Message obtainMessage = aVar.obtainMessage();
            obtainMessage.what = bVar.d;
            obtainMessage.obj = bVar;
            aVar.sendMessageDelayed(obtainMessage, bVar.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        String b;
        long c;
        int d;

        public static b a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50b0177f483e2df7d6695ef6bae0e675", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50b0177f483e2df7d6695ef6bae0e675");
            }
            b bVar = new b();
            bVar.b = str;
            bVar.c = j;
            bVar.d = (int) (j + 17);
            return bVar;
        }
    }
}
