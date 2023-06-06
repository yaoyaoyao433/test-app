package com.sankuai.android.share.keymodule.shareChannel.qq;

import android.content.Context;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.bean.QQCallbackBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements IUiListener {
    public static ChangeQuickRedirect a;
    private c b;
    private Context c;
    private b.a d;
    private ShareBaseBean e;
    private LyingkitTraceBody f;

    @Override // com.tencent.tauth.IUiListener
    public final void onWarning(int i) {
    }

    public a(LyingkitTraceBody lyingkitTraceBody, c cVar, Context context, b.a aVar, ShareBaseBean shareBaseBean) {
        Object[] objArr = {lyingkitTraceBody, cVar, context, aVar, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b214400b7722d6f76a6c490e98264916", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b214400b7722d6f76a6c490e98264916");
            return;
        }
        this.f = lyingkitTraceBody;
        this.b = cVar;
        this.c = context;
        this.d = aVar;
        this.e = shareBaseBean;
    }

    @Override // com.tencent.tauth.IUiListener
    public final void onComplete(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b7a355e94c671034e45711c852c100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b7a355e94c671034e45711c852c100");
            return;
        }
        QQCallbackBean qQCallbackBean = new QQCallbackBean();
        qQCallbackBean.data = this.e;
        qQCallbackBean.shareListener = this.b;
        qQCallbackBean.shareStatus = c.a.COMPLETE;
        qQCallbackBean.type = this.d;
        com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", this.f, "0"), LyingkitKernel_share.SHARE_QQSHARESERVICE_SHARECALLBACK, qQCallbackBean);
    }

    @Override // com.tencent.tauth.IUiListener
    public final void onError(UiError uiError) {
        Object[] objArr = {uiError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0824edcd512c296ec1b60ce6961984a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0824edcd512c296ec1b60ce6961984a");
            return;
        }
        QQCallbackBean qQCallbackBean = new QQCallbackBean();
        qQCallbackBean.data = this.e;
        qQCallbackBean.shareListener = this.b;
        qQCallbackBean.shareStatus = c.a.FAILED;
        qQCallbackBean.type = this.d;
        com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", this.f, "0"), LyingkitKernel_share.SHARE_QQSHARESERVICE_SHARECALLBACK, qQCallbackBean);
    }

    @Override // com.tencent.tauth.IUiListener
    public final void onCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7bd9e6d31fc54999a4d94bfbd9c39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7bd9e6d31fc54999a4d94bfbd9c39a");
            return;
        }
        QQCallbackBean qQCallbackBean = new QQCallbackBean();
        qQCallbackBean.data = this.e;
        qQCallbackBean.shareListener = this.b;
        qQCallbackBean.shareStatus = c.a.CANCEL;
        qQCallbackBean.type = this.d;
        com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", this.f, "0"), LyingkitKernel_share.SHARE_QQSHARESERVICE_SHARECALLBACK, qQCallbackBean);
    }
}
