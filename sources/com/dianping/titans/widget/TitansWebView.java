package com.dianping.titans.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.dianping.titans.utils.TitansTimingReport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansWebView extends WebView {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean isDestroy;
    private boolean isFilterTouch;
    public ResizeListener resizeListener;
    public ScrollListener scrollListener;
    public VisibleListener visibleListener;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ResizeListener {
        void onWebViewSizeChanged(int i, int i2, int i3, int i4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ScrollListener {
        void onWebViewScrollChanged(int i, int i2, int i3, int i4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface VisibleListener {
        void onVisibleChanged(boolean z);
    }

    public String replaceUrl(String str) {
        return str;
    }

    public TitansWebView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71fc01218a7561e6bff084c260945669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71fc01218a7561e6bff084c260945669");
            return;
        }
        this.isDestroy = false;
        this.isFilterTouch = false;
    }

    public TitansWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "129d55a7c4f6326dd374ce2b31887947", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "129d55a7c4f6326dd374ce2b31887947");
            return;
        }
        this.isDestroy = false;
        this.isFilterTouch = false;
    }

    public TitansWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "658466493216017ed16a68fda7ff7faf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "658466493216017ed16a68fda7ff7faf");
            return;
        }
        this.isDestroy = false;
        this.isFilterTouch = false;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3887b3b79d8125afc055b1965fcbdb4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3887b3b79d8125afc055b1965fcbdb4c");
        }
        if (disableActionMode()) {
            callback = new ActionMode.Callback() { // from class: com.dianping.titans.widget.TitansWebView.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.ActionMode.Callback
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            };
        }
        return super.startActionMode(callback, i);
    }

    private boolean disableActionMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c05582a16721542c79a1a806b33aaa8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c05582a16721542c79a1a806b33aaa8c")).booleanValue() : Build.VERSION.SDK_INT >= 28 && KNBConfig.getStringListConfig(KNBConfig.CONFIG_WEB_ACTION_BLACK, Collections.EMPTY_LIST).contains(getContext().getClass().getName());
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "317f742f17747ec21e3c669da75d304f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "317f742f17747ec21e3c669da75d304f");
        } else if (TextUtils.isEmpty(str) || this.isDestroy) {
        } else {
            TitansTimingReport.getInstance().loadUrl(str);
            super.loadUrl(replaceUrl(str));
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a3d472221c1b48719e4bb67a60b5a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a3d472221c1b48719e4bb67a60b5a05");
        } else if (TextUtils.isEmpty(str) || this.isDestroy) {
        } else {
            TitansTimingReport.getInstance().loadUrl(str);
            super.loadUrl(replaceUrl(str), map);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdd8826622ca71f98efc19c9cd7d8c5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdd8826622ca71f98efc19c9cd7d8c5d");
            return;
        }
        boolean z = getVisibility() == 0;
        super.setVisibility(i);
        boolean z2 = getVisibility() == 0;
        if (z == z2 || this.visibleListener == null) {
            return;
        }
        this.visibleListener.onVisibleChanged(z2);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10a2378afb52ee0897ba767b6a37cef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10a2378afb52ee0897ba767b6a37cef2");
            return;
        }
        this.isDestroy = true;
        super.destroy();
    }

    public void setResizeListener(ResizeListener resizeListener) {
        this.resizeListener = resizeListener;
    }

    public void setScrollListener(ScrollListener scrollListener) {
        this.scrollListener = scrollListener;
    }

    public void setVisibleListener(VisibleListener visibleListener) {
        this.visibleListener = visibleListener;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df040985a154870f69cfdaf8d5977475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df040985a154870f69cfdaf8d5977475");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.resizeListener != null) {
            this.resizeListener.onWebViewSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fde8442efc7dba03a1ced8dde789465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fde8442efc7dba03a1ced8dde789465");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.scrollListener != null) {
            this.scrollListener.onWebViewScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3c86426956c6ffe986773ebccf97388", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3c86426956c6ffe986773ebccf97388")).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.isFilterTouch && motionEvent.getAction() == 2) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3c42459f3cfb2b3ca4c0cabc1c25e83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3c42459f3cfb2b3ca4c0cabc1c25e83");
        } else if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        }
    }

    public void setFilterTouch(boolean z) {
        this.isFilterTouch = z;
    }
}
