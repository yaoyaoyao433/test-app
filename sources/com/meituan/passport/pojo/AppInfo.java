package com.meituan.passport.pojo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppInfo {
    private static String PACKAGENAME_APP_MAICAI = "com.meituan.retail.v.android";
    private static String PACKAGENAME_APP_MEITUAN = "com.sankuai.meituan";
    private static String PACKAGENAME_APP_MOBIKE = "com.mobike.mobikeapp";
    private static String PACKAGENAME_APP_PAOTUI = "com.meituan.banma.errand";
    private static String PACKAGENAME_APP_WAIMAI = "com.sankuai.meituan.takeoutnew";
    private static String PACKAGENAME_APP_XIAOXIANG = "com.meituan.retail.c.android";
    private static String PACKAGENAME_APP_YOUXUAN = "com.sankuai.youxuan";
    private static String PACKAGENAME_APP_ZHENGUO = "com.meituan.phoenix";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum App {
        MEITUAN(AppInfo.PACKAGENAME_APP_MEITUAN),
        WAIMAI(AppInfo.PACKAGENAME_APP_WAIMAI),
        XIAOXIANG(AppInfo.PACKAGENAME_APP_XIAOXIANG),
        MAICAI(AppInfo.PACKAGENAME_APP_MAICAI),
        MOBIKE(AppInfo.PACKAGENAME_APP_MOBIKE),
        PAOTUI(AppInfo.PACKAGENAME_APP_PAOTUI),
        ZHENGGUO(AppInfo.PACKAGENAME_APP_ZHENGUO),
        YOUXUAN(AppInfo.PACKAGENAME_APP_YOUXUAN);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private String packageName;

        public static App valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c585bd0c83bde2051a4d9901db419d64", RobustBitConfig.DEFAULT_VALUE) ? (App) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c585bd0c83bde2051a4d9901db419d64") : (App) Enum.valueOf(App.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static App[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a6c478f947eba34c1c0d5f162294103", RobustBitConfig.DEFAULT_VALUE) ? (App[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a6c478f947eba34c1c0d5f162294103") : (App[]) values().clone();
        }

        App(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6910de3dbad552bb57da728b55140c7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6910de3dbad552bb57da728b55140c7");
            } else {
                this.packageName = str;
            }
        }

        public final String getPackageName() {
            return this.packageName;
        }
    }
}
