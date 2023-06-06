package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloadUpload;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.f;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class TbsDownloader {
    public static final boolean DEBUG_DISABLE_DOWNLOAD = false;
    public static boolean DOWNLOAD_OVERSEA_TBS = false;
    public static final String LOGTAG = "TbsDownload";
    public static final String TBS_METADATA = "com.tencent.mm.BuildInfo.CLIENT_VERSION";
    static boolean a;
    private static String b;
    private static Context c;
    private static Handler d;
    private static String e;
    private static m g;
    private static HandlerThread h;
    private static int m;
    private static boolean n;
    private static int o;
    private static long p;
    private static int q;
    private static Object f = new byte[0];
    private static boolean i = false;
    private static String j = "";
    private static boolean k = false;
    private static boolean l = false;
    private static JSONObject r = null;
    private static JSONObject s = null;
    private static boolean t = false;
    private static int u = 0;
    private static int v = 0;
    private static JSONObject w = null;
    private static long x = -1;

    /* loaded from: classes6.dex */
    public interface TbsDownloaderCallback {
        void onNeedDownloadFinish(boolean z, int i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static File a(int i2) {
        String str;
        String str2;
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        int length = coreProviderAppList.length;
        File file = null;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            String str3 = coreProviderAppList[i3];
            if (!str3.equals(c.getApplicationInfo().packageName)) {
                file = new File(FileUtil.a(c, str3, 4, false), getOverSea(c) ? "x5.oversea.tbs.org" : getBackupFileName(false));
                if (!file.exists()) {
                    str = LOGTAG;
                    str2 = "can not find local backup core file";
                } else if (com.tencent.smtt.utils.a.a(c, file) == i2) {
                    TbsLog.i(LOGTAG, "local tbs version fond,path = " + file.getAbsolutePath());
                    break;
                } else {
                    str = LOGTAG;
                    str2 = "version is not match";
                }
                TbsLog.i(str, str2);
            }
            i3++;
        }
        return file;
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    private static JSONArray a(boolean z) {
        String[] coreProviderAppList;
        boolean z2;
        JSONArray jSONArray = new JSONArray();
        for (String str : TbsShareManager.getCoreProviderAppList()) {
            File file = z ? new File(FileUtil.a(c, str, 4, false), getOverSea(c) ? "x5.oversea.tbs.org" : getBackupFileName(false)) : new File(FileUtil.a(c, str, 4, false), "x5.tbs.decouple");
            if (file.exists()) {
                long a2 = com.tencent.smtt.utils.a.a(c, file);
                if (a2 > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= jSONArray.length()) {
                            z2 = false;
                            break;
                        } else if (jSONArray.optInt(i2) == a2) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        jSONArray.put(a2);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bb, code lost:
        r9.put("FUNCTION", 2);
        r0 = "A";
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0368 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0380 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0385 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0392 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0399 A[Catch: Exception -> 0x039e, TRY_LEAVE, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ee A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022a A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b5 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:18:0x0076, B:20:0x007e, B:22:0x0089, B:24:0x0097, B:25:0x00a0, B:37:0x00e6, B:39:0x00f6, B:40:0x00fb, B:42:0x0108, B:44:0x010c, B:68:0x01bb, B:77:0x01d5, B:79:0x01ee, B:81:0x0224, B:89:0x0246, B:91:0x02b5, B:92:0x02c0, B:95:0x02fc, B:97:0x0310, B:99:0x0318, B:102:0x0322, B:104:0x032a, B:106:0x033a, B:108:0x0348, B:105:0x0330, B:96:0x030a, B:109:0x0353, B:111:0x0368, B:113:0x0372, B:115:0x0376, B:118:0x0380, B:120:0x0385, B:121:0x038a, B:123:0x0392, B:125:0x0399, B:82:0x022a, B:84:0x0237, B:88:0x0241, B:73:0x01cb, B:46:0x0115, B:48:0x0126, B:52:0x013e, B:54:0x014a, B:56:0x015a, B:58:0x0180, B:61:0x018e, B:63:0x01ab, B:49:0x0131, B:26:0x00a5, B:28:0x00b3, B:29:0x00bd, B:31:0x00cc, B:33:0x00d4, B:34:0x00da, B:35:0x00e0), top: B:129:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject a(boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.a(boolean, boolean, boolean):org.json.JSONObject");
    }

    private static void a(JSONArray jSONArray) {
        String[] f2;
        boolean z;
        for (String str : f()) {
            int stableCoreVersion = TbsShareManager.getStableCoreVersion(c, str);
            if (stableCoreVersion > 0) {
                Context packageContext = TbsShareManager.getPackageContext(c, str, false);
                if (packageContext == null || p.a().g(packageContext)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= jSONArray.length()) {
                            z = false;
                            break;
                        } else if (jSONArray.optInt(i2) == stableCoreVersion) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        TbsLog.i(LOGTAG, "addStableVersionToJsonData,pkg=" + str + ";version=" + stableCoreVersion);
                        jSONArray.put(stableCoreVersion);
                    }
                } else {
                    TbsLog.e(LOGTAG, "addStableVersionToJsonData,host check failed,packageName = " + str);
                }
            }
        }
    }

    private static void a(boolean z, TbsDownloaderCallback tbsDownloaderCallback, boolean z2) {
        TbsLog.i(LOGTAG, "[TbsDownloader.queryConfig]");
        d.removeMessages(100);
        Message obtain = Message.obtain(d, 100);
        if (tbsDownloaderCallback != null) {
            obtain.obj = tbsDownloaderCallback;
        }
        obtain.arg1 = 0;
        obtain.arg1 = z ? 1 : 0;
        obtain.arg2 = z2 ? 1 : 0;
        obtain.sendToTarget();
    }

    private static boolean a(int i2, int i3, int i4) {
        try {
            TbsLog.i(LOGTAG, "copyFromOldBackupDone newCoreVersion is " + i2 + " localStableCoreVersion is " + i3 + " cpuType is " + i4);
            if (i2 > 0 && i2 != i3) {
                File file = new File(FileUtil.a(c, 3), getBackupFileName(false, i4));
                int i5 = -1;
                if (file.exists() && file.canRead() && (i5 = com.tencent.smtt.utils.a.b(file)) <= 0) {
                    i5 = com.tencent.smtt.utils.a.a(c, file);
                }
                v = i5;
                TbsLog.i(LOGTAG, "copyFromOldBackupDone oldBackupCoreVersion is " + i5);
                if (i2 == i5) {
                    File file2 = new File(FileUtil.a(c, "com.tencent.mm", 4, true));
                    boolean b2 = FileUtil.b(file, new File(file2, getBackupFileName(false, i4)));
                    TbsLog.i(LOGTAG, "copyFromOldBackupDone #01 result is " + b2);
                    if (b2) {
                        File[] listFiles = file2.listFiles();
                        Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(false, i4));
                        for (File file3 : listFiles) {
                            if (compile.matcher(file3.getName()).find() && file3.isFile() && file3.exists()) {
                                file3.delete();
                            }
                        }
                        File file4 = new File(file2, com.tencent.smtt.utils.a.a(false, i4) + CommonConstant.Symbol.DOT + i2);
                        if (!file4.exists()) {
                            file4.createNewFile();
                        }
                    }
                    return b2;
                }
            }
        } catch (Throwable th) {
            TbsLog.i(LOGTAG, "stack is " + Log.getStackTraceString(th));
        }
        TbsLog.i(LOGTAG, "copyFromOldBackupDone result is false  #10");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context) {
        return TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, int i2) {
        return Build.VERSION.SDK_INT > 28 && context.getApplicationInfo().targetSdkVersion > 28 && i2 > 0 && i2 < 45114;
    }

    private static boolean a(Context context, boolean z) {
        Matcher matcher;
        int i2;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        if (Build.VERSION.SDK_INT < 8) {
            i2 = -102;
        } else if (!QbSdk.c && TbsShareManager.isThirdPartyApp(c) && !c()) {
            return false;
        } else {
            if (!tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA)) {
                if (z && !"com.tencent.mm".equals(context.getApplicationInfo().packageName)) {
                    TbsLog.i(LOGTAG, "needDownload-oversea is true, but not WX");
                    z = false;
                }
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA, Boolean.valueOf(z));
                tbsDownloadConfig.commit();
                k = z;
                TbsLog.i(LOGTAG, "needDownload-first-called--isoversea = " + z);
            }
            if (!getOverSea(context) || Build.VERSION.SDK_INT == 16 || Build.VERSION.SDK_INT == 17 || Build.VERSION.SDK_INT == 18) {
                String string = tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DEVICE_CPUABI, null);
                e = string;
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                try {
                    matcher = Pattern.compile("i686|mips|x86_64|x86").matcher(e);
                } catch (Exception unused) {
                    matcher = null;
                }
                if (matcher == null || !matcher.find()) {
                    return true;
                }
                TbsLog.e(LOGTAG, "can not support x86 devices!!");
                i2 = -104;
            } else {
                TbsLog.i(LOGTAG, "needDownload- return false,  because of  version is " + Build.VERSION.SDK_INT + ", and overea");
                i2 = -103;
            }
        }
        tbsDownloadConfig.setDownloadInterruptCode(i2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.a(android.content.Context, boolean, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:24|(3:25|26|(1:28)(2:326|(1:328)(1:329)))|29|(2:30|31)|32|(4:38|39|(1:41)(1:44)|42)|(10:303|304|(1:306)(1:321)|307|(1:309)(1:320)|310|(1:312)(1:319)|313|(1:315)(1:318)|316)|48|(10:49|50|51|52|53|54|56|57|(3:59|(1:61)(1:292)|62)(1:294)|(3:63|64|(2:66|67)(1:290)))|(2:68|69)|(2:71|(10:73|74|75|76|78|79|80|2d7|90|(6:(1:93)(1:101)|94|95|(1:97)(1:100)|98|99)(22:(1:103)|104|(1:106)|107|(1:109)|110|(3:112|(1:114)|115)(1:274)|117|118|(1:120)|121|122|(3:124|125|126)(1:272)|128|130|131|132|(1:137)|138|(1:(1:(2:147|148))(1:145))|151|(2:161|(6:163|(1:165)(1:171)|166|(1:168)|169|170)(5:172|(1:174)|175|(3:177|(1:179)(1:267)|180)(1:268)|(4:246|(3:248|(1:250)(1:(1:255)(1:(1:257)(1:258)))|251)(3:259|(1:261)(1:(1:264)(1:(1:266)))|262)|252|253)(16:185|(1:187)|188|(3:190|(1:192)(1:194)|193)|195|(1:197)|198|(2:200|(6:(1:205)(1:212)|206|207|(1:209)|210|211))(1:243)|213|(4:216|(1:229)(1:220)|221|(8:223|(1:225)(1:228)|226|227|207|(0)|210|211))|230|(2:(1:241)|242)(4:234|(1:236)(1:239)|237|238)|207|(0)|210|211)))(4:155|(1:157)(1:160)|158|159))))|286|74|75|76|78|79|80|2d7) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d4, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x038a, code lost:
        if (r3 > 0) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0820  */
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r31, int r32, boolean r33, boolean r34, boolean r35) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.a(java.lang.String, int, boolean, boolean, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static File b(int i2) {
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        int length = coreProviderAppList.length;
        File file = null;
        int i3 = 0;
        while (i3 < length) {
            File file2 = new File(FileUtil.a(c, coreProviderAppList[i3], 4, false), getOverSea(c) ? "x5.oversea.tbs.org" : getBackupFileName(false));
            if (file2.exists() && com.tencent.smtt.utils.a.a(c, file2) == i2) {
                TbsLog.i(LOGTAG, "local tbs version fond,path = " + file2.getAbsolutePath());
                return file2;
            }
            i3++;
            file = file2;
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r6) {
        /*
            java.lang.String r0 = com.tencent.smtt.sdk.TbsDownloader.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r6 = com.tencent.smtt.sdk.TbsDownloader.b
            return r6
        Lb:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r2.getBytes(r4)     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = "ISO8859-1"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L24
            r2 = r3
        L24:
            if (r2 != 0) goto L2c
        L26:
            java.lang.String r2 = "1.0"
        L28:
            r1.append(r2)
            goto L33
        L2c:
            int r3 = r2.length()
            if (r3 <= 0) goto L26
            goto L28
        L33:
            java.lang.String r2 = "; "
            r1.append(r2)
            java.lang.String r2 = r0.getLanguage()
            if (r2 == 0) goto L55
            java.lang.String r2 = r2.toLowerCase()
            r1.append(r2)
            java.lang.String r0 = r0.getCountry()
            if (r0 == 0) goto L5a
            java.lang.String r2 = "-"
            r1.append(r2)
            java.lang.String r0 = r0.toLowerCase()
            goto L57
        L55:
            java.lang.String r0 = "en"
        L57:
            r1.append(r0)
        L5a:
            java.lang.String r0 = "REL"
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8a
            java.lang.String r6 = com.tencent.smtt.utils.r.d(r6)
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L76
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r6.getBytes(r2)     // Catch: java.lang.Exception -> L76
            java.lang.String r3 = "ISO8859-1"
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L76
            r6 = r0
        L76:
            if (r6 != 0) goto L7e
            java.lang.String r6 = "; "
        L7a:
            r1.append(r6)
            goto L8a
        L7e:
            int r0 = r6.length()
            if (r0 <= 0) goto L8a
            java.lang.String r0 = "; "
            r1.append(r0)
            goto L7a
        L8a:
            java.lang.String r6 = android.os.Build.ID
            if (r6 != 0) goto L91
            java.lang.String r6 = ""
            goto L93
        L91:
            java.lang.String r6 = android.os.Build.ID
        L93:
            java.lang.String r0 = "[一-龥]"
            java.lang.String r2 = ""
            java.lang.String r6 = r6.replaceAll(r0, r2)
            if (r6 != 0) goto La8
            java.lang.String r6 = " Build/"
            r1.append(r6)
            java.lang.String r6 = "00"
        La4:
            r1.append(r6)
            goto Lb4
        La8:
            int r0 = r6.length()
            if (r0 <= 0) goto Lb4
            java.lang.String r0 = " Build/"
            r1.append(r0)
            goto La4
        Lb4:
            java.lang.String r6 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r6 = java.lang.String.format(r6, r0)
            com.tencent.smtt.sdk.TbsDownloader.b = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.b(android.content.Context):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(35:28|(1:30)(1:199)|31|(1:33)(1:198)|34|(1:36)(1:197)|37|(1:39)(1:196)|40|(1:42)|43|(3:178|179|(25:183|(3:185|(1:187)(1:190)|188)(1:(1:192)(1:193))|189|46|47|48|49|50|52|53|54|55|56|57|(10:59|60|61|(5:63|(4:149|(3:151|(1:153)|154)(1:164)|155|(3:(1:158)(2:(1:162)|160)|159|160)(1:163))(1:66)|67|(15:76|77|78|(1:80)(11:(1:143)|(1:83)(1:141)|84|(9:125|126|(1:(2:135|(2:139|140))(1:134))(1:130)|(1:122)(6:(1:89)(5:(1:118)(2:119|(1:121))|91|92|93|(1:97))|90|91|92|93|(2:95|97))|98|99|100|(1:102)(1:(1:105)(2:106|(1:108)))|103)|86|(0)(0)|98|99|100|(0)(0)|103)|81|(0)(0)|84|(0)|86|(0)(0)|98|99|100|(0)(0)|103)(2:(1:71)(1:(1:75))|72)|73)|166|(0)|149|(0)(0)|155|(0)(0))|169|60|61|(0)|166|(0)|149|(0)(0)|155|(0)(0)))|45|46|47|48|49|50|52|53|54|55|56|57|(0)|169|60|61|(0)|166|(0)|149|(0)(0)|155|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0201, code lost:
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0209, code lost:
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0211, code lost:
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
        r13 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0390 A[Catch: Throwable -> 0x0363, TRY_LEAVE, TryCatch #7 {Throwable -> 0x0363, blocks: (B:123:0x033a, B:124:0x035f, B:130:0x0390, B:153:0x0401, B:154:0x046c, B:164:0x056a, B:166:0x0570, B:168:0x0578, B:170:0x0597, B:156:0x0473, B:160:0x04e2, B:128:0x0368), top: B:208:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0393 A[Catch: Throwable -> 0x06ef, TRY_ENTER, TryCatch #2 {Throwable -> 0x06ef, blocks: (B:121:0x031b, B:133:0x0395, B:162:0x055a, B:158:0x04da, B:132:0x0393), top: B:198:0x031b }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05a8 A[Catch: Throwable -> 0x06ed, TryCatch #0 {Throwable -> 0x06ed, blocks: (B:171:0x059f, B:173:0x05a8, B:174:0x0603, B:176:0x060a, B:177:0x0679, B:179:0x0681), top: B:195:0x059f }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222 A[Catch: Exception -> 0x0229, TRY_LEAVE, TryCatch #4 {Exception -> 0x0229, blocks: (B:82:0x021a, B:84:0x0222), top: B:202:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0232 A[Catch: Exception -> 0x0239, TRY_LEAVE, TryCatch #3 {Exception -> 0x0239, blocks: (B:87:0x022a, B:89:0x0232), top: B:200:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x03fc -> B:150:0x03fc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(final boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.b(boolean, boolean, boolean, boolean):boolean");
    }

    private static void c(int i2) {
        String str;
        String str2;
        int i3;
        int i4;
        try {
            TbsLog.i(LOGTAG, "sendRequestForOtherStableCore cpuType is " + i2 + " mJsonDataQuery is " + r + " mJsonDataDownloadUpdate is " + s);
            if (!com.tencent.smtt.utils.r.b(c)) {
                TbsLog.i(LOGTAG, "sendRequestForOtherStableCore isStableCoreForHostEnable is false and return ");
            } else if (i2 < 32) {
            } else {
                if (r == null) {
                    r = s;
                }
                if (r == null) {
                    return;
                }
                if (System.currentTimeMillis() - TbsDownloadConfig.getInstance(c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_STABLE_CORE_OTHER_CPU, 0L) < TbsDownloadConfig.getInstance(c).getRetryInterval() * 1000) {
                    TbsLog.i(LOGTAG, "sendRequestForOtherStableCore less than and return ");
                    return;
                }
                int i5 = -1;
                if (i2 == 64) {
                    r.put("REQUEST_64", 1);
                    i5 = 1;
                } else if (i2 == 32) {
                    r.remove("REQUEST_64");
                }
                r.put("DOWNLOADDECOUPLECORE", 1);
                if (i2 == 64) {
                    if (n.a(c).c("stable_64_tpatch_fail") == 1) {
                        str = LOGTAG;
                        str2 = "sendRequestForOtherStableCore stable_64_last_tpatch_fail and set REQUEST_TPATCH  0 ";
                        TbsLog.i(str, str2);
                        i3 = 0;
                    }
                    i3 = 1;
                } else {
                    if (n.a(c).c("stable_32_tpatch_fail") == 1) {
                        str = LOGTAG;
                        str2 = "sendRequestForOtherStableCore stable_32_last_tpatch_fail and set REQUEST_TPATCH  0 ";
                        TbsLog.i(str, str2);
                        i3 = 0;
                    }
                    i3 = 1;
                }
                r.put("REQUEST_TPATCH", i3);
                int tbsStableCoreVersion = TbsShareManager.getTbsStableCoreVersion(c, i2);
                r.put("TBSDV", p.a().j(c) % 10000);
                r.put("TBSBACKUPV", tbsStableCoreVersion);
                if (i3 == 0) {
                    r.put("TBSDV", 0);
                    r.put("TBSBACKUPV", 0);
                }
                if (tbsStableCoreVersion > 0) {
                    r.put("FUNCTION", 1);
                    i4 = 1;
                } else {
                    r.put("FUNCTION", 0);
                    i4 = 0;
                }
                r.put("TBSV", 0);
                String g2 = com.tencent.smtt.utils.n.a(c).g();
                TbsLog.i(LOGTAG, "[TbsDownloader.sendRequestForOtherStableCore] postUrl=" + g2);
                TbsLog.i(LOGTAG, "[TbsDownloader.sendRequestForOtherStableCore] mJsonDataQuery=" + r.toString());
                w = r;
                com.tencent.smtt.utils.r.b(c, "request_download_update_other", (((("requesttpatch=is=" + i3) + "_tbsdv=is=" + tbsStableCoreVersion) + "_tbsbackupv=is=" + tbsStableCoreVersion) + "_request64=is=" + i5) + "_functionUpload=is=" + i4);
                String a2 = com.tencent.smtt.utils.f.a(g2, r.toString().getBytes("utf-8"), new f.a() { // from class: com.tencent.smtt.sdk.TbsDownloader.4
                    @Override // com.tencent.smtt.utils.f.a
                    public final void a(int i6) {
                    }
                }, false);
                StringBuilder sb = new StringBuilder("[TbsDownloader.sendRequestForOtherStableCore] response=");
                sb.append(a2);
                TbsLog.i(LOGTAG, sb.toString());
                JSONObject jSONObject = new JSONObject(a2);
                TbsDownloadConfig.getInstance(c).mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_STABLE_CORE_OTHER_CPU, Long.valueOf(System.currentTimeMillis()));
                TbsDownloadConfig.getInstance(c).commit();
                String string = jSONObject.getString("DOWNLOADURL");
                long j2 = jSONObject.getLong("TBSAPKFILESIZE");
                String string2 = jSONObject.getString("PKGMD5");
                int i6 = jSONObject.getInt("TBSAPKSERVERVERSION");
                int i7 = jSONObject.getInt("RESPONSECODE");
                t = false;
                if (com.tencent.smtt.utils.r.b(c)) {
                    int tbsStableCoreVersion2 = TbsShareManager.getTbsStableCoreVersion(c, i2);
                    com.tencent.smtt.utils.r.b(c, "response_download_update_other", ((((("newcore=is=" + i6) + "_oldcore=is=" + tbsStableCoreVersion2) + "_RESPONSECODE=is=" + i7) + "_DOWNLOADURLEmpty=is=" + TextUtils.isEmpty(string)) + "_TBSAPKSERVERVERSION=is=" + i6) + "_TBSAPKFILESIZE=is=" + j2);
                    if (tbsStableCoreVersion2 < i6) {
                        if (a(i6, tbsStableCoreVersion2, i2)) {
                            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
                            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_CPUTYPE_OTHER_STABLE_CORE, Integer.valueOf(i2));
                            tbsDownloadConfig.commit();
                            TbsLog.i(LOGTAG, "sendRequestForOtherStableCore stable core " + i6 + " copy from old backup and return ");
                            StringBuilder sb2 = new StringBuilder("oldcore=is=");
                            sb2.append(tbsStableCoreVersion2);
                            com.tencent.smtt.utils.r.b(c, "copy_other_cpu_core_ok", sb2.toString() + "_newcore=is=" + i6);
                            return;
                        }
                        TbsDownloadConfig tbsDownloadConfig2 = TbsDownloadConfig.getInstance(c);
                        tbsDownloadConfig2.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, string);
                        tbsDownloadConfig2.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, Long.valueOf(j2));
                        tbsDownloadConfig2.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_CPUTYPE_OTHER_STABLE_CORE, Integer.valueOf(i2));
                        Map<String, Object> map = tbsDownloadConfig2.mSyncMap;
                        if (string2 == null) {
                            string2 = "";
                        }
                        map.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPK_MD5, string2);
                        tbsDownloadConfig2.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 1);
                        tbsDownloadConfig2.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, Integer.valueOf(i6));
                        tbsDownloadConfig2.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, Integer.valueOf(i7));
                        tbsDownloadConfig2.commit();
                        TbsLog.i(LOGTAG, "sendRequestForOtherStableCore downloadUrl is " + string, true);
                        if (!TextUtils.isEmpty(string)) {
                            g.b(false, true);
                        }
                    } else if (TextUtils.isEmpty(string) && i6 == 0 && j2 > 0) {
                        t = true;
                    }
                }
                d(i2);
                if (t) {
                    int tbsStableCoreVersion3 = TbsShareManager.getTbsStableCoreVersion(c, i2);
                    v = 0;
                    boolean a3 = a(u, tbsStableCoreVersion3, i2);
                    TbsLog.i(LOGTAG, "other cpu stable core is flowed and copyFromOldBackupDone is " + a3 + " tbsDownloadVersion is " + i6 + " oldBackupCoreVersion is " + v + " localStableCore is " + tbsStableCoreVersion3 + " cpuType is " + i2);
                    com.tencent.smtt.utils.r.b(c, "copy_other_cpu_core_ok_flowed", (((("newcore=is=" + u) + "_backupcore=is=" + v) + "_localstablecore=is=" + tbsStableCoreVersion3) + "_cputype=is=" + i2) + "_result=is=" + a3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(11)
    public static void c(Context context) {
        TbsDownloadConfig.getInstance(context).clear();
        TbsLogReport.getInstance(context).clear();
        m.e(context);
        (Build.VERSION.SDK_INT >= 11 ? context.getSharedPreferences("tbs_extension_config", 4) : context.getSharedPreferences("tbs_extension_config", 0)).edit().clear().commit();
        (Build.VERSION.SDK_INT >= 11 ? context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4) : context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0)).edit().clear().commit();
    }

    private static boolean c() {
        try {
            for (String str : TbsShareManager.getCoreProviderAppList()) {
                if (TbsShareManager.getSharedTbsCoreVersion(c, str) > 0) {
                    return true;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    private static synchronized void d() {
        synchronized (TbsDownloader.class) {
            if (h == null) {
                h = o.a();
                try {
                    g = new m(c);
                    d = new Handler(h.getLooper()) { // from class: com.tencent.smtt.sdk.TbsDownloader.2
                        @Override // android.os.Handler
                        public final void handleMessage(Message message) {
                            FileOutputStream fileOutputStream;
                            switch (message.what) {
                                case 100:
                                    boolean z = message.arg1 == 1;
                                    boolean b2 = TbsDownloader.b(true, false, false, message.arg2 == 1);
                                    if (message.obj != null && (message.obj instanceof TbsDownloaderCallback)) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "needDownload-onNeedDownloadFinish needStartDownload=" + b2);
                                        String str = "";
                                        if (TbsDownloader.c != null && TbsDownloader.c.getApplicationContext() != null && TbsDownloader.c.getApplicationContext().getApplicationInfo() != null) {
                                            str = TbsDownloader.c.getApplicationContext().getApplicationInfo().packageName;
                                        }
                                        if (b2 && !z) {
                                            if ("com.tencent.mm".equals(str) || "com.tencent.mobileqq".equals(str)) {
                                                TbsLog.i(TbsDownloader.LOGTAG, "needDownload-onNeedDownloadFinish in mm or QQ callback needStartDownload = " + b2);
                                            }
                                        }
                                        ((TbsDownloaderCallback) message.obj).onNeedDownloadFinish(b2, TbsDownloadConfig.getInstance(TbsDownloader.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
                                    }
                                    if (TbsShareManager.isThirdPartyApp(TbsDownloader.c) && b2) {
                                        TbsDownloader.startDownload(TbsDownloader.c);
                                        return;
                                    }
                                    return;
                                case 101:
                                case 108:
                                    if (Apn.getApnType(TbsDownloader.c) != 3 && !QbSdk.getDownloadWithoutWifi()) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "not wifi,no need send request");
                                        QbSdk.n.onDownloadFinish(111);
                                        return;
                                    }
                                    FileLock fileLock = null;
                                    if (TbsShareManager.isThirdPartyApp(TbsDownloader.c)) {
                                        fileOutputStream = null;
                                    } else {
                                        fileOutputStream = FileUtil.b(TbsDownloader.c, false, "tbs_download_lock_file" + TbsDownloadConfig.getInstance(TbsDownloader.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) + ".txt");
                                        if (fileOutputStream != null) {
                                            fileLock = FileUtil.a(TbsDownloader.c, fileOutputStream);
                                            if (fileLock == null) {
                                                QbSdk.n.onDownloadFinish(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
                                                TbsLog.i(TbsDownloader.LOGTAG, "file lock locked,wx or qq is downloading");
                                                TbsDownloadConfig.getInstance(TbsDownloader.c).setDownloadInterruptCode(-203);
                                                TbsLog.i(TbsDownloader.LOGTAG, "MSG_START_DOWNLOAD_DECOUPLECORE return #1");
                                                return;
                                            }
                                        } else if (FileUtil.a(TbsDownloader.c)) {
                                            QbSdk.n.onDownloadFinish(-204);
                                            TbsDownloadConfig.getInstance(TbsDownloader.c).setDownloadInterruptCode(-204);
                                            TbsLog.i(TbsDownloader.LOGTAG, "MSG_START_DOWNLOAD_DECOUPLECORE return #2");
                                            return;
                                        }
                                    }
                                    boolean z2 = message.arg1 == 1;
                                    TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(TbsDownloader.c);
                                    boolean b3 = TbsDownloader.b(false, z2, 108 == message.what, true);
                                    StringBuilder sb = new StringBuilder("needStartDownload is ");
                                    sb.append(b3);
                                    sb.append(" forDecoupleCore is ");
                                    sb.append(108 == message.what);
                                    TbsLog.i(TbsDownloader.LOGTAG, sb.toString());
                                    TbsLog.i(TbsDownloader.LOGTAG, "idownloadConfig.mPreferences.getBoolean(TbsConfigKey.KEY_NEEDDOWNLOAD, false) is " + tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false));
                                    if (b3) {
                                        if (z2 && p.a().b(TbsDownloader.c, TbsDownloadConfig.getInstance(TbsDownloader.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0))) {
                                            TbsLog.i(TbsDownloader.LOGTAG, "in needStartDownload true #1");
                                            QbSdk.n.onDownloadFinish(122);
                                            QbSdk.n.onInstallFinish(TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK);
                                            tbsDownloadConfig.setDownloadInterruptCode(-213);
                                        } else if (tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false)) {
                                            TbsDownloadConfig.getInstance(TbsDownloader.c).setDownloadInterruptCode(-215);
                                            if (108 == message.what) {
                                                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_CPUTYPE_OTHER_STABLE_CORE, 0);
                                                tbsDownloadConfig.commit();
                                            }
                                            TbsDownloader.g.b(z2, 108 == message.what);
                                        }
                                        TbsLog.i(TbsDownloader.LOGTAG, "------freeFileLock called :");
                                        FileUtil.a(fileLock, fileOutputStream);
                                        return;
                                    }
                                    QbSdk.n.onDownloadFinish(110);
                                    QbSdk.n.onInstallFinish(TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK);
                                    TbsLog.i(TbsDownloader.LOGTAG, "------freeFileLock called :");
                                    FileUtil.a(fileLock, fileOutputStream);
                                    return;
                                case 102:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_REPORT_DOWNLOAD_STAT");
                                    int a2 = TbsShareManager.isThirdPartyApp(TbsDownloader.c) ? TbsShareManager.a(TbsDownloader.c, false) : p.a().n(TbsDownloader.c);
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] localTbsVersion=" + a2);
                                    TbsDownloader.g.a(a2);
                                    TbsLogReport.getInstance(TbsDownloader.c).dailyReport();
                                    return;
                                case 103:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_CONTINUEINSTALL_TBSCORE");
                                    if (message.arg1 == 0) {
                                        p.a().a((Context) message.obj, true);
                                        return;
                                    } else {
                                        p.a().a((Context) message.obj, false);
                                        return;
                                    }
                                case 104:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_UPLOAD_TBSLOG");
                                    TbsLogReport.getInstance(TbsDownloader.c).reportTbsLog();
                                    return;
                                case 105:
                                case 106:
                                case 107:
                                default:
                                    return;
                                case 109:
                                    if (TbsDownloader.g != null) {
                                        TbsDownloader.g.f();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                } catch (Exception unused) {
                    i = true;
                    TbsLog.e(LOGTAG, "TbsApkDownloader init has Exception");
                }
            }
        }
    }

    private static void d(int i2) {
        if (w == null) {
            return;
        }
        try {
            w.put("FUNCTION", 2);
            String g2 = com.tencent.smtt.utils.n.a(c).g();
            TbsLog.i(LOGTAG, "[TbsDownloader.resetOtherCpuStableCore] postUrl=" + g2);
            TbsLog.i(LOGTAG, "[TbsDownloader.resetOtherCpuStableCore] mJsonDataQueryReset=" + w.toString());
            String a2 = com.tencent.smtt.utils.f.a(g2, w.toString().getBytes("utf-8"), new f.a() { // from class: com.tencent.smtt.sdk.TbsDownloader.5
                @Override // com.tencent.smtt.utils.f.a
                public final void a(int i3) {
                }
            }, false);
            TbsLog.i(LOGTAG, "[TbsDownloader.resetOtherCpuStableCore] response=" + a2);
            u = 0;
            JSONObject jSONObject = new JSONObject(a2);
            if (jSONObject.getInt("RESETDECOUPLECORE") != 1) {
                u = jSONObject.getInt("DECOUPLECOREVERSION");
                return;
            }
            Context packageContext = TbsShareManager.getPackageContext(c, "com.tencent.mm", false);
            File file = packageContext == null ? new File(FileUtil.a(c, "com.tencent.mm", 4, true)) : new File(FileUtil.a(packageContext, 4));
            TbsLog.i(LOGTAG, "[TbsDownloader.resetOtherCpuStableCore] resetDecoupleCore mFilePathStable is " + file.getAbsolutePath(), true);
            File[] listFiles = file.listFiles();
            Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(false, i2));
            for (File file2 : listFiles) {
                if (compile.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                    TbsLog.i(LOGTAG, "resetOtherCpuStableCore file is " + file2.getAbsolutePath(), true);
                    file2.delete();
                }
            }
            File file3 = new File(file, getBackupFileName(false, i2));
            TbsLog.i(LOGTAG, "resetOtherCpuStableCore file is " + file3.getAbsolutePath(), true);
            file3.delete();
        } catch (Throwable unused) {
        }
    }

    private static boolean e() {
        try {
            return TbsDownloadConfig.getInstance(c).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION, "").equals(g().toString());
        } catch (Exception unused) {
            return false;
        }
    }

    private static String[] f() {
        if (QbSdk.getOnlyDownload()) {
            return new String[]{c.getApplicationContext().getPackageName()};
        }
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        String packageName = c.getApplicationContext().getPackageName();
        if (packageName.equals(TbsShareManager.f(c))) {
            int length = coreProviderAppList.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(coreProviderAppList, 0, strArr, 0, length);
            strArr[length] = packageName;
            return strArr;
        }
        return coreProviderAppList;
    }

    private static JSONArray g() {
        if (TbsShareManager.isThirdPartyApp(c)) {
            JSONArray jSONArray = new JSONArray();
            int tbsVersion = QbSdk.getTbsVersion(c);
            if (tbsVersion > 0) {
                jSONArray.put(tbsVersion);
            }
            TbsLog.i(LOGTAG, "getSelfVersion QbSdk.getTbsVersion() is " + jSONArray.toString());
            a(jSONArray);
            TbsLog.i(LOGTAG, "getHostCoreVersions addStableVersionToJsonData is " + jSONArray.toString());
            return jSONArray;
        }
        return null;
    }

    public static String getBackupFileName(boolean z) {
        return getBackupFileName(z, 0);
    }

    public static String getBackupFileName(boolean z, int i2) {
        boolean c2 = i2 == 64 ? true : i2 == 32 ? false : com.tencent.smtt.utils.b.c();
        return z ? c2 ? "x5.tbs.decouple.64" : "x5.tbs.decouple" : c2 ? "x5.tbs.org.64" : "x5.tbs.org";
    }

    public static int getCoreShareDecoupleCoreVersion() {
        return p.a().i(c);
    }

    public static int getCoreShareDecoupleCoreVersionByContext(Context context) {
        return p.a().i(context);
    }

    public static synchronized boolean getOverSea(Context context) {
        boolean z;
        synchronized (TbsDownloader.class) {
            if (!l) {
                l = true;
                TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
                if (tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA)) {
                    k = tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA, false);
                    TbsLog.i(LOGTAG, "[TbsDownloader.getOverSea]  first called. sOverSea = " + k);
                }
                TbsLog.i(LOGTAG, "[TbsDownloader.getOverSea]  sOverSea = " + k);
            }
            z = k;
        }
        return z;
    }

    public static long getRetryIntervalInSeconds() {
        return x;
    }

    public static HandlerThread getsTbsHandlerThread() {
        return h;
    }

    private static boolean h() {
        int i2;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
        if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadSuccessMaxRetrytimes()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] out of success retrytimes", true);
            i2 = -115;
        } else if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadFailedMaxRetrytimes()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] out of failed retrytimes", true);
            i2 = -116;
        } else if (FileUtil.b(c)) {
            if (System.currentTimeMillis() - tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_STARTTIME, 0L) <= 86400000) {
                long j2 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_FLOW, 0L);
                TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] downloadFlow=" + j2);
                if (j2 >= tbsDownloadConfig.getDownloadMaxflow()) {
                    TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] failed because you exceeded max flow!", true);
                    i2 = -120;
                }
            }
            return true;
        } else {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] local rom freespace limit", true);
            i2 = -117;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i2);
        return false;
    }

    public static boolean isDownloadForeground() {
        return g != null && g.d();
    }

    public static synchronized boolean isDownloading() {
        boolean z;
        synchronized (TbsDownloader.class) {
            TbsLog.i(LOGTAG, "[TbsDownloader.isDownloading] is " + a);
            z = a;
        }
        return z;
    }

    public static boolean needDownload(Context context, boolean z) {
        return needDownload(context, z, false, true, null);
    }

    public static boolean needDownload(Context context, boolean z, boolean z2, TbsDownloaderCallback tbsDownloaderCallback) {
        return needDownload(context, z, z2, true, tbsDownloaderCallback);
    }

    public static boolean needDownload(Context context, boolean z, boolean z2, boolean z3, TbsDownloaderCallback tbsDownloaderCallback) {
        boolean contains;
        boolean z4;
        int i2;
        com.tencent.smtt.utils.r.b(context, "need_download", "");
        com.tencent.smtt.utils.r.a(context, "need_download", "");
        c = context.getApplicationContext();
        com.tencent.smtt.utils.r.a("1");
        TbsLog.initIfNeed(context);
        TbsLog.i(LOGTAG, "needDownload,process=" + QbSdk.getCurrentProcessName(context) + "stack=" + Log.getStackTraceString(new Throwable()));
        TbsDownloadUpload.clear();
        TbsDownloadUpload tbsDownloadUpload = TbsDownloadUpload.getInstance(context);
        tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, 140);
        tbsDownloadUpload.commit();
        p.a().b(context, g.a == 0);
        int b2 = p.a().b(context);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],renameRet=" + b2);
        if (b2 != 0) {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
            tbsLogInfo.a = 129;
            tbsLogInfo.setFailDetail("code=2" + b2);
            TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_SDK_REPORT_INFO, tbsLogInfo);
        }
        if (b2 < 0) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needReNameFile=" + b2);
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] oversea=" + z + ",isDownloadForeground=" + z2);
        if (p.b) {
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#1 Static Installing, return false");
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_RETURN, Integer.valueOf((int) TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_1));
            tbsDownloadUpload.commit();
            return false;
        }
        TbsLog.app_extra(LOGTAG, context);
        Context applicationContext = context.getApplicationContext();
        c = applicationContext;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(applicationContext);
        tbsDownloadConfig.setDownloadInterruptCode(-100);
        if (!a(c, z)) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#2 Not shouldDoNeedDownload, return false");
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, 141);
            tbsDownloadUpload.commit();
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_RETURN, Integer.valueOf((int) TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_2));
            tbsDownloadUpload.commit();
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        d();
        if (i) {
            tbsDownloadConfig.setDownloadInterruptCode(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#3 TbsApkDownloader init Exception, return false");
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, 142);
            tbsDownloadUpload.commit();
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_RETURN, Integer.valueOf((int) TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_3));
            tbsDownloadUpload.commit();
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        boolean a2 = a(c, z2, false);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needSendRequest=" + a2);
        if (a2) {
            a(z2, tbsDownloaderCallback, z3);
            tbsDownloadConfig.setDownloadInterruptCode(-114);
        } else {
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, 143);
            tbsDownloadUpload.commit();
        }
        d.removeMessages(102);
        Message.obtain(d, 102).sendToTarget();
        if (QbSdk.c || !TbsShareManager.isThirdPartyApp(context)) {
            contains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] hasNeedDownloadKey=" + contains);
            z4 = (contains || TbsShareManager.isThirdPartyApp(context)) ? tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false) : true;
        } else {
            z4 = false;
            contains = false;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#4,needDownload=" + z4 + ",hasNeedDownloadKey=" + contains);
        if (!z4) {
            int n2 = p.a().n(c);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#7,tbsLocalVersion=" + n2 + ",needSendRequest=" + a2);
            if (a2 || n2 <= 0) {
                d.removeMessages(103);
                ((n2 > 0 || a2) ? Message.obtain(d, 103, 1, 0, c) : Message.obtain(d, 103, 0, 0, c)).sendToTarget();
                i2 = -121;
            } else {
                i2 = -119;
            }
            tbsDownloadConfig.setDownloadInterruptCode(i2);
        } else if (h()) {
            tbsDownloadConfig.setDownloadInterruptCode(-118);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#6");
        } else {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#5,set needDownload = false");
            z4 = false;
        }
        if (!a2 && tbsDownloaderCallback != null) {
            tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
        }
        tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_RETURN, Integer.valueOf(z4 ? TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE : TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_4));
        tbsDownloadUpload.commit();
        return z4;
    }

    public static boolean needDownloadDecoupleCore() {
        int i2;
        if (TbsShareManager.isThirdPartyApp(c) || a(c)) {
            return false;
        }
        return System.currentTimeMillis() - TbsDownloadConfig.getInstance(c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, 0L) >= TbsDownloadConfig.getInstance(c).getRetryInterval() * 1000 && (i2 = TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0)) > 0 && i2 != p.a().i(c) && TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) != i2;
    }

    public static boolean needSendRequest(Context context, boolean z) {
        c = context.getApplicationContext();
        TbsLog.initIfNeed(context);
        if (a(c, z)) {
            int n2 = p.a().n(context);
            TbsLog.i(LOGTAG, "[TbsDownloader.needSendRequest] localTbsVersion=" + n2);
            if (n2 > 0) {
                return false;
            }
            boolean z2 = true;
            if (a(c, false, true)) {
                return true;
            }
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
            boolean contains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD);
            TbsLog.i(LOGTAG, "[TbsDownloader.needSendRequest] hasNeedDownloadKey=" + contains);
            boolean z3 = !contains ? true : tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false);
            TbsLog.i(LOGTAG, "[TbsDownloader.needSendRequest] needDownload=" + z3);
            z2 = (z3 && h()) ? false : false;
            TbsLog.i(LOGTAG, "[TbsDownloader.needSendRequest] ret=" + z2);
            return z2;
        }
        return false;
    }

    public static void pauseDownload() {
        TbsLog.i(LOGTAG, "called pauseDownload,downloader=" + g);
        if (g != null) {
            g.e();
        }
    }

    public static void resumeDownload() {
        TbsLog.i(LOGTAG, "called resumeDownload,downloader=" + g);
        if (d != null) {
            d.removeMessages(109);
            d.sendEmptyMessage(109);
        }
    }

    public static void setAppContext(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        c = context.getApplicationContext();
    }

    public static void setRetryIntervalInSeconds(Context context, long j2) {
        if (context == null) {
            return;
        }
        if (context.getApplicationInfo().packageName.equals("com.tencent.qqlive")) {
            x = j2;
        }
        TbsLog.i(LOGTAG, "mRetryIntervalInSeconds is " + x);
    }

    public static boolean startDecoupleCoreIfNeeded() {
        TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded closeStableCore ");
        return false;
    }

    public static boolean startDecoupleCoreIfNeededImpl() {
        TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded ");
        if (TbsShareManager.isThirdPartyApp(c)) {
            return false;
        }
        TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded #1");
        m.a(c);
        m.b(c);
        if (a(c) || d == null) {
            return false;
        }
        TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded #2");
        if (System.currentTimeMillis() - TbsDownloadConfig.getInstance(c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, 0L) < TbsDownloadConfig.getInstance(c).getRetryInterval() * 1000) {
            return false;
        }
        TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded #3");
        int i2 = TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
        int tbsStableCoreVersion = com.tencent.smtt.utils.r.b(c) ? TbsShareManager.getTbsStableCoreVersion(c, 0) : p.a().i(c);
        TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded coreVersionForThirdApp is " + tbsStableCoreVersion + " deCoupleCoreVersion is " + i2);
        if (i2 <= 0 || i2 <= tbsStableCoreVersion) {
            TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded no need, deCoupleCoreVersion is " + i2 + " localStableCoreVersion is " + tbsStableCoreVersion);
        } else if (a(i2, tbsStableCoreVersion, 0)) {
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(c);
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_CPUTYPE_OTHER_STABLE_CORE, 0);
            tbsDownloadConfig.commit();
            TbsLog.i(LOGTAG, "startDecoupleCoreIfNeededImpl stable core " + i2 + " copy from old backup and return ");
            StringBuilder sb = new StringBuilder("oldcore=is=");
            sb.append(tbsStableCoreVersion);
            String sb2 = sb.toString();
            com.tencent.smtt.utils.r.b(c, "copy_my_cpu_core_ok", sb2 + "_newcore=is=" + i2);
            return false;
        } else if (TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) != i2 || TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, 0) == 1) {
            TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded #4");
            a = true;
            d.removeMessages(108);
            Message obtain = Message.obtain(d, 108, QbSdk.n);
            obtain.arg1 = 0;
            obtain.sendToTarget();
            TbsDownloadConfig.getInstance(c).mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, Long.valueOf(System.currentTimeMillis()));
            return true;
        } else {
            TbsLog.i(LOGTAG, "startDecoupleCoreIfNeeded no need, KEY_TBS_DOWNLOAD_V is " + TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) + " deCoupleCoreVersion is " + i2 + " KEY_TBS_DOWNLOAD_V_TYPE is " + TbsDownloadConfig.getInstance(c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, 0));
        }
        return false;
    }

    public static void startDownload(Context context) {
        startDownload(context, false);
    }

    public static synchronized void startDownload(Context context, boolean z) {
        synchronized (TbsDownloader.class) {
            TbsLog.initIfNeed(context);
            TbsDownloadUpload tbsDownloadUpload = TbsDownloadUpload.getInstance(context);
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_STARTDOWNLOAD_CODE, 160);
            tbsDownloadUpload.commit();
            TbsLog.i(LOGTAG, "[TbsDownloader.startDownload] sAppContext=" + c);
            if (p.b) {
                tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_STARTDOWNLOAD_CODE, Integer.valueOf((int) TbsListener.ErrorCode.STARTDOWNLOAD_2));
                tbsDownloadUpload.commit();
                return;
            }
            p.a().b(context, g.a == 0);
            int b2 = p.a().b(context);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],renameRet=" + b2);
            if (b2 != 0) {
                TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
                tbsLogInfo.a = 129;
                tbsLogInfo.setFailDetail("code=2" + b2);
                TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_SDK_REPORT_INFO, tbsLogInfo);
            }
            if (b2 < 0) {
                TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needReNameFile=" + b2);
                return;
            }
            a = true;
            Context applicationContext = context.getApplicationContext();
            c = applicationContext;
            TbsDownloadConfig.getInstance(applicationContext).setDownloadInterruptCode(-200);
            if (Build.VERSION.SDK_INT < 8) {
                QbSdk.n.onDownloadFinish(110);
                TbsDownloadConfig.getInstance(c).setDownloadInterruptCode(CatMonitorManager.UNKNOWN_ERROR_CODE);
                tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_STARTDOWNLOAD_CODE, Integer.valueOf((int) TbsListener.ErrorCode.STARTDOWNLOAD_3));
                tbsDownloadUpload.commit();
                return;
            }
            d();
            if (i) {
                QbSdk.n.onDownloadFinish(121);
                TbsDownloadConfig.getInstance(c).setDownloadInterruptCode(-202);
                tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_STARTDOWNLOAD_CODE, Integer.valueOf((int) TbsListener.ErrorCode.STARTDOWNLOAD_4));
                tbsDownloadUpload.commit();
                return;
            }
            if (z) {
                stopDownload();
            }
            d.removeMessages(101);
            d.removeMessages(100);
            Message obtain = Message.obtain(d, 101, QbSdk.n);
            obtain.arg1 = z ? 1 : 0;
            obtain.sendToTarget();
        }
    }

    public static void stopDownload() {
        if (i) {
            return;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.stopDownload]");
        if (g != null) {
            g.b();
        }
        if (d != null) {
            d.removeMessages(100);
            d.removeMessages(101);
            d.removeMessages(108);
        }
    }
}
