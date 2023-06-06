package com.meituan.metrics.fsp;

import android.graphics.Rect;
import android.view.View;
import com.meituan.metrics.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspItemBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Integer> areaList;
    private List<Rect> rectList;
    private long sampleTime;
    private List<Rect> screenRectList;
    private int viewArea;
    private List<WeakReference<View>> viewList;

    public FspItemBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751a4496a686ba21f3773e57fe044246", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751a4496a686ba21f3773e57fe044246");
            return;
        }
        this.viewList = new ArrayList();
        this.rectList = new ArrayList();
        this.screenRectList = new ArrayList();
        this.areaList = new ArrayList();
        this.viewArea = 0;
    }

    public void addAll(Set<View> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9afc9c282134619947f07826679adc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9afc9c282134619947f07826679adc2");
            return;
        }
        for (View view : set) {
            this.viewList.add(new WeakReference<>(view));
        }
    }

    public boolean isContainView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63257a268377d60bd1d4b4683725d72c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63257a268377d60bd1d4b4683725d72c")).booleanValue();
        }
        for (int i = 0; i < this.viewList.size(); i++) {
            if (view.equals(this.viewList.get(i).get())) {
                return true;
            }
        }
        return false;
    }

    public long getSampleTime() {
        return this.sampleTime;
    }

    public void setSampleTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df11d87ee5398d58e5a4976109873a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df11d87ee5398d58e5a4976109873a63");
        } else {
            this.sampleTime = j;
        }
    }

    public List<WeakReference<View>> getViewList() {
        return this.viewList;
    }

    public List<Rect> getViewRectList() {
        return this.rectList;
    }

    public int getViewArea() {
        return this.viewArea;
    }

    public void setViewArea(int i) {
        this.viewArea = i;
    }

    public void setAllViewRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c8c03fd9872084740c550f758188e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c8c03fd9872084740c550f758188e91");
            return;
        }
        for (WeakReference<View> weakReference : this.viewList) {
            this.rectList.add(ViewUtils.getRect(weakReference.get()));
        }
    }

    public List<Integer> getAreaList() {
        return this.areaList;
    }

    public List<Rect> getScreenRectList() {
        return this.screenRectList;
    }

    public void setAreaList(List<Integer> list) {
        this.areaList = list;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62ea1774fe4c2b8f54708da75643f545", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62ea1774fe4c2b8f54708da75643f545");
        }
        return "FspItemBean{sampleTime=" + this.sampleTime + ", viewSet=" + this.viewList.size() + '}';
    }
}
