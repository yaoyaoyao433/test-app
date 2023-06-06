package com.dianping.picassocontroller.module;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Keep;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.vc.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "timer")
/* loaded from: classes.dex */
public class TimerModule extends com.dianping.picassocontroller.module.a {
    private static final int MSG_ID_INTERVAL = 1;
    private static final int MSG_ID_TIMEOUT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private a jsHandler;
    private HashMap<String, b> timers;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class TimerArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String handleId;
        public long time;
    }

    public TimerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d211104c65300f12d212a4d86be72758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d211104c65300f12d212a4d86be72758");
        } else {
            this.timers = new HashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public com.dianping.picassocontroller.bridge.b a;
        public long b;
        public int c;

        public b() {
        }
    }

    @Override // com.dianping.picassocontroller.module.a
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a24ca78215ff55fcb99860198edaa9a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a24ca78215ff55fcb99860198edaa9a3");
        } else {
            this.jsHandler = new a(((e) this.host).b.getLooper(), this);
        }
    }

    @Keep
    @PCSBMethod(name = "setTimeout")
    public String setTimeout(com.dianping.picassocontroller.vc.b bVar, TimerArgument timerArgument, com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, timerArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60074f6bd133b1b17ca6cefe1e916150", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60074f6bd133b1b17ca6cefe1e916150");
        }
        if (bVar instanceof e) {
            setTimerAction(timerArgument.time, bVar2, false);
        }
        return bVar2.b;
    }

    @Keep
    @PCSBMethod(name = "setInterval")
    public String setInterval(com.dianping.picassocontroller.vc.b bVar, TimerArgument timerArgument, com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, timerArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80650d7efc73a6c76bbdfd9dcf9989bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80650d7efc73a6c76bbdfd9dcf9989bc");
        }
        if (bVar instanceof e) {
            setTimerAction(timerArgument.time, bVar2, true);
        }
        return bVar2.b;
    }

    @Keep
    @PCSBMethod(name = "clearTimer")
    public void clearTimer(com.dianping.picassocontroller.vc.b bVar, TimerArgument timerArgument, com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, timerArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b2ab8ad56e3e6f140fc3b6f8c5065e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b2ab8ad56e3e6f140fc3b6f8c5065e7");
        } else if (bVar instanceof e) {
            clearTimerAction(timerArgument.handleId);
        }
    }

    @Override // com.dianping.picassocontroller.module.a
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4c050ef6ae96e1224d4d718316fee60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4c050ef6ae96e1224d4d718316fee60");
            return;
        }
        this.timers.clear();
        if (this.jsHandler != null) {
            this.jsHandler.removeCallbacksAndMessages(null);
        }
    }

    private void setTimerAction(long j, com.dianping.picassocontroller.bridge.b bVar, boolean z) {
        Object[] objArr = {new Long(j), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784646f074c728fe6b507170eedef1e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784646f074c728fe6b507170eedef1e7");
            return;
        }
        b bVar2 = new b();
        bVar2.a = bVar;
        bVar2.b = j;
        bVar2.c = z ? 1 : 0;
        this.timers.put(bVar.b, bVar2);
        this.jsHandler.sendMessageDelayed(Message.obtain(this.jsHandler, bVar2.c, bVar2), j);
    }

    public void clearTimerAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63fa200b1878f54dca7a49870626f890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63fa200b1878f54dca7a49870626f890");
            return;
        }
        b remove = this.timers.remove(str);
        if (remove != null) {
            this.jsHandler.removeMessages(remove.c, remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        public final WeakReference<TimerModule> b;

        public a(Looper looper, TimerModule timerModule) {
            super(looper);
            Object[] objArr = {looper, timerModule};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09dc27b8c1ba805cfac15182bee21d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09dc27b8c1ba805cfac15182bee21d0");
            } else {
                this.b = new WeakReference<>(timerModule);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d41a3fa8a3e1ee219db3574395a86d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d41a3fa8a3e1ee219db3574395a86d");
                return;
            }
            TimerModule timerModule = this.b.get();
            if (timerModule == null) {
                return;
            }
            switch (message.what) {
                case 0:
                    b bVar = (b) message.obj;
                    timerModule.timers.remove(bVar.a.b);
                    bVar.a.a(null);
                    return;
                case 1:
                    b bVar2 = (b) message.obj;
                    if (timerModule.timers.get(bVar2.a.b) == null) {
                        return;
                    }
                    bVar2.a.c(null);
                    sendMessageDelayed(Message.obtain(this, 1, bVar2), bVar2.b);
                    return;
                default:
                    return;
            }
        }
    }
}
