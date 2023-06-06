package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PanGestureHandler extends PicassoGestureHandler {
    public static final String ACTION_PAN = "pan";
    public static ChangeQuickRedirect changeQuickRedirect;

    public PanGestureHandler(g gVar, String str) {
        super(gVar, str);
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15ca4714c0e402a7c6828a444e7a6364", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15ca4714c0e402a7c6828a444e7a6364");
        } else {
            this.mAction = "pan";
        }
    }

    @Override // com.dianping.picasso.view.gesturehandler.PicassoGestureHandler
    public JSONObject assembleJSONObject(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e82808ac39ceffdcf5624f763a28fd3e", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e82808ac39ceffdcf5624f763a28fd3e") : super.assembleJSONObject(motionEvent, i);
    }
}
