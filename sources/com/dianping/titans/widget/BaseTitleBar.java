package com.dianping.titans.widget;

import android.content.Context;
import android.graphics.Bitmap;
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
import com.dianping.titans.ui.ComplexButton;
import com.dianping.titans.ui.ITitleBarV2;
import com.dianping.titans.ui.ITitleContentV2;
import com.dianping.titans.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseTitleBar extends FrameLayout implements View.OnLayoutChangeListener, ITitleBarV2 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int backgroundColor;
    public ComplexButton mButtonLL;
    public ComplexButton mButtonLR;
    public ComplexButton mButtonRL;
    public ComplexButton mButtonRR;
    private ViewGroup mContainer;
    private int mCurProgress;
    protected View mLyL;
    protected View mLyR;
    protected ProgressBar mPb;
    private Runnable mPbUpdateRunnable;
    private Handler mProgressHandler;
    private int mRealProgress;
    protected FrameLayout mTextContainer;
    public ITitleContent mTitleContent;
    public OnTitleBarEventListener onTitleBarEventListener;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ITitleContent {
        int getCalculatedWidth();

        String getTitleText();

        void setTitleContentParams(JSONObject jSONObject);

        void setTitleText(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnTitleBarEventListener {
        void onEvent(JSONObject jSONObject);
    }

    public abstract ITitleContent createTitleContentView();

    public int getLayoutId() {
        return R.layout.knb_web_title_bar;
    }

    public long getProgressDelay() {
        return 16L;
    }

    public BaseTitleBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be9c47868fc5ffe2a95aebd025c37da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be9c47868fc5ffe2a95aebd025c37da");
            return;
        }
        this.mProgressHandler = new Handler();
        this.mCurProgress = 0;
        this.mRealProgress = 0;
        this.mPbUpdateRunnable = new Runnable() { // from class: com.dianping.titans.widget.BaseTitleBar.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ee7bfd1abd48e3b8a348614a0647459", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ee7bfd1abd48e3b8a348614a0647459");
                } else if (BaseTitleBar.this.mCurProgress < 100) {
                    if (BaseTitleBar.this.mCurProgress < 90) {
                        BaseTitleBar.this.mCurProgress = (int) (BaseTitleBar.this.mCurProgress + (90 / BaseTitleBar.this.getProgressDelay()));
                    } else {
                        BaseTitleBar.this.mCurProgress = (BaseTitleBar.this.mRealProgress / 10) + 90;
                    }
                    BaseTitleBar.this.mPb.setProgress(BaseTitleBar.this.mCurProgress);
                    BaseTitleBar.this.mProgressHandler.postDelayed(this, BaseTitleBar.this.getProgressDelay());
                } else {
                    BaseTitleBar.this.mPb.setVisibility(8);
                }
            }
        };
        this.backgroundColor = 0;
        initViews();
    }

    public BaseTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31008012906409483568998c9e56fa94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31008012906409483568998c9e56fa94");
            return;
        }
        this.mProgressHandler = new Handler();
        this.mCurProgress = 0;
        this.mRealProgress = 0;
        this.mPbUpdateRunnable = new Runnable() { // from class: com.dianping.titans.widget.BaseTitleBar.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ee7bfd1abd48e3b8a348614a0647459", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ee7bfd1abd48e3b8a348614a0647459");
                } else if (BaseTitleBar.this.mCurProgress < 100) {
                    if (BaseTitleBar.this.mCurProgress < 90) {
                        BaseTitleBar.this.mCurProgress = (int) (BaseTitleBar.this.mCurProgress + (90 / BaseTitleBar.this.getProgressDelay()));
                    } else {
                        BaseTitleBar.this.mCurProgress = (BaseTitleBar.this.mRealProgress / 10) + 90;
                    }
                    BaseTitleBar.this.mPb.setProgress(BaseTitleBar.this.mCurProgress);
                    BaseTitleBar.this.mProgressHandler.postDelayed(this, BaseTitleBar.this.getProgressDelay());
                } else {
                    BaseTitleBar.this.mPb.setVisibility(8);
                }
            }
        };
        this.backgroundColor = 0;
        initViews();
    }

    public void initViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3f0ec7140ae729076738a1343adc74e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3f0ec7140ae729076738a1343adc74e");
            return;
        }
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.mContainer = (ViewGroup) findViewById(R.id.web_title_bar);
        this.mTitleContent = createTitleContentView();
        this.mTextContainer = (FrameLayout) findViewById(R.id.text_container);
        this.mTextContainer.addView((View) this.mTitleContent, new ViewGroup.LayoutParams(-1, -2));
        this.mButtonLL = (ComplexButton) findViewById(R.id.button_ll);
        this.mButtonLR = (ComplexButton) findViewById(R.id.button_lr);
        this.mButtonRL = (ComplexButton) findViewById(R.id.button_rl);
        this.mButtonRR = (ComplexButton) findViewById(R.id.button_rr);
        this.mPb = (ProgressBar) findViewById(R.id.pb_progress);
        this.mPb.getLayoutParams().height = getProgressHeight();
        this.mLyL = findViewById(R.id.title_bar_left_view_container);
        this.mLyR = findViewById(R.id.title_bar_right_view_container);
        addOnLayoutChangeListener(this);
    }

    @Override // com.dianping.titans.ui.ITitleBarV2
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // android.view.View, com.dianping.titans.ui.ITitleBar
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28837705502b46f5bbab78eca48b4b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28837705502b46f5bbab78eca48b4b41");
            return;
        }
        super.setBackgroundColor(i);
        this.backgroundColor = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "793e48b43c643cf5ff1bc8ac7029ba80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "793e48b43c643cf5ff1bc8ac7029ba80");
        } else {
            updateTitleMargins();
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setProgressDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef53ce828a5989d2676c73e831389c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef53ce828a5989d2676c73e831389c05");
        } else {
            this.mPb.setProgressDrawable(drawable);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void showTitleBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec0b81dc4b21e19a21d6564d340d570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec0b81dc4b21e19a21d6564d340d570");
        } else {
            setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setWebTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a0fb3899a02c47f30638004d7373701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a0fb3899a02c47f30638004d7373701");
        } else {
            this.mTitleContent.setTitleText(str);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public String getWebTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbf055c5111f73874d133f20d29c74c5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbf055c5111f73874d133f20d29c74c5") : this.mTitleContent.getTitleText();
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setLLButton(String str, String str2, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1faa5535245f6f220970df1f550263f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1faa5535245f6f220970df1f550263f9");
        } else {
            this.mButtonLL.setIconText(str, str2, z, onClickListener);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setLRButton(String str, String str2, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5d433993d57a754a06de737658bc3b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5d433993d57a754a06de737658bc3b8");
        } else {
            this.mButtonLR.setIconText(str, str2, z, onClickListener);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setRLButton(String str, String str2, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "404852122a65b41989a9b3246e293855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "404852122a65b41989a9b3246e293855");
        } else {
            this.mButtonRL.setIconText(str, str2, z, onClickListener);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setRRButton(String str, String str2, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91edee8949678e269e43da5ba9b890fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91edee8949678e269e43da5ba9b890fa");
        } else {
            this.mButtonRR.setIconText(str, str2, z, onClickListener);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setLLButton(String str, int i, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "207bc8b7b77740c17e820edb13d7eea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "207bc8b7b77740c17e820edb13d7eea3");
            return;
        }
        setLLButton(str, "android.resource://" + getContext().getApplicationContext().getPackageName() + "/" + i, z, onClickListener);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setLRButton(String str, int i, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5f8d59e31880baba58e78e94240afd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5f8d59e31880baba58e78e94240afd6");
            return;
        }
        setLRButton(str, "android.resource://" + getContext().getApplicationContext().getPackageName() + "/" + i, z, onClickListener);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setRLButton(String str, int i, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa89c83fa8cb6796ed47f37f903b1875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa89c83fa8cb6796ed47f37f903b1875");
            return;
        }
        setRLButton(str, "android.resource://" + getContext().getApplicationContext().getPackageName() + "/" + i, z, onClickListener);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setRRButton(String str, int i, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69ae0d00c47240fecf393231d3565d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69ae0d00c47240fecf393231d3565d80");
            return;
        }
        setRRButton(str, "android.resource://" + getContext().getApplicationContext().getPackageName() + "/" + i, z, onClickListener);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63cbc59775ac1f4b22ea34bd0f4f667a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63cbc59775ac1f4b22ea34bd0f4f667a");
        } else if (this.mCurProgress >= i) {
        } else {
            this.mRealProgress = i;
            this.mProgressHandler.removeCallbacks(this.mPbUpdateRunnable);
            this.mProgressHandler.post(this.mPbUpdateRunnable);
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void showProgressBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80c8b13eb6f03d20e1ba61c6ca22af5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80c8b13eb6f03d20e1ba61c6ca22af5a");
            return;
        }
        this.mPb.setVisibility(z ? 0 : 8);
        this.mRealProgress = 0;
        this.mCurProgress = 0;
        this.mPb.setProgress(0);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void performLLClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d739849c96f337e130cea11797a212c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d739849c96f337e130cea11797a212c2");
        } else if (this.mButtonLL.isSoundEffectsEnabled()) {
            this.mButtonLL.setSoundEffectsEnabled(false);
            this.mButtonLL.performClick();
            this.mButtonLL.setSoundEffectsEnabled(true);
        } else {
            this.mButtonLL.performClick();
        }
    }

    public void updateTitleMargins() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca858acf9c27786d0088f9a28fe72099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca858acf9c27786d0088f9a28fe72099");
            return;
        }
        try {
            int width = getWidth();
            int width2 = this.mLyL.getWidth() + this.mLyL.getLeft();
            int width3 = this.mLyR.getWidth() + (width - this.mLyR.getRight());
            int i = width2 > width3 ? width2 : width3;
            if (width2 + width3 > width) {
                this.mTextContainer.setVisibility(8);
                return;
            }
            this.mTextContainer.setVisibility(0);
            this.mTextContainer.setPadding(i, 0, i, 0);
        } catch (Exception unused) {
        }
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setTitleContentParams(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3bd8ffd257a4e62354bbb55906bbdbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3bd8ffd257a4e62354bbb55906bbdbf");
        } else {
            this.mTitleContent.setTitleContentParams(jSONObject);
        }
    }

    public void setOnTitleBarEventListener(OnTitleBarEventListener onTitleBarEventListener) {
        this.onTitleBarEventListener = onTitleBarEventListener;
    }

    public int getProgressHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f00b593f7fbca936875944b3cce3886b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f00b593f7fbca936875944b3cce3886b")).intValue() : ViewUtils.dip2px(getContext(), 3.0f);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setLLButton(Bitmap bitmap, View.OnClickListener onClickListener) {
        Object[] objArr = {bitmap, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "927d5b237f0a5183ebdcd145c84f00f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "927d5b237f0a5183ebdcd145c84f00f5");
            return;
        }
        this.mButtonLL.setBitmap(bitmap, onClickListener);
        updateTitleMargins();
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setLRButton(Bitmap bitmap, View.OnClickListener onClickListener) {
        Object[] objArr = {bitmap, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3e1943994d7224ab953bc24d3df200c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3e1943994d7224ab953bc24d3df200c");
            return;
        }
        this.mButtonLR.setBitmap(bitmap, onClickListener);
        updateTitleMargins();
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setRLButton(Bitmap bitmap, View.OnClickListener onClickListener) {
        Object[] objArr = {bitmap, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eb46130e30a6d0ea25397b9f17c280f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eb46130e30a6d0ea25397b9f17c280f");
            return;
        }
        this.mButtonRL.setBitmap(bitmap, onClickListener);
        updateTitleMargins();
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setRRButton(Bitmap bitmap, View.OnClickListener onClickListener) {
        Object[] objArr = {bitmap, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6b3215a8e984846dbc851c728d3eae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6b3215a8e984846dbc851c728d3eae4");
            return;
        }
        this.mButtonRR.setBitmap(bitmap, onClickListener);
        updateTitleMargins();
    }

    public FrameLayout getTitleContainer() {
        return this.mTextContainer;
    }

    public void setHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8c8bf1ca8f428ce0c250b0098171a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8c8bf1ca8f428ce0c250b0098171a28");
        } else if (i < 0) {
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = i;
            setLayoutParams(layoutParams);
        }
    }

    public void setTitlePadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6969eedc730f46b78baefd1f7a95d9b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6969eedc730f46b78baefd1f7a95d9b7");
            return;
        }
        if (i < 0) {
            i = this.mContainer.getPaddingLeft();
        }
        if (i2 < 0) {
            i2 = this.mContainer.getPaddingTop();
        }
        if (i3 < 0) {
            i3 = this.mContainer.getPaddingRight();
        }
        if (i4 < 0) {
            i4 = this.mContainer.getPaddingBottom();
        }
        this.mContainer.setPadding(i, i2, i3, i4);
    }

    @Override // com.dianping.titans.ui.ITitleBar
    public void setProgressColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa53ee7ed83d03a43dc6f7e79b0f61d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa53ee7ed83d03a43dc6f7e79b0f61d0");
            return;
        }
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), GravityCompat.START, 1);
        Drawable progressDrawable = this.mPb.getProgressDrawable();
        if (progressDrawable != null && (progressDrawable instanceof LayerDrawable)) {
            ((LayerDrawable) progressDrawable).setDrawableByLayerId(16908301, clipDrawable);
        } else {
            this.mPb.setProgressDrawable(clipDrawable);
        }
    }

    public ITitleContentV2 getTitleContentV2() {
        if (this.mTitleContent == null || !(this.mTitleContent instanceof ITitleContentV2)) {
            return null;
        }
        return (ITitleContentV2) this.mTitleContent;
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec95a4a29793da124950601195a89479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec95a4a29793da124950601195a89479");
            return;
        }
        removeOnLayoutChangeListener(this);
        this.mProgressHandler.removeCallbacks(this.mPbUpdateRunnable);
        this.mPbUpdateRunnable = null;
    }
}
