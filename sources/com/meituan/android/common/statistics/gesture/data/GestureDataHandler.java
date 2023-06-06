package com.meituan.android.common.statistics.gesture.data;

import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureDataHandler implements IGestureDataHandler {
    private static final String TAG = "Gesture";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<GestureEntity> mData;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class GestureHandlerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static GestureDataHandler gestureHandler = new GestureDataHandler();
    }

    public GestureDataHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cb6fd710a6be769d8f1c51ba0c335da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cb6fd710a6be769d8f1c51ba0c335da");
        } else {
            this.mData = new ArrayList();
        }
    }

    public static GestureDataHandler getInstance() {
        return GestureHandlerHolder.gestureHandler;
    }

    @Override // com.meituan.android.common.statistics.gesture.data.IGestureDataHandler
    public void saveGesture(GestureEntity gestureEntity) {
        Object[] objArr = {gestureEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6fb639821ceab96bb65fd177289e274", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6fb639821ceab96bb65fd177289e274");
            return;
        }
        synchronized (this) {
            LogUtil.log(TAG, "GestureDataHandler invoke saveGesture: " + gestureEntity.toJson().toString());
            this.mData.add(gestureEntity);
        }
    }

    @Override // com.meituan.android.common.statistics.gesture.data.IGestureDataHandler
    public List<GestureEntity> getGesture() {
        List<GestureEntity> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24e10a708d9cfb3997a6206f9d09171c", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24e10a708d9cfb3997a6206f9d09171c");
        }
        synchronized (this) {
            LogUtil.log(TAG, "GestureDataHandler invoke getGesture()");
            list = this.mData;
        }
        return list;
    }

    @Override // com.meituan.android.common.statistics.gesture.data.IGestureDataHandler
    public void clean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef600d7795a2073121369afaa789b727", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef600d7795a2073121369afaa789b727");
            return;
        }
        synchronized (this) {
            LogUtil.log(TAG, "GestureDataHandler invoke clean()");
            this.mData.clear();
        }
    }
}
