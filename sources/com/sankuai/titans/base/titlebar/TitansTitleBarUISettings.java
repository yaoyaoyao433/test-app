package com.sankuai.titans.base.titlebar;

import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansTitleBarUISettings implements ITitleBarUISettings {
    public static final int DEFAULT_COLOR = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Drawable backgroundDrawable;
    private int titleBarBackIconId;
    private int titleBarBackgroundColor;
    private boolean titleBarBtnCloseDisable;
    private boolean titleBarBtnCloseShow;
    private int titleBarCloseIconId;
    private int titleBarCustomBackIconId;
    private int titleBarPaddingBottom;
    private int titleBarPaddingLeft;
    private int titleBarPaddingRight;
    private int titleBarPaddingTop;
    private int titleBarProgressDrawableResId;
    private int titleBarSearchIconId;
    private int titleBarShareIconId;

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarHeight() {
        return R.dimen.titans_titlebar_height;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public boolean showProgressbar() {
        return true;
    }

    public TitansTitleBarUISettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34507f267d6926177b574d363923ee2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34507f267d6926177b574d363923ee2a");
            return;
        }
        this.titleBarBackIconId = R.drawable.titans_ic_home_as_up_indicator;
        this.titleBarShareIconId = R.drawable.titans_ic_action_share;
        this.titleBarSearchIconId = R.drawable.titans_base_ic_action_search;
        this.titleBarCustomBackIconId = R.drawable.titans_ic_home_as_up_indicator;
        this.titleBarCloseIconId = R.drawable.titans_left_title_bar_close;
        this.titleBarProgressDrawableResId = R.drawable.titans_horizontal_progress;
        this.backgroundDrawable = null;
        this.titleBarBackgroundColor = -1;
        this.titleBarBtnCloseDisable = false;
        this.titleBarBtnCloseShow = false;
        this.titleBarPaddingLeft = -1;
        this.titleBarPaddingTop = -1;
        this.titleBarPaddingRight = -1;
        this.titleBarPaddingBottom = -1;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarBackIconId() {
        return this.titleBarBackIconId;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarShareIconId() {
        return this.titleBarShareIconId;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarSearchIconId() {
        return this.titleBarSearchIconId;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarCustomBackIconId() {
        return this.titleBarCustomBackIconId;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarCloseIconId() {
        return this.titleBarCloseIconId;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarProgressDrawableResId() {
        return this.titleBarProgressDrawableResId;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarBackgroundColor() {
        return this.titleBarBackgroundColor;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarPaddingLeft() {
        return this.titleBarPaddingLeft;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarPaddingTop() {
        return this.titleBarPaddingTop;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarPaddingRight() {
        return this.titleBarPaddingRight;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings
    public int getTitleBarPaddingBottom() {
        return this.titleBarPaddingBottom;
    }
}
