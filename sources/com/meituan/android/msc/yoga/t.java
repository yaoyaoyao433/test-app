package com.meituan.android.msc.yoga;

import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t {
    public static ChangeQuickRedirect a;
    public static final t b = new t(Float.NaN, s.UNDEFINED);
    public static final t c = new t(0.0f, s.POINT);
    public static final t d = new t(Float.NaN, s.AUTO);
    public final float e;
    public final s f;

    public t(float f, s sVar) {
        Object[] objArr = {Float.valueOf(f), sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2a0de31612580031ebea38baaec688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2a0de31612580031ebea38baaec688");
            return;
        }
        this.e = f;
        this.f = sVar;
    }

    public t(float f, int i) {
        this(f, s.a(i));
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3fbfa7c68088168b49ce9eacc04d71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3fbfa7c68088168b49ce9eacc04d71");
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8e55203afc1c1cc2f3cd420ad3717a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8e55203afc1c1cc2f3cd420ad3717a")).booleanValue();
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f == tVar.f) {
                return this.f == s.UNDEFINED || this.f == s.AUTO || Float.compare(this.e, tVar.e) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88598395541e5919693313cd911b02e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88598395541e5919693313cd911b02e5")).intValue() : Float.floatToIntBits(this.e) + this.f.f;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e253b7a2b380a2fe3ed9bd57d675684c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e253b7a2b380a2fe3ed9bd57d675684c");
        }
        switch (this.f) {
            case UNDEFINED:
                return Constants.UNDEFINED;
            case POINT:
                return Float.toString(this.e);
            case PERCENT:
                return this.e + "%";
            case AUTO:
                return FpsEvent.TYPE_SCROLL_AUTO;
            default:
                throw new IllegalStateException();
        }
    }
}
