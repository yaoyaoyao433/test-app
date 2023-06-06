package com.tencent.liteav;

import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.module.TXCStatus;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static void a(String str, ArrayList<String> arrayList) {
        StatusBucket status = TXCAudioEngine.getInstance().getStatus(1);
        TXCStatus.a(str, (int) RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT, Integer.valueOf(status.getIntStatus("18446744073709551615", 10001)));
        TXCStatus.a(str, 8005, Integer.valueOf(status.getIntStatus("18446744073709551615", 10002)));
        TXCStatus.a(str, 14017, Integer.valueOf(status.getIntStatus("18446744073709551615", 10000)));
        TXCStatus.a(str, (int) RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME, Integer.valueOf(status.getIntStatus("18446744073709551615", 10003)));
        TXCStatus.a(str, (int) RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME_PUBLISH, Integer.valueOf(status.getIntStatus("18446744073709551615", 10004)));
        TXCStatus.a(str, 14018, Integer.valueOf(status.getIntStatus("18446744073709551615", 10005)));
        TXCStatus.a(str, 18029, Integer.valueOf(status.getIntStatus("18446744073709551615", 10006)));
        if (arrayList == null) {
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            int intStatus = status.getIntStatus(next, 10114);
            int intStatus2 = status.getIntStatus(next, 10115);
            TXCStatus.a(next, 18031, Integer.valueOf(intStatus));
            TXCStatus.a(next, 18032, Integer.valueOf(intStatus2));
            int i = 0;
            TXCStatus.a(next, 2001, Integer.valueOf(intStatus2 > 0 ? intStatus / intStatus2 : 0));
            TXCStatus.a(next, 2002, Integer.valueOf(intStatus2));
            TXCStatus.a(next, 2005, Integer.valueOf(intStatus2));
            TXCStatus.a(next, 2004, Integer.valueOf(status.getIntStatus(next, 10300)));
            TXCStatus.a(next, 2008, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_BIND_GROUP)));
            TXCStatus.a(next, 2010, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_SEND_TO_MY_COMPUTER)));
            TXCStatus.a(next, 2007, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_QQ_FAVORITES)));
            TXCStatus.a(next, 2011, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_SHARE_TO_TROOP_BAR)));
            TXCStatus.a(next, (int) DownloadException.ILLEGAL_URL, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_QQ_SHARE)));
            TXCStatus.a(next, (int) DownloadException.CANCELED, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_QZONE_SHARE)));
            TXCStatus.a(next, (int) DownloadException.UN_KNOWN, Integer.valueOf(status.getIntStatus(next, 10202)));
            TXCStatus.a(next, (int) DownloadException.MD5_VERIFY_FAILED, Integer.valueOf(status.getIntStatus(next, 10203)));
            TXCStatus.a(next, (int) DownloadException.DOWNLOAD_TIME_OUT, Integer.valueOf(status.getIntStatus(next, 10204)));
            TXCStatus.a(next, 18015, Integer.valueOf(status.getIntStatus(next, 10205)));
            TXCStatus.a(next, 18013, Integer.valueOf(status.getIntStatus(next, 10206)));
            int intStatus3 = status.getIntStatus(next, 10203);
            int intStatus4 = status.getIntStatus(next, 10202);
            if (intStatus4 > 0) {
                i = (intStatus3 * 100) / intStatus4;
            }
            TXCStatus.a(next, 18014, Integer.valueOf(i));
            TXCStatus.a(next, 18023, Integer.valueOf(status.getIntStatus(next, 10200)));
            TXCStatus.a(next, 18026, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_EDIT_DYNAMIC_AVATAR)));
            TXCStatus.a(next, 18027, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_JOIN_GROUP)));
            TXCStatus.a(next, 18028, Integer.valueOf(status.getIntStatus(next, 10201)));
            TXCStatus.a(next, 18030, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_GUILD)));
            TXCStatus.a(next, (int) DownloadException.NET_ERROR, Integer.valueOf(status.getIntStatus(next, 10100)));
            TXCStatus.a(next, (int) TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE, Integer.valueOf(status.getIntStatus(next, 10100)));
            TXCStatus.a(next, 2020, Integer.valueOf(status.getIntStatus(next, XPlayerConstants.FFP_PROP_FLOAT_GOP_FRAME)));
            TXCStatus.a(next, 18016, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_APPBAR)));
            TXCStatus.a(next, (int) DownloadException.UNZIP_NOT_ZIP_FILE, Integer.valueOf(status.getIntStatus(next, 10207)));
            TXCStatus.a(next, 18010, Integer.valueOf(status.getIntStatus(next, 10208)));
            TXCStatus.a(next, 18012, Integer.valueOf(status.getIntStatus(next, 10209)));
            TXCStatus.a(next, 2021, Integer.valueOf(status.getIntStatus(next, Constants.REQUEST_EDIT_EMOTION)));
        }
    }
}
