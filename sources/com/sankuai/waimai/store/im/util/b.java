package com.sankuai.waimai.store.im.util;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.s;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static String b;

    public static boolean a(int i) {
        return i == 125 || i == 128;
    }

    @Nullable
    public static <T> T a(GeneralMessage generalMessage, Class<T> cls) {
        Object[] objArr = {generalMessage, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5df7aa26b2e71c0f9590e2312ef45f3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5df7aa26b2e71c0f9590e2312ef45f3f");
        }
        if (generalMessage == null || generalMessage.getData() == null) {
            return null;
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return (T) i.a().fromJson(new JSONObject(new String(data, "utf-8")).optString("data"), (Class<Object>) cls);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.im.base.log.b.a("gson转换失败 ", generalMessage);
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return null;
    }

    @Nullable
    public static <T> T b(GeneralMessage generalMessage, Class<T> cls) {
        Object[] objArr = {generalMessage, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc523f3b042bbaf84fee2c57bb6d3d36", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc523f3b042bbaf84fee2c57bb6d3d36");
        }
        if (generalMessage == null || generalMessage.getData() == null) {
            return null;
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return (T) i.a().fromJson(new String(data, "utf-8"), (Class<Object>) cls);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.im.base.log.b.a("gson转换失败 ", generalMessage);
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return null;
    }

    public static final void a(com.sankuai.waimai.store.repository.net.b bVar, Context context) {
        Object[] objArr = {bVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60a8813e28ee24c67992911e4b43d154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60a8813e28ee24c67992911e4b43d154");
        } else if (context != null) {
            if (bVar != null) {
                if (!TextUtils.isEmpty(bVar.getMessage())) {
                    am.a(context, bVar.getMessage());
                    return;
                } else if (bVar.a()) {
                    am.a(context, (int) R.string.wm_sc_common_net_error_tip);
                    return;
                } else {
                    return;
                }
            }
            am.a(context, (int) R.string.wm_sc_common_loading_fail_try_afterwhile);
        }
    }

    public static Map<String, Object> a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd860cfd21ea5d6959fcaf196ad804b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd860cfd21ea5d6959fcaf196ad804b1");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, 1);
        hashMap.put("conversation", Integer.valueOf(z ? 2 : 1));
        if (t.a(str)) {
            str = "-999";
        }
        hashMap.put("im_group_id", str);
        return hashMap;
    }

    public static UserGroupImInfo a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        UserGroupImInfo userGroupImInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bae24c5de860681f11f978eac480f2e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (UserGroupImInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bae24c5de860681f11f978eac480f2e2");
        }
        if (bundle != null && !t.a(bundle.getString("personMessage"))) {
            userGroupImInfo = (UserGroupImInfo) i.a(bundle.getString("personMessage"), UserGroupImInfo.class);
        }
        return userGroupImInfo == null ? new UserGroupImInfo() : userGroupImInfo;
    }

    private static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c95fbb5b221da371cf11f6551e07de1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c95fbb5b221da371cf11f6551e07de1b")).intValue();
        }
        if (t.a(str)) {
            return -1;
        }
        try {
            return new JSONObject(str).optInt(str2, -1);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc89c270e95d85c25321a278c0da7297", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc89c270e95d85c25321a278c0da7297")).booleanValue() : s.a(Integer.valueOf(a(str, "autoReply")), 1);
    }

    public static void a(Map<String, Object> map, int i, int i2) {
        Object[] objArr = {map, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "553c164c7dde0b5e4ee93347097748b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "553c164c7dde0b5e4ee93347097748b3");
        } else if (p.a(map)) {
        } else {
            if (i <= 0) {
                i = -999;
            }
            map.put("cate_id", Integer.valueOf(i));
            if (i2 <= 0) {
                i2 = -999;
            }
            map.put("sec_cate_id", Integer.valueOf(i2));
        }
    }

    public static byte[] a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70e50764609d2df9005dd916bcab0fb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70e50764609d2df9005dd916bcab0fb4");
        }
        String a2 = i.a(obj);
        if (!TextUtils.isEmpty(a2)) {
            try {
                return a2.getBytes(StandardCharsets.UTF_8);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        return new byte[0];
    }

    public static byte[] b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af2e907796758632735c190174053585", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af2e907796758632735c190174053585");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.getBytes(StandardCharsets.UTF_8);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        return new byte[0];
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8078995cc27a22b3e4e727c3a3010891", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8078995cc27a22b3e4e727c3a3010891")).intValue();
        }
        if (context == null) {
            return 0;
        }
        return h.b(context, h.a(context) - (h.a(context, 57.0f) * 2));
    }

    public static void a(String str, String str2, int i, Context context) {
        Object[] objArr = {str, str2, Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09c51b92588d50ae5f43d8c42c3c8a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09c51b92588d50ae5f43d8c42c3c8a3e");
        } else if (com.sankuai.waimai.store.util.b.a(context)) {
        } else {
            d.a(context, com.sankuai.waimai.store.router.i.a + "/supermarket/detail?spuid=" + str + "&wmpoiid=" + str2 + "&buztype=" + i);
        }
    }
}
