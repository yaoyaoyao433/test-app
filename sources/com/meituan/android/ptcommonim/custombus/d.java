package com.meituan.android.ptcommonim.custombus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<String, Boolean> b = new ConcurrentHashMap<>(8);
    private static Handler c = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.ptcommonim.custombus.d.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564f637a42ef1b26ecf68234456d62d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564f637a42ef1b26ecf68234456d62d8");
            } else if (message.obj instanceof Runnable) {
                ((Runnable) message.obj).run();
            }
        }
    };

    public static void a(SessionId sessionId, LimitMessage limitMessage) {
        Object[] objArr = {sessionId, limitMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4200b4c7f308b6c54ff0fb4b3f2b1007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4200b4c7f308b6c54ff0fb4b3f2b1007");
            return;
        }
        String str = sessionId.f() + CommonConstant.Symbol.UNDERLINE + IMClient.a().k() + CommonConstant.Symbol.UNDERLINE + limitMessage.type;
        c.removeMessages(str.hashCode());
        b.put(str, Boolean.FALSE);
        c.sendMessageDelayed(Message.obtain(c, str.hashCode(), new a(str)), limitMessage.period * 1000);
    }

    public static boolean b(SessionId sessionId, LimitMessage limitMessage) {
        Object[] objArr = {sessionId, limitMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b930bf4fe5a962ba28fd6dde341f3dfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b930bf4fe5a962ba28fd6dde341f3dfb")).booleanValue();
        }
        String str = sessionId.f() + CommonConstant.Symbol.UNDERLINE + IMClient.a().k() + CommonConstant.Symbol.UNDERLINE + limitMessage.type;
        if (b.get(str) == null) {
            return true;
        }
        return b.get(str).booleanValue();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final String b;

        private a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3aa347086b2a8780d4234f8ad7738c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3aa347086b2a8780d4234f8ad7738c4");
            } else {
                this.b = str;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "902786c45d6a13ebd0b9a74781ca089d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "902786c45d6a13ebd0b9a74781ca089d");
            } else {
                d.b.put(this.b, Boolean.TRUE);
            }
        }
    }
}
