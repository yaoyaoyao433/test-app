package com.sankuai.titans.base.titlebar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseStyle implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int backgroundColor;
    public String backgroundImg;
    public String content;
    public int fontColor;
    public int fontSize;
    public String[] fontStyle;
    public int height;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;
    public String stretch;

    public BaseStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d38b261cd274ae9c7cdf8c8ccf0e803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d38b261cd274ae9c7cdf8c8ccf0e803");
        } else {
            this.backgroundColor = -1;
        }
    }

    public Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52ccb759327f112c1ae01d9575459500", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52ccb759327f112c1ae01d9575459500");
        }
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            Titans.serviceManager().getStatisticsService().reportClassError("DynamicTitleParser", "clone", e);
            return new BaseStyle();
        }
    }
}
