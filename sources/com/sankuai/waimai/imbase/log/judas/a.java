package com.sankuai.waimai.imbase.log.judas;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.log.judas.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0963a {
        public static ChangeQuickRedirect a;
        @NonNull
        private final EventInfo b;
        @NonNull
        private final Map<String, Object> c;
        private String d;

        private C0963a(@NonNull EventName eventName, @NonNull String str, @NonNull String str2) {
            Object[] objArr = {eventName, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8edd813f2c5cf804a307a66ef0636b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8edd813f2c5cf804a307a66ef0636b");
                return;
            }
            this.b = new EventInfo();
            this.c = new HashMap();
            this.b.nm = eventName;
            this.b.event_type = str;
            this.b.val_bid = str2;
        }

        public final C0963a a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34d093201dfc81d2e2fb7b87fa6533a", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0963a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34d093201dfc81d2e2fb7b87fa6533a");
            }
            a(str, String.valueOf(i));
            return this;
        }

        public final C0963a a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac6a9a8127303e292e80c58d6601e47", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0963a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac6a9a8127303e292e80c58d6601e47");
            }
            a(str, String.valueOf(j));
            return this;
        }

        public final C0963a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee384bb986a79b829475b1992456f65", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0963a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee384bb986a79b829475b1992456f65");
            }
            this.c.put(str, str2);
            return this;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cf05d15ef6a60c11b831d02daf7c6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cf05d15ef6a60c11b831d02daf7c6d");
            } else {
                a("waimai");
            }
        }

        private void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d6fd5f43aafa71d4724b79d8987861", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d6fd5f43aafa71d4724b79d8987861");
            } else if (this.b.nm == null || TextUtils.isEmpty(this.b.event_type) || TextUtils.isEmpty(this.b.val_bid)) {
            } else {
                if (!this.c.isEmpty()) {
                    this.b.val_lab = this.c;
                }
                if ("click".equals(this.b.event_type) && !TextUtils.isEmpty(this.d)) {
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeModelClick(this.d, this.b.val_bid, this.b.val_lab, this.b.val_cid);
                    if (com.sankuai.waimai.foundation.utils.log.a.b) {
                        com.sankuai.waimai.foundation.utils.log.a.b("JudasManualManager", "Log name = %s, bid = %s, eventType = %s, map = %s, pageInfoKey = %s", this.b.nm.name(), this.b.val_bid, this.b.event_type, new b().a(this.c), this.d);
                        return;
                    }
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "waimai";
                }
                Statistics.getChannel(str).writeEvent((String) null, this.b);
                if (com.sankuai.waimai.foundation.utils.log.a.b) {
                    com.sankuai.waimai.foundation.utils.log.a.b("JudasManualManager", "Log name = %s, bid = %s, eventType = %s, map = %s", this.b.nm.name(), this.b.val_bid, this.b.event_type, new b().a(this.c));
                }
            }
        }
    }

    public static C0963a a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "130dd9fbf3430acbda9756f1df7dc416", RobustBitConfig.DEFAULT_VALUE) ? (C0963a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "130dd9fbf3430acbda9756f1df7dc416") : a(EventName.MGE, str);
    }

    private static C0963a a(@NonNull EventName eventName, @NonNull String str) {
        Object[] objArr = {eventName, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "955fbdb2e7b4bae6dd02ce89e7907625", RobustBitConfig.DEFAULT_VALUE) ? (C0963a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "955fbdb2e7b4bae6dd02ce89e7907625") : new C0963a(eventName, "click", str);
    }

    public static C0963a b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a9d089d9c9830d56e0b194568cce0d5", RobustBitConfig.DEFAULT_VALUE) ? (C0963a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a9d089d9c9830d56e0b194568cce0d5") : new C0963a(EventName.MGE, Constants.EventType.VIEW, str);
    }
}
