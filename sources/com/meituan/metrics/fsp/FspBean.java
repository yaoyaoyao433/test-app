package com.meituan.metrics.fsp;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.meituan.metrics.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activityName;
    private Map<View, FspScrollBean> allScrollMap;
    private Set<View> allViewSet;
    private long calculateTime;
    private Rect contentViewRect;
    private long execStartActivityTime;
    private Map<String, Object> extraFspInfo;
    private long fspTime;
    private boolean isDetectReachBottom;
    private boolean isFirstLaunch;
    private boolean isSuccess;
    private List<FspItemBean> list;
    private long newActivityTime;
    private long newFspTime;
    private long onCreateTime;
    private long onTouchDownTime;
    private long reachBottomTime;
    private int reason;
    private long stableTime;
    private int viewSize;

    public FspBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a25f1683347b8e0431e6905d71b49555", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a25f1683347b8e0431e6905d71b49555");
            return;
        }
        this.isSuccess = false;
        this.list = new ArrayList();
        this.viewSize = 0;
        this.allScrollMap = new WeakHashMap();
        this.allViewSet = Collections.newSetFromMap(new WeakHashMap());
    }

    public void setFspTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b3fda1ab5166af0e66d6280da57d33d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b3fda1ab5166af0e66d6280da57d33d");
        } else {
            this.fspTime = j;
        }
    }

    public long getOnCreateTime() {
        return this.onCreateTime;
    }

    public void setOnCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a562ad3a925d3d1bb92e02c8d35f70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a562ad3a925d3d1bb92e02c8d35f70d");
        } else {
            this.onCreateTime = j;
        }
    }

    public long getStableTime() {
        return this.stableTime;
    }

    public void setStableTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45f1bf9091991bc73284af7982e301b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45f1bf9091991bc73284af7982e301b2");
            return;
        }
        this.stableTime = j;
        this.fspTime = j - this.onCreateTime;
    }

    public long getFspTime() {
        return this.fspTime;
    }

    public int getReason() {
        return this.reason;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String str) {
        this.activityName = str;
    }

    public void setReason(int i) {
        this.reason = i;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public void setFirstLaunch(boolean z) {
        this.isFirstLaunch = z;
    }

    public boolean isFirstLaunch() {
        return this.isFirstLaunch;
    }

    public List<FspItemBean> getList() {
        return this.list;
    }

    public void setList(List<FspItemBean> list) {
        this.list = list;
    }

    public boolean addViewSet(Map<View, View> map, long j) {
        Object[] objArr = {map, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057399c49c8575b44071df3718ac9f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057399c49c8575b44071df3718ac9f8c")).booleanValue();
        }
        Set<View> keySet = map.keySet();
        keySet.removeAll(this.allViewSet);
        if (keySet.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (View view : keySet) {
            if (FspUtils.isValidView(view)) {
                this.allViewSet.add(view);
                if (!isScrollChange(map.get(view))) {
                    hashSet.add(view);
                }
            }
            if (ViewUtils.isViewScroll(view) && !this.allScrollMap.containsKey(view)) {
                this.allScrollMap.put(view, ViewUtils.getFspScrollBean(view));
            }
        }
        this.viewSize += hashSet.size();
        FspItemBean fspItemBean = new FspItemBean();
        fspItemBean.addAll(hashSet);
        fspItemBean.setSampleTime(j);
        this.list.add(fspItemBean);
        return !hashSet.isEmpty();
    }

    private boolean isScrollChange(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25d7f9f5415da94a19764d3fb29bfa6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25d7f9f5415da94a19764d3fb29bfa6b")).booleanValue();
        }
        if (view == null || this.allScrollMap.isEmpty() || !this.allScrollMap.containsKey(view)) {
            return false;
        }
        FspScrollBean fspScrollBean = this.allScrollMap.get(view);
        if (fspScrollBean.hasChanged) {
            return true;
        }
        FspScrollBean fspScrollBean2 = ViewUtils.getFspScrollBean(view);
        if (fspScrollBean2 != null) {
            boolean z = !fspScrollBean2.equals(fspScrollBean);
            if (z) {
                fspScrollBean.hasChanged = true;
                this.allScrollMap.put(view, fspScrollBean);
            }
            return z;
        }
        return false;
    }

    public int getViewSize() {
        return this.viewSize;
    }

    public long getCalculateTime() {
        return this.calculateTime;
    }

    public void setCalculateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2edca07f4e3b4cb7b5a609928fb6aeb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2edca07f4e3b4cb7b5a609928fb6aeb3");
        } else {
            this.calculateTime = j - this.onCreateTime;
        }
    }

    public void setAllRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9a755e87024e094ca5cff0353e6db66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9a755e87024e094ca5cff0353e6db66");
            return;
        }
        for (FspItemBean fspItemBean : this.list) {
            fspItemBean.setAllViewRect();
        }
    }

    public Rect getContentViewRect() {
        return this.contentViewRect;
    }

    public void setContentViewRect(Rect rect) {
        this.contentViewRect = rect;
    }

    public long getExecStartActivityTime() {
        return this.execStartActivityTime;
    }

    public void setExecStartActivityTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9722081e59db5b369f5d97d595ca9bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9722081e59db5b369f5d97d595ca9bfa");
        } else {
            this.execStartActivityTime = j;
        }
    }

    public long getNewActivityTime() {
        return this.newActivityTime;
    }

    public void setNewActivityTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d16dbd2d24552db11841a785a4448d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d16dbd2d24552db11841a785a4448d4");
        } else {
            this.newActivityTime = j;
        }
    }

    public void setTouchDownTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0609d9feebe58c09028db739d27bd82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0609d9feebe58c09028db739d27bd82");
        } else {
            this.onTouchDownTime = j;
        }
    }

    public long getOnTouchDownTime() {
        return this.onTouchDownTime;
    }

    public long getReachBottomTime() {
        return this.reachBottomTime;
    }

    public void setReachBottomTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e8ff8863cadf2556a93f46c8b72cb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e8ff8863cadf2556a93f46c8b72cb96");
            return;
        }
        this.reachBottomTime = j;
        this.newFspTime = j - this.onCreateTime;
    }

    public long getNewFspTime() {
        return this.newFspTime;
    }

    public boolean isDetectReachBottom() {
        return this.isDetectReachBottom;
    }

    public void setDetectReachBottom(boolean z) {
        this.isDetectReachBottom = z;
    }

    public void setExtraInfo(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c9e378ec576f836286bc681264e3e16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c9e378ec576f836286bc681264e3e16");
        } else if (map != null && !map.isEmpty()) {
            if (this.extraFspInfo == null) {
                this.extraFspInfo = new HashMap();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    Map<String, Object> map2 = this.extraFspInfo;
                    map2.put("3rd_" + entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public Map<String, Object> getExtraFspInfo() {
        return this.extraFspInfo;
    }
}
