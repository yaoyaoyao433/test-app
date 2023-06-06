package com.meituan.android.common.locate.loader;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
@Deprecated
/* loaded from: classes2.dex */
public class LocationLoader extends a<Location> implements LocationInfo.LocationInfoListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    public LocationLoader(Context context, MasterLocator masterLocator, LocationStrategy locationStrategy) {
        super(context);
        Object[] objArr = {context, masterLocator, locationStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c478d014a3059dc7ccfbb3a6e506c4c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c478d014a3059dc7ccfbb3a6e506c4c6");
        }
    }

    public LocationLoader(Context context, MasterLocator masterLocator, LocationStrategy locationStrategy, Looper looper) {
        super(context);
        Object[] objArr = {context, masterLocator, locationStrategy, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1f42218ad20ac4b04614701089d6f93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1f42218ad20ac4b04614701089d6f93");
        }
    }

    @Override // android.support.v4.content.Loader
    public void deliverResult(Location location) {
    }

    @Override // com.meituan.android.common.locate.LocationInfo.LocationInfoListener
    public boolean onLocationGot(LocationInfo locationInfo) {
        return false;
    }
}
