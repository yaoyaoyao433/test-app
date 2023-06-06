package com.sankuai.waimai.business.titans.init;

import android.content.Context;
import com.meituan.crashreporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.WebViewCacheHandler;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.adaptor.IAppTitansInit;
import com.sankuai.waimai.business.titans.b;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansInit implements IAppTitansInit {
    public static ChangeQuickRedirect a;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInit
    public synchronized void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57990b36ae12e7db530cc8c9339ac96e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57990b36ae12e7db530cc8c9339ac96e");
        } else if (b.compareAndSet(false, true)) {
            if (context == null) {
                throw new RuntimeException("Titans init error: context can not be null");
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            c.a("web").a();
            c.a("web").a("1.0");
            WebViewCacheHandler.registerCrashInfoProvider(context);
            Titans.init(context, new b(context));
            b.set(true);
        }
    }
}
