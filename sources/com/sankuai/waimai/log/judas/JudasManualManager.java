package com.sankuai.waimai.log.judas;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class JudasManualManager {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public boolean c;
        @NonNull
        private final EventInfo d;
        @NonNull
        private final HashMap<String, Object> e;

        private a(@NonNull EventName eventName, @NonNull String str) {
            Object[] objArr = {eventName, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72b7d97d3c48269d31dbba96577581e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72b7d97d3c48269d31dbba96577581e");
                return;
            }
            this.d = new EventInfo();
            this.e = new HashMap<>();
            this.d.nm = eventName;
            this.d.val_bid = str;
            this.c = false;
        }

        @Deprecated
        private a(@NonNull EventName eventName, @NonNull String str, @NonNull String str2) {
            Object[] objArr = {eventName, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a914e6dffffa39de7b27da5b331c213", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a914e6dffffa39de7b27da5b331c213");
                return;
            }
            this.d = new EventInfo();
            this.e = new HashMap<>();
            this.d.nm = eventName;
            this.d.event_type = str;
            this.d.val_bid = str2;
            this.c = false;
        }

        public final a a(String str) {
            this.d.val_cid = str;
            return this;
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfab798c5a982a7b6e428375b64d7bd9", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfab798c5a982a7b6e428375b64d7bd9");
            }
            if (map != null && !map.isEmpty()) {
                this.e.putAll(map);
            }
            this.e.put("app_model", Integer.valueOf(com.sankuai.waimai.log.judas.a.a));
            return this;
        }

        public final a a(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c264dcd9e6bb25c7e673432727d3bdbe", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c264dcd9e6bb25c7e673432727d3bdbe");
            }
            this.b = AppUtil.generatePageInfoKey(obj);
            return this;
        }

        public final a a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e705e9e2e6fdefd4d818d4825a26d47", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e705e9e2e6fdefd4d818d4825a26d47");
            }
            a(str, String.valueOf(i));
            return this;
        }

        public final a a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54603e2640294c8674066ae3a935987", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54603e2640294c8674066ae3a935987");
            }
            a(str, String.valueOf(j));
            return this;
        }

        public final a a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fbd6d19912aa36dbee2846141b09685", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fbd6d19912aa36dbee2846141b09685");
            }
            a(str, String.valueOf(z));
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75e33eacda4cfc69ebc0bfc13e07c82", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75e33eacda4cfc69ebc0bfc13e07c82");
            }
            this.e.put(str, str2);
            return this;
        }

        @Deprecated
        public final a b(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885fb400a9b4de3173600b4eecadd303", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885fb400a9b4de3173600b4eecadd303");
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    this.e.put(entry.getKey(), entry.getValue());
                }
                this.e.put("app_model", Integer.valueOf(com.sankuai.waimai.log.judas.a.a));
            }
            return this;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c71853cfc745764c3ae38e4a4aa2d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c71853cfc745764c3ae38e4a4aa2d0");
            } else {
                b("waimai");
            }
        }

        public final void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d2e30304dbcf41528ca56c991a1eac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d2e30304dbcf41528ca56c991a1eac");
            } else if (this.d.nm == null || ((EventName.MGE.equals(this.d.nm) && TextUtils.isEmpty(this.d.event_type)) || TextUtils.isEmpty(this.d.val_bid))) {
                if (com.sankuai.waimai.foundation.core.a.a()) {
                    throw new IllegalArgumentException("Judas埋点有误");
                }
            } else {
                this.e.put("app_model", Integer.valueOf(com.sankuai.waimai.log.judas.a.a));
                if (!this.e.isEmpty()) {
                    this.d.val_lab = this.e;
                }
                if (EventName.CLICK.equals(this.d.nm) || ("click".equals(this.d.event_type) && !TextUtils.isEmpty(this.b))) {
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeModelClick(this.b, this.d.val_bid, this.d.val_lab, this.d.val_cid, false);
                } else if (this.c && ((EventName.MODEL_VIEW.equals(this.d.nm) || Constants.EventType.VIEW.equals(this.d.event_type)) && !TextUtils.isEmpty(this.b))) {
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeModeViewMergable(this.b, this.d.val_bid, this.d.val_lab, this.d.val_cid);
                } else if ((EventName.MODEL_VIEW.equals(this.d.nm) || Constants.EventType.VIEW.equals(this.d.event_type)) && !TextUtils.isEmpty(this.b)) {
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeModelView(this.b, this.d.val_bid, this.d.val_lab, this.d.val_cid);
                } else if (EventName.ORDER.equals(this.d.nm) && !TextUtils.isEmpty(this.b)) {
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeBizOrder(this.b, this.d.val_bid, this.d.val_lab, this.d.val_cid);
                } else {
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeEvent(this.b, this.d);
                }
            }
        }
    }

    public static a a(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d176557b353ee98d67b93d09d99a0b94", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d176557b353ee98d67b93d09d99a0b94") : new a(EventName.ORDER, str).a(str2).a(obj);
    }

    @Deprecated
    public static a a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a31b31dfd0a3ce9538da004833ee1a6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a31b31dfd0a3ce9538da004833ee1a6") : a(EventName.MGE, str);
    }

    @Deprecated
    private static a a(@NonNull EventName eventName, @NonNull String str) {
        Object[] objArr = {eventName, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63ccccc7d1ce34740886a20bec94bff7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63ccccc7d1ce34740886a20bec94bff7") : new a(eventName, "click", str);
    }

    public static a a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e3e3e212fdcc5f1ebba887cb47f0ccc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e3e3e212fdcc5f1ebba887cb47f0ccc");
        }
        a a2 = new a(EventName.CLICK, str).a(str2);
        a2.b = str3;
        return a2;
    }

    public static a b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf1fd86a86c72a2821cc208c788cf5a1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf1fd86a86c72a2821cc208c788cf5a1") : new a(EventName.CLICK, str).a(str2).a(obj);
    }

    @Deprecated
    public static a b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd7e47ada4445734af550e4cc929bb7a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd7e47ada4445734af550e4cc929bb7a") : new a(EventName.MGE, Constants.EventType.VIEW, str);
    }

    public static a b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf2d7d069a968b452c101edf291cca44", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf2d7d069a968b452c101edf291cca44");
        }
        a a2 = new a(EventName.MODEL_VIEW, str).a(str2);
        a2.b = str3;
        return a2;
    }

    public static a c(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64e78f4686301d540b359eff71751605", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64e78f4686301d540b359eff71751605") : new a(EventName.MODEL_VIEW, str).a(str2).a(obj);
    }

    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8799d1561a09e6abe6cfe33cb2633f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8799d1561a09e6abe6cfe33cb2633f9c");
            return;
        }
        try {
            Statistics.disablePageIdentify(AppUtil.generatePageInfoKey(obj));
            Statistics.disableAutoPV(AppUtil.generatePageInfoKey(obj));
            Statistics.disableAutoPD(AppUtil.generatePageInfoKey(obj));
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public static void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e0be0cabd232e093e3733e92835cc59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e0be0cabd232e093e3733e92835cc59");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("app_model", Integer.valueOf(com.sankuai.waimai.log.judas.a.a));
            Statistics.setValLab(AppUtil.generatePageInfoKey(obj), hashMap);
            Statistics.setDefaultChannelName(AppUtil.generatePageInfoKey(obj), "waimai");
            Statistics.resetPageName(AppUtil.generatePageInfoKey(obj), str);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    @Deprecated
    public static MPTBuilder b(@NonNull String str, @NonNull Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6efff9f63ee9c582034711a040977f2f", RobustBitConfig.DEFAULT_VALUE) ? (MPTBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6efff9f63ee9c582034711a040977f2f") : a(str, obj, (Map<String, Object>) null);
    }

    @Deprecated
    private static MPTBuilder a(@NonNull String str, @NonNull Object obj, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, obj, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebd38cabb4cf7b0e1e1b7a6792948760", RobustBitConfig.DEFAULT_VALUE) ? (MPTBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebd38cabb4cf7b0e1e1b7a6792948760") : a(str, 0, AppUtil.generatePageInfoKey(obj), null);
    }

    public static MPTBuilder a(@NonNull String str, int i, @NonNull Object obj) {
        Object[] objArr = {str, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f316e19549e72bda034938b2b4445b26", RobustBitConfig.DEFAULT_VALUE) ? (MPTBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f316e19549e72bda034938b2b4445b26") : a(str, i, obj, null);
    }

    public static MPTBuilder a(@NonNull String str, int i, @NonNull Object obj, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, Integer.valueOf(i), obj, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a97ce5ea95c202bd27209be970f6e2f", RobustBitConfig.DEFAULT_VALUE) ? (MPTBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a97ce5ea95c202bd27209be970f6e2f") : new MPTBuilder(str, i, AppUtil.generatePageInfoKey(obj), map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MPTBuilder {
        public static ChangeQuickRedirect a;
        private final String b;
        private int c;
        private final String d;
        private Map<String, Object> e;
        private Map<String, Object> f;
        private HashMap<String, Object> g;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes5.dex */
        public @interface MtpType {
        }

        public MPTBuilder(@NonNull String str, int i, String str2, Map<String, Object> map) {
            Object[] objArr = {str, Integer.valueOf(i), str2, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e003198e1f3253b52aeb141847433bbb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e003198e1f3253b52aeb141847433bbb");
                return;
            }
            this.g = new HashMap<>();
            this.b = str;
            this.c = i;
            this.d = str2;
            this.f = map;
        }

        public final MPTBuilder a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc44e751eaae8eecb4008680fb974f9", RobustBitConfig.DEFAULT_VALUE)) {
                return (MPTBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc44e751eaae8eecb4008680fb974f9");
            }
            a().put(str, String.valueOf(j));
            return this;
        }

        public final MPTBuilder a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a597b3315bed91f2b8a008e24dfc2d8e", RobustBitConfig.DEFAULT_VALUE)) {
                return (MPTBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a597b3315bed91f2b8a008e24dfc2d8e");
            }
            a().put(str, str2);
            return this;
        }

        public final MPTBuilder a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28757b0d35876fbde08f12ba1d0e741", RobustBitConfig.DEFAULT_VALUE)) {
                return (MPTBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28757b0d35876fbde08f12ba1d0e741");
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    a().put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public final MPTBuilder b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a02968a3607b96d1fe717ce3bbfb3824", RobustBitConfig.DEFAULT_VALUE)) {
                return (MPTBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a02968a3607b96d1fe717ce3bbfb3824");
            }
            this.g.put(str, str2);
            return this;
        }

        @NonNull
        public Map<String, Object> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a6d3a4c2dec6a4c781545daa63e7d23", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a6d3a4c2dec6a4c781545daa63e7d23");
            }
            if (this.e == null) {
                this.e = new HashMap();
            }
            return this.e;
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7230ecb0d25b939ebf6881c63e46e18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7230ecb0d25b939ebf6881c63e46e18");
            } else if (TextUtils.isEmpty(this.b)) {
                if (com.sankuai.waimai.foundation.core.a.a()) {
                    throw new IllegalArgumentException("Judas埋点有误，MPT事件的cid不能为空");
                }
            } else {
                this.g.put("app_model", Integer.valueOf(com.sankuai.waimai.log.judas.a.a));
                if (this.f != null) {
                    a().putAll(this.f);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (a() != null) {
                        for (String str : a().keySet()) {
                            if (str != null) {
                                Object obj = a().get(str);
                                if (obj == null) {
                                    obj = "";
                                }
                                jSONObject.put(str, obj);
                            }
                        }
                    }
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
                this.g.put("custom", jSONObject);
                Statistics.addPageInfo(this.d, this.b);
                if (1 == this.c) {
                    Statistics.getChannel("waimai").writePageDisappear(this.d, this.b, this.g);
                } else {
                    Statistics.getChannel("waimai").writePageView(this.d, this.b, this.g);
                }
            }
        }
    }
}
