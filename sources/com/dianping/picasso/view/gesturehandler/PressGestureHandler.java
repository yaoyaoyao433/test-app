package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PressGestureHandler extends PicassoGestureHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PressGestureHandler(g gVar, String str) {
        super(gVar, str);
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7f35e653cf04c9521f3cbb5ea04c9bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7f35e653cf04c9521f3cbb5ea04c9bf");
        } else {
            this.mAction = "press";
        }
    }

    @Override // com.dianping.picasso.view.gesturehandler.PicassoGestureHandler
    public JSONObject assembleJSONObject(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b3e36d5596123aebe994935420a3e71", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b3e36d5596123aebe994935420a3e71") : super.assembleJSONObject(motionEvent, i);
    }
}
