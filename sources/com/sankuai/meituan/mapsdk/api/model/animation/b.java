package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.Animator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.p;
import com.sankuai.meituan.mapsdk.maps.interfaces.r;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.EmergeAnimation;
import com.sankuai.meituan.mapsdk.maps.model.animation.FrameAnimation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Animator a(Object obj, Animation animation) {
        Object[] objArr = {obj, animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f44b2ba4fb913d5a92c4d7c5d8486ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f44b2ba4fb913d5a92c4d7c5d8486ae");
        }
        switch (animation.getType()) {
            case ALPHA:
                return new a((com.sankuai.meituan.mapsdk.core.interfaces.e) obj, animation);
            case SCALE:
                return new h((com.sankuai.meituan.mapsdk.core.interfaces.e) obj, animation);
            case TRANSLATE:
                return new i((com.sankuai.meituan.mapsdk.core.interfaces.e) obj, animation);
            case ROTATE:
                return new g((com.sankuai.meituan.mapsdk.core.interfaces.e) obj, animation);
            case SET:
                return new c((com.sankuai.meituan.mapsdk.core.interfaces.e) obj, animation);
            case EMERGE:
                return new e((r) obj, (EmergeAnimation) animation);
            case FRAME:
                return new f((p) obj, (FrameAnimation) animation);
            default:
                return null;
        }
    }
}
