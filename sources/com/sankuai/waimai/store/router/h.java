package com.sankuai.waimai.store.router;

import com.sankuai.waimai.store.util.v;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface h {
    public static final String a = i.a + "/supermarket/menu";
    public static final String b = i.a + "/supermarket/submenu";
    public static final String c = i.a + "/supermarket/detail";
    public static final String d = i.a + "/supermarket/poiinfo";
    public static final String e = i.a + "/supermarket/goodscomments";
    public static final String f = i.a + "/supermarket/descriptionlist";
    public static final String g = i.a + "/mrn";
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(i.a);
        sb.append((v.c || v.d) ? "/takeout/smmrnhalfpage" : "/smmrnhalfpage");
        h = sb.toString();
        i = i.a + "/supermarket/restaurantsearch";
        j = i.a + "/smshopcardmrn";
        k = i.a + "/search";
        l = i.a + "/orders";
        m = i.a + "/order/uselesspoicouponlist";
        n = i.a + "/chat";
        o = i.a + "/supermarket/uploadRecipeImage";
        p = i.a + "/supermarket/globalsearch";
        q = i.a + "takeout/drug/globalsearch";
        r = i.a + "/supermarket/orders";
        s = i.a + "/smmrnhalfpage";
        t = i.a + "/supermarket/superstore/detail";
        u = i.a + "/supermarket/superstore/shelves";
        v = i.a + "/supermarket/superstore/home";
        w = i.a + "/supermarket/scanproduct";
        x = i.a + "/supermarket/sgnewuserland";
        y = i.a + "/smmschalfpage";
    }
}
