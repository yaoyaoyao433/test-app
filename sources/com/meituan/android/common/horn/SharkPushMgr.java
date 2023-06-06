package com.meituan.android.common.horn;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.dianping.titans.utils.Constants;
import com.meituan.android.common.horn.extra.sharkpush.ISharkPushListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SharkPushMgr {
    private static final String COMMAND = "horn_single|horn_multiple";
    private static final String COMMAND_TEST = "horn_test";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, MsgCallback> mPushCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SharkPushMgrHolder {
        private static final SharkPushMgr INSTANCE = new SharkPushMgr();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public SharkPushMgr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba54a80991e9b31363b9b6228ea66065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba54a80991e9b31363b9b6228ea66065");
        } else {
            this.mPushCallback = new ConcurrentHashMap();
        }
    }

    public static SharkPushMgr getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be2612067147255af2ffe18eb0872943", 6917529027641081856L) ? (SharkPushMgr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be2612067147255af2ffe18eb0872943") : SharkPushMgrHolder.INSTANCE;
    }

    public void optPushCallback(String str, MsgCallback msgCallback) {
        Object[] objArr = {str, msgCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ddb87a37c9d50fd0dcea9e607a5ae2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ddb87a37c9d50fd0dcea9e607a5ae2f");
        } else if (msgCallback == null) {
        } else {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.mPushCallback.put(str, msgCallback);
            } catch (Throwable th) {
                if (InnerHorn.isDebug) {
                    th.printStackTrace();
                }
            }
        }
    }

    public boolean init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab4770512df09a62612fc35a26c71fe5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab4770512df09a62612fc35a26c71fe5")).booleanValue();
        }
        HornConfiguration config = InnerHorn.getConfig();
        if (config.sharkPushService() == null) {
            Logw.e(Logw.TAG, "Horn.config.sharkPushService() is null, sharkPush init failed.");
            return false;
        }
        try {
            config.sharkPushService().init(InnerHorn.context);
            final String str = !InnerHorn.isDebug ? COMMAND : COMMAND_TEST;
            int registerPush = config.sharkPushService().registerPush(str, new ISharkPushListener() { // from class: com.meituan.android.common.horn.SharkPushMgr.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.extra.sharkpush.ISharkPushListener
                public void onReceive(String str2, byte[] bArr) {
                    MsgCallback msgCallback;
                    Object[] objArr2 = {str2, bArr};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4897a1941295b6ce336e0f7d5036ede0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4897a1941295b6ce336e0f7d5036ede0");
                        return;
                    }
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        Logw.d(Logw.TAG, "shark push receive message from command:" + str2);
                        Logw.d(Logw.TAG, "cmd:" + str2 + ", bytes:" + new String(bArr));
                        String str3 = new String(bArr);
                        String string = new JSONObject(str3).getString("from");
                        Logw.d(Logw.TAG, string + "::success::receivePush::" + currentTimeMillis);
                        HashMap hashMap = new HashMap();
                        hashMap.put("source", "sharkpush");
                        hashMap.put(Constants.HTTP_HEADER_KEY_E_TAG, "");
                        hashMap.put("key", "receive_push");
                        hashMap.put(GetAppInfoJsHandler.EXTRA_EXTRAS, str2 + "::" + str3);
                        hashMap.put("value", "1");
                        hashMap.put("from", string);
                        hashMap.put("ts", Long.valueOf(currentTimeMillis));
                        if (!str.contains(str2) || (msgCallback = (MsgCallback) SharkPushMgr.this.mPushCallback.get(string)) == null) {
                            return;
                        }
                        msgCallback.MsgArrives(0, string, hashMap);
                    } catch (Throwable th) {
                        if (InnerHorn.isDebug) {
                            th.printStackTrace();
                        }
                    }
                }

                @Override // com.meituan.android.common.horn.extra.sharkpush.ISharkPushListener
                public void onError(String str2, int i, String str3) {
                    Object[] objArr2 = {str2, Integer.valueOf(i), str3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c3ab05a9818a18e97f87c27122a982f3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c3ab05a9818a18e97f87c27122a982f3");
                        return;
                    }
                    Logw.e(Logw.TAG, "cmd:" + str2);
                    Logw.e(Logw.TAG, "code:" + i);
                    Logw.e(Logw.TAG, "errorMsg:" + str3);
                }
            });
            Logw.e(Logw.TAG, "registerPush result:" + registerPush);
            Logw.e(Logw.TAG, "registerPush successfully");
            return true;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            Logw.e(Logw.TAG, "registerPush failed");
            return false;
        }
    }
}
