package com.sankuai.titans.live.video.rtc;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RTCLayout extends FrameLayout implements IRTCView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private FrameLayout.LayoutParams bigLayoutParams;
    private boolean isMasterBig;
    private ArrayMap<String, View> mMap;
    private String mMaterUserId;
    private FrameLayout.LayoutParams smallLayoutParams;

    private void init(Context context) {
    }

    public RTCLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de56d1ddb8da2ca3a4384421fe340b1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de56d1ddb8da2ca3a4384421fe340b1d");
            return;
        }
        this.bigLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mMaterUserId = "";
        this.mMap = new ArrayMap<>();
        this.isMasterBig = false;
        init(context);
    }

    public RTCLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd51981551b7420f852dad28437dad6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd51981551b7420f852dad28437dad6a");
            return;
        }
        this.bigLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mMaterUserId = "";
        this.mMap = new ArrayMap<>();
        this.isMasterBig = false;
        init(context);
    }

    public RTCLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e4ade772d176e4f2b44219dc1a6eefe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e4ade772d176e4f2b44219dc1a6eefe");
            return;
        }
        this.bigLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mMaterUserId = "";
        this.mMap = new ArrayMap<>();
        this.isMasterBig = false;
        init(context);
    }

    public RTCLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db40fe680c07172a825292619f1c45fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db40fe680c07172a825292619f1c45fa");
            return;
        }
        this.bigLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mMaterUserId = "";
        this.mMap = new ArrayMap<>();
        this.isMasterBig = false;
        init(context);
    }

    public void setMasterId(String str) {
        this.mMaterUserId = str;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122c7de95f8a6f88f841a68d03ec7980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122c7de95f8a6f88f841a68d03ec7980");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.smallLayoutParams != null) {
            return;
        }
        this.smallLayoutParams = new FrameLayout.LayoutParams((int) ((getMeasuredWidth() / 3.0f) + 0.5f), (int) ((getMeasuredHeight() / 3.0f) + 0.5f));
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCView
    public void onChannelAdded(String str, View view) {
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b711fb6bcfb9a1f267801439a4d647fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b711fb6bcfb9a1f267801439a4d647fd");
        } else if (!TextUtils.isEmpty(str)) {
            this.mMap.put(str, view);
            if (this.mMap.size() == 1 && view.getParent() == null) {
                addView(view, this.bigLayoutParams);
                return;
            }
            for (Map.Entry<String, View> entry : this.mMap.entrySet()) {
                View value = entry.getValue();
                if (value.getParent() == null) {
                    addView(value, this.smallLayoutParams);
                }
            }
            relayout();
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCView
    public void onChannelRemove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92493f01aaf7ae56c9b5d3a2a1831d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92493f01aaf7ae56c9b5d3a2a1831d8a");
            return;
        }
        View remove = this.mMap.remove(str);
        if (remove != null) {
            removeView(remove);
        }
        if (this.mMap.size() == 1) {
            this.mMap.valueAt(0).setLayoutParams(this.bigLayoutParams);
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCView
    public void setSubRect(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "953827a053143988cae5f90814df46ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "953827a053143988cae5f90814df46ae");
            return;
        }
        double optDouble = jSONObject.optDouble("w");
        double optDouble2 = jSONObject.optDouble("h");
        double optDouble3 = jSONObject.optDouble(Constants.GestureMoveEvent.KEY_X);
        double optDouble4 = jSONObject.optDouble(Constants.GestureMoveEvent.KEY_Y);
        int measuredWidth = (int) ((optDouble * getMeasuredWidth()) + 0.5d);
        int measuredHeight = (int) ((optDouble2 * getMeasuredHeight()) + 0.5d);
        int measuredWidth2 = (int) ((optDouble3 * getMeasuredWidth()) + 0.5d);
        this.smallLayoutParams = new FrameLayout.LayoutParams(measuredWidth, measuredHeight);
        this.smallLayoutParams.setMarginStart(measuredWidth2);
        this.smallLayoutParams.leftMargin = measuredWidth2;
        this.smallLayoutParams.topMargin = (int) ((optDouble4 * getMeasuredHeight()) + 0.5d);
        relayout();
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCView
    public void switchPicInPic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9b9b2391c8b8259cae826e561e0e1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9b9b2391c8b8259cae826e561e0e1dd");
            return;
        }
        this.isMasterBig = !this.isMasterBig;
        relayout();
    }

    private void relayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8caae3e879e4a2576ec2e7f3501cea9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8caae3e879e4a2576ec2e7f3501cea9c");
        } else if (this.mMap.size() >= 2) {
            for (Map.Entry<String, View> entry : this.mMap.entrySet()) {
                if (this.mMaterUserId.equals(entry.getKey())) {
                    if (!this.isMasterBig) {
                        entry.getValue().setLayoutParams(this.smallLayoutParams);
                        bringChildToFront(entry.getValue());
                    } else {
                        entry.getValue().setLayoutParams(this.bigLayoutParams);
                    }
                } else if (this.isMasterBig) {
                    entry.getValue().setLayoutParams(this.smallLayoutParams);
                    bringChildToFront(entry.getValue());
                } else {
                    entry.getValue().setLayoutParams(this.bigLayoutParams);
                }
            }
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCView
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "849928cfd5b35260c610bf9fcc036da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "849928cfd5b35260c610bf9fcc036da9");
        } else {
            this.mMap.clear();
        }
    }
}
