package com.dianping.picasso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.picasso.PicassoNotificationCenter;
import com.dianping.picasso.model.params.ImageViewParams;
import com.dianping.picassocontroller.debug.c;
import com.dianping.picassocontroller.debug.g;
import com.dianping.picassocontroller.jse.d;
import com.dianping.picassocontroller.jse.e;
import com.dianping.picassocontroller.jse.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static EnvironmentInterface environmentInterface;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface EnvironmentInterface {
        boolean isDebug();
    }

    @Deprecated
    public static void setDebugInfo(Context context, boolean z) {
    }

    @Deprecated
    public static void startDebugService(Context context) {
    }

    @Deprecated
    public static void stopDebugService(Context context) {
    }

    public static void setEnvironmentInterface(EnvironmentInterface environmentInterface2) {
        environmentInterface = environmentInterface2;
    }

    public static void setPicassoEnvironment(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e12d23de19e6d447b4622cc24df4e39e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e12d23de19e6d447b4622cc24df4e39e");
            return;
        }
        try {
            setPicassoEnvironment(context, Integer.parseInt(str), z);
        } catch (Exception unused) {
            setPicassoEnvironment(context, -1, z);
        }
    }

    public static void setPicassoEnvironment(Context context, int i, boolean z) {
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e462b7146c0a4fe7199933766e17fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e462b7146c0a4fe7199933766e17fed");
        } else {
            setPicassoEnvironment(context, i, z, null);
        }
    }

    public static void setPicassoEnvironment(Context context, int i, boolean z, String str) {
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "619e710aca560285fe90ed7cf45ea09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "619e710aca560285fe90ed7cf45ea09c");
            return;
        }
        PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(context);
        int i2 = picassoEnvironment.appID;
        picassoEnvironment.isDebug = z;
        picassoEnvironment.unionId = str;
        picassoEnvironment.appID = i;
        ParsingJSHelper.sPicassoEnvironment = picassoEnvironment;
        if (i != i2) {
            f.b(context);
        }
    }

    public static void initPicassoEngine(@NonNull Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e35954fde6377a9319db3543ce39fc58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e35954fde6377a9319db3543ce39fc58");
        } else {
            f.a(context, eVar);
        }
    }

    public static void setPicassoEngineFirstUseListener(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86694bdf57614423f992266cfde17d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86694bdf57614423f992266cfde17d08");
        } else {
            f.a(dVar);
        }
    }

    public static void setExtraJs(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7c1c5171e03e9e2e150a15eed6706e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7c1c5171e03e9e2e150a15eed6706e3");
        } else {
            ParsingJSHelper.setExtraJs(str);
        }
    }

    public static void setDefaultPlaceholders(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfc54f84c9292bcf3507af8145ace55e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfc54f84c9292bcf3507af8145ace55e");
        } else {
            ImageViewParams.setDefaultPlaceholders(i, i2, i3);
        }
    }

    public static void setClickListener(PicassoNotificationCenter.ClickListener clickListener) {
        Object[] objArr = {clickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fa20458f80e679a1dcf7bf8dfd1ee37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fa20458f80e679a1dcf7bf8dfd1ee37");
        } else {
            PicassoNotificationCenter.setBaseClickListeners(clickListener);
        }
    }

    public static void startDebugServiceDomain(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "209aeafe39fd8638363182b236865a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "209aeafe39fd8638363182b236865a0e");
            return;
        }
        c.a().a(str);
        c a = c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "d0356388848cd262607287e1ec69105f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "d0356388848cd262607287e1ec69105f");
            return;
        }
        if (TextUtils.isEmpty(a.c) && TextUtils.isEmpty(a.g)) {
            Log.e("LiveLoad", "没有 token 或者 domain, 请重新扫码");
        }
        if (!isDebuggable()) {
            Log.e("LiveLoad", "非Debug模式下不开启");
            return;
        }
        String str2 = TextUtils.isEmpty(g.c) ? "8882" : g.c;
        if (!com.dianping.picassocontroller.debug.e.a().b().booleanValue()) {
            a.d = true;
            a.b();
            com.dianping.picassocontroller.debug.e.a().a(g.b, str2);
        } else if (com.dianping.picassocontroller.debug.e.a().b.equals(str2)) {
        } else {
            com.dianping.picassocontroller.debug.e.a().a(4000, "");
            com.dianping.picassocontroller.debug.e.a().a(g.b, str2);
        }
    }

    public static boolean isDebugMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b327259b1f4b61b20b48eab91fb06ac0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b327259b1f4b61b20b48eab91fb06ac0")).booleanValue() : c.a().d;
    }

    public static boolean isDebuggable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92200dccff668480126796f9f4dcf6c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92200dccff668480126796f9f4dcf6c6")).booleanValue();
        }
        PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(PicassoEnvironment.globalContext);
        if (environmentInterface != null) {
            picassoEnvironment.isDebug = environmentInterface.isDebug();
        }
        return picassoEnvironment.isDebug;
    }

    public static void stopDebugService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2465e15dd3af29bdff2e807fcf1973bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2465e15dd3af29bdff2e807fcf1973bb");
            return;
        }
        c a = c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "6a3775b6f64cdefbc62174ed13db560e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "6a3775b6f64cdefbc62174ed13db560e");
            return;
        }
        a.d = false;
        a.f.clear();
        a.e = false;
        a.b.dispatcher().cancelAll();
        LocalBroadcastManager.getInstance(PicassoEnvironment.globalContext).unregisterReceiver(a.i);
    }

    @Deprecated
    public static boolean isDebugServiceStart(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b93dd254bcc05e8305ac25df1a8fb4aa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b93dd254bcc05e8305ac25df1a8fb4aa")).booleanValue() : isDebugMode();
    }

    @Deprecated
    public static boolean getDebugInfo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec45cfa630a00b206c13840393a98362", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec45cfa630a00b206c13840393a98362")).booleanValue() : isDebuggable();
    }

    @Deprecated
    public static boolean getDebugInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b4ef34dae104548b096cfa985557815", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b4ef34dae104548b096cfa985557815")).booleanValue() : isDebuggable();
    }
}
