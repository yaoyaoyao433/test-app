package com.sankuai.waimai.business.im.common.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    @Nullable
    public static <T> T a(GeneralMessage generalMessage, Class<T> cls) {
        Object[] objArr = {generalMessage, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0512d4e2ea98202f5ddbd50e2d37779a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0512d4e2ea98202f5ddbd50e2d37779a");
        }
        if (generalMessage == null || generalMessage.getData() == null) {
            return null;
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return (T) new GsonBuilder().registerTypeAdapter(cls, new GsonTypeAdapter()).create().fromJson(new JSONObject(new String(data, "utf-8")).optString("data"), (Class<Object>) cls);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return null;
    }

    @Nullable
    public static <T> T b(GeneralMessage generalMessage, Class<T> cls) {
        Object[] objArr = {generalMessage, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b79fd94bf30a7e75ddf93762397eceab", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b79fd94bf30a7e75ddf93762397eceab");
        }
        if (generalMessage == null || generalMessage.getData() == null) {
            return null;
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return (T) new GsonBuilder().registerTypeAdapter(cls, new GsonTypeAdapter()).create().fromJson(new String(data, "utf-8"), (Class<Object>) cls);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return null;
    }

    public static int a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a31af50bfc7b79af7bbeb0cdc3b924a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a31af50bfc7b79af7bbeb0cdc3b924a")).intValue();
        }
        try {
            long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            String b = com.meituan.android.base.util.a.b(System.currentTimeMillis());
            return com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, d + str + b, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77bd985396fa920e3d7743d7dfae8458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77bd985396fa920e3d7743d7dfae8458");
            return;
        }
        try {
            String str2 = com.sankuai.waimai.platform.domain.manager.user.a.i().d() + str + com.meituan.android.base.util.a.b(System.currentTimeMillis());
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, str, ""));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, str2);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str2, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
