package com.huawei.hms.availableupdate;

import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static String a(int i) {
        if (i != 1000) {
            if (i != 2000) {
                switch (i) {
                    case 1201:
                        return "CHECK_FAILURE";
                    case 1202:
                        return "CHECK_NO_UPDATE";
                    case 1203:
                        return "CHECK_NO_SUPPORTED";
                    default:
                        switch (i) {
                            case PushConstants.BROADCAST_MESSAGE_ARRIVE /* 2100 */:
                                return "DOWNLOADING";
                            case 2101:
                                return "DOWNLOAD_CANCELED";
                            default:
                                switch (i) {
                                    case PushConstants.ON_TIME_NOTIFICATION /* 2201 */:
                                        return "DOWNLOAD_FAILURE";
                                    case PushConstants.DELAY_NOTIFICATION /* 2202 */:
                                        return "DOWNLOAD_HASH_ERROR";
                                    case 2203:
                                        return "DOWNLOAD_NO_SPACE";
                                    case 2204:
                                        return "DOWNLOAD_NO_STORAGE";
                                    default:
                                        return "UNKNOWN - " + i;
                                }
                        }
                }
            }
            return "DOWNLOAD_SUCCESS";
        }
        return "CHECK_OK";
    }
}
