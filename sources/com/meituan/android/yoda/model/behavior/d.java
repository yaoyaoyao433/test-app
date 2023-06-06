package com.meituan.android.yoda.model.behavior;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb8f2b561d2672ddfaabe5253e451a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb8f2b561d2672ddfaabe5253e451a2c");
            return;
        }
        com.meituan.android.yoda.model.behavior.collection.b a2 = com.meituan.android.yoda.model.behavior.collection.b.a();
        Object[] objArr2 = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.model.behavior.collection.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "18fc487717ff4cacdeab6e8ce37af302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "18fc487717ff4cacdeab6e8ce37af302");
        } else if (hashMap == null || hashMap.containsKey("_token")) {
        } else {
            a2.c = false;
            HashMap hashMap2 = new HashMap(16);
            hashMap2.put("sT", Long.valueOf(a2.b()));
            Activity a3 = com.meituan.android.yoda.model.behavior.tool.a.a();
            if (y.a(a3)) {
                a3 = null;
            }
            hashMap2.put("bI", a3 == null ? "[]" : x.a(a3).toString());
            hashMap2.put("brR", com.meituan.android.yoda.model.behavior.tool.a.b() == null ? "[]" : b.a(com.meituan.android.yoda.model.behavior.tool.a.b()));
            Object[] objArr3 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.model.behavior.collection.b.a;
            hashMap2.put("aT", PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1359fa261f2de87b654d7c15912abcf9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1359fa261f2de87b654d7c15912abcf9") : Arrays.toString(a2.e.a(true)));
            Object[] objArr4 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.yoda.model.behavior.collection.b.a;
            hashMap2.put("kT", PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "4bc37fdcedcd233cb9a11598ec60da8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "4bc37fdcedcd233cb9a11598ec60da8b") : Arrays.toString(a2.f.a(true)));
            Object[] objArr5 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.yoda.model.behavior.collection.b.a;
            hashMap2.put("tT", PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "a6106554e5162f40546abb5364560ac0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "a6106554e5162f40546abb5364560ac0") : Arrays.toString(a2.g.a(true)));
            Object[] objArr6 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.yoda.model.behavior.collection.b.a;
            hashMap2.put("gT", PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "9d506b1f7e04d0ab7c0af082c1805c14", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "9d506b1f7e04d0ab7c0af082c1805c14") : Arrays.toString(a2.h.a(true)));
            hashMap2.put(Message.CTS, Long.valueOf(System.currentTimeMillis()));
            hashMap2.put(DeviceInfo.SIGN, com.meituan.android.yoda.model.behavior.tool.c.a(hashMap));
            try {
                String envCheckDyn = MTGuard.getEnvCheckDyn();
                boolean isEmu = MTGuard.isEmu();
                boolean isRoot = MTGuard.isRoot();
                boolean hasMalware = MTGuard.hasMalware();
                boolean isDarkSystem = MTGuard.isDarkSystem();
                boolean isVirtualLocation = MTGuard.isVirtualLocation();
                boolean isRemoteCall = MTGuard.isRemoteCall();
                boolean isSigCheckOK = MTGuard.isSigCheckOK();
                boolean inSandBox = MTGuard.inSandBox();
                boolean isHook = MTGuard.isHook();
                boolean isDebug = MTGuard.isDebug();
                boolean isProxy = MTGuard.isProxy();
                boolean isCameraHack = MTGuard.isCameraHack();
                hashMap2.put("isEmu", Boolean.valueOf(isEmu));
                hashMap2.put("isRoot", Boolean.valueOf(isRoot));
                hashMap2.put("hasMalware", Boolean.valueOf(hasMalware));
                hashMap2.put("isDarkSystem", Boolean.valueOf(isDarkSystem));
                hashMap2.put("isVirtualLocation", Boolean.valueOf(isVirtualLocation));
                hashMap2.put("isRemoteCall", Boolean.valueOf(isRemoteCall));
                hashMap2.put("isSigCheckOK", Boolean.valueOf(isSigCheckOK));
                hashMap2.put("inSandBox", Boolean.valueOf(inSandBox));
                hashMap2.put("isHook", Boolean.valueOf(isHook));
                hashMap2.put("isDebug", Boolean.valueOf(isDebug));
                hashMap2.put("isProxy", Boolean.valueOf(isProxy));
                hashMap2.put("isCameraHack", Boolean.valueOf(isCameraHack));
                hashMap2.put("evD", envCheckDyn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a2.c = true;
            hashMap.put("_token", com.meituan.android.yoda.model.behavior.tool.c.a(new JSONObject(hashMap2).toString()));
        }
    }
}
