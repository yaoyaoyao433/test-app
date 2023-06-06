package com.xiaomi.push;

import android.text.TextUtils;
import com.meituan.uuid.GetUUID;
/* loaded from: classes6.dex */
public enum ep {
    COMMAND_REGISTER(GetUUID.REGISTER),
    COMMAND_UNREGISTER("unregister"),
    COMMAND_SET_ALIAS("set-alias"),
    COMMAND_UNSET_ALIAS("unset-alias"),
    COMMAND_SET_ACCOUNT("set-account"),
    COMMAND_UNSET_ACCOUNT("unset-account"),
    COMMAND_SUBSCRIBE_TOPIC("subscribe-topic"),
    COMMAND_UNSUBSCRIBE_TOPIC("unsubscibe-topic"),
    COMMAND_SET_ACCEPT_TIME("accept-time"),
    COMMAND_CHK_VDEVID("check-vdeviceid");
    
    public final String k;

    ep(String str) {
        this.k = str;
    }

    public static int a(String str) {
        ep[] values;
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (ep epVar : values()) {
            if (epVar.k.equals(str)) {
                i = dr.a(epVar);
            }
        }
        return i;
    }
}
