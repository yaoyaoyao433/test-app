package com.meituan.mmp.lib.api.ui;

import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.mp.ipc.c;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.msc.modules.api.msi.api.PageBeforeUnloadParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MiniProgramApi extends ActivityApi {
    @SupportApiNames
    public static final String[] API_NAMES = {"navigateToMiniProgram", "navigateBackMiniProgram", "navigateBackNative", PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM};
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return API_NAMES;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02d0 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a0 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0266 A[Catch: Exception -> 0x047e, TryCatch #0 {Exception -> 0x047e, blocks: (B:6:0x002e, B:8:0x0038, B:10:0x0054, B:11:0x0059, B:13:0x0076, B:15:0x008f, B:16:0x0094, B:18:0x009e, B:19:0x00aa, B:21:0x00b0, B:23:0x00be, B:25:0x00ec, B:26:0x00f8, B:43:0x0133, B:44:0x0136, B:48:0x0142, B:50:0x0148, B:51:0x014e, B:45:0x0139, B:46:0x013c, B:47:0x0140, B:33:0x0112, B:36:0x011c, B:39:0x0127, B:52:0x0159, B:53:0x0164, B:55:0x0192, B:59:0x01a9, B:58:0x019b, B:60:0x01af, B:62:0x01b7, B:63:0x01d1, B:65:0x01d9, B:67:0x01e5, B:68:0x01eb, B:69:0x01f8, B:71:0x0201, B:74:0x021d, B:75:0x0222, B:77:0x022c, B:94:0x0261, B:96:0x0266, B:98:0x027d, B:99:0x0282, B:101:0x028c, B:111:0x02cb, B:103:0x029b, B:105:0x02a8, B:110:0x02c7, B:109:0x02c4, B:112:0x02d0, B:114:0x02e9, B:115:0x02ee, B:117:0x0303, B:119:0x0318, B:120:0x031e, B:122:0x0338, B:124:0x034c, B:126:0x036b, B:130:0x037e, B:132:0x0384, B:133:0x0393, B:127:0x036f, B:129:0x0377, B:123:0x0342, B:134:0x03a0, B:136:0x03b9, B:137:0x03be, B:139:0x03c8, B:160:0x0473, B:141:0x03d2, B:143:0x03da, B:145:0x03f9, B:146:0x03fd, B:148:0x0405, B:149:0x040c, B:151:0x0412, B:152:0x041c, B:154:0x0448, B:159:0x0462, B:155:0x0450, B:157:0x0458, B:84:0x0240, B:87:0x024b, B:90:0x0255, B:162:0x0478, B:163:0x047d, B:72:0x020e), top: B:167:0x002e, inners: #1, #2 }] */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r27, org.json.JSONObject r28, com.meituan.mmp.main.IApiCallback r29) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.ui.MiniProgramApi.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    public static /* synthetic */ Class f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a60ad407e55f3db360cb3869d3e9754", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a60ad407e55f3db360cb3869d3e9754") : WXAPIFactory.class;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends c<String> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.mmp.lib.mp.ipc.d
        public final /* synthetic */ Void a(Object[] objArr) throws Exception {
            String[] strArr = (String[]) objArr;
            Object[] objArr2 = {strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "0fda3f872329376a4b5122d290707b52", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "0fda3f872329376a4b5122d290707b52");
            }
            MMPEnvHelper.ensureFullInited();
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            if (com.meituan.mmp.lib.mp.a.f()) {
                AppBrandMonitor.ActivityRecord b = AppBrandMonitor.e.b(str);
                if (b != null) {
                    com.meituan.mmp.lib.mp.a b2 = b.b();
                    if (b2 == com.meituan.mmp.lib.mp.a.MAIN) {
                        a(str, str2, str3);
                        return null;
                    }
                    new a().a(b2, str, str2, str3);
                    return null;
                }
                return null;
            }
            a(str, str2, str3);
            return null;
        }

        private void a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2454612f78b0cd680e5e4ec2f6c80c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2454612f78b0cd680e5e4ec2f6c80c6");
                return;
            }
            HeraActivity a2 = AppBrandMonitor.e.a(str);
            if (a2 != null) {
                a2.d().b(str2, str3);
            }
        }
    }
}
