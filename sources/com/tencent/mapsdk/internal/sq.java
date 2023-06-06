package com.tencent.mapsdk.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.map.tools.net.exception.NetErrorException;
import com.tencent.map.tools.net.exception.NetUnavailableException;
import com.tencent.mapsdk.vector.VectorMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sq extends le {
    private Context a;
    private String c;
    private VectorMap e;
    private gs f;
    private lj b = new lj();
    private String d = "";

    public sq(sw swVar) {
        this.c = "UNKNOW";
        this.a = swVar.G();
        this.c = this.a.getClass().getSimpleName();
        this.a = this.a.getApplicationContext();
        this.e = (VectorMap) swVar.e_;
        this.f = swVar.aB.d;
    }

    @Override // com.tencent.mapsdk.internal.le
    public final byte[] f(String str) {
        kj.b(ki.f, "download url : ".concat(String.valueOf(str)));
        if (this.a == null || hb.a(str) || !this.b.a(str)) {
            return null;
        }
        if (this.e != null && hb.a(this.d) && !hb.a(this.e.x())) {
            this.d = "&eng_ver=" + this.e.x();
        }
        df dfVar = (df) ck.a(df.class);
        String indoorMapUrl = ((ct) ((dh) ck.a(dh.class)).h()).getIndoorMapUrl();
        String indoorMapUrl2 = ((cs) dfVar.h()).getIndoorMapUrl();
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(indoorMapUrl);
        Uri parse3 = Uri.parse(indoorMapUrl2);
        String c = hb.c(parse.getAuthority());
        String c2 = hb.c(parse.getPath());
        String c3 = hb.c(parse2.getPath());
        String c4 = hb.c(parse3.getPath());
        if (c.equals(parse2.getAuthority()) && (c2.startsWith(c3) || c2.startsWith(c4))) {
            str = parse3.buildUpon().scheme(dfVar.b ? "https" : parse.getScheme()).encodedPath(c2.replace(c3, c4)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        Cdo cdo = (Cdo) ck.a(Cdo.class);
        if (cdo != null && !str.endsWith(".jpg") && !str.startsWith(cdo.i())) {
            str = str + this.d + gy.a(this.c);
        }
        kj.b(ki.f, "rectify url : ".concat(String.valueOf(str)));
        try {
            NetResponse doGet = NetManager.getInstance().builder().url(str).userAgent(NetUtil.STR_UserAgent).doGet();
            if (doGet == null) {
                return null;
            }
            if (!str.contains("qt=rtt")) {
                this.b.b(str);
            }
            return doGet.data;
        } catch (Exception e) {
            if (str.contains("/mvd_map")) {
                int i = -1;
                if (e instanceof NetUnavailableException) {
                    i = ((NetUnavailableException) e).errorCode;
                } else if (e instanceof NetErrorException) {
                    i = ((NetErrorException) e).statusCode;
                }
                this.f.a().a(System.currentTimeMillis(), str.substring(str.indexOf(63) + 1), i);
            }
            return null;
        }
    }

    private String a(@NonNull String str) {
        df dfVar = (df) ck.a(df.class);
        String indoorMapUrl = ((ct) ((dh) ck.a(dh.class)).h()).getIndoorMapUrl();
        String indoorMapUrl2 = ((cs) dfVar.h()).getIndoorMapUrl();
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(indoorMapUrl);
        Uri parse3 = Uri.parse(indoorMapUrl2);
        String c = hb.c(parse.getAuthority());
        String c2 = hb.c(parse.getPath());
        String c3 = hb.c(parse2.getPath());
        String c4 = hb.c(parse3.getPath());
        if (c.equals(parse2.getAuthority()) && (c2.startsWith(c3) || c2.startsWith(c4))) {
            str = parse3.buildUpon().scheme(dfVar.b ? "https" : parse.getScheme()).encodedPath(c2.replace(c3, c4)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        Cdo cdo = (Cdo) ck.a(Cdo.class);
        if (cdo == null || str.endsWith(".jpg") || str.startsWith(cdo.i())) {
            return str;
        }
        return str + this.d + gy.a(this.c);
    }
}
