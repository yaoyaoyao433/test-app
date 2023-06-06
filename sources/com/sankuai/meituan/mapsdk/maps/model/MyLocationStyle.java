package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Color;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.FrameAnimation;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MyLocationStyle {
    public static final int LOCATION_TYPE_DEVICE_ROTATE = 4;
    public static final int LOCATION_TYPE_DEVICE_ROTATE_NO_CENTER = 5;
    public static final int LOCATION_TYPE_FOLLOW_NO_CENTER = 2;
    public static final int LOCATION_TYPE_LOCATION_ROTATE = 0;
    public static final int LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER = 1;
    public static final int LOCATION_TYPE_MAP_DEVICE_ROTATE = 6;
    public static final int LOCATION_TYPE_MAP_ROTATE_NO_CENTER = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private BitmapDescriptor a;
    private Animation b;
    private float c;
    private float d;
    private int e;
    private int f;
    private float g;
    private float h;
    private int i;
    private long j;
    private float k;
    private boolean l;
    private long m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;

    public MyLocationStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e785788e94c3d0bdd5d65f4cd0f90408", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e785788e94c3d0bdd5d65f4cd0f90408");
            return;
        }
        this.c = 0.5f;
        this.d = 0.5f;
        this.e = Color.argb(100, 0, 0, (int) TXLiveConstants.RENDER_ROTATION_180);
        this.f = Color.argb(255, 0, 0, (int) TbsListener.ErrorCode.COPY_INSTALL_SUCCESS);
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0;
        this.j = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.k = 30000.0f;
        this.l = true;
        this.m = 300L;
        this.n = false;
        this.o = true;
        this.p = true;
        this.q = "";
    }

    public boolean isMyLocationShowing() {
        return this.o;
    }

    public MyLocationStyle showMyLocation(boolean z) {
        this.o = z;
        return this;
    }

    public MyLocationStyle myLocationIcon(BitmapDescriptor bitmapDescriptor) {
        this.a = bitmapDescriptor;
        this.n = true;
        return this;
    }

    public Animation getAnimation() {
        return this.b;
    }

    public MyLocationStyle animation(Animation animation) {
        if (animation instanceof FrameAnimation) {
            this.b = animation;
        }
        return this;
    }

    public MyLocationStyle anchor(float f, float f2) {
        this.c = f;
        this.d = f2;
        return this;
    }

    public MyLocationStyle radiusCeiling(float f) {
        this.g = f;
        return this;
    }

    public MyLocationStyle radiusFillColor(int i) {
        this.e = i;
        return this;
    }

    public MyLocationStyle strokeColor(int i) {
        this.f = i;
        return this;
    }

    public MyLocationStyle strokeWidth(float f) {
        this.h = f;
        return this;
    }

    public MyLocationStyle myLocationType(int i) {
        this.i = i;
        return this;
    }

    public MyLocationStyle interval(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5d20896054f70b8b339869be92a57b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5d20896054f70b8b339869be92a57b2");
        }
        this.j = j;
        return this;
    }

    public MyLocationStyle zIndex(float f) {
        this.k = f;
        return this;
    }

    public MyLocationStyle circleShow(boolean z) {
        this.l = z;
        return this;
    }

    public MyLocationStyle circleAnimDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e28e6469fb419e036099537eb3df8b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e28e6469fb419e036099537eb3df8b6a");
        }
        this.m = j;
        return this;
    }

    public BitmapDescriptor getMyLocationIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "656e6a0a6ceba42cfefc27b456d2a075", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "656e6a0a6ceba42cfefc27b456d2a075");
        }
        if (!this.n || this.a == null) {
            this.a = BitmapDescriptorFactory.fromAsset("default_location.png");
        }
        return this.a;
    }

    public float getAnchorU() {
        return this.c;
    }

    public float getAnchorV() {
        return this.d;
    }

    public float getRadiusCeiling() {
        return this.g;
    }

    public int getRadiusFillColor() {
        return this.e;
    }

    public int getStrokeColor() {
        return this.f;
    }

    public float getStrokeWidth() {
        return this.h;
    }

    public int getMyLocationType() {
        return this.i;
    }

    public long getInterval() {
        return this.j;
    }

    public float getZIndex() {
        return this.k;
    }

    public boolean isCircleShow() {
        return this.l;
    }

    public long getCircleAnimDuration() {
        return this.m;
    }

    public MyLocationStyle iconIgnorePlacement(boolean z) {
        this.p = z;
        return this;
    }

    public boolean isIconIgnorePlacement() {
        return this.p;
    }

    public String getBid() {
        return this.q;
    }

    public MyLocationStyle bid(String str) {
        this.q = str;
        return this;
    }
}
