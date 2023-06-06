package com.meituan.msc.mmpviews.swiper;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentTransaction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    public ScheduledExecutorService b;
    private Handler c;

    public a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db6720dd2085c8eb0006d331d0c64bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db6720dd2085c8eb0006d331d0c64bd");
        } else {
            this.c = new Handler(new Handler.Callback() { // from class: com.meituan.msc.mmpviews.swiper.a.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0de2d68ccec7f3ed115504a44827d4ab", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0de2d68ccec7f3ed115504a44827d4ab")).booleanValue();
                    }
                    runnable.run();
                    return true;
                }
            });
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e978299c1d1604d59233e4aeb46e837f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e978299c1d1604d59233e4aeb46e837f");
        } else if (this.b == null) {
            this.b = c.c("MSCBannerTimer");
            this.b.scheduleAtFixedRate(this, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cc3635c494aabd1c840cd679f4f02a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cc3635c494aabd1c840cd679f4f02a");
        } else if (this.b != null) {
            this.b.shutdown();
            this.b = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52f706d4283529757732899167423a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52f706d4283529757732899167423a18");
        } else {
            this.c.sendEmptyMessage(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        }
    }
}
