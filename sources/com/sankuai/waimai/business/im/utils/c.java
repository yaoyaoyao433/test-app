package com.sankuai.waimai.business.im.utils;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.session.SessionActivity;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    private static boolean c(int i) {
        return 101 == i;
    }

    private static boolean d(int i) {
        return 2 == i;
    }

    private static boolean e(int i) {
        return 1 == i;
    }

    private static boolean f(int i) {
        return 301 == i;
    }

    private static boolean g(int i) {
        return 201 == i;
    }

    public static int a(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dbb30f098266f1412dfcf21ae08c8d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dbb30f098266f1412dfcf21ae08c8d1")).intValue();
        }
        if (iMMessage.getChannel() == 1025) {
            return 3;
        }
        return b(iMMessage) ? 2 : 1;
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25eb2b910a23b689df6f54c7a20bb53c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25eb2b910a23b689df6f54c7a20bb53c")).intValue();
        }
        if (e(i)) {
            return 0;
        }
        if (d(i)) {
            return 1;
        }
        if (c(i)) {
            return 3;
        }
        if (f(i)) {
            return 4;
        }
        return g(i) ? 5 : 2;
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2462c0f940b871f098e5c9c2b7e2ba14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2462c0f940b871f098e5c9c2b7e2ba14")).intValue();
        }
        if (d(i)) {
            return 0;
        }
        return e(i) ? 1 : 2;
    }

    private static boolean b(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab4cda507fe26e0d7fd03e105c02bacb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab4cda507fe26e0d7fd03e105c02bacb")).booleanValue() : iMMessage != null && iMMessage.getPeerAppId() == 0;
    }

    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c100c84155e8dd370b2b1908a8fa634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c100c84155e8dd370b2b1908a8fa634");
        } else {
            Weaver.getExtension().addCustomTags(SessionActivity.class.getCanonicalName(), null, map);
        }
    }
}
