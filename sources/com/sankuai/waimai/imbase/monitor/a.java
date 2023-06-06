package com.sankuai.waimai.imbase.monitor;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.HookMethodEntry;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
/* compiled from: ProGuard */
@SkipInstrumentation
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @HookMethodEntry(className = "com.sankuai.xm.im.message.MessageProcessor", methodDesc = "(com.sankuai.xm.im.message.bean.IMMessage,boolean,com.sankuai.xm.im.IMClient$SendMessageCallback)", methodName = "sendMessage")
    public static void a(com.sankuai.xm.im.message.d dVar, IMMessage iMMessage, boolean z, IMClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {dVar, iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e8be7869608371344f51094c903e7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e8be7869608371344f51094c903e7ed");
        } else {
            a(iMMessage, true, 2);
        }
    }

    public static void a(List<IMMessage> list, boolean z, int i) {
        Object[] objArr = {list, (byte) 1, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "516bfb78d03ec79ed37b8a62c731b99f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "516bfb78d03ec79ed37b8a62c731b99f");
        } else if (!com.sankuai.waimai.imbase.utils.a.a(list)) {
            for (IMMessage iMMessage : list) {
                a(iMMessage, true, i);
            }
        }
    }

    public static void a(IMMessage iMMessage, boolean z, int i) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "637615f7bcdfa12073cc010c890bb822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "637615f7bcdfa12073cc010c890bb822");
        } else if (iMMessage == null) {
        } else {
            d.a(iMMessage, z, i);
        }
    }
}
