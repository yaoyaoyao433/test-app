package com.sankuai.meituan.takeoutnew.app.launcher;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.ArbiterHook;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.meituan.takeoutnew.base.WmBaseActivity;
import com.sankuai.meituan.takeoutnew.net.api.WmApi;
import com.sankuai.meituan.takeoutnew.net.response.LoadInfoResponse;
import com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity;
import com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity;
import com.sankuai.meituan.takeoutnew.ui.page.boot.report.c;
import com.sankuai.waimai.business.page.home.utils.l;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.launcher.config.a;
import com.sankuai.waimai.launcher.init.core.b;
import com.sankuai.waimai.launcher.init.d;
import com.sankuai.waimai.platform.capacity.abtest.ABTestExpStrategyResponse;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.config.ILoadConfig;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.mach.config.a;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.share.b;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    @MainThread
    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "485e724a935b4cd400bd502012da1eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "485e724a935b4cd400bd502012da1eec");
        } else if (b) {
        } else {
            b = true;
            com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
            C0648a c0648a = new C0648a();
            Object[] objArr2 = {c0648a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.config.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "bfeed548be99744785b37df8fd290bfa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "bfeed548be99744785b37df8fd290bfa");
            } else {
                com.sankuai.waimai.launcher.config.a.a().b = c0648a;
            }
            d.a(application);
            if (b.a(application)) {
                String d = com.sankuai.waimai.platform.capacity.deeplink.b.d();
                if (d != null && WaimaiSP.f() && com.sankuai.waimai.platform.capacity.deeplink.a.a(Uri.parse(d), com.sankuai.meituan.takeoutnew.a.d)) {
                    com.sankuai.waimai.platform.capacity.deeplink.b.a(com.sankuai.waimai.platform.capacity.deeplink.a.a(Uri.parse(d)));
                }
                com.sankuai.waimai.platform.capacity.deeplink.b.b("t0");
                if (WaimaiSP.f()) {
                    try {
                        ArbiterHook.addMTInstrumentation(new com.sankuai.waimai.shell.deeplink.a());
                        return;
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.b(e);
                        return;
                    }
                }
                return;
            }
            com.sankuai.waimai.platform.capacity.deeplink.b.a("no_main");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.takeoutnew.app.launcher.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0648a implements a.InterfaceC0986a {
        public static ChangeQuickRedirect a;

        public C0648a() {
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final boolean a(Activity activity) {
            return activity instanceof WmBaseActivity;
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final boolean b(Activity activity) {
            return activity instanceof WelcomeActivity;
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final boolean a(Class<? extends Activity> cls) {
            return cls == WelcomeActivity.class;
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final boolean c(Activity activity) {
            return activity instanceof SplashAdActivity;
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final boolean b(Class<? extends Activity> cls) {
            return cls == SplashAdActivity.class;
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final void a(Application application) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa32b92f14e185ee41ec4570576a09f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa32b92f14e185ee41ec4570576a09f");
                return;
            }
            c a2 = c.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "99176d757acd45dac612461c36345400", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "99176d757acd45dac612461c36345400");
            } else {
                a2.c = 0;
                a2.b = 0L;
                a2.d = false;
            }
            com.sankuai.meituan.takeoutnew.ui.page.boot.a.a().e();
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final i a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4af1df414f5e88909b700941a60eea", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4af1df414f5e88909b700941a60eea") : new com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.b();
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final b.a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463d57b6c5fa27164a688f2fccbbbaa1", RobustBitConfig.DEFAULT_VALUE) ? (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463d57b6c5fa27164a688f2fccbbbaa1") : new com.sankuai.meituan.takeoutnew.manager.share.a();
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final void a(Context context, String str, String str2, String str3, int i, JSONObject jSONObject) {
            Object[] objArr = {context, str, str2, str3, Integer.valueOf(i), jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d79162a437786c3a50bc5adc6c814dad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d79162a437786c3a50bc5adc6c814dad");
            } else {
                com.sankuai.meituan.takeoutnew.manager.receiver.a.a(context, str, str2, str3, i, jSONObject);
            }
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final void a(long j, long j2) {
            Object[] objArr = {new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3f8b81b3f136515bebde95b7ffb579", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3f8b81b3f136515bebde95b7ffb579");
                return;
            }
            Object[] objArr2 = {new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "10017f4dc191b8caca5e62f0f74d1e1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "10017f4dc191b8caca5e62f0f74d1e1c");
                return;
            }
            Object[] objArr3 = {new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2deb0bd6cdc0491188a60f48b3871fb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2deb0bd6cdc0491188a60f48b3871fb6");
                return;
            }
            Object[] objArr4 = {new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f1d0e2dcfe40f905c2c5b18e7e3d5ff0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f1d0e2dcfe40f905c2c5b18e7e3d5ff0");
            } else {
                WMLocation p = g.a().p();
                WMLocation i = g.a().i();
                int i2 = 17000;
                if (j > 0 && j2 > 0) {
                    i2 = 17100;
                }
                if (p != null && p.getLatitude() > 0.0d && p.getLongitude() > 0.0d) {
                    i2 += 10;
                }
                if (i != null && i.getLatitude() > 0.0d && i.getLongitude() > 0.0d) {
                    i2++;
                }
                com.sankuai.waimai.platform.capacity.log.c.a().a(i2, 0, "waimai_loadinfo_param_location");
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmApi.class)).getLoadInfo(com.sankuai.waimai.platform.b.A().k(), com.sankuai.waimai.platform.b.A().l(), com.sankuai.waimai.platform.b.A().m(), j, j2, com.sankuai.waimai.platform.b.A().J(), l.a()), new b.AbstractC1042b<BaseResponse<LoadInfoResponse>>() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.8
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr5 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ae7effc0ea38e595f7bae3f400e45384", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ae7effc0ea38e595f7bae3f400e45384");
                    } else if (baseResponse != null && baseResponse.code == 0) {
                        LoadInfoResponse loadInfoResponse = (LoadInfoResponse) baseResponse.data;
                        Object[] objArr6 = {loadInfoResponse};
                        ChangeQuickRedirect changeQuickRedirect6 = a.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "3b5265df2ede00921f9bf0d67c4a1545", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "3b5265df2ede00921f9bf0d67c4a1545");
                            return;
                        }
                        Context context = com.meituan.android.singleton.b.a;
                        Object[] objArr7 = {context, loadInfoResponse};
                        ChangeQuickRedirect changeQuickRedirect7 = a.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "57b875b7f4be63661bb1efd0706e0174", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "57b875b7f4be63661bb1efd0706e0174");
                        } else if (loadInfoResponse != null) {
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "image_quality", loadInfoResponse.g);
                            if (!TextUtils.isEmpty(loadInfoResponse.i)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "domain", loadInfoResponse.i);
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "tip_refresh_time", loadInfoResponse.j);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "last_order_refresh_time", loadInfoResponse.I);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "last_order_refresh_time_with_shark_push", loadInfoResponse.J);
                            if (!TextUtils.isEmpty(loadInfoResponse.k)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "search_address_codes", loadInfoResponse.k);
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "search_address_per_num", loadInfoResponse.l);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "search_address_radius", loadInfoResponse.m);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "search_address_sort", loadInfoResponse.n);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "suggest_type", loadInfoResponse.o);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "order_address_check_distance", loadInfoResponse.p);
                            h.a(loadInfoResponse.p);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "food_collect_poi_min_price_v2", loadInfoResponse.q);
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.food_collect_poi_min_price, loadInfoResponse.q);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "food_collect_order_min_price_rate_v2", loadInfoResponse.r);
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.food_collect_order_min_price_rate, loadInfoResponse.r);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "food_collect_activity_min_price_rate_v2", loadInfoResponse.aa);
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.food_collect_activity_min_price_rate, loadInfoResponse.aa);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "order_max_shipping_time", loadInfoResponse.s);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "search_address_select_distance_diff", loadInfoResponse.t);
                            if (loadInfoResponse.e > 0) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "image_quality_default", loadInfoResponse.e);
                            }
                            if (loadInfoResponse.d > 0) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "image_quality_basic", loadInfoResponse.d);
                            }
                            if (loadInfoResponse.c > 0) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "image_quality_operation", loadInfoResponse.c);
                            }
                            ImageQualityUtil.a(loadInfoResponse.e, loadInfoResponse.d, loadInfoResponse.c);
                            if (!TextUtils.isEmpty(loadInfoResponse.u)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "customer_service_phone", loadInfoResponse.u);
                                com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.customer_service_phone, loadInfoResponse.u);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.v)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "feedback_faq_link", loadInfoResponse.v);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.w)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "coupon_help_url", loadInfoResponse.w);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.y)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "share_content", loadInfoResponse.y);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.z)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "share_icon", loadInfoResponse.z);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.A)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "title", loadInfoResponse.A);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.B)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "share_url", loadInfoResponse.B);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.C)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "share_channels", loadInfoResponse.C);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.D)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "pref_portal", loadInfoResponse.D);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.F)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "pref_title", loadInfoResponse.F);
                            }
                            if (!TextUtils.isEmpty(loadInfoResponse.E)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "pref_url", loadInfoResponse.E);
                            }
                            if (loadInfoResponse.x == null || StringUtil.NULL.equalsIgnoreCase(loadInfoResponse.x)) {
                                loadInfoResponse.x = "";
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "service_robot_url", loadInfoResponse.x);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "pref_show", loadInfoResponse.G);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "welcome_ad_report_period", loadInfoResponse.K);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "is_show_phone_for_login", loadInfoResponse.L);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "is_show_phone_for_validate", loadInfoResponse.M);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "manually_query_phone_num", loadInfoResponse.N);
                            if (!TextUtils.isEmpty(loadInfoResponse.h)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "customer_service_time", loadInfoResponse.h);
                            }
                            if (loadInfoResponse.Q > 0) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "home_locate_refresh_duration", loadInfoResponse.Q * 60 * 1000);
                            }
                            if (loadInfoResponse.R > 0) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "poi_list_refresh_duration", loadInfoResponse.R * 60 * 1000);
                            }
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.cat_switch, loadInfoResponse.f);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "key_bind_phone_kf_phone", loadInfoResponse.S);
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.key_bind_phone_kf_phone, loadInfoResponse.S);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "vip_icon", loadInfoResponse.T);
                            if (!TextUtils.isEmpty(loadInfoResponse.U)) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "search_easter_egg_pic_json_str", loadInfoResponse.U);
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "poi_ad_icon_url", loadInfoResponse.V);
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.key_poi_ad_icon_url, loadInfoResponse.V);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ad_banner_icon", loadInfoResponse.W);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "hertz_switch", loadInfoResponse.X);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "is_search_entrance_show_keyboard", loadInfoResponse.Y);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "httpdns_switch", loadInfoResponse.Z);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "message_center_switch", loadInfoResponse.ab);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "suggest_filter_poi_type", loadInfoResponse.ac);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "upgrade_image_url", loadInfoResponse.ad);
                            if (loadInfoResponse.ae != null) {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "channel_search_highlight_info", loadInfoResponse.ae.defaultSearchWords);
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "channel_search_highlight_channels", loadInfoResponse.ae.channels);
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "sniffer_switch", loadInfoResponse.af == 1);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "screenshot_service_feedback_url", loadInfoResponse.ag);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "support_privacy_popup", loadInfoResponse.ah);
                            if (loadInfoResponse.ak != -1) {
                                com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.KEY_INDIVIDUALIZATION_SWITCH_RESET_INTERVAL, loadInfoResponse.ak);
                            }
                            if (loadInfoResponse.al != -1) {
                                com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.KEY_UN_USE_INDIVIDUALIZATION_RESET_INTERVAL, loadInfoResponse.al);
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "im_link_switch", loadInfoResponse.ai);
                            com.sankuai.waimai.imbase.manager.b.a().b(loadInfoResponse.ai == 1);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "app_embedded_h5_with_region_info", loadInfoResponse.aj);
                        }
                        List<ILoadConfig> a2 = com.sankuai.waimai.router.a.a(ILoadConfig.class);
                        if (loadInfoResponse == null || loadInfoResponse.b == null) {
                            return;
                        }
                        JSONObject jSONObject = loadInfoResponse.b;
                        for (ILoadConfig iLoadConfig : a2) {
                            if (iLoadConfig != null) {
                                iLoadConfig.loadConfig(com.meituan.android.singleton.b.a, jSONObject);
                            }
                        }
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.9
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 401
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.app.config.a.AnonymousClass9.run():void");
                }
            }, 5000, (String) null);
        }

        @Override // com.sankuai.waimai.launcher.config.a.InterfaceC0986a
        public final void c() {
            Map hashMap;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b89746cc43393d94f48fb02c5016479", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b89746cc43393d94f48fb02c5016479");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "21a442cf89eb60f17bfd158703648e5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "21a442cf89eb60f17bfd158703648e5d");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9c1ff987b85ee5bff3168246004f608e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9c1ff987b85ee5bff3168246004f608e");
            } else {
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmApi.class)).getABTestStrategy(com.sankuai.meituan.takeoutnew.app.config.a.a()), new b.AbstractC1042b<BaseResponse<ABTestExpStrategyResponse>>() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.10
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr4 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a12d16c0647370e1304d52024555eb38", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a12d16c0647370e1304d52024555eb38");
                        } else if (baseResponse == null || !baseResponse.isSuccess()) {
                            a();
                        } else {
                            ABTestManager.getInstance(com.meituan.android.singleton.b.a).onUpdateStrategiesSuccess((ABTestExpStrategyResponse) baseResponse.data);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4aa51116a49d03adf4e6661ad9441678", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4aa51116a49d03adf4e6661ad9441678");
                        } else {
                            a();
                        }
                    }

                    private void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f3197194015d0c3c0c4d24509c1eb6e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f3197194015d0c3c0c4d24509c1eb6e1");
                        } else {
                            ABTestManager.getInstance(com.meituan.android.singleton.b.a).onUpdateStrategiesFailed();
                        }
                    }
                }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "026f810527037ebdc1a3e83758b7e7b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "026f810527037ebdc1a3e83758b7e7b3");
            } else {
                Horn.debug(com.meituan.android.singleton.b.a, "remote_config", com.sankuai.meituan.takeoutnew.a.f);
                HornCallback hornCallback = new HornCallback() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        List<RemoteConfigCallback> a2;
                        Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cc8b9a507e81cba045543abefe599f59", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cc8b9a507e81cba045543abefe599f59");
                        } else if (z && !TextUtils.isEmpty(str) && (a2 = com.sankuai.waimai.router.a.a(RemoteConfigCallback.class)) != null) {
                            com.sankuai.waimai.platform.config.horn.c cVar = new com.sankuai.waimai.platform.config.horn.c((Map) k.a().fromJson(str, (Type) Map.class));
                            for (RemoteConfigCallback remoteConfigCallback : a2) {
                                try {
                                    remoteConfigCallback.onChanged(cVar);
                                } catch (Exception e) {
                                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                                }
                            }
                        }
                    }
                };
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.takeoutnew.app.config.a.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "45c4944f703aebcf32a13215898a3649", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (Map) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "45c4944f703aebcf32a13215898a3649");
                } else {
                    hashMap = new HashMap();
                    hashMap.put("uid", com.sankuai.waimai.platform.b.A().B());
                    hashMap.put(GetAppInfoJsHandler.PACKAGE_TYPE_DEV, Integer.valueOf(com.sankuai.meituan.takeoutnew.a.f ? 1 : 0));
                    hashMap.put(Constants.Environment.KEY_DM, Build.MODEL);
                    hashMap.put("mf", Build.MANUFACTURER);
                    hashMap.put("prd", Build.PRODUCT);
                    hashMap.put("db", Build.BRAND);
                    hashMap.put("osv", Integer.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("avc", Integer.valueOf(com.sankuai.meituan.takeoutnew.a.c));
                    City m = g.a().m();
                    hashMap.put("cnm", m == null ? CommonConstant.Symbol.MINUS : m.getCityName());
                    hashMap.put("ccd", m == null ? CommonConstant.Symbol.MINUS : m.getCityCode());
                }
                Map map = hashMap;
                try {
                    map.put("abi", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS[0] : Build.CPU_ABI);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
                Horn.register("remote_config", hornCallback, map);
                Horn.debug(com.meituan.android.singleton.b.a, "waimai_market_config_android", com.sankuai.meituan.takeoutnew.a.f);
                Horn.register("waimai_market_config_android", new HornCallback() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a513799cbfb2a681076831f58b5237a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a513799cbfb2a681076831f58b5237a5");
                            return;
                        }
                        com.sankuai.waimai.platform.config.horn.d dVar = (com.sankuai.waimai.platform.config.horn.d) k.a().fromJson(str, (Class<Object>) com.sankuai.waimai.platform.config.horn.d.class);
                        com.sankuai.waimai.machpro.d.a().a((Application) com.meituan.android.singleton.b.a.getApplicationContext());
                        com.sankuai.waimai.machpro.d a2 = com.sankuai.waimai.machpro.d.a();
                        Map<String, Object> map2 = (Map) k.a().fromJson(str, (Class<Object>) Map.class);
                        Object[] objArr7 = {map2};
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.machpro.d.a;
                        if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "931c8e14c41a9d9f5a4bbc2973a2878b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "931c8e14c41a9d9f5a4bbc2973a2878b");
                        } else {
                            if (map2 != null) {
                                a2.b = map2;
                            }
                            boolean d = com.sankuai.waimai.machpro.util.b.d(map2.get("mach_pro_use_swiper_v2"));
                            Object[] objArr8 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.machpro.d.a;
                            if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "b8061d4d70dd019542d45a9705fa96e4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "b8061d4d70dd019542d45a9705fa96e4");
                            } else {
                                com.sankuai.waimai.mach.l.b(a2.d, "mach_pro", "useSwiperV2", d);
                            }
                            com.sankuai.waimai.machpro.util.a.a("Mach Pro Horn Config | " + map2.toString());
                        }
                        if (dVar == null) {
                            return;
                        }
                        boolean z2 = dVar.e;
                        Object[] objArr9 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.platform.mach.config.a.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "d86fe8eb6e77deec2001e15deaaea851", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "d86fe8eb6e77deec2001e15deaaea851");
                        } else {
                            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) a.EnumC1054a.JS_EXECUTOR_REUSE, z2);
                        }
                        com.sankuai.waimai.platform.mach.config.b a3 = com.sankuai.waimai.platform.mach.config.b.a();
                        a3.b = dVar.k;
                        a3.c = dVar.l;
                        com.sankuai.waimai.platform.utils.sharedpreference.a.a(dVar.r);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.b(dVar.u);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.c(dVar.v);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.b(dVar.C);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.c(dVar.D);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.d(dVar.E);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.e(dVar.F);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.f(dVar.G);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.a(dVar.H);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.g(dVar.I);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.b(dVar.J);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.c(dVar.K);
                        com.sankuai.waimai.platform.utils.sharedpreference.a.d(dVar.L);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "mach_pro_switch", dVar.w);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "mach_text_measure_device_type", dVar.x);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "mach_text_measure", dVar.y);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "rich_text_measure", dVar.z);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "free_data_memory", dVar.A);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "skip_js_process", dVar.B);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "mach_zip_download_template", dVar.M);
                    }
                }, map);
                Horn.debug(com.meituan.android.singleton.b.a, "network_privacy_config", com.sankuai.meituan.takeoutnew.a.f);
                Horn.register("network_privacy_config", new HornCallback() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5fd647fe7cd482ea6445a3f237eb7b69", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5fd647fe7cd482ea6445a3f237eb7b69");
                        } else if (!z || TextUtils.isEmpty(str)) {
                        } else {
                            com.sankuai.waimai.platform.config.horn.a aVar = (com.sankuai.waimai.platform.config.horn.a) k.a().fromJson(str, (Class<Object>) com.sankuai.waimai.platform.config.horn.a.class);
                            com.sankuai.waimai.platform.net.util.a a2 = com.sankuai.waimai.platform.net.util.a.a();
                            Object[] objArr7 = {aVar, str};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.platform.net.util.a.a;
                            if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "9f9301a8effc4f1b15e833e3f43c59f6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "9f9301a8effc4f1b15e833e3f43c59f6");
                                return;
                            }
                            a2.b = aVar;
                            com.sankuai.waimai.platform.utils.sharedpreference.a.e(str);
                        }
                    }
                }, map);
                Horn.debug(com.meituan.android.singleton.b.a, "network_risk_config", com.sankuai.meituan.takeoutnew.a.f);
                Horn.register("network_risk_config", new HornCallback() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b99bd6859b84860745a4d41cac89ddb3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b99bd6859b84860745a4d41cac89ddb3");
                        } else if (!z || TextUtils.isEmpty(str)) {
                        } else {
                            com.sankuai.waimai.platform.config.horn.b bVar = (com.sankuai.waimai.platform.config.horn.b) k.a().fromJson(str, (Class<Object>) com.sankuai.waimai.platform.config.horn.b.class);
                            com.sankuai.waimai.platform.encrypt.a a2 = com.sankuai.waimai.platform.encrypt.a.a();
                            Object[] objArr7 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.platform.encrypt.a.a;
                            if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "54665488de36000a59ee8759ded501ee", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "54665488de36000a59ee8759ded501ee");
                            } else if (bVar == null || com.sankuai.waimai.foundation.utils.b.b(bVar.a)) {
                            } else {
                                com.sankuai.waimai.platform.utils.sharedpreference.a.f(k.a().toJson(bVar.a));
                                a2.b = bVar.a;
                            }
                        }
                    }
                }, map);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.takeoutnew.app.config.a.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "fd860400174a180869f92933bd80ba92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "fd860400174a180869f92933bd80ba92");
            } else {
                Horn.register("sm_newuser_outlink_config", new HornCallback() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.4
                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                    }
                });
            }
        }
    }
}
