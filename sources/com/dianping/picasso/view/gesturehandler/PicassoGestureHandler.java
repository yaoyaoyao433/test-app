package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.vc.g;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoGestureHandler extends GestureHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String mAction;
    protected g mPicassoVCHost;
    protected String mViewId;

    public PicassoGestureHandler(g gVar, String str) {
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9dd404b150054582050c43a95a3bd4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9dd404b150054582050c43a95a3bd4f");
            return;
        }
        this.mPicassoVCHost = gVar;
        this.mViewId = str;
    }

    @Override // com.dianping.picasso.view.gesturehandler.GestureHandler
    public boolean handle(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff917b38dca796eb1f6b1b38d0a98115", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff917b38dca796eb1f6b1b38d0a98115")).booleanValue() : handle(motionEvent, 1);
    }

    @Override // com.dianping.picasso.view.gesturehandler.GestureHandler
    public boolean handle(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c568758b824094a3312eccfe0cfbb1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c568758b824094a3312eccfe0cfbb1b")).booleanValue();
        }
        this.mPicassoVCHost.a(this.mViewId, this.mAction, assembleJSONObject(motionEvent, i));
        return false;
    }

    @Override // com.dianping.picasso.view.gesturehandler.GestureHandler
    public boolean handlePan(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        Object[] objArr = {motionEvent, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f5cae36184c60e34f3f7c10c0e94e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f5cae36184c60e34f3f7c10c0e94e8")).booleanValue();
        }
        this.mPicassoVCHost.a(this.mViewId, this.mAction, new JSONBuilder().put("pageX", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getRawX()))).put("pageY", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getRawY()))).put("locationX", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getX()))).put("locationY", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getY()))).put(RecceAnimUtils.TRANSLATION_X, Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), f))).put(RecceAnimUtils.TRANSLATION_Y, Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), f2))).put("velocityX", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), f3))).put("velocityY", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), f4))).put("state", 1).toJSONObject());
        return true;
    }

    public JSONObject assembleJSONObject(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a71b7967ab85d31f0831202245f185ea", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a71b7967ab85d31f0831202245f185ea") : new JSONBuilder().put("pageX", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getRawX()))).put("pageY", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getRawY()))).put("locationX", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getX()))).put("locationY", Float.valueOf(PicassoUtils.px2dp(this.mPicassoVCHost.b(), motionEvent.getY()))).put("state", Integer.valueOf(i)).toJSONObject();
    }
}
