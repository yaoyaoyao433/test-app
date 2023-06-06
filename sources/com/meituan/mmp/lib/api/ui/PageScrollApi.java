package com.meituan.mmp.lib.api.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.widget.Scroller;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.page.e;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PageScrollApi extends ActivityApi {
    public static ChangeQuickRedirect h;
    private IApiCallback i;
    private Scroller j;
    private ViewPropertyAnimator k;
    private int l;

    public static /* synthetic */ IApiCallback a(PageScrollApi pageScrollApi, IApiCallback iApiCallback) {
        pageScrollApi.i = null;
        return null;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952d3dc27022a4eda70fd1a476b64cbc", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952d3dc27022a4eda70fd1a476b64cbc") : new String[]{"scrollWebviewTo"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20222d63248fa5e4062fbd1f7224b7ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20222d63248fa5e4062fbd1f7224b7ce");
        } else if (!jSONObject.has("scrollTop")) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "need scrollTop param"));
        } else {
            int a = p.a(jSONObject.optDouble("scrollTop", 0.0d));
            int optInt = jSONObject.optInt("duration", 300);
            cancel();
            if (optInt < 0) {
                b.c("PageScrollApi", "duration " + a + " < 0, limit to 0");
                optInt = 0;
            }
            final e d = getPageManager().d(a(jSONObject, -1));
            if (a < 0) {
                b.c("PageScrollApi", "scrollTop " + a + " < 0, limit to 0");
                a = 0;
            }
            int webScrollY = d.getWebScrollY();
            this.i = iApiCallback;
            this.l = webScrollY;
            this.j = new Scroller(getContext());
            this.j.startScroll(0, webScrollY, 0, a - webScrollY, optInt);
            this.k = d.animate();
            this.k.setDuration(optInt).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.mmp.lib.api.ui.PageScrollApi.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "925311464fac578a80f493971b4b46b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "925311464fac578a80f493971b4b46b0");
                        return;
                    }
                    int webScrollY2 = d.getWebScrollY();
                    if (!d.isAttachedToWindow()) {
                        PageScrollApi.this.cancel();
                    } else if (Math.abs(PageScrollApi.this.l - webScrollY2) <= 1) {
                        if (PageScrollApi.this.l != webScrollY2) {
                            b.c("InnerApi", "lastScrollY " + PageScrollApi.this.l + " != actualY " + webScrollY2 + ", ignored");
                        }
                        PageScrollApi.this.j.computeScrollOffset();
                        d.c(PageScrollApi.this.j.getCurrY() - webScrollY2);
                        PageScrollApi.this.l = PageScrollApi.this.j.getCurrY();
                        b.a("PageScrollApi", "currY: " + PageScrollApi.this.j.getCurrY());
                    } else {
                        b.c("InnerApi", "lastScrollY " + PageScrollApi.this.l + " != actualY " + webScrollY2 + ", seems user scrolling, cancel auto scroll");
                        PageScrollApi.this.cancel();
                    }
                }
            }).setListener(new AnimatorListenerAdapter() { // from class: com.meituan.mmp.lib.api.ui.PageScrollApi.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c29464feb218d30b5b11cbd584ab16f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c29464feb218d30b5b11cbd584ab16f");
                    } else if (PageScrollApi.this.i != null) {
                        PageScrollApi.this.i.onSuccess(null);
                        PageScrollApi.a(PageScrollApi.this, (IApiCallback) null);
                    }
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77ee8af0149d5f80a7e8e509ef862a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77ee8af0149d5f80a7e8e509ef862a5");
            return;
        }
        if (this.i != null) {
            this.i.onCancel();
            this.i = null;
        }
        if (this.j != null) {
            this.j.forceFinished(true);
        }
        if (this.k != null) {
            this.k.cancel();
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cd5470bb94e34d766747378c6c1c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cd5470bb94e34d766747378c6c1c51");
        } else {
            cancel();
        }
    }
}
