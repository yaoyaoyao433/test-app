package com.meituan.android.common.channel;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.meituan.android.walle.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.preloaded.channel.a;
import java.io.File;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ChannelReader {
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_SUB_CHANNEL = "mtsubchannel";
    private static final String OLD_KEY_CHANNEL = "mtchannel";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile Map<String, String> channelMap = null;
    private static boolean isChannelMapInited = false;

    private static String getChannelKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c72e0cb18b75073a07a0561e5f3f432", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c72e0cb18b75073a07a0561e5f3f432") : TextUtils.equals(str, OLD_KEY_CHANNEL) ? "channel" : str;
    }

    @Deprecated
    public static String getMETAInfoChannel(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb84c6f32c162840fd8a9d551ec50fc5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb84c6f32c162840fd8a9d551ec50fc5") : getChannelInfo(context, str);
    }

    @Deprecated
    public static String getMETAInfo(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1a25dd660bf536c277607bc913f0d53", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1a25dd660bf536c277607bc913f0d53") : getChannelInfo(context, str);
    }

    public static String getChannelInfo(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fe327e27850d021e5e8e35256965612", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fe327e27850d021e5e8e35256965612");
        }
        if (isChannelMapInited) {
            if (channelMap == null) {
                return null;
            }
            return channelMap.get(getChannelKey(str));
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            channelMap = e.a(new File(applicationInfo.sourceDir));
            isChannelMapInited = true;
            if (channelMap == null) {
                return null;
            }
            return channelMap.get(getChannelKey(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSystemEtcChannel(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a508c52f739befab56d0d7831958d25", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a508c52f739befab56d0d7831958d25") : a.a();
    }

    public static String getChannel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "703145f288d34e6d003a08a237c5e20c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "703145f288d34e6d003a08a237c5e20c") : getChannelInfo(context, "channel");
    }

    public static String getSubChannel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53a96bc0e3b168b96a7777f3a13c1634", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53a96bc0e3b168b96a7777f3a13c1634") : getChannelInfo(context, KEY_SUB_CHANNEL);
    }
}
