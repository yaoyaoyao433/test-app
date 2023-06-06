package com.sankuai.waimai.store.manager.marketing;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.manager.marketing.parser.inner.anim.SGAnimMarketingDialogTemplateParser;
import com.sankuai.waimai.store.manager.marketing.parser.inner.basic.SGBasicMarketingDialogTemplateParser;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Map<String, Class<? extends com.sankuai.waimai.store.manager.marketing.parser.a>> b = new HashMap();
    private static final Map<String, Class<? extends com.sankuai.waimai.store.manager.sequence.strategy.b>> c = new HashMap();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9569d8c51e551bf4f3716d1e80bb7f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9569d8c51e551bf4f3716d1e80bb7f0");
            return;
        }
        a("template_id_marketing_basic_dialog", SGBasicMarketingDialogTemplateParser.class);
        a("sc_marketing_animation_dialog", SGAnimMarketingDialogTemplateParser.class);
    }

    public static void a(String str, Class<? extends com.sankuai.waimai.store.manager.marketing.parser.a> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eaa40c981803eb118c03faf55af1f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eaa40c981803eb118c03faf55af1f80");
        } else {
            b.put(str, cls);
        }
    }

    public static void b(String str, Class<? extends com.sankuai.waimai.store.manager.sequence.strategy.b> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14856458d68a7f01da6619f2dbb3236b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14856458d68a7f01da6619f2dbb3236b");
        } else {
            c.put(str, cls);
        }
    }

    public static com.sankuai.waimai.store.manager.marketing.parser.a a(String str) throws InstantiationException, IllegalAccessException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc308f48a90361c53f3479381f8c82dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.marketing.parser.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc308f48a90361c53f3479381f8c82dc");
        }
        Class<? extends com.sankuai.waimai.store.manager.marketing.parser.a> cls = b.get(str);
        if (cls == null) {
            return null;
        }
        return cls.newInstance();
    }

    public static com.sankuai.waimai.store.manager.sequence.strategy.b a(String str, String str2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f659b772aa9d6f2f85c9a91f31c8b71", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.strategy.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f659b772aa9d6f2f85c9a91f31c8b71");
        }
        Class<? extends com.sankuai.waimai.store.manager.sequence.strategy.b> cls = c.get(str);
        if (cls == null) {
            return null;
        }
        return cls.getConstructor(String.class).newInstance(str2);
    }
}
