package com.sankuai.waimai.irmo.render.bean.anim;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.irmo.render.i;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IrmoAnimationDelegate<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected T animInfo;
    protected StatusListener endListener;
    protected i reporter;
    protected StatusListener startListener;
    protected View targetView;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Observer<T> {
        void onMsg(T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface StatusListener {
        void execute();
    }

    public abstract boolean pause();

    public abstract boolean prepare();

    public abstract boolean resume();

    public abstract boolean start();

    public abstract boolean stop();

    public IrmoAnimationDelegate(T t, View view) {
        Object[] objArr = {t, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a00c0477eae4ce95b9330bb13c0ae29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a00c0477eae4ce95b9330bb13c0ae29");
            return;
        }
        this.animInfo = t;
        this.targetView = view;
    }

    public void setStartListener(StatusListener statusListener) {
        this.startListener = statusListener;
    }

    public void setEndListener(StatusListener statusListener) {
        this.endListener = statusListener;
    }

    public void setReporter(i iVar) {
        this.reporter = iVar;
    }
}
