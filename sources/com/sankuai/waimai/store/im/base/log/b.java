package com.sankuai.waimai.store.im.base.log;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.im.base.k;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, GeneralMessage generalMessage) {
        Object[] objArr = {str, generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6449f806b2fdcc45450d774f31bc3428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6449f806b2fdcc45450d774f31bc3428");
            return;
        }
        StringBuilder sb = new StringBuilder("失败类型：");
        sb.append(str);
        sb.append(",消息为：");
        sb.append(generalMessage);
        a("sg_im_im_session", "消息解析失败", sb.toString() == null ? StringUtil.NULL : b(generalMessage.toString()));
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7adc3e2b679b01d7215d515622ca8c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7adc3e2b679b01d7215d515622ca8c53");
            return;
        }
        String name = context != null ? context.getClass().getName() : "";
        a("sg_im_dx_sdk", "在闪购调用大象sdk相关接口前，发现大象sdk未初始化", "操作为" + str + ",调用conext是：" + name);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1b2843512edeb8342a492d3ad1e64be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1b2843512edeb8342a492d3ad1e64be");
        } else {
            a("sg_im_extension_parser", "消息扩展字段解析失败", str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "429138757e6ba9308b88fa23fc8392a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "429138757e6ba9308b88fa23fc8392a2");
        } else {
            a("exception_chatid_error_from_api", str, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e74248fe2b16e0bfa0299c9d5df20844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e74248fe2b16e0bfa0299c9d5df20844");
            return;
        }
        String a2 = a();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("custom_params", str3);
        }
        hashMap.put("common_params", a2);
        Sniffer.smell(DefaultHeaderService.KEY_STORE, "store_im", str, str2, hashMap.toString());
        com.sankuai.waimai.store.util.monitor.a.a(StoreIM.class, str, str2, hashMap.toString());
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e87fef43f15bfc1807ea3013ec93d1fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e87fef43f15bfc1807ea3013ec93d1fa");
        }
        SessionId f = com.sankuai.xm.imui.b.a().f();
        SessionParams c = com.sankuai.xm.imui.b.a().c();
        String sessionId = f == null ? "" : f.toString();
        String sessionParams = c == null ? "" : c.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("app_is_develop", Boolean.valueOf(k.a()));
        hashMap.put("app_is_login", Boolean.valueOf(com.sankuai.waimai.store.manager.user.a.a().b()));
        hashMap.put("app_userId", Long.valueOf(com.sankuai.waimai.store.manager.user.a.a().c()));
        hashMap.put("dx_is_release", Boolean.valueOf(k.a.a.b()));
        hashMap.put("dx_is_login", Boolean.valueOf(com.sankuai.waimai.imbase.manager.b.a().e()));
        hashMap.put("dx_account", Long.valueOf(com.sankuai.xm.login.a.a().e()));
        hashMap.put("current_session_param", b(sessionParams));
        hashMap.put("current_session_info", b(sessionId));
        return hashMap.toString();
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fdf33a910cd08321e47ff40afdde0d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fdf33a910cd08321e47ff40afdde0d0");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replaceAll("[^(A-Za-z0-9){}_=\\[\\],() ()-:]", "*");
        } catch (Exception unused) {
            return str;
        }
    }
}
