package com.sankuai.waimai.store.manager.judas;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdc9da26190caf9834d411bd019a1c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdc9da26190caf9834d411bd019a1c3f");
            return;
        }
        try {
            Statistics.disableAutoPV(AppUtil.generatePageInfoKey(obj));
            Statistics.disableAutoPD(AppUtil.generatePageInfoKey(obj));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public static void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "809c3053772918a35ca86c21bbaf2bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "809c3053772918a35ca86c21bbaf2bc2");
            return;
        }
        try {
            Statistics.setDefaultChannelName(AppUtil.generatePageInfoKey(obj), "waimai");
            Statistics.resetPageName(AppUtil.generatePageInfoKey(obj), str);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public static com.sankuai.waimai.store.callback.b b(@NonNull Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4fb23ba6ff3b7fc0513a080a3a87b2c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.callback.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4fb23ba6ff3b7fc0513a080a3a87b2c") : new a(obj, str);
    }

    public static void c(@NonNull Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9acb11539ef58c6de5572fe6981d193e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9acb11539ef58c6de5572fe6981d193e");
        } else {
            new a(obj, str).a();
        }
    }

    public static void a(@NonNull Object obj, String str, Map<String, Object> map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ddedf79e16f544ad5eebcb360b3f32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ddedf79e16f544ad5eebcb360b3f32f");
        } else {
            new a(obj, str).a(map).a();
        }
    }

    public static void d(@NonNull Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b24a4ed1ef9d6c0d63e14c5e6ce9eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b24a4ed1ef9d6c0d63e14c5e6ce9eb0");
            return;
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(obj);
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(generatePageInfoKey);
        HashMap hashMap = new HashMap();
        if (pageInfo != null) {
            hashMap.putAll(pageInfo.getValLab());
            com.sankuai.waimai.store.manager.judas.a.b(hashMap);
            pageInfo.clearValLab();
        }
        if (Statistics.isInitialized()) {
            Statistics.getChannel("waimai").writePageDisappear(generatePageInfoKey, str, hashMap);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.store.callback.b {
        public static ChangeQuickRedirect a;
        private String b;
        private String c;
        private Map<String, Object> d;
        private Map<String, Object> e;

        public a(Object obj, String str) {
            Object[] objArr = {obj, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fb4256233cd6a42645a476ba0f9e16", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fb4256233cd6a42645a476ba0f9e16");
                return;
            }
            this.d = new HashMap();
            this.e = new HashMap();
            this.c = AppUtil.generatePageInfoKey(obj);
            this.b = str;
            a("x_env", com.sankuai.waimai.store.base.net.sg.c.a().b());
            com.sankuai.waimai.store.manager.judas.a.a(this.d);
        }

        public final Object a(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216c22313c804719590c017159a4ac47", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216c22313c804719590c017159a4ac47") : this.d.get(str);
        }

        @Override // com.sankuai.waimai.store.callback.b
        public final com.sankuai.waimai.store.callback.b a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66aeba20945b85e3fad275fc13bde30", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.callback.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66aeba20945b85e3fad275fc13bde30");
            }
            this.d.put(str, String.valueOf(obj));
            return this;
        }

        @Override // com.sankuai.waimai.store.callback.b
        public final com.sankuai.waimai.store.callback.b a(@Nullable Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eadcae121eb3e3a3cbba90a9771c213", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.callback.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eadcae121eb3e3a3cbba90a9771c213");
            }
            if (map != null) {
                this.d.putAll(map);
                com.sankuai.waimai.store.manager.judas.a.b(this.d);
            }
            return this;
        }

        @Override // com.sankuai.waimai.store.callback.b
        public final com.sankuai.waimai.store.callback.b b(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ffe9e5ab4422dd9fd9ce2af3676e5e4", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.callback.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ffe9e5ab4422dd9fd9ce2af3676e5e4");
            }
            this.e.put(str, String.valueOf(obj));
            return this;
        }

        @Override // com.sankuai.waimai.store.callback.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb42fc756530a6e07baafeebd736358", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb42fc756530a6e07baafeebd736358");
            } else if (TextUtils.isEmpty(this.b)) {
                if (k.a()) {
                    throw new IllegalArgumentException("Judas埋点有误，MPT事件的cid不能为空");
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry<String, Object> entry : this.d.entrySet()) {
                        if (entry.getValue() == null) {
                            jSONObject.put(entry.getKey(), "");
                        } else {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (JSONException e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
                this.e.put("custom", jSONObject);
                Statistics.addPageInfo(this.c, this.b);
                Statistics.resetPageName(this.c, this.b);
                Statistics.getChannel("waimai").writePageView(this.c, this.b, this.e);
            }
        }
    }
}
