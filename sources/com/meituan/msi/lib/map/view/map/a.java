package com.meituan.msi.lib.map.view.map;

import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SerializedName("layerStyle")
    public int b;
    @SerializedName("mapStyle")
    public String c;
    @SerializedName("minScale")
    public float d;
    @SerializedName("maxScale")
    public float e;
    @SerializedName("centerLatitude")
    public double f;
    @SerializedName("centerLongitude")
    public double g;
    @SerializedName("scale")
    public float h;
    @SerializedName("skew")
    public float i;
    @SerializedName(AnimationViewCommandModel.Rotation)
    public float j;
    @SerializedName("zoomMode")
    public String k;
    @SerializedName("showBlockedRoad")
    public boolean l;
    @SerializedName("showCompass")
    public boolean m;
    @SerializedName("showScale")
    public boolean n;
    @SerializedName("enableZoom")
    public boolean o;
    @SerializedName("enableScroll")
    public boolean p;
    @SerializedName("enableRotate")
    public boolean q;
    @SerializedName("enableOverlooking")
    public boolean r;
    @SerializedName("enableScaleByMapCenter")
    public boolean s;
    @SerializedName("enable3D")
    public boolean t;
    @SerializedName("enableTraffic")
    public boolean u;
    @SerializedName("enableIndoor")
    public boolean v;
    @SerializedName("isShowRoadStyle")
    public boolean w;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31db2a3d14369ea47d12a8ebc6e8ec8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31db2a3d14369ea47d12a8ebc6e8ec8b");
            return;
        }
        this.b = 1;
        this.c = null;
        this.d = 20.0f;
        this.e = 3.0f;
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = 16.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = UserCenter.OAUTH_TYPE_QQ;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = false;
    }
}
