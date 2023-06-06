package com.meituan.android.quickpass.uptsm.common.utils;

import android.os.Build;
import android.support.v4.util.ArrayMap;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayMap arrayMap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af2646c2edb5268f295978c48a87b1ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af2646c2edb5268f295978c48a87b1ab");
            return;
        }
        if (obj != null) {
            arrayMap = new ArrayMap();
            arrayMap.put("Status", obj);
            arrayMap.put("HWWalletVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.huawei.wallet"));
            arrayMap.put("TSMVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.unionpay.tsmservice"));
            arrayMap.put("ROMVersion", Build.DISPLAY);
        }
        Statistics.getChannel(IjkMediaPlayer.OnNativeInvokeListener.ARG_FD).writeModelClick("", str, arrayMap, str2);
    }

    public static void a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2674f873579c9213e75837e48c9c234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2674f873579c9213e75837e48c9c234");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("Time", Long.valueOf(j));
        arrayMap.put("HWWalletVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.huawei.wallet"));
        arrayMap.put("TSMVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.unionpay.tsmservice"));
        arrayMap.put("ROMVersion", Build.DISPLAY);
        Statistics.getChannel(IjkMediaPlayer.OnNativeInvokeListener.ARG_FD).writeModelClick("", str, arrayMap, str2);
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dad5fe924614d9c511d59f9c0e8cdfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dad5fe924614d9c511d59f9c0e8cdfc");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("Status", Boolean.FALSE);
        arrayMap.put("Method", str3);
        arrayMap.put("ErrorCode", str4);
        arrayMap.put("ErrorMsg", str5);
        arrayMap.put("HWWalletVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.huawei.wallet"));
        arrayMap.put("TSMVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.unionpay.tsmservice"));
        arrayMap.put("ROMVersion", Build.DISPLAY);
        Statistics.getChannel(IjkMediaPlayer.OnNativeInvokeListener.ARG_FD).writeModelClick("", str, arrayMap, str2);
    }

    public static void a(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb2f626c334c8e63df0d13d2f353e6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb2f626c334c8e63df0d13d2f353e6cb");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("Status", Boolean.FALSE);
        arrayMap.put("Method", str3);
        arrayMap.put("ErrorCode", Integer.valueOf(i));
        arrayMap.put("HWWalletVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.huawei.wallet"));
        arrayMap.put("TSMVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.unionpay.tsmservice"));
        arrayMap.put("ROMVersion", Build.DISPLAY);
        Statistics.getChannel(IjkMediaPlayer.OnNativeInvokeListener.ARG_FD).writeModelClick("", str, arrayMap, str2);
    }
}
