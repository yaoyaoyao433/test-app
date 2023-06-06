package com.dianping.titans.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.ui.ITitleContentV2;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DefaultTitleBar extends BaseTitleBar {
    private static final boolean DEBUG = false;
    private static final String TAG = "knb_titlebar";
    public static ChangeQuickRedirect changeQuickRedirect;

    public DefaultTitleBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecc8f58b27e92ef91ac7e492ab79bb4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecc8f58b27e92ef91ac7e492ab79bb4f");
        }
    }

    public DefaultTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4075dbd7640979d12e74f1a0edae27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4075dbd7640979d12e74f1a0edae27");
        }
    }

    @Override // com.dianping.titans.widget.BaseTitleBar
    public BaseTitleBar.ITitleContent createTitleContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e6df522089f53d9d3ed6c35e3f44fba", RobustBitConfig.DEFAULT_VALUE) ? (BaseTitleBar.ITitleContent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e6df522089f53d9d3ed6c35e3f44fba") : new DefaultTitleContent(getContext());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class DefaultTitleContent extends FrameLayout implements View.OnClickListener, ITitleContentV2 {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ITitleContentV2.IImageTitleInterceptor mImageTitleInterceptor;
        private boolean mIsDetached;
        private View.OnClickListener mOnClickListener;
        private Bitmap mTitleImg;
        private ImageView mTitleImgView;
        private String mTitleText;
        private TextView mTitleTextView;

        public DefaultTitleContent(@NonNull Context context) {
            super(context);
            Object[] objArr = {DefaultTitleBar.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4970aeda538a49fba52a5e6c0827a933", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4970aeda538a49fba52a5e6c0827a933");
                return;
            }
            this.mIsDetached = false;
            View inflate = LayoutInflater.from(context).inflate(R.layout.knb_title_content_default, (ViewGroup) this, true);
            this.mTitleTextView = (TextView) inflate.findViewById(R.id.tv_titans_title_content);
            this.mTitleImgView = (ImageView) inflate.findViewById(R.id.iv_titans_title_content);
            this.mTitleImgView.setOnClickListener(this);
            this.mTitleTextView.setOnClickListener(this);
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public void setTitleText(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95b358cdc201550a0a6d2b9f6e63408f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95b358cdc201550a0a6d2b9f6e63408f");
                return;
            }
            this.mTitleImgView.setVisibility(8);
            this.mTitleTextView.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.mTitleText = str;
            this.mTitleTextView.setText(this.mTitleText);
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public String getTitleText() {
            return this.mTitleText;
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public int getCalculatedWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1667d116ba177b648ffbaeac05c8082", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1667d116ba177b648ffbaeac05c8082")).intValue() : getWidth();
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public void setTitleContentParams(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc6423df0d03846bf8b4bbd5af18d945", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc6423df0d03846bf8b4bbd5af18d945");
            } else if (jSONObject != null) {
                try {
                    this.mTitleTextView.setTextColor(jSONObject.optInt("color"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public void setTitleImageLayout(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a0a16b9f1e1a79a06eda97dee988a41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a0a16b9f1e1a79a06eda97dee988a41");
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.mTitleImgView.getLayoutParams();
            if (i > 0) {
                layoutParams.width = i;
            }
            if (i2 > 0) {
                layoutParams.height = i2;
            }
            this.mTitleImgView.requestLayout();
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public boolean setTitleImage(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0499aebb2b4fbd8536678c5fc644b96", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0499aebb2b4fbd8536678c5fc644b96")).booleanValue();
            }
            if (bitmap == null) {
                return false;
            }
            this.mTitleImg = bitmap;
            this.mTitleTextView.setVisibility(8);
            this.mTitleImgView.setVisibility(0);
            this.mTitleImgView.setImageBitmap(this.mTitleImg);
            return true;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            Object[] objArr = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a3da31f852228dd06766d913ca610f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a3da31f852228dd06766d913ca610f1");
            } else {
                setOnTitleClickListener(onClickListener);
            }
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public void setOnTitleClickListener(View.OnClickListener onClickListener) {
            this.mOnClickListener = onClickListener;
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public void runOnUiThread(final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d46ac1c52308ef7225c46bc981c5b697", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d46ac1c52308ef7225c46bc981c5b697");
            } else if (runnable == null) {
            } else {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    try {
                        runnable.run();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                post(new Runnable() { // from class: com.dianping.titans.widget.DefaultTitleBar.DefaultTitleContent.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a07a22149765ada376f7ce5d65487446", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a07a22149765ada376f7ce5d65487446");
                            return;
                        }
                        try {
                            runnable.run();
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public void setImageTitleInterceptor(ITitleContentV2.IImageTitleInterceptor iImageTitleInterceptor) {
            this.mImageTitleInterceptor = iImageTitleInterceptor;
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public ITitleContentV2.IImageTitleInterceptor getImageTitleInterceptor() {
            return this.mImageTitleInterceptor;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3965f16ec20b1241decd85040e21671a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3965f16ec20b1241decd85040e21671a");
                return;
            }
            super.onAttachedToWindow();
            this.mIsDetached = false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28c41c4432913345527694085f227043", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28c41c4432913345527694085f227043");
                return;
            }
            super.onDetachedFromWindow();
            this.mIsDetached = true;
        }

        @Override // com.dianping.titans.ui.ITitleContentV2
        public boolean isDetachedFromWindow() {
            return this.mIsDetached;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8758e2eefac58e2e0034bd5689411f4a", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8758e2eefac58e2e0034bd5689411f4a");
                return;
            }
            if (DefaultTitleBar.this.onTitleBarEventListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                } catch (JSONException unused) {
                }
                DefaultTitleBar.this.onTitleBarEventListener.onEvent(jSONObject);
            }
            if (this.mOnClickListener != null) {
                this.mOnClickListener.onClick(view);
            }
        }
    }
}
