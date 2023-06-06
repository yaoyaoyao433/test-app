package com.meituan.android.common.statistics.ipc;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestDispatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Gson gson;

    public RequestDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9a817c63928e5deee5313d34d4ef5c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9a817c63928e5deee5313d34d4ef5c1");
        } else {
            this.gson = new Gson();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class SingletonHolder {
        private static final RequestDispatcher INSTANCE = new RequestDispatcher();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static RequestDispatcher getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "181662593a6e50a82dffaae982a9548e", 6917529027641081856L) ? (RequestDispatcher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "181662593a6e50a82dffaae982a9548e") : SingletonHolder.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0919 A[Catch: Throwable -> 0x09b8, JSONException -> 0x09d3, TryCatch #2 {JSONException -> 0x09d3, blocks: (B:14:0x006e, B:16:0x007a, B:18:0x0087, B:20:0x0093, B:21:0x00a6, B:23:0x00ac, B:24:0x00ae, B:25:0x00b1, B:162:0x05b6, B:26:0x00b5, B:28:0x00bd, B:30:0x00c6, B:33:0x00db, B:34:0x00ea, B:31:0x00ce, B:36:0x00fe, B:38:0x010f, B:39:0x0114, B:41:0x011a, B:43:0x012e, B:45:0x013c, B:46:0x0156, B:48:0x015c, B:50:0x0170, B:52:0x017e, B:53:0x0198, B:55:0x019e, B:57:0x01b2, B:59:0x01c0, B:60:0x01c5, B:62:0x01d1, B:63:0x025c, B:72:0x0288, B:73:0x02ca, B:75:0x02d2, B:77:0x02db, B:80:0x02f0, B:81:0x02ff, B:78:0x02e3, B:82:0x0311, B:84:0x0317, B:86:0x033a, B:89:0x0342, B:91:0x0348, B:92:0x0369, B:94:0x036f, B:95:0x0390, B:97:0x0396, B:98:0x03b7, B:100:0x03bd, B:101:0x03de, B:103:0x03e4, B:104:0x0405, B:106:0x040b, B:107:0x041e, B:108:0x042b, B:110:0x0432, B:112:0x0436, B:113:0x0447, B:114:0x0458, B:116:0x045c, B:117:0x046b, B:118:0x047c, B:120:0x049c, B:122:0x04ad, B:124:0x04b3, B:126:0x04ba, B:130:0x04cb, B:131:0x04d2, B:133:0x04d8, B:135:0x04ed, B:134:0x04e3, B:138:0x0501, B:140:0x0512, B:142:0x0522, B:144:0x0534, B:147:0x0549, B:149:0x054f, B:152:0x0567, B:154:0x057f, B:156:0x058f, B:157:0x0593, B:159:0x0599, B:164:0x05cd, B:166:0x05d4, B:167:0x05d8, B:168:0x05db, B:241:0x0878, B:169:0x05df, B:171:0x05f5, B:173:0x060b, B:175:0x0621, B:178:0x0639, B:183:0x0655, B:185:0x0667, B:187:0x066e, B:190:0x067d, B:193:0x069c, B:195:0x06aa, B:196:0x06b6, B:198:0x06cc, B:200:0x06e2, B:202:0x06f8, B:204:0x070e, B:207:0x0726, B:209:0x073b, B:211:0x0750, B:212:0x075d, B:214:0x0767, B:216:0x0772, B:219:0x077d, B:221:0x079b, B:223:0x07f2, B:225:0x0816, B:227:0x0825, B:228:0x082a, B:229:0x082f, B:232:0x0847, B:234:0x0854, B:240:0x0873, B:243:0x088f, B:249:0x089d, B:250:0x08a0, B:253:0x08bb, B:255:0x08d3, B:256:0x08e3, B:259:0x08ff, B:260:0x090e, B:262:0x0919, B:265:0x0940, B:267:0x0952, B:269:0x096b, B:271:0x0977, B:273:0x0988, B:275:0x099c), top: B:291:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meituan.android.common.statistics.ipc.DataResponse dispatchRequest(android.content.Context r31, com.meituan.android.common.statistics.ipc.DataRequest r32) {
        /*
            Method dump skipped, instructions count: 2702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.ipc.RequestDispatcher.dispatchRequest(android.content.Context, com.meituan.android.common.statistics.ipc.DataRequest):com.meituan.android.common.statistics.ipc.DataResponse");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class OptionBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mCategory;
        public int mOpType;
        public String mPageInfoKey;
        public Boolean mWithPageInfo;

        public OptionBean(String str, String str2, Boolean bool, int i) {
            Object[] objArr = {str, str2, bool, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8494421d57fd479ac27591a681aa764d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8494421d57fd479ac27591a681aa764d");
                return;
            }
            this.mCategory = str;
            this.mPageInfoKey = str2;
            this.mWithPageInfo = bool;
            this.mOpType = i;
        }

        public static OptionBean fromJson(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5ec0954a3b99f21d43f84a0796e8298", 6917529027641081856L)) {
                return (OptionBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5ec0954a3b99f21d43f84a0796e8298");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new OptionBean(jSONObject.optString("category", ""), jSONObject.optString("pageInfoKey", ""), Boolean.valueOf(jSONObject.optBoolean("withPageInfo", false)), jSONObject.optInt("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT));
            } catch (JSONException unused) {
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }
}
