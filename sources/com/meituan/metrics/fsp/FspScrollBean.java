package com.meituan.metrics.fsp;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspScrollBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<Object> extraData;
    public int firstCompletelyVisibleItemPosition;
    public boolean hasChanged;
    public int scrollX;
    public int scrollY;

    public FspScrollBean(Pair<Integer, Integer> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618cf636c690d42f9141201fcd76e3ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618cf636c690d42f9141201fcd76e3ce");
            return;
        }
        this.scrollX = 0;
        this.scrollY = 0;
        this.firstCompletelyVisibleItemPosition = 0;
        this.hasChanged = false;
        if (pair != null) {
            this.scrollX = ((Integer) pair.first).intValue();
            this.scrollY = ((Integer) pair.second).intValue();
        }
    }

    public void setExtraData(List<Object> list) {
        this.extraData = list;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caa968da1e97dae19410d99fcac67f30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caa968da1e97dae19410d99fcac67f30")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FspScrollBean fspScrollBean = (FspScrollBean) obj;
        return this.scrollX == fspScrollBean.scrollX && this.scrollY == fspScrollBean.scrollY && this.firstCompletelyVisibleItemPosition == fspScrollBean.firstCompletelyVisibleItemPosition && isExtraEquals(this.extraData, fspScrollBean.extraData);
    }

    private boolean isExtraEquals(List<Object> list, List<Object> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74226dce137b11692bd0041287fae594", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74226dce137b11692bd0041287fae594")).booleanValue();
        }
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eb0f7af4d78e988d106ce1460dbfb5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eb0f7af4d78e988d106ce1460dbfb5f");
        }
        StringBuilder sb = new StringBuilder();
        if (this.extraData != null) {
            for (int i = 0; i < this.extraData.size(); i++) {
                sb.append(this.extraData.get(i));
                sb.append(StringUtil.SPACE);
            }
        }
        return "FspScrollBean{scrollX=" + this.scrollX + ", scrollY=" + this.scrollY + ", firstCompletelyVisibleItemPosition=" + this.firstCompletelyVisibleItemPosition + ", extraData=" + sb.toString() + '}';
    }
}
