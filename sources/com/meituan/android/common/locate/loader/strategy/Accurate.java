package com.meituan.android.common.locate.loader.strategy;

import android.os.SystemClock;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.provider.d;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public class Accurate extends Instant {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Accurate() {
        super(LocationLoaderFactory.LoadStrategy.accurate);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4d8ce542d8782afe8f9fad044d9608d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4d8ce542d8782afe8f9fad044d9608d");
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Instant, com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.LocationStrategy
    public boolean adopt(LocationInfo locationInfo) {
        Object[] objArr = {locationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a27f8b9abc2577323e963ab1f0cb7cc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a27f8b9abc2577323e963ab1f0cb7cc0")).booleanValue();
        }
        if (!super.adopt(locationInfo)) {
            LogUtils.a("Accurate super not adopt");
            return false;
        } else if ("mars".equals(locationInfo.location.getProvider())) {
            return true;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - d.a().b;
            StringBuilder sb = new StringBuilder("Accurate latitude/longitude:");
            sb.append(locationInfo.location.getLatitude());
            sb.append("/");
            sb.append(locationInfo.location.getLongitude());
            sb.append(" provider:");
            sb.append(locationInfo.location.getProvider());
            sb.append(" from:");
            sb.append(locationInfo.location.getExtras() == null ? null : locationInfo.location.getExtras().get("from"));
            sb.append(" GPS缓存位置时间与当前系统时间差:");
            sb.append(elapsedRealtime);
            sb.append(" 非gps定位是否接纳:");
            int i = (elapsedRealtime > PayTask.j ? 1 : (elapsedRealtime == PayTask.j ? 0 : -1));
            sb.append(i > 0);
            LogUtils.a(sb.toString());
            return i > 0;
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Instant, com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "Accurate";
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.LocationStrategy
    public boolean goodEnough(LocationInfo locationInfo) {
        Object[] objArr = {locationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2517af3e0410e7a43dd3d5c1708de59d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2517af3e0410e7a43dd3d5c1708de59d")).booleanValue();
        }
        if (locationInfo == null || locationInfo.location == null) {
            return false;
        }
        return "mars".equals(locationInfo.location.getProvider());
    }
}
