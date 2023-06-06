package com.meituan.android.recce.host;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.recce.bridge.RecceInterface;
import com.meituan.android.recce.bridge.a;
import com.meituan.android.recce.bridge.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceBridgeHandler {
    public static final String RECCE_BRIDGE_ARGS_SEPARATOR = "\\|";
    public static final int RECCE_BRIDGE_STATUS_CODE_FAIL = 400;
    public static final int RECCE_BRIDGE_STATUS_CODE_SUCCESS = 200;
    private static final String TAG = "RecceBridgeHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final a bridgeManager;

    public RecceBridgeHandler(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "724b8ab54545f045c579b36a92e91261", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "724b8ab54545f045c579b36a92e91261");
        } else {
            this.bridgeManager = aVar;
        }
    }

    public final void asyncInvokeBridge(String str, String str2, AsyncCallback asyncCallback) {
        Object[] objArr = {str, str2, asyncCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec4ba142e38479edd8ab1a422778c44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec4ba142e38479edd8ab1a422778c44a");
            return;
        }
        try {
            Object recceInterface = getRecceInterface(str);
            Method bridgeMethod = getBridgeMethod(str, recceInterface);
            bridgeMethod.invoke(recceInterface, generateParams(bridgeMethod.getParameterTypes(), str2.split(RECCE_BRIDGE_ARGS_SEPARATOR), asyncCallback));
        } catch (Exception e) {
            Log.e(TAG, "asyncInvokeBridge: " + str + StringUtil.SPACE + str2, e);
            asyncCallback.send(e.toString().getBytes());
        }
    }

    public final byte[] syncInvokeBridge(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29e4b0a9719346229a9609e5a863fbc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29e4b0a9719346229a9609e5a863fbc6");
        }
        try {
            Object recceInterface = getRecceInterface(str);
            Method bridgeMethod = getBridgeMethod(str, recceInterface);
            Object invoke = bridgeMethod.invoke(recceInterface, generateParams(bridgeMethod.getParameterTypes(), str2.split(RECCE_BRIDGE_ARGS_SEPARATOR), null));
            if (invoke instanceof byte[]) {
                return buildResult(200, "", new String((byte[]) invoke)).getBytes();
            }
            throw new Exception(str + " return type is not byte[]");
        } catch (Exception e) {
            Log.e(TAG, "syncInvokeBridge: " + str + StringUtil.SPACE + str2, e);
            return e.toString().getBytes();
        }
    }

    private Object getRecceInterface(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4399a613692314d9b954790ca0e619", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4399a613692314d9b954790ca0e619");
        }
        if (TextUtils.isEmpty(str)) {
            throw new Exception("interface name is null");
        }
        Object a = this.bridgeManager.a(str);
        if (a != null) {
            return a;
        }
        throw new Exception("interface \"" + str + "\" has not been registered");
    }

    private Method getBridgeMethod(String str, Object obj) throws Exception {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f3a4cf8548e59a8a25d16f466832a54", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f3a4cf8548e59a8a25d16f466832a54");
        }
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        if (declaredMethods.length <= 0) {
            throw new Exception("interface \"" + str + "\" has no implementation");
        }
        for (Method method : declaredMethods) {
            RecceInterface recceInterface = (RecceInterface) method.getAnnotation(RecceInterface.class);
            if (Build.VERSION.SDK_INT >= 24) {
                recceInterface = (RecceInterface) method.getDeclaredAnnotation(RecceInterface.class);
            }
            if (recceInterface != null) {
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                return method;
            }
        }
        throw new Exception("interface \"" + str + "\" method not found");
    }

    private Object[] generateParams(Class<?>[] clsArr, String[] strArr, AsyncCallback asyncCallback) {
        Object[] objArr = {clsArr, strArr, asyncCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27a0bb62f502be5495b555975382c03", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27a0bb62f502be5495b555975382c03");
        }
        Object[] objArr2 = new Object[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i].equals(Integer.TYPE) || clsArr[i].equals(Integer.class)) {
                objArr2[i] = Integer.valueOf(Integer.parseInt(strArr[i]));
            } else if (clsArr[i].equals(Boolean.TYPE) || clsArr[i].equals(Boolean.class)) {
                objArr2[i] = Boolean.valueOf(Boolean.parseBoolean(strArr[i]));
            } else if (clsArr[i].equals(Float.TYPE) || clsArr[i].equals(Float.class)) {
                objArr2[i] = Float.valueOf(Float.parseFloat(strArr[i]));
            } else if (clsArr[i].equals(Double.TYPE) || clsArr[i].equals(Double.class)) {
                objArr2[i] = Double.valueOf(Double.parseDouble(strArr[i]));
            } else if (clsArr[i].equals(Character.TYPE) || clsArr[i].equals(Character.class)) {
                objArr2[i] = Character.valueOf(strArr[i].charAt(0));
            } else if (clsArr[i].equals(Long.TYPE) || clsArr[i].equals(Long.class)) {
                objArr2[i] = Long.valueOf(Long.parseLong(strArr[i]));
            } else if (clsArr[i].equals(Short.TYPE) || clsArr[i].equals(Short.class)) {
                objArr2[i] = Short.valueOf(Short.parseShort(strArr[i]));
            } else if (clsArr[i].equals(String.class)) {
                objArr2[i] = strArr[i];
            } else if (clsArr[i].equals(JsonArray.class)) {
                objArr2[i] = new JsonParser().parse(strArr[i]).getAsJsonArray();
            } else if (clsArr[i].equals(JsonObject.class)) {
                objArr2[i] = new JsonParser().parse(strArr[i]).getAsJsonObject();
            } else if (clsArr[i].equals(c.class)) {
                objArr2[i] = new RecceInterfaceCallbackInternal(asyncCallback);
            } else {
                Log.e(TAG, "recce bridge do not support args of type " + clsArr[i]);
            }
        }
        return objArr2;
    }

    private byte[] getReturnData(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31dfc8f5851e7bb380166fef29721da7", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31dfc8f5851e7bb380166fef29721da7") : buildResult(i, str, str2).getBytes();
    }

    public String buildResult(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7d0c55995c88612b894ca54949d1125", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7d0c55995c88612b894ca54949d1125");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("code", Integer.valueOf(i));
        jsonObject.addProperty("msg", str);
        jsonObject.addProperty("data", str2);
        return jsonObject.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class RecceInterfaceCallbackInternal implements c {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final AsyncCallback asyncCallback;

        public RecceInterfaceCallbackInternal(AsyncCallback asyncCallback) {
            RecceBridgeHandler.this = r11;
            Object[] objArr = {r11, asyncCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77b092310c9079cb9a994f7c9be91414", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77b092310c9079cb9a994f7c9be91414");
            } else {
                this.asyncCallback = asyncCallback;
            }
        }

        private void send(int i, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16501f3f213aa165067033a11cbec9d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16501f3f213aa165067033a11cbec9d1");
            } else {
                new Handler().post(RecceBridgeHandler$RecceInterfaceCallbackInternal$$Lambda$1.lambdaFactory$(this, i, str, str2));
            }
        }

        public static /* synthetic */ void lambda$send$0(RecceInterfaceCallbackInternal recceInterfaceCallbackInternal, int i, String str, String str2) {
            Object[] objArr = {recceInterfaceCallbackInternal, Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ded47336a785368b8f21776d95d7ba77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ded47336a785368b8f21776d95d7ba77");
            } else {
                recceInterfaceCallbackInternal.asyncCallback.send(RecceBridgeHandler.this.buildResult(i, str, str2).getBytes());
            }
        }

        @Override // com.meituan.android.recce.bridge.c
        public void onSuccess(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f467d18024852ee856d65d11e53a9611", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f467d18024852ee856d65d11e53a9611");
            } else {
                send(200, "success", str);
            }
        }

        public void onFail(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88d6c75eefb7ea6e7bcb62aa3f8c7542", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88d6c75eefb7ea6e7bcb62aa3f8c7542");
            } else {
                onFail(400, str, "");
            }
        }

        @Override // com.meituan.android.recce.bridge.c
        public void onFail(int i, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a52bd008e18b9d4740ea36ee4a8b0b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a52bd008e18b9d4740ea36ee4a8b0b5");
            } else {
                send(i, str, str2);
            }
        }
    }
}
