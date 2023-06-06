package com.meituan.metrics.fsp.finder;

import android.graphics.Rect;
import com.meituan.metrics.fsp.FspBean;
import com.meituan.metrics.fsp.FspConfig;
import com.meituan.metrics.fsp.FspItemBean;
import com.meituan.metrics.fsp.FspUtils;
import com.meituan.metrics.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspStableFinder implements FspFinderImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public FspConfig fspConfig;

    @Override // com.meituan.metrics.fsp.finder.FspFinderImpl
    public void setFspConfig(FspConfig fspConfig) {
        this.fspConfig = fspConfig;
    }

    @Override // com.meituan.metrics.fsp.finder.FspFinderImpl
    public void process(FspBean fspBean) {
        Rect contentViewRect;
        Object[] objArr = {fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab500016082718f98277c7ff1e4cc077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab500016082718f98277c7ff1e4cc077");
            return;
        }
        String activityName = fspBean.getActivityName();
        int reason = fspBean.getReason();
        long onTouchDownTime = fspBean.getOnTouchDownTime();
        if (fspBean.getViewSize() < this.fspConfig.getMinViewCount(activityName) || (contentViewRect = fspBean.getContentViewRect()) == null || contentViewRect.width() == 0 || contentViewRect.height() == 0) {
            return;
        }
        int width = (int) (contentViewRect.width() * contentViewRect.height() * this.fspConfig.getDetectArea(fspBean.getActivityName()));
        List<FspItemBean> list = fspBean.getList();
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            }
            FspItemBean fspItemBean = list.get(size);
            long sampleTime = fspItemBean.getSampleTime();
            if (reason != 3 || onTouchDownTime <= 0 || sampleTime <= onTouchDownTime) {
                int i = 0;
                for (int i2 = 0; i2 < fspItemBean.getViewList().size(); i2++) {
                    if (FspUtils.isValidAreaView(fspItemBean.getViewList().get(i2).get())) {
                        Rect calculateViewRect = ViewUtils.calculateViewRect(fspItemBean.getViewRectList().get(i2), contentViewRect);
                        int width2 = calculateViewRect == null ? 0 : calculateViewRect.width() * calculateViewRect.height();
                        i += width2;
                        fspItemBean.getAreaList().add(Integer.valueOf(width2));
                        fspItemBean.getScreenRectList().add(calculateViewRect);
                    } else {
                        fspItemBean.getAreaList().add(0);
                        fspItemBean.getScreenRectList().add(null);
                    }
                }
                list.get(size).setViewArea(i);
                if (i > width) {
                    break;
                }
            }
            size--;
        }
        if (size >= 0) {
            fspBean.setStableTime(fspBean.getList().get(size).getSampleTime());
            fspBean.setSuccess(true);
        }
    }
}
