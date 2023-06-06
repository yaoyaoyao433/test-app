package com.dianping.shield.theme;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LoadingView extends LinearLayout {
    private static int LOOP_TIME = 600;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Handler mHandler;
    private Runnable mRunnable;
    private String mText;
    public int stage;
    private TextView textView;

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdfece05b769c998571dca2bf80b2e39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdfece05b769c998571dca2bf80b2e39");
            return;
        }
        this.stage = 0;
        this.mText = "";
        init();
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f12e8017778b2528b546ae9d36ce96e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f12e8017778b2528b546ae9d36ce96e2");
            return;
        }
        this.stage = 0;
        this.mText = "";
        init();
    }

    public LoadingView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90429df1813900fe1eb32534c8930401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90429df1813900fe1eb32534c8930401");
            return;
        }
        this.stage = 0;
        this.mText = "";
        init();
    }

    public void stopLoop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c6cbc1ddab70e346e96a41816c1772d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c6cbc1ddab70e346e96a41816c1772d");
        } else if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mRunnable);
        }
    }

    public void startLoop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "509726eeee7e330edecd794079d1790b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "509726eeee7e330edecd794079d1790b");
        } else if (this.mHandler != null) {
            this.mHandler.postDelayed(this.mRunnable, LOOP_TIME);
        }
    }

    public void restartLoop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c7cda2d89c792883d528230c72abf2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c7cda2d89c792883d528230c72abf2b");
            return;
        }
        stopLoop();
        startLoop();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0630dbc913c173cc0a0035d1bf813799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0630dbc913c173cc0a0035d1bf813799");
            return;
        }
        this.textView = new TextView(getContext());
        this.mText = String.valueOf(getContext().getResources().getText(R.string.shielddc_loading_view));
        this.textView.setText(this.mText);
        this.textView.setWidth(getWidth() + j.a(getContext(), 80.0f));
        this.mHandler = new Handler();
        this.mRunnable = new Runnable() { // from class: com.dianping.shield.theme.LoadingView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d58dcebcf6908240ceb1556fd2f7d100", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d58dcebcf6908240ceb1556fd2f7d100");
                    return;
                }
                LoadingView.this.stage %= 4;
                LoadingView.this.next();
                LoadingView.this.stage++;
                if (LoadingView.this.mHandler != null) {
                    LoadingView.this.mHandler.postDelayed(LoadingView.this.mRunnable, LoadingView.LOOP_TIME);
                }
            }
        };
        addView(this.textView);
        setGravity(17);
        setPadding(j.a(getContext(), 12.0f), j.a(getContext(), 12.0f), j.a(getContext(), 12.0f), j.a(getContext(), 12.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        startLoop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void next() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "545d1607537a82c0389dd9f89b3a7cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "545d1607537a82c0389dd9f89b3a7cb0");
            return;
        }
        switch (this.stage) {
            case 0:
                TextView textView = this.textView;
                textView.setText(this.mText + CommonConstant.Symbol.DOT);
                return;
            case 1:
                TextView textView2 = this.textView;
                textView2.setText(this.mText + "..");
                return;
            case 2:
                TextView textView3 = this.textView;
                textView3.setText(this.mText + "...");
                return;
            default:
                this.textView.setText(this.mText);
                return;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57e64be85ec07099f804eeebba981016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57e64be85ec07099f804eeebba981016");
            return;
        }
        stopLoop();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14fda9077175afb91ae65d94806fdc1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14fda9077175afb91ae65d94806fdc1a");
            return;
        }
        super.onAttachedToWindow();
        startLoop();
    }
}
