package com.dianping.meizupush;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MZPushReceiver extends MzPushMessageReceiver {
    public static ChangeQuickRedirect a;

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    @Deprecated
    public void onRegister(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8f04ca27f9d06ae2b34980099e2d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8f04ca27f9d06ae2b34980099e2d9d");
            return;
        }
        a.a("onRegister:" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMessage(android.content.Context r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.meizupush.MZPushReceiver.onMessage(android.content.Context, java.lang.String):void");
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onMessage(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00308c0a18a310931130bc18dcddfa57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00308c0a18a310931130bc18dcddfa57");
            return;
        }
        a.a("flyme3 onMessage intent content =" + intent.getExtras().toString());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    @Deprecated
    public void onUnRegister(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "192244707c337551fea780d021979b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "192244707c337551fea780d021979b69");
            return;
        }
        a.a("onUnRegister " + z);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus) {
        Object[] objArr = {context, pushSwitchStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d359a33c1e846119dce56260b119406c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d359a33c1e846119dce56260b119406c");
            return;
        }
        a.a("onPushStatus：" + pushSwitchStatus.toString());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onRegisterStatus(Context context, RegisterStatus registerStatus) {
        Object[] objArr = {context, registerStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a273792810d2b3fc0e2375f0e52ec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a273792810d2b3fc0e2375f0e52ec1");
            return;
        }
        a.a("onRegisterStatus " + registerStatus + StringUtil.SPACE + context.getPackageName());
        String pushId = registerStatus.getPushId();
        if (TextUtils.isEmpty(pushId)) {
            a.a("MZ pushID is null, return");
            return;
        }
        a.a("MZ pushID received: " + pushId);
        n.a(context, 6, pushId);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus) {
        Object[] objArr = {context, unRegisterStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0be3520a36504eb24dcfc41a8abd39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0be3520a36504eb24dcfc41a8abd39");
            return;
        }
        a.a("onUnRegisterStatus " + unRegisterStatus + StringUtil.SPACE + context.getPackageName());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus) {
        Object[] objArr = {context, subTagsStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe67f60dc93dcc70615e35a2ddb4eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe67f60dc93dcc70615e35a2ddb4eec");
            return;
        }
        a.a("onSubTagsStatus " + subTagsStatus + StringUtil.SPACE + context.getPackageName());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus) {
        Object[] objArr = {context, subAliasStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee00fb5d701221f0ee3fb3f87069fcc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee00fb5d701221f0ee3fb3f87069fcc7");
            return;
        }
        a.a("onSubAliasStatus " + subAliasStatus + StringUtil.SPACE + context.getPackageName());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUpdateNotificationBuilder(PushNotificationBuilder pushNotificationBuilder) {
        Object[] objArr = {pushNotificationBuilder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42450ddf4d30cd4cd43cb35546b511de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42450ddf4d30cd4cd43cb35546b511de");
            return;
        }
        pushNotificationBuilder.setLargeIcon(f.e.f());
        pushNotificationBuilder.setStatusBarIcon(f.e.g());
    }
}
