package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SingleTapGestureHandler extends PicassoGestureHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public SingleTapGestureHandler(g gVar, String str) {
        super(gVar, str);
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f5640c04059629e23f489f89b97ce4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f5640c04059629e23f489f89b97ce4");
        } else {
            this.mAction = "click";
        }
    }

    @Override // com.dianping.picasso.view.gesturehandler.PicassoGestureHandler
    public JSONObject assembleJSONObject(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a02ff62bef8c3fddff2d8e571c181de", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a02ff62bef8c3fddff2d8e571c181de") : super.assembleJSONObject(motionEvent, i);
    }
}
