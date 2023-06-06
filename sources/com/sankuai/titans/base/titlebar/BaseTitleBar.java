package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton;
import com.sankuai.titans.protocol.webcompat.elements.ITitleContent;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseTitleBar extends FrameLayout implements View.OnLayoutChangeListener, ITitleBar {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int backgroundColor;
    public ITitleBarButton mButtonLL;
    public ITitleBarButton mButtonLR;
    public ITitleBarButton mButtonRL;
    public ITitleBarButton mButtonRR;
    private int mCurProgress;
    protected View mLeftLayout;
    public ITitleContent mOriginTitleContent;
    private Runnable mPbUpdateRunnable;
    protected ProgressBar mProgressBar;
    private final Handler mProgressHandler;
    private int mRealProgress;
    protected View mRightLayout;
    protected FrameLayout mTextContainer;
    public ITitleContent mTitleContent;
    private final View rootView;
    private boolean titleBarBtnCloseDisable;
    private boolean titleBarBtnCloseShow;

    public long getProgressDelay() {
        return 16L;
    }

    public BaseTitleBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f00c759f52574cbb761b3c78caeccaad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f00c759f52574cbb761b3c78caeccaad");
        }
    }

    public BaseTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76bb9add111dee02369195f286f70034", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76bb9add111dee02369195f286f70034");
            return;
        }
        this.mProgressHandler = new Handler();
        this.mCurProgress = 0;
        this.mRealProgress = 0;
        this.mPbUpdateRunnable = new Runnable() { // from class: com.sankuai.titans.base.titlebar.BaseTitleBar.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8ef4c095da1e426685feb2cf33a0e82", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8ef4c095da1e426685feb2cf33a0e82");
                } else if (BaseTitleBar.this.mCurProgress < 100) {
                    if (BaseTitleBar.this.mCurProgress < 90) {
                        BaseTitleBar.this.mCurProgress = (int) (BaseTitleBar.this.mCurProgress + (90 / BaseTitleBar.this.getProgressDelay()));
                    } else {
                        BaseTitleBar.this.mCurProgress = (BaseTitleBar.this.mRealProgress / 10) + 90;
                    }
                    BaseTitleBar.this.mProgressBar.setProgress(BaseTitleBar.this.mCurProgress);
                    BaseTitleBar.this.mProgressHandler.postDelayed(this, BaseTitleBar.this.getProgressDelay());
                } else {
                    BaseTitleBar.this.mProgressBar.setVisibility(8);
                }
            }
        };
        this.titleBarBtnCloseDisable = false;
        this.titleBarBtnCloseShow = false;
        this.rootView = LayoutInflater.from(context).inflate(R.layout.titans_title_bar, this);
        this.mTitleContent = initTitleContent();
        this.mButtonLL = (ComplexButton) this.rootView.findViewById(R.id.button_ll);
        this.mButtonLR = (ComplexButton) this.rootView.findViewById(R.id.button_lr);
        this.mButtonRL = (ComplexButton) this.rootView.findViewById(R.id.button_rl);
        this.mButtonRR = (ComplexButton) this.rootView.findViewById(R.id.button_rr);
        this.mTextContainer = (FrameLayout) this.rootView.findViewById(R.id.text_container);
        this.mTextContainer.addView((View) this.mTitleContent, new ViewGroup.LayoutParams(-1, -2));
        this.mProgressBar = (ProgressBar) this.rootView.findViewById(R.id.pb_progress);
        this.mLeftLayout = this.rootView.findViewById(R.id.title_bar_left_view_container);
        this.mRightLayout = this.rootView.findViewById(R.id.title_bar_right_view_container);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b5b8fb5d05287a74859dc3111f618c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b5b8fb5d05287a74859dc3111f618c1");
        } else if (this.mCurProgress >= i) {
        } else {
            this.mRealProgress = i;
            this.mProgressHandler.removeCallbacks(this.mPbUpdateRunnable);
            this.mProgressHandler.post(this.mPbUpdateRunnable);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void showProgressBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2e1bc93556012be2aef4df2715df89a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2e1bc93556012be2aef4df2715df89a");
            return;
        }
        getProgressBar().setVisibility(z ? 0 : 8);
        this.mRealProgress = 0;
        this.mCurProgress = 0;
        getProgressBar().setProgress(0);
    }

    @Override // android.view.View, com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b72fe2544b5a8e17bd10009545f644f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b72fe2544b5a8e17bd10009545f644f");
            return;
        }
        this.backgroundColor = i;
        super.setBackgroundColor(i);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void setProgressColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa2dac0f5da1dd549171fa2f17075f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa2dac0f5da1dd549171fa2f17075f7e");
            return;
        }
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), GravityCompat.START, 1);
        Drawable progressDrawable = getProgressBar().getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            ((LayerDrawable) progressDrawable).setDrawableByLayerId(16908301, clipDrawable);
        } else {
            getProgressBar().setProgressDrawable(clipDrawable);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da85358cda2fec8ccaa85429b6a2bab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da85358cda2fec8ccaa85429b6a2bab0");
        } else {
            updateTitleMargins();
        }
    }

    public void updateTitleMargins() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a7ab3f6a8ca611bae9b1083f6800855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a7ab3f6a8ca611bae9b1083f6800855");
        } else if (get() == null || get().getVisibility() != 8) {
            try {
                int width = get().getWidth();
                int width2 = this.mLeftLayout.getWidth() + this.mLeftLayout.getLeft();
                int width3 = this.mRightLayout.getWidth() + (width - this.mRightLayout.getRight());
                int i = width2 > width3 ? width2 : width3;
                if (width2 + width3 > width) {
                    this.mTextContainer.setVisibility(8);
                    return;
                }
                this.mTextContainer.setVisibility(0);
                this.mTextContainer.setPadding(i, 0, i, 0);
            } catch (Exception e) {
                Titans.serviceManager().getStatisticsService().reportClassError("BaseTitleBar", "updateTitleMargins", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd88d86eacf9dd375e344c40731734be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd88d86eacf9dd375e344c40731734be");
            return;
        }
        this.rootView.addOnLayoutChangeListener(this);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e7755ba6e801a251a18ecb2f2429123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e7755ba6e801a251a18ecb2f2429123");
            return;
        }
        removeOnLayoutChangeListener(this);
        this.mProgressHandler.removeCallbacks(this.mPbUpdateRunnable);
        this.mPbUpdateRunnable = null;
        super.onDetachedFromWindow();
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public View get() {
        return this.rootView;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ITitleBarButton getTitleLLBtn() {
        return this.mButtonLL;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ITitleBarButton getTitleLRBtn() {
        return this.mButtonLR;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ITitleBarButton getTitleRLBtn() {
        return this.mButtonRL;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ITitleBarButton getTitleRRBtn() {
        return this.mButtonRR;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ITitleContent getTitleContent() {
        return this.mTitleContent;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ITitleContent initTitleContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83c4d34985adb71d7346fb6f49656b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitleContent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83c4d34985adb71d7346fb6f49656b81");
        }
        this.mOriginTitleContent = new DefaultTitleContent(this.rootView.getContext());
        return this.mOriginTitleContent;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void setTitleContent(ITitleContent iTitleContent) {
        Object[] objArr = {iTitleContent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce524606dbc5b6f8ddcc1e3b87b5b6fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce524606dbc5b6f8ddcc1e3b87b5b6fe");
            return;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        this.mTextContainer.removeAllViews();
        this.mTitleContent = iTitleContent;
        this.mTextContainer.addView((View) this.mTitleContent, layoutParams);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public ProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public boolean isTitleBarBtnCloseDisable() {
        return this.titleBarBtnCloseDisable;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void setIsTitleBarBtnCloseDisable(boolean z) {
        this.titleBarBtnCloseDisable = z;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public boolean isTitleBarBtnCloseShow() {
        return this.titleBarBtnCloseShow;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    public void setTitleBarBtnCloseShow(boolean z) {
        this.titleBarBtnCloseShow = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initialized(com.sankuai.titans.protocol.webcompat.elements.ITitleBar.TitleBarInitializedEntity r14, com.sankuai.titans.protocol.services.IServiceManager r15, com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.titlebar.BaseTitleBar.initialized(com.sankuai.titans.protocol.webcompat.elements.ITitleBar$TitleBarInitializedEntity, com.sankuai.titans.protocol.services.IServiceManager, com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings, boolean):void");
    }
}
