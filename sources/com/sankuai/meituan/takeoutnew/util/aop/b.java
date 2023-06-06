package com.sankuai.meituan.takeoutnew.util.aop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.model.AppInfo;
import com.sankuai.waimai.manipulator.annotation.CallSiteReplacement;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @CallSiteReplacement(targetClass = "android.content.Context")
    public static void a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfad082646ad24fa60ca00671d29742f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfad082646ad24fa60ca00671d29742f");
            return;
        }
        try {
            AppInfo.onSendBroadcast(intent.getAction());
            context.sendBroadcast(intent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @CallSiteReplacement(targetClass = "android.content.Context")
    public static void a(Context context, Intent intent, String str) {
        Object[] objArr = {context, intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fd0d251b5a2017abfa07905773987d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fd0d251b5a2017abfa07905773987d8");
            return;
        }
        try {
            AppInfo.onSendBroadcast(intent.getAction());
            context.sendBroadcast(intent, str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @CallSiteReplacement(targetClass = "android.content.Context")
    public static void a(Context context, Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        Object[] objArr = {context, intent, null, broadcastReceiver, null, -1, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1be9c6cb7f09ecc358eba6785c5e9373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1be9c6cb7f09ecc358eba6785c5e9373");
            return;
        }
        try {
            AppInfo.onSendBroadcast(intent.getAction());
            context.sendOrderedBroadcast(intent, null, broadcastReceiver, null, -1, null, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
