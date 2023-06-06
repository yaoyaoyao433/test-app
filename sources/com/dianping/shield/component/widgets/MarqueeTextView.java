package com.dianping.shield.component.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MarqueeTextView extends AppCompatTextView {
    private static final int FIRST_SCROLL_DELAY_DEFAULT = 1000;
    private static final int ROLLING_INTERVAL_DEFAULT = 10000;
    public static final int SCROLL_FOREVER = 100;
    public static final int SCROLL_ONCE = 101;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mFirst;
    private int mFirstScrollDelay;
    private boolean mPaused;
    private int mRollingInterval;
    private int mScrollMode;
    private Scroller mScroller;
    private int mXPaused;

    public MarqueeTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d5ae30892001d6777717f4a5331d9fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d5ae30892001d6777717f4a5331d9fe");
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56dc34e1bebb7b81ae16438c9954ca93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56dc34e1bebb7b81ae16438c9954ca93");
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "740a7da4ed6fc33c52a73fc26b2f31bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "740a7da4ed6fc33c52a73fc26b2f31bd");
            return;
        }
        this.mXPaused = 0;
        this.mPaused = true;
        this.mFirst = true;
        initView(context, attributeSet, i);
    }

    private void initView(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cd315d607955d096d77d5cba8209c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cd315d607955d096d77d5cba8209c31");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.scroll_interval, R.attr.scroll_first_delay, R.attr.scroll_mode});
        this.mRollingInterval = obtainStyledAttributes.getInt(0, 10000);
        this.mScrollMode = obtainStyledAttributes.getInt(2, 100);
        this.mFirstScrollDelay = obtainStyledAttributes.getInt(1, 1000);
        obtainStyledAttributes.recycle();
        setSingleLine();
        setEllipsize(null);
    }

    public void startScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e4cb9c0291859b95a53eec7b7ae7b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e4cb9c0291859b95a53eec7b7ae7b5d");
            return;
        }
        this.mXPaused = 0;
        this.mPaused = true;
        this.mFirst = true;
        resumeScroll();
    }

    public void resumeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6212bf3fb30c5c9f1855771ed8a5beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6212bf3fb30c5c9f1855771ed8a5beb");
        } else if (this.mPaused) {
            setHorizontallyScrolling(true);
            if (this.mScroller == null) {
                this.mScroller = new Scroller(getContext(), new LinearInterpolator());
                setScroller(this.mScroller);
            }
            int calculateScrollingLen = calculateScrollingLen();
            final int i = calculateScrollingLen - this.mXPaused;
            final int intValue = Double.valueOf(((this.mRollingInterval * i) * 1.0d) / calculateScrollingLen).intValue();
            if (this.mFirst) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.dianping.shield.component.widgets.MarqueeTextView.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1e957538cd8aba8955df0fb537511e1c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1e957538cd8aba8955df0fb537511e1c");
                            return;
                        }
                        MarqueeTextView.this.mScroller.startScroll(MarqueeTextView.this.mXPaused, 0, i, 0, intValue);
                        MarqueeTextView.this.invalidate();
                        MarqueeTextView.this.mPaused = false;
                    }
                }, this.mFirstScrollDelay);
                return;
            }
            this.mScroller.startScroll(this.mXPaused, 0, i, 0, intValue);
            invalidate();
            this.mPaused = false;
        }
    }

    public void pauseScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caa27fceb4383b3e4e20e9fd475980f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caa27fceb4383b3e4e20e9fd475980f4");
        } else if (this.mScroller == null || this.mPaused) {
        } else {
            this.mPaused = true;
            this.mXPaused = this.mScroller.getCurrX();
            this.mScroller.abortAnimation();
        }
    }

    public void stopScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d3d53c5e5c4093935dbcf69ef108cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d3d53c5e5c4093935dbcf69ef108cf1");
        } else if (this.mScroller == null) {
        } else {
            this.mPaused = true;
            this.mScroller.startScroll(0, 0, 0, 0, 0);
        }
    }

    private int calculateScrollingLen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7075fa5b45011247e567086886c6a22e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7075fa5b45011247e567086886c6a22e")).intValue();
        }
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        String charSequence = getText().toString();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return rect.width();
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee8407e4bc74fb8269e3784b84948ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee8407e4bc74fb8269e3784b84948ea0");
            return;
        }
        super.computeScroll();
        if (this.mScroller == null || !this.mScroller.isFinished() || this.mPaused) {
            return;
        }
        if (this.mScrollMode == 101) {
            stopScroll();
            return;
        }
        this.mPaused = true;
        this.mXPaused = getWidth() * (-1);
        this.mFirst = false;
        resumeScroll();
    }

    public int getRndDuration() {
        return this.mRollingInterval;
    }

    public void setRndDuration(int i) {
        this.mRollingInterval = i;
    }

    public void setScrollMode(int i) {
        this.mScrollMode = i;
    }

    public int getScrollMode() {
        return this.mScrollMode;
    }

    public void setScrollFirstDelay(int i) {
        this.mFirstScrollDelay = i;
    }

    public int getScrollFirstDelay() {
        return this.mFirstScrollDelay;
    }

    public boolean isPaused() {
        return this.mPaused;
    }
}
