package com.sankuai.waimai.platform.net.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.config.horn.a;
import com.sankuai.waimai.platform.encrypt.Env;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final List<String> c = Arrays.asList("/v10/home/rcmdboard", "/v6/home/feeds/tabs", "/v6/home/feeds/mainlist", "/v6/intellirecommend", "/v7/user/address/getaddr", "/v7/user/home/address/getaddr", "/v6/home/dynamic/tabs", "/v6/poi/activity_groups", "/v7/act/getinfo", "/v6/home/all_category", "/v6/channel/feeds/rcmd", "/v6/channel/feeds/tabs", "/v6/channel/feeds/list", "/v7/poi/channelpage", "/v8/gettabinfo", "/v9/poi/supermarket/channelpage", "/v1/drug/channelpage/poi_list", "/v6/ab/exp/strategy", "/api/ucenter/canceled", "/api/ucenter/canceled/mt", "/api/ucenter/canceled/dp");
    private static final List<String> d = Arrays.asList("wmapi-mt.meituan.com/mtapi/.*/app/preferentialdesc", "wmapi.meituan.com/api/v6/app/preferentialdesc", "dpapi.waimai.meituan.com/dp/v6/app/preferentialdesc", "i.waimai.meituan.com//openh5/config/channelconfig", "i.waimai.meituan.com//openh5/opencity/list", "wmapi-mt.meituan.com/mtapi/v6/user/dislike/check", "wmapi.meituan.com/api/v6/user/dislike/check", "dpapi.waimai.meituan.com/dp/v6/user/dislike/check", "wmapi-mt.meituan.com/mtapi/v6/user/dislike/add", "wmapi.meituan.com/api/v6/user/dislike/add", "dpapi.waimai.meituan.com/dp/v6/user/dislike/add", "wmapi-mt.meituan.com/mtapi/v6/user/dislike/cancel", "wmapi.meituan.com/api/v6/user/dislike/cancel", "dpapi.waimai.meituan.com/dp/v6/user/dislike/cancel", "wmapi.meituan.com/api/v6/user/address/savecategory", "wmapi-mt.meituan.com/mtapi/v6/user/address/savecategory", "waimaiucenter.meituan.com/api/ucenter/canceled", "waimaiucenter.meituan.com/api/ucenter/canceled/mt", "waimaiucenter.meituan.com/api/ucenter/canceled/dp", "wmapi.meituan.com/api/v6/payment/checkpay", "wmapi-mt.meituan.com/mtapi/v6/payment/checkpay", "dpapi.waimai.meituan.com/dp/v6/payment/checkpay", "wmapi.meituan.com/api/marketing/appbeh/getruleidsbyuserid", "wmapi-mt.meituan.com/mtapi/marketing/appbeh/getruleidsbyuserid", "dpapi.waimai.meituan.com/dp/marketing/appbeh/getruleidsbyuserid");
    private static Set<String> e;
    private static Env.EnvType f;
    public com.sankuai.waimai.platform.config.horn.a b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fce378dcead3e329eb103fac31649296", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fce378dcead3e329eb103fac31649296");
            return;
        }
        String z = com.sankuai.waimai.platform.utils.sharedpreference.a.z();
        if (TextUtils.isEmpty(z)) {
            return;
        }
        this.b = (com.sankuai.waimai.platform.config.horn.a) k.a().fromJson(z, (Class<Object>) com.sankuai.waimai.platform.config.horn.a.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1071a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b25fc89a7657e5239c40cc3f2926f3b3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b25fc89a7657e5239c40cc3f2926f3b3") : C1071a.a;
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984913b61fb8d7a2655d2e107efc2743", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984913b61fb8d7a2655d2e107efc2743")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && this.b != null && this.b.c != null && this.b.c.size() > 0) {
            for (String str2 : this.b.c) {
                if (!TextUtils.isEmpty(str2) && Pattern.compile(str2).matcher(str).find()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b1210a27153b46756801688cceeb96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b1210a27153b46756801688cceeb96");
        }
        if (this.b != null) {
            if (this.b.a != null) {
                for (Map.Entry<String, a.C1044a> entry : this.b.a.entrySet()) {
                    if (str.contains(entry.getKey())) {
                        return entry.getValue().a;
                    }
                }
            }
            if (this.b.b != null) {
                for (Map.Entry<String, a.C1044a> entry2 : this.b.b.entrySet()) {
                    if (Pattern.compile(entry2.getKey()).matcher(str).find()) {
                        return entry2.getValue().a;
                    }
                }
            }
        }
        for (String str2 : d) {
            if (this.b == null || this.b.c == null || !this.b.c.contains(str2)) {
                if (Pattern.compile(str2).matcher(str).find()) {
                    return "ll";
                }
            }
        }
        return "";
    }

    public boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fcfbd0fdcac456e05ce7d759a8b5b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fcfbd0fdcac456e05ce7d759a8b5b1")).booleanValue();
        }
        for (String str2 : c) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b1a6e60e9daa3d252760e801c477be", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b1a6e60e9daa3d252760e801c477be")).booleanValue() : (TextUtils.isEmpty(str) || (Privacy.createNetFilter().a(str) & 1) == 0) ? false : true;
    }

    public boolean e(String str) {
        Set<String> b;
        Uri parse;
        String host;
        String path;
        Uri parse2;
        Uri parse3;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f19cd57ae427a04b3589c6435fb0a68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f19cd57ae427a04b3589c6435fb0a68")).booleanValue();
        }
        if (Env.a() != Env.EnvType.PROD) {
            if (e == null || f != Env.a()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6a07b7add9ac35c0d6569b27cfeddf86", RobustBitConfig.DEFAULT_VALUE)) {
                    b = (Set) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6a07b7add9ac35c0d6569b27cfeddf86");
                } else {
                    b = q.a(com.meituan.android.singleton.b.a, "mtplatform_oneclick", 2).b("forward_rules", new HashSet(), u.f);
                    if (b.size() == 0) {
                        Context context = com.meituan.android.singleton.b.a;
                        b = q.a(context, com.meituan.android.singleton.b.a.getPackageName() + "_cipstoragecenter", 2).b("forward_rules", new HashSet(), u.f);
                    }
                }
                e = b;
                f = Env.a();
            }
            boolean z = false;
            for (String str2 : e) {
                if (str2.contains("=>")) {
                    String[] split = str2.split("=>");
                    if (split.length > 1) {
                        try {
                            parse = Uri.parse(str);
                            host = parse.getHost();
                            path = parse.getPath();
                            parse2 = Uri.parse(split[0]);
                            parse3 = Uri.parse(split[1]);
                        } catch (Exception unused) {
                        }
                        if (!TextUtils.isEmpty(host) && parse3 != null) {
                            if (host.equals(parse3.getHost())) {
                                if (!d(parse.getScheme() + "://" + parse2.getHost() + path)) {
                                    a a2 = a();
                                    if (!a2.a(parse2.getHost() + path)) {
                                        z = false;
                                    }
                                }
                                z = true;
                            }
                            if (z) {
                                return z;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            return z;
        }
        return false;
    }
}
