package com.meituan.android.paybase.utils;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"SF_SWITCH_NO_DEFAULT", "SF_SWITCH_FALLTHROUGH"})
    @Deprecated
    public static void a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61a24235300f0d33c735394cbeaa25da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61a24235300f0d33c735394cbeaa25da");
        } else if (strArr.length == 0) {
        } else {
            EventInfo eventInfo = new EventInfo();
            eventInfo.nm = EventName.MGE;
            eventInfo.val_bid = "b_zaxog";
            HashMap hashMap = new HashMap();
            switch (strArr.length) {
                case 4:
                    hashMap.put(Constants.TagConstants.TAG_VALUE, strArr[3]);
                case 3:
                    hashMap.put("lab", strArr[2]);
                case 2:
                    eventInfo.val_act = strArr[1];
                case 1:
                    eventInfo.val_cid = strArr[0];
                    break;
            }
            eventInfo.val_lab = hashMap;
            a(eventInfo, Constants.EventType.PAY);
        }
    }

    @MTPaySuppressFBWarnings({"DE_MIGHT_IGNORE"})
    private static void a(EventInfo eventInfo, String str) {
        Channel channel;
        Object[] objArr = {eventInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a27d49861a2b11aa5237f203129d59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a27d49861a2b11aa5237f203129d59e");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                channel = Statistics.getChannel(Constants.EventType.PAY);
            } else {
                channel = Statistics.getChannel(str);
            }
            channel.writeEvent((String) null, eventInfo);
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MgeUtils_report").a("message", e.getMessage()).b);
        }
    }
}
