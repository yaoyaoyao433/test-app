package com.meituan.robust.assistant;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HostConfig {
    private static final String FILE_NAME_ROBUST_DEVELOPER_CONFIG = "robust_developer_config";
    private static final String KEY_ENABLE_TEST_ENVIRONMENT = "enable_test_environment";
    static String[] PATCH_LIST_BASE_URLS = {"https://api.meituan.com/appupdate/patch/list", "https://apimobile.meituan.com/appupdate/patch/list", "http://api.meituan.com/appupdate/patch/list", "http://apimobile.meituan.com/appupdate/patch/list"};
    private static String PATCH_LIST_BASE_URL = "https://api.meituan.com/appupdate/patch/list";
    public static String PATCH_LIST_TEST_URL = "http://api.wpt.test.sankuai.com/appupdate/patch/list";

    private HostConfig() {
    }

    public static String getPatchListBaseUrl(Context context) {
        if (isTestEnvironment(context)) {
            return PATCH_LIST_TEST_URL;
        }
        return PATCH_LIST_BASE_URL;
    }

    public static String getPatchListBaseUrl(Context context, int i) {
        if (isTestEnvironment(context)) {
            return PATCH_LIST_TEST_URL;
        }
        return PATCH_LIST_BASE_URLS[i % PATCH_LIST_BASE_URLS.length];
    }

    public static boolean isTestEnvironment(Context context) {
        return context.getSharedPreferences(FILE_NAME_ROBUST_DEVELOPER_CONFIG, 0).getBoolean(KEY_ENABLE_TEST_ENVIRONMENT, false);
    }

    public static void switchTestEnvironment(Context context, boolean z) {
        context.getSharedPreferences(FILE_NAME_ROBUST_DEVELOPER_CONFIG, 0).edit().putBoolean(KEY_ENABLE_TEST_ENVIRONMENT, z).apply();
    }
}
