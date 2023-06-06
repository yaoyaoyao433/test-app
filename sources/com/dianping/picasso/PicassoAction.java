package com.dianping.picasso;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoAction {
    public static final String CLICK = "click";
    public static final String ON_DIRECTION_CHANGE = "onDirectionChange";
    public static final String ON_END_DRAGGING = "onEndDragging";
    public static final String ON_ITEM_APPEAR = "onItemAppear";
    public static final String ON_ITEM_DISAPPEAR = "onItemDisappear";
    public static final String ON_LOAD_MORE = "onLoadMore";
    public static final String ON_PULL_DOWN = "onPullDown";
    public static final String ON_SCROLL = "onScroll";
    public static final String ON_SCROLL_END = "onScrollEnd";
    public static final String ON_SCROLL_START = "onScrollStart";
    private static final String TAG = "PicassoAction";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean hasAction(PicassoModel picassoModel, String str) {
        Object[] objArr = {picassoModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae3cbbd70b1edd02d24ee1e4f8efe614", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae3cbbd70b1edd02d24ee1e4f8efe614")).booleanValue();
        }
        if (picassoModel == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : picassoModel.actions) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static void callAction(PicassoModel picassoModel, String str, JSONObject jSONObject) {
        Object[] objArr = {picassoModel, str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bbb4e77086b66f7bf383fd29604e398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bbb4e77086b66f7bf383fd29604e398");
        } else if (picassoModel == null) {
            Log.e(TAG, "picassoModel is NULL");
        } else {
            b a = c.a(picassoModel.hostId);
            if (a == null) {
                Log.e(TAG, "Cannot find Host for:" + picassoModel.hostId);
            } else if (!(a instanceof g)) {
                Log.e(TAG, "Only support in VC Host");
            } else {
                ((g) a).a(picassoModel.viewId, str, jSONObject);
            }
        }
    }
}
