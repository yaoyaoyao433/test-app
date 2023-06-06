package com.sankuai.waimai.business.im.mach;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class IMMachNativeModule implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    protected Context b;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmimmach";
    }

    public IMMachNativeModule(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7858b8343c5332d1bb0494f627116d8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7858b8343c5332d1bb0494f627116d8e");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864bb3b38976b5fea0f76102f3a3b15d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864bb3b38976b5fea0f76102f3a3b15d") : new String[]{"currentDate", "cache"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        char c;
        Object obj;
        Object obj2;
        Object b;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbbe946339166e62a453009c7a29c46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbbe946339166e62a453009c7a29c46");
        } else if (!TextUtils.isEmpty(str) || aa.a(str2)) {
            int hashCode = str.hashCode();
            if (hashCode != 94416770) {
                if (hashCode == 600751303 && str.equals("currentDate")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals("cache")) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    CallbackDateInfo callbackDateInfo = new CallbackDateInfo();
                    ResponseDateText responseDateText = new ResponseDateText();
                    callbackDateInfo.content = com.meituan.android.time.c.b() / 1000;
                    responseDateText.data = callbackDateInfo;
                    aVar.a(str3, com.sankuai.waimai.mach.utils.b.a().toJson(responseDateText));
                    return;
                case 1:
                    CallbackMapInfo callbackMapInfo = new CallbackMapInfo();
                    ResponseDataMap responseDataMap = new ResponseDataMap();
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e367a8a48f885925f3e69ff06c6c9363", RobustBitConfig.DEFAULT_VALUE)) {
                        obj = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e367a8a48f885925f3e69ff06c6c9363");
                    } else {
                        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str2);
                        if (a2 != null && a2.containsKey("state")) {
                            int a3 = r.a(String.valueOf(a2.get("type")), -1);
                            Object obj3 = a2.get("state");
                            switch (a3) {
                                case 0:
                                    Object[] objArr3 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "086cc37b4393f4df1f40e7a43def578e", RobustBitConfig.DEFAULT_VALUE)) {
                                        if (obj3 instanceof Map) {
                                            Map map = (Map) obj3;
                                            break;
                                        }
                                    } else {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "086cc37b4393f4df1f40e7a43def578e");
                                        break;
                                    }
                                    break;
                                case 1:
                                    Object[] objArr4 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a44fa744c9b84e7aac0683529c9368fb", RobustBitConfig.DEFAULT_VALUE)) {
                                        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map2 != null) {
                                            String valueOf = String.valueOf(map2.get("stateKey"));
                                            if (!TextUtils.isEmpty(valueOf)) {
                                                Object obj4 = map2.get("stateValue");
                                                if (obj4 == null || "".equals(obj4)) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, (String) null);
                                                    break;
                                                } else if (obj4 instanceof Boolean) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, ((Boolean) obj4).booleanValue());
                                                    break;
                                                } else if (obj4 instanceof String) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, (String) obj4);
                                                    break;
                                                } else if (obj4 instanceof Integer) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, ((Integer) obj4).intValue());
                                                    break;
                                                } else if (obj4 instanceof Long) {
                                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf, ((Long) obj4).longValue());
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a44fa744c9b84e7aac0683529c9368fb");
                                        break;
                                    }
                                    break;
                                case 2:
                                    Object[] objArr5 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8b34b9a6b940c4366d4daf2a6e24ca2b", RobustBitConfig.DEFAULT_VALUE)) {
                                        Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map3 != null) {
                                            String valueOf2 = String.valueOf(map3.get("stateKey"));
                                            if (!TextUtils.isEmpty(valueOf2)) {
                                                Object obj5 = map3.get("stateValue");
                                                if (obj5 == null || "".equals(obj5)) {
                                                    b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, (String) null);
                                                } else if (obj5 instanceof Boolean) {
                                                    b = Boolean.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, ((Boolean) obj5).booleanValue()));
                                                } else if (obj5 instanceof String) {
                                                    b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, (String) obj5);
                                                } else if (obj5 instanceof Integer) {
                                                    b = Integer.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, ((Integer) obj5).intValue()));
                                                } else if (obj5 instanceof Long) {
                                                    b = Long.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, valueOf2, ((Long) obj5).longValue()));
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        obj = obj2;
                                        break;
                                    } else {
                                        b = PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8b34b9a6b940c4366d4daf2a6e24ca2b");
                                    }
                                    obj2 = b;
                                    obj = obj2;
                                    break;
                                case 3:
                                    Object[] objArr6 = {obj3};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5a9965d7f4a209f82e1ce829810d8bf8", RobustBitConfig.DEFAULT_VALUE)) {
                                        Map map4 = obj3 instanceof Map ? (Map) obj3 : null;
                                        if (map4 != null) {
                                            String valueOf3 = String.valueOf(map4.get("stateKey"));
                                            if (!TextUtils.isEmpty(valueOf3)) {
                                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, valueOf3);
                                                break;
                                            }
                                        }
                                    } else {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5a9965d7f4a209f82e1ce829810d8bf8");
                                        break;
                                    }
                                    break;
                            }
                        }
                        obj = null;
                    }
                    callbackMapInfo.content = obj;
                    responseDataMap.data = callbackMapInfo;
                    aVar.a(str3, com.sankuai.waimai.mach.utils.b.a().toJson(responseDataMap));
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class CallbackDateInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public long content;

        public CallbackDateInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class CallbackMapInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public Object content;

        public CallbackMapInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class ResponseDateText {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackDateInfo data;
        public int status;

        public ResponseDateText() {
            this.status = 0;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class ResponseDataMap {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackMapInfo data;
        public int status;

        public ResponseDataMap() {
            this.status = 0;
        }
    }
}
