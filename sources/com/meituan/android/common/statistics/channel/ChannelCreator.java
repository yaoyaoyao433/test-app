package com.meituan.android.common.statistics.channel;

import android.content.Context;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChannelCreator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static IChannelInterface selectChannel(Context context, ChannelManager channelManager, String str) {
        Object[] objArr = {context, channelManager, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64e897d6c249b95b64648ca212a1d78f", 6917529027641081856L)) {
            return (IChannelInterface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64e897d6c249b95b64648ca212a1d78f");
        }
        if (ConfigManager.getInstance(context).supportMultiProcess() && !ProcessUtils.isMainProcess(context)) {
            return ProcessController.getInstance().selectChannel(context, str, channelManager);
        }
        return new LocalChannel(str, channelManager, context);
    }
}
