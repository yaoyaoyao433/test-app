package com.sankuai.waimai.platform.widget.weather;

import com.BV.LinearGradient.LinearGradientManager;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String[] A;
    public boolean B;
    public boolean C;
    @SerializedName("startParticleSize")
    public double b;
    @SerializedName("startParticleSizeVariance")
    public double c;
    @SerializedName("finishParticleSize")
    public double d;
    @SerializedName("finishParticleSizeVariance")
    public double e;
    @SerializedName("maxParticles")
    public int f;
    @SerializedName("particleLifespan")
    public double g;
    @SerializedName("particleLifespanVariance")
    public double h;
    @SerializedName(LinearGradientManager.PROP_ANGLE)
    public double i;
    @SerializedName("angleVariance")
    public double j;
    @SerializedName("speed")
    public double k;
    public double l;
    @SerializedName("speedVariance")
    public double m;
    @SerializedName("sourcePositionx")
    public double n;
    @SerializedName("sourcePositionVariancex")
    public double o;
    @SerializedName("sourcePositiony")
    public double p;
    @SerializedName("sourcePositionVariancey")
    public double q;
    @SerializedName("startColorAlpha")
    public double r;
    @SerializedName("startColorVarianceAlpha")
    public double s;
    @SerializedName("finishColorAlpha")
    public double t;
    @SerializedName("finishColorVarianceAlpha")
    public double u;
    @SerializedName("rotationStart")
    public double v;
    @SerializedName("rotationStartVariance")
    public double w;
    @SerializedName("rotationEnd")
    public double x;
    @SerializedName("rotationEndVariance")
    public double y;
    @SerializedName("textureUrl")
    public String z;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db4287acb2c98353fa991d6716c8041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db4287acb2c98353fa991d6716c8041");
            return;
        }
        this.b = 1.0d;
        this.d = 1.0d;
        this.g = 1.0d;
        this.B = false;
        this.C = true;
    }
}
