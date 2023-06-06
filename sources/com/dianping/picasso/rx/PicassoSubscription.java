package com.dianping.picasso.rx;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoSubscription {
    public static ChangeQuickRedirect changeQuickRedirect;
    public k subscription;

    public PicassoSubscription(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0872b7bb16f77a9f6057d2bfed8ee3db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0872b7bb16f77a9f6057d2bfed8ee3db");
        } else {
            this.subscription = kVar;
        }
    }

    public static PicassoSubscription createSubscription(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bbc41603746953109c8e91eb97001c4c", RobustBitConfig.DEFAULT_VALUE) ? (PicassoSubscription) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bbc41603746953109c8e91eb97001c4c") : new PicassoSubscription(kVar);
    }

    public void unsubscribe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d34cbe3b1c2337e024901c93b212ac38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d34cbe3b1c2337e024901c93b212ac38");
        } else {
            this.subscription.unsubscribe();
        }
    }

    public boolean isUnsubscribed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2771104a05fe208f491d944336d006fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2771104a05fe208f491d944336d006fb")).booleanValue() : this.subscription.isUnsubscribed();
    }
}
