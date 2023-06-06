package com.meituan.android.common.locate;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.support.v4.content.Loader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public interface LocationLoaderFactory {

    /* loaded from: classes2.dex */
    public enum LoadStrategy {
        normal,
        useCache,
        refresh,
        newest,
        instant,
        navi_instant,
        accurate,
        timer;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        LoadStrategy() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb6fc4b9664145c89f0f2719fe9e52a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb6fc4b9664145c89f0f2719fe9e52a6");
            }
        }

        public static LoadStrategy valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (LoadStrategy) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cd9f9bbd739547773a0c15f7dc15358", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cd9f9bbd739547773a0c15f7dc15358") : Enum.valueOf(LoadStrategy.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LoadStrategy[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (LoadStrategy[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "227ba0fd90220f1535b4dbc44c283b3c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "227ba0fd90220f1535b4dbc44c283b3c") : values().clone());
        }
    }

    @Deprecated
    Loader<Location> createLocationLoader(Context context, LoadStrategy loadStrategy);

    @Deprecated
    Loader<Location> createLocationLoader(Context context, LoadStrategy loadStrategy, LoadConfig loadConfig);

    @Deprecated
    Loader<Location> createLocationLoader(Context context, LoadStrategy loadStrategy, LoadConfig loadConfig, Looper looper);

    @Deprecated
    Loader<Location> createLocationLoader(Context context, LoadStrategy loadStrategy, String str);

    @Deprecated
    Loader<MtLocation> createMtLocationLoader(Context context, LoadStrategy loadStrategy);

    Loader<MtLocation> createMtLocationLoader(Context context, LoadStrategy loadStrategy, LoadConfig loadConfig);

    Loader<MtLocation> createMtLocationLoader(Context context, LoadStrategy loadStrategy, LoadConfig loadConfig, Looper looper);

    Loader<MtLocation> createMtLocationLoader(Context context, LoadStrategy loadStrategy, String str);
}
