package com.dianping.picasso;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class PicassoRecyclerViewScrollListener extends RecyclerView.k {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PicassoModel picassoModel;

    public int getAllOffsetX() {
        return -1;
    }

    public int getAllOffsetY() {
        return -1;
    }

    public abstract VisibleItemsInfo getVisibleItems() throws JSONException;

    public PicassoRecyclerViewScrollListener(@NonNull PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d8042787cfaecf19c7da8dd222c23d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d8042787cfaecf19c7da8dd222c23d");
        } else {
            this.picassoModel = picassoModel;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13a036f527840502f84748c2cb3d7157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13a036f527840502f84748c2cb3d7157");
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            onScrollStartEvent();
        } else if (i == 0) {
            onScrollEndEvent(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99fae0e0048ed2979e186562885d2fa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99fae0e0048ed2979e186562885d2fa6");
        } else {
            onScrollEvent(recyclerView, PicassoUtils.px2dp(recyclerView.getContext(), recyclerView.computeHorizontalScrollOffset()), PicassoUtils.px2dp(recyclerView.getContext(), recyclerView.computeVerticalScrollOffset()));
        }
    }

    public void onScrollStartEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4c3fd460c87a8a54b63b8239b38882b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4c3fd460c87a8a54b63b8239b38882b");
        } else if (PicassoAction.hasAction(this.picassoModel, PicassoAction.ON_SCROLL_START)) {
            PicassoAction.callAction(this.picassoModel, PicassoAction.ON_SCROLL_START, null);
        }
    }

    public void onScrollEndEvent(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69ead0e6a229015d632c1a70a42f0a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69ead0e6a229015d632c1a70a42f0a59");
        } else if (PicassoAction.hasAction(this.picassoModel, PicassoAction.ON_SCROLL_END)) {
            JSONObject jSONObject = new JSONObject();
            try {
                try {
                    if (getAllOffsetX() >= 0) {
                        jSONObject.put(Constants.GestureMoveEvent.KEY_X, PicassoUtils.px2dp(recyclerView.getContext(), getAllOffsetX()));
                    }
                    if (getAllOffsetY() >= 0) {
                        jSONObject.put(Constants.GestureMoveEvent.KEY_Y, PicassoUtils.px2dp(recyclerView.getContext(), getAllOffsetY()));
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Constants.GestureMoveEvent.KEY_X, PicassoUtils.px2dp(recyclerView.getContext(), recyclerView.computeHorizontalScrollOffset()));
                    jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, PicassoUtils.px2dp(recyclerView.getContext(), recyclerView.computeVerticalScrollOffset()));
                    jSONObject.put("offset", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    VisibleItemsInfo visibleItems = getVisibleItems();
                    if (visibleItems != null) {
                        jSONObject3.put("half", visibleItems.halfItems);
                        jSONObject3.put("full", visibleItems.fullItems);
                    }
                    jSONObject.put("visibleItems", jSONObject3);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } finally {
                PicassoAction.callAction(this.picassoModel, PicassoAction.ON_SCROLL_END, jSONObject);
            }
        }
    }

    public void onScrollEvent(RecyclerView recyclerView, float f, float f2) {
        Object[] objArr = {recyclerView, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6071f88a822742c494be6c6fa7ff486d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6071f88a822742c494be6c6fa7ff486d");
        } else if (PicassoAction.hasAction(this.picassoModel, "onScroll")) {
            JSONObject jSONObject = new JSONObject();
            try {
                try {
                    jSONObject.put(Constants.GestureMoveEvent.KEY_X, f);
                    jSONObject.put(Constants.GestureMoveEvent.KEY_Y, f2);
                    jSONObject.put("isDragging", 1 == recyclerView.getScrollState());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } finally {
                PicassoAction.callAction(this.picassoModel, "onScroll", jSONObject);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class VisibleItemsInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public JSONArray fullItems;
        public JSONArray halfItems;

        public VisibleItemsInfo(JSONArray jSONArray, JSONArray jSONArray2) {
            this.halfItems = jSONArray;
            this.fullItems = jSONArray2;
        }
    }
}
