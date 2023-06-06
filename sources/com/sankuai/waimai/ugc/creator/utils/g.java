package com.sankuai.waimai.ugc.creator.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static a a(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b72dc75aa6b1dcc1d2d77a91deb16362", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b72dc75aa6b1dcc1d2d77a91deb16362") : new a(EventName.CLICK, str).a(str2).a(obj);
    }

    public static a b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426b9e3bbd33792c6ddbe157220f4669", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426b9e3bbd33792c6ddbe157220f4669") : new a(EventName.MODEL_VIEW, str).a(str2).a(obj);
    }

    public static void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7790bc09b5487a49a48606567d4eacc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7790bc09b5487a49a48606567d4eacc6");
            return;
        }
        try {
            Statistics.setValLab(AppUtil.generatePageInfoKey(obj), new HashMap());
            Statistics.setDefaultChannelName(AppUtil.generatePageInfoKey(obj), "waimai");
            Statistics.resetPageName(AppUtil.generatePageInfoKey(obj), str);
        } catch (Exception unused) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        @NonNull
        private final EventInfo c;
        @NonNull
        private final HashMap<String, Object> d;

        private a(@NonNull EventName eventName, @NonNull String str) {
            Object[] objArr = {eventName, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366b973539bf0823cd23f90544c4580e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366b973539bf0823cd23f90544c4580e");
                return;
            }
            this.c = new EventInfo();
            this.d = new HashMap<>();
            this.c.nm = eventName;
            this.c.val_bid = str;
        }

        public final a a(String str) {
            this.c.val_cid = str;
            return this;
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d4d3f7f68650e11f153aee8992e0cb", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d4d3f7f68650e11f153aee8992e0cb");
            }
            if (map != null && !map.isEmpty()) {
                this.d.putAll(map);
            }
            return this;
        }

        public final a a(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22f5b50337309fb35fa349df4372601", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22f5b50337309fb35fa349df4372601");
            }
            this.b = AppUtil.generatePageInfoKey(obj);
            return this;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e0368bce93e9ebbe124820f068b29fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e0368bce93e9ebbe124820f068b29fc");
            } else {
                b("waimai");
            }
        }

        private void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06c0e433965211598e220a80676a107", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06c0e433965211598e220a80676a107");
            } else if (this.c.nm != null) {
                if ((EventName.MGE.equals(this.c.nm) && TextUtils.isEmpty(this.c.event_type)) || TextUtils.isEmpty(this.c.val_bid)) {
                    return;
                }
                if (!this.d.isEmpty()) {
                    this.c.val_lab = this.d;
                }
                if (!EventName.CLICK.equals(this.c.nm) && (!"click".equals(this.c.event_type) || TextUtils.isEmpty(this.b))) {
                    if ((EventName.MODEL_VIEW.equals(this.c.nm) || Constants.EventType.VIEW.equals(this.c.event_type)) && !TextUtils.isEmpty(this.b)) {
                        if (TextUtils.isEmpty(str)) {
                            str = "waimai";
                        }
                        Statistics.getChannel(str).writeModelView(this.b, this.c.val_bid, this.c.val_lab, this.c.val_cid);
                        return;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = "waimai";
                    }
                    Statistics.getChannel(str).writeEvent(this.c);
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "waimai";
                }
                Statistics.getChannel(str).writeModelClick(this.b, this.c.val_bid, this.c.val_lab, this.c.val_cid, false);
            }
        }
    }
}
