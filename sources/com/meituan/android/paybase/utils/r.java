package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9538898fadf5e3457027b83e9a89711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9538898fadf5e3457027b83e9a89711");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.android.paybase.common.analyse.a.d("action is null", "LocalBroadCastUtil_sendBroadCast", null);
        } else {
            if (activity instanceof PayBaseActivity) {
                PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
                if (!TextUtils.isEmpty(payBaseActivity.p())) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(activity);
                    localBroadcastManager.sendBroadcast(new Intent(str + CommonConstant.Symbol.DOT + payBaseActivity.p()));
                    return;
                }
            }
            LocalBroadcastManager.getInstance(com.meituan.android.paybase.config.a.d().a()).sendBroadcast(new Intent(str));
        }
    }

    public static void a(Activity activity, String str, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {activity, str, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bf44ecbe3eb381b4447b1614a41c704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bf44ecbe3eb381b4447b1614a41c704");
            return;
        }
        IntentFilter intentFilter = new IntentFilter(str);
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            if (!TextUtils.isEmpty(payBaseActivity.p())) {
                intentFilter.addAction(str + CommonConstant.Symbol.DOT + payBaseActivity.p());
            }
        }
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(com.meituan.android.paybase.config.a.d().a()).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void a(Activity activity, String[] strArr, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {activity, strArr, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fb3d9574490b17c5ef2bb5d0cd80ea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fb3d9574490b17c5ef2bb5d0cd80ea2");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            intentFilter.addAction(str);
            if (activity instanceof PayBaseActivity) {
                PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
                if (!TextUtils.isEmpty(payBaseActivity.p())) {
                    intentFilter.addAction(str + CommonConstant.Symbol.DOT + payBaseActivity.p());
                }
            }
        }
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(com.meituan.android.paybase.config.a.d().a()).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static String b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d24acd78bfebc872dc5679faa3645a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d24acd78bfebc872dc5679faa3645a1");
        }
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            if (!TextUtils.isEmpty(payBaseActivity.p())) {
                return str + CommonConstant.Symbol.DOT + payBaseActivity.p();
            }
        }
        return str;
    }

    public static boolean a(Activity activity, String str, Intent intent) {
        Object[] objArr = {activity, str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb902cd53a653f7b8223f910f4f8252d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb902cd53a653f7b8223f910f4f8252d")).booleanValue() : b(activity, str).equals(intent.getAction()) || str.equals(intent.getAction());
    }
}
