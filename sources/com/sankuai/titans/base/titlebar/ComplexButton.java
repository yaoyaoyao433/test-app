package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.base.utils.UIKit;
import com.sankuai.titans.protocol.bean.AsyncTask;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton;
import com.sankuai.titans.protocol.webcompat.elements.OnPerformClickListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ComplexButton extends FrameLayout implements ITitleBarButton {
    public static final int DEFAULT_RESOURCE = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isIcon;
    private int mFallbackIconId;
    private View.OnClickListener mFallbackListener;
    private String mFallbackTitle;
    public ImageView mIv;
    private final int mTextColor;
    private float mTextSize;
    public TextView mTv;
    private OnPerformClickListener performClickListener;

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public View getView() {
        return this;
    }

    public ComplexButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c38a561cb611c9069731b28cba8d9247", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c38a561cb611c9069731b28cba8d9247");
        }
    }

    public ComplexButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ef75d5bc15244b716771dbe80e96edd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ef75d5bc15244b716771dbe80e96edd");
        }
    }

    public ComplexButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cf5fd1588b443d0e579bf767b179d42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cf5fd1588b443d0e579bf767b179d42");
            return;
        }
        this.mFallbackIconId = -1;
        this.mFallbackTitle = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor, R.attr.textSize});
        this.mTextColor = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.titlebar_action_hint_text_color));
        this.mTextSize = obtainStyledAttributes.getDimension(1, getContext().getResources().getDimension(R.dimen.titans_text_size_15));
        obtainStyledAttributes.recycle();
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df5d375cc84707450db085a9c7a9800d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df5d375cc84707450db085a9c7a9800d");
            return;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.mTv = new TextView(getContext());
        this.mTv.setLayoutParams(layoutParams);
        this.mTv.setTextSize(0, this.mTextSize);
        this.mTv.setTextColor(this.mTextColor);
        this.mTv.setGravity(17);
        this.mTv.setSingleLine();
        this.mTv.setMaxEms(8);
        this.mTv.setEllipsize(TextUtils.TruncateAt.END);
        this.mIv = new ImageView(getContext());
        this.mIv.setLayoutParams(layoutParams);
        this.mIv.setBackgroundColor(0);
        this.mIv.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.mIv);
        addView(this.mTv);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setFallbackUi(String str, int i, View.OnClickListener onClickListener, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), onClickListener, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07d3ec95e0c4622cd46aa2de7d116f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07d3ec95e0c4622cd46aa2de7d116f82");
            return;
        }
        this.mFallbackIconId = i;
        this.mFallbackTitle = str;
        this.mFallbackListener = onClickListener;
        if (z) {
            fallbackUi();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void fallbackUi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59ccd5df39182f5f701830014cfbfc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59ccd5df39182f5f701830014cfbfc3");
        } else if (this.mFallbackIconId == -1 && TextUtils.isEmpty(this.mFallbackTitle)) {
            setVisibility(8);
        } else {
            initBtnResources(this.mFallbackTitle, null, this.mFallbackIconId);
            setOnClickListener(this.mFallbackListener);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb098fb8e7bf00b7fb5abb9e8583457", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb098fb8e7bf00b7fb5abb9e8583457")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.mIv.setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mIv.setColorFilter((ColorFilter) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "369bd819156881bb1d859b4cd86b0db2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "369bd819156881bb1d859b4cd86b0db2")).booleanValue();
        }
        if (super.performClick()) {
            if (this.performClickListener != null) {
                this.performClickListener.onPerformClick(this);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adaa9cd121a67836102e304e8ce4457a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adaa9cd121a67836102e304e8ce4457a");
        } else {
            this.mTv.setTextSize(i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setPerformClickListener(OnPerformClickListener onPerformClickListener) {
        this.performClickListener = onPerformClickListener;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setIcon(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15f89aa34c0154edd36b6837dd7526c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15f89aa34c0154edd36b6837dd7526c0");
            return;
        }
        setVisibility(0);
        this.isIcon = true;
        this.mTv.setVisibility(8);
        this.mIv.setVisibility(0);
        if (bitmap == null) {
            return;
        }
        this.mIv.setImageBitmap(UIKit.createBitmap(getContext(), bitmap, false));
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setIcon(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bfc049c295a08784c8d88b421f7b12c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bfc049c295a08784c8d88b421f7b12c");
        } else {
            initBtnResources("", str, -1);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0962861ea0c706e0ea6ae7eb1296f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0962861ea0c706e0ea6ae7eb1296f71");
        } else {
            initBtnResources(str, null, -1);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a0b8c5b5a3b30f575a8b642297ace5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a0b8c5b5a3b30f575a8b642297ace5");
        } else {
            setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public int getCalculatedWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43abc96dc69a8e3496c37608c624b12", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43abc96dc69a8e3496c37608c624b12")).intValue() : getWidth();
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setTitleImageLayout(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca64b0f606db9aefea4f0e7ef6e5368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca64b0f606db9aefea4f0e7ef6e5368");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mIv.getLayoutParams();
        if (i > 0) {
            layoutParams.width = i;
        }
        if (i2 > 0) {
            layoutParams.height = i2;
        }
        this.mIv.requestLayout();
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void setTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a57dc5af24bee584bc6a8cd128da0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a57dc5af24bee584bc6a8cd128da0d1");
        } else {
            this.mTv.setTextColor(i);
        }
    }

    public static Bitmap getHttpBitmap(Context context, String str) {
        Bitmap bitmap;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "46095af6888a5a6080396f1148dfdc0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "46095af6888a5a6080396f1148dfdc0d");
        }
        try {
            bitmap = UIKit.downloadBitmap(str, 60000);
        } catch (Exception e) {
            Titans.serviceManager().getStatisticsService().reportClassError("ComplexButton", "getHttpBitmap", e);
            bitmap = null;
        }
        if (bitmap != null) {
            return UIKit.createBitmap(context, bitmap, false);
        }
        return null;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void initBtnResources(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a51849fe6629e71917d861ad0e7827c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a51849fe6629e71917d861ad0e7827c");
        } else {
            initBtnResources(str, str2, -1);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton
    public void initBtnResources(String str, final String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f119be780b6ddfb08e947d281b47b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f119be780b6ddfb08e947d281b47b1c");
            return;
        }
        setVisibility(0);
        if (i != -1) {
            this.isIcon = true;
            this.mIv.setImageResource(i);
        } else if (!TextUtils.isEmpty(str2)) {
            this.isIcon = true;
            if (str2.startsWith("http")) {
                IThreadPoolService threadPoolService = Titans.serviceManager().getThreadPoolService();
                threadPoolService.executeAsyncTask("getHttpBitmap", new AsyncTask<Bitmap>(threadPoolService) { // from class: com.sankuai.titans.base.titlebar.ComplexButton.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.titans.protocol.bean.AsyncTask
                    public Bitmap doInBackground() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cda4620c8a54df29029ba1706ce4e29d", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cda4620c8a54df29029ba1706ce4e29d") : ComplexButton.getHttpBitmap(ComplexButton.this.getContext(), str2);
                    }

                    @Override // com.sankuai.titans.protocol.bean.AsyncTask
                    public void onPostExecute(Bitmap bitmap) {
                        Object[] objArr2 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1e14d04b700d9bcaac6cd354ef6e2769", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1e14d04b700d9bcaac6cd354ef6e2769");
                        } else if (bitmap == null) {
                        } else {
                            ComplexButton.this.mIv.setImageBitmap(bitmap);
                        }
                    }
                });
            } else {
                this.mIv.setImageURI(Uri.parse(str2));
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.isIcon = false;
            this.mTv.setText(str);
        }
        this.mTv.setVisibility(this.isIcon ? 8 : 0);
        this.mIv.setVisibility(this.isIcon ? 0 : 8);
    }
}
