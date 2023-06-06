package com.sankuai.waimai.platform.mach.videoextend;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    String e;
    String f;
    public String g;
    String h;
    int i;
    List<Integer> j;
    boolean k;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d5c9dbee775a79acc73516886cce34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d5c9dbee775a79acc73516886cce34");
        } else {
            this.b = "ad";
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c98988ab91ff9b3eae05c9842afea84e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c98988ab91ff9b3eae05c9842afea84e")).booleanValue() : TextUtils.equals(this.b, "ad");
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08fe9dd88c6efcb9fbc1f53a4c8c4773", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08fe9dd88c6efcb9fbc1f53a4c8c4773");
        }
        return "VideoInfoData{mBid='" + this.c + "', mVideoUrl='" + this.d + "', mImageUrl='" + this.e + "', mPoiId='" + this.f + "', mVideoId='" + this.g + "', mVideoTime='" + this.h + "', mDelayTime=" + this.i + ", mVideoMark=" + this.j + ", countDownEnabled=" + this.k + '}';
    }
}
