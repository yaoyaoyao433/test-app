package com.meituan.android.common.weaver.impl.listener;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LEnd implements WithDispatch, FFPRenderEndListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener
    public void onFFPRenderEnd(@NonNull FFPRenderEndListener.IRenderEndEvent iRenderEndEvent) {
        Object[] objArr = {iRenderEndEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1a7ffa1b35af033ed1a7e80b8badf56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1a7ffa1b35af033ed1a7e80b8badf56");
        } else {
            LEndDispatch.instance.dispatch(iRenderEndEvent);
        }
    }

    @Override // com.meituan.android.common.weaver.impl.listener.WithDispatch
    public boolean withDispatch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cca979481da007d0e85b95733cbd6900", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cca979481da007d0e85b95733cbd6900")).booleanValue() : LEndDispatch.instance.withDispatch();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LEndDispatch extends ListenerDispatch<FFPRenderEndListener, FFPRenderEndListener.IRenderEndEvent> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static LEndDispatch instance = new LEndDispatch();

        public LEndDispatch() {
            super(FFPRenderEndListener.class);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "866dd1110e46ea9b4742ca4213336fee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "866dd1110e46ea9b4742ca4213336fee");
            }
        }

        @Override // com.meituan.android.common.weaver.impl.listener.ListenerDispatch
        public void action(FFPRenderEndListener fFPRenderEndListener, FFPRenderEndListener.IRenderEndEvent iRenderEndEvent) {
            Object[] objArr = {fFPRenderEndListener, iRenderEndEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69443fef6f3381ef02d07d1fc563774b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69443fef6f3381ef02d07d1fc563774b");
            } else {
                fFPRenderEndListener.onFFPRenderEnd(iRenderEndEvent);
            }
        }
    }
}
