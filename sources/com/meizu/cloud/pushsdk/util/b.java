package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes3.dex */
public final class b {
    public static String a(Context context, String str) {
        return f(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_pushId");
    }

    public static void a(Context context, int i, String str) {
        a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_pushId_expire_time", i);
    }

    public static void a(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".notification_id", i);
    }

    public static void a(Context context, String str, boolean z) {
        a(context, "mz_push_preference", "switch_notification_message_" + str, z);
    }

    public static int b(Context context, String str) {
        return g(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_pushId_expire_time");
    }

    public static void b(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".notification_push_task_id", i);
    }

    public static void b(Context context, String str, String str2) {
        a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str2 + "_pushId", str);
    }

    public static void b(Context context, String str, boolean z) {
        a(context, "mz_push_preference", "switch_through_message_" + str, z);
    }

    public static void c(Context context, String str, String str2) {
        a(context, "mz_push_preference", "push_alias_" + str, str2);
    }

    public static void c(Context context, String str, boolean z) {
        a(context, "mz_push_preference", str + ".first_request_publicKey", false);
    }

    public static int d(Context context, String str, String str2) {
        return g(context, "mz_push_preference", str + CommonConstant.Symbol.DOT + str2);
    }

    public static void e(Context context, String str, String str2) {
        a(context, "mz_push_preference", str + ".encryption_public_key", str2);
    }

    public static boolean e(Context context, String str) {
        return h(context, "mz_push_preference", "switch_notification_message_" + str);
    }

    public static String f(Context context, String str) {
        return f(context, "mz_push_preference", "push_alias_" + str);
    }

    public static boolean g(Context context, String str) {
        return h(context, "mz_push_preference", "switch_through_message_" + str);
    }

    public static String i(Context context, String str) {
        return f(context, "mz_push_preference", str + ".encryption_public_key");
    }

    public static boolean j(Context context, String str) {
        return h(context, "mz_push_preference", str + ".first_request_publicKey");
    }

    private static void a(Context context, String str, String str2, String str3) {
        context.getSharedPreferences(str, 0).edit().putString(str2, str3).apply();
    }

    private static String f(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static void a(Context context, String str, String str2, int i) {
        context.getSharedPreferences(str, 0).edit().putInt(str2, i).apply();
    }

    private static int g(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getInt(str2, 0);
    }

    private static void a(Context context, String str, String str2, boolean z) {
        context.getSharedPreferences(str, 0).edit().putBoolean(str2, z).apply();
    }

    private static boolean h(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getBoolean(str2, true);
    }

    public static boolean a(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).contains(str2);
    }

    public static int c(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mz_push_preference", 0);
        return sharedPreferences.getInt(str + ".notification_id", 0);
    }

    public static int d(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mz_push_preference", 0);
        return sharedPreferences.getInt(str + ".notification_push_task_id", 0);
    }

    public static int h(Context context, String str) {
        int g = g(context, "mz_push_preference", str + ".message_seq") + 1;
        a(context, "mz_push_preference", str + ".message_seq", g);
        StringBuilder sb = new StringBuilder("current messageSeq ");
        sb.append(g);
        DebugLogger.e("mz_push_preference", sb.toString());
        return g;
    }
}
