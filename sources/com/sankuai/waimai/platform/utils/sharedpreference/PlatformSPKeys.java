package com.sankuai.waimai.platform.utils.sharedpreference;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public enum PlatformSPKeys {
    key_bind_phone_kf_phone,
    customer_service_phone,
    food_collect_poi_min_price,
    food_collect_order_min_price_rate,
    food_collect_activity_min_price_rate,
    tab_poi_normal,
    tab_poi_selected,
    tab_order_normal,
    tab_order_selected,
    tab_user_normal,
    tab_user_selected,
    btn_shopping_cart_normal,
    btn_shopping_cart_disabled,
    bg_bottom_tab,
    banner_buttom_pic,
    key_poi_ad_icon_url,
    cat_switch,
    WM_SKYFALL_COUPON_DIALOG,
    WM_ORDER_CONFIRM_LABEL_COUNT,
    key_dynamic_xml,
    OLD_VERSION,
    KEY_MISC_NEW_FUNCTION_REMAIND_ID,
    KEY_HISTORY_LOCATION_ADDRESS,
    KEY_SELECT_LOCATION_ADDRESS,
    ROO_RESOURCES_APP_VERSION,
    KEY_DYNAMIC_HORN_CONFIG,
    SHARK_FAILOVER_PATHS,
    KEY_AI_ENGINE_ENABLE,
    KEY_AI_ENGINE_ENABLE_API_HOME_RCMD,
    KEY_AI_ENGINE_ENABLE_API_POI_HOMEPAGE,
    KEY_AI_ENGINE_ENABLE_API_POI_PRODUCT,
    KEY_INDIVIDUALIZATION_SWITCH_RESET_INTERVAL,
    KEY_UN_USE_INDIVIDUALIZATION_RESET_INTERVAL,
    KEY_CACHED_WEB_VIEW_UA,
    KEY_IS_USE_FAKE_UA,
    KEY_MACH_DOWNLOAD_ENABLE_THREAD_POOL,
    KEY_POILIST_ANIMATION,
    REUSE_FINGERPRINT_URLS,
    SHOPCART_SESSION_CACHE_INTERVAL,
    KEY_ENABLE_PRELOAD,
    KEY_MRN_PRELOAD_BUNDLES,
    KEY_RECORD_ROUTER_PATHS,
    APP_STARTUP_COUNT,
    USER_SUBMIT_ORDER_COUNT,
    USER_PAY_SUCCESS_COUNT,
    ALITA_FEATURE_JS_LIST,
    ALITA_OPERATOR_JS_LIST,
    TOUCH_MATRIX_BUNDLE_LIST,
    KEY_ALITA_SWITCH_ALL,
    KEY_ALITA_SWITCH_MODEL,
    KEY_ALITA_LAST_DATA_DOWNLOAD_TIMESTAMP,
    SHARK_INIT_SWITCH,
    MACH_DELETE_WITH_TIMEOUT,
    MACH_DOWN_V2_ENABLE,
    MACH_DOWN_V2_CHECK_INTERVAL,
    MACH_DOWN_V2_CUSTOM,
    MACH_USE_V8JSE,
    MACH_TEXT_FACE,
    MACH_CODE_CACHE,
    MACH_THREAD_OPT,
    MACH_YOGA_INPUT_STYLE,
    MACH_PRE_RENDER_THREAD_COUNT_OPT,
    MACH_PRE_RENDER_THREAD_POOL_COUNT,
    MACH_EXTRACT_DOWNLOAD_HOMEPAGE_TEMPLATE,
    MACH_MOVE_BUNDLE_FAIL_TIME_LIMIT,
    MACH_MOVE_BUNDLE_FAIL_REBOOT_TIME_LIMIT,
    SEARCH_LIST_MACH_LOAD_TIMEOUT_BASE,
    SEARCH_LIST_MACH_LOAD_TIMEOUT_MULTIPLE,
    KEY_PAGE_SCROLL_FPS,
    KEY_ENABLE_JSON_CACHE_FACTORY,
    KEY_APP_MODEL,
    KEY_DISABLE_REMOVE_VIEW_HIERARCHY_STATE,
    KEY_NETWORK_STRIP_LOCATION_INFO_BLACK_LIST,
    KEY_NETWORK_STRIP_WM_DID_INFO_BLACK_LIST,
    DOVEMON_PAGE_LIST,
    DOVEMON_TIMEOUT_MS,
    MACH_CODELOG_SAMPLING_RATE,
    LOCATE_TIMEOUT_BACKUP_MS,
    WM_PRIVACY_CONFIG,
    WM_PRIVACY_API_WHITE_LIST_SWITCH,
    WM_RISK_API_WHITE_LIST_SWITCH,
    ENABLE_DEEPLINK_BIZ;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static PlatformSPKeys valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00f21f8a7209b693bf809b995918c19e", RobustBitConfig.DEFAULT_VALUE) ? (PlatformSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00f21f8a7209b693bf809b995918c19e") : (PlatformSPKeys) Enum.valueOf(PlatformSPKeys.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PlatformSPKeys[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4adf105075a130ffb6c4d439ac46702", RobustBitConfig.DEFAULT_VALUE) ? (PlatformSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4adf105075a130ffb6c4d439ac46702") : (PlatformSPKeys[]) values().clone();
    }

    PlatformSPKeys() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9148666b78205914e329d6c74328ca33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9148666b78205914e329d6c74328ca33");
        }
    }
}
