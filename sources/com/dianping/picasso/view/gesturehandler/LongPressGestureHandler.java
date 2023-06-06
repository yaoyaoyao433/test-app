package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LongPressGestureHandler extends PicassoGestureHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public LongPressGestureHandler(g gVar, String str) {
        super(gVar, str);
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e754915149bd6825acbbd5a5f44f56d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e754915149bd6825acbbd5a5f44f56d");
        } else {
            this.mAction = "longPress";
        }
    }

    @Override // com.dianping.picasso.view.gesturehandler.PicassoGestureHandler
    public JSONObject assembleJSONObject(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77ebd6d29b52ef364a5b96b3575019f1", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77ebd6d29b52ef364a5b96b3575019f1") : super.assembleJSONObject(motionEvent, i);
    }
}
