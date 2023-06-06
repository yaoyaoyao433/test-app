package com.meituan.android.neohybrid.neo.notification;

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
    private final WeakReference<InterfaceC0306a> b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0306a {
        void a(String str);
    }

    private a(InterfaceC0306a interfaceC0306a) {
        Object[] objArr = {interfaceC0306a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b178e25e603283f7576bfb05cf93584c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b178e25e603283f7576bfb05cf93584c");
        } else {
            this.b = new WeakReference<>(interfaceC0306a);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9c87d534547eb99b8d20813aae0b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9c87d534547eb99b8d20813aae0b10");
            return;
        }
        super.handleMessage(message);
        InterfaceC0306a interfaceC0306a = this.b.get();
        if (interfaceC0306a == null || !(message.obj instanceof b)) {
            return;
        }
        interfaceC0306a.a(((b) message.obj).b);
    }

    public static void a(InterfaceC0306a interfaceC0306a, b... bVarArr) {
        Object[] objArr = {interfaceC0306a, bVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b617ab536c25ee5e5be7a347d67a5e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b617ab536c25ee5e5be7a347d67a5e3");
            return;
        }
        a aVar = new a(interfaceC0306a);
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a9d5e1935a825230365d0c4b5c9f860", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a9d5e1935a825230365d0c4b5c9f860");
            }
            b bVar = new b();
            bVar.b = str;
            bVar.c = j;
            bVar.d = (int) (j + 17);
            return bVar;
        }
    }
}
