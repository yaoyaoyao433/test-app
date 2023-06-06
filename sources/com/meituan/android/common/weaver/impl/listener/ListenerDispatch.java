package com.meituan.android.common.weaver.impl.listener;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ListenerDispatch<T, B> implements WithDispatch {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static final ErrorReporter sReporter = new ErrorReporter("dispatch", 2);
    private final Class<T> clazz;
    protected final Map<T, Boolean> mSet;
    protected List<T> serviceLoaderListener;

    public abstract void action(T t, B b);

    public ListenerDispatch(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5c4553e565a49769d86dbb4d49139e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5c4553e565a49769d86dbb4d49139e");
            return;
        }
        this.mSet = new ConcurrentHashMap();
        this.clazz = cls;
    }

    public void dispatch(B b) {
        Object[] objArr = {b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9313bb20c22990ccece7b42dc2494afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9313bb20c22990ccece7b42dc2494afb");
            return;
        }
        try {
            for (T t : this.mSet.keySet()) {
                action(t, b);
            }
            List<T> list = this.serviceLoaderListener;
            if (list != null) {
                for (T t2 : list) {
                    action(t2, b);
                }
            }
        } catch (Throwable th) {
            sReporter.report(th);
        }
    }

    public void register(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d28c6c6f9edebefdb4867398d33c787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d28c6c6f9edebefdb4867398d33c787");
        } else {
            this.mSet.put(t, Boolean.TRUE);
        }
    }

    public void unregister(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff9e9ec0facf90d27108da5613f0a28d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff9e9ec0facf90d27108da5613f0a28d");
        } else {
            this.mSet.remove(t);
        }
    }

    private boolean withServiceLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac3ee0503e4ad29a9748104c9e6acac1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac3ee0503e4ad29a9748104c9e6acac1")).booleanValue();
        }
        if (this.serviceLoaderListener == null && b.a()) {
            List<T> a = b.a(this.clazz, (String) null);
            if (a == null || a.isEmpty()) {
                this.serviceLoaderListener = Collections.emptyList();
                return false;
            }
            this.serviceLoaderListener = a;
            return true;
        }
        List<T> list = this.serviceLoaderListener;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.meituan.android.common.weaver.impl.listener.WithDispatch
    public boolean withDispatch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1579c2dff9ad9eaa018d755ca8910635", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1579c2dff9ad9eaa018d755ca8910635")).booleanValue() : withServiceLoader() || !this.mSet.isEmpty();
    }
}
