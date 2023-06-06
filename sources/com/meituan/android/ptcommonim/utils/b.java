package com.meituan.android.ptcommonim.utils;

import android.content.Context;
import android.view.View;
import com.meituan.android.ptcommonim.PTSessionFragmentV2;
import com.meituan.android.ptcommonim.pageadapter.titlebar.bean.TitleBarBean;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a(Context context, Map<String, Object> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c94580100505e80fa7b29da9edb85513", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c94580100505e80fa7b29da9edb85513");
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put(PTIMMessageBeanEntity.DATA_KEY_CARD, map);
        hashMap.put("generalParams", a(context, true));
        return hashMap;
    }

    public static List<TitleBarBean.TitleIcon> b(final Context context, Map<String, Object> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "150d3765cc4cfd34481130acc81b831d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "150d3765cc4cfd34481130acc81b831d");
        }
        ArrayList arrayList = new ArrayList();
        try {
            List list = (List) map.get("topRightButtonList");
            for (int i = 0; i < list.size(); i++) {
                Map map2 = (Map) list.get(i);
                final String str = (String) map2.get("buttonClientTypeUrl");
                arrayList.add(new TitleBarBean.TitleIcon.Builder().setTitle((String) map2.get("buttonName")).setImgUrl((String) map2.get("buttonIcon")).setClickCallback(new com.meituan.android.ptcommonim.pageadapter.event.c<com.meituan.android.ptcommonim.pageadapter.event.b>(new com.meituan.android.ptcommonim.pageadapter.event.a(str)) { // from class: com.meituan.android.ptcommonim.utils.b.1
                    public static ChangeQuickRedirect b;

                    @Override // com.meituan.android.ptcommonim.pageadapter.event.c
                    public final boolean a(View view, com.meituan.android.ptcommonim.pageadapter.event.b bVar) {
                        Object[] objArr2 = {view, bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13f93929cf7c6e805291cbb524f967ed", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13f93929cf7c6e805291cbb524f967ed")).booleanValue();
                        }
                        d.a(context, str);
                        return true;
                    }
                }).build());
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static Map<String, Object> a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f399085e92cf09326af967a1e7ba646a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f399085e92cf09326af967a1e7ba646a");
        }
        if (context != null) {
            SessionFragment a2 = com.sankuai.xm.imui.session.b.a(context);
            if (a2 instanceof PTSessionFragmentV2) {
                com.meituan.android.ptcommonim.model.b h = ((PTSessionFragmentV2) a2).h();
                r2 = h != null ? h.a(z) : null;
                if (r2 != null) {
                    r2.put("appId", com.meituan.android.ptcommonim.protocol.env.a.b);
                }
            }
        }
        return r2 == null ? new HashMap() : r2;
    }
}
