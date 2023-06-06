package com.meituan.android.aurora;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AuroraHCallbackProxy implements Handler.Callback {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AuroraHCallBack mAuroraHCallBack;
    public Handler.Callback mCallback;
    public ComponentLaunchDispatcher mDispatcher;
    public Handler mH;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ComponentLaunchDispatcher {
        void onComponentLaunch(int i, Object obj);
    }

    public abstract void dispatch(Message message);

    public AuroraHCallbackProxy(Handler handler, Handler.Callback callback, ComponentLaunchDispatcher componentLaunchDispatcher, AuroraHCallBack auroraHCallBack) {
        Object[] objArr = {handler, callback, componentLaunchDispatcher, auroraHCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f45d6d29c18e6b9297f91fffab6e1d3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f45d6d29c18e6b9297f91fffab6e1d3b");
            return;
        }
        this.mH = handler;
        this.mCallback = callback;
        this.mDispatcher = componentLaunchDispatcher;
        this.mAuroraHCallBack = auroraHCallBack;
    }

    public static void init(ComponentLaunchDispatcher componentLaunchDispatcher, AuroraHCallBack auroraHCallBack) {
        Object[] objArr = {componentLaunchDispatcher, auroraHCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "199036335f16e1741b574646fa957562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "199036335f16e1741b574646fa957562");
        } else if (componentLaunchDispatcher == null) {
        } else {
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
                declaredField2.set(handler, getProxy(handler, (Handler.Callback) declaredField2.get(handler), componentLaunchDispatcher, auroraHCallBack));
            } catch (Throwable unused) {
            }
        }
    }

    private static AuroraHCallbackProxy getProxy(Handler handler, Handler.Callback callback, ComponentLaunchDispatcher componentLaunchDispatcher, AuroraHCallBack auroraHCallBack) {
        Object[] objArr = {handler, callback, componentLaunchDispatcher, auroraHCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67fbfde62be186d9e63aa13b763da631", RobustBitConfig.DEFAULT_VALUE)) {
            return (AuroraHCallbackProxy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67fbfde62be186d9e63aa13b763da631");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return new HCallbackProxyImpl_P(handler, callback, componentLaunchDispatcher, auroraHCallBack);
        }
        return new HCallbackProxyImpl_O(handler, callback, componentLaunchDispatcher, auroraHCallBack);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c854e8604ce79c5241c41f4de2f57f92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c854e8604ce79c5241c41f4de2f57f92")).booleanValue();
        }
        dispatch(message);
        if (this.mAuroraHCallBack == null || !this.mAuroraHCallBack.handleMessage(this.mH, this.mCallback, message)) {
            return this.mCallback != null && this.mCallback.handleMessage(message);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HCallbackProxyImpl_O extends AuroraHCallbackProxy {
        public static ChangeQuickRedirect changeQuickRedirect;

        public HCallbackProxyImpl_O(Handler handler, Handler.Callback callback, ComponentLaunchDispatcher componentLaunchDispatcher, AuroraHCallBack auroraHCallBack) {
            super(handler, callback, componentLaunchDispatcher, auroraHCallBack);
            Object[] objArr = {handler, callback, componentLaunchDispatcher, auroraHCallBack};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24b9930ea49355ea42f7c56000f13b3e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24b9930ea49355ea42f7c56000f13b3e");
            }
        }

        @Override // com.meituan.android.aurora.AuroraHCallbackProxy
        public void dispatch(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a6a581c90e47c273e96fc1fbd897819", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a6a581c90e47c273e96fc1fbd897819");
                return;
            }
            int i = message.what;
            if (i == 100) {
                this.mDispatcher.onComponentLaunch(0, message.obj);
            } else if (i != 132) {
                switch (i) {
                    case 113:
                        this.mDispatcher.onComponentLaunch(2, message.obj);
                        return;
                    case 114:
                        this.mDispatcher.onComponentLaunch(1, message.obj);
                        return;
                    default:
                        return;
                }
            } else {
                this.mDispatcher.onComponentLaunch(3, message.obj);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HCallbackProxyImpl_P extends HCallbackProxyImpl_O {
        public static ChangeQuickRedirect changeQuickRedirect;

        public HCallbackProxyImpl_P(Handler handler, Handler.Callback callback, ComponentLaunchDispatcher componentLaunchDispatcher, AuroraHCallBack auroraHCallBack) {
            super(handler, callback, componentLaunchDispatcher, auroraHCallBack);
            Object[] objArr = {handler, callback, componentLaunchDispatcher, auroraHCallBack};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b4d357423065e2e2e84134f0c750f89", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b4d357423065e2e2e84134f0c750f89");
            }
        }

        @Override // com.meituan.android.aurora.AuroraHCallbackProxy.HCallbackProxyImpl_O, com.meituan.android.aurora.AuroraHCallbackProxy
        public void dispatch(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11102dc99caa115d30880c0f5a0ee819", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11102dc99caa115d30880c0f5a0ee819");
            } else if (message.what == 159) {
                this.mDispatcher.onComponentLaunch(0, message.obj);
            } else {
                super.dispatch(message);
            }
        }
    }
}
