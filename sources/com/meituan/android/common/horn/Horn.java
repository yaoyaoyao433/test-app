package com.meituan.android.common.horn;

import android.content.Context;
import com.meituan.android.common.horn.extra.sharkpush.ISharkPushService;
import com.meituan.android.common.horn.extra.uuid.IUUIDService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Horn {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f496568750c60d4c6848ed77a829f32f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f496568750c60d4c6848ed77a829f32f");
        } else {
            InnerHorn.initContext(context);
        }
    }

    public static void init(Context context, HornConfiguration hornConfiguration) {
        Object[] objArr = {context, hornConfiguration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a962529b1ebacb2e00b79eedd1e703cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a962529b1ebacb2e00b79eedd1e703cf");
        } else {
            InnerHorn.initContext(context, hornConfiguration);
        }
    }

    public static void preload(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86f88f9fc2f796a7522909fe6c2026b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86f88f9fc2f796a7522909fe6c2026b3");
        } else {
            InnerHorn.preload(strArr);
        }
    }

    public static void preload(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b28ecc7f2bcd92954c48bc7ce43dbfc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b28ecc7f2bcd92954c48bc7ce43dbfc3");
        } else {
            InnerHorn.preload(str, map);
        }
    }

    public static void register(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c7274a51e59f15d5b73c65e456d4c8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c7274a51e59f15d5b73c65e456d4c8d");
        } else {
            InnerHorn.register(str, hornCallback);
        }
    }

    public static void registerBinaryFile(String str, BlobCallback blobCallback) {
        Object[] objArr = {str, blobCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad3f5da8f176b2b81f9b9bd822ed7fbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad3f5da8f176b2b81f9b9bd822ed7fbf");
        } else {
            InnerHorn.registerBinaryFile(str, blobCallback);
        }
    }

    public static void register(String str, HornCallback hornCallback, Map<String, Object> map) {
        Object[] objArr = {str, hornCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "addfda1906f013b1aa607c72d22d8a0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "addfda1906f013b1aa607c72d22d8a0e");
        } else {
            InnerHorn.register(str, hornCallback, map);
        }
    }

    public static void registerBinaryFile(String str, BlobCallback blobCallback, Map<String, Object> map) {
        Object[] objArr = {str, blobCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "335ce650ab2ef19a80291b8c7ba2d140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "335ce650ab2ef19a80291b8c7ba2d140");
        } else {
            InnerHorn.registerBinaryFile(str, blobCallback, map);
        }
    }

    public static void invalidateCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7d06a520598c6b2b93c2aa2affa0ba5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7d06a520598c6b2b93c2aa2affa0ba5");
        } else {
            InnerHorn.invalidateCache(str);
        }
    }

    public static void debug(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eac29452d8c0e87f061bea68b6818835", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eac29452d8c0e87f061bea68b6818835");
        } else {
            InnerHorn.debug(context, z);
        }
    }

    public static synchronized void debug(Context context, String str, boolean z) {
        synchronized (Horn.class) {
            Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7b15819ddd36eef17c3dedd7e9a6351", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7b15819ddd36eef17c3dedd7e9a6351");
            } else {
                InnerHorn.debug(context, str, z);
            }
        }
    }

    public static synchronized void clearCache(Context context, String str) {
        synchronized (Horn.class) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c6de4a99440fcd3affa8a7b66bfcbcb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c6de4a99440fcd3affa8a7b66bfcbcb");
            } else {
                InnerHorn.clearCache(context, str);
            }
        }
    }

    public static void mock(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb1b0393c42bbb1dd11dbc29609c2b2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb1b0393c42bbb1dd11dbc29609c2b2f");
        } else {
            InnerHorn.mock(context, z);
        }
    }

    public static void accessCache(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "723c637f0c75845c68d64c28f8ba5f85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "723c637f0c75845c68d64c28f8ba5f85");
        } else {
            InnerHorn.accessCache(str, hornCallback);
        }
    }

    public static String accessCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0946a1ae4a67abac81e77eeddb54145", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0946a1ae4a67abac81e77eeddb54145") : InnerHorn.accessCache(str);
    }

    public static void saveHornConfig(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ce668548f49ba0aadf23ac651ef6e00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ce668548f49ba0aadf23ac651ef6e00");
        } else {
            InnerHorn.saveHornConfig(str, str2);
        }
    }

    public static String accessBinaryFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a078fee8a19ed9f544376a662b6d9c4d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a078fee8a19ed9f544376a662b6d9c4d") : InnerHorn.accessBinaryFile(str);
    }

    public static void disablePoll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bdc0e39b48b9688a62ccdb2dbb39c59d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bdc0e39b48b9688a62ccdb2dbb39c59d");
        } else {
            InnerHorn.disablePoll();
        }
    }

    public static String getSdkVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f734387aaf7153e269c84e1bb77f438b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f734387aaf7153e269c84e1bb77f438b") : InnerHorn.getSdkVersion();
    }

    public static void setUUIDService(IUUIDService iUUIDService) {
        Object[] objArr = {iUUIDService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04a6524b15a263c8db0c55984b83b146", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04a6524b15a263c8db0c55984b83b146");
        } else {
            InnerHorn.setUUIDService(iUUIDService);
        }
    }

    public static void setSharkPushService(ISharkPushService iSharkPushService) {
        Object[] objArr = {iSharkPushService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "caf064f529d000e867d889c467bf41c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "caf064f529d000e867d889c467bf41c4");
        } else {
            InnerHorn.setSharkPushService(iSharkPushService);
        }
    }
}
