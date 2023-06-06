package com.meituan.android.legwork.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.bean.monitor.AppMonitorConfigs;
import com.meituan.android.legwork.bean.monitor.FuncConfigBean;
import com.meituan.android.legwork.bean.monitor.MonitorConfigBean;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.monitor.BaseMonitorManager;
import com.meituan.android.legwork.monitor.report.ReportService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private static q d;
    public boolean b;
    public AppMonitorConfigs c;

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c9004be2e1970f9ba0f8ff2e86c3e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c9004be2e1970f9ba0f8ff2e86c3e8");
        } else {
            this.b = false;
        }
    }

    public static synchronized q a() {
        synchronized (q.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2069c84c7c0499d9391b623f628f6de0", RobustBitConfig.DEFAULT_VALUE)) {
                return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2069c84c7c0499d9391b623f628f6de0");
            }
            if (d == null) {
                d = new q();
            }
            return d;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9583c604cd76b3dad7717a7fa341b7cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9583c604cd76b3dad7717a7fa341b7cc");
            return;
        }
        BaseMonitorManager.getInstance().init(com.meituan.android.legwork.a.a());
        BaseMonitorManager.getInstance().setCallback(new com.meituan.android.legwork.monitor.c() { // from class: com.meituan.android.legwork.utils.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.monitor.c
            public final String cityId() {
                return "";
            }

            @Override // com.meituan.android.legwork.monitor.c
            public final String currentCity() {
                return "";
            }

            @Override // com.meituan.android.legwork.monitor.c
            public final int appType() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9a7989cc83b03a8a45e6cee1c5a9740", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9a7989cc83b03a8a45e6cee1c5a9740")).intValue() : ((Integer) PmUtil.a(new PmUtil.a<Integer>() { // from class: com.meituan.android.legwork.utils.q.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.common.util.PmUtil.a
                    public final /* synthetic */ Integer a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6adb62ef08456ad07b4589f8c2d1b89", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6adb62ef08456ad07b4589f8c2d1b89");
                        }
                        return 10;
                    }

                    @Override // com.meituan.android.legwork.common.util.PmUtil.a
                    public final /* synthetic */ Integer b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5580f3e324d12a7af9c71ba00ed2746c", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5580f3e324d12a7af9c71ba00ed2746c");
                        }
                        return 11;
                    }

                    @Override // com.meituan.android.legwork.common.util.PmUtil.a
                    public final /* synthetic */ Integer c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33c53cdfc5d63bbff1eb0c24a85d3148", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33c53cdfc5d63bbff1eb0c24a85d3148");
                        }
                        return 1;
                    }

                    @Override // com.meituan.android.legwork.common.util.PmUtil.a
                    public final /* synthetic */ Integer d() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c717c8218cb921674f236ca8b56ef515", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c717c8218cb921674f236ca8b56ef515");
                        }
                        return 10;
                    }
                })).intValue();
            }

            @Override // com.meituan.android.legwork.monitor.c
            public final String appVersion() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94ac711d2584697165447e0f6a780faa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94ac711d2584697165447e0f6a780faa") : com.meituan.android.legwork.common.hostInfo.b.e().c();
            }

            @Override // com.meituan.android.legwork.monitor.c
            public final String mtUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00a4af00bf5df9ff04736a4ab9473f2f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00a4af00bf5df9ff04736a4ab9473f2f") : String.valueOf(com.meituan.android.legwork.common.user.a.a().d());
            }

            @Override // com.meituan.android.legwork.monitor.c
            public final long currentTime() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a47f97738865d9d17a3be72b40f40b3c", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a47f97738865d9d17a3be72b40f40b3c")).longValue() : com.meituan.android.time.c.b();
            }
        });
    }

    public final void a(FuncConfigBean funcConfigBean) {
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543947236bcf77d1f2ec75b36e111ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543947236bcf77d1f2ec75b36e111ff8");
            return;
        }
        AppMonitorConfigs appMonitorConfigs = new AppMonitorConfigs();
        if (funcConfigBean == null || funcConfigBean.support) {
            appMonitorConfigs.isOpenMonitor = 2;
        } else {
            appMonitorConfigs.isOpenMonitor = 1;
        }
        if (funcConfigBean != null && !TextUtils.isEmpty(funcConfigBean.ext)) {
            try {
                MonitorConfigBean monitorConfigBean = (MonitorConfigBean) new Gson().fromJson(funcConfigBean.ext, new TypeToken<MonitorConfigBean>() { // from class: com.meituan.android.legwork.utils.q.2
                }.getType());
                appMonitorConfigs.monitorFlags = monitorConfigBean.monitor_flag;
                appMonitorConfigs.reportInterval = monitorConfigBean.report_interval;
                appMonitorConfigs.unifyReportTime = monitorConfigBean.unify_report_time;
            } catch (Exception e) {
                x.a(e);
            }
        }
        this.b = appMonitorConfigs.isOpenMonitor == 1;
        this.c = appMonitorConfigs;
        BaseMonitorManager.getInstance().updateMonitorConfig(appMonitorConfigs);
        BaseMonitorManager.getInstance().start(com.meituan.android.legwork.a.a());
    }

    public static void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9ae240f65186bad30e9e6d8c684f969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9ae240f65186bad30e9e6d8c684f969");
        } else {
            a(str, null);
        }
    }

    public static void a(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ce0f95763e0f17fdf544a4fa8747db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ce0f95763e0f17fdf544a4fa8747db0");
        } else if (b(str)) {
            try {
                ReportService.report2DaBai(str, (int) (com.meituan.android.time.c.b() / 1000), map);
            } catch (Exception e) {
                x.b("MonitorUtil.reportMonitor()", "reportNormal error,exception msg:", e);
                x.a(e);
            }
        }
    }

    public static void a(@NonNull String str, int i, Map<String, Object> map) {
        Object[] objArr = {str, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e27a6b1acc23baed682dc3a173ec214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e27a6b1acc23baed682dc3a173ec214");
        } else if (a(i)) {
            try {
                ReportService.report2DaBai(str, (int) (com.meituan.android.time.c.b() / 1000), map);
            } catch (Exception e) {
                x.b("MonitorUtil.newReportMonitor()", "reportNormal error,exception msg:", e);
                x.a(e);
            }
        }
    }

    private static void a(String str, Map<String, Object> map, int i, String str2, String str3, String str4) {
        Object[] objArr = {str, map, Integer.valueOf(i), str2, str3, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dab9a106dce385a7c36a843e61fbbf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dab9a106dce385a7c36a843e61fbbf9");
        } else if (b(str)) {
            try {
                ReportService.report2DaBai(str, (int) (com.meituan.android.time.c.b() / 1000), map);
            } catch (Exception e) {
                x.b("MonitorUtil.reportMonitorAndES()", "reportNormal error,exception msg:", e);
                x.a(e);
            }
        }
    }

    public static void a(String str, Map<String, Object> map, int i, String str2, String str3) {
        Object[] objArr = {str, map, Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "235dc067b2d8f8cbb489b74b562b27b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "235dc067b2d8f8cbb489b74b562b27b6");
        } else {
            a(str, map, i, str2, str3, null);
        }
    }

    public static boolean a(@NonNull int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68a7872ffe021c9e4ff62c7ab7742ff1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68a7872ffe021c9e4ff62c7ab7742ff1")).booleanValue();
        }
        if (com.meituan.android.legwork.monitor.d.a()) {
            return (i & com.meituan.android.legwork.monitor.d.b()) > 0;
        }
        x.b("MonitorUtil.checkMonitorConfigWithFlag()", "Do not report monitor data, msg: clientConfig is null or monitor switch is close");
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean b(@NonNull String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f37b5eaf442f51ffeebfc20d869166fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f37b5eaf442f51ffeebfc20d869166fe")).booleanValue();
        }
        if (!com.meituan.android.legwork.monitor.d.a()) {
            x.b("MonitorUtil.checkMonitorConfig()", "Do not report monitor data, msg: clientConfig is null or monitor switch is close");
            return false;
        }
        switch (str.hashCode()) {
            case -1958183651:
                if (str.equals("legwork_poi_search_status_error")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1943872601:
                if (str.equals("legwork_buy_homepage")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -1847703248:
                if (str.equals("legwork_search_address_info")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1839736131:
                if (str.equals("legwork_map_regeo_city_empty")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1832228302:
                if (str.equals("legwork_buy_order_preview_error_type")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -1814833703:
                if (str.equals("legwork_send_complete_pay")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case -1723015951:
                if (str.equals("legwork_poi_location_search_empty_result")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1666430644:
                if (str.equals("legwork_pay_success")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1468208908:
                if (str.equals("legwork_real_name_authentication_click")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -1370483408:
                if (str.equals("legwork_recharge_pay")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case -1335113623:
                if (str.equals("legwork_get_rider_privacy_phone")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1332986225:
                if (str.equals("legwork_send_submit")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -1308695023:
                if (str.equals("legwork_buy_submit")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1286148406:
                if (str.equals("legwork_submit_check_order_token")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1208537431:
                if (str.equals("legwork_select_coupon")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1201834199:
                if (str.equals("legwork_map_show_error")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1118260175:
                if (str.equals("legwork_send_preview")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1050477682:
                if (str.equals("legwork_address_params_is_null")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1032073004:
                if (str.equals("legwork_map_poi_click_success")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1014259774:
                if (str.equals("legwork_im_not_login")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -983757525:
                if (str.equals("legwork_buy_order_amount_error")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -953968471:
                if (str.equals("legwork_send_order_amount_error")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -917530223:
                if (str.equals("legwork_pay_error")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -890758125:
                if (str.equals("legwork_order_status_inconsistent")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -632211345:
                if (str.equals("legwork_real_name_authentication_success")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -619287928:
                if (str.equals("legwork_pay")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -569702717:
                if (str.equals("legwork_take_photo_size_is_null")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -468622474:
                if (str.equals("legwork_send_recommend_address_not_use")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -420781287:
                if (str.equals("legwork_map_poi_click_error")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -365232913:
                if (str.equals("legwork_buy_preview")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -324925202:
                if (str.equals("legwork_map_poi_choose_top_error")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -278799425:
                if (str.equals("legwork_map_regeo_status_error")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -257023861:
                if (str.equals("legwork_recharge_success")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -115568321:
                if (str.equals("legwork_map_regeo_success")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -76319218:
                if (str.equals("legwork_buy_order_submit_error_type")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -74263311:
                if (str.equals("legwork_poi_search_empty_result")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -4644636:
                if (str.equals("legwork_map_show_success")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 5417528:
                if (str.equals("legwork_map_poi_click_no_operation")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 178327220:
                if (str.equals("legwork_map_poi_click_not_support")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 284544667:
                if (str.equals("legwork_invoice_history_url_error")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 382931042:
                if (str.equals("legwork_send_recommend_address_use")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 482086053:
                if (str.equals("legwork_send_homepage")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 707522158:
                if (str.equals("legwork_select_coupon_submit")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 719346208:
                if (str.equals("legwork_map_show")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 767268188:
                if (str.equals("legwork_platform_error")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 772696400:
                if (str.equals("legwork_send_order_submit_error_type")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 823874939:
                if (str.equals("legwork_map_regeo")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 891311465:
                if (str.equals("legwork_map_poi_choose_top_success")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 985301273:
                if (str.equals("legwork_update_privacy_bind_phone")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1163351003:
                if (str.equals("legwork_buy_complete_pay")) {
                    c = CommonConstant.Symbol.DOT_CHAR;
                    break;
                }
                c = 65535;
                break;
            case 1269603972:
                if (str.equals("legwork_goods_pay_status_inconsistent")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1410469153:
                if (str.equals("legwork_poi_search_success")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1508714512:
                if (str.equals("legwork_recharge_click")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 1526714988:
                if (str.equals("legwork_send_preview_fail")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1569732180:
                if (str.equals("legwork_map_poi_item_error")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1612871200:
                if (str.equals("legwork_channel_is_null")) {
                    c = com.meituan.metrics.common.Constants.SPACE;
                    break;
                }
                c = 65535;
                break;
            case 1613341707:
                if (str.equals("legwork_common")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1641244927:
                if (str.equals("legwork_response_data_illegal")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1694102414:
                if (str.equals("legwork_mt_locate_success")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1861464393:
                if (str.equals("legwork_login")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2039183050:
                if (str.equals("legwork_mt_locate")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2114337121:
                if (str.equals("legwork_parent_fragment_null")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 2135930332:
                if (str.equals("legwork_mt_locate_null")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                if ((com.meituan.android.legwork.monitor.d.b() & 1) == 1) {
                    return true;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                if ((com.meituan.android.legwork.monitor.d.b() & 2) == 2) {
                    return true;
                }
                break;
            case 24:
                if ((com.meituan.android.legwork.monitor.d.b() & 4) == 4) {
                    return true;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
                if ((com.meituan.android.legwork.monitor.d.b() & 8) == 8) {
                    return true;
                }
                break;
            case ')':
            case '*':
                if ((com.meituan.android.legwork.monitor.d.b() & 32) == 32) {
                    return true;
                }
                break;
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
                if ((com.meituan.android.legwork.monitor.d.b() & 64) == 64) {
                    return true;
                }
                break;
            case '7':
            case '8':
            case '9':
                if ((com.meituan.android.legwork.monitor.d.b() & 128) == 128) {
                    return true;
                }
                break;
            case ':':
            case ';':
                if ((com.meituan.android.legwork.monitor.d.b() & 256) == 256) {
                    return true;
                }
                break;
            case '<':
            case '=':
            case '>':
                if ((com.meituan.android.legwork.monitor.d.b() & 512) == 512) {
                    return true;
                }
                break;
        }
        return false;
    }
}
