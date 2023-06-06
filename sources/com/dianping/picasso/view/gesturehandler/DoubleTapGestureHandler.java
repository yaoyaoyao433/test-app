package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DoubleTapGestureHandler extends PicassoGestureHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DoubleTapGestureHandler(g gVar, String str) {
        super(gVar, str);
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67069d1c41e9f983374a39cc6821ea00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67069d1c41e9f983374a39cc6821ea00");
        } else {
            this.mAction = "doubleClick";
        }
    }

    @Override // com.dianping.picasso.view.gesturehandler.PicassoGestureHandler
    public JSONObject assembleJSONObject(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0778e4a14dc1acc7de412e05d34206f", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0778e4a14dc1acc7de412e05d34206f") : super.assembleJSONObject(motionEvent, i);
    }
}
