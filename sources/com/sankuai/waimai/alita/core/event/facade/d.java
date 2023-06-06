package com.sankuai.waimai.alita.core.event.facade;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.a;
import com.sankuai.waimai.alita.core.utils.k;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends h {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private String b;

        public static a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a4e1b95c97082e08a645f9dbfc77b06", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a4e1b95c97082e08a645f9dbfc77b06") : new a(str);
        }

        private a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32652ccae613b2ff9997ea0d8e9b60f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32652ccae613b2ff9997ea0d8e9b60f");
            } else {
                this.b = str;
            }
        }

        @Nullable
        public final com.sankuai.waimai.alita.core.event.a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbd2857dc449852e468a422af78b2b9", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbd2857dc449852e468a422af78b2b9");
            }
            try {
                if (TextUtils.isEmpty(this.b)) {
                    return null;
                }
                Map<String, Object> a2 = k.a(this.b);
                Object obj = a2.get("eventType");
                a.C0701a a3 = (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) ? null : a.C0701a.a((String) obj);
                if (a3 != null) {
                    Object obj2 = a2.get("category");
                    if (obj2 instanceof String) {
                        a3.b = (String) obj2;
                    }
                    Object obj3 = a2.get("bid");
                    if (obj3 instanceof String) {
                        a3.d = (String) obj3;
                    }
                    Object obj4 = a2.get("cid");
                    if (obj4 instanceof String) {
                        a3.c = (String) obj4;
                    }
                    Object obj5 = a2.get("val_lab");
                    if (obj5 instanceof Map) {
                        HashMap hashMap = new HashMap();
                        Map map = (Map) obj5;
                        for (Object obj6 : map.keySet()) {
                            if (obj6 instanceof String) {
                                String str = (String) obj6;
                                hashMap.put(str, map.get(str));
                            }
                        }
                        a3.e = hashMap;
                    }
                    Object obj7 = a2.get("tag");
                    if (obj7 instanceof Map) {
                        HashMap hashMap2 = new HashMap();
                        Map map2 = (Map) obj7;
                        for (Object obj8 : map2.keySet()) {
                            if (obj8 instanceof String) {
                                String str2 = (String) obj8;
                                hashMap2.put(str2, map2.get(str2));
                            }
                        }
                        a3.f = hashMap2;
                    }
                    return a3.a();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
