package com.sankuai.meituan.kernel.net.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.singleton.g;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.meituan.kernel.net.singleton.b {
    public static ChangeQuickRedirect a = null;
    private static long h = -1;
    private static final String[] i = {"access-credit.meituan.com/appAction/waimai", "alita.waimai.meituan.com/api/edgedata/v1/rule/fetch", "api.meituan.com/appupdate/legacy/appstatus", "apimeishi.meituan.com/api/v1/poi/extendInfo", "apimobile.meituan.com/abtest/v1/getDivideStrategies", "dd.meituan.com/config/asg/checkList", "dd.meituan.com/config/titansx/checkList", "dd.meituan.com/dd_mrn/config/mrn/checkListV4", "gaea.meituan.com/elves/cep/list", "gaea.meituan.com/msg/tabInfo", "gaea.meituan.com/shoppingcart/product_qty", "gaea.meituan.com/tarzan_appapi/data_preload/preload", "m-sqt.meituan.com/cashier/pay", "m-sqt.meituan.com/cashier/scene/prepay", "m-sqt.meituan.com/cashier/showPayInfo", "open.meituan.com/api/open/user/v1/info", "pubmsg.meituan.com/api/v1/status/getStatus", "tuanfriend.meituan.com/user/getUserStatus", "wmapi-mt.meituan.com/mtapi/v6/app/preferentialdesc", "wmapi-mt.meituan.com/mtapi/v6/food/collect", "wmapi-mt.meituan.com/mtapi/v6/gethelpinfo", "wmapi-mt.meituan.com/mtapi/v6/order/simplestatus", "wmapi-mt.meituan.com/mtapi/v7/message/unread", "wmapi.meituan.com/api/v6/food/collect", "wmapi.meituan.com/api/v6/order/simplestatus", "wmapi.meituan.com/api/v7/message/unread", "wx.waimai.meituan.com/weapp/v1/abtest/frontend", "wx.waimai.meituan.com/weapp/v1/external/ajax/button", "wx.waimai.meituan.com/weapp/v1/poi/food", "wx.waimai.meituan.com/weapp/v1/user/allowance/entry", "wx.waimai.meituan.com/weapp/v1/wlwc/aggregationpage/ab"};
    public final com.sankuai.meituan.kernel.net.base.b b;
    private String c;
    private String d;
    private Context e;
    private boolean f;
    private boolean g;

    public a(Context context, com.sankuai.meituan.kernel.net.base.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e3cae6f4a8c5739da2d259ce1daca1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e3cae6f4a8c5739da2d259ce1daca1");
            return;
        }
        this.c = "android";
        this.f = false;
        this.g = true;
        this.b = bVar;
        this.e = context.getApplicationContext();
    }

    @Override // com.sankuai.meituan.kernel.net.singleton.b
    public final Uri.Builder a(Uri uri, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Object[] objArr = {uri, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62aa8e1a47e22518575a2ccbbe80dadf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62aa8e1a47e22518575a2ccbbe80dadf");
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (this.b != null && TextUtils.isEmpty(uri.getQueryParameter("utm_source"))) {
            buildUpon.appendQueryParameter("utm_source", this.b.i());
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("utm_medium"))) {
            buildUpon.appendQueryParameter("utm_medium", this.c);
        }
        if (this.b != null && TextUtils.isEmpty(uri.getQueryParameter("utm_term"))) {
            buildUpon.appendQueryParameter("utm_term", String.valueOf(this.b.k()));
        }
        if (this.b != null && TextUtils.isEmpty(uri.getQueryParameter("version_name"))) {
            buildUpon.appendQueryParameter("version_name", this.b.j());
        }
        boolean a2 = a(uri);
        if (!a2 && this.b != null && TextUtils.isEmpty(uri.getQueryParameter("utm_content"))) {
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "138896cdfe16c79dbc73ed0129de845d", RobustBitConfig.DEFAULT_VALUE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "138896cdfe16c79dbc73ed0129de845d")).booleanValue();
            } else {
                g.a b = g.b();
                if (b == null || uri == null) {
                    z4 = false;
                } else {
                    String uri2 = uri.toString();
                    z4 = uri2.contains("mlog.dianping.com/mtwmadlog") ? true : a(uri2, b.f, b.b);
                }
            }
            if (z4) {
                buildUpon.appendQueryParameter("utm_content", g.c());
            } else {
                buildUpon.appendQueryParameter("utm_content", this.b.l());
            }
        }
        if (this.b != null && !TextUtils.isEmpty(this.b.m()) && TextUtils.isEmpty(uri.getQueryParameter("utm_campaign"))) {
            buildUpon.appendQueryParameter("utm_campaign", this.b.m());
        }
        if (this.b != null && TextUtils.isEmpty(uri.getQueryParameter("ci"))) {
            long c = this.b.c();
            buildUpon.appendQueryParameter("ci", c <= 0 ? "" : String.valueOf(c));
        }
        if (!a2 && this.b != null && TextUtils.isEmpty(uri.getQueryParameter("msid"))) {
            Object[] objArr3 = {uri};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fbb29091a71b3c045634b8ae9f653321", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fbb29091a71b3c045634b8ae9f653321")).booleanValue();
            } else {
                g.a b2 = g.b();
                if (b2 == null || uri == null) {
                    z3 = false;
                } else {
                    String uri3 = uri.toString();
                    z3 = uri3.contains("mlog.dianping.com/mtwmadlog") ? true : a(uri3, b2.g, b2.c);
                }
            }
            if (z3) {
                if (h == -1) {
                    h = System.currentTimeMillis();
                }
                buildUpon.appendQueryParameter("msid", g.c() + h);
            } else {
                buildUpon.appendQueryParameter("msid", this.b.d());
            }
        }
        if (this.b != null && !TextUtils.isEmpty(this.b.g()) && TextUtils.isEmpty(uri.getQueryParameter("uuid")) && !uri.getQueryParameterNames().contains("uuid")) {
            buildUpon.appendQueryParameter("uuid", this.b.g());
        }
        if (z && this.g && this.b != null) {
            Object e = this.b.e();
            MtLocation mtLocation = e instanceof MtLocation ? (MtLocation) e : null;
            Object[] objArr4 = {uri};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e608f8556b49d98df793bdd183a44501", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e608f8556b49d98df793bdd183a44501")).booleanValue();
            } else {
                g.a b3 = g.b();
                if (b3 == null || uri == null) {
                    StringBuilder sb = new StringBuilder();
                    if (b3 == null) {
                        sb.append("configBean is null");
                    } else {
                        sb.append("isDeleteLocation:");
                        sb.append(b3.a);
                    }
                    sb.append(", url:");
                    sb.append(uri == null ? StringUtil.NULL : uri.toString());
                    String sb2 = sb.toString();
                    Object[] objArr5 = {102, sb2};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.kernel.net.report.b.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "d9224a53e4da5aaff2e3c10a25bf53c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "d9224a53e4da5aaff2e3c10a25bf53c7");
                    } else {
                        String str = "[NetConfig] " + sb2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("errCode", 102);
                        hashMap.put("errMsg", str);
                        Babel.logRT(new Log.Builder("").optional(hashMap).tag("privacy_config_location_exception").reportChannel("babel-general").lv4LocalStatus(true).newLogStatus(true).build());
                        if (com.sankuai.meituan.kernel.net.base.c.b()) {
                            com.dianping.networklog.c.a(str, 3);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = a(uri.toString(), b3.e, b3.a);
                }
            }
            if (!a2 && !z2 && mtLocation != null) {
                if (TextUtils.isEmpty(uri.getQueryParameter("lat"))) {
                    buildUpon.appendQueryParameter("lat", String.valueOf(mtLocation.getLatitude()));
                }
                if (TextUtils.isEmpty(uri.getQueryParameter("lng"))) {
                    buildUpon.appendQueryParameter("lng", String.valueOf(mtLocation.getLongitude()));
                }
            }
            String b4 = this.b.b();
            if (!TextUtils.isEmpty(b4) && TextUtils.isEmpty(uri.getQueryParameter("token"))) {
                buildUpon.appendQueryParameter("token", b4);
            }
            if (!a2 && !z2 && this.b != null && !TextUtils.equals(this.b.i(), "market") && TextUtils.isEmpty(uri.getQueryParameter("phoneNumber"))) {
                if (!this.f) {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "794b1b53bd59fc205d7a8e90bfa19bf2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "794b1b53bd59fc205d7a8e90bfa19bf2");
                    } else {
                        this.d = AppUtil.getLine1Number(this.e);
                    }
                    this.f = true;
                }
                if (!TextUtils.isEmpty(this.d)) {
                    buildUpon.appendQueryParameter("phoneNumber", this.d);
                }
            }
        }
        if (this.b != null && this.b.a() != 0 && TextUtils.isEmpty(uri.getQueryParameter("userid"))) {
            buildUpon.appendQueryParameter("userid", String.valueOf(this.b.a()));
        }
        if (this.b != null && this.b.h() != 0 && TextUtils.isEmpty(uri.getQueryParameter("p_appid"))) {
            buildUpon.appendQueryParameter("p_appid", String.valueOf(this.b.h()));
        }
        return buildUpon;
    }

    private static boolean a(String str, List<String> list, boolean z) {
        Object[] objArr = {str, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b21ba1de10effc8184fe008b6f7db0df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b21ba1de10effc8184fe008b6f7db0df")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return false;
                }
            }
        }
        return z;
    }

    private static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e3fb6efe95519713cbff6dbc8b89207", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e3fb6efe95519713cbff6dbc8b89207")).booleanValue();
        }
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        g.a b = g.b();
        if (b == null || b.d) {
            String uri2 = uri.toString();
            if (b == null || b.h == null || b.h.isEmpty()) {
                for (String str : i) {
                    if (uri2.contains(str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : b.h) {
                    if (uri2.contains(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
